package com.palmpay.lib.webview.cache.match.impl;

import Ef.a;
import Ff.c;
import Wf.AbstractC0780y;
import X0.j;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import androidx.annotation.Keep;
import androidx.camera.core.impl.utils.executor.g;
import com.google.common.net.HttpHeaders;
import com.microsoft.codepush.react.CodePushConstants;
import com.palmpay.lib.webview.cache.WebCacheConstant;
import com.palmpay.lib.webview.cache.WebCacheParamsProvider;
import com.palmpay.lib.webview.cache.WebCacheSetting;
import com.palmpay.lib.webview.cache.entity.WebCacheLocalResp;
import com.palmpay.lib.webview.cache.entity.WebCacheLocalRespKt;
import com.palmpay.lib.webview.cache.match.PreReadInputStream;
import com.palmpay.lib.webview.cache.match.base.WebCacheResourceMatcher;
import com.palmpay.lib.webview.cache.service.DelegateManager;
import com.palmpay.lib.webview.cache.service.base.FileSaveOption;
import com.palmpay.lib.webview.cache.service.base.FileState;
import com.palmpay.lib.webview.cache.service.base.WebCacheFileRepoDelegate;
import com.palmpay.lib.webview.cache.util.CancellableJob;
import com.palmpay.lib.webview.cache.util.CoroutineHelper;
import com.palmpay.lib.webview.cache.util.FileHelperKt;
import com.palmpay.lib.webview.cache.util.ICancellable;
import com.palmpay.lib.webview.cache.util.UrlHelper;
import com.palmpay.lib.webview.cache.util.WebCacheLog;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.C1878j;
import kotlinx.coroutines.flow.C1888u;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p041ce.o;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0005H\u0016J*\u0010'\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00052\u0018\b\u0002\u0010(\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010)H\u0014J*\u0010*\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00052\u0018\b\u0002\u0010(\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010)H\u0014J0\u0010+\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00052\u001e\u0010,\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050.\u0018\u00010-H\u0014J\u0012\u0010/\u001a\u0004\u0018\u0001002\u0006\u00101\u001a\u000202H\u0016J\n\u00103\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u00104\u001a\u00020%H\u0014R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0007\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0019X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u00065"}, d2 = {"Lcom/palmpay/lib/webview/cache/match/impl/PreloadHtmlMatcher;", "Lcom/palmpay/lib/webview/cache/match/base/WebCacheResourceMatcher;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "fileRepo", "Lcom/palmpay/lib/webview/cache/service/base/WebCacheFileRepoDelegate;", "getFileRepo", "()Lcom/palmpay/lib/webview/cache/service/base/WebCacheFileRepoDelegate;", "fileRepo$delegate", "Lkotlin/Lazy;", CodePushConstants.DOWNLOAD_URL_KEY, "getDownloadUrl", "setDownloadUrl", "(Ljava/lang/String;)V", "localResp", "Lcom/palmpay/lib/webview/cache/entity/WebCacheLocalResp;", "getLocalResp", "()Lcom/palmpay/lib/webview/cache/entity/WebCacheLocalResp;", "setLocalResp", "(Lcom/palmpay/lib/webview/cache/entity/WebCacheLocalResp;)V", "waitingChannel", "Lkotlinx/coroutines/channels/Channel;", "getWaitingChannel", "()Lkotlinx/coroutines/channels/Channel;", "setWaitingChannel", "(Lkotlinx/coroutines/channels/Channel;)V", "downloadTask", "Lcom/palmpay/lib/webview/cache/util/ICancellable;", "getDownloadTask", "()Lcom/palmpay/lib/webview/cache/util/ICancellable;", "setDownloadTask", "(Lcom/palmpay/lib/webview/cache/util/ICancellable;)V", "prepare", "", "url", "downloadHtmlStream", "header", "", "downloadHtmlFile", "saveCookieFromRespHeaders", "headers", "", "", "match", "Landroid/webkit/WebResourceResponse;", "request", "Landroid/webkit/WebResourceRequest;", "geDownloadLocalResp", "onDestroy", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated(message = "")
@SourceDebugExtension({"SMAP\nPreloadHtmlMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreloadHtmlMatcher.kt\ncom/palmpay/lib/webview/cache/match/impl/PreloadHtmlMatcher\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 WebCacheLog.kt\ncom/palmpay/lib/webview/cache/util/WebCacheLogKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 DelegateManager.kt\ncom/palmpay/lib/webview/cache/service/DelegateManager\n*L\n1#1,240:1\n47#2:241\n49#2:245\n50#3:242\n55#3:244\n106#4:243\n9#5,4:246\n1#6:250\n50#7:251\n*S KotlinDebug\n*F\n+ 1 PreloadHtmlMatcher.kt\ncom/palmpay/lib/webview/cache/match/impl/PreloadHtmlMatcher\n*L\n115#1:241\n115#1:245\n115#1:242\n115#1:244\n115#1:243\n201#1:246,4\n43#1:251\n*E\n"})
public class PreloadHtmlMatcher extends WebCacheResourceMatcher {

    @Nullable
    private ICancellable downloadTask;

    @Nullable
    private String downloadUrl;

    @Nullable
    private WebCacheLocalResp localResp;

    @Nullable
    private Channel<WebCacheLocalResp> waitingChannel;

    @NotNull
    private final String name = "PreloadHtmlMatcher";

    /* JADX INFO: renamed from: fileRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy fileRepo = C2131j.b(new o(17));

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void downloadHtmlFile$default(PreloadHtmlMatcher preloadHtmlMatcher, String str, Map map, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: downloadHtmlFile");
        }
        if ((i7 & 2) != 0) {
            map = null;
        }
        preloadHtmlMatcher.downloadHtmlFile(str, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void downloadHtmlStream$default(PreloadHtmlMatcher preloadHtmlMatcher, String str, Map map, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: downloadHtmlStream");
        }
        if ((i7 & 2) != 0) {
            map = null;
        }
        preloadHtmlMatcher.downloadHtmlStream(str, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebCacheFileRepoDelegate fileRepo_delegate$lambda$0() {
        return (WebCacheFileRepoDelegate) DelegateManager.INSTANCE.getDelegate(WebCacheFileRepoDelegate.class);
    }

    public void downloadHtmlFile(@NotNull final String url, @Nullable Map<String, String> header) {
        final Flow<FileState> flowSaveFileFromNetFlow;
        Intrinsics.checkNotNullParameter(url, "url");
        this.downloadUrl = url;
        WebCacheSetting webCacheSetting = WebCacheSetting.INSTANCE;
        WebCacheParamsProvider paramsProvider = webCacheSetting.getParamsProvider();
        String userAgent = paramsProvider != null ? paramsProvider.getUserAgent(url) : null;
        WebCacheParamsProvider paramsProvider2 = webCacheSetting.getParamsProvider();
        FileSaveOption fileSaveOption = new FileSaveOption(null, header, userAgent, paramsProvider2 != null ? paramsProvider2.getCookie(url) : null, false, null, false, null, 241, null);
        String str = "preload" + File.separatorChar + FileHelperKt.generateFileName(url);
        WebCacheFileRepoDelegate fileRepo = getFileRepo();
        C1888u c1888u = (fileRepo == null || (flowSaveFileFromNetFlow = fileRepo.saveFileFromNetFlow(url, str, fileSaveOption)) == null) ? null : new C1888u(new j(new Flow<Pair<? extends Boolean, ? extends FileState.Complete>>() { // from class: com.palmpay.lib.webview.cache.match.impl.PreloadHtmlMatcher$downloadHtmlFile$$inlined$map$1

            /* JADX INFO: renamed from: com.palmpay.lib.webview.cache.match.impl.PreloadHtmlMatcher$downloadHtmlFile$$inlined$map$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 PreloadHtmlMatcher.kt\ncom/palmpay/lib/webview/cache/match/impl/PreloadHtmlMatcher\n+ 4 WebCacheLog.kt\ncom/palmpay/lib/webview/cache/util/WebCacheLogKt\n*L\n1#1,222:1\n48#2:223\n116#3,3:224\n119#3,5:231\n124#3,5:240\n129#3,5:247\n134#3,5:253\n9#4,4:227\n9#4,4:236\n9#4,2:245\n12#4:252\n*S KotlinDebug\n*F\n+ 1 PreloadHtmlMatcher.kt\ncom/palmpay/lib/webview/cache/match/impl/PreloadHtmlMatcher\n*L\n118#1:227,4\n123#1:236,4\n128#1:245,2\n128#1:252\n*E\n"})
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ String $url$inlined;
                final /* synthetic */ PreloadHtmlMatcher this$0;

                /* JADX INFO: renamed from: com.palmpay.lib.webview.cache.match.impl.PreloadHtmlMatcher$downloadHtmlFile$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "com.palmpay.lib.webview.cache.match.impl.PreloadHtmlMatcher$downloadHtmlFile$$inlined$map$1$2", f = "PreloadHtmlMatcher.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends c {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // Ff.a
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, PreloadHtmlMatcher preloadHtmlMatcher, String str) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = preloadHtmlMatcher;
                    this.$url$inlined = str;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public final Object emit(Object obj, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i7 = anonymousClass1.label;
                        if ((i7 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i7 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    a aVar = a.f2423a;
                    int i10 = anonymousClass1.label;
                    if (i10 == 0) {
                        g.M(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        FileState fileState = (FileState) obj;
                        Pair pair = null;
                        if (fileState instanceof FileState.OnStart) {
                            WebCacheLog webCacheLog = WebCacheLog.INSTANCE;
                            if (webCacheLog.getCanLog()) {
                                webCacheLog.d(this.this$0.getName(), "Starting pre-download html(" + this.$url$inlined + ")");
                            }
                        } else if (fileState instanceof FileState.Complete) {
                            WebCacheLog webCacheLog2 = WebCacheLog.INSTANCE;
                            if (webCacheLog2.getCanLog()) {
                                webCacheLog2.d(this.this$0.getName(), "Complete pre-downloading html(" + this.$url$inlined + ")");
                            }
                            pair = new Pair(Boolean.TRUE, fileState);
                        } else if (fileState instanceof FileState.Error) {
                            WebCacheLog webCacheLog3 = WebCacheLog.INSTANCE;
                            if (webCacheLog3.getCanLog()) {
                                FileState.Error error = (FileState.Error) fileState;
                                webCacheLog3.e(this.this$0.getName(), "Fail pre-downloading html, code=" + error.getCode() + ", exception=" + error.getThrowable());
                            }
                            pair = new Pair(Boolean.TRUE, null);
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(pair, anonymousClass1) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        g.M(obj2);
                    }
                    return Unit.f38893a;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super Pair<? extends Boolean, ? extends FileState.Complete>> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = flowSaveFileFromNetFlow.collect(new AnonymousClass2(flowCollector, this, url), continuation);
                return objCollect == a.f2423a ? objCollect : Unit.f38893a;
            }
        }, 6), new PreloadHtmlMatcher$downloadHtmlFile$flow$2(this, url, null), 3);
        if (c1888u != null) {
            this.waitingChannel = p059e1.a.a(-1, null, 6);
            this.downloadTask = new CancellableJob(AbstractC0780y.m(WebCacheConstant.INSTANCE.getApplicationScope$lib_webview_release(), null, null, new C1878j(c1888u, null), 3));
        }
    }

    public void downloadHtmlStream(@NotNull String url, @Nullable Map<String, String> header) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.downloadUrl = url;
        Job jobLaunchCoroutine$default = CoroutineHelper.launchCoroutine$default(CoroutineHelper.INSTANCE, this, null, new PreloadHtmlMatcher$downloadHtmlStream$job$1(header, url, this, null), 1, null);
        this.waitingChannel = p059e1.a.a(-1, null, 6);
        this.downloadTask = new CancellableJob(jobLaunchCoroutine$default);
    }

    @Nullable
    public WebCacheLocalResp geDownloadLocalResp() {
        if (this.waitingChannel != null) {
            return (WebCacheLocalResp) AbstractC0780y.p(new PreloadHtmlMatcher$geDownloadLocalResp$1$1(this, null));
        }
        return null;
    }

    @Nullable
    public final ICancellable getDownloadTask() {
        return this.downloadTask;
    }

    @Nullable
    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    @Nullable
    public final WebCacheFileRepoDelegate getFileRepo() {
        return (WebCacheFileRepoDelegate) this.fileRepo.getValue();
    }

    @Nullable
    public final WebCacheLocalResp getLocalResp() {
        return this.localResp;
    }

    @Override // com.palmpay.lib.webview.cache.match.base.WebCacheResourceMatcher
    @NotNull
    public String getName() {
        return this.name;
    }

    @Nullable
    public final Channel<WebCacheLocalResp> getWaitingChannel() {
        return this.waitingChannel;
    }

    @Override // com.palmpay.lib.webview.cache.match.base.WebCacheResourceMatcher
    @Nullable
    public WebResourceResponse match(@NotNull WebResourceRequest request) {
        Uri uri;
        WebResourceResponse webResourceResponseCreateResponse$default;
        InputStream fileStream;
        Intrinsics.checkNotNullParameter(request, "request");
        if (getDestroyed().get() || !request.isForMainFrame()) {
            return null;
        }
        String str = this.downloadUrl;
        if (str != null) {
            try {
                uri = Uri.parse(str);
            } catch (Exception unused) {
                uri = null;
            }
        } else {
            uri = null;
        }
        if (uri == null || !UrlHelper.INSTANCE.matchHostPath(request.getUrl(), uri)) {
            return null;
        }
        this.downloadUrl = null;
        if (this.localResp == null) {
            this.localResp = geDownloadLocalResp();
            if (getDestroyed().get()) {
                return null;
            }
            WebCacheLocalResp webCacheLocalResp = this.localResp;
            if (webCacheLocalResp != null && (fileStream = webCacheLocalResp.getFileStream()) != null && (fileStream instanceof PreReadInputStream)) {
                ((PreReadInputStream) fileStream).finishPreRead();
            }
            WebCacheLog webCacheLog = WebCacheLog.INSTANCE;
            if (webCacheLog.getCanLog() && this.localResp != null) {
                webCacheLog.d(getName(), "Received pre-download html file. " + this.localResp);
            }
        }
        WebCacheLocalResp webCacheLocalResp2 = this.localResp;
        if (webCacheLocalResp2 == null || (webResourceResponseCreateResponse$default = WebCacheLocalRespKt.createResponse$default(webCacheLocalResp2, null, 1, null)) == null) {
            return null;
        }
        return createResponse(webResourceResponseCreateResponse$default);
    }

    @Override // com.palmpay.lib.webview.cache.match.base.WebCacheResourceMatcher
    public void onDestroy() throws IOException {
        String filename;
        WebCacheFileRepoDelegate fileRepo;
        InputStream fileStream;
        super.onDestroy();
        Channel<WebCacheLocalResp> channel = this.waitingChannel;
        if (channel != null) {
            channel.cancel((CancellationException) null);
        }
        ICancellable iCancellable = this.downloadTask;
        if (iCancellable != null) {
            ICancellable.DefaultImpls.cancel$default(iCancellable, null, 1, null);
        }
        WebCacheLocalResp webCacheLocalResp = this.localResp;
        if (webCacheLocalResp != null && (fileStream = webCacheLocalResp.getFileStream()) != null) {
            fileStream.close();
        }
        WebCacheLocalResp webCacheLocalResp2 = this.localResp;
        if (webCacheLocalResp2 == null || (filename = webCacheLocalResp2.getFilename()) == null || (fileRepo = getFileRepo()) == null) {
            return;
        }
        fileRepo.deleteFile(filename);
    }

    @Override // com.palmpay.lib.webview.cache.match.base.WebCacheResourceMatcher
    public void prepare(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
    }

    public void saveCookieFromRespHeaders(@NotNull String url, @Nullable Map<String, ? extends List<String>> headers) {
        List<String> list;
        WebCacheParamsProvider paramsProvider;
        Intrinsics.checkNotNullParameter(url, "url");
        if (headers == null || (list = headers.get(HttpHeaders.SET_COOKIE)) == null || (paramsProvider = WebCacheSetting.INSTANCE.getParamsProvider()) == null) {
            return;
        }
        paramsProvider.saveCookie(url, list);
    }

    public final void setDownloadTask(@Nullable ICancellable iCancellable) {
        this.downloadTask = iCancellable;
    }

    public final void setDownloadUrl(@Nullable String str) {
        this.downloadUrl = str;
    }

    public final void setLocalResp(@Nullable WebCacheLocalResp webCacheLocalResp) {
        this.localResp = webCacheLocalResp;
    }

    public final void setWaitingChannel(@Nullable Channel<WebCacheLocalResp> channel) {
        this.waitingChannel = channel;
    }
}

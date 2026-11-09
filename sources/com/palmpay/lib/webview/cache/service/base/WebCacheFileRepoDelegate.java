package com.palmpay.lib.webview.cache.service.base;

import Ef.a;
import Ff.c;
import androidx.annotation.Keep;
import androidx.camera.core.impl.utils.executor.g;
import com.palmpay.lib.webview.cache.service.DelegateManager;
import com.palmpay.lib.webview.cache.util.WebCacheLog;
import java.io.File;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.X;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p041ce.o;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J$\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096@¢\u0006\u0002\u0010\u0012J,\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0016H&J,\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0016H\u0096@¢\u0006\u0002\u0010\u0018J,\u0010\u0019\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0016H¦@¢\u0006\u0002\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u000eH&J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u000eH&J\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u000eH&R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006!"}, d2 = {"Lcom/palmpay/lib/webview/cache/service/base/WebCacheFileRepoDelegate;", "Lcom/palmpay/lib/webview/cache/service/base/AbstractDelegate;", "<init>", "()V", "netDelegate", "Lcom/palmpay/lib/webview/cache/service/base/WebCacheNetDelegate;", "getNetDelegate", "()Lcom/palmpay/lib/webview/cache/service/base/WebCacheNetDelegate;", "netDelegate$delegate", "Lkotlin/Lazy;", "getInputStreamFromNetFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/palmpay/lib/webview/cache/service/base/InputStreamState;", "url", "", "option", "Lcom/palmpay/lib/webview/cache/service/base/FileRequestOption;", "getInputStreamFromNet", "(Ljava/lang/String;Lcom/palmpay/lib/webview/cache/service/base/FileRequestOption;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveFileFromNetFlow", "Lcom/palmpay/lib/webview/cache/service/base/FileState;", "relativeFilePath", "Lcom/palmpay/lib/webview/cache/service/base/FileSaveOption;", "saveFileFromNet", "(Ljava/lang/String;Ljava/lang/String;Lcom/palmpay/lib/webview/cache/service/base/FileSaveOption;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveFileFromAsset", "assetFilePath", "deleteRelativeFile", "", "getRelativeFile", "Ljava/io/File;", "deleteFile", "absoluteFilePath", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWebCacheFileRepoDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebCacheFileRepoDelegate.kt\ncom/palmpay/lib/webview/cache/service/base/WebCacheFileRepoDelegate\n+ 2 WebCacheLog.kt\ncom/palmpay/lib/webview/cache/util/WebCacheLogKt\n+ 3 DelegateManager.kt\ncom/palmpay/lib/webview/cache/service/DelegateManager\n*L\n1#1,198:1\n9#2,4:199\n9#2,4:203\n50#3:207\n*S KotlinDebug\n*F\n+ 1 WebCacheFileRepoDelegate.kt\ncom/palmpay/lib/webview/cache/service/base/WebCacheFileRepoDelegate\n*L\n33#1:199,4\n52#1:203,4\n18#1:207\n*E\n"})
public abstract class WebCacheFileRepoDelegate extends AbstractDelegate {

    /* JADX INFO: renamed from: netDelegate$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy netDelegate = C2131j.b(new o(18));

    /* JADX INFO: renamed from: com.palmpay.lib.webview.cache.service.base.WebCacheFileRepoDelegate$getInputStreamFromNet$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.palmpay.lib.webview.cache.service.base.WebCacheFileRepoDelegate", f = "WebCacheFileRepoDelegate.kt", i = {0}, l = {31}, m = "getInputStreamFromNet$suspendImpl", n = {"$this"}, s = {"L$0"})
    public static final class AnonymousClass1 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // Ff.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebCacheFileRepoDelegate.getInputStreamFromNet$suspendImpl(WebCacheFileRepoDelegate.this, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.palmpay.lib.webview.cache.service.base.WebCacheFileRepoDelegate$saveFileFromNet$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.palmpay.lib.webview.cache.service.base.WebCacheFileRepoDelegate", f = "WebCacheFileRepoDelegate.kt", i = {0}, l = {50}, m = "saveFileFromNet$suspendImpl", n = {"$this"}, s = {"L$0"})
    public static final class C14431 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C14431(Continuation<? super C14431> continuation) {
            super(continuation);
        }

        @Override // Ff.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebCacheFileRepoDelegate.saveFileFromNet$suspendImpl(WebCacheFileRepoDelegate.this, null, null, null, this);
        }
    }

    public static /* synthetic */ Object getInputStreamFromNet$default(WebCacheFileRepoDelegate webCacheFileRepoDelegate, String str, FileRequestOption fileRequestOption, Continuation continuation, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getInputStreamFromNet");
        }
        if ((i7 & 2) != 0) {
            fileRequestOption = null;
        }
        return webCacheFileRepoDelegate.getInputStreamFromNet(str, fileRequestOption, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object getInputStreamFromNet$suspendImpl(WebCacheFileRepoDelegate webCacheFileRepoDelegate, String str, FileRequestOption fileRequestOption, Continuation<? super InputStreamState> continuation) {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i7 = anonymousClass1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i7 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = webCacheFileRepoDelegate.new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = webCacheFileRepoDelegate.new AnonymousClass1(continuation);
        }
        Object objR = anonymousClass1.result;
        a aVar = a.f2423a;
        int i10 = anonymousClass1.label;
        try {
            if (i10 == 0) {
                g.M(objR);
                Flow<InputStreamState> inputStreamFromNetFlow = webCacheFileRepoDelegate.getInputStreamFromNetFlow(str, fileRequestOption);
                if (inputStreamFromNetFlow == null) {
                    return null;
                }
                anonymousClass1.L$0 = webCacheFileRepoDelegate;
                anonymousClass1.label = 1;
                objR = X.r(inputStreamFromNetFlow, anonymousClass1);
                if (objR == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                webCacheFileRepoDelegate = (WebCacheFileRepoDelegate) anonymousClass1.L$0;
                g.M(objR);
            }
            List list = (List) objR;
            if (list != null) {
                return (InputStreamState) CollectionsKt.K(list);
            }
            return null;
        } catch (Exception e10) {
            WebCacheLog webCacheLog = WebCacheLog.INSTANCE;
            if (!webCacheLog.getCanLog()) {
                return null;
            }
            webCacheLog.e(webCacheFileRepoDelegate.getName(), e10);
            return null;
        }
    }

    public static /* synthetic */ Flow getInputStreamFromNetFlow$default(WebCacheFileRepoDelegate webCacheFileRepoDelegate, String str, FileRequestOption fileRequestOption, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getInputStreamFromNetFlow");
        }
        if ((i7 & 2) != 0) {
            fileRequestOption = null;
        }
        return webCacheFileRepoDelegate.getInputStreamFromNetFlow(str, fileRequestOption);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebCacheNetDelegate netDelegate_delegate$lambda$0() {
        return (WebCacheNetDelegate) DelegateManager.INSTANCE.getDelegate(WebCacheNetDelegate.class);
    }

    public static /* synthetic */ Object saveFileFromAsset$default(WebCacheFileRepoDelegate webCacheFileRepoDelegate, String str, String str2, FileSaveOption fileSaveOption, Continuation continuation, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: saveFileFromAsset");
        }
        if ((i7 & 4) != 0) {
            fileSaveOption = null;
        }
        return webCacheFileRepoDelegate.saveFileFromAsset(str, str2, fileSaveOption, continuation);
    }

    public static /* synthetic */ Object saveFileFromNet$default(WebCacheFileRepoDelegate webCacheFileRepoDelegate, String str, String str2, FileSaveOption fileSaveOption, Continuation continuation, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: saveFileFromNet");
        }
        if ((i7 & 4) != 0) {
            fileSaveOption = null;
        }
        return webCacheFileRepoDelegate.saveFileFromNet(str, str2, fileSaveOption, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object saveFileFromNet$suspendImpl(WebCacheFileRepoDelegate webCacheFileRepoDelegate, String str, String str2, FileSaveOption fileSaveOption, Continuation<? super FileState> continuation) {
        C14431 c14431;
        if (continuation instanceof C14431) {
            c14431 = (C14431) continuation;
            int i7 = c14431.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                c14431.label = i7 - Integer.MIN_VALUE;
            } else {
                c14431 = webCacheFileRepoDelegate.new C14431(continuation);
            }
        } else {
            c14431 = webCacheFileRepoDelegate.new C14431(continuation);
        }
        Object objR = c14431.result;
        a aVar = a.f2423a;
        int i10 = c14431.label;
        try {
            if (i10 == 0) {
                g.M(objR);
                Flow<FileState> flowSaveFileFromNetFlow = webCacheFileRepoDelegate.saveFileFromNetFlow(str, str2, fileSaveOption);
                if (flowSaveFileFromNetFlow == null) {
                    return null;
                }
                c14431.L$0 = webCacheFileRepoDelegate;
                c14431.label = 1;
                objR = X.r(flowSaveFileFromNetFlow, c14431);
                if (objR == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                webCacheFileRepoDelegate = (WebCacheFileRepoDelegate) c14431.L$0;
                g.M(objR);
            }
            List list = (List) objR;
            if (list != null) {
                return (FileState) CollectionsKt.K(list);
            }
            return null;
        } catch (Exception e10) {
            WebCacheLog webCacheLog = WebCacheLog.INSTANCE;
            if (!webCacheLog.getCanLog()) {
                return null;
            }
            webCacheLog.e(webCacheFileRepoDelegate.getName(), e10);
            return null;
        }
    }

    public static /* synthetic */ Flow saveFileFromNetFlow$default(WebCacheFileRepoDelegate webCacheFileRepoDelegate, String str, String str2, FileSaveOption fileSaveOption, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: saveFileFromNetFlow");
        }
        if ((i7 & 4) != 0) {
            fileSaveOption = null;
        }
        return webCacheFileRepoDelegate.saveFileFromNetFlow(str, str2, fileSaveOption);
    }

    public abstract boolean deleteFile(@NotNull String absoluteFilePath);

    public abstract boolean deleteRelativeFile(@NotNull String relativeFilePath);

    @Nullable
    public Object getInputStreamFromNet(@NotNull String str, @Nullable FileRequestOption fileRequestOption, @NotNull Continuation<? super InputStreamState> continuation) {
        return getInputStreamFromNet$suspendImpl(this, str, fileRequestOption, continuation);
    }

    @Nullable
    public abstract Flow<InputStreamState> getInputStreamFromNetFlow(@NotNull String url, @Nullable FileRequestOption option);

    @Nullable
    public final WebCacheNetDelegate getNetDelegate() {
        return (WebCacheNetDelegate) this.netDelegate.getValue();
    }

    @NotNull
    public abstract File getRelativeFile(@NotNull String relativeFilePath);

    @Nullable
    public abstract Object saveFileFromAsset(@NotNull String str, @NotNull String str2, @Nullable FileSaveOption fileSaveOption, @NotNull Continuation<? super FileState> continuation);

    @Nullable
    public Object saveFileFromNet(@NotNull String str, @NotNull String str2, @Nullable FileSaveOption fileSaveOption, @NotNull Continuation<? super FileState> continuation) {
        return saveFileFromNet$suspendImpl(this, str, str2, fileSaveOption, continuation);
    }

    @Nullable
    public abstract Flow<FileState> saveFileFromNetFlow(@NotNull String url, @NotNull String relativeFilePath, @Nullable FileSaveOption option);
}

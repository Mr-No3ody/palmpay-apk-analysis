package com.palmpay.lib.webview.cache;

import C0.C0120l;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import androidx.annotation.CallSuper;
import androidx.lifecycle.AbstractC1205o;
import androidx.lifecycle.EnumC1203m;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.google.firebase.messaging.Constants;
import com.palmpay.lib.webview.cache.match.ResourceMatcherManager;
import com.palmpay.lib.webview.cache.service.WebCacheMaster;
import com.palmpay.lib.webview.container.fast.WebResource;
import com.palmpay.lib.webview.container.fast.config.CacheConfig;
import com.palmpay.lib.webview.container.fast.offline.CacheRequest;
import com.palmpay.lib.webview.container.fast.offline.Chain;
import com.palmpay.lib.webview.container.fast.offline.DefaultRemoteResourceInterceptor;
import com.palmpay.lib.webview.container.fast.offline.DefaultWebResponseGenerator;
import com.palmpay.lib.webview.container.fast.offline.Destroyable;
import com.palmpay.lib.webview.container.fast.offline.LocalResourceInterceptor;
import com.palmpay.lib.webview.container.fast.offline.MemResourceInterceptor;
import com.palmpay.lib.webview.container.fast.offline.PostInterceptor;
import com.palmpay.lib.webview.container.fast.offline.ResourceInterceptor;
import com.palmpay.lib.webview.container.fast.offline.WebResourceResponseGenerator;
import com.palmpay.lib.webview.container.fast.utils.MimeTypeMapUtils;
import com.palmpay.lib.webview.offline.monitor.base.IWebPageStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 r2\u00020\u0001:\u0001rB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J%\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001a\u001a\u0004\u0018\u00010\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\f2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\f¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\f¢\u0006\u0004\b'\u0010&J\r\u0010(\u001a\u00020\u0005¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\fH\u0015¢\u0006\u0004\b*\u0010&J\u0017\u0010-\u001a\u00020\f2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\f2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\f2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b3\u00102J\u000f\u00104\u001a\u00020\u001cH\u0002¢\u0006\u0004\b4\u00105J\u0019\u00107\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010/\u0018\u000106H\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\fH\u0002¢\u0006\u0004\b9\u0010&J%\u0010;\u001a\u0004\u0018\u00010\u00162\u0006\u0010:\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b;\u0010\u0018J-\u0010>\u001a\u0004\u0018\u00010=2\u0010\u0010<\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010/\u0018\u0001062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b>\u0010?J\u001f\u0010@\u001a\u00020\f2\u000e\u0010<\u001a\n\u0012\u0004\u0012\u00020/\u0018\u000106H\u0002¢\u0006\u0004\b@\u0010AR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010B\u001a\u0004\bE\u0010DR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010F\u001a\u0004\bG\u0010)\"\u0004\bH\u0010IR\u001e\u0010K\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u001e\u0010M\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010LR\u001e\u0010N\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010LR\u0018\u0010P\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR.\u0010T\u001a\u0004\u0018\u00010R2\b\u0010S\u001a\u0004\u0018\u00010R8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR.\u0010[\u001a\u0004\u0018\u00010Z2\b\u0010S\u001a\u0004\u0018\u00010Z8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R$\u0010a\u001a\u00020\u001c2\u0006\u0010S\u001a\u00020\u001c8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u00105R\u001b\u0010i\u001a\u00020d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR\u0014\u0010k\u001a\u00020j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u001b\u0010q\u001a\u00020m8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bn\u0010f\u001a\u0004\bo\u0010p¨\u0006s"}, d2 = {"Lcom/palmpay/lib/webview/cache/WebCacheLoader;", "", "", "url", "key", "", "enable", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "init", "()Lcom/palmpay/lib/webview/cache/WebCacheLoader;", "refresh", "", "prepare", "(Ljava/lang/Boolean;)V", "onPageStarted", "(Ljava/lang/String;)V", "onPageFinished", "Landroid/webkit/WebResourceRequest;", "request", "Lcom/palmpay/lib/webview/offline/monitor/base/IWebPageStatus;", "pageStatus", "Landroid/webkit/WebResourceResponse;", "onRequest", "(Landroid/webkit/WebResourceRequest;Lcom/palmpay/lib/webview/offline/monitor/base/IWebPageStatus;)Landroid/webkit/WebResourceResponse;", "Lcom/palmpay/lib/webview/container/fast/offline/CacheRequest;", "get", "(Lcom/palmpay/lib/webview/container/fast/offline/CacheRequest;Lcom/palmpay/lib/webview/offline/monitor/base/IWebPageStatus;)Landroid/webkit/WebResourceResponse;", "", "what", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "sendMessageData", "(ILjava/lang/Object;)V", "Landroid/os/Message;", "msg", "handleMessageData", "(Landroid/os/Message;)V", "clearDataSource", "()V", "destroy", "isDestroy", "()Z", "onDestroy", "Landroidx/lifecycle/m;", "event", "onLifecycleStateChanged", "(Landroidx/lifecycle/m;)V", "Lcom/palmpay/lib/webview/container/fast/offline/ResourceInterceptor;", "interceptor", "addResourceInterceptor", "(Lcom/palmpay/lib/webview/container/fast/offline/ResourceInterceptor;)V", "addFallbackResourceInterceptor", "getBaseInterceptorsCount", "()I", "", "buildChain", "()Ljava/util/List;", "buildGenerator", "webResourceRequest", "getResource", "interceptors", "Lcom/palmpay/lib/webview/container/fast/WebResource;", "callChain", "(Ljava/util/List;Lcom/palmpay/lib/webview/container/fast/offline/CacheRequest;)Lcom/palmpay/lib/webview/container/fast/WebResource;", "destroyAll", "(Ljava/util/List;)V", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "getKey", "Z", "getEnable", "setEnable", "(Z)V", "", "mBaseInterceptorList", "Ljava/util/List;", "mFallbackInterceptorList", "mDefaultModeChainList", "Lcom/palmpay/lib/webview/container/fast/offline/WebResourceResponseGenerator;", "mResourceResponseGenerator", "Lcom/palmpay/lib/webview/container/fast/offline/WebResourceResponseGenerator;", "Lcom/palmpay/lib/webview/cache/ICacheWebView;", "value", "view", "Lcom/palmpay/lib/webview/cache/ICacheWebView;", "getView", "()Lcom/palmpay/lib/webview/cache/ICacheWebView;", "setView", "(Lcom/palmpay/lib/webview/cache/ICacheWebView;)V", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "setLifecycleOwner", "(Landroidx/lifecycle/LifecycleOwner;)V", "viewId", "I", "getViewId", "Landroid/os/Handler;", "messageHandler$delegate", "Lkotlin/Lazy;", "getMessageHandler", "()Landroid/os/Handler;", "messageHandler", "Ljava/util/concurrent/atomic/AtomicBoolean;", "destroyed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Landroidx/lifecycle/LifecycleEventObserver;", "lifecycleEventObserver$delegate", "getLifecycleEventObserver", "()Landroidx/lifecycle/LifecycleEventObserver;", "lifecycleEventObserver", "Companion", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWebCacheLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebCacheLoader.kt\ncom/palmpay/lib/webview/cache/WebCacheLoader\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,265:1\n1855#2,2:266\n1855#2,2:268\n1855#2,2:270\n*S KotlinDebug\n*F\n+ 1 WebCacheLoader.kt\ncom/palmpay/lib/webview/cache/WebCacheLoader\n*L\n86#1:266,2\n111#1:268,2\n231#1:270,2\n*E\n"})
public class WebCacheLoader {
    public static final int MSG_WHAT_RELOAD = 1;

    @NotNull
    private final AtomicBoolean destroyed;
    private boolean enable;

    @NotNull
    private final String key;

    /* JADX INFO: renamed from: lifecycleEventObserver$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy lifecycleEventObserver;

    @Nullable
    private LifecycleOwner lifecycleOwner;

    @Nullable
    private List<ResourceInterceptor> mBaseInterceptorList;

    @Nullable
    private List<ResourceInterceptor> mDefaultModeChainList;

    @Nullable
    private List<ResourceInterceptor> mFallbackInterceptorList;

    @Nullable
    private WebResourceResponseGenerator mResourceResponseGenerator;

    /* JADX INFO: renamed from: messageHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy messageHandler;

    @NotNull
    private final String url;

    @Nullable
    private ICacheWebView view;
    private int viewId;

    public WebCacheLoader(@NotNull String url, @NotNull String key, boolean z3) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(key, "key");
        this.url = url;
        this.key = key;
        this.enable = z3;
        this.viewId = -1;
        final int i7 = 0;
        this.messageHandler = C2131j.b(new Function0(this) { // from class: com.palmpay.lib.webview.cache.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WebCacheLoader f24635b;

            {
                this.f24635b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return WebCacheLoader.messageHandler_delegate$lambda$0(this.f24635b);
                    default:
                        return WebCacheLoader.lifecycleEventObserver_delegate$lambda$2(this.f24635b);
                }
            }
        });
        this.destroyed = new AtomicBoolean(false);
        final int i10 = 1;
        this.lifecycleEventObserver = C2131j.b(new Function0(this) { // from class: com.palmpay.lib.webview.cache.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WebCacheLoader f24635b;

            {
                this.f24635b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return WebCacheLoader.messageHandler_delegate$lambda$0(this.f24635b);
                    default:
                        return WebCacheLoader.lifecycleEventObserver_delegate$lambda$2(this.f24635b);
                }
            }
        });
    }

    private final void addFallbackResourceInterceptor(ResourceInterceptor interceptor) {
        if (this.mFallbackInterceptorList == null) {
            this.mFallbackInterceptorList = new ArrayList();
        }
        List<ResourceInterceptor> list = this.mFallbackInterceptorList;
        if (list != null) {
            list.add(interceptor);
        }
    }

    private final void addResourceInterceptor(ResourceInterceptor interceptor) {
        if (this.mBaseInterceptorList == null) {
            this.mBaseInterceptorList = new ArrayList();
        }
        List<ResourceInterceptor> list = this.mBaseInterceptorList;
        if (list != null) {
            list.add(interceptor);
        }
    }

    private final List<ResourceInterceptor> buildChain() {
        if (this.mDefaultModeChainList == null) {
            ArrayList arrayList = new ArrayList(getBaseInterceptorsCount() + 4);
            List<ResourceInterceptor> list = this.mBaseInterceptorList;
            if (list != null && (!list.isEmpty())) {
                List<ResourceInterceptor> list2 = this.mBaseInterceptorList;
                Intrinsics.e(list2);
                arrayList.addAll(list2);
            }
            CacheConfig cacheConfigBuild = new CacheConfig.Builder().build();
            arrayList.add(new PostInterceptor());
            MemResourceInterceptor memResourceInterceptor = MemResourceInterceptor.getInstance(cacheConfigBuild);
            Intrinsics.checkNotNullExpressionValue(memResourceInterceptor, "getInstance(...)");
            arrayList.add(memResourceInterceptor);
            Intrinsics.e(cacheConfigBuild);
            arrayList.add(new LocalResourceInterceptor(this, cacheConfigBuild));
            List<ResourceInterceptor> list3 = this.mFallbackInterceptorList;
            if (list3 != null && (!list3.isEmpty())) {
                List<ResourceInterceptor> list4 = this.mFallbackInterceptorList;
                Intrinsics.e(list4);
                arrayList.addAll(list4);
            }
            arrayList.add(new DefaultRemoteResourceInterceptor());
            this.mDefaultModeChainList = arrayList;
        }
        return this.mDefaultModeChainList;
    }

    private final void buildGenerator() {
        if (this.mResourceResponseGenerator == null) {
            this.mResourceResponseGenerator = new DefaultWebResponseGenerator();
        }
    }

    private final WebResource callChain(List<? extends ResourceInterceptor> interceptors, CacheRequest request) {
        return new Chain(interceptors).process(request);
    }

    private final void destroyAll(List<? extends ResourceInterceptor> interceptors) {
        List<? extends ResourceInterceptor> list = interceptors;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (ResourceInterceptor resourceInterceptor : interceptors) {
            if (resourceInterceptor instanceof Destroyable) {
                ((Destroyable) resourceInterceptor).destroy();
            }
        }
    }

    public static /* synthetic */ WebResourceResponse get$default(WebCacheLoader webCacheLoader, CacheRequest cacheRequest, IWebPageStatus iWebPageStatus, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get");
        }
        if ((i7 & 2) != 0) {
            iWebPageStatus = null;
        }
        return webCacheLoader.get(cacheRequest, iWebPageStatus);
    }

    private final int getBaseInterceptorsCount() {
        List<ResourceInterceptor> list = this.mBaseInterceptorList;
        int size = list != null ? list.size() : 0;
        List<ResourceInterceptor> list2 = this.mFallbackInterceptorList;
        return size + (list2 != null ? list2.size() : 0);
    }

    private final LifecycleEventObserver getLifecycleEventObserver() {
        return (LifecycleEventObserver) this.lifecycleEventObserver.getValue();
    }

    private final Handler getMessageHandler() {
        return (Handler) this.messageHandler.getValue();
    }

    private final WebResourceResponse getResource(WebResourceRequest webResourceRequest, IWebPageStatus pageStatus) {
        String string = webResourceRequest.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        String mimeTypeFromExtension = MimeTypeMapUtils.getMimeTypeFromExtension(MimeTypeMapUtils.getFileExtensionFromUrl(string));
        CacheRequest cacheRequest = new CacheRequest();
        cacheRequest.setUrl(string);
        cacheRequest.setMethod(webResourceRequest.getMethod());
        cacheRequest.setMime(mimeTypeFromExtension);
        cacheRequest.setForFrame(webResourceRequest.isForMainFrame());
        cacheRequest.setRedirect(webResourceRequest.isRedirect());
        WebCacheSetting webCacheSetting = WebCacheSetting.INSTANCE;
        cacheRequest.setUserAgent(webCacheSetting.getUserAgent());
        cacheRequest.setWebViewCacheMode(webCacheSetting.getWebViewCache());
        Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
        Intrinsics.checkNotNullExpressionValue(requestHeaders, "getRequestHeaders(...)");
        cacheRequest.setHeaders(requestHeaders);
        return get(cacheRequest, pageStatus);
    }

    public static /* synthetic */ WebResourceResponse getResource$default(WebCacheLoader webCacheLoader, WebResourceRequest webResourceRequest, IWebPageStatus iWebPageStatus, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getResource");
        }
        if ((i7 & 2) != 0) {
            iWebPageStatus = null;
        }
        return webCacheLoader.getResource(webResourceRequest, iWebPageStatus);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecycleEventObserver lifecycleEventObserver_delegate$lambda$2(WebCacheLoader webCacheLoader) {
        return new C0120l(webCacheLoader, 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lifecycleEventObserver_delegate$lambda$2$lambda$1(WebCacheLoader webCacheLoader, LifecycleOwner lifecycleOwner, EnumC1203m event) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        webCacheLoader.onLifecycleStateChanged(event);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.palmpay.lib.webview.cache.WebCacheLoader$messageHandler$2$1] */
    public static final WebCacheLoader$messageHandler$2$1 messageHandler_delegate$lambda$0(final WebCacheLoader webCacheLoader) {
        final Looper mainLooper = Looper.getMainLooper();
        return new Handler(mainLooper) { // from class: com.palmpay.lib.webview.cache.WebCacheLoader$messageHandler$2$1
            @Override // android.os.Handler
            public void handleMessage(Message msg) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                this.this$0.handleMessageData(msg);
            }
        };
    }

    private final void onLifecycleStateChanged(EnumC1203m event) {
        List<ResourceInterceptor> list = this.mDefaultModeChainList;
        if (list != null) {
            for (ResourceInterceptor resourceInterceptor : list) {
                if (event == EnumC1203m.ON_DESTROY) {
                    destroy();
                }
            }
        }
    }

    public static /* synthetic */ WebResourceResponse onRequest$default(WebCacheLoader webCacheLoader, WebResourceRequest webResourceRequest, IWebPageStatus iWebPageStatus, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequest");
        }
        if ((i7 & 2) != 0) {
            iWebPageStatus = null;
        }
        return webCacheLoader.onRequest(webResourceRequest, iWebPageStatus);
    }

    public static /* synthetic */ void prepare$default(WebCacheLoader webCacheLoader, Boolean bool, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: prepare");
        }
        if ((i7 & 1) != 0) {
            bool = Boolean.FALSE;
        }
        webCacheLoader.prepare(bool);
    }

    public static /* synthetic */ void sendMessageData$default(WebCacheLoader webCacheLoader, int i7, Object obj, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendMessageData");
        }
        if ((i10 & 2) != 0) {
            obj = null;
        }
        webCacheLoader.sendMessageData(i7, obj);
    }

    public final void clearDataSource() {
        List<ResourceInterceptor> list = this.mDefaultModeChainList;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((ResourceInterceptor) it.next()).prepare(this.url, true);
            }
        }
    }

    public final void destroy() {
        if (this.destroyed.compareAndSet(false, true)) {
            onDestroy();
        }
    }

    @Nullable
    public final WebResourceResponse get(@Nullable CacheRequest request, @Nullable IWebPageStatus pageStatus) {
        WebResource webResourceCallChain = callChain(buildChain(), request);
        if (Intrinsics.c(request != null ? request.getMethod() : null, "GET") && pageStatus != null) {
            pageStatus.onCacheHit(webResourceCallChain != null ? webResourceCallChain.getCacheMode() : 0);
        }
        WebResourceResponseGenerator webResourceResponseGenerator = this.mResourceResponseGenerator;
        if (webResourceResponseGenerator != null) {
            return webResourceResponseGenerator.generate(webResourceCallChain, request != null ? request.getMime() : null);
        }
        return null;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @Nullable
    public final LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    public final ICacheWebView getView() {
        return this.view;
    }

    public final int getViewId() {
        return this.viewId;
    }

    public final void handleMessageData(@NotNull Message msg) {
        ICacheWebView iCacheWebView;
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (msg.what != 1 || (iCacheWebView = this.view) == null) {
            return;
        }
        iCacheWebView.reload();
    }

    @NotNull
    public WebCacheLoader init() {
        if (!this.enable) {
            return this;
        }
        Iterator<ResourceInterceptor> it = ResourceMatcherManager.INSTANCE.getInterceptorList$lib_webview_release().iterator();
        while (it.hasNext()) {
            addResourceInterceptor(it.next());
        }
        Iterator<ResourceInterceptor> it2 = ResourceMatcherManager.INSTANCE.getFallbackInterceptorList$lib_webview_release().iterator();
        while (it2.hasNext()) {
            addFallbackResourceInterceptor(it2.next());
        }
        WebCacheMaster.INSTANCE.getInstance().addLoader(this);
        prepare$default(this, null, 1, null);
        return this;
    }

    public final boolean isDestroy() {
        return this.destroyed.get();
    }

    @CallSuper
    public void onDestroy() {
        destroyAll(this.mDefaultModeChainList);
        WebCacheMaster.INSTANCE.getInstance().removeLoader(this.key);
        getMessageHandler().removeCallbacksAndMessages(null);
        setLifecycleOwner(null);
        setView(null);
    }

    public void onPageFinished(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
    }

    public void onPageStarted(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
    }

    @Nullable
    public WebResourceResponse onRequest(@NotNull WebResourceRequest request, @Nullable IWebPageStatus pageStatus) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (!this.enable || WebCache.INSTANCE.getContext() == null || isDestroy()) {
            return null;
        }
        return getResource(request, pageStatus);
    }

    public void prepare(@Nullable Boolean refresh) {
        buildChain();
        buildGenerator();
        List<ResourceInterceptor> list = this.mDefaultModeChainList;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((ResourceInterceptor) it.next()).prepare(this.url, Intrinsics.c(refresh, Boolean.TRUE));
            }
        }
    }

    public final void sendMessageData(int what, @Nullable Object data) {
        getMessageHandler().sendMessage(getMessageHandler().obtainMessage(what, data));
    }

    public final void setEnable(boolean z3) {
        this.enable = z3;
    }

    public final void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        AbstractC1205o lifecycle;
        AbstractC1205o lifecycle2;
        LifecycleOwner lifecycleOwner2 = this.lifecycleOwner;
        if (lifecycleOwner2 != null && (lifecycle2 = lifecycleOwner2.getLifecycle()) != null) {
            lifecycle2.b(getLifecycleEventObserver());
        }
        this.lifecycleOwner = lifecycleOwner;
        if (lifecycleOwner == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) {
            return;
        }
        lifecycle.a(getLifecycleEventObserver());
    }

    public final void setView(@Nullable ICacheWebView iCacheWebView) {
        if (!Intrinsics.c(iCacheWebView, this.view)) {
            this.viewId = iCacheWebView != null ? iCacheWebView.hashCode() : -1;
        }
        this.view = iCacheWebView;
    }

    public /* synthetic */ WebCacheLoader(String str, String str2, boolean z3, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i7 & 2) != 0 ? String.valueOf(System.currentTimeMillis()) : str2, (i7 & 4) != 0 ? WebCacheSetting.INSTANCE.getEnable() : z3);
    }
}

package com.google.net.cronet.okhttp.interceptor;

import Pg.k;
import android.util.Log;
import com.didiglobal.booster.instrument.ShadowExecutors;
import com.google.common.net.HttpHeaders;
import com.google.net.cronet.okhttptransport.CronetLogHelper;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.J;
import okhttp3.L;
import okhttp3.Y;
import okhttp3.c0;
import okhttp3.e0;
import org.chromium.net.CronetEngine;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UploadDataProviders;
import org.chromium.net.UrlRequest;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001c\u001bB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u001b\u0010\u001a\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/google/net/cronet/okhttp/interceptor/CronetV2Interceptor;", "Lokhttp3/Interceptor;", "Lorg/chromium/net/CronetEngine;", "cronetEngine", "Ljava/util/concurrent/ExecutorService;", "executorService", "<init>", "(Lorg/chromium/net/CronetEngine;Ljava/util/concurrent/ExecutorService;)V", "Lokhttp3/Y;", "request", "Lorg/chromium/net/UrlRequest$Callback;", "callback", "Lorg/chromium/net/UrlRequest;", "buildRequest", "(Lokhttp3/Y;Lorg/chromium/net/UrlRequest$Callback;Lorg/chromium/net/CronetEngine;Ljava/util/concurrent/ExecutorService;)Lorg/chromium/net/UrlRequest;", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/e0;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/e0;", "Lorg/chromium/net/CronetEngine;", "Ljava/util/concurrent/ExecutorService;", "networkExecutor$delegate", "Lkotlin/Lazy;", "getNetworkExecutor", "()Ljava/util/concurrent/ExecutorService;", "networkExecutor", "Companion", "Builder", "lib_cronet_okhttp_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CronetV2Interceptor implements Interceptor {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "CronetV2Interceptor";

    @Nullable
    private CronetEngine cronetEngine;

    @Nullable
    private ExecutorService executorService;

    /* JADX INFO: renamed from: networkExecutor$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy networkExecutor = C2131j.b(CronetV2Interceptor$networkExecutor$2.INSTANCE);

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/google/net/cronet/okhttp/interceptor/CronetV2Interceptor$Builder;", "", "cronetEngine", "Lorg/chromium/net/CronetEngine;", "(Lorg/chromium/net/CronetEngine;)V", "executorService", "Ljava/util/concurrent/ExecutorService;", "metricCallback", "Lcom/google/net/cronet/okhttptransport/CronetLogHelper$OnMetricCallback;", "traceName", "", "build", "Lcom/google/net/cronet/okhttp/interceptor/CronetV2Interceptor;", "setExecutorService", "setMetricCallBack", "callback", "setTraceName", "lib_cronet_okhttp_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {

        @Nullable
        private CronetEngine cronetEngine;

        @Nullable
        private ExecutorService executorService;

        @Nullable
        private CronetLogHelper.OnMetricCallback metricCallback;

        @Nullable
        private String traceName;

        public Builder(@Nullable CronetEngine cronetEngine) {
            this.cronetEngine = cronetEngine;
        }

        @NotNull
        public final CronetV2Interceptor build() {
            CronetLogHelper.OnMetricCallback onMetricCallback = this.metricCallback;
            if (onMetricCallback != null) {
                CronetLogHelper.INSTANCE.setOnMetricCallback(onMetricCallback);
            }
            CronetEngine cronetEngine = this.cronetEngine;
            if (cronetEngine != null) {
                final ExecutorService executorServiceNewOptimizedSingleThreadExecutor = ShadowExecutors.newOptimizedSingleThreadExecutor("\u200bcom.google.net.cronet.okhttp.interceptor.CronetV2Interceptor$Builder");
                cronetEngine.addRequestFinishedListener(new RequestFinishedInfo.Listener(executorServiceNewOptimizedSingleThreadExecutor) { // from class: com.google.net.cronet.okhttp.interceptor.CronetV2Interceptor$Builder$build$2
                    @Override // org.chromium.net.RequestFinishedInfo.Listener
                    public void onRequestFinished(@NotNull RequestFinishedInfo requestInfo) {
                        Intrinsics.checkNotNullParameter(requestInfo, "requestInfo");
                        CronetLogHelper.INSTANCE.logMatrix(requestInfo, this.this$0.traceName, null);
                    }
                });
            }
            return new CronetV2Interceptor(this.cronetEngine, this.executorService);
        }

        @NotNull
        public final Builder setExecutorService(@Nullable ExecutorService executorService) {
            this.executorService = executorService;
            return this;
        }

        @NotNull
        public final Builder setMetricCallBack(@Nullable CronetLogHelper.OnMetricCallback callback) {
            this.metricCallback = callback;
            return this;
        }

        @NotNull
        public final Builder setTraceName(@Nullable String traceName) {
            this.traceName = traceName;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/google/net/cronet/okhttp/interceptor/CronetV2Interceptor$Companion;", "", "()V", "TAG", "", "newBuilder", "Lcom/google/net/cronet/okhttp/interceptor/CronetV2Interceptor$Builder;", "cronetEngine", "Lorg/chromium/net/CronetEngine;", "lib_cronet_okhttp_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Builder newBuilder(@Nullable CronetEngine cronetEngine) {
            return new Builder(cronetEngine);
        }

        private Companion() {
        }
    }

    public CronetV2Interceptor(@Nullable CronetEngine cronetEngine, @Nullable ExecutorService executorService) {
        this.cronetEngine = cronetEngine;
        this.executorService = executorService;
    }

    private final UrlRequest buildRequest(Y request, UrlRequest.Callback callback, CronetEngine cronetEngine, ExecutorService executorService) {
        UrlRequest.Builder builderNewUrlRequestBuilder = cronetEngine.newUrlRequestBuilder(request.f40685a.f40587i, callback, executorService);
        builderNewUrlRequestBuilder.setHttpMethod(request.f40686b);
        for (Pair pair : request.f40687c) {
            builderNewUrlRequestBuilder.addHeader((String) pair.f38891a, (String) pair.f38892b);
        }
        c0 c0Var = request.f40688d;
        if (c0Var != null) {
            L lContentType = c0Var.contentType();
            if (lContentType != null) {
                builderNewUrlRequestBuilder.addHeader(HttpHeaders.CONTENT_TYPE, lContentType.f40592a);
            }
            k kVar = new k();
            c0Var.writeTo(kVar);
            builderNewUrlRequestBuilder.setUploadDataProvider(UploadDataProviders.create(kVar.readByteArray(kVar.f7358b)), executorService);
        }
        UrlRequest urlRequestBuild = builderNewUrlRequestBuilder.build();
        Intrinsics.checkNotNullExpressionValue(urlRequestBuild, "requestBuilder.build()");
        return urlRequestBuild;
    }

    private final ExecutorService getNetworkExecutor() {
        return (ExecutorService) this.networkExecutor.getValue();
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public e0 intercept(@NotNull Interceptor.Chain chain) throws Exception {
        Intrinsics.checkNotNullParameter(chain, "chain");
        if (chain.call().isCanceled()) {
            throw new IOException("Canceled");
        }
        if (this.cronetEngine == null) {
            return chain.proceed(chain.request());
        }
        try {
            CronetRequestCallback cronetRequestCallback = new CronetRequestCallback(chain.request());
            Y yRequest = chain.request();
            CronetEngine cronetEngine = this.cronetEngine;
            Intrinsics.e(cronetEngine);
            ExecutorService networkExecutor = this.executorService;
            if (networkExecutor == null) {
                networkExecutor = getNetworkExecutor();
            }
            UrlRequest urlRequestBuildRequest = buildRequest(yRequest, cronetRequestCallback, cronetEngine, networkExecutor);
            J j6 = chain.request().f40685a;
            urlRequestBuildRequest.start();
            return cronetRequestCallback.blockForResponse();
        } catch (Exception e10) {
            Log.e(TAG, "got exception for " + chain.request().f40685a + ", message=" + e10.getMessage());
            if (e10 instanceof IOException) {
                throw e10;
            }
            throw new IOException("canceled due to " + e10, e10);
        }
    }
}

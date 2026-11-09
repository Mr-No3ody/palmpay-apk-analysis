package com.palmpay.lib.webview.offline.net;

import C0.G;
import androidx.annotation.Keep;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.palmpay.lib.webview.offline.OfflineWebManager;
import com.palmpay.lib.webview.offline.log.OfflineWebLog;
import com.palmpay.lib.webview.offline.utils.OfflineGsonUtils;
import com.transsnet.palmpay.custom_view.dialog.y;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.J;
import okhttp3.S;
import okhttp3.U;
import okhttp3.X;
import okhttp3.Y;
import okhttp3.e0;
import okhttp3.h0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u000f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/palmpay/lib/webview/offline/net/DefaultPreloadRequest;", "Lcom/palmpay/lib/webview/offline/net/IPreloadRequest;", "<init>", "()V", "Lokhttp3/J;", "httpUrl", "Lokhttp3/Y;", "getRequest", "(Lokhttp3/J;)Lokhttp3/Y;", "Lcom/palmpay/lib/webview/offline/net/RequestCallback;", "Lcom/palmpay/lib/webview/offline/net/DefaultPreloadRequest$WebConfig;", "callback", "", "requestPreloadList", "(Lcom/palmpay/lib/webview/offline/net/RequestCallback;)V", "", "getConfigUrl", "()Ljava/lang/String;", "Lokhttp3/U;", "getOkHttpClient", "()Lokhttp3/U;", "TAG", "Ljava/lang/String;", "WebConfig", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class DefaultPreloadRequest implements IPreloadRequest {

    @NotNull
    private final String TAG = "DefaultPreloadRequest";

    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/palmpay/lib/webview/offline/net/DefaultPreloadRequest$WebConfig;", "", "preloadList", "", "", "whiteList", "<init>", "(Ljava/util/Set;Ljava/util/Set;)V", "getPreloadList", "()Ljava/util/Set;", "setPreloadList", "(Ljava/util/Set;)V", "getWhiteList", "setWhiteList", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class WebConfig {

        @Nullable
        private Set<String> preloadList;

        @Nullable
        private Set<String> whiteList;

        /* JADX WARN: Multi-variable type inference failed */
        public WebConfig() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ WebConfig copy$default(WebConfig webConfig, Set set, Set set2, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                set = webConfig.preloadList;
            }
            if ((i7 & 2) != 0) {
                set2 = webConfig.whiteList;
            }
            return webConfig.copy(set, set2);
        }

        @Nullable
        public final Set<String> component1() {
            return this.preloadList;
        }

        @Nullable
        public final Set<String> component2() {
            return this.whiteList;
        }

        @NotNull
        public final WebConfig copy(@Nullable Set<String> preloadList, @Nullable Set<String> whiteList) {
            return new WebConfig(preloadList, whiteList);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WebConfig)) {
                return false;
            }
            WebConfig webConfig = (WebConfig) other;
            return Intrinsics.c(this.preloadList, webConfig.preloadList) && Intrinsics.c(this.whiteList, webConfig.whiteList);
        }

        @Nullable
        public final Set<String> getPreloadList() {
            return this.preloadList;
        }

        @Nullable
        public final Set<String> getWhiteList() {
            return this.whiteList;
        }

        public int hashCode() {
            Set<String> set = this.preloadList;
            int iHashCode = (set == null ? 0 : set.hashCode()) * 31;
            Set<String> set2 = this.whiteList;
            return iHashCode + (set2 != null ? set2.hashCode() : 0);
        }

        public final void setPreloadList(@Nullable Set<String> set) {
            this.preloadList = set;
        }

        public final void setWhiteList(@Nullable Set<String> set) {
            this.whiteList = set;
        }

        @NotNull
        public String toString() {
            return "WebConfig(preloadList=" + this.preloadList + ", whiteList=" + this.whiteList + ")";
        }

        public WebConfig(@Nullable Set<String> set, @Nullable Set<String> set2) {
            this.preloadList = set;
            this.whiteList = set2;
        }

        public /* synthetic */ WebConfig(Set set, Set set2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? null : set, (i7 & 2) != 0 ? null : set2);
        }
    }

    private final Y getRequest(J httpUrl) {
        J url = httpUrl.f().b();
        OfflineWebLog.i(this.TAG, "fetch url：" + url);
        X x3 = new X();
        Intrinsics.checkNotNullParameter(url, "url");
        x3.f40680a = url;
        x3.d();
        return x3.b();
    }

    @NotNull
    public abstract String getConfigUrl();

    @NotNull
    public U getOkHttpClient() {
        try {
            S s3 = new S();
            ExecutorService executor = OfflineWebManager.getInstance().getExecutor();
            Intrinsics.checkNotNullExpressionValue(executor, "getExecutor(...)");
            y dispatcher = new y(executor);
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            s3.f40615a = dispatcher;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            s3.b(20L, timeUnit);
            s3.e(20L, timeUnit);
            return new U(s3);
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // com.palmpay.lib.webview.offline.net.IPreloadRequest
    public void requestPreloadList(@Nullable final RequestCallback<WebConfig> callback) {
        U okHttpClient = getOkHttpClient();
        String str = getConfigUrl() + "?t=" + System.currentTimeMillis();
        J j6 = J.f40577k.parse(str);
        if (j6 != null) {
            FirebasePerfOkHttpClient.enqueue(okHttpClient.newCall(getRequest(j6)), new Callback() { // from class: com.palmpay.lib.webview.offline.net.DefaultPreloadRequest.requestPreloadList.1
                @Override // okhttp3.Callback
                public void onFailure(Call call, IOException e10) {
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(e10, "e");
                    RequestCallback<WebConfig> requestCallback = callback;
                    if (requestCallback != null) {
                        requestCallback.onFail(e10);
                    }
                    OfflineWebLog.e(this.TAG, e10.toString());
                }

                @Override // okhttp3.Callback
                public void onResponse(Call call, e0 response) throws IOException {
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(response, "response");
                    try {
                        h0 h0Var = response.f40734g;
                        Unit unit = null;
                        String strString = h0Var != null ? h0Var.string() : null;
                        OfflineWebLog.d(this.TAG, strString);
                        WebConfig webConfig = (WebConfig) OfflineGsonUtils.fromJson(strString, WebConfig.class);
                        if (webConfig != null) {
                            RequestCallback<WebConfig> requestCallback = callback;
                            if (requestCallback != null) {
                                requestCallback.onSuccess(webConfig);
                                unit = Unit.f38893a;
                            }
                            if (unit != null) {
                                return;
                            }
                        }
                        RequestCallback<WebConfig> requestCallback2 = callback;
                        if (requestCallback2 != null) {
                            requestCallback2.onFail(new Throwable("unknown"));
                            Unit unit2 = Unit.f38893a;
                        }
                    } catch (Exception e10) {
                        RequestCallback<WebConfig> requestCallback3 = callback;
                        if (requestCallback3 != null) {
                            requestCallback3.onFail(e10);
                        }
                    }
                }
            });
        } else {
            if (OfflineWebManager.getInstance().isDebug()) {
                throw new IllegalStateException(G.o("parse error url :", str));
            }
            OfflineWebLog.e(this.TAG, new IllegalStateException(G.o("parse error url :", str)));
        }
    }
}

package com.palmpay.lib.webview.offline.net;

import C0.G;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.palmpay.lib.webview.offline.OfflineWebManager;
import com.palmpay.lib.webview.offline.info.OfflinePackageInfo;
import com.palmpay.lib.webview.offline.log.OfflineWebLog;
import com.palmpay.lib.webview.offline.utils.OfflineGsonUtils;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
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
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/palmpay/lib/webview/offline/net/DefaultOfflineRequest;", "Lcom/palmpay/lib/webview/offline/net/IOfflineRequest;", "<init>", "()V", "Lokhttp3/J;", "httpUrl", "Lokhttp3/Y;", "getRequest", "(Lokhttp3/J;)Lokhttp3/Y;", "", "baseUrl", "bizName", "getConfigUrl", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "version", "Lcom/palmpay/lib/webview/offline/net/RequestCallback;", "Lcom/palmpay/lib/webview/offline/info/OfflinePackageInfo;", "callback", "", "requestPackageInfo", "(Ljava/lang/String;Ljava/lang/String;Lcom/palmpay/lib/webview/offline/net/RequestCallback;)V", "getBaseUrl", "()Ljava/lang/String;", "Lokhttp3/U;", "getOkHttpClient", "()Lokhttp3/U;", "TAG", "Ljava/lang/String;", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class DefaultOfflineRequest implements IOfflineRequest {

    @NotNull
    private final String TAG = "DefaultOfflineRequest";

    private final String getConfigUrl(String baseUrl, String bizName) {
        if (y.g(baseUrl, "/", false)) {
            return baseUrl + bizName + "/config.json?t=" + System.currentTimeMillis();
        }
        return baseUrl + "/" + bizName + "/config.json?t=" + System.currentTimeMillis();
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
    public String getBaseUrl() {
        return "";
    }

    @NotNull
    public U getOkHttpClient() {
        try {
            S s3 = new S();
            ExecutorService executor = OfflineWebManager.getInstance().getExecutor();
            Intrinsics.checkNotNullExpressionValue(executor, "getExecutor(...)");
            com.transsnet.palmpay.custom_view.dialog.y dispatcher = new com.transsnet.palmpay.custom_view.dialog.y(executor);
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

    @Override // com.palmpay.lib.webview.offline.net.IOfflineRequest
    public void requestPackageInfo(@NotNull String bizName, @Nullable String version, @NotNull final RequestCallback<OfflinePackageInfo> callback) {
        Intrinsics.checkNotNullParameter(bizName, "bizName");
        Intrinsics.checkNotNullParameter(callback, "callback");
        U okHttpClient = getOkHttpClient();
        String configUrl = getConfigUrl(getBaseUrl(), bizName);
        J j6 = J.f40577k.parse(configUrl);
        if (j6 != null) {
            FirebasePerfOkHttpClient.enqueue(okHttpClient.newCall(getRequest(j6)), new Callback() { // from class: com.palmpay.lib.webview.offline.net.DefaultOfflineRequest.requestPackageInfo.1
                @Override // okhttp3.Callback
                public void onFailure(Call call, IOException e10) {
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(e10, "e");
                    callback.onFail(e10);
                    OfflineWebLog.e(this.TAG, e10.toString());
                }

                @Override // okhttp3.Callback
                public void onResponse(Call call, e0 response) throws IOException {
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(response, "response");
                    try {
                        h0 h0Var = response.f40734g;
                        String strString = h0Var != null ? h0Var.string() : null;
                        OfflinePackageInfo offlinePackageInfo = (OfflinePackageInfo) OfflineGsonUtils.fromJson(strString, OfflinePackageInfo.class);
                        OfflineWebLog.d(this.TAG, strString);
                        callback.onSuccess(offlinePackageInfo);
                    } catch (Exception e10) {
                        callback.onFail(e10);
                    }
                }
            });
        } else {
            if (OfflineWebManager.getInstance().isDebug()) {
                throw new IllegalStateException(G.o("parse error url :", configUrl));
            }
            OfflineWebLog.e(this.TAG, new IllegalStateException(G.o("parse error url :", configUrl)));
        }
    }
}

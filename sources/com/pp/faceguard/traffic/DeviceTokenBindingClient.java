package com.pp.faceguard.traffic;

import android.os.Handler;
import android.os.Looper;
import com.didiglobal.booster.instrument.ShadowExecutors;
import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ExecutorService;
import okhttp3.L;
import okhttp3.U;
import okhttp3.X;
import okhttp3.c0;
import okhttp3.e0;
import okhttp3.h0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
final class DeviceTokenBindingClient {
    private static final ExecutorService EXECUTOR = ShadowExecutors.newOptimizedSingleThreadExecutor("\u200bcom.pp.faceguard.traffic.DeviceTokenBindingClient");
    private static final Handler MAIN = new Handler(Looper.getMainLooper());

    public static void bind(final String str, final String str2, final String str3, final String str4, final BindingCallback bindingCallback) {
        EXECUTOR.execute(new Runnable() { // from class: com.pp.faceguard.traffic.b
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                DeviceTokenBindingClient.execute(str, str2, str3, str4, bindingCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void execute(String str, String str2, String str3, String str4, BindingCallback bindingCallback) throws Throwable {
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                if (!isBlank(str2) && !isBlank(str4)) {
                    URL urlResolveBindingEndpoint = TrafficUploadPolicy.resolveBindingEndpoint();
                    if (urlResolveBindingEndpoint == null) {
                        throw new IllegalStateException("Binding endpoint is unavailable");
                    }
                    byte[] bytes = requestBody(str, str2, str3, str4).getBytes(StandardCharsets.UTF_8);
                    U httpClient = FaceGuardTraffic.getHttpClient();
                    if (httpClient != null) {
                        executeWithOkHttp(httpClient, urlResolveBindingEndpoint, bytes, bindingCallback);
                        return;
                    }
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(urlResolveBindingEndpoint.openConnection()));
                    try {
                        httpURLConnection2.setRequestMethod("POST");
                        httpURLConnection2.setDoOutput(true);
                        httpURLConnection2.setConnectTimeout(3000);
                        httpURLConnection2.setReadTimeout(5000);
                        httpURLConnection2.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/json");
                        TrafficRequestHeaders.apply(httpURLConnection2);
                        httpURLConnection2.setFixedLengthStreamingMode(bytes.length);
                        OutputStream outputStream = httpURLConnection2.getOutputStream();
                        try {
                            outputStream.write(bytes);
                            outputStream.close();
                            int responseCode = httpURLConnection2.getResponseCode();
                            handleResponse(responseCode, TrafficUploader.readResponseBody(responseCode >= 400 ? httpURLConnection2.getErrorStream() : httpURLConnection2.getInputStream()), bindingCallback);
                            httpURLConnection2.disconnect();
                            return;
                        } catch (Throwable th) {
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        httpURLConnection = httpURLConnection2;
                        failure(bindingCallback, -1, "NETWORK_ERROR", e.getMessage() == null ? e.getClass().getSimpleName() : e.getMessage());
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                            return;
                        }
                        return;
                    } catch (Throwable th3) {
                        th = th3;
                        httpURLConnection = httpURLConnection2;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                failure(bindingCallback, -1, "INVALID_REQUEST", "aliyunToken and deviceId are required");
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    private static void executeWithOkHttp(U u6, URL url, byte[] bArr, BindingCallback bindingCallback) throws Exception {
        X x3 = new X();
        x3.l(url);
        x3.e(HttpHeaders.CONTENT_TYPE, "application/json");
        x3.h(c0.create(L.f40589e.parse("application/json"), bArr));
        TrafficRequestHeaders.apply(x3);
        e0 e0VarExecute = FirebasePerfOkHttpClient.execute(u6.newCall(x3.b()));
        try {
            h0 h0Var = e0VarExecute.f40734g;
            handleResponse(e0VarExecute.f40731d, TrafficUploader.readResponseBody(h0Var == null ? null : h0Var.byteStream()), bindingCallback);
            e0VarExecute.close();
        } catch (Throwable th) {
            if (e0VarExecute != null) {
                try {
                    e0VarExecute.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private static void failure(final BindingCallback bindingCallback, final int i7, final String str, final String str2) {
        if (bindingCallback != null) {
            MAIN.post(new Runnable() { // from class: com.pp.faceguard.traffic.c
                @Override // java.lang.Runnable
                public final void run() {
                    bindingCallback.onFailure(i7, str, str2);
                }
            });
        }
    }

    private static void handleResponse(int i7, String str, BindingCallback bindingCallback) throws Exception {
        if (i7 < 200 || i7 >= 300) {
            failure(bindingCallback, i7, "HTTP_ERROR", str);
            return;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("status", "");
        String strOptString2 = jSONObject.optString("message", "");
        if ("SUCCESS".equals(strOptString)) {
            success(bindingCallback, new DeviceTokenBinding(jSONObject.optString("bindingId", ""), strOptString, strOptString2, jSONObject.optString("userId", ""), jSONObject.optString("deviceId", ""), (!jSONObject.has("reportedAt") || jSONObject.isNull("reportedAt")) ? null : Long.valueOf(jSONObject.optLong("reportedAt"))));
        } else {
            failure(bindingCallback, i7, strOptString, strOptString2);
        }
    }

    private static boolean isBlank(String str) {
        return str == null || str.trim().isEmpty();
    }

    private static String requestBody(String str, String str2, String str3, String str4) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("userId", value(str));
        jSONObject.put("aliyunToken", value(str2));
        jSONObject.put("tongdunToken", value(str3));
        jSONObject.put("deviceId", value(str4));
        return jSONObject.toString();
    }

    private static void success(BindingCallback bindingCallback, DeviceTokenBinding deviceTokenBinding) {
        if (bindingCallback != null) {
            MAIN.post(new a(0, bindingCallback, deviceTokenBinding));
        }
    }

    private static String value(String str) {
        return str == null ? "" : str;
    }
}

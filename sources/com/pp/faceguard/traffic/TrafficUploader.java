package com.pp.faceguard.traffic;

import android.util.Log;
import com.didiglobal.booster.instrument.ShadowExecutors;
import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import okhttp3.L;
import okhttp3.U;
import okhttp3.X;
import okhttp3.c0;
import okhttp3.e0;
import okhttp3.h0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
final class TrafficUploader implements TrafficEventSink {
    private static final ThreadLocal<Boolean> BYPASS = new ThreadLocal<>();
    private static final TrafficUploader INSTANCE = new TrafficUploader();
    private static final int MAX_DEBUG_RESPONSE_BYTES = 16384;
    private static final String TAG = "FaceGuardTraffic";
    private final ExecutorService executor = ShadowExecutors.newOptimizedSingleThreadExecutor("\u200bcom.pp.faceguard.traffic.TrafficUploader");

    public static TrafficUploader getInstance() {
        return INSTANCE;
    }

    public static boolean isBypassed() {
        return Boolean.TRUE.equals(BYPASS.get());
    }

    private static boolean isDebugLoggingEnabled() {
        return FaceGuardTraffic.isDebug() && Log.isLoggable(TAG, 3);
    }

    private static void logHookResponse(int i7, Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.optString("status", "");
            jSONObject.optString("message", "");
        } catch (Exception unused) {
        }
        Objects.toString(obj);
    }

    public static String readResponseBody(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return "";
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                int i7 = MAX_DEBUG_RESPONSE_BYTES;
                while (i7 > 0) {
                    int i10 = inputStream.read(bArr, 0, Math.min(1024, i7));
                    if (i10 == -1) {
                        String string = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                        byteArrayOutputStream.close();
                        inputStream.close();
                        return string;
                    }
                    byteArrayOutputStream.write(bArr, 0, i10);
                    i7 -= i10;
                }
                String str = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name()) + "…(truncated)";
                byteArrayOutputStream.close();
                inputStream.close();
                return str;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                inputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: upload, reason: merged with bridge method [inline-methods] */
    public void lambda$accept$0(TrafficEvent trafficEvent) throws Throwable {
        ThreadLocal<Boolean> threadLocal = BYPASS;
        threadLocal.set(Boolean.TRUE);
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                if (!TrafficUploadPolicy.isUploadable(trafficEvent)) {
                    isDebugLoggingEnabled();
                    threadLocal.remove();
                    return;
                }
                URL urlResolveEndpoint = TrafficUploadPolicy.resolveEndpoint();
                if (urlResolveEndpoint == null) {
                    threadLocal.remove();
                    return;
                }
                if (Log.isLoggable(TAG, 3)) {
                    urlResolveEndpoint.toString();
                }
                byte[] bytes = TrafficJsonEncoder.encode(trafficEvent).getBytes(StandardCharsets.UTF_8);
                U httpClient = FaceGuardTraffic.getHttpClient();
                if (httpClient != null) {
                    uploadWithOkHttp(httpClient, urlResolveEndpoint, bytes);
                    threadLocal.remove();
                    return;
                }
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(urlResolveEndpoint.openConnection()));
                try {
                    httpURLConnection2.setRequestMethod("POST");
                    httpURLConnection2.setDoOutput(true);
                    httpURLConnection2.setConnectTimeout(3000);
                    httpURLConnection2.setReadTimeout(5000);
                    httpURLConnection2.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/json; charset=UTF-8");
                    TrafficRequestHeaders.apply(httpURLConnection2);
                    httpURLConnection2.setFixedLengthStreamingMode(bytes.length);
                    OutputStream outputStream = httpURLConnection2.getOutputStream();
                    outputStream.write(bytes);
                    outputStream.close();
                    int responseCode = httpURLConnection2.getResponseCode();
                    if (isDebugLoggingEnabled()) {
                        logHookResponse(responseCode, httpURLConnection2.getHeaderFields(), readResponseBody(responseCode >= 400 ? httpURLConnection2.getErrorStream() : httpURLConnection2.getInputStream()));
                    }
                    httpURLConnection2.disconnect();
                    threadLocal.remove();
                } catch (Exception unused) {
                    httpURLConnection = httpURLConnection2;
                    isDebugLoggingEnabled();
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    BYPASS.remove();
                } catch (Throwable th) {
                    th = th;
                    httpURLConnection = httpURLConnection2;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    BYPASS.remove();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception unused2) {
        }
    }

    private static void uploadWithOkHttp(U u6, URL url, byte[] bArr) throws IOException {
        X x3 = new X();
        x3.l(url);
        x3.e(HttpHeaders.CONTENT_TYPE, "application/json; charset=UTF-8");
        x3.h(c0.create(L.f40589e.parse("application/json; charset=UTF-8"), bArr));
        TrafficRequestHeaders.apply(x3);
        e0 e0VarExecute = FirebasePerfOkHttpClient.execute(u6.newCall(x3.b()));
        try {
            if (isDebugLoggingEnabled()) {
                h0 h0Var = e0VarExecute.f40734g;
                logHookResponse(e0VarExecute.f40731d, e0VarExecute.f40733f.e(), readResponseBody(h0Var == null ? null : h0Var.byteStream()));
            }
            if (e0VarExecute != null) {
                e0VarExecute.close();
            }
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

    @Override // com.pp.faceguard.traffic.TrafficEventSink
    public void accept(TrafficEvent trafficEvent) {
        this.executor.execute(new a(1, this, trafficEvent));
    }
}

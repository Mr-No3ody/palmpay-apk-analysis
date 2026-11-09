package com.google.net.cronet.okhttptransport;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.metrics.Trace;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.J;
import okhttp3.Y;
import org.chromium.net.CronetException;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlResponseInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\bÆ\u0002\u0018\u00002\u00020\u0001:\u00017B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u000e\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0014\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\r2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010&R\u0014\u0010(\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010&R\u0014\u0010)\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010&R\u0014\u0010*\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010&R\u0014\u0010+\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010&R\u0014\u0010,\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010&R\u0014\u0010-\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010&R\u0014\u0010.\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010&R\u0014\u0010/\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010&R\u0014\u00100\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010&R\u0014\u00101\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u0010&R\u0014\u00102\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u0010&R\u0014\u00103\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u0010&R\u0014\u00104\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u00106¨\u00068"}, d2 = {"Lcom/google/net/cronet/okhttptransport/CronetLogHelper;", "", "<init>", "()V", "Lcom/google/firebase/perf/metrics/Trace;", "trace", "", FirebaseAnalytics.Param.METHOD, "", "dns", "tls", CronetLogHelper.KEY_NEW_CONNECTION, "error", "", "putSummaryAttribute", "(Lcom/google/firebase/perf/metrics/Trace;Ljava/lang/String;ZZZLjava/lang/String;)V", "metric", "", "startTime", "endTime", "parseTimeLog", "(Lcom/google/firebase/perf/metrics/Trace;Ljava/lang/String;JJ)Z", "Lorg/chromium/net/RequestFinishedInfo;", "requestFinishedInfo", "traceName", "Lokhttp3/Y;", "request", "logMatrix", "(Lorg/chromium/net/RequestFinishedInfo;Ljava/lang/String;Lokhttp3/Y;)V", "protocol", "Lokhttp3/W;", "protocolFromCronet", "(Ljava/lang/String;)Lokhttp3/W;", "Lcom/google/net/cronet/okhttptransport/CronetLogHelper$OnMetricCallback;", "callback", "setOnMetricCallback", "(Lcom/google/net/cronet/okhttptransport/CronetLogHelper$OnMetricCallback;)V", "KEY_NEW_CONNECTION", "Ljava/lang/String;", "KEY_URL", "KEY_BASE_URL", "KEY_CONNECT_DURATION", "KEY_DNS_DURATION", "KEY_TLS_DURATION", "KEY_REQUEST_DURATION", "KEY_RESPONSE_DURATION", "KEY_SERVER_DURATION", "KEY_TOTAL_DURATION", "KEY_SUCCESS_IN_ONE_SECOND", "KEY_SUMMARY", "KEY_PROTOCOL", "TAG", "MORE_INFO", "Z", "Lcom/google/net/cronet/okhttptransport/CronetLogHelper$OnMetricCallback;", "OnMetricCallback", "lib_cronet_okhttp_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CronetLogHelper {

    @NotNull
    public static final CronetLogHelper INSTANCE = new CronetLogHelper();

    @NotNull
    private static final String KEY_BASE_URL = "baseUrl";

    @NotNull
    private static final String KEY_CONNECT_DURATION = "connectDuration";

    @NotNull
    private static final String KEY_DNS_DURATION = "dnsDuration";

    @NotNull
    private static final String KEY_NEW_CONNECTION = "newConnection";

    @NotNull
    private static final String KEY_PROTOCOL = "protocol";

    @NotNull
    private static final String KEY_REQUEST_DURATION = "requestDuration";

    @NotNull
    private static final String KEY_RESPONSE_DURATION = "responseDuration";

    @NotNull
    private static final String KEY_SERVER_DURATION = "serverDuration";

    @NotNull
    private static final String KEY_SUCCESS_IN_ONE_SECOND = "success_in_one_second";

    @NotNull
    private static final String KEY_SUMMARY = "summary";

    @NotNull
    private static final String KEY_TLS_DURATION = "tlsDuration";

    @NotNull
    private static final String KEY_TOTAL_DURATION = "totalDuration";

    @NotNull
    private static final String KEY_URL = "url";
    private static final boolean MORE_INFO = false;

    @NotNull
    private static final String TAG = "CronetInterceptor";

    @Nullable
    private static OnMetricCallback callback;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/google/net/cronet/okhttptransport/CronetLogHelper$OnMetricCallback;", "", "onMetric", "", "metricsMap", "", "", "lib_cronet_okhttp_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface OnMetricCallback {
        void onMetric(@NotNull Map<String, String> metricsMap);
    }

    private CronetLogHelper() {
    }

    private final boolean parseTimeLog(Trace trace, String metric, long startTime, long endTime) {
        if (endTime <= startTime || endTime <= 0 || startTime <= 0) {
            return false;
        }
        if (trace == null) {
            return true;
        }
        trace.putMetric(metric, endTime - startTime);
        return true;
    }

    private final void putSummaryAttribute(Trace trace, String method, boolean dns, boolean tls, boolean newConnection, String error) {
        if (trace != null) {
            trace.putAttribute(KEY_NEW_CONNECTION, String.valueOf(newConnection));
        }
    }

    public final void logMatrix(@NotNull RequestFinishedInfo requestFinishedInfo, @Nullable String traceName, @Nullable Y request) {
        Trace traceNewTrace;
        J j6;
        String str;
        CronetException exception;
        String message;
        String negotiatedProtocol;
        Map<String, List<String>> allHeaders;
        List<String> list;
        J j10;
        Intrinsics.checkNotNullParameter(requestFinishedInfo, "requestFinishedInfo");
        RequestFinishedInfo.Metrics metrics = requestFinishedInfo.getMetrics();
        boolean z3 = requestFinishedInfo.getFinishedReason() == 0;
        if (!z3) {
            OnMetricCallback onMetricCallback = callback;
            if (onMetricCallback != null) {
                onMetricCallback.onMetric(G.g(new Pair(CronetNqeKey.KEY_HTTP_RTT, "0"), new Pair(CronetNqeKey.KEY_TRANSPORT_RTT, "0"), new Pair("success", "0")));
                return;
            }
            return;
        }
        Date dnsStart = metrics.getDnsStart();
        long time = dnsStart != null ? dnsStart.getTime() : 0L;
        Date dnsEnd = metrics.getDnsEnd();
        long time2 = dnsEnd != null ? dnsEnd.getTime() : 0L;
        Date connectStart = metrics.getConnectStart();
        long time3 = connectStart != null ? connectStart.getTime() : 0L;
        Date connectEnd = metrics.getConnectEnd();
        long time4 = connectEnd != null ? connectEnd.getTime() : 0L;
        Date sslStart = metrics.getSslStart();
        long time5 = sslStart != null ? sslStart.getTime() : 0L;
        Date sslEnd = metrics.getSslEnd();
        long time6 = sslEnd != null ? sslEnd.getTime() : 0L;
        Date sendingStart = metrics.getSendingStart();
        long time7 = sendingStart != null ? sendingStart.getTime() : 0L;
        Date sendingEnd = metrics.getSendingEnd();
        if (sendingEnd != null) {
            sendingEnd.getTime();
        }
        Date responseStart = metrics.getResponseStart();
        long time8 = responseStart != null ? responseStart.getTime() : 0L;
        Date requestEnd = metrics.getRequestEnd();
        if (requestEnd != null) {
            requestEnd.getTime();
        }
        Long totalTimeMs = metrics.getTotalTimeMs();
        if (totalTimeMs == null) {
            totalTimeMs = 0L;
        }
        long jLongValue = totalTimeMs.longValue();
        try {
            if (TextUtils.isEmpty(traceName)) {
                traceNewTrace = null;
            } else {
                FirebasePerformance firebasePerformance = FirebasePerformance.getInstance();
                Intrinsics.e(traceName);
                traceNewTrace = firebasePerformance.newTrace(traceName);
            }
        } catch (Exception unused) {
        }
        if (traceNewTrace != null) {
            traceNewTrace.start();
        }
        if (TextUtils.isEmpty((request == null || (j10 = request.f40685a) == null) ? null : j10.b())) {
            URL url = new URL(requestFinishedInfo.getUrl().toString());
            url.getPath();
            if (traceNewTrace != null) {
                traceNewTrace.putAttribute("url", url.getPath());
            }
            if (traceNewTrace != null) {
                traceNewTrace.putAttribute(KEY_BASE_URL, url.getHost());
            }
        } else if (request != null && (j6 = request.f40685a) != null) {
            j6.b();
            if (traceNewTrace != null) {
                traceNewTrace.putAttribute("url", j6.b());
            }
            if (traceNewTrace != null) {
                traceNewTrace.putAttribute(KEY_BASE_URL, j6.f40582d);
            }
        }
        if (request == null || (str = request.f40686b) == null) {
            str = "unknown";
        }
        Trace trace = traceNewTrace;
        putSummaryAttribute(trace, str, parseTimeLog(trace, KEY_DNS_DURATION, time, time2), parseTimeLog(trace, KEY_TLS_DURATION, time5, time6), parseTimeLog(trace, KEY_CONNECT_DURATION, time3, time4), (z3 || (exception = requestFinishedInfo.getException()) == null || (message = exception.getMessage()) == null) ? "" : message);
        if (trace != null) {
            trace.putAttribute(KEY_SUCCESS_IN_ONE_SECOND, jLongValue <= 1000 ? "true" : "false");
        }
        if (trace != null) {
            trace.putMetric(KEY_TOTAL_DURATION, jLongValue);
        }
        UrlResponseInfo responseInfo = requestFinishedInfo.getResponseInfo();
        if (responseInfo != null && (allHeaders = responseInfo.getAllHeaders()) != null && (list = allHeaders.get("bkrt")) != null) {
            try {
                String key = list.get(0);
                if (!TextUtils.isEmpty(key) && trace != null) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    trace.putMetric(KEY_SERVER_DURATION, Long.parseLong(key));
                }
            } catch (Exception unused2) {
            }
        }
        UrlResponseInfo responseInfo2 = requestFinishedInfo.getResponseInfo();
        if (responseInfo2 == null) {
            negotiatedProtocol = null;
        } else if (TextUtils.isEmpty(responseInfo2.getNegotiatedProtocol())) {
            if (trace != null) {
                trace.putAttribute("protocol", "Unknown");
            }
            negotiatedProtocol = null;
        } else {
            negotiatedProtocol = responseInfo2.getNegotiatedProtocol();
            if (trace != null) {
                trace.putAttribute("protocol", responseInfo2.getNegotiatedProtocol());
            }
        }
        long j11 = time6 - time5;
        if (z3 && trace != null) {
            trace.stop();
        }
        long j12 = time4 - time3;
        if (time6 != 0 && time5 != 0) {
            j12 -= j11;
        }
        long j13 = time8 - time7;
        OnMetricCallback onMetricCallback2 = callback;
        if (onMetricCallback2 != null) {
            onMetricCallback2.onMetric(G.g(new Pair(CronetNqeKey.KEY_HTTP_RTT, String.valueOf(j13)), new Pair(CronetNqeKey.KEY_TRANSPORT_RTT, String.valueOf(j12)), new Pair("success", "1"), new Pair("protocol", negotiatedProtocol != null ? negotiatedProtocol : "")));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        if (r2.equals("h2") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
    
        if (r2.equals("http/3") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        return okhttp3.W.QUIC;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        if (r2.equals("http/2") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0062, code lost:
    
        return okhttp3.W.HTTP_2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r2.equals("quic") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (r2.equals("h3") == false) goto L36;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final okhttp3.W protocolFromCronet(@org.jetbrains.annotations.NotNull java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "protocol"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r0)
            java.lang.String r0 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            int r0 = r2.hashCode()
            switch(r0) {
                case -2142965415: goto L63;
                case -1206842261: goto L57;
                case -1206842260: goto L4b;
                case -134242388: goto L3f;
                case -134242387: goto L33;
                case 3274: goto L2a;
                case 3275: goto L21;
                case 3482174: goto L18;
                default: goto L17;
            }
        L17:
            goto L6b
        L18:
            java.lang.String r0 = "quic"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L54
            goto L6b
        L21:
            java.lang.String r0 = "h3"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L54
            goto L6b
        L2a:
            java.lang.String r0 = "h2"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L60
            goto L6b
        L33:
            java.lang.String r0 = "http/1.1"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L3c
            goto L6b
        L3c:
            okhttp3.W r2 = okhttp3.W.HTTP_1_1
            return r2
        L3f:
            java.lang.String r0 = "http/1.0"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L48
            goto L6b
        L48:
            okhttp3.W r2 = okhttp3.W.HTTP_1_0
            return r2
        L4b:
            java.lang.String r0 = "http/3"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L54
            goto L6b
        L54:
            okhttp3.W r2 = okhttp3.W.QUIC
            return r2
        L57:
            java.lang.String r0 = "http/2"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L60
            goto L6b
        L60:
            okhttp3.W r2 = okhttp3.W.HTTP_2
            return r2
        L63:
            java.lang.String r0 = "spdy/3.1"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L6e
        L6b:
            okhttp3.W r2 = okhttp3.W.HTTP_1_1
            return r2
        L6e:
            okhttp3.W r2 = okhttp3.W.SPDY_3
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.net.cronet.okhttptransport.CronetLogHelper.protocolFromCronet(java.lang.String):okhttp3.W");
    }

    public final void setOnMetricCallback(@NotNull OnMetricCallback callback2) {
        Intrinsics.checkNotNullParameter(callback2, "callback");
        callback = callback2;
    }
}

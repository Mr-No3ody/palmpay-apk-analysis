package p112h6;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.metrics.Trace;
import com.palmpay.lib.apm.LibApm;
import com.palmpay.lib.apm.network.OkHttpEventListener;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f37349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashMap f37350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HashMap f37351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ OkHttpEventListener f37352d;

    public c(OkHttpEventListener okHttpEventListener, String str, String str2) {
        this.f37352d = okHttpEventListener;
        b("url", str);
    }

    public final boolean a(String str, String str2, String str3) {
        HashMap map = this.f37350b;
        if (map == null) {
            return false;
        }
        Long l5 = (Long) map.get(str2);
        Long l6 = (Long) this.f37350b.get(str3);
        if (l5 == null || l6 == null || l6.longValue() <= l5.longValue()) {
            return false;
        }
        c(str, l6.longValue() - l5.longValue());
        return true;
    }

    public final void b(String str, String str2) {
        try {
            if (this.f37351c == null) {
                this.f37351c = new HashMap();
            }
            this.f37351c.put(str, str2);
        } catch (Exception unused) {
        }
    }

    public final void c(String str, long j6) {
        try {
            if (this.f37351c == null) {
                this.f37351c = new HashMap();
            }
            this.f37351c.put(str, Long.valueOf(j6));
        } catch (Exception unused) {
        }
    }

    public final void d(boolean z3, boolean z8) {
        if (z3) {
            this.f37349a = SystemClock.elapsedRealtime();
            return;
        }
        if (this.f37350b.get("requestHeadersStart") == null || this.f37350b.get("requestHeadersEnd") == null) {
            HashMap map = this.f37350b;
            if (map != null) {
                map.clear();
                return;
            }
            return;
        }
        if (LibApm.INSTANCE.isFirebaseInitialized()) {
            FirebasePerformance firebasePerformance = FirebasePerformance.getInstance();
            OkHttpEventListener okHttpEventListener = this.f37352d;
            Trace traceNewTrace = firebasePerformance.newTrace(okHttpEventListener.traceName);
            traceNewTrace.start();
            HashMap map2 = this.f37351c;
            String str = null;
            if (map2 != null) {
                for (Map.Entry entry : map2.entrySet()) {
                    String str2 = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value instanceof Long) {
                        traceNewTrace.putMetric(str2, ((Long) value).longValue());
                    } else if (value instanceof String) {
                        if (str2.equals("encryption")) {
                            str = (String) value;
                        } else {
                            traceNewTrace.putAttribute(str2, (String) value);
                        }
                    }
                }
                this.f37351c.clear();
            }
            boolean zA = a("dnsDuration", "dnsStart", "dnsEnd");
            boolean zA2 = a("connectDuration", "connectStart", "connectEnd");
            boolean zA3 = a("tlsDuration", "secureConnectStart", "secureConnectEnd");
            HashMap map3 = this.f37350b;
            if (map3 != null) {
                Long l5 = (Long) map3.get("callStart");
                Long l6 = (Long) this.f37350b.get("callEnd");
                Long l8 = (Long) this.f37350b.get("callFailed");
                if (l8 != null) {
                    l6 = l8;
                }
                if (l5 != null && l6 != null && l6.longValue() > l5.longValue()) {
                    c("totalDuration", l6.longValue() - l5.longValue());
                }
            }
            HashMap map4 = this.f37350b;
            if (map4 != null) {
                map4.clear();
            }
            traceNewTrace.putAttribute("success_in_one_second", SystemClock.elapsedRealtime() - this.f37349a <= 1000 ? "true" : "false");
            if (z8) {
                traceNewTrace.putAttribute("newConnection", "FAIL");
            } else if (TextUtils.isEmpty(str)) {
                traceNewTrace.putAttribute("newConnection", String.valueOf(zA2));
            } else {
                traceNewTrace.putAttribute("newConnection", zA2 + "/" + str);
            }
            if (okHttpEventListener.isDebug()) {
                traceNewTrace.getAttribute("url");
                if (zA) {
                    traceNewTrace.getLongMetric("dnsDuration");
                }
                if (zA2) {
                    traceNewTrace.getLongMetric("connectDuration");
                }
                if (zA3) {
                    traceNewTrace.getLongMetric("tlsDuration");
                }
            }
            traceNewTrace.stop();
        }
    }

    public final boolean e(long j6, String str) {
        if (this.f37350b == null) {
            this.f37350b = new HashMap();
        }
        this.f37350b.put(str, Long.valueOf(j6));
        if ("callStart".equals(str)) {
            d(true, false);
        } else {
            if ("callEnd".equals(str)) {
                d(false, false);
                return true;
            }
            if ("callFailed".equals(str)) {
                d(false, true);
                return true;
            }
        }
        return false;
    }
}

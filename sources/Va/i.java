package Va;

import Pa.i0;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.metrics.Trace;
import com.palmpay.lib.webview.offline.monitor.impl.OfflineWebPageStatus;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C1847n;
import kotlin.collections.G;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.y;
import p355xf.q;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements ValueCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f10242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f10243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ WebView f10245d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f10246e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f10247f;

    public /* synthetic */ i(int i7, long j6, long j10, m mVar, WebView webView, String str) {
        this.f10242a = mVar;
        this.f10243b = j6;
        this.f10244c = i7;
        this.f10245d = webView;
        this.f10246e = j10;
        this.f10247f = str;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        int i7;
        String string;
        Object objF;
        int i10 = 1;
        final m mVar = this.f10242a;
        final long j6 = this.f10243b;
        final int i11 = this.f10244c;
        final WebView webView = this.f10245d;
        final long j10 = this.f10246e;
        final String str = this.f10247f;
        String str2 = (String) obj;
        if (!mVar.f10270d && i0.W(mVar.f10267a) && !mVar.f10274h && j6 == mVar.f10275i) {
            if (str2 != null) {
                char[] chars = {'\"'};
                Intrinsics.checkNotNullParameter(str2, "<this>");
                Intrinsics.checkNotNullParameter(chars, "chars");
                int length = str2.length() - 1;
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    i7 = i10;
                    if (i12 > length) {
                        break;
                    }
                    boolean zM = C1847n.m(chars, str2.charAt(i13 == 0 ? i12 : length));
                    if (i13 == 0) {
                        if (zM) {
                            i12++;
                        } else {
                            i10 = i7;
                            i13 = i10;
                        }
                    } else if (!zM) {
                        break;
                    } else {
                        length--;
                    }
                    i10 = i7;
                }
                string = str2.subSequence(i12, length + 1).toString();
            } else {
                i7 = 1;
                string = null;
            }
            if (string == null) {
                string = "";
            }
            if (y.m(string, "ERR|", false)) {
                F6.d.h("WebPerfCollector", 3, "web perf js evaluate failed: ".concat(string));
                return;
            }
            List listSplit$default = StringsKt__StringsKt.split$default(string, new String[]{"|"}, false, 0, 6, null);
            if (listSplit$default.size() < 8) {
                F6.d.h("WebPerfCollector", 3, "web perf js result invalid: ".concat(string));
                return;
            }
            double dA = m.a((String) listSplit$default.get(0));
            double dA2 = m.a((String) listSplit$default.get(i7));
            double dA3 = m.a((String) listSplit$default.get(2));
            double dA4 = m.a((String) listSplit$default.get(3));
            if ((dA4 <= 0.0d || dA3 <= 0.0d) && i11 < 5) {
                webView.postDelayed(new Runnable() { // from class: Va.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i14 = i11 + 1;
                        WebView webView2 = webView;
                        String str3 = str;
                        m mVar2 = mVar;
                        if (mVar2.f10270d || mVar2.f10274h) {
                            return;
                        }
                        long j11 = mVar2.f10275i;
                        long j12 = j6;
                        if (j12 != j11) {
                            return;
                        }
                        webView2.evaluateJavascript("(function() {\n    try {\n        var nav = (performance.getEntriesByType && performance.getEntriesByType('navigation')[0]) || null;\n        var timing = performance.timing || null;\n        var paints = (performance.getEntriesByType && performance.getEntriesByType('paint')) || [];\n        var supportsGetEntriesByType = !!(performance && performance.getEntriesByType);\n        var paintEntryCount = paints ? paints.length : -1;\n        var navigationEntryAvailable = nav ? 1 : 0;\n        function getPaint(name) {\n            for (var i = 0; i < paints.length; i++) {\n                if (paints[i] && paints[i].name === name) {\n                    return paints[i].startTime;\n                }\n            }\n            return -1;\n        }\n        var fp = getPaint('first-paint');\n        var fcp = getPaint('first-contentful-paint');\n        var loadEventEnd = nav ? nav.loadEventEnd : (timing ? (timing.loadEventEnd - timing.navigationStart) : -1);\n        var dclEnd = nav ? nav.domContentLoadedEventEnd : (timing ? (timing.domContentLoadedEventEnd - timing.navigationStart) : -1);\n        var ttfb = nav ? nav.responseStart : (timing ? (timing.responseStart - timing.navigationStart) : -1);\n        return [fp, fcp, loadEventEnd, dclEnd, ttfb, supportsGetEntriesByType ? 1 : 0, paintEntryCount, navigationEntryAvailable].join('|');\n    } catch (e) {\n        return 'ERR|' + (e && e.message ? e.message : 'unknown');\n    }\n})();", new i(i14, j12, j10, mVar2, webView2, str3));
                    }
                }, 300L);
                return;
            }
            double dA5 = m.a((String) listSplit$default.get(4));
            Long lU = StringsKt.U((String) listSplit$default.get(5));
            long jLongValue = lU != null ? lU.longValue() : -1L;
            Long lU2 = StringsKt.U((String) listSplit$default.get(6));
            long jLongValue2 = lU2 != null ? lU2.longValue() : -1L;
            Long lU3 = StringsKt.U((String) listSplit$default.get(7));
            String str3 = (jLongValue == 1 && jLongValue2 > 0 && (lU3 != null ? lU3.longValue() : -1L) == 1) ? "true" : "false";
            String cacheHitRate = OfflineWebPageStatus.getCacheHitRate(mVar.f10277k, mVar.f10276j);
            if (dA4 > 0.0d) {
                long j11 = mVar.f10272f;
                if (j11 < 0) {
                    j11 = 0;
                }
                Map mapG = G.g(new Pair("init", Long.valueOf(j11)), new Pair("nativePageCost", Long.valueOf(j10)), new Pair("firstContentfulPaint", Long.valueOf(m.b(dA2))), new Pair("domContentLoadedEnd", Long.valueOf(m.b(dA4))), new Pair("TTFB", Long.valueOf(m.b(dA5))));
                Map mapG2 = G.g(new Pair("isFirstOpen", String.valueOf(mVar.f10269c)), new Pair("supportFCP", str3), new Pair("cacheHitRate", cacheHitRate), new Pair("url", str));
                try {
                    p355xf.o oVar = q.f43977a;
                    Trace traceNewTrace = FirebasePerformance.getInstance().newTrace("web_page_load_performance");
                    Intrinsics.checkNotNullExpressionValue(traceNewTrace, "newTrace(...)");
                    traceNewTrace.start();
                    for (Map.Entry entry : mapG2.entrySet()) {
                        traceNewTrace.putAttribute((String) entry.getKey(), (String) entry.getValue());
                    }
                    for (Map.Entry entry2 : mapG.entrySet()) {
                        traceNewTrace.putMetric((String) entry2.getKey(), ((Number) entry2.getValue()).longValue());
                    }
                    traceNewTrace.stop();
                    objF = Unit.f38893a;
                } catch (Throwable th) {
                    p355xf.o oVar2 = q.f43977a;
                    objF = androidx.camera.core.impl.utils.executor.g.f(th);
                }
                Throwable thA = q.a(objF);
                if (thA != null) {
                    F6.d.h("WebPerfCollector", 3, "reportTraceMetrics failed, trace=web_page_load_performance", thA);
                }
                F6.d.h("WebPerfCollector", 3, com.airbnb.lottie.model.layer.d.o(new Object[]{Double.valueOf(mVar.f10272f), Double.valueOf(dA), Double.valueOf(dA2), Double.valueOf(dA4), Double.valueOf(dA3), Double.valueOf(dA5), Double.valueOf(j10), Boolean.valueOf(mVar.f10269c), str3, cacheHitRate, Integer.valueOf(mVar.f10277k), Integer.valueOf(mVar.f10276j), Integer.valueOf(i11)}, 13, Locale.US, "web perf init=%.2f fp=%.2f fcp=%.2f dcl=%.2f load=%.2f ttfb=%.2f native=%.2f firstOpen=%s fcpOK=%s cache=%s cacheHit=%d cacheTotal=%d retry=%d", "format(...)"));
                Function1 function1 = m.f10266l;
                if (function1 != null) {
                    long j12 = mVar.f10272f;
                    long j13 = j12 < 0 ? 0L : j12;
                    boolean z3 = mVar.f10269c;
                    Intrinsics.e(cacheHitRate);
                    function1.invoke(new k(j13, dA, dA2, dA4, dA3, dA5, j10, z3, cacheHitRate, mVar.f10277k, mVar.f10276j, str));
                }
            } else {
                F6.d.h("WebPerfCollector", 3, "invalid performance record, abort it");
            }
            mVar.f10274h = true;
        }
    }
}

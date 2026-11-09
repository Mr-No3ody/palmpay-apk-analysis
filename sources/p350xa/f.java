package p350xa;

import C0.G;
import N8.q0;
import android.os.Build;
import android.os.SystemClock;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.net.cronet.okhttptransport.CronetInterceptor;
import com.palmpay.lib.apm.network.NQEManager;
import com.palmpay.lib.apm.network.OkHttpEventListener;
import com.palmpay.lib.apm.network.bean.BaseNQEQualityBean;
import com.palmpay.lib.apm.network.bean.NQEQualityBean;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.e0;
import org.chromium.net.CronetEngine;
import p324va.d;
import p355xf.C2131j;
import p355xf.EnumC2132k;
import p355xf.t;
import x9.u;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements Interceptor {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f43721i = new c(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f43722j = C2131j.a(EnumC2132k.f43969a, new u(1));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CronetInterceptor f43723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f43724b = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicInteger f43725c = new AtomicInteger(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicInteger f43726d = new AtomicInteger(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f43727e = C2131j.b(new u(2));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f43728f = 9;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f43729g;

    public final void a(CronetEngine cronetEngine) {
        OkHttpEventListener okHttpEventListener;
        if (this.f43723a == null) {
            try {
                CronetInterceptor.Builder builderNewBuilder = CronetInterceptor.newBuilder(cronetEngine);
                builderNewBuilder.setTraceName("NetworkTraceV6");
                builderNewBuilder.setMetricCallBack(new d(this));
                this.f43723a = builderNewBuilder.build();
                if (((Boolean) this.f43727e.getValue()).booleanValue() || (okHttpEventListener = (OkHttpEventListener) d.f43142a.f18581c) == null) {
                    return;
                }
                okHttpEventListener.setEnableNetworkTrace(false);
            } catch (Throwable th) {
                this.f43723a = null;
                F6.d.c("CronetWrapInterceptor", "initCronetInterceptor", th);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007e  */
    /* JADX WARN: Code duplicated, block: B:56:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d4  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // okhttp3.Interceptor
    public final e0 intercept(Interceptor.Chain chain) throws IOException {
        double weightedSuccessRate;
        long weightedHttpRTT;
        Object objValueOf;
        e0 e0VarProceed;
        List listH;
        Intrinsics.checkNotNullParameter(chain, "chain");
        if (!((Boolean) this.f43727e.getValue()).booleanValue() || Build.VERSION.SDK_INT < 29) {
            CronetInterceptor cronetInterceptor = this.f43723a;
            if (cronetInterceptor == null) {
                return chain.proceed(chain.request());
            }
            e0 e0VarIntercept = cronetInterceptor.intercept(chain);
            Intrinsics.e(e0VarIntercept);
            return e0VarIntercept;
        }
        if (this.f43729g == 0 || SystemClock.elapsedRealtime() - this.f43729g > DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT) {
            NQEQualityBean lastNetworkQualityRecord = NQEManager.INSTANCE.getLastNetworkQualityRecord();
            if (lastNetworkQualityRecord != null) {
                BaseNQEQualityBean cronet = lastNetworkQualityRecord.getCronet();
                if ((cronet != null ? cronet.getWeightedSuccessRate() : 0.0d) <= 0.0d) {
                    weightedSuccessRate = 0.0d;
                } else {
                    BaseNQEQualityBean okhttp = lastNetworkQualityRecord.getOkhttp();
                    if ((okhttp != null ? okhttp.getWeightedSuccessRate() : 0.0d) > 0.0d) {
                        BaseNQEQualityBean cronet2 = lastNetworkQualityRecord.getCronet();
                        double weightedSuccessRate2 = cronet2 != null ? cronet2.getWeightedSuccessRate() : 0.0d;
                        BaseNQEQualityBean okhttp2 = lastNetworkQualityRecord.getOkhttp();
                        weightedSuccessRate = weightedSuccessRate2 - (okhttp2 != null ? okhttp2.getWeightedSuccessRate() : 0.0d);
                    } else {
                        weightedSuccessRate = 0.0d;
                    }
                }
                BaseNQEQualityBean cronet3 = lastNetworkQualityRecord.getCronet();
                if ((cronet3 != null ? cronet3.getWeightedHttpRTT() : 0L) <= 0) {
                    weightedHttpRTT = 0;
                } else {
                    BaseNQEQualityBean okhttp4 = lastNetworkQualityRecord.getOkhttp();
                    if ((okhttp4 != null ? okhttp4.getWeightedHttpRTT() : 0L) > 0) {
                        BaseNQEQualityBean cronet4 = lastNetworkQualityRecord.getCronet();
                        long weightedHttpRTT2 = cronet4 != null ? cronet4.getWeightedHttpRTT() : 0L;
                        BaseNQEQualityBean okhttp5 = lastNetworkQualityRecord.getOkhttp();
                        weightedHttpRTT = weightedHttpRTT2 - (okhttp5 != null ? okhttp5.getWeightedHttpRTT() : 0L);
                    } else {
                        weightedHttpRTT = 0;
                    }
                }
                if (Math.abs(weightedSuccessRate) > 0.15000000596046448d || Math.abs(weightedHttpRTT) > 100) {
                    int i7 = this.f43728f;
                    this.f43728f = (weightedSuccessRate > 0.0d || weightedHttpRTT < 0) ? Math.min(9, i7 + 1) : Math.max(1, i7 - 1);
                    if (Math.abs(weightedSuccessRate) > 0.15000000596046448d) {
                        int i10 = this.f43728f;
                        BaseNQEQualityBean cronet5 = lastNetworkQualityRecord.getCronet();
                        Double dValueOf = cronet5 != null ? Double.valueOf(cronet5.getWeightedSuccessRate()) : null;
                        BaseNQEQualityBean okhttp6 = lastNetworkQualityRecord.getOkhttp();
                        objValueOf = okhttp6 != null ? Double.valueOf(okhttp6.getWeightedSuccessRate()) : null;
                        StringBuilder sbP = q0.p(i7, "checkIfUpdatePercent ", i10, " -> ", " success rate (");
                        sbP.append(dValueOf);
                        sbP.append(" - ");
                        sbP.append(objValueOf);
                        sbP.append(")=");
                        sbP.append(weightedSuccessRate);
                        F6.d.h("CronetWrapInterceptor", 3, sbP.toString());
                    } else if (Math.abs(weightedHttpRTT) > 100) {
                        int i11 = this.f43728f;
                        BaseNQEQualityBean cronet6 = lastNetworkQualityRecord.getCronet();
                        Long lValueOf = cronet6 != null ? Long.valueOf(cronet6.getWeightedHttpRTT()) : null;
                        BaseNQEQualityBean okhttp7 = lastNetworkQualityRecord.getOkhttp();
                        objValueOf = okhttp7 != null ? Long.valueOf(okhttp7.getWeightedHttpRTT()) : null;
                        StringBuilder sbP2 = q0.p(i7, "checkIfUpdatePercent ", i11, " -> ", " rtt (");
                        q0.w(sbP2, lValueOf, " - ", objValueOf, ")=");
                        sbP2.append(weightedHttpRTT);
                        F6.d.h("CronetWrapInterceptor", 3, sbP2.toString());
                    }
                    this.f43729g = SystemClock.elapsedRealtime();
                }
            }
            if (this.f43729g == 0) {
                this.f43729g = SystemClock.elapsedRealtime();
            }
        }
        CronetInterceptor cronetInterceptor2 = this.f43723a;
        AtomicInteger atomicInteger = this.f43725c;
        AtomicInteger atomicInteger2 = this.f43726d;
        boolean zBooleanValue = false;
        if (cronetInterceptor2 != null) {
            int i12 = atomicInteger2.get();
            int i13 = atomicInteger.get();
            if (i12 <= 10 || i12 <= i13 + 5) {
                AtomicInteger atomicInteger3 = this.f43724b;
                int andIncrement = atomicInteger3.getAndIncrement();
                if (andIncrement > 2147483637) {
                    atomicInteger3.set(0);
                }
                switch (this.f43728f) {
                    case 1:
                        Boolean bool = Boolean.FALSE;
                        listH = C1850q.h(bool, bool, bool, bool, Boolean.TRUE, bool, bool, bool, bool, bool);
                        break;
                    case 2:
                        Boolean bool2 = Boolean.FALSE;
                        Boolean bool3 = Boolean.TRUE;
                        listH = C1850q.h(bool2, bool2, bool2, bool3, bool2, bool2, bool2, bool3, bool2, bool2);
                        break;
                    case 3:
                        Boolean bool4 = Boolean.TRUE;
                        Boolean bool5 = Boolean.FALSE;
                        listH = C1850q.h(bool4, bool5, bool5, bool4, bool5, bool5, bool4, bool5, bool5, bool5);
                        break;
                    case 4:
                        Boolean bool6 = Boolean.TRUE;
                        Boolean bool7 = Boolean.FALSE;
                        listH = C1850q.h(bool6, bool7, bool7, bool6, bool7, bool7, bool6, bool7, bool6, bool7);
                        break;
                    case 5:
                        Boolean bool8 = Boolean.TRUE;
                        Boolean bool9 = Boolean.FALSE;
                        listH = C1850q.h(bool8, bool9, bool8, bool9, bool8, bool9, bool8, bool9, bool8, bool9);
                        break;
                    case 6:
                        Boolean bool10 = Boolean.TRUE;
                        Boolean bool11 = Boolean.FALSE;
                        listH = C1850q.h(bool10, bool10, bool11, bool10, bool11, bool10, bool11, bool10, bool10, bool11);
                        break;
                    case 7:
                        Boolean bool12 = Boolean.TRUE;
                        Boolean bool13 = Boolean.FALSE;
                        listH = C1850q.h(bool12, bool12, bool13, bool12, bool12, bool13, bool12, bool12, bool13, bool12);
                        break;
                    case 8:
                        Boolean bool14 = Boolean.TRUE;
                        Boolean bool15 = Boolean.FALSE;
                        listH = C1850q.h(bool14, bool14, bool14, bool15, bool14, bool14, bool14, bool15, bool14, bool14);
                        break;
                    case 9:
                        Boolean bool16 = Boolean.TRUE;
                        listH = C1850q.h(bool16, bool16, bool16, bool16, bool16, Boolean.FALSE, bool16, bool16, bool16, bool16);
                        break;
                    default:
                        Boolean bool17 = Boolean.TRUE;
                        listH = C1850q.h(bool17, bool17, bool17, bool17, bool17, bool17, bool17, bool17, bool17, bool17);
                        break;
                }
                zBooleanValue = ((Boolean) listH.get(andIncrement % 10)).booleanValue();
            }
        }
        try {
            if (zBooleanValue) {
                F6.d.h("CronetWrapInterceptor", 3, "intercept use Cronet " + this.f43728f);
                atomicInteger2.incrementAndGet();
                CronetInterceptor cronetInterceptor3 = this.f43723a;
                Intrinsics.e(cronetInterceptor3);
                e0VarProceed = cronetInterceptor3.intercept(chain);
            } else {
                F6.d.h("CronetWrapInterceptor", 3, "intercept use okhttp " + this.f43728f);
                atomicInteger.incrementAndGet();
                e0VarProceed = chain.proceed(chain.request());
            }
            Intrinsics.e(e0VarProceed);
            if (zBooleanValue) {
                F6.d.h("CronetWrapInterceptor", 3, G.m(atomicInteger2.decrementAndGet(), "Activate Cronet request count:"));
                return e0VarProceed;
            }
            F6.d.h("CronetWrapInterceptor", 3, G.m(atomicInteger.decrementAndGet(), "Activate okhttp request count:"));
            return e0VarProceed;
        } catch (Throwable th) {
            if (zBooleanValue) {
                F6.d.h("CronetWrapInterceptor", 3, G.m(atomicInteger2.decrementAndGet(), "Activate Cronet request count:"));
            } else {
                F6.d.h("CronetWrapInterceptor", 3, G.m(atomicInteger.decrementAndGet(), "Activate okhttp request count:"));
            }
            throw th;
        }
    }
}

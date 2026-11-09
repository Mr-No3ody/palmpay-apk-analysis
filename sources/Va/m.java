package Va;

import com.transsnet.palmpay.core.web.PWebActivity;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.x;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static volatile Function1 f10266l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PWebActivity f10267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f10271e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f10272f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f10273g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f10274h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f10275i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f10276j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10277k;

    static {
        new l(null);
    }

    public m(PWebActivity activity, long j6, boolean z3) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f10267a = activity;
        this.f10268b = j6;
        this.f10269c = z3;
        this.f10272f = -1L;
    }

    public static double a(String str) {
        Double dE = x.e(str);
        double dDoubleValue = dE != null ? dE.doubleValue() : -1.0d;
        if (Math.abs(dDoubleValue) > Double.MAX_VALUE || dDoubleValue < 0.0d) {
            return -1.0d;
        }
        return dDoubleValue;
    }

    public static long b(double d2) {
        if (Math.abs(d2) > Double.MAX_VALUE || d2 < 0.0d) {
            return -1L;
        }
        return Nf.b.c(d2);
    }
}

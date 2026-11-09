package okhttp3;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: okhttp3.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1943k {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C1942j f40923n = new C1942j(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C1943k f40924o = new C1943k(true, false, -1, -1, false, false, false, -1, -1, false, false, false, null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C1943k f40925p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f40926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f40927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f40928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f40929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f40930e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f40931f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f40932g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f40933h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f40934i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f40935j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f40936k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f40937l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f40938m;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        long seconds = timeUnit.toSeconds(Integer.MAX_VALUE);
        f40925p = new C1943k(false, false, -1, -1, false, false, false, seconds <= 2147483647L ? (int) seconds : Integer.MAX_VALUE, -1, true, false, false, null);
    }

    public C1943k(boolean z3, boolean z8, int i7, int i10, boolean z10, boolean z11, boolean z12, int i11, int i12, boolean z13, boolean z14, boolean z15, String str) {
        this.f40926a = z3;
        this.f40927b = z8;
        this.f40928c = i7;
        this.f40929d = i10;
        this.f40930e = z10;
        this.f40931f = z11;
        this.f40932g = z12;
        this.f40933h = i11;
        this.f40934i = i12;
        this.f40935j = z13;
        this.f40936k = z14;
        this.f40937l = z15;
        this.f40938m = str;
    }

    public final String toString() {
        String str = this.f40938m;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f40926a) {
            sb2.append("no-cache, ");
        }
        if (this.f40927b) {
            sb2.append("no-store, ");
        }
        int i7 = this.f40928c;
        if (i7 != -1) {
            sb2.append("max-age=");
            sb2.append(i7);
            sb2.append(", ");
        }
        int i10 = this.f40929d;
        if (i10 != -1) {
            sb2.append("s-maxage=");
            sb2.append(i10);
            sb2.append(", ");
        }
        if (this.f40930e) {
            sb2.append("private, ");
        }
        if (this.f40931f) {
            sb2.append("public, ");
        }
        if (this.f40932g) {
            sb2.append("must-revalidate, ");
        }
        int i11 = this.f40933h;
        if (i11 != -1) {
            sb2.append("max-stale=");
            sb2.append(i11);
            sb2.append(", ");
        }
        int i12 = this.f40934i;
        if (i12 != -1) {
            sb2.append("min-fresh=");
            sb2.append(i12);
            sb2.append(", ");
        }
        if (this.f40935j) {
            sb2.append("only-if-cached, ");
        }
        if (this.f40936k) {
            sb2.append("no-transform, ");
        }
        if (this.f40937l) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        sb2.delete(sb2.length() - 2, sb2.length());
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        this.f40938m = string;
        return string;
    }
}

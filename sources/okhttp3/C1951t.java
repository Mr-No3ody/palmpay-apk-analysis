package okhttp3;

import N8.q0;
import com.alibaba.android.arouter.utils.Consts;
import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: okhttp3.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1951t {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C1950s f40977j = new C1950s(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f40978k = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Pattern f40979l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f40980m = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Pattern f40981n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f40983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f40984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f40985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f40986e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f40987f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f40988g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f40989h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f40990i;

    public C1951t(String str, String str2, long j6, String str3, String str4, boolean z3, boolean z8, boolean z10, boolean z11) {
        this.f40982a = str;
        this.f40983b = str2;
        this.f40984c = j6;
        this.f40985d = str3;
        this.f40986e = str4;
        this.f40987f = z3;
        this.f40988g = z8;
        this.f40989h = z10;
        this.f40990i = z11;
    }

    public final String a(boolean z3) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f40982a);
        sb2.append('=');
        sb2.append(this.f40983b);
        if (this.f40989h) {
            long j6 = this.f40984c;
            if (j6 == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                Date date = new Date(j6);
                Hg.c cVar = Hg.d.f3930a;
                Intrinsics.checkNotNullParameter(date, "<this>");
                String str = ((DateFormat) Hg.d.f3930a.get()).format(date);
                Intrinsics.checkNotNullExpressionValue(str, "STANDARD_DATE_FORMAT.get().format(this)");
                sb2.append(str);
            }
        }
        if (!this.f40990i) {
            sb2.append("; domain=");
            if (z3) {
                sb2.append(Consts.DOT);
            }
            sb2.append(this.f40985d);
        }
        sb2.append("; path=");
        sb2.append(this.f40986e);
        if (this.f40987f) {
            sb2.append("; secure");
        }
        if (this.f40988g) {
            sb2.append("; httponly");
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString()");
        return string;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1951t)) {
            return false;
        }
        C1951t c1951t = (C1951t) obj;
        return Intrinsics.c(c1951t.f40982a, this.f40982a) && Intrinsics.c(c1951t.f40983b, this.f40983b) && c1951t.f40984c == this.f40984c && Intrinsics.c(c1951t.f40985d, this.f40985d) && Intrinsics.c(c1951t.f40986e, this.f40986e) && c1951t.f40987f == this.f40987f && c1951t.f40988g == this.f40988g && c1951t.f40989h == this.f40989h && c1951t.f40990i == this.f40990i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f40990i) + androidx.camera.video.u.d(androidx.camera.video.u.d(androidx.camera.video.u.d(C0.G.c(C0.G.c(q0.b(C0.G.c(C0.G.c(527, 31, this.f40982a), 31, this.f40983b), 31, this.f40984c), 31, this.f40985d), 31, this.f40986e), 31, this.f40987f), 31, this.f40988g), 31, this.f40989h);
    }

    public final String toString() {
        return a(false);
    }
}

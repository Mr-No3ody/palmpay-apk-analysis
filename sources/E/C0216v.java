package E;

/* JADX INFO: renamed from: E.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0216v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0216v f2121c = new C0216v(0, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0216v f2122d = new C0216v(1, 8);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0216v f2123e = new C0216v(3, 10);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0216v f2124f = new C0216v(4, 10);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0216v f2125g = new C0216v(5, 10);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C0216v f2126h = new C0216v(6, 10);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C0216v f2127i = new C0216v(6, 8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2129b;

    public C0216v(int i7, int i10) {
        this.f2128a = i7;
        this.f2129b = i10;
    }

    public final boolean a() {
        return b() && this.f2128a != 1 && this.f2129b == 10;
    }

    public final boolean b() {
        int i7 = this.f2128a;
        return (i7 == 0 || i7 == 2 || this.f2129b == 0) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0216v) {
            C0216v c0216v = (C0216v) obj;
            if (this.f2128a == c0216v.f2128a && this.f2129b == c0216v.f2129b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f2128a ^ 1000003) * 1000003) ^ this.f2129b;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DynamicRange@");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("{encoding=");
        switch (this.f2128a) {
            case 0:
                str = "UNSPECIFIED";
                break;
            case 1:
                str = "SDR";
                break;
            case 2:
                str = "HDR_UNSPECIFIED";
                break;
            case 3:
                str = "HLG";
                break;
            case 4:
                str = "HDR10";
                break;
            case 5:
                str = "HDR10_PLUS";
                break;
            case 6:
                str = "DOLBY_VISION";
                break;
            default:
                str = "<Unknown>";
                break;
        }
        sb2.append(str);
        sb2.append(", bitDepth=");
        return C0.G.n(this.f2129b, "}", sb2);
    }
}

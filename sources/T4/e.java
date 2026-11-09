package T4;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e f8946j = new e(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final e f8947k = new e(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final e f8948l = new e(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final e f8949m = new e(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f8950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f8951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f8952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f8953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f8954e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f8955f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f8956g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final double f8957h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final double f8958i;

    public e(double d2, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        this.f8950a = d13;
        this.f8951b = d14;
        this.f8952c = d15;
        this.f8953d = d2;
        this.f8954e = d10;
        this.f8955f = d11;
        this.f8956g = d12;
        this.f8957h = d16;
        this.f8958i = d17;
    }

    public static e a(ByteBuffer byteBuffer) {
        double dF = V1.a.f(byteBuffer);
        double dF2 = V1.a.f(byteBuffer);
        double dE = V1.a.e(byteBuffer);
        return new e(dF, dF2, V1.a.f(byteBuffer), V1.a.f(byteBuffer), dE, V1.a.e(byteBuffer), V1.a.e(byteBuffer), V1.a.f(byteBuffer), V1.a.f(byteBuffer));
    }

    public final void b(ByteBuffer byteBuffer) {
        V1.a.o(byteBuffer, this.f8953d);
        V1.a.o(byteBuffer, this.f8954e);
        V1.a.n(byteBuffer, this.f8950a);
        V1.a.o(byteBuffer, this.f8955f);
        V1.a.o(byteBuffer, this.f8956g);
        V1.a.n(byteBuffer, this.f8951b);
        V1.a.o(byteBuffer, this.f8957h);
        V1.a.o(byteBuffer, this.f8958i);
        V1.a.n(byteBuffer, this.f8952c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return Double.compare(eVar.f8953d, this.f8953d) == 0 && Double.compare(eVar.f8954e, this.f8954e) == 0 && Double.compare(eVar.f8955f, this.f8955f) == 0 && Double.compare(eVar.f8956g, this.f8956g) == 0 && Double.compare(eVar.f8957h, this.f8957h) == 0 && Double.compare(eVar.f8958i, this.f8958i) == 0 && Double.compare(eVar.f8950a, this.f8950a) == 0 && Double.compare(eVar.f8951b, this.f8951b) == 0 && Double.compare(eVar.f8952c, this.f8952c) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f8950a);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f8951b);
        int i7 = (((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.f8952c);
        int i10 = (i7 * 31) + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)));
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.f8953d);
        int i11 = (i10 * 31) + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)));
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.f8954e);
        int i12 = (i11 * 31) + ((int) (jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32)));
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.f8955f);
        int i13 = (i12 * 31) + ((int) (jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32)));
        long jDoubleToLongBits7 = Double.doubleToLongBits(this.f8956g);
        int i14 = (i13 * 31) + ((int) (jDoubleToLongBits7 ^ (jDoubleToLongBits7 >>> 32)));
        long jDoubleToLongBits8 = Double.doubleToLongBits(this.f8957h);
        int i15 = (i14 * 31) + ((int) (jDoubleToLongBits8 ^ (jDoubleToLongBits8 >>> 32)));
        long jDoubleToLongBits9 = Double.doubleToLongBits(this.f8958i);
        return (i15 * 31) + ((int) ((jDoubleToLongBits9 >>> 32) ^ jDoubleToLongBits9));
    }

    public final String toString() {
        if (equals(f8946j)) {
            return "Rotate 0°";
        }
        if (equals(f8947k)) {
            return "Rotate 90°";
        }
        if (equals(f8948l)) {
            return "Rotate 180°";
        }
        if (equals(f8949m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f8950a + ", v=" + this.f8951b + ", w=" + this.f8952c + ", a=" + this.f8953d + ", b=" + this.f8954e + ", c=" + this.f8955f + ", d=" + this.f8956g + ", tx=" + this.f8957h + ", ty=" + this.f8958i + '}';
    }
}

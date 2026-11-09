package androidx.datastore.preferences.protobuf;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1126o extends r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f16708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16711f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f16712g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f16713h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f16714i = Integer.MAX_VALUE;

    public C1126o(byte[] bArr, int i7, int i10, boolean z3) {
        this.f16708c = bArr;
        this.f16709d = i10 + i7;
        this.f16711f = i7;
        this.f16712g = i7;
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final int A() throws C1160z1 {
        if (e()) {
            this.f16713h = 0;
            return 0;
        }
        int iH = H();
        this.f16713h = iH;
        if ((iH >>> 3) != 0) {
            return iH;
        }
        throw C1160z1.a();
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final int B() {
        return H();
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final long C() {
        return I();
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final boolean D(int i7) throws C1160z1 {
        int i10 = i7 & 7;
        int i11 = 0;
        if (i10 != 0) {
            if (i10 == 1) {
                L(8);
                return true;
            }
            if (i10 == 2) {
                L(H());
                return true;
            }
            if (i10 == 3) {
                E();
                a(((i7 >>> 3) << 3) | 4);
                return true;
            }
            if (i10 == 4) {
                return false;
            }
            if (i10 != 5) {
                throw C1160z1.c();
            }
            L(4);
            return true;
        }
        int i12 = this.f16709d - this.f16711f;
        byte[] bArr = this.f16708c;
        if (i12 >= 10) {
            while (i11 < 10) {
                int i13 = this.f16711f;
                this.f16711f = i13 + 1;
                if (bArr[i13] < 0) {
                    i11++;
                }
            }
            throw C1160z1.d();
        }
        while (i11 < 10) {
            int i14 = this.f16711f;
            if (i14 == this.f16709d) {
                throw C1160z1.g();
            }
            this.f16711f = i14 + 1;
            if (bArr[i14] < 0) {
                i11++;
            }
        }
        throw C1160z1.d();
        return true;
    }

    public final int F() throws C1160z1 {
        int i7 = this.f16711f;
        if (this.f16709d - i7 < 4) {
            throw C1160z1.g();
        }
        this.f16711f = i7 + 4;
        byte[] bArr = this.f16708c;
        return ((bArr[i7 + 3] & UnsignedBytes.MAX_VALUE) << 24) | (bArr[i7] & UnsignedBytes.MAX_VALUE) | ((bArr[i7 + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i7 + 2] & UnsignedBytes.MAX_VALUE) << 16);
    }

    public final long G() throws C1160z1 {
        int i7 = this.f16711f;
        if (this.f16709d - i7 < 8) {
            throw C1160z1.g();
        }
        this.f16711f = i7 + 8;
        byte[] bArr = this.f16708c;
        return ((((long) bArr[i7 + 7]) & 255) << 56) | (((long) bArr[i7]) & 255) | ((((long) bArr[i7 + 1]) & 255) << 8) | ((((long) bArr[i7 + 2]) & 255) << 16) | ((((long) bArr[i7 + 3]) & 255) << 24) | ((((long) bArr[i7 + 4]) & 255) << 32) | ((((long) bArr[i7 + 5]) & 255) << 40) | ((((long) bArr[i7 + 6]) & 255) << 48);
    }

    public final int H() {
        int i7;
        int i10 = this.f16711f;
        int i11 = this.f16709d;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f16708c;
            byte b7 = bArr[i10];
            if (b7 >= 0) {
                this.f16711f = i12;
                return b7;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b7;
                if (i14 < 0) {
                    i7 = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << Ascii.SO) ^ i14;
                    if (i16 >= 0) {
                        i7 = i16 ^ 16256;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << Ascii.NAK);
                        if (i18 < 0) {
                            i7 = (-2080896) ^ i18;
                        } else {
                            i15 = i10 + 5;
                            byte b10 = bArr[i17];
                            int i19 = (i18 ^ (b10 << Ascii.FS)) ^ 266354560;
                            if (b10 < 0) {
                                i17 = i10 + 6;
                                if (bArr[i15] < 0) {
                                    i15 = i10 + 7;
                                    if (bArr[i17] < 0) {
                                        i17 = i10 + 8;
                                        if (bArr[i15] < 0) {
                                            i15 = i10 + 9;
                                            if (bArr[i17] < 0) {
                                                int i20 = i10 + 10;
                                                if (bArr[i15] >= 0) {
                                                    i13 = i20;
                                                    i7 = i19;
                                                }
                                            }
                                        }
                                    }
                                }
                                i7 = i19;
                            }
                            i7 = i19;
                        }
                        i13 = i17;
                    }
                    i13 = i15;
                }
                this.f16711f = i13;
                return i7;
            }
        }
        return (int) J();
    }

    public final long I() {
        long j6;
        long j10;
        long j11;
        long j12;
        int i7 = this.f16711f;
        int i10 = this.f16709d;
        if (i10 != i7) {
            int i11 = i7 + 1;
            byte[] bArr = this.f16708c;
            byte b7 = bArr[i7];
            if (b7 >= 0) {
                this.f16711f = i11;
                return b7;
            }
            if (i10 - i11 >= 9) {
                int i12 = i7 + 2;
                int i13 = (bArr[i11] << 7) ^ b7;
                if (i13 < 0) {
                    j6 = i13 ^ (-128);
                } else {
                    int i14 = i7 + 3;
                    int i15 = (bArr[i12] << Ascii.SO) ^ i13;
                    if (i15 >= 0) {
                        j6 = i15 ^ 16256;
                        i12 = i14;
                    } else {
                        int i16 = i7 + 4;
                        int i17 = i15 ^ (bArr[i14] << Ascii.NAK);
                        if (i17 < 0) {
                            j12 = (-2080896) ^ i17;
                        } else {
                            long j13 = i17;
                            i12 = i7 + 5;
                            long j14 = j13 ^ (((long) bArr[i16]) << 28);
                            if (j14 >= 0) {
                                j11 = 266354560;
                            } else {
                                i16 = i7 + 6;
                                long j15 = j14 ^ (((long) bArr[i12]) << 35);
                                if (j15 < 0) {
                                    j10 = -34093383808L;
                                } else {
                                    i12 = i7 + 7;
                                    j14 = j15 ^ (((long) bArr[i16]) << 42);
                                    if (j14 >= 0) {
                                        j11 = 4363953127296L;
                                    } else {
                                        i16 = i7 + 8;
                                        j15 = j14 ^ (((long) bArr[i12]) << 49);
                                        if (j15 < 0) {
                                            j10 = -558586000294016L;
                                        } else {
                                            i12 = i7 + 9;
                                            long j16 = (j15 ^ (((long) bArr[i16]) << 56)) ^ 71499008037633920L;
                                            if (j16 < 0) {
                                                int i18 = i7 + 10;
                                                if (bArr[i12] >= 0) {
                                                    i12 = i18;
                                                }
                                            }
                                            j6 = j16;
                                        }
                                    }
                                }
                                j12 = j10 ^ j15;
                            }
                            j6 = j11 ^ j14;
                        }
                        i12 = i16;
                        j6 = j12;
                    }
                }
                this.f16711f = i12;
                return j6;
            }
        }
        return J();
    }

    public final long J() throws C1160z1 {
        long j6 = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            int i10 = this.f16711f;
            if (i10 == this.f16709d) {
                throw C1160z1.g();
            }
            this.f16711f = i10 + 1;
            byte b7 = this.f16708c[i10];
            j6 |= ((long) (b7 & Ascii.DEL)) << i7;
            if ((b7 & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                return j6;
            }
        }
        throw C1160z1.d();
    }

    public final void K() {
        int i7 = this.f16709d + this.f16710e;
        this.f16709d = i7;
        int i10 = i7 - this.f16712g;
        int i11 = this.f16714i;
        if (i10 <= i11) {
            this.f16710e = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f16710e = i12;
        this.f16709d = i7 - i12;
    }

    public final void L(int i7) throws C1160z1 {
        if (i7 >= 0) {
            int i10 = this.f16709d;
            int i11 = this.f16711f;
            if (i7 <= i10 - i11) {
                this.f16711f = i11 + i7;
                return;
            }
        }
        if (i7 >= 0) {
            throw C1160z1.g();
        }
        throw C1160z1.e();
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final void a(int i7) throws C1160z1 {
        if (this.f16713h != i7) {
            throw new C1160z1("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final int d() {
        return this.f16711f - this.f16712g;
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final boolean e() {
        return this.f16711f == this.f16709d;
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final void i(int i7) {
        this.f16714i = i7;
        K();
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final int j(int i7) throws C1160z1 {
        if (i7 < 0) {
            throw C1160z1.e();
        }
        int iD = d() + i7;
        if (iD < 0) {
            throw C1160z1.f();
        }
        int i10 = this.f16714i;
        if (iD > i10) {
            throw C1160z1.g();
        }
        this.f16714i = iD;
        K();
        return i10;
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final boolean k() {
        return I() != 0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    @Override // androidx.datastore.preferences.protobuf.r
    public final C1120m l() throws C1160z1 {
        byte[] bArrCopyOfRange;
        int iH = H();
        byte[] bArr = this.f16708c;
        if (iH > 0) {
            int i7 = this.f16709d;
            int i10 = this.f16711f;
            if (iH <= i7 - i10) {
                C1120m c1120mC = AbstractC1123n.c(i10, iH, bArr);
                this.f16711f += iH;
                return c1120mC;
            }
        }
        if (iH == 0) {
            return AbstractC1123n.f16699b;
        }
        if (iH > 0) {
            int i11 = this.f16709d;
            int i12 = this.f16711f;
            if (iH <= i11 - i12) {
                int i13 = iH + i12;
                this.f16711f = i13;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i12, i13);
            } else {
                if (iH <= 0) {
                    throw C1160z1.g();
                }
                if (iH == 0) {
                    throw C1160z1.e();
                }
                bArrCopyOfRange = AbstractC1154x1.f16809b;
            }
        } else {
            if (iH <= 0) {
                throw C1160z1.g();
            }
            if (iH == 0) {
                throw C1160z1.e();
            }
            bArrCopyOfRange = AbstractC1154x1.f16809b;
        }
        C1120m c1120m = AbstractC1123n.f16699b;
        return new C1120m(bArrCopyOfRange);
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final double m() {
        return Double.longBitsToDouble(G());
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final int n() {
        return H();
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final int o() {
        return F();
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final long p() {
        return G();
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final float q() {
        return Float.intBitsToFloat(F());
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final int r() {
        return H();
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final long s() {
        return I();
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final int u() {
        return F();
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final long v() {
        return G();
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final int w() {
        return r.b(H());
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final long x() {
        return r.c(I());
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final String y() throws C1160z1 {
        int iH = H();
        if (iH > 0) {
            int i7 = this.f16709d;
            int i10 = this.f16711f;
            if (iH <= i7 - i10) {
                String str = new String(this.f16708c, i10, iH, AbstractC1154x1.f16808a);
                this.f16711f += iH;
                return str;
            }
        }
        if (iH == 0) {
            return "";
        }
        if (iH < 0) {
            throw C1160z1.e();
        }
        throw C1160z1.g();
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final String z() throws C1160z1 {
        int iH = H();
        if (iH > 0) {
            int i7 = this.f16709d;
            int i10 = this.f16711f;
            if (iH <= i7 - i10) {
                String strI = z2.f16817a.i(this.f16708c, i10, iH);
                this.f16711f += iH;
                return strI;
            }
        }
        if (iH == 0) {
            return "";
        }
        if (iH <= 0) {
            throw C1160z1.e();
        }
        throw C1160z1.g();
    }
}

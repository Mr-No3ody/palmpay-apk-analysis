package androidx.datastore.preferences.protobuf;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1132q extends r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ByteBuffer f16736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f16737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f16738e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f16739f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f16740g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f16741h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f16742i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f16743j = Integer.MAX_VALUE;

    public C1132q(ByteBuffer byteBuffer, boolean z3) {
        this.f16736c = byteBuffer;
        long j6 = w2.f16802c.j(byteBuffer, w2.f16806g);
        this.f16737d = j6;
        this.f16738e = ((long) byteBuffer.limit()) + j6;
        long jPosition = j6 + ((long) byteBuffer.position());
        this.f16739f = jPosition;
        this.f16740g = jPosition;
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final int A() throws C1160z1 {
        if (e()) {
            this.f16742i = 0;
            return 0;
        }
        int iH = H();
        this.f16742i = iH;
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
        if (((int) (this.f16738e - this.f16739f)) >= 10) {
            while (i11 < 10) {
                long j6 = this.f16739f;
                this.f16739f = j6 + 1;
                if (w2.f16802c.e(j6) < 0) {
                    i11++;
                }
            }
            throw C1160z1.d();
        }
        while (i11 < 10) {
            long j10 = this.f16739f;
            if (j10 == this.f16738e) {
                throw C1160z1.g();
            }
            this.f16739f = j10 + 1;
            if (w2.f16802c.e(j10) < 0) {
                i11++;
            }
        }
        throw C1160z1.d();
        return true;
    }

    public final int F() throws C1160z1 {
        long j6 = this.f16739f;
        if (this.f16738e - j6 < 4) {
            throw C1160z1.g();
        }
        this.f16739f = 4 + j6;
        v2 v2Var = w2.f16802c;
        return ((v2Var.e(j6 + 3) & UnsignedBytes.MAX_VALUE) << 24) | (v2Var.e(j6) & UnsignedBytes.MAX_VALUE) | ((v2Var.e(1 + j6) & UnsignedBytes.MAX_VALUE) << 8) | ((v2Var.e(2 + j6) & UnsignedBytes.MAX_VALUE) << 16);
    }

    public final long G() throws C1160z1 {
        long j6 = this.f16739f;
        if (this.f16738e - j6 < 8) {
            throw C1160z1.g();
        }
        this.f16739f = 8 + j6;
        v2 v2Var = w2.f16802c;
        return ((((long) v2Var.e(j6 + 7)) & 255) << 56) | (((long) v2Var.e(j6)) & 255) | ((((long) v2Var.e(1 + j6)) & 255) << 8) | ((((long) v2Var.e(2 + j6)) & 255) << 16) | ((((long) v2Var.e(3 + j6)) & 255) << 24) | ((((long) v2Var.e(4 + j6)) & 255) << 32) | ((((long) v2Var.e(5 + j6)) & 255) << 40) | ((((long) v2Var.e(6 + j6)) & 255) << 48);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0099 A[PHI: r6
      0x0099: PHI (r6v7 long) = (r6v6 long), (r6v8 long), (r6v10 long) binds: [B:25:0x006d, B:29:0x0080, B:33:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
    
        if (r4.e(r8) < 0) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int H() {
        /*
            r12 = this;
            long r0 = r12.f16739f
            long r2 = r12.f16738e
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            goto L93
        La:
            r2 = 1
            long r2 = r2 + r0
            androidx.datastore.preferences.protobuf.v2 r4 = androidx.datastore.preferences.protobuf.w2.f16802c
            byte r5 = r4.e(r0)
            if (r5 < 0) goto L18
            r12.f16739f = r2
            return r5
        L18:
            long r6 = r12.f16738e
            long r6 = r6 - r2
            r8 = 9
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 >= 0) goto L23
            goto L93
        L23:
            r6 = 2
            long r6 = r6 + r0
            byte r2 = r4.e(r2)
            int r2 = r2 << 7
            r2 = r2 ^ r5
            if (r2 >= 0) goto L33
            r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
            goto La0
        L33:
            r10 = 3
            long r10 = r10 + r0
            byte r3 = r4.e(r6)
            int r3 = r3 << 14
            r2 = r2 ^ r3
            if (r2 < 0) goto L43
            r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
        L41:
            r6 = r10
            goto La0
        L43:
            r5 = 4
            long r6 = r0 + r5
            byte r3 = r4.e(r10)
            int r3 = r3 << 21
            r2 = r2 ^ r3
            if (r2 >= 0) goto L55
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto La0
        L55:
            r10 = 5
            long r10 = r10 + r0
            byte r3 = r4.e(r6)
            int r5 = r3 << 28
            r2 = r2 ^ r5
            r5 = 266354560(0xfe03f80, float:2.2112565E-29)
            r2 = r2 ^ r5
            if (r3 >= 0) goto L9e
            r5 = 6
            long r6 = r0 + r5
            byte r3 = r4.e(r10)
            if (r3 >= 0) goto L99
            r10 = 7
            long r10 = r10 + r0
            byte r3 = r4.e(r6)
            if (r3 >= 0) goto L9e
            r5 = 8
            long r6 = r0 + r5
            byte r3 = r4.e(r10)
            if (r3 >= 0) goto L99
            long r8 = r8 + r0
            byte r3 = r4.e(r6)
            if (r3 >= 0) goto L9b
            r5 = 10
            long r6 = r0 + r5
            byte r0 = r4.e(r8)
            if (r0 >= 0) goto L99
        L93:
            long r0 = r12.J()
            int r0 = (int) r0
            return r0
        L99:
            r0 = r2
            goto La0
        L9b:
            r0 = r2
            r6 = r8
            goto La0
        L9e:
            r0 = r2
            goto L41
        La0:
            r12.f16739f = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C1132q.H():int");
    }

    public final long I() {
        long j6;
        long j10;
        long j11;
        int i7;
        long j12 = this.f16739f;
        if (this.f16738e != j12) {
            long j13 = 1 + j12;
            v2 v2Var = w2.f16802c;
            byte bE = v2Var.e(j12);
            if (bE >= 0) {
                this.f16739f = j13;
                return bE;
            }
            if (this.f16738e - j13 >= 9) {
                long j14 = 2 + j12;
                int iE = (v2Var.e(j13) << 7) ^ bE;
                if (iE >= 0) {
                    long j15 = 3 + j12;
                    int iE2 = iE ^ (v2Var.e(j14) << Ascii.SO);
                    if (iE2 < 0) {
                        j14 = j12 + 4;
                        int iE3 = iE2 ^ (v2Var.e(j15) << Ascii.NAK);
                        if (iE3 < 0) {
                            i7 = (-2080896) ^ iE3;
                        } else {
                            j15 = 5 + j12;
                            long jE = ((long) iE3) ^ (((long) v2Var.e(j14)) << 28);
                            if (jE >= 0) {
                                j11 = 266354560;
                            } else {
                                long j16 = 6 + j12;
                                long jE2 = jE ^ (((long) v2Var.e(j15)) << 35);
                                if (jE2 < 0) {
                                    j10 = -34093383808L;
                                } else {
                                    j15 = 7 + j12;
                                    jE = jE2 ^ (((long) v2Var.e(j16)) << 42);
                                    if (jE >= 0) {
                                        j11 = 4363953127296L;
                                    } else {
                                        j16 = 8 + j12;
                                        jE2 = jE ^ (((long) v2Var.e(j15)) << 49);
                                        if (jE2 < 0) {
                                            j10 = -558586000294016L;
                                        } else {
                                            long j17 = j12 + 9;
                                            long jE3 = (jE2 ^ (((long) v2Var.e(j16)) << 56)) ^ 71499008037633920L;
                                            if (jE3 < 0) {
                                                long j18 = j12 + 10;
                                                if (v2Var.e(j17) >= 0) {
                                                    j14 = j18;
                                                    j6 = jE3;
                                                }
                                            } else {
                                                j6 = jE3;
                                                j14 = j17;
                                            }
                                        }
                                    }
                                }
                                j6 = j10 ^ jE2;
                                j14 = j16;
                            }
                            j6 = j11 ^ jE;
                        }
                        this.f16739f = j14;
                        return j6;
                    }
                    j6 = iE2 ^ 16256;
                    j14 = j15;
                    this.f16739f = j14;
                    return j6;
                }
                i7 = iE ^ (-128);
                j6 = i7;
                this.f16739f = j14;
                return j6;
            }
        }
        return J();
    }

    public final long J() throws C1160z1 {
        long j6 = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            long j10 = this.f16739f;
            if (j10 == this.f16738e) {
                throw C1160z1.g();
            }
            this.f16739f = 1 + j10;
            byte bE = w2.f16802c.e(j10);
            j6 |= ((long) (bE & Ascii.DEL)) << i7;
            if ((bE & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                return j6;
            }
        }
        throw C1160z1.d();
    }

    public final void K() {
        long j6 = this.f16738e + ((long) this.f16741h);
        this.f16738e = j6;
        int i7 = (int) (j6 - this.f16740g);
        int i10 = this.f16743j;
        if (i7 <= i10) {
            this.f16741h = 0;
            return;
        }
        int i11 = i7 - i10;
        this.f16741h = i11;
        this.f16738e = j6 - ((long) i11);
    }

    public final void L(int i7) throws C1160z1 {
        if (i7 >= 0) {
            long j6 = this.f16738e;
            long j10 = this.f16739f;
            if (i7 <= ((int) (j6 - j10))) {
                this.f16739f = j10 + ((long) i7);
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
        if (this.f16742i != i7) {
            throw new C1160z1("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final int d() {
        return (int) (this.f16739f - this.f16740g);
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final boolean e() {
        return this.f16739f == this.f16738e;
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final void i(int i7) {
        this.f16743j = i7;
        K();
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final int j(int i7) throws C1160z1 {
        if (i7 < 0) {
            throw C1160z1.e();
        }
        int iD = d() + i7;
        int i10 = this.f16743j;
        if (iD > i10) {
            throw C1160z1.g();
        }
        this.f16743j = iD;
        K();
        return i10;
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final boolean k() {
        return I() != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final C1120m l() throws C1160z1 {
        int iH = H();
        if (iH > 0) {
            long j6 = this.f16738e;
            long j10 = this.f16739f;
            if (iH <= ((int) (j6 - j10))) {
                byte[] bArr = new byte[iH];
                long j11 = iH;
                w2.f16802c.c(j10, bArr, j11);
                this.f16739f += j11;
                C1120m c1120m = AbstractC1123n.f16699b;
                return new C1120m(bArr);
            }
        }
        if (iH == 0) {
            return AbstractC1123n.f16699b;
        }
        if (iH < 0) {
            throw C1160z1.e();
        }
        throw C1160z1.g();
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
            long j6 = this.f16738e;
            long j10 = this.f16739f;
            if (iH <= ((int) (j6 - j10))) {
                byte[] bArr = new byte[iH];
                long j11 = iH;
                w2.f16802c.c(j10, bArr, j11);
                String str = new String(bArr, AbstractC1154x1.f16808a);
                this.f16739f += j11;
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
        String strK;
        int iH = H();
        if (iH > 0) {
            long j6 = this.f16738e;
            long j10 = this.f16739f;
            if (iH <= ((int) (j6 - j10))) {
                int i7 = (int) (j10 - this.f16737d);
                AbstractC1102h abstractC1102h = z2.f16817a;
                abstractC1102h.getClass();
                ByteBuffer byteBuffer = this.f16736c;
                if (byteBuffer.hasArray()) {
                    strK = abstractC1102h.i(byteBuffer.array(), byteBuffer.arrayOffset() + i7, iH);
                } else {
                    strK = byteBuffer.isDirect() ? abstractC1102h.k(byteBuffer, i7, iH) : AbstractC1102h.j(byteBuffer, i7, iH);
                }
                this.f16739f += (long) iH;
                return strK;
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

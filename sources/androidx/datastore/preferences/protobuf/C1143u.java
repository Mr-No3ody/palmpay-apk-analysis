package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1143u extends AbstractC1146v {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f16780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f16781e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16782f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final OutputStream f16783g;

    public C1143u(OutputStream outputStream, int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i7, 20);
        this.f16780d = new byte[iMax];
        this.f16781e = iMax;
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.f16783g = outputStream;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1146v
    public final void G(byte b7) {
        if (this.f16782f == this.f16781e) {
            i0();
        }
        int i7 = this.f16782f;
        this.f16782f = i7 + 1;
        this.f16780d[i7] = b7;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1146v
    public final void H(int i7, boolean z3) {
        j0(11);
        f0(i7, 0);
        byte b7 = z3 ? (byte) 1 : (byte) 0;
        int i10 = this.f16782f;
        this.f16782f = i10 + 1;
        this.f16780d[i10] = b7;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1146v
    public final void I(int i7, byte[] bArr) throws IOException {
        a0(i7);
        k0(bArr, 0, i7);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1146v
    public final void J(int i7, AbstractC1123n abstractC1123n) {
        Y(i7, 2);
        K(abstractC1123n);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1146v
    public final void K(AbstractC1123n abstractC1123n) {
        a0(abstractC1123n.size());
        abstractC1123n.j(this);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1146v
    public final void L(int i7, int i10) {
        j0(14);
        f0(i7, 5);
        d0(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1146v
    public final void M(int i7) {
        j0(4);
        d0(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1146v
    public final void N(int i7, long j6) {
        j0(18);
        f0(i7, 1);
        e0(j6);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1146v
    public final void O(long j6) {
        j0(8);
        e0(j6);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1146v
    public final void P(int i7, int i10) {
        j0(20);
        f0(i7, 0);
        if (i10 >= 0) {
            g0(i10);
        } else {
            h0(i10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1146v
    public final void Q(int i7) {
        if (i7 >= 0) {
            a0(i7);
        } else {
            c0(i7);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1146v
    public final void R(int i7, MessageLite messageLite) throws IOException {
        Y(i7, 2);
        T(messageLite);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1146v
    public final void S(int i7, MessageLite messageLite, Schema schema) throws IOException {
        Y(i7, 2);
        a0(((AbstractC1078b) messageLite).b(schema));
        schema.writeTo(messageLite, this.f16786a);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1146v
    public final void T(MessageLite messageLite) throws IOException {
        a0(messageLite.getSerializedSize());
        messageLite.writeTo(this);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1146v
    public final void U(int i7, MessageLite messageLite) throws IOException {
        Y(1, 3);
        Z(2, i7);
        R(3, messageLite);
        Y(1, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1146v
    public final void V(int i7, AbstractC1123n abstractC1123n) {
        Y(1, 3);
        Z(2, i7);
        J(3, abstractC1123n);
        Y(1, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1146v
    public final void W(int i7, String str) throws IOException {
        Y(i7, 2);
        X(str);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1146v
    public final void X(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int iD = AbstractC1146v.D(length);
            int i7 = iD + length;
            int i10 = this.f16781e;
            if (i7 > i10) {
                byte[] bArr = new byte[length];
                int iP = z2.f16817a.p(str, bArr, 0, length);
                a0(iP);
                k0(bArr, 0, iP);
                return;
            }
            if (i7 > i10 - this.f16782f) {
                i0();
            }
            int iD2 = AbstractC1146v.D(str.length());
            int i11 = this.f16782f;
            byte[] bArr2 = this.f16780d;
            try {
                if (iD2 == iD) {
                    int i12 = i11 + iD2;
                    this.f16782f = i12;
                    int iP2 = z2.f16817a.p(str, bArr2, i12, i10 - i12);
                    this.f16782f = i11;
                    g0((iP2 - i11) - iD2);
                    this.f16782f = iP2;
                } else {
                    int iB = z2.b(str);
                    g0(iB);
                    this.f16782f = z2.f16817a.p(str, bArr2, this.f16782f, iB);
                }
            } catch (y2 e10) {
                this.f16782f = i11;
                throw e10;
            } catch (ArrayIndexOutOfBoundsException e11) {
                throw new Kf.d(e11);
            }
        } catch (y2 e12) {
            F(str, e12);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1146v
    public final void Y(int i7, int i10) {
        a0((i7 << 3) | i10);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1146v
    public final void Z(int i7, int i10) {
        j0(20);
        f0(i7, 0);
        g0(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1146v
    public final void a0(int i7) {
        j0(5);
        g0(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1146v
    public final void b0(int i7, long j6) {
        j0(20);
        f0(i7, 0);
        h0(j6);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1146v
    public final void c0(long j6) {
        j0(10);
        h0(j6);
    }

    public final void d0(int i7) {
        int i10 = this.f16782f;
        int i11 = i10 + 1;
        this.f16782f = i11;
        byte[] bArr = this.f16780d;
        bArr[i10] = (byte) (i7 & 255);
        int i12 = i10 + 2;
        this.f16782f = i12;
        bArr[i11] = (byte) ((i7 >> 8) & 255);
        int i13 = i10 + 3;
        this.f16782f = i13;
        bArr[i12] = (byte) ((i7 >> 16) & 255);
        this.f16782f = i10 + 4;
        bArr[i13] = (byte) ((i7 >> 24) & 255);
    }

    public final void e0(long j6) {
        int i7 = this.f16782f;
        int i10 = i7 + 1;
        this.f16782f = i10;
        byte[] bArr = this.f16780d;
        bArr[i7] = (byte) (j6 & 255);
        int i11 = i7 + 2;
        this.f16782f = i11;
        bArr[i10] = (byte) ((j6 >> 8) & 255);
        int i12 = i7 + 3;
        this.f16782f = i12;
        bArr[i11] = (byte) ((j6 >> 16) & 255);
        int i13 = i7 + 4;
        this.f16782f = i13;
        bArr[i12] = (byte) (255 & (j6 >> 24));
        int i14 = i7 + 5;
        this.f16782f = i14;
        bArr[i13] = (byte) (((int) (j6 >> 32)) & 255);
        int i15 = i7 + 6;
        this.f16782f = i15;
        bArr[i14] = (byte) (((int) (j6 >> 40)) & 255);
        int i16 = i7 + 7;
        this.f16782f = i16;
        bArr[i15] = (byte) (((int) (j6 >> 48)) & 255);
        this.f16782f = i7 + 8;
        bArr[i16] = (byte) (((int) (j6 >> 56)) & 255);
    }

    public final void f0(int i7, int i10) {
        g0((i7 << 3) | i10);
    }

    public final void g0(int i7) {
        boolean z3 = AbstractC1146v.f16785c;
        byte[] bArr = this.f16780d;
        if (z3) {
            while ((i7 & (-128)) != 0) {
                int i10 = this.f16782f;
                this.f16782f = i10 + 1;
                w2.k(bArr, i10, (byte) ((i7 | 128) & 255));
                i7 >>>= 7;
            }
            int i11 = this.f16782f;
            this.f16782f = i11 + 1;
            w2.k(bArr, i11, (byte) i7);
            return;
        }
        while ((i7 & (-128)) != 0) {
            int i12 = this.f16782f;
            this.f16782f = i12 + 1;
            bArr[i12] = (byte) ((i7 | 128) & 255);
            i7 >>>= 7;
        }
        int i13 = this.f16782f;
        this.f16782f = i13 + 1;
        bArr[i13] = (byte) i7;
    }

    public final void h0(long j6) {
        boolean z3 = AbstractC1146v.f16785c;
        byte[] bArr = this.f16780d;
        if (z3) {
            while ((j6 & (-128)) != 0) {
                int i7 = this.f16782f;
                this.f16782f = i7 + 1;
                w2.k(bArr, i7, (byte) ((((int) j6) | 128) & 255));
                j6 >>>= 7;
            }
            int i10 = this.f16782f;
            this.f16782f = i10 + 1;
            w2.k(bArr, i10, (byte) j6);
            return;
        }
        while ((j6 & (-128)) != 0) {
            int i11 = this.f16782f;
            this.f16782f = i11 + 1;
            bArr[i11] = (byte) ((((int) j6) | 128) & 255);
            j6 >>>= 7;
        }
        int i12 = this.f16782f;
        this.f16782f = i12 + 1;
        bArr[i12] = (byte) j6;
    }

    public final void i0() {
        this.f16783g.write(this.f16780d, 0, this.f16782f);
        this.f16782f = 0;
    }

    public final void j0(int i7) {
        if (this.f16781e - this.f16782f < i7) {
            i0();
        }
    }

    public final void k0(byte[] bArr, int i7, int i10) throws IOException {
        int i11 = this.f16782f;
        int i12 = this.f16781e;
        int i13 = i12 - i11;
        byte[] bArr2 = this.f16780d;
        if (i13 >= i10) {
            System.arraycopy(bArr, i7, bArr2, i11, i10);
            this.f16782f += i10;
            return;
        }
        System.arraycopy(bArr, i7, bArr2, i11, i13);
        int i14 = i7 + i13;
        int i15 = i10 - i13;
        this.f16782f = i12;
        i0();
        if (i15 > i12) {
            this.f16783g.write(bArr, i14, i15);
        } else {
            System.arraycopy(bArr, i14, bArr2, 0, i15);
            this.f16782f = i15;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1102h
    public final void w(byte[] bArr, int i7, int i10) throws IOException {
        k0(bArr, i7, i10);
    }
}

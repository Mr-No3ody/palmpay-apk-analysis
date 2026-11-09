package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1140t extends AbstractC1146v {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f16776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f16777e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16778f;

    public C1140t(byte[] bArr, int i7) {
        if (((bArr.length - i7) | i7) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i7)));
        }
        this.f16776d = bArr;
        this.f16778f = 0;
        this.f16777e = i7;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1146v
    public final void G(byte b7) throws Kf.d {
        try {
            byte[] bArr = this.f16776d;
            int i7 = this.f16778f;
            this.f16778f = i7 + 1;
            bArr[i7] = b7;
        } catch (IndexOutOfBoundsException e10) {
            throw new Kf.d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f16778f), Integer.valueOf(this.f16777e), 1), e10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1146v
    public final void H(int i7, boolean z3) throws Kf.d {
        Y(i7, 0);
        G(z3 ? (byte) 1 : (byte) 0);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1146v
    public final void I(int i7, byte[] bArr) throws Kf.d {
        a0(i7);
        e0(bArr, 0, i7);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1146v
    public final void J(int i7, AbstractC1123n abstractC1123n) throws Kf.d {
        Y(i7, 2);
        K(abstractC1123n);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1146v
    public final void K(AbstractC1123n abstractC1123n) throws Kf.d {
        a0(abstractC1123n.size());
        abstractC1123n.j(this);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1146v
    public final void L(int i7, int i10) throws Kf.d {
        Y(i7, 5);
        M(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1146v
    public final void M(int i7) throws Kf.d {
        try {
            byte[] bArr = this.f16776d;
            int i10 = this.f16778f;
            int i11 = i10 + 1;
            this.f16778f = i11;
            bArr[i10] = (byte) (i7 & 255);
            int i12 = i10 + 2;
            this.f16778f = i12;
            bArr[i11] = (byte) ((i7 >> 8) & 255);
            int i13 = i10 + 3;
            this.f16778f = i13;
            bArr[i12] = (byte) ((i7 >> 16) & 255);
            this.f16778f = i10 + 4;
            bArr[i13] = (byte) ((i7 >> 24) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new Kf.d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f16778f), Integer.valueOf(this.f16777e), 1), e10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1146v
    public final void N(int i7, long j6) throws Kf.d {
        Y(i7, 1);
        O(j6);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1146v
    public final void O(long j6) throws Kf.d {
        try {
            byte[] bArr = this.f16776d;
            int i7 = this.f16778f;
            int i10 = i7 + 1;
            this.f16778f = i10;
            bArr[i7] = (byte) (((int) j6) & 255);
            int i11 = i7 + 2;
            this.f16778f = i11;
            bArr[i10] = (byte) (((int) (j6 >> 8)) & 255);
            int i12 = i7 + 3;
            this.f16778f = i12;
            bArr[i11] = (byte) (((int) (j6 >> 16)) & 255);
            int i13 = i7 + 4;
            this.f16778f = i13;
            bArr[i12] = (byte) (((int) (j6 >> 24)) & 255);
            int i14 = i7 + 5;
            this.f16778f = i14;
            bArr[i13] = (byte) (((int) (j6 >> 32)) & 255);
            int i15 = i7 + 6;
            this.f16778f = i15;
            bArr[i14] = (byte) (((int) (j6 >> 40)) & 255);
            int i16 = i7 + 7;
            this.f16778f = i16;
            bArr[i15] = (byte) (((int) (j6 >> 48)) & 255);
            this.f16778f = i7 + 8;
            bArr[i16] = (byte) (((int) (j6 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new Kf.d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f16778f), Integer.valueOf(this.f16777e), 1), e10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1146v
    public final void P(int i7, int i10) throws Kf.d {
        Y(i7, 0);
        Q(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1146v
    public final void Q(int i7) throws Kf.d {
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
    public final void V(int i7, AbstractC1123n abstractC1123n) throws Kf.d {
        Y(1, 3);
        Z(2, i7);
        J(3, abstractC1123n);
        Y(1, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1146v
    public final void W(int i7, String str) throws Kf.d {
        Y(i7, 2);
        X(str);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1146v
    public final void X(String str) throws Kf.d {
        int i7 = this.f16778f;
        try {
            int iD = AbstractC1146v.D(str.length() * 3);
            int iD2 = AbstractC1146v.D(str.length());
            byte[] bArr = this.f16776d;
            if (iD2 != iD) {
                a0(z2.b(str));
                this.f16778f = z2.f16817a.p(str, bArr, this.f16778f, d0());
                return;
            }
            int i10 = i7 + iD2;
            this.f16778f = i10;
            int iP = z2.f16817a.p(str, bArr, i10, d0());
            this.f16778f = i7;
            a0((iP - i7) - iD2);
            this.f16778f = iP;
        } catch (y2 e10) {
            this.f16778f = i7;
            F(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new Kf.d(e11);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1146v
    public final void Y(int i7, int i10) throws Kf.d {
        a0((i7 << 3) | i10);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1146v
    public final void Z(int i7, int i10) throws Kf.d {
        Y(i7, 0);
        a0(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1146v
    public final void a0(int i7) throws Kf.d {
        while (true) {
            int i10 = i7 & (-128);
            byte[] bArr = this.f16776d;
            if (i10 == 0) {
                int i11 = this.f16778f;
                this.f16778f = i11 + 1;
                bArr[i11] = (byte) i7;
                return;
            } else {
                try {
                    int i12 = this.f16778f;
                    this.f16778f = i12 + 1;
                    bArr[i12] = (byte) ((i7 | 128) & 255);
                    i7 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new Kf.d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f16778f), Integer.valueOf(this.f16777e), 1), e10);
                }
            }
            throw new Kf.d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f16778f), Integer.valueOf(this.f16777e), 1), e10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1146v
    public final void b0(int i7, long j6) throws Kf.d {
        Y(i7, 0);
        c0(j6);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1146v
    public final void c0(long j6) throws Kf.d {
        byte[] bArr = this.f16776d;
        if (AbstractC1146v.f16785c && d0() >= 10) {
            while ((j6 & (-128)) != 0) {
                int i7 = this.f16778f;
                this.f16778f = i7 + 1;
                w2.k(bArr, i7, (byte) ((((int) j6) | 128) & 255));
                j6 >>>= 7;
            }
            int i10 = this.f16778f;
            this.f16778f = i10 + 1;
            w2.k(bArr, i10, (byte) j6);
            return;
        }
        while ((j6 & (-128)) != 0) {
            try {
                int i11 = this.f16778f;
                this.f16778f = i11 + 1;
                bArr[i11] = (byte) ((((int) j6) | 128) & 255);
                j6 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new Kf.d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f16778f), Integer.valueOf(this.f16777e), 1), e10);
            }
        }
        int i12 = this.f16778f;
        this.f16778f = i12 + 1;
        bArr[i12] = (byte) j6;
    }

    public final int d0() {
        return this.f16777e - this.f16778f;
    }

    public final void e0(byte[] bArr, int i7, int i10) throws Kf.d {
        try {
            System.arraycopy(bArr, i7, this.f16776d, this.f16778f, i10);
            this.f16778f += i10;
        } catch (IndexOutOfBoundsException e10) {
            throw new Kf.d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f16778f), Integer.valueOf(this.f16777e), Integer.valueOf(i10)), e10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1102h
    public final void w(byte[] bArr, int i7, int i10) throws Kf.d {
        e0(bArr, i7, i10);
    }
}

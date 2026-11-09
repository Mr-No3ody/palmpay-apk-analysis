package androidx.datastore.preferences.protobuf;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1129p extends r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InputStream f16721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f16722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16723e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16724f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f16725g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f16726h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f16727i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f16728j = Integer.MAX_VALUE;

    public C1129p(InputStream inputStream) {
        AbstractC1154x1.a(inputStream, "input");
        this.f16721c = inputStream;
        this.f16722d = new byte[4096];
        this.f16723e = 0;
        this.f16725g = 0;
        this.f16727i = 0;
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final int A() throws C1160z1 {
        if (e()) {
            this.f16726h = 0;
            return 0;
        }
        int iK = K();
        this.f16726h = iK;
        if ((iK >>> 3) != 0) {
            return iK;
        }
        throw C1160z1.a();
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final int B() {
        return K();
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final long C() {
        return L();
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final boolean D(int i7) throws C1160z1 {
        int i10 = i7 & 7;
        int i11 = 0;
        if (i10 != 0) {
            if (i10 == 1) {
                P(8);
                return true;
            }
            if (i10 == 2) {
                P(K());
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
            P(4);
            return true;
        }
        int i12 = this.f16723e - this.f16725g;
        byte[] bArr = this.f16722d;
        if (i12 >= 10) {
            while (i11 < 10) {
                int i13 = this.f16725g;
                this.f16725g = i13 + 1;
                if (bArr[i13] < 0) {
                    i11++;
                }
            }
            throw C1160z1.d();
        }
        while (i11 < 10) {
            if (this.f16725g == this.f16723e) {
                O(1);
            }
            int i14 = this.f16725g;
            this.f16725g = i14 + 1;
            if (bArr[i14] < 0) {
                i11++;
            }
        }
        throw C1160z1.d();
        return true;
    }

    public final byte[] F(int i7) throws IOException {
        byte[] bArrG = G(i7);
        if (bArrG != null) {
            return bArrG;
        }
        int i10 = this.f16725g;
        int i11 = this.f16723e;
        int length = i11 - i10;
        this.f16727i += i11;
        this.f16725g = 0;
        this.f16723e = 0;
        ArrayList<byte[]> arrayListH = H(i7 - length);
        byte[] bArr = new byte[i7];
        System.arraycopy(this.f16722d, i10, bArr, 0, length);
        for (byte[] bArr2 : arrayListH) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final byte[] G(int i7) throws IOException {
        if (i7 == 0) {
            return AbstractC1154x1.f16809b;
        }
        if (i7 < 0) {
            throw C1160z1.e();
        }
        int i10 = this.f16727i;
        int i11 = this.f16725g;
        int i12 = i10 + i11 + i7;
        if (i12 - Integer.MAX_VALUE > 0) {
            throw new C1160z1("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i13 = this.f16728j;
        if (i12 > i13) {
            P((i13 - i10) - i11);
            throw C1160z1.g();
        }
        int i14 = this.f16723e - i11;
        int i15 = i7 - i14;
        InputStream inputStream = this.f16721c;
        if (i15 >= 4096) {
            try {
                if (i15 > inputStream.available()) {
                    return null;
                }
            } catch (C1160z1 e10) {
                e10.f16816a = true;
                throw e10;
            }
        }
        byte[] bArr = new byte[i7];
        System.arraycopy(this.f16722d, this.f16725g, bArr, 0, i14);
        this.f16727i += this.f16723e;
        this.f16725g = 0;
        this.f16723e = 0;
        while (i14 < i7) {
            try {
                int i16 = inputStream.read(bArr, i14, i7 - i14);
                if (i16 == -1) {
                    throw C1160z1.g();
                }
                this.f16727i += i16;
                i14 += i16;
            } catch (C1160z1 e11) {
                e11.f16816a = true;
                throw e11;
            }
        }
        return bArr;
    }

    public final ArrayList H(int i7) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i7 > 0) {
            int iMin = Math.min(i7, 4096);
            byte[] bArr = new byte[iMin];
            int i10 = 0;
            while (i10 < iMin) {
                int i11 = this.f16721c.read(bArr, i10, iMin - i10);
                if (i11 == -1) {
                    throw C1160z1.g();
                }
                this.f16727i += i11;
                i10 += i11;
            }
            i7 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int I() throws C1160z1 {
        int i7 = this.f16725g;
        if (this.f16723e - i7 < 4) {
            O(4);
            i7 = this.f16725g;
        }
        this.f16725g = i7 + 4;
        byte[] bArr = this.f16722d;
        return ((bArr[i7 + 3] & UnsignedBytes.MAX_VALUE) << 24) | (bArr[i7] & UnsignedBytes.MAX_VALUE) | ((bArr[i7 + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i7 + 2] & UnsignedBytes.MAX_VALUE) << 16);
    }

    public final long J() throws C1160z1 {
        int i7 = this.f16725g;
        if (this.f16723e - i7 < 8) {
            O(8);
            i7 = this.f16725g;
        }
        this.f16725g = i7 + 8;
        byte[] bArr = this.f16722d;
        return ((((long) bArr[i7 + 7]) & 255) << 56) | (((long) bArr[i7]) & 255) | ((((long) bArr[i7 + 1]) & 255) << 8) | ((((long) bArr[i7 + 2]) & 255) << 16) | ((((long) bArr[i7 + 3]) & 255) << 24) | ((((long) bArr[i7 + 4]) & 255) << 32) | ((((long) bArr[i7 + 5]) & 255) << 40) | ((((long) bArr[i7 + 6]) & 255) << 48);
    }

    public final int K() {
        int i7;
        int i10 = this.f16725g;
        int i11 = this.f16723e;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f16722d;
            byte b7 = bArr[i10];
            if (b7 >= 0) {
                this.f16725g = i12;
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
                this.f16725g = i13;
                return i7;
            }
        }
        return (int) M();
    }

    public final long L() {
        long j6;
        long j10;
        long j11;
        long j12;
        int i7 = this.f16725g;
        int i10 = this.f16723e;
        if (i10 != i7) {
            int i11 = i7 + 1;
            byte[] bArr = this.f16722d;
            byte b7 = bArr[i7];
            if (b7 >= 0) {
                this.f16725g = i11;
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
                this.f16725g = i12;
                return j6;
            }
        }
        return M();
    }

    public final long M() throws C1160z1 {
        long j6 = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            if (this.f16725g == this.f16723e) {
                O(1);
            }
            int i10 = this.f16725g;
            this.f16725g = i10 + 1;
            byte b7 = this.f16722d[i10];
            j6 |= ((long) (b7 & Ascii.DEL)) << i7;
            if ((b7 & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                return j6;
            }
        }
        throw C1160z1.d();
    }

    public final void N() {
        int i7 = this.f16723e + this.f16724f;
        this.f16723e = i7;
        int i10 = this.f16727i + i7;
        int i11 = this.f16728j;
        if (i10 <= i11) {
            this.f16724f = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f16724f = i12;
        this.f16723e = i7 - i12;
    }

    public final void O(int i7) throws C1160z1 {
        if (Q(i7)) {
            return;
        }
        if (i7 <= (Integer.MAX_VALUE - this.f16727i) - this.f16725g) {
            throw C1160z1.g();
        }
        throw new C1160z1("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void P(int i7) throws C1160z1 {
        int i10 = this.f16723e;
        int i11 = this.f16725g;
        if (i7 <= i10 - i11 && i7 >= 0) {
            this.f16725g = i11 + i7;
            return;
        }
        InputStream inputStream = this.f16721c;
        if (i7 < 0) {
            throw C1160z1.e();
        }
        int i12 = this.f16727i;
        int i13 = i12 + i11;
        int i14 = i13 + i7;
        int i15 = this.f16728j;
        if (i14 > i15) {
            P((i15 - i12) - i11);
            throw C1160z1.g();
        }
        this.f16727i = i13;
        int i16 = i10 - i11;
        this.f16723e = 0;
        this.f16725g = 0;
        while (i16 < i7) {
            long j6 = i7 - i16;
            try {
                try {
                    long jSkip = inputStream.skip(j6);
                    if (jSkip < 0 || jSkip > j6) {
                        throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i16 += (int) jSkip;
                    }
                } catch (C1160z1 e10) {
                    e10.f16816a = true;
                    throw e10;
                }
            } catch (Throwable th) {
                this.f16727i += i16;
                N();
                throw th;
            }
        }
        this.f16727i += i16;
        N();
        if (i16 >= i7) {
            return;
        }
        int i17 = this.f16723e;
        int i18 = i17 - this.f16725g;
        this.f16725g = i17;
        O(1);
        while (true) {
            int i19 = i7 - i18;
            int i20 = this.f16723e;
            if (i19 <= i20) {
                this.f16725g = i19;
                return;
            } else {
                i18 += i20;
                this.f16725g = i20;
                O(1);
            }
        }
    }

    public final boolean Q(int i7) throws IOException {
        int i10 = this.f16725g;
        int i11 = i10 + i7;
        int i12 = this.f16723e;
        if (i11 <= i12) {
            throw new IllegalStateException(androidx.camera.camera2.internal.F.c(i7, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i13 = this.f16727i;
        if (i7 <= (Integer.MAX_VALUE - i13) - i10 && i13 + i10 + i7 <= this.f16728j) {
            byte[] bArr = this.f16722d;
            if (i10 > 0) {
                if (i12 > i10) {
                    System.arraycopy(bArr, i10, bArr, 0, i12 - i10);
                }
                this.f16727i += i10;
                this.f16723e -= i10;
                this.f16725g = 0;
            }
            int i14 = this.f16723e;
            int iMin = Math.min(bArr.length - i14, (Integer.MAX_VALUE - this.f16727i) - i14);
            InputStream inputStream = this.f16721c;
            try {
                int i15 = inputStream.read(bArr, i14, iMin);
                if (i15 == 0 || i15 < -1 || i15 > bArr.length) {
                    throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + i15 + "\nThe InputStream implementation is buggy.");
                }
                if (i15 > 0) {
                    this.f16723e += i15;
                    N();
                    if (this.f16723e >= i7) {
                        return true;
                    }
                    return Q(i7);
                }
            } catch (C1160z1 e10) {
                e10.f16816a = true;
                throw e10;
            }
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final void a(int i7) throws C1160z1 {
        if (this.f16726h != i7) {
            throw new C1160z1("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final int d() {
        return this.f16727i + this.f16725g;
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final boolean e() {
        return this.f16725g == this.f16723e && !Q(1);
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final void i(int i7) {
        this.f16728j = i7;
        N();
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final int j(int i7) throws C1160z1 {
        if (i7 < 0) {
            throw C1160z1.e();
        }
        int i10 = this.f16727i + this.f16725g + i7;
        if (i10 < 0) {
            throw C1160z1.f();
        }
        int i11 = this.f16728j;
        if (i10 > i11) {
            throw C1160z1.g();
        }
        this.f16728j = i10;
        N();
        return i11;
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final boolean k() {
        return L() != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final C1120m l() throws IOException {
        int iK = K();
        int i7 = this.f16723e;
        int i10 = this.f16725g;
        int i11 = i7 - i10;
        byte[] bArr = this.f16722d;
        if (iK <= i11 && iK > 0) {
            C1120m c1120mC = AbstractC1123n.c(i10, iK, bArr);
            this.f16725g += iK;
            return c1120mC;
        }
        if (iK == 0) {
            return AbstractC1123n.f16699b;
        }
        if (iK < 0) {
            throw C1160z1.e();
        }
        byte[] bArrG = G(iK);
        if (bArrG != null) {
            return AbstractC1123n.c(0, bArrG.length, bArrG);
        }
        int i12 = this.f16725g;
        int i13 = this.f16723e;
        int length = i13 - i12;
        this.f16727i += i13;
        this.f16725g = 0;
        this.f16723e = 0;
        ArrayList<byte[]> arrayListH = H(iK - length);
        byte[] bArr2 = new byte[iK];
        System.arraycopy(bArr, i12, bArr2, 0, length);
        for (byte[] bArr3 : arrayListH) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        C1120m c1120m = AbstractC1123n.f16699b;
        return new C1120m(bArr2);
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final double m() {
        return Double.longBitsToDouble(J());
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final int n() {
        return K();
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final int o() {
        return I();
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final long p() {
        return J();
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final float q() {
        return Float.intBitsToFloat(I());
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final int r() {
        return K();
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final long s() {
        return L();
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final int u() {
        return I();
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final long v() {
        return J();
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final int w() {
        return r.b(K());
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final long x() {
        return r.c(L());
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final String y() throws C1160z1 {
        int iK = K();
        byte[] bArr = this.f16722d;
        if (iK > 0) {
            int i7 = this.f16723e;
            int i10 = this.f16725g;
            if (iK <= i7 - i10) {
                String str = new String(bArr, i10, iK, AbstractC1154x1.f16808a);
                this.f16725g += iK;
                return str;
            }
        }
        if (iK == 0) {
            return "";
        }
        if (iK < 0) {
            throw C1160z1.e();
        }
        if (iK > this.f16723e) {
            return new String(F(iK), AbstractC1154x1.f16808a);
        }
        O(iK);
        String str2 = new String(bArr, this.f16725g, iK, AbstractC1154x1.f16808a);
        this.f16725g += iK;
        return str2;
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final String z() throws IOException {
        int iK = K();
        int i7 = this.f16725g;
        int i10 = this.f16723e;
        int i11 = i10 - i7;
        byte[] bArrF = this.f16722d;
        if (iK <= i11 && iK > 0) {
            this.f16725g = i7 + iK;
        } else {
            if (iK == 0) {
                return "";
            }
            if (iK < 0) {
                throw C1160z1.e();
            }
            i7 = 0;
            if (iK <= i10) {
                O(iK);
                this.f16725g = iK;
            } else {
                bArrF = F(iK);
            }
        }
        return z2.f16817a.i(bArrF, i7, iK);
    }
}

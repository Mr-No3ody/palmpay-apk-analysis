package Pg;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.collections.C1846m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class B extends m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient byte[][] f7334f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int[] f7335g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(byte[][] segments, int[] directory) {
        super(m.f7360e.f7361a);
        Intrinsics.checkNotNullParameter(segments, "segments");
        Intrinsics.checkNotNullParameter(directory, "directory");
        this.f7334f = segments;
        this.f7335g = directory;
    }

    @Override // Pg.m
    public final String a() {
        return new m(k()).a();
    }

    @Override // Pg.m
    public final String b() {
        return new m(k()).b();
    }

    @Override // Pg.m
    public final m c(String algorithm) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        byte[][] bArr = this.f7334f;
        int length = bArr.length;
        int i7 = 0;
        int i10 = 0;
        while (i7 < length) {
            int[] iArr = this.f7335g;
            int i11 = iArr[length + i7];
            int i12 = iArr[i7];
            messageDigest.update(bArr[i7], i11, i12 - i10);
            i7++;
            i10 = i12;
        }
        byte[] bArrDigest = messageDigest.digest();
        Intrinsics.e(bArrDigest);
        return new m(bArrDigest);
    }

    @Override // Pg.m
    public final int d() {
        return this.f7335g[this.f7334f.length - 1];
    }

    @Override // Pg.m
    public final String e() {
        return new m(k()).e();
    }

    @Override // Pg.m
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return mVar.d() == d() && i(mVar, d());
    }

    @Override // Pg.m
    public final byte[] f() {
        return k();
    }

    @Override // Pg.m
    public final byte g(int i7) {
        byte[][] bArr = this.f7334f;
        int length = bArr.length - 1;
        int[] iArr = this.f7335g;
        AbstractC0555b.d(iArr[length], i7, 1L);
        int iB = Qg.b.b(this, i7);
        return bArr[iB][(i7 - (iB == 0 ? 0 : iArr[iB - 1])) + iArr[bArr.length + iB]];
    }

    @Override // Pg.m
    public final boolean h(int i7, byte[] other, int i10, int i11) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i7 < 0 || i7 > d() - i11 || i10 < 0 || i10 > other.length - i11) {
            return false;
        }
        int i12 = i11 + i7;
        int iB = Qg.b.b(this, i7);
        while (i7 < i12) {
            int[] iArr = this.f7335g;
            int i13 = iB == 0 ? 0 : iArr[iB - 1];
            int i14 = iArr[iB] - i13;
            byte[][] bArr = this.f7334f;
            int i15 = iArr[bArr.length + iB];
            int iMin = Math.min(i12, i14 + i13) - i7;
            if (!AbstractC0555b.a(bArr[iB], (i7 - i13) + i15, other, i10, iMin)) {
                return false;
            }
            i10 += iMin;
            i7 += iMin;
            iB++;
        }
        return true;
    }

    @Override // Pg.m
    public final int hashCode() {
        int i7 = this.f7362b;
        if (i7 != 0) {
            return i7;
        }
        byte[][] bArr = this.f7334f;
        int length = bArr.length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int[] iArr = this.f7335g;
            int i13 = iArr[length + i10];
            int i14 = iArr[i10];
            byte[] bArr2 = bArr[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr2[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        this.f7362b = i11;
        return i11;
    }

    @Override // Pg.m
    public final boolean i(m other, int i7) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (d() - i7 >= 0) {
            int iB = Qg.b.b(this, 0);
            int i10 = 0;
            int i11 = 0;
            while (i10 < i7) {
                int[] iArr = this.f7335g;
                int i12 = iB == 0 ? 0 : iArr[iB - 1];
                int i13 = iArr[iB] - i12;
                byte[][] bArr = this.f7334f;
                int i14 = iArr[bArr.length + iB];
                int iMin = Math.min(i7, i13 + i12) - i10;
                if (other.h(i11, bArr[iB], (i10 - i12) + i14, iMin)) {
                    i11 += iMin;
                    i10 += iMin;
                    iB++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // Pg.m
    public final m j() {
        return new m(k()).j();
    }

    @Override // Pg.m
    public final byte[] k() {
        byte[] bArr = new byte[d()];
        byte[][] bArr2 = this.f7334f;
        int length = bArr2.length;
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i7 < length) {
            int[] iArr = this.f7335g;
            int i12 = iArr[length + i7];
            int i13 = iArr[i7];
            int i14 = i13 - i10;
            C1846m.e(bArr2[i7], i11, bArr, i12, i12 + i14);
            i11 += i14;
            i7++;
            i10 = i13;
        }
        return bArr;
    }

    @Override // Pg.m
    public final void m(k buffer, int i7, int i10) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int i11 = i7 + i10;
        int iB = Qg.b.b(this, i7);
        while (i7 < i11) {
            int[] iArr = this.f7335g;
            int i12 = iB == 0 ? 0 : iArr[iB - 1];
            int i13 = iArr[iB] - i12;
            byte[][] bArr = this.f7334f;
            int i14 = iArr[bArr.length + iB];
            int iMin = Math.min(i11, i13 + i12) - i7;
            int i15 = (i7 - i12) + i14;
            z zVar = new z(bArr[iB], i15, i15 + iMin, true, false);
            z zVar2 = buffer.f7357a;
            if (zVar2 == null) {
                zVar.f7397g = zVar;
                zVar.f7396f = zVar;
                buffer.f7357a = zVar;
            } else {
                z zVar3 = zVar2.f7397g;
                Intrinsics.e(zVar3);
                zVar3.b(zVar);
            }
            i7 += iMin;
            iB++;
        }
        buffer.f7358b += (long) i10;
    }

    @Override // Pg.m
    public final String toString() {
        return new m(k()).toString();
    }
}

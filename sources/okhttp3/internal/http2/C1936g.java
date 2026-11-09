package okhttp3.internal.http2;

import com.google.common.primitives.UnsignedBytes;
import java.io.EOFException;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.C1846m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: okhttp3.internal.http2.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1936g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pg.k f40828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f40829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f40830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f40831d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C1934e[] f40832e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f40833f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f40834g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f40835h;

    public C1936g(Pg.k out) {
        Intrinsics.checkNotNullParameter(out, "out");
        this.f40828a = out;
        this.f40829b = Integer.MAX_VALUE;
        this.f40831d = 4096;
        this.f40832e = new C1934e[8];
        this.f40833f = 7;
    }

    public final void a(int i7) {
        int i10;
        if (i7 > 0) {
            int length = this.f40832e.length - 1;
            int i11 = 0;
            while (true) {
                i10 = this.f40833f;
                if (length < i10 || i7 <= 0) {
                    break;
                }
                C1934e c1934e = this.f40832e[length];
                Intrinsics.e(c1934e);
                i7 -= c1934e.f40820c;
                int i12 = this.f40835h;
                C1934e c1934e2 = this.f40832e[length];
                Intrinsics.e(c1934e2);
                this.f40835h = i12 - c1934e2.f40820c;
                this.f40834g--;
                i11++;
                length--;
            }
            C1934e[] c1934eArr = this.f40832e;
            int i13 = i10 + 1;
            System.arraycopy(c1934eArr, i13, c1934eArr, i13 + i11, this.f40834g);
            C1934e[] c1934eArr2 = this.f40832e;
            int i14 = this.f40833f + 1;
            Arrays.fill(c1934eArr2, i14, i14 + i11, (Object) null);
            this.f40833f += i11;
        }
    }

    public final void b(C1934e c1934e) {
        int i7 = this.f40831d;
        int i10 = c1934e.f40820c;
        if (i10 > i7) {
            C1934e[] c1934eArr = this.f40832e;
            C1846m.i(c1934eArr, null, 0, c1934eArr.length);
            this.f40833f = this.f40832e.length - 1;
            this.f40834g = 0;
            this.f40835h = 0;
            return;
        }
        a((this.f40835h + i10) - i7);
        int i11 = this.f40834g + 1;
        C1934e[] c1934eArr2 = this.f40832e;
        if (i11 > c1934eArr2.length) {
            C1934e[] c1934eArr3 = new C1934e[c1934eArr2.length * 2];
            System.arraycopy(c1934eArr2, 0, c1934eArr3, c1934eArr2.length, c1934eArr2.length);
            this.f40833f = this.f40832e.length - 1;
            this.f40832e = c1934eArr3;
        }
        int i12 = this.f40833f;
        this.f40833f = i12 - 1;
        this.f40832e[i12] = c1934e;
        this.f40834g++;
        this.f40835h += i10;
    }

    public final void c(Pg.m source) throws EOFException {
        Intrinsics.checkNotNullParameter(source, "data");
        Pg.k kVar = this.f40828a;
        int[] iArr = H.f40796a;
        Intrinsics.checkNotNullParameter(source, "bytes");
        int iD = source.d();
        long j6 = 0;
        for (int i7 = 0; i7 < iD; i7++) {
            byte bG = source.g(i7);
            byte[] bArr = Dg.c.f1879a;
            j6 += (long) H.f40797b[bG & UnsignedBytes.MAX_VALUE];
        }
        if (((int) ((j6 + ((long) 7)) >> 3)) >= source.d()) {
            e(source.d(), 127, 0);
            kVar.i(source);
            return;
        }
        Pg.k sink = new Pg.k();
        int[] iArr2 = H.f40796a;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        int iD2 = source.d();
        long j10 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < iD2; i11++) {
            byte bG2 = source.g(i11);
            byte[] bArr2 = Dg.c.f1879a;
            int i12 = bG2 & UnsignedBytes.MAX_VALUE;
            int i13 = H.f40796a[i12];
            byte b7 = H.f40797b[i12];
            j10 = (j10 << b7) | ((long) i13);
            i10 += b7;
            while (i10 >= 8) {
                i10 -= 8;
                sink.m((int) (j10 >> i10));
            }
        }
        if (i10 > 0) {
            sink.m((int) ((255 >>> i10) | (j10 << (8 - i10))));
        }
        Pg.m byteString = sink.readByteString(sink.f7358b);
        e(byteString.d(), 127, 128);
        kVar.i(byteString);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006e  */
    public final void d(List headerBlock) throws EOFException {
        int length;
        int length2;
        Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
        if (this.f40830c) {
            int i7 = this.f40829b;
            if (i7 < this.f40831d) {
                e(i7, 31, 32);
            }
            this.f40830c = false;
            this.f40829b = Integer.MAX_VALUE;
            e(this.f40831d, 31, 32);
        }
        int size = headerBlock.size();
        for (int i10 = 0; i10 < size; i10++) {
            C1934e c1934e = (C1934e) headerBlock.get(i10);
            Pg.m mVarJ = c1934e.f40818a.j();
            Integer num = (Integer) AbstractC1937h.f40837b.get(mVarJ);
            Pg.m mVar = c1934e.f40819b;
            if (num != null) {
                int iIntValue = num.intValue();
                length2 = iIntValue + 1;
                if (2 > length2 || length2 >= 8) {
                    length = length2;
                    length2 = -1;
                } else {
                    C1934e[] c1934eArr = AbstractC1937h.f40836a;
                    if (Intrinsics.c(c1934eArr[iIntValue].f40819b, mVar)) {
                        length = length2;
                    } else if (Intrinsics.c(c1934eArr[length2].f40819b, mVar)) {
                        length2 = iIntValue + 2;
                        length = length2;
                    } else {
                        length = length2;
                        length2 = -1;
                    }
                }
            } else {
                length = -1;
                length2 = -1;
            }
            if (length2 == -1) {
                int length3 = this.f40832e.length;
                for (int i11 = this.f40833f + 1; i11 < length3; i11++) {
                    C1934e c1934e2 = this.f40832e[i11];
                    Intrinsics.e(c1934e2);
                    if (Intrinsics.c(c1934e2.f40818a, mVarJ)) {
                        C1934e c1934e3 = this.f40832e[i11];
                        Intrinsics.e(c1934e3);
                        if (Intrinsics.c(c1934e3.f40819b, mVar)) {
                            length2 = AbstractC1937h.f40836a.length + (i11 - this.f40833f);
                            break;
                        } else if (length == -1) {
                            length = (i11 - this.f40833f) + AbstractC1937h.f40836a.length;
                        }
                    }
                }
            }
            if (length2 != -1) {
                e(length2, 127, 128);
            } else if (length == -1) {
                this.f40828a.m(64);
                c(mVarJ);
                c(mVar);
                b(c1934e);
            } else {
                Pg.m prefix = C1934e.f40812d;
                mVarJ.getClass();
                Intrinsics.checkNotNullParameter(prefix, "prefix");
                if (!mVarJ.i(prefix, prefix.d()) || Intrinsics.c(C1934e.f40817i, mVarJ)) {
                    e(length, 63, 64);
                    c(mVar);
                    b(c1934e);
                } else {
                    e(length, 15, 0);
                    c(mVar);
                }
            }
        }
    }

    public final void e(int i7, int i10, int i11) {
        Pg.k kVar = this.f40828a;
        if (i7 < i10) {
            kVar.m(i7 | i11);
            return;
        }
        kVar.m(i11 | i10);
        int i12 = i7 - i10;
        while (i12 >= 128) {
            kVar.m(128 | (i12 & 127));
            i12 >>>= 7;
        }
        kVar.m(i12);
    }
}

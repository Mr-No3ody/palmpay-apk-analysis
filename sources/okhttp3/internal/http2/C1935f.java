package okhttp3.internal.http2;

import Pg.AbstractC0555b;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.collections.C1846m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: okhttp3.internal.http2.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1935f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f40821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f40822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Pg.x f40823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1934e[] f40824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f40825e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f40826f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f40827g;

    public C1935f(y source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f40821a = 4096;
        this.f40822b = new ArrayList();
        this.f40823c = AbstractC0555b.c(source);
        this.f40824d = new C1934e[8];
        this.f40825e = 7;
    }

    public final int a(int i7) {
        int i10;
        int i11 = 0;
        if (i7 > 0) {
            int length = this.f40824d.length;
            while (true) {
                length--;
                i10 = this.f40825e;
                if (length < i10 || i7 <= 0) {
                    break;
                }
                C1934e c1934e = this.f40824d[length];
                Intrinsics.e(c1934e);
                int i12 = c1934e.f40820c;
                i7 -= i12;
                this.f40827g -= i12;
                this.f40826f--;
                i11++;
            }
            C1934e[] c1934eArr = this.f40824d;
            System.arraycopy(c1934eArr, i10 + 1, c1934eArr, i10 + 1 + i11, this.f40826f);
            this.f40825e += i11;
        }
        return i11;
    }

    public final Pg.m b(int i7) throws IOException {
        if (i7 >= 0) {
            C1934e[] c1934eArr = AbstractC1937h.f40836a;
            if (i7 <= c1934eArr.length - 1) {
                return c1934eArr[i7].f40818a;
            }
        }
        int length = this.f40825e + 1 + (i7 - AbstractC1937h.f40836a.length);
        if (length >= 0) {
            C1934e[] c1934eArr2 = this.f40824d;
            if (length < c1934eArr2.length) {
                C1934e c1934e = c1934eArr2[length];
                Intrinsics.e(c1934e);
                return c1934e.f40818a;
            }
        }
        throw new IOException("Header index too large " + (i7 + 1));
    }

    public final void c(C1934e c1934e) {
        this.f40822b.add(c1934e);
        int i7 = this.f40821a;
        int i10 = c1934e.f40820c;
        if (i10 > i7) {
            C1934e[] c1934eArr = this.f40824d;
            C1846m.i(c1934eArr, null, 0, c1934eArr.length);
            this.f40825e = this.f40824d.length - 1;
            this.f40826f = 0;
            this.f40827g = 0;
            return;
        }
        a((this.f40827g + i10) - i7);
        int i11 = this.f40826f + 1;
        C1934e[] c1934eArr2 = this.f40824d;
        if (i11 > c1934eArr2.length) {
            C1934e[] c1934eArr3 = new C1934e[c1934eArr2.length * 2];
            System.arraycopy(c1934eArr2, 0, c1934eArr3, c1934eArr2.length, c1934eArr2.length);
            this.f40825e = this.f40824d.length - 1;
            this.f40824d = c1934eArr3;
        }
        int i12 = this.f40825e;
        this.f40825e = i12 - 1;
        this.f40824d[i12] = c1934e;
        this.f40826f++;
        this.f40827g += i10;
    }

    public final Pg.m d() {
        int i7;
        Pg.x source = this.f40823c;
        byte b7 = source.readByte();
        byte[] bArr = Dg.c.f1879a;
        int i10 = b7 & UnsignedBytes.MAX_VALUE;
        int i11 = 0;
        boolean z3 = (b7 & UnsignedBytes.MAX_POWER_OF_TWO) == 128;
        long jE = e(i10, 127);
        if (!z3) {
            return source.readByteString(jE);
        }
        Pg.k sink = new Pg.k();
        int[] iArr = H.f40796a;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        J1.b bVar = H.f40798c;
        J1.b bVar2 = bVar;
        int i12 = 0;
        for (long j6 = 0; j6 < jE; j6++) {
            byte b10 = source.readByte();
            byte[] bArr2 = Dg.c.f1879a;
            i11 = (i11 << 8) | (b10 & UnsignedBytes.MAX_VALUE);
            i12 += 8;
            while (i12 >= 8) {
                J1.b[] bVarArr = (J1.b[]) bVar2.f4453c;
                Intrinsics.e(bVarArr);
                bVar2 = bVarArr[(i11 >>> (i12 - 8)) & 255];
                Intrinsics.e(bVar2);
                if (((J1.b[]) bVar2.f4453c) == null) {
                    sink.m(bVar2.f4451a);
                    i12 -= bVar2.f4452b;
                    bVar2 = bVar;
                } else {
                    i12 -= 8;
                }
            }
        }
        while (i12 > 0) {
            J1.b[] bVarArr2 = (J1.b[]) bVar2.f4453c;
            Intrinsics.e(bVarArr2);
            J1.b bVar3 = bVarArr2[(i11 << (8 - i12)) & 255];
            Intrinsics.e(bVar3);
            if (((J1.b[]) bVar3.f4453c) != null || (i7 = bVar3.f4452b) > i12) {
                break;
            }
            sink.m(bVar3.f4451a);
            i12 -= i7;
            bVar2 = bVar;
        }
        return sink.readByteString(sink.f7358b);
    }

    public final int e(int i7, int i10) {
        int i11 = i7 & i10;
        if (i11 < i10) {
            return i11;
        }
        int i12 = 0;
        while (true) {
            byte b7 = this.f40823c.readByte();
            byte[] bArr = Dg.c.f1879a;
            int i13 = b7 & UnsignedBytes.MAX_VALUE;
            if ((b7 & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                return i10 + (i13 << i12);
            }
            i10 += (b7 & Ascii.DEL) << i12;
            i12 += 7;
        }
    }
}

package Pg;

import C0.G;
import com.facebook.imageutils.JfifUtil;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.collections.AbstractC1836c;
import kotlin.collections.C1846m;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Sink;
import okio.Source;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements BufferedSource, BufferedSink, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z f7357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f7358b;

    public final void a() throws EOFException {
        skip(this.f7358b);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final k clone() {
        k kVar = new k();
        if (this.f7358b == 0) {
            return kVar;
        }
        z zVar = this.f7357a;
        Intrinsics.e(zVar);
        z zVarC = zVar.c();
        kVar.f7357a = zVarC;
        zVarC.f7397g = zVarC;
        zVarC.f7396f = zVarC;
        for (z zVar2 = zVar.f7396f; zVar2 != zVar; zVar2 = zVar2.f7396f) {
            z zVar3 = zVarC.f7397g;
            Intrinsics.e(zVar3);
            Intrinsics.e(zVar2);
            zVar3.b(zVar2.c());
        }
        kVar.f7358b = this.f7358b;
        return kVar;
    }

    public final long c() {
        long j6 = this.f7358b;
        if (j6 == 0) {
            return 0L;
        }
        z zVar = this.f7357a;
        Intrinsics.e(zVar);
        z zVar2 = zVar.f7397g;
        Intrinsics.e(zVar2);
        int i7 = zVar2.f7393c;
        return (i7 >= 8192 || !zVar2.f7395e) ? j6 : j6 - ((long) (i7 - zVar2.f7392b));
    }

    public final void d(k out, long j6, long j10) {
        Intrinsics.checkNotNullParameter(out, "out");
        long j11 = j6;
        AbstractC0555b.d(this.f7358b, j11, j10);
        if (j10 == 0) {
            return;
        }
        out.f7358b += j10;
        z zVar = this.f7357a;
        while (true) {
            Intrinsics.e(zVar);
            long j12 = zVar.f7393c - zVar.f7392b;
            if (j11 < j12) {
                break;
            }
            j11 -= j12;
            zVar = zVar.f7396f;
        }
        z zVar2 = zVar;
        long j13 = j10;
        while (j13 > 0) {
            Intrinsics.e(zVar2);
            z zVarC = zVar2.c();
            int i7 = zVarC.f7392b + ((int) j11);
            zVarC.f7392b = i7;
            zVarC.f7393c = Math.min(i7 + ((int) j13), zVarC.f7393c);
            z zVar3 = out.f7357a;
            if (zVar3 == null) {
                zVarC.f7397g = zVarC;
                zVarC.f7396f = zVarC;
                out.f7357a = zVarC;
            } else {
                z zVar4 = zVar3.f7397g;
                Intrinsics.e(zVar4);
                zVar4.b(zVarC);
            }
            j13 -= (long) (zVarC.f7393c - zVarC.f7392b);
            zVar2 = zVar2.f7396f;
            j11 = 0;
        }
    }

    public final byte e(long j6) {
        AbstractC0555b.d(this.f7358b, j6, 1L);
        z zVar = this.f7357a;
        if (zVar == null) {
            Intrinsics.e(null);
            throw null;
        }
        long j10 = this.f7358b;
        if (j10 - j6 < j6) {
            while (j10 > j6) {
                zVar = zVar.f7397g;
                Intrinsics.e(zVar);
                j10 -= (long) (zVar.f7393c - zVar.f7392b);
            }
            return zVar.f7391a[(int) ((((long) zVar.f7392b) + j6) - j10)];
        }
        long j11 = 0;
        while (true) {
            int i7 = zVar.f7393c;
            int i10 = zVar.f7392b;
            long j12 = ((long) (i7 - i10)) + j11;
            if (j12 > j6) {
                return zVar.f7391a[(int) ((((long) i10) + j6) - j11)];
            }
            zVar = zVar.f7396f;
            Intrinsics.e(zVar);
            j11 = j12;
        }
    }

    public final boolean equals(Object obj) {
        boolean z3 = true;
        if (this == obj) {
            return true;
        }
        boolean z8 = false;
        if (!(obj instanceof k)) {
            return false;
        }
        long j6 = this.f7358b;
        k kVar = (k) obj;
        if (j6 != kVar.f7358b) {
            return false;
        }
        if (j6 == 0) {
            return true;
        }
        z zVar = this.f7357a;
        Intrinsics.e(zVar);
        z zVar2 = kVar.f7357a;
        Intrinsics.e(zVar2);
        int i7 = zVar.f7392b;
        int i10 = zVar2.f7392b;
        long j10 = 0;
        while (j10 < this.f7358b) {
            long jMin = Math.min(zVar.f7393c - i7, zVar2.f7393c - i10);
            long j11 = 0;
            while (j11 < jMin) {
                int i11 = i7 + 1;
                boolean z10 = z3;
                byte b7 = zVar.f7391a[i7];
                int i12 = i10 + 1;
                boolean z11 = z8;
                if (b7 != zVar2.f7391a[i10]) {
                    return z11;
                }
                j11++;
                i10 = i12;
                i7 = i11;
                z3 = z10;
                z8 = z11;
            }
            boolean z12 = z3;
            boolean z13 = z8;
            if (i7 == zVar.f7393c) {
                z zVar3 = zVar.f7396f;
                Intrinsics.e(zVar3);
                i7 = zVar3.f7392b;
                zVar = zVar3;
            }
            if (i10 == zVar2.f7393c) {
                zVar2 = zVar2.f7396f;
                Intrinsics.e(zVar2);
                i10 = zVar2.f7392b;
            }
            j10 += jMin;
            z3 = z12;
            z8 = z13;
        }
        return z3;
    }

    @Override // okio.BufferedSource
    public final boolean exhausted() {
        return this.f7358b == 0;
    }

    public final h f(h unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        byte[] bArr = Qg.a.f7850a;
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        if (unsafeCursor == AbstractC0555b.f7339a) {
            unsafeCursor = new h();
        }
        if (unsafeCursor.f7346a != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        unsafeCursor.f7346a = this;
        unsafeCursor.f7347b = true;
        return unsafeCursor;
    }

    public final m g(int i7) {
        if (i7 == 0) {
            return m.f7360e;
        }
        AbstractC0555b.d(this.f7358b, 0L, i7);
        z zVar = this.f7357a;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i7) {
            Intrinsics.e(zVar);
            int i13 = zVar.f7393c;
            int i14 = zVar.f7392b;
            if (i13 == i14) {
                throw new AssertionError("s.limit == s.pos");
            }
            i11 += i13 - i14;
            i12++;
            zVar = zVar.f7396f;
        }
        byte[][] bArr = new byte[i12][];
        int[] iArr = new int[i12 * 2];
        z zVar2 = this.f7357a;
        int i15 = 0;
        while (i10 < i7) {
            Intrinsics.e(zVar2);
            bArr[i15] = zVar2.f7391a;
            i10 += zVar2.f7393c - zVar2.f7392b;
            iArr[i15] = Math.min(i10, i7);
            iArr[i15 + i12] = zVar2.f7392b;
            zVar2.f7394d = true;
            i15++;
            zVar2 = zVar2.f7396f;
        }
        return new B(bArr, iArr);
    }

    public final z h(int i7) {
        if (i7 < 1 || i7 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        z zVar = this.f7357a;
        if (zVar == null) {
            z zVarB = A.b();
            this.f7357a = zVarB;
            zVarB.f7397g = zVarB;
            zVarB.f7396f = zVarB;
            return zVarB;
        }
        z zVar2 = zVar.f7397g;
        Intrinsics.e(zVar2);
        if (zVar2.f7393c + i7 <= 8192 && zVar2.f7395e) {
            return zVar2;
        }
        z zVarB2 = A.b();
        zVar2.b(zVarB2);
        return zVarB2;
    }

    public final int hashCode() {
        z zVar = this.f7357a;
        if (zVar == null) {
            return 0;
        }
        int i7 = 1;
        do {
            int i10 = zVar.f7393c;
            for (int i11 = zVar.f7392b; i11 < i10; i11++) {
                i7 = (i7 * 31) + zVar.f7391a[i11];
            }
            zVar = zVar.f7396f;
            Intrinsics.e(zVar);
        } while (zVar != this.f7357a);
        return i7;
    }

    public final void i(m byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.m(this, 0, byteString.d());
    }

    @Override // okio.BufferedSource
    public final long indexOf(byte b7, long j6, long j10) {
        z zVar;
        long j11 = 0;
        if (0 > j6 || j6 > j10) {
            StringBuilder sb2 = new StringBuilder("size=");
            sb2.append(this.f7358b);
            androidx.camera.video.u.v(sb2, " fromIndex=", j6, " toIndex=");
            sb2.append(j10);
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        long j12 = this.f7358b;
        if (j10 > j12) {
            j10 = j12;
        }
        if (j6 == j10 || (zVar = this.f7357a) == null) {
            return -1L;
        }
        if (j12 - j6 < j6) {
            while (j12 > j6) {
                zVar = zVar.f7397g;
                Intrinsics.e(zVar);
                j12 -= (long) (zVar.f7393c - zVar.f7392b);
            }
            while (j12 < j10) {
                int iMin = (int) Math.min(zVar.f7393c, (((long) zVar.f7392b) + j10) - j12);
                for (int i7 = (int) ((((long) zVar.f7392b) + j6) - j12); i7 < iMin; i7++) {
                    if (zVar.f7391a[i7] == b7) {
                        return ((long) (i7 - zVar.f7392b)) + j12;
                    }
                }
                j12 += (long) (zVar.f7393c - zVar.f7392b);
                zVar = zVar.f7396f;
                Intrinsics.e(zVar);
                j6 = j12;
            }
            return -1L;
        }
        while (true) {
            long j13 = ((long) (zVar.f7393c - zVar.f7392b)) + j11;
            if (j13 > j6) {
                break;
            }
            zVar = zVar.f7396f;
            Intrinsics.e(zVar);
            j11 = j13;
        }
        while (j11 < j10) {
            int iMin2 = (int) Math.min(zVar.f7393c, (((long) zVar.f7392b) + j10) - j11);
            for (int i10 = (int) ((((long) zVar.f7392b) + j6) - j11); i10 < iMin2; i10++) {
                if (zVar.f7391a[i10] == b7) {
                    return ((long) (i10 - zVar.f7392b)) + j11;
                }
            }
            j11 += (long) (zVar.f7393c - zVar.f7392b);
            zVar = zVar.f7396f;
            Intrinsics.e(zVar);
            j6 = j11;
        }
        return -1L;
    }

    @Override // okio.BufferedSource
    public final long indexOfElement(m targetBytes) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        return indexOfElement(targetBytes, 0L);
    }

    @Override // okio.BufferedSource
    public final InputStream inputStream() {
        return new i(this, 0);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final void j(Source source, long j6) {
        Intrinsics.checkNotNullParameter(source, "source");
        while (j6 > 0) {
            long j10 = source.read(this, j6);
            if (j10 == -1) {
                throw new EOFException();
            }
            j6 -= j10;
        }
    }

    public final void k(byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        l(source, 0, source.length);
    }

    public final void l(byte[] source, int i7, int i10) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j6 = i10;
        AbstractC0555b.d(source.length, i7, j6);
        int i11 = i10 + i7;
        while (i7 < i11) {
            z zVarH = h(1);
            int iMin = Math.min(i11 - i7, 8192 - zVarH.f7393c);
            int i12 = i7 + iMin;
            C1846m.e(source, zVarH.f7393c, zVarH.f7391a, i7, i12);
            zVarH.f7393c += iMin;
            i7 = i12;
        }
        this.f7358b += j6;
    }

    public final void m(int i7) {
        z zVarH = h(1);
        int i10 = zVarH.f7393c;
        zVarH.f7393c = i10 + 1;
        zVarH.f7391a[i10] = (byte) i7;
        this.f7358b++;
    }

    public final void n(long j6) {
        boolean z3;
        byte[] bArr;
        if (j6 == 0) {
            m(48);
            return;
        }
        int i7 = 1;
        if (j6 < 0) {
            j6 = -j6;
            if (j6 < 0) {
                v("-9223372036854775808");
                return;
            }
            z3 = true;
        } else {
            z3 = false;
        }
        if (j6 < 100000000) {
            if (j6 < DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM) {
                if (j6 >= 100) {
                    i7 = j6 < 1000 ? 3 : 4;
                } else if (j6 >= 10) {
                    i7 = 2;
                }
            } else if (j6 < 1000000) {
                i7 = j6 < 100000 ? 5 : 6;
            } else {
                i7 = j6 < 10000000 ? 7 : 8;
            }
        } else if (j6 < 1000000000000L) {
            if (j6 < 10000000000L) {
                i7 = j6 < 1000000000 ? 9 : 10;
            } else {
                i7 = j6 < 100000000000L ? 11 : 12;
            }
        } else if (j6 < 1000000000000000L) {
            if (j6 < 10000000000000L) {
                i7 = 13;
            } else {
                i7 = j6 < 100000000000000L ? 14 : 15;
            }
        } else if (j6 < 100000000000000000L) {
            i7 = j6 < 10000000000000000L ? 16 : 17;
        } else {
            i7 = j6 < 1000000000000000000L ? 18 : 19;
        }
        if (z3) {
            i7++;
        }
        z zVarH = h(i7);
        int i10 = zVarH.f7393c + i7;
        while (true) {
            bArr = zVarH.f7391a;
            if (j6 == 0) {
                break;
            }
            long j10 = 10;
            i10--;
            bArr[i10] = Qg.a.f7850a[(int) (j6 % j10)];
            j6 /= j10;
        }
        if (z3) {
            bArr[i10 - 1] = 45;
        }
        zVarH.f7393c += i7;
        this.f7358b += (long) i7;
    }

    public final void o(long j6) {
        if (j6 == 0) {
            m(48);
            return;
        }
        long j10 = (j6 >>> 1) | j6;
        long j11 = j10 | (j10 >>> 2);
        long j12 = j11 | (j11 >>> 4);
        long j13 = j12 | (j12 >>> 8);
        long j14 = j13 | (j13 >>> 16);
        long j15 = j14 | (j14 >>> 32);
        long j16 = j15 - ((j15 >>> 1) & 6148914691236517205L);
        long j17 = ((j16 >>> 2) & 3689348814741910323L) + (j16 & 3689348814741910323L);
        long j18 = ((j17 >>> 4) + j17) & 1085102592571150095L;
        long j19 = j18 + (j18 >>> 8);
        long j20 = j19 + (j19 >>> 16);
        int i7 = (int) ((((j20 & 63) + ((j20 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        z zVarH = h(i7);
        int i10 = zVarH.f7393c;
        for (int i11 = (i10 + i7) - 1; i11 >= i10; i11--) {
            zVarH.f7391a[i11] = Qg.a.f7850a[(int) (15 & j6)];
            j6 >>>= 4;
        }
        zVarH.f7393c += i7;
        this.f7358b += (long) i7;
    }

    @Override // okio.BufferedSink
    public final OutputStream outputStream() {
        return new j(this, 0);
    }

    public final void p(int i7) {
        z zVarH = h(4);
        int i10 = zVarH.f7393c;
        byte[] bArr = zVarH.f7391a;
        bArr[i10] = (byte) ((i7 >>> 24) & 255);
        bArr[i10 + 1] = (byte) ((i7 >>> 16) & 255);
        bArr[i10 + 2] = (byte) ((i7 >>> 8) & 255);
        bArr[i10 + 3] = (byte) (i7 & 255);
        zVarH.f7393c = i10 + 4;
        this.f7358b += 4;
    }

    @Override // okio.BufferedSource
    public final BufferedSource peek() {
        return AbstractC0555b.c(new v(this));
    }

    public final void q(long j6) {
        z zVarH = h(8);
        int i7 = zVarH.f7393c;
        byte[] bArr = zVarH.f7391a;
        bArr[i7] = (byte) ((j6 >>> 56) & 255);
        bArr[i7 + 1] = (byte) ((j6 >>> 48) & 255);
        bArr[i7 + 2] = (byte) ((j6 >>> 40) & 255);
        bArr[i7 + 3] = (byte) ((j6 >>> 32) & 255);
        bArr[i7 + 4] = (byte) ((j6 >>> 24) & 255);
        bArr[i7 + 5] = (byte) ((j6 >>> 16) & 255);
        bArr[i7 + 6] = (byte) ((j6 >>> 8) & 255);
        bArr[i7 + 7] = (byte) (j6 & 255);
        zVarH.f7393c = i7 + 8;
        this.f7358b += 8;
    }

    public final void r(int i7) {
        z zVarH = h(2);
        int i10 = zVarH.f7393c;
        byte[] bArr = zVarH.f7391a;
        bArr[i10] = (byte) ((i7 >>> 8) & 255);
        bArr[i10 + 1] = (byte) (i7 & 255);
        zVarH.f7393c = i10 + 2;
        this.f7358b += 2;
    }

    @Override // okio.BufferedSource
    public final boolean rangeEquals(long j6, m bytes, int i7, int i10) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (j6 < 0 || i7 < 0 || i10 < 0 || this.f7358b - j6 < i10 || bytes.d() - i7 < i10) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (e(((long) i11) + j6) != bytes.g(i7 + i11)) {
                return false;
            }
        }
        return true;
    }

    @Override // okio.Source
    public final long read(k sink, long j6) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j6 < 0) {
            throw new IllegalArgumentException(androidx.camera.video.u.i(j6, "byteCount < 0: ").toString());
        }
        long j10 = this.f7358b;
        if (j10 == 0) {
            return -1L;
        }
        if (j6 > j10) {
            j6 = j10;
        }
        sink.write(this, j6);
        return j6;
    }

    @Override // okio.BufferedSource
    public final long readAll(Sink sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j6 = this.f7358b;
        if (j6 > 0) {
            sink.write(this, j6);
        }
        return j6;
    }

    @Override // okio.BufferedSource
    public final byte readByte() {
        if (this.f7358b == 0) {
            throw new EOFException();
        }
        z zVar = this.f7357a;
        Intrinsics.e(zVar);
        int i7 = zVar.f7392b;
        int i10 = zVar.f7393c;
        int i11 = i7 + 1;
        byte b7 = zVar.f7391a[i7];
        this.f7358b--;
        if (i11 != i10) {
            zVar.f7392b = i11;
            return b7;
        }
        this.f7357a = zVar.a();
        A.a(zVar);
        return b7;
    }

    @Override // okio.BufferedSource
    public final byte[] readByteArray() {
        return readByteArray(this.f7358b);
    }

    @Override // okio.BufferedSource
    public final m readByteString() {
        return readByteString(this.f7358b);
    }

    @Override // okio.BufferedSource
    public final long readDecimalLong() throws EOFException {
        byte b7;
        long j6 = 0;
        if (this.f7358b == 0) {
            throw new EOFException();
        }
        int i7 = 0;
        boolean z3 = false;
        long j10 = 0;
        long j11 = -7;
        boolean z8 = false;
        loop0: while (true) {
            z zVar = this.f7357a;
            Intrinsics.e(zVar);
            int i10 = zVar.f7392b;
            int i11 = zVar.f7393c;
            while (true) {
                if (i10 >= i11) {
                    j6 = j6;
                    break;
                }
                b7 = zVar.f7391a[i10];
                if (b7 < 48 || b7 > 57) {
                    j6 = j6;
                    if (b7 != 45 || i7 != 0) {
                        z8 = true;
                        break;
                    }
                    j11--;
                    z3 = true;
                } else {
                    int i12 = 48 - b7;
                    if (j10 < -922337203685477580L || (j10 == -922337203685477580L && i12 < j11)) {
                        break loop0;
                    }
                    j10 = (j10 * 10) + ((long) i12);
                }
                i10++;
                i7++;
                j6 = j6;
            }
            if (i10 == i11) {
                this.f7357a = zVar.a();
                A.a(zVar);
            } else {
                zVar.f7392b = i10;
            }
            if (z8 || this.f7357a == null) {
                long j12 = this.f7358b - ((long) i7);
                this.f7358b = j12;
                if (i7 >= (z3 ? 2 : 1)) {
                    return z3 ? j10 : -j10;
                }
                if (j12 == j6) {
                    throw new EOFException();
                }
                StringBuilder sbT = G.t(z3 ? "Expected a digit" : "Expected a digit or '-'", " but was 0x");
                sbT.append(AbstractC0555b.n(e(j6)));
                throw new NumberFormatException(sbT.toString());
            }
            j6 = j6;
        }
        k kVar = new k();
        kVar.n(j10);
        kVar.m(b7);
        if (!z3) {
            kVar.readByte();
        }
        throw new NumberFormatException("Number too large: ".concat(kVar.readUtf8()));
    }

    @Override // okio.BufferedSource
    public final void readFully(k sink, long j6) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j10 = this.f7358b;
        if (j10 >= j6) {
            sink.write(this, j6);
        } else {
            sink.write(this, j10);
            throw new EOFException();
        }
    }

    @Override // okio.BufferedSource
    public final long readHexadecimalUnsignedLong() throws EOFException {
        int i7;
        if (this.f7358b == 0) {
            throw new EOFException();
        }
        int i10 = 0;
        boolean z3 = false;
        long j6 = 0;
        do {
            z zVar = this.f7357a;
            Intrinsics.e(zVar);
            int i11 = zVar.f7392b;
            int i12 = zVar.f7393c;
            while (i11 < i12) {
                byte b7 = zVar.f7391a[i11];
                if (b7 >= 48 && b7 <= 57) {
                    i7 = b7 - 48;
                } else if (b7 >= 97 && b7 <= 102) {
                    i7 = b7 - 87;
                } else {
                    if (b7 < 65 || b7 > 70) {
                        if (i10 == 0) {
                            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(AbstractC0555b.n(b7)));
                        }
                        z3 = true;
                        break;
                    }
                    i7 = b7 - 55;
                }
                if (((-1152921504606846976L) & j6) != 0) {
                    k kVar = new k();
                    kVar.o(j6);
                    kVar.m(b7);
                    throw new NumberFormatException("Number too large: ".concat(kVar.readUtf8()));
                }
                j6 = (j6 << 4) | ((long) i7);
                i11++;
                i10++;
            }
            if (i11 == i12) {
                this.f7357a = zVar.a();
                A.a(zVar);
            } else {
                zVar.f7392b = i11;
            }
            if (z3) {
                break;
            }
        } while (this.f7357a != null);
        this.f7358b -= (long) i10;
        return j6;
    }

    @Override // okio.BufferedSource
    public final int readInt() throws EOFException {
        if (this.f7358b < 4) {
            throw new EOFException();
        }
        z zVar = this.f7357a;
        Intrinsics.e(zVar);
        int i7 = zVar.f7392b;
        int i10 = zVar.f7393c;
        if (i10 - i7 < 4) {
            return ((readByte() & UnsignedBytes.MAX_VALUE) << 24) | ((readByte() & UnsignedBytes.MAX_VALUE) << 16) | ((readByte() & UnsignedBytes.MAX_VALUE) << 8) | (readByte() & UnsignedBytes.MAX_VALUE);
        }
        byte[] bArr = zVar.f7391a;
        int i11 = i7 + 3;
        int i12 = ((bArr[i7 + 1] & UnsignedBytes.MAX_VALUE) << 16) | ((bArr[i7] & UnsignedBytes.MAX_VALUE) << 24) | ((bArr[i7 + 2] & UnsignedBytes.MAX_VALUE) << 8);
        int i13 = i7 + 4;
        int i14 = i12 | (bArr[i11] & UnsignedBytes.MAX_VALUE);
        this.f7358b -= 4;
        if (i13 != i10) {
            zVar.f7392b = i13;
            return i14;
        }
        this.f7357a = zVar.a();
        A.a(zVar);
        return i14;
    }

    @Override // okio.BufferedSource
    public final int readIntLe() {
        return AbstractC0555b.f(readInt());
    }

    @Override // okio.BufferedSource
    public final long readLong() throws EOFException {
        if (this.f7358b < 8) {
            throw new EOFException();
        }
        z zVar = this.f7357a;
        Intrinsics.e(zVar);
        int i7 = zVar.f7392b;
        int i10 = zVar.f7393c;
        if (i10 - i7 < 8) {
            return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        }
        byte[] bArr = zVar.f7391a;
        int i11 = i7 + 7;
        long j6 = ((((long) bArr[i7 + 3]) & 255) << 32) | ((((long) bArr[i7]) & 255) << 56) | ((((long) bArr[i7 + 1]) & 255) << 48) | ((((long) bArr[i7 + 2]) & 255) << 40) | ((((long) bArr[i7 + 4]) & 255) << 24) | ((((long) bArr[i7 + 5]) & 255) << 16) | ((((long) bArr[i7 + 6]) & 255) << 8);
        int i12 = i7 + 8;
        long j10 = j6 | (((long) bArr[i11]) & 255);
        this.f7358b -= 8;
        if (i12 != i10) {
            zVar.f7392b = i12;
            return j10;
        }
        this.f7357a = zVar.a();
        A.a(zVar);
        return j10;
    }

    @Override // okio.BufferedSource
    public final long readLongLe() {
        return AbstractC0555b.g(readLong());
    }

    @Override // okio.BufferedSource
    public final short readShort() throws EOFException {
        if (this.f7358b < 2) {
            throw new EOFException();
        }
        z zVar = this.f7357a;
        Intrinsics.e(zVar);
        int i7 = zVar.f7392b;
        int i10 = zVar.f7393c;
        if (i10 - i7 < 2) {
            return (short) (((readByte() & UnsignedBytes.MAX_VALUE) << 8) | (readByte() & UnsignedBytes.MAX_VALUE));
        }
        int i11 = i7 + 1;
        byte[] bArr = zVar.f7391a;
        int i12 = (bArr[i7] & UnsignedBytes.MAX_VALUE) << 8;
        int i13 = i7 + 2;
        int i14 = (bArr[i11] & UnsignedBytes.MAX_VALUE) | i12;
        this.f7358b -= 2;
        if (i13 == i10) {
            this.f7357a = zVar.a();
            A.a(zVar);
        } else {
            zVar.f7392b = i13;
        }
        return (short) i14;
    }

    @Override // okio.BufferedSource
    public final short readShortLe() throws EOFException {
        short s3 = readShort();
        return (short) (((s3 & 255) << 8) | ((65280 & s3) >>> 8));
    }

    @Override // okio.BufferedSource
    public final String readString(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return readString(this.f7358b, charset);
    }

    @Override // okio.BufferedSource
    public final String readUtf8() {
        return readString(this.f7358b, Charsets.UTF_8);
    }

    @Override // okio.BufferedSource
    public final int readUtf8CodePoint() {
        int i7;
        int i10;
        int i11;
        if (this.f7358b == 0) {
            throw new EOFException();
        }
        byte bE = e(0L);
        if ((bE & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
            i7 = bE & Ascii.DEL;
            i11 = 0;
            i10 = 1;
        } else if ((bE & 224) == 192) {
            i7 = bE & Ascii.US;
            i10 = 2;
            i11 = 128;
        } else if ((bE & 240) == 224) {
            i7 = bE & Ascii.SI;
            i10 = 3;
            i11 = 2048;
        } else {
            if ((bE & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i7 = bE & 7;
            i10 = 4;
            i11 = 65536;
        }
        long j6 = i10;
        if (this.f7358b < j6) {
            StringBuilder sbE = androidx.camera.camera2.internal.F.e(i10, "size < ", ": ");
            sbE.append(this.f7358b);
            sbE.append(" (to read code point prefixed 0x");
            sbE.append(AbstractC0555b.n(bE));
            sbE.append(')');
            throw new EOFException(sbE.toString());
        }
        for (int i12 = 1; i12 < i10; i12++) {
            long j10 = i12;
            byte bE2 = e(j10);
            if ((bE2 & 192) != 128) {
                skip(j10);
                return 65533;
            }
            i7 = (i7 << 6) | (bE2 & 63);
        }
        skip(j6);
        if (i7 > 1114111) {
            return 65533;
        }
        if ((55296 > i7 || i7 >= 57344) && i7 >= i11) {
            return i7;
        }
        return 65533;
    }

    @Override // okio.BufferedSource
    public final String readUtf8Line() {
        long jIndexOf = indexOf((byte) 10);
        if (jIndexOf != -1) {
            return Qg.a.b(this, jIndexOf);
        }
        long j6 = this.f7358b;
        if (j6 != 0) {
            return readString(j6, Charsets.UTF_8);
        }
        return null;
    }

    @Override // okio.BufferedSource
    public final String readUtf8LineStrict() {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public final boolean request(long j6) {
        return this.f7358b >= j6;
    }

    @Override // okio.BufferedSource
    public final void require(long j6) throws EOFException {
        if (this.f7358b < j6) {
            throw new EOFException();
        }
    }

    public final void s(String string, int i7, int i10, Charset charset) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (i7 < 0) {
            throw new IllegalArgumentException(G.m(i7, "beginIndex < 0: ").toString());
        }
        if (i10 < i7) {
            throw new IllegalArgumentException(androidx.camera.video.u.h(i10, "endIndex < beginIndex: ", i7, " < ").toString());
        }
        if (i10 > string.length()) {
            StringBuilder sbE = androidx.camera.camera2.internal.F.e(i10, "endIndex > string.length: ", " > ");
            sbE.append(string.length());
            throw new IllegalArgumentException(sbE.toString().toString());
        }
        if (Intrinsics.c(charset, Charsets.UTF_8)) {
            u(i7, i10, string);
            return;
        }
        String strSubstring = string.substring(i7, i10);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        byte[] bytes = strSubstring.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        l(bytes, 0, bytes.length);
    }

    @Override // okio.BufferedSource
    public final int select(u options) throws EOFException {
        Intrinsics.checkNotNullParameter(options, "options");
        int iC = Qg.a.c(this, options, false);
        if (iC == -1) {
            return -1;
        }
        skip(options.f7377b[iC].d());
        return iC;
    }

    @Override // okio.BufferedSource
    public final void skip(long j6) throws EOFException {
        while (j6 > 0) {
            z zVar = this.f7357a;
            if (zVar == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j6, zVar.f7393c - zVar.f7392b);
            long j10 = iMin;
            this.f7358b -= j10;
            j6 -= j10;
            int i7 = zVar.f7392b + iMin;
            zVar.f7392b = i7;
            if (i7 == zVar.f7393c) {
                this.f7357a = zVar.a();
                A.a(zVar);
            }
        }
    }

    public final void t(String string, Charset charset) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        s(string, 0, string.length(), charset);
    }

    @Override // okio.Source
    public final F timeout() {
        return F.NONE;
    }

    public final String toString() {
        long j6 = this.f7358b;
        if (j6 <= 2147483647L) {
            return g((int) j6).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f7358b).toString());
    }

    public final void u(int i7, int i10, String string) {
        char cCharAt;
        Intrinsics.checkNotNullParameter(string, "string");
        if (i7 < 0) {
            throw new IllegalArgumentException(G.m(i7, "beginIndex < 0: ").toString());
        }
        if (i10 < i7) {
            throw new IllegalArgumentException(androidx.camera.video.u.h(i10, "endIndex < beginIndex: ", i7, " < ").toString());
        }
        if (i10 > string.length()) {
            StringBuilder sbE = androidx.camera.camera2.internal.F.e(i10, "endIndex > string.length: ", " > ");
            sbE.append(string.length());
            throw new IllegalArgumentException(sbE.toString().toString());
        }
        while (i7 < i10) {
            char cCharAt2 = string.charAt(i7);
            if (cCharAt2 < 128) {
                z zVarH = h(1);
                int i11 = zVarH.f7393c - i7;
                int iMin = Math.min(i10, 8192 - i11);
                int i12 = i7 + 1;
                byte[] bArr = zVarH.f7391a;
                bArr[i7 + i11] = (byte) cCharAt2;
                while (true) {
                    i7 = i12;
                    if (i7 >= iMin || (cCharAt = string.charAt(i7)) >= 128) {
                        break;
                    }
                    i12 = i7 + 1;
                    bArr[i7 + i11] = (byte) cCharAt;
                }
                int i13 = zVarH.f7393c;
                int i14 = (i11 + i7) - i13;
                zVarH.f7393c = i13 + i14;
                this.f7358b += (long) i14;
            } else {
                if (cCharAt2 < 2048) {
                    z zVarH2 = h(2);
                    int i15 = zVarH2.f7393c;
                    byte b7 = (byte) ((cCharAt2 >> 6) | JfifUtil.MARKER_SOFn);
                    byte[] bArr2 = zVarH2.f7391a;
                    bArr2[i15] = b7;
                    bArr2[i15 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    zVarH2.f7393c = i15 + 2;
                    this.f7358b += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    z zVarH3 = h(3);
                    int i16 = zVarH3.f7393c;
                    byte[] bArr3 = zVarH3.f7391a;
                    bArr3[i16] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i16 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i16 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    zVarH3.f7393c = i16 + 3;
                    this.f7358b += 3;
                } else {
                    int i17 = i7 + 1;
                    char cCharAt3 = i17 < i10 ? string.charAt(i17) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        m(63);
                        i7 = i17;
                    } else {
                        int i18 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        z zVarH4 = h(4);
                        int i19 = zVarH4.f7393c;
                        byte[] bArr4 = zVarH4.f7391a;
                        bArr4[i19] = (byte) ((i18 >> 18) | 240);
                        bArr4[i19 + 1] = (byte) (((i18 >> 12) & 63) | 128);
                        bArr4[i19 + 2] = (byte) (((i18 >> 6) & 63) | 128);
                        bArr4[i19 + 3] = (byte) ((i18 & 63) | 128);
                        zVarH4.f7393c = i19 + 4;
                        this.f7358b += 4;
                        i7 += 2;
                    }
                }
                i7++;
            }
        }
    }

    public final void v(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        u(0, string.length(), string);
    }

    public final void w(int i7) {
        String str;
        int i10 = 0;
        if (i7 < 128) {
            m(i7);
            return;
        }
        if (i7 < 2048) {
            z zVarH = h(2);
            int i11 = zVarH.f7393c;
            byte b7 = (byte) ((i7 >> 6) | JfifUtil.MARKER_SOFn);
            byte[] bArr = zVarH.f7391a;
            bArr[i11] = b7;
            bArr[1 + i11] = (byte) ((i7 & 63) | 128);
            zVarH.f7393c = i11 + 2;
            this.f7358b += 2;
            return;
        }
        if (55296 <= i7 && i7 < 57344) {
            m(63);
            return;
        }
        if (i7 < 65536) {
            z zVarH2 = h(3);
            int i12 = zVarH2.f7393c;
            byte[] bArr2 = zVarH2.f7391a;
            bArr2[i12] = (byte) ((i7 >> 12) | 224);
            bArr2[1 + i12] = (byte) (((i7 >> 6) & 63) | 128);
            bArr2[2 + i12] = (byte) ((i7 & 63) | 128);
            zVarH2.f7393c = i12 + 3;
            this.f7358b += 3;
            return;
        }
        if (i7 <= 1114111) {
            z zVarH3 = h(4);
            int i13 = zVarH3.f7393c;
            byte[] bArr3 = zVarH3.f7391a;
            bArr3[i13] = (byte) ((i7 >> 18) | 240);
            bArr3[1 + i13] = (byte) (((i7 >> 12) & 63) | 128);
            bArr3[2 + i13] = (byte) (((i7 >> 6) & 63) | 128);
            bArr3[3 + i13] = (byte) ((i7 & 63) | 128);
            zVarH3.f7393c = i13 + 4;
            this.f7358b += 4;
            return;
        }
        StringBuilder sb2 = new StringBuilder("Unexpected code point: 0x");
        if (i7 != 0) {
            char[] cArr = Qg.b.f7851a;
            char[] cArr2 = {cArr[(i7 >> 28) & 15], cArr[(i7 >> 24) & 15], cArr[(i7 >> 20) & 15], cArr[(i7 >> 16) & 15], cArr[(i7 >> 12) & 15], cArr[(i7 >> 8) & 15], cArr[(i7 >> 4) & 15], cArr[i7 & 15]};
            while (i10 < 8 && cArr2[i10] == '0') {
                i10++;
            }
            Intrinsics.checkNotNullParameter(cArr2, "<this>");
            AbstractC1836c.f38922a.checkBoundsIndexes$kotlin_stdlib(i10, 8, 8);
            str = new String(cArr2, i10, 8 - i10);
        } else {
            str = "0";
        }
        sb2.append(str);
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink write(m mVar) {
        i(mVar);
        return this;
    }

    @Override // okio.BufferedSink
    public final long writeAll(Source source) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        long j6 = 0;
        while (true) {
            long j10 = source.read(this, 8192L);
            if (j10 == -1) {
                return j6;
            }
            j6 += j10;
        }
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink writeByte(int i7) {
        m(i7);
        return this;
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink writeDecimalLong(long j6) {
        n(j6);
        return this;
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink writeHexadecimalUnsignedLong(long j6) {
        o(j6);
        return this;
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink writeInt(int i7) {
        p(i7);
        return this;
    }

    @Override // okio.BufferedSink
    public final BufferedSink writeIntLe(int i7) {
        p(AbstractC0555b.f(i7));
        return this;
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink writeLong(long j6) {
        q(j6);
        return this;
    }

    @Override // okio.BufferedSink
    public final BufferedSink writeLongLe(long j6) {
        q(AbstractC0555b.g(j6));
        return this;
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink writeShort(int i7) {
        r(i7);
        return this;
    }

    @Override // okio.BufferedSink
    public final BufferedSink writeShortLe(int i7) {
        short s3 = (short) i7;
        r((short) (((s3 & 255) << 8) | ((65280 & s3) >>> 8)));
        return this;
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink writeString(String str, int i7, int i10, Charset charset) {
        s(str, i7, i10, charset);
        return this;
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink writeUtf8(String str) {
        v(str);
        return this;
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink writeUtf8CodePoint(int i7) {
        w(i7);
        return this;
    }

    @Override // okio.BufferedSource
    public final long indexOfElement(m targetBytes, long j6) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        long j10 = 0;
        if (j6 < 0) {
            throw new IllegalArgumentException(androidx.camera.video.u.i(j6, "fromIndex < 0: ").toString());
        }
        z zVar = this.f7357a;
        if (zVar == null) {
            return -1L;
        }
        long j11 = this.f7358b;
        if (j11 - j6 < j6) {
            while (j11 > j6) {
                zVar = zVar.f7397g;
                Intrinsics.e(zVar);
                j11 -= (long) (zVar.f7393c - zVar.f7392b);
            }
            if (targetBytes.d() == 2) {
                byte bG = targetBytes.g(0);
                byte bG2 = targetBytes.g(1);
                while (j11 < this.f7358b) {
                    int i7 = zVar.f7393c;
                    for (int i10 = (int) ((((long) zVar.f7392b) + j6) - j11); i10 < i7; i10++) {
                        byte b7 = zVar.f7391a[i10];
                        if (b7 == bG || b7 == bG2) {
                            return ((long) (i10 - zVar.f7392b)) + j11;
                        }
                    }
                    j11 += (long) (zVar.f7393c - zVar.f7392b);
                    zVar = zVar.f7396f;
                    Intrinsics.e(zVar);
                    j6 = j11;
                }
            } else {
                byte[] bArrF = targetBytes.f();
                while (j11 < this.f7358b) {
                    int i11 = zVar.f7393c;
                    for (int i12 = (int) ((((long) zVar.f7392b) + j6) - j11); i12 < i11; i12++) {
                        byte b10 = zVar.f7391a[i12];
                        for (byte b11 : bArrF) {
                            if (b10 == b11) {
                                return ((long) (i12 - zVar.f7392b)) + j11;
                            }
                        }
                    }
                    j11 += (long) (zVar.f7393c - zVar.f7392b);
                    zVar = zVar.f7396f;
                    Intrinsics.e(zVar);
                    j6 = j11;
                }
            }
            return -1L;
        }
        while (true) {
            long j12 = ((long) (zVar.f7393c - zVar.f7392b)) + j10;
            if (j12 > j6) {
                break;
            }
            zVar = zVar.f7396f;
            Intrinsics.e(zVar);
            j10 = j12;
        }
        if (targetBytes.d() == 2) {
            byte bG3 = targetBytes.g(0);
            byte bG4 = targetBytes.g(1);
            while (j10 < this.f7358b) {
                int i13 = zVar.f7393c;
                for (int i14 = (int) ((((long) zVar.f7392b) + j6) - j10); i14 < i13; i14++) {
                    byte b12 = zVar.f7391a[i14];
                    if (b12 == bG3 || b12 == bG4) {
                        return ((long) (i14 - zVar.f7392b)) + j10;
                    }
                }
                j10 += (long) (zVar.f7393c - zVar.f7392b);
                zVar = zVar.f7396f;
                Intrinsics.e(zVar);
                j6 = j10;
            }
        } else {
            byte[] bArrF2 = targetBytes.f();
            while (j10 < this.f7358b) {
                int i15 = zVar.f7393c;
                for (int i16 = (int) ((((long) zVar.f7392b) + j6) - j10); i16 < i15; i16++) {
                    byte b13 = zVar.f7391a[i16];
                    for (byte b14 : bArrF2) {
                        if (b13 == b14) {
                            return ((long) (i16 - zVar.f7392b)) + j10;
                        }
                    }
                }
                j10 += (long) (zVar.f7393c - zVar.f7392b);
                zVar = zVar.f7396f;
                Intrinsics.e(zVar);
                j6 = j10;
            }
        }
        return -1L;
    }

    @Override // okio.BufferedSource
    public final String readString(long j6, Charset charset) throws EOFException {
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (j6 < 0 || j6 > 2147483647L) {
            throw new IllegalArgumentException(androidx.camera.video.u.i(j6, "byteCount: ").toString());
        }
        if (this.f7358b < j6) {
            throw new EOFException();
        }
        if (j6 == 0) {
            return "";
        }
        z zVar = this.f7357a;
        Intrinsics.e(zVar);
        int i7 = zVar.f7392b;
        if (((long) i7) + j6 > zVar.f7393c) {
            return new String(readByteArray(j6), charset);
        }
        int i10 = (int) j6;
        String str = new String(zVar.f7391a, i7, i10, charset);
        int i11 = zVar.f7392b + i10;
        zVar.f7392b = i11;
        this.f7358b -= j6;
        if (i11 == zVar.f7393c) {
            this.f7357a = zVar.a();
            A.a(zVar);
        }
        return str;
    }

    @Override // okio.BufferedSource
    public final String readUtf8(long j6) {
        return readString(j6, Charsets.UTF_8);
    }

    @Override // okio.BufferedSource
    public final String readUtf8LineStrict(long j6) throws EOFException {
        if (j6 < 0) {
            throw new IllegalArgumentException(androidx.camera.video.u.i(j6, "limit < 0: ").toString());
        }
        long j10 = j6 != Long.MAX_VALUE ? j6 + 1 : Long.MAX_VALUE;
        long jIndexOf = indexOf((byte) 10, 0L, j10);
        if (jIndexOf != -1) {
            return Qg.a.b(this, jIndexOf);
        }
        if (j10 < this.f7358b && e(j10 - 1) == 13 && e(j10) == 10) {
            return Qg.a.b(this, j10);
        }
        k kVar = new k();
        d(kVar, 0L, Math.min(32, this.f7358b));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f7358b, j6) + " content=" + kVar.readByteString(kVar.f7358b).e() + (char) 8230);
    }

    @Override // okio.BufferedSink
    public final BufferedSink write(m byteString, int i7, int i10) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.m(this, i7, i10);
        return this;
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink writeString(String str, Charset charset) {
        t(str, charset);
        return this;
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink writeUtf8(String str, int i7, int i10) {
        u(i7, i10, str);
        return this;
    }

    @Override // okio.BufferedSource
    public final byte[] readByteArray(long j6) throws EOFException {
        if (j6 < 0 || j6 > 2147483647L) {
            throw new IllegalArgumentException(androidx.camera.video.u.i(j6, "byteCount: ").toString());
        }
        if (this.f7358b >= j6) {
            byte[] bArr = new byte[(int) j6];
            readFully(bArr);
            return bArr;
        }
        throw new EOFException();
    }

    @Override // okio.BufferedSource
    public final m readByteString(long j6) throws EOFException {
        if (j6 < 0 || j6 > 2147483647L) {
            throw new IllegalArgumentException(androidx.camera.video.u.i(j6, "byteCount: ").toString());
        }
        if (this.f7358b < j6) {
            throw new EOFException();
        }
        if (j6 >= 4096) {
            m mVarG = g((int) j6);
            skip(j6);
            return mVarG;
        }
        return new m(readByteArray(j6));
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink write(Source source, long j6) {
        j(source, j6);
        return this;
    }

    @Override // okio.BufferedSource
    public final boolean rangeEquals(long j6, m bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return rangeEquals(j6, bytes, 0, bytes.d());
    }

    @Override // okio.BufferedSource
    public final void readFully(byte[] sink) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        int i7 = 0;
        while (i7 < sink.length) {
            int i10 = read(sink, i7, sink.length - i7);
            if (i10 == -1) {
                throw new EOFException();
            }
            i7 += i10;
        }
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink write(byte[] bArr) {
        k(bArr);
        return this;
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink write(byte[] bArr, int i7, int i10) {
        l(bArr, i7, i10);
        return this;
    }

    @Override // okio.Sink
    public final void write(k source, long j6) {
        z zVarB;
        Intrinsics.checkNotNullParameter(source, "source");
        if (source != this) {
            AbstractC0555b.d(source.f7358b, 0L, j6);
            while (j6 > 0) {
                z zVar = source.f7357a;
                Intrinsics.e(zVar);
                int i7 = zVar.f7393c;
                z zVar2 = source.f7357a;
                Intrinsics.e(zVar2);
                long j10 = i7 - zVar2.f7392b;
                int i10 = 0;
                if (j6 < j10) {
                    z zVar3 = this.f7357a;
                    z zVar4 = zVar3 != null ? zVar3.f7397g : null;
                    if (zVar4 != null && zVar4.f7395e) {
                        if ((((long) zVar4.f7393c) + j6) - ((long) (zVar4.f7394d ? 0 : zVar4.f7392b)) <= 8192) {
                            z zVar5 = source.f7357a;
                            Intrinsics.e(zVar5);
                            zVar5.d(zVar4, (int) j6);
                            source.f7358b -= j6;
                            this.f7358b += j6;
                            return;
                        }
                    }
                    z zVar6 = source.f7357a;
                    Intrinsics.e(zVar6);
                    int i11 = (int) j6;
                    if (i11 > 0 && i11 <= zVar6.f7393c - zVar6.f7392b) {
                        if (i11 >= 1024) {
                            zVarB = zVar6.c();
                        } else {
                            zVarB = A.b();
                            int i12 = zVar6.f7392b;
                            C1846m.e(zVar6.f7391a, 0, zVarB.f7391a, i12, i12 + i11);
                        }
                        zVarB.f7393c = zVarB.f7392b + i11;
                        zVar6.f7392b += i11;
                        z zVar7 = zVar6.f7397g;
                        Intrinsics.e(zVar7);
                        zVar7.b(zVarB);
                        source.f7357a = zVarB;
                    } else {
                        throw new IllegalArgumentException("byteCount out of range");
                    }
                }
                z zVar8 = source.f7357a;
                Intrinsics.e(zVar8);
                long j11 = zVar8.f7393c - zVar8.f7392b;
                source.f7357a = zVar8.a();
                z zVar9 = this.f7357a;
                if (zVar9 == null) {
                    this.f7357a = zVar8;
                    zVar8.f7397g = zVar8;
                    zVar8.f7396f = zVar8;
                } else {
                    z zVar10 = zVar9.f7397g;
                    Intrinsics.e(zVar10);
                    zVar10.b(zVar8);
                    z zVar11 = zVar8.f7397g;
                    if (zVar11 != zVar8) {
                        Intrinsics.e(zVar11);
                        if (zVar11.f7395e) {
                            int i13 = zVar8.f7393c - zVar8.f7392b;
                            z zVar12 = zVar8.f7397g;
                            Intrinsics.e(zVar12);
                            int i14 = 8192 - zVar12.f7393c;
                            z zVar13 = zVar8.f7397g;
                            Intrinsics.e(zVar13);
                            if (!zVar13.f7394d) {
                                z zVar14 = zVar8.f7397g;
                                Intrinsics.e(zVar14);
                                i10 = zVar14.f7392b;
                            }
                            if (i13 <= i14 + i10) {
                                z zVar15 = zVar8.f7397g;
                                Intrinsics.e(zVar15);
                                zVar8.d(zVar15, i13);
                                zVar8.a();
                                A.a(zVar8);
                            }
                        }
                    } else {
                        throw new IllegalStateException("cannot compact");
                    }
                }
                source.f7358b -= j11;
                this.f7358b += j11;
                j6 -= j11;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        z zVar = this.f7357a;
        if (zVar == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), zVar.f7393c - zVar.f7392b);
        sink.put(zVar.f7391a, zVar.f7392b, iMin);
        int i7 = zVar.f7392b + iMin;
        zVar.f7392b = i7;
        this.f7358b -= (long) iMin;
        if (i7 == zVar.f7393c) {
            this.f7357a = zVar.a();
            A.a(zVar);
        }
        return iMin;
    }

    @Override // okio.BufferedSource
    public final int read(byte[] sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        return read(sink, 0, sink.length);
    }

    @Override // okio.BufferedSource
    public final int read(byte[] sink, int i7, int i10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        AbstractC0555b.d(sink.length, i7, i10);
        z zVar = this.f7357a;
        if (zVar == null) {
            return -1;
        }
        int iMin = Math.min(i10, zVar.f7393c - zVar.f7392b);
        int i11 = zVar.f7392b;
        C1846m.e(zVar.f7391a, i7, sink, i11, i11 + iMin);
        int i12 = zVar.f7392b + iMin;
        zVar.f7392b = i12;
        this.f7358b -= (long) iMin;
        if (i12 == zVar.f7393c) {
            this.f7357a = zVar.a();
            A.a(zVar);
        }
        return iMin;
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    public final k buffer() {
        return this;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // okio.BufferedSink
    public final BufferedSink emit() {
        return this;
    }

    @Override // okio.BufferedSink
    public final BufferedSink emitCompleteSegments() {
        return this;
    }

    @Override // okio.BufferedSink, okio.Sink, java.io.Flushable
    public final void flush() {
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    public final k getBuffer() {
        return this;
    }

    @Override // okio.BufferedSource
    public final long indexOf(m bytes, long j6) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (bytes.d() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long j10 = 0;
        if (j6 >= 0) {
            z zVar = this.f7357a;
            if (zVar == null) {
                return -1L;
            }
            long j11 = this.f7358b;
            if (j11 - j6 < j6) {
                while (j11 > j6) {
                    zVar = zVar.f7397g;
                    Intrinsics.e(zVar);
                    j11 -= (long) (zVar.f7393c - zVar.f7392b);
                }
                byte[] bArrF = bytes.f();
                byte b7 = bArrF[0];
                int iD = bytes.d();
                long j12 = (this.f7358b - ((long) iD)) + 1;
                while (j11 < j12) {
                    int iMin = (int) Math.min(zVar.f7393c, (((long) zVar.f7392b) + j12) - j11);
                    for (int i7 = (int) ((((long) zVar.f7392b) + j6) - j11); i7 < iMin; i7++) {
                        if (zVar.f7391a[i7] == b7 && Qg.a.a(zVar, i7 + 1, bArrF, iD)) {
                            return ((long) (i7 - zVar.f7392b)) + j11;
                        }
                    }
                    j11 += (long) (zVar.f7393c - zVar.f7392b);
                    zVar = zVar.f7396f;
                    Intrinsics.e(zVar);
                    j6 = j11;
                }
                return -1L;
            }
            while (true) {
                long j13 = ((long) (zVar.f7393c - zVar.f7392b)) + j10;
                if (j13 > j6) {
                    break;
                }
                zVar = zVar.f7396f;
                Intrinsics.e(zVar);
                j10 = j13;
            }
            byte[] bArrF2 = bytes.f();
            byte b10 = bArrF2[0];
            int iD2 = bytes.d();
            long j14 = (this.f7358b - ((long) iD2)) + 1;
            while (j10 < j14) {
                int iMin2 = (int) Math.min(zVar.f7393c, (((long) zVar.f7392b) + j14) - j10);
                for (int i10 = (int) ((((long) zVar.f7392b) + j6) - j10); i10 < iMin2; i10++) {
                    if (zVar.f7391a[i10] == b10 && Qg.a.a(zVar, i10 + 1, bArrF2, iD2)) {
                        return ((long) (i10 - zVar.f7392b)) + j10;
                    }
                }
                j10 += (long) (zVar.f7393c - zVar.f7392b);
                zVar = zVar.f7396f;
                Intrinsics.e(zVar);
                j6 = j10;
            }
            return -1L;
        }
        throw new IllegalArgumentException(androidx.camera.video.u.i(j6, "fromIndex < 0: ").toString());
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        Intrinsics.checkNotNullParameter(source, "source");
        int iRemaining = source.remaining();
        int i7 = iRemaining;
        while (i7 > 0) {
            z zVarH = h(1);
            int iMin = Math.min(i7, 8192 - zVarH.f7393c);
            source.get(zVarH.f7391a, zVarH.f7393c, iMin);
            i7 -= iMin;
            zVarH.f7393c += iMin;
        }
        this.f7358b += (long) iRemaining;
        return iRemaining;
    }

    @Override // okio.BufferedSource
    public final long indexOf(byte b7) {
        return indexOf(b7, 0L, Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public final long indexOf(byte b7, long j6) {
        return indexOf(b7, j6, Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public final long indexOf(m bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return indexOf(bytes, 0L);
    }
}

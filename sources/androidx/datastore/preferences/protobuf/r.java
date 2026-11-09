package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1137s f16758b;

    public static int b(int i7) {
        return (-(i7 & 1)) ^ (i7 >>> 1);
    }

    public static long c(long j6) {
        return (-(j6 & 1)) ^ (j6 >>> 1);
    }

    public static C1126o f(byte[] bArr, int i7, int i10, boolean z3) {
        C1126o c1126o = new C1126o(bArr, i7, i10, z3);
        try {
            c1126o.j(i10);
            return c1126o;
        } catch (C1160z1 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static r g(InputStream inputStream) {
        if (inputStream != null) {
            return new C1129p(inputStream);
        }
        byte[] bArr = AbstractC1154x1.f16809b;
        return f(bArr, 0, bArr.length, false);
    }

    public static r h(ByteBuffer byteBuffer, boolean z3) {
        if (byteBuffer.hasArray()) {
            return f(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), z3);
        }
        if (byteBuffer.isDirect() && w2.f16803d) {
            return new C1132q(byteBuffer, z3);
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.duplicate().get(bArr);
        return f(bArr, 0, iRemaining, true);
    }

    public static int t(int i7, InputStream inputStream) throws IOException {
        if ((i7 & 128) == 0) {
            return i7;
        }
        int i10 = i7 & 127;
        int i11 = 7;
        while (i11 < 32) {
            int i12 = inputStream.read();
            if (i12 == -1) {
                throw C1160z1.g();
            }
            i10 |= (i12 & 127) << i11;
            if ((i12 & 128) == 0) {
                return i10;
            }
            i11 += 7;
        }
        while (i11 < 64) {
            int i13 = inputStream.read();
            if (i13 == -1) {
                throw C1160z1.g();
            }
            if ((i13 & 128) == 0) {
                return i10;
            }
            i11 += 7;
        }
        throw C1160z1.d();
    }

    public abstract int A();

    public abstract int B();

    public abstract long C();

    public abstract boolean D(int i7);

    public final void E() {
        boolean zD;
        do {
            int iA = A();
            if (iA == 0) {
                return;
            }
            int i7 = this.f16757a;
            if (i7 >= 100) {
                throw new C1160z1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f16757a = i7 + 1;
            zD = D(iA);
            this.f16757a--;
        } while (zD);
    }

    public abstract void a(int i7);

    public abstract int d();

    public abstract boolean e();

    public abstract void i(int i7);

    public abstract int j(int i7);

    public abstract boolean k();

    public abstract C1120m l();

    public abstract double m();

    public abstract int n();

    public abstract int o();

    public abstract long p();

    public abstract float q();

    public abstract int r();

    public abstract long s();

    public abstract int u();

    public abstract long v();

    public abstract int w();

    public abstract long x();

    public abstract String y();

    public abstract String z();
}

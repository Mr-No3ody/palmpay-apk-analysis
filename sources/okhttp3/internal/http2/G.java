package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.C1846m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class G implements Closeable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f40790f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pg.w f40791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Pg.k f40792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f40793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f40794d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1936g f40795e;

    static {
        new F(null);
        f40790f = Logger.getLogger(AbstractC1938i.class.getName());
    }

    public G(Pg.w sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f40791a = sink;
        Pg.k kVar = new Pg.k();
        this.f40792b = kVar;
        this.f40793c = 16384;
        this.f40795e = new C1936g(kVar);
    }

    public final synchronized void a(K peerSettings) {
        try {
            Intrinsics.checkNotNullParameter(peerSettings, "peerSettings");
            if (this.f40794d) {
                throw new IOException("closed");
            }
            int i7 = this.f40793c;
            int i10 = peerSettings.f40799a;
            if ((i10 & 32) != 0) {
                i7 = peerSettings.f40800b[5];
            }
            this.f40793c = i7;
            if (((i10 & 2) != 0 ? peerSettings.f40800b[1] : -1) != -1) {
                C1936g c1936g = this.f40795e;
                int i11 = (i10 & 2) != 0 ? peerSettings.f40800b[1] : -1;
                c1936g.getClass();
                int iMin = Math.min(i11, 16384);
                int i12 = c1936g.f40831d;
                if (i12 != iMin) {
                    if (iMin < i12) {
                        c1936g.f40829b = Math.min(c1936g.f40829b, iMin);
                    }
                    c1936g.f40830c = true;
                    c1936g.f40831d = iMin;
                    int i13 = c1936g.f40835h;
                    if (iMin < i13) {
                        if (iMin == 0) {
                            C1934e[] c1934eArr = c1936g.f40832e;
                            C1846m.i(c1934eArr, null, 0, c1934eArr.length);
                            c1936g.f40833f = c1936g.f40832e.length - 1;
                            c1936g.f40834g = 0;
                            c1936g.f40835h = 0;
                        } else {
                            c1936g.a(i13 - iMin);
                        }
                    }
                }
            }
            c(0, 0, 4, 1);
            this.f40791a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(boolean z3, int i7, Pg.k kVar, int i10) {
        if (this.f40794d) {
            throw new IOException("closed");
        }
        c(i7, i10, 0, z3 ? 1 : 0);
        if (i10 > 0) {
            Intrinsics.e(kVar);
            this.f40791a.write(kVar, i10);
        }
    }

    public final void c(int i7, int i10, int i11, int i12) {
        Level level = Level.FINE;
        Logger logger = f40790f;
        if (logger.isLoggable(level)) {
            logger.fine(AbstractC1938i.a(false, i7, i10, i11, i12));
        }
        if (i10 > this.f40793c) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f40793c + ": " + i10).toString());
        }
        if ((Integer.MIN_VALUE & i7) != 0) {
            throw new IllegalArgumentException(C0.G.m(i7, "reserved bit set: ").toString());
        }
        byte[] bArr = Dg.c.f1879a;
        Pg.w wVar = this.f40791a;
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        wVar.writeByte((i10 >>> 16) & 255);
        wVar.writeByte((i10 >>> 8) & 255);
        wVar.writeByte(i10 & 255);
        wVar.writeByte(i11 & 255);
        wVar.writeByte(i12 & 255);
        wVar.writeInt(i7 & Integer.MAX_VALUE);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f40794d = true;
        this.f40791a.close();
    }

    public final synchronized void d(int i7, EnumC1932c errorCode, byte[] debugData) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(debugData, "debugData");
        if (this.f40794d) {
            throw new IOException("closed");
        }
        if (errorCode.f40811a == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        c(0, debugData.length + 8, 7, 0);
        this.f40791a.writeInt(i7);
        this.f40791a.writeInt(errorCode.f40811a);
        if (debugData.length != 0) {
            this.f40791a.write(debugData);
        }
        this.f40791a.flush();
    }

    public final synchronized void e(int i7, List headerBlock, boolean z3) {
        Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
        if (this.f40794d) {
            throw new IOException("closed");
        }
        this.f40795e.d(headerBlock);
        long j6 = this.f40792b.f7358b;
        long jMin = Math.min(this.f40793c, j6);
        int i10 = j6 == jMin ? 4 : 0;
        if (z3) {
            i10 |= 1;
        }
        c(i7, (int) jMin, 1, i10);
        this.f40791a.write(this.f40792b, jMin);
        if (j6 > jMin) {
            long j10 = j6 - jMin;
            while (j10 > 0) {
                long jMin2 = Math.min(this.f40793c, j10);
                j10 -= jMin2;
                c(i7, (int) jMin2, 9, j10 == 0 ? 4 : 0);
                this.f40791a.write(this.f40792b, jMin2);
            }
        }
    }

    public final synchronized void f(boolean z3, int i7, int i10) {
        if (this.f40794d) {
            throw new IOException("closed");
        }
        c(0, 8, 6, z3 ? 1 : 0);
        this.f40791a.writeInt(i7);
        this.f40791a.writeInt(i10);
        this.f40791a.flush();
    }

    public final synchronized void flush() {
        if (this.f40794d) {
            throw new IOException("closed");
        }
        this.f40791a.flush();
    }

    public final synchronized void g(int i7, EnumC1932c errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (this.f40794d) {
            throw new IOException("closed");
        }
        if (errorCode.f40811a == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        c(i7, 4, 3, 0);
        this.f40791a.writeInt(errorCode.f40811a);
        this.f40791a.flush();
    }

    public final synchronized void h(int i7, long j6) {
        if (this.f40794d) {
            throw new IOException("closed");
        }
        if (j6 == 0 || j6 > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j6).toString());
        }
        c(i7, 4, 8, 0);
        this.f40791a.writeInt((int) j6);
        this.f40791a.flush();
    }
}

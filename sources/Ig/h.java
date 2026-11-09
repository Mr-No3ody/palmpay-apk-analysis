package Ig;

import Pg.A;
import Pg.AbstractC0555b;
import Pg.F;
import Pg.k;
import Pg.p;
import Pg.w;
import Pg.z;
import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.jvm.internal.Intrinsics;
import okio.Sink;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements Sink {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4435a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f4437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f4438d;

    public h(k sink, Deflater deflater) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(deflater, "deflater");
        w sink2 = AbstractC0555b.b(sink);
        Intrinsics.checkNotNullParameter(sink2, "sink");
        Intrinsics.checkNotNullParameter(deflater, "deflater");
        this.f4437c = sink2;
        this.f4438d = deflater;
    }

    public void a(boolean z3) throws IOException {
        z zVarH;
        int iDeflate;
        w wVar = (w) this.f4437c;
        k kVar = wVar.f7386b;
        while (true) {
            zVarH = kVar.h(1);
            Deflater deflater = (Deflater) this.f4438d;
            byte[] bArr = zVarH.f7391a;
            if (z3) {
                try {
                    int i7 = zVarH.f7393c;
                    iDeflate = deflater.deflate(bArr, i7, 8192 - i7, 2);
                } catch (NullPointerException e10) {
                    throw new IOException("Deflater already closed", e10);
                }
            } else {
                int i10 = zVarH.f7393c;
                iDeflate = deflater.deflate(bArr, i10, 8192 - i10);
            }
            if (iDeflate > 0) {
                zVarH.f7393c += iDeflate;
                kVar.f7358b += (long) iDeflate;
                wVar.emitCompleteSegments();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (zVarH.f7392b == zVarH.f7393c) {
            kVar.f7357a = zVarH.a();
            A.a(zVarH);
        }
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f4435a) {
            case 0:
                if (this.f4436b) {
                    return;
                }
                this.f4436b = true;
                j jVar = (j) this.f4438d;
                j.a(jVar, (p) this.f4437c);
                jVar.f4444e = 3;
                return;
            default:
                Deflater deflater = (Deflater) this.f4438d;
                if (this.f4436b) {
                    return;
                }
                deflater.finish();
                a(false);
                th = null;
                try {
                    deflater.end();
                    break;
                } catch (Throwable th) {
                    if (th == null) {
                        th = th;
                    }
                }
                try {
                    ((w) this.f4437c).close();
                    break;
                } catch (Throwable th2) {
                    if (th == null) {
                        th = th2;
                    }
                }
                this.f4436b = true;
                if (th != null) {
                    throw th;
                }
                return;
        }
    }

    @Override // okio.Sink, java.io.Flushable
    public final void flush() {
        switch (this.f4435a) {
            case 0:
                if (!this.f4436b) {
                    ((j) this.f4438d).f4443d.flush();
                    break;
                }
                break;
            default:
                a(true);
                ((w) this.f4437c).flush();
                break;
        }
    }

    @Override // okio.Sink
    public final F timeout() {
        switch (this.f4435a) {
            case 0:
                return (p) this.f4437c;
            default:
                return ((w) this.f4437c).f7385a.timeout();
        }
    }

    public String toString() {
        switch (this.f4435a) {
            case 1:
                return "DeflaterSink(" + ((w) this.f4437c) + ')';
            default:
                return super.toString();
        }
    }

    @Override // okio.Sink
    public final void write(k source, long j6) {
        Object obj = this.f4438d;
        switch (this.f4435a) {
            case 0:
                Intrinsics.checkNotNullParameter(source, "source");
                if (this.f4436b) {
                    throw new IllegalStateException("closed");
                }
                long j10 = source.f7358b;
                byte[] bArr = Dg.c.f1879a;
                if (j6 < 0 || 0 > j10 || j10 < j6) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                ((j) obj).f4443d.write(source, j6);
                return;
            default:
                Intrinsics.checkNotNullParameter(source, "source");
                AbstractC0555b.d(source.f7358b, 0L, j6);
                while (j6 > 0) {
                    z zVar = source.f7357a;
                    Intrinsics.e(zVar);
                    int iMin = (int) Math.min(j6, zVar.f7393c - zVar.f7392b);
                    ((Deflater) obj).setInput(zVar.f7391a, zVar.f7392b, iMin);
                    a(false);
                    long j11 = iMin;
                    source.f7358b -= j11;
                    int i7 = zVar.f7392b + iMin;
                    zVar.f7392b = i7;
                    if (i7 == zVar.f7393c) {
                        source.f7357a = zVar.a();
                        A.a(zVar);
                    }
                    j6 -= j11;
                }
                return;
        }
    }

    public h(j jVar) {
        this.f4438d = jVar;
        this.f4437c = new p(jVar.f4443d.f7385a.timeout());
    }
}

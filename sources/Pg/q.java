package Pg;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;
import okio.Source;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements Source {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f7366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f7367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Inflater f7368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f7369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CRC32 f7370e;

    public q(Source source) {
        Intrinsics.checkNotNullParameter(source, "source");
        x xVar = new x(source);
        this.f7367b = xVar;
        Inflater inflater = new Inflater(true);
        this.f7368c = inflater;
        this.f7369d = new r(xVar, inflater);
        this.f7370e = new CRC32();
    }

    public static void a(int i7, int i10, String str) throws IOException {
        if (i10 != i7) {
            throw new IOException(com.airbnb.lottie.model.layer.d.n(new Object[]{str, Integer.valueOf(i10), Integer.valueOf(i7)}, 3, "%s: actual 0x%08x != expected 0x%08x", "format(this, *args)"));
        }
    }

    public final void b(k kVar, long j6, long j10) {
        z zVar = kVar.f7357a;
        Intrinsics.e(zVar);
        while (true) {
            long j11 = zVar.f7393c - zVar.f7392b;
            if (j6 < j11) {
                break;
            }
            j6 -= j11;
            zVar = zVar.f7396f;
            Intrinsics.e(zVar);
        }
        while (j10 > 0) {
            int i7 = (int) (((long) zVar.f7392b) + j6);
            int iMin = (int) Math.min(zVar.f7393c - i7, j10);
            this.f7370e.update(zVar.f7391a, i7, iMin);
            j10 -= (long) iMin;
            zVar = zVar.f7396f;
            Intrinsics.e(zVar);
            j6 = 0;
        }
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f7369d.close();
    }

    @Override // okio.Source
    public final long read(k sink, long j6) throws IOException {
        q qVar = this;
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j6 < 0) {
            throw new IllegalArgumentException(androidx.camera.video.u.i(j6, "byteCount < 0: ").toString());
        }
        if (j6 == 0) {
            return 0L;
        }
        byte b7 = qVar.f7366a;
        CRC32 crc32 = qVar.f7370e;
        x xVar = qVar.f7367b;
        if (b7 == 0) {
            xVar.require(10L);
            k kVar = xVar.f7389b;
            byte bE = kVar.e(3L);
            boolean z3 = ((bE >> 1) & 1) == 1;
            if (z3) {
                qVar.b(kVar, 0L, 10L);
            }
            a(8075, xVar.readShort(), "ID1ID2");
            xVar.skip(8L);
            if (((bE >> 2) & 1) == 1) {
                xVar.require(2L);
                if (z3) {
                    b(kVar, 0L, 2L);
                }
                long shortLe = kVar.readShortLe() & 65535;
                xVar.require(shortLe);
                if (z3) {
                    b(kVar, 0L, shortLe);
                }
                xVar.skip(shortLe);
            }
            if (((bE >> 3) & 1) == 1) {
                long jIndexOf = xVar.indexOf((byte) 0);
                if (jIndexOf == -1) {
                    throw new EOFException();
                }
                if (z3) {
                    b(kVar, 0L, jIndexOf + 1);
                }
                xVar.skip(jIndexOf + 1);
            }
            if (((bE >> 4) & 1) == 1) {
                long jIndexOf2 = xVar.indexOf((byte) 0);
                if (jIndexOf2 == -1) {
                    throw new EOFException();
                }
                if (z3) {
                    qVar = this;
                    qVar.b(kVar, 0L, jIndexOf2 + 1);
                } else {
                    qVar = this;
                }
                xVar.skip(jIndexOf2 + 1);
            } else {
                qVar = this;
            }
            if (z3) {
                a(xVar.readShortLe(), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            qVar.f7366a = (byte) 1;
        }
        if (qVar.f7366a == 1) {
            long j10 = sink.f7358b;
            long j11 = qVar.f7369d.read(sink, j6);
            if (j11 != -1) {
                qVar.b(sink, j10, j11);
                return j11;
            }
            qVar.f7366a = (byte) 2;
        }
        if (qVar.f7366a == 2) {
            a(xVar.readIntLe(), (int) crc32.getValue(), "CRC");
            a(xVar.readIntLe(), (int) qVar.f7368c.getBytesWritten(), "ISIZE");
            qVar.f7366a = (byte) 3;
            if (!xVar.exhausted()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // okio.Source
    public final F timeout() {
        return this.f7367b.f7388a.timeout();
    }
}

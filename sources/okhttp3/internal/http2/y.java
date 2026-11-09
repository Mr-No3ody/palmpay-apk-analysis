package okhttp3.internal.http2;

import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import okio.Source;

/* JADX INFO: loaded from: classes4.dex */
public final class y implements Source {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pg.x f40903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f40904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f40905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f40906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f40907e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f40908f;

    public y(Pg.x source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f40903a = source;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // okio.Source
    public final long read(Pg.k sink, long j6) throws IOException {
        int i7;
        int i10;
        Intrinsics.checkNotNullParameter(sink, "sink");
        do {
            int i11 = this.f40907e;
            Pg.x xVar = this.f40903a;
            if (i11 == 0) {
                xVar.skip(this.f40908f);
                this.f40908f = 0;
                if ((this.f40905c & 4) == 0) {
                    i7 = this.f40906d;
                    int iU = Dg.c.u(xVar);
                    this.f40907e = iU;
                    this.f40904b = iU;
                    int i12 = xVar.readByte() & UnsignedBytes.MAX_VALUE;
                    this.f40905c = xVar.readByte() & UnsignedBytes.MAX_VALUE;
                    x xVar2 = z.f40909d;
                    if (xVar2.getLogger().isLoggable(Level.FINE)) {
                        Logger logger = xVar2.getLogger();
                        Pg.m mVar = AbstractC1938i.f40838a;
                        logger.fine(AbstractC1938i.a(true, this.f40906d, this.f40904b, i12, this.f40905c));
                    }
                    i10 = xVar.readInt() & Integer.MAX_VALUE;
                    this.f40906d = i10;
                    if (i12 != 9) {
                        throw new IOException(androidx.camera.video.u.g(i12, " != TYPE_CONTINUATION"));
                    }
                }
            } else {
                long j10 = xVar.read(sink, Math.min(j6, i11));
                if (j10 != -1) {
                    this.f40907e -= (int) j10;
                    return j10;
                }
            }
            return -1L;
        } while (i10 == i7);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // okio.Source
    public final Pg.F timeout() {
        return this.f40903a.f7388a.timeout();
    }
}

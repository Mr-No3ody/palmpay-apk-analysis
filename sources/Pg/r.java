package Pg;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;
import okio.Source;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements Source {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f7371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Inflater f7372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f7374d;

    public r(x source, Inflater inflater) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f7371a = source;
        this.f7372b = inflater;
    }

    public final long a(k sink, long j6) throws IOException {
        Inflater inflater = this.f7372b;
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j6 < 0) {
            throw new IllegalArgumentException(androidx.camera.video.u.i(j6, "byteCount < 0: ").toString());
        }
        if (this.f7374d) {
            throw new IllegalStateException("closed");
        }
        if (j6 != 0) {
            try {
                z zVarH = sink.h(1);
                int iMin = (int) Math.min(j6, 8192 - zVarH.f7393c);
                boolean zNeedsInput = inflater.needsInput();
                x xVar = this.f7371a;
                if (zNeedsInput && !xVar.exhausted()) {
                    z zVar = xVar.f7389b.f7357a;
                    Intrinsics.e(zVar);
                    int i7 = zVar.f7393c;
                    int i10 = zVar.f7392b;
                    int i11 = i7 - i10;
                    this.f7373c = i11;
                    inflater.setInput(zVar.f7391a, i10, i11);
                }
                int iInflate = inflater.inflate(zVarH.f7391a, zVarH.f7393c, iMin);
                int i12 = this.f7373c;
                if (i12 != 0) {
                    int remaining = i12 - inflater.getRemaining();
                    this.f7373c -= remaining;
                    xVar.skip(remaining);
                }
                if (iInflate > 0) {
                    zVarH.f7393c += iInflate;
                    long j10 = iInflate;
                    sink.f7358b += j10;
                    return j10;
                }
                if (zVarH.f7392b == zVarH.f7393c) {
                    sink.f7357a = zVarH.a();
                    A.a(zVarH);
                }
            } catch (DataFormatException e10) {
                throw new IOException(e10);
            }
        }
        return 0L;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f7374d) {
            return;
        }
        this.f7372b.end();
        this.f7374d = true;
        this.f7371a.close();
    }

    @Override // okio.Source
    public final long read(k sink, long j6) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        do {
            long jA = a(sink, j6);
            if (jA > 0) {
                return jA;
            }
            Inflater inflater = this.f7372b;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.f7371a.exhausted());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // okio.Source
    public final F timeout() {
        return this.f7371a.f7388a.timeout();
    }
}

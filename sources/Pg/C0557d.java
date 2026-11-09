package Pg;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okio.Sink;

/* JADX INFO: renamed from: Pg.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0557d implements Sink {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7340a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f7342c;

    public C0557d(OutputStream out, F timeout) {
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.f7341b = out;
        this.f7342c = timeout;
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Object obj = this.f7341b;
        switch (this.f7340a) {
            case 0:
                Sink sink = (Sink) this.f7342c;
                C0559f c0559f = (C0559f) obj;
                c0559f.enter();
                try {
                    try {
                        sink.close();
                        Unit unit = Unit.f38893a;
                        if (c0559f.exit()) {
                            throw c0559f.access$newTimeoutException(null);
                        }
                        return;
                    } catch (IOException e10) {
                        if (!c0559f.exit()) {
                            throw e10;
                        }
                        throw c0559f.access$newTimeoutException(e10);
                    }
                } catch (Throwable th) {
                    c0559f.exit();
                    throw th;
                }
            default:
                ((OutputStream) obj).close();
                return;
        }
    }

    @Override // okio.Sink, java.io.Flushable
    public final void flush() throws IOException {
        Object obj = this.f7341b;
        switch (this.f7340a) {
            case 0:
                Sink sink = (Sink) this.f7342c;
                C0559f c0559f = (C0559f) obj;
                c0559f.enter();
                try {
                    try {
                        sink.flush();
                        Unit unit = Unit.f38893a;
                        if (c0559f.exit()) {
                            throw c0559f.access$newTimeoutException(null);
                        }
                        return;
                    } catch (IOException e10) {
                        if (!c0559f.exit()) {
                            throw e10;
                        }
                        throw c0559f.access$newTimeoutException(e10);
                    }
                } catch (Throwable th) {
                    c0559f.exit();
                    throw th;
                }
            default:
                ((OutputStream) obj).flush();
                return;
        }
    }

    @Override // okio.Sink
    public final F timeout() {
        switch (this.f7340a) {
            case 0:
                return (C0559f) this.f7341b;
            default:
                return (F) this.f7342c;
        }
    }

    public final String toString() {
        switch (this.f7340a) {
            case 0:
                return "AsyncTimeout.sink(" + ((Sink) this.f7342c) + ')';
            default:
                return "sink(" + ((OutputStream) this.f7341b) + ')';
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00a1 A[LOOP:1: B:12:0x0069->B:25:0x00a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x00a3 A[SYNTHETIC] */
    @Override // okio.Sink
    public final void write(k source, long j6) throws IOException {
        long j10;
        C0559f c0559f;
        Object obj = this.f7341b;
        Object obj2 = this.f7342c;
        int i7 = this.f7340a;
        Intrinsics.checkNotNullParameter(source, "source");
        switch (i7) {
            case 0:
                AbstractC0555b.d(source.f7358b, 0L, j6);
                for (long j11 = j6; j11 > 0; j11 -= j10) {
                    z zVar = source.f7357a;
                    Intrinsics.e(zVar);
                    j10 = 0;
                    try {
                        try {
                            while (j10 < 65536) {
                                j10 += (long) (zVar.f7393c - zVar.f7392b);
                                if (j10 >= j11) {
                                    j10 = j11;
                                    Sink sink = (Sink) obj2;
                                    c0559f = (C0559f) obj;
                                    c0559f.enter();
                                    sink.write(source, j10);
                                    Unit unit = Unit.f38893a;
                                    if (!c0559f.exit()) {
                                        throw c0559f.access$newTimeoutException(null);
                                    }
                                } else {
                                    zVar = zVar.f7396f;
                                    Intrinsics.e(zVar);
                                }
                            }
                            sink.write(source, j10);
                            Unit unit2 = Unit.f38893a;
                            if (!c0559f.exit()) {
                                throw c0559f.access$newTimeoutException(null);
                            }
                        } catch (IOException e10) {
                            if (!c0559f.exit()) {
                                throw e10;
                            }
                            throw c0559f.access$newTimeoutException(e10);
                        }
                    } catch (Throwable th) {
                        c0559f.exit();
                        throw th;
                    }
                    Sink sink2 = (Sink) obj2;
                    c0559f = (C0559f) obj;
                    c0559f.enter();
                }
                return;
            default:
                AbstractC0555b.d(source.f7358b, 0L, j6);
                long j12 = j6;
                while (j12 > 0) {
                    ((F) obj2).throwIfReached();
                    z zVar2 = source.f7357a;
                    Intrinsics.e(zVar2);
                    int iMin = (int) Math.min(j12, zVar2.f7393c - zVar2.f7392b);
                    ((OutputStream) obj).write(zVar2.f7391a, zVar2.f7392b, iMin);
                    int i10 = zVar2.f7392b + iMin;
                    zVar2.f7392b = i10;
                    long j13 = iMin;
                    j12 -= j13;
                    source.f7358b -= j13;
                    if (i10 == zVar2.f7393c) {
                        source.f7357a = zVar2.a();
                        A.a(zVar2);
                    }
                }
                return;
        }
    }

    public C0557d(C0559f c0559f, Sink sink) {
        this.f7341b = c0559f;
        this.f7342c = sink;
    }
}

package Pg;

import java.io.IOException;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okio.Source;

/* JADX INFO: renamed from: Pg.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0558e implements Source {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7343a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f7345c;

    public C0558e(InputStream input, F timeout) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.f7344b = input;
        this.f7345c = timeout;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Object obj = this.f7344b;
        switch (this.f7343a) {
            case 0:
                Source source = (Source) this.f7345c;
                C0559f c0559f = (C0559f) obj;
                c0559f.enter();
                try {
                    try {
                        source.close();
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
                ((InputStream) obj).close();
                return;
        }
    }

    @Override // okio.Source
    public final long read(k sink, long j6) throws IOException {
        switch (this.f7343a) {
            case 0:
                Intrinsics.checkNotNullParameter(sink, "sink");
                Source source = (Source) this.f7345c;
                C0559f c0559f = (C0559f) this.f7344b;
                c0559f.enter();
                try {
                    try {
                        long j10 = source.read(sink, j6);
                        if (c0559f.exit()) {
                            throw c0559f.access$newTimeoutException(null);
                        }
                        return j10;
                    } catch (IOException e10) {
                        if (c0559f.exit()) {
                            throw c0559f.access$newTimeoutException(e10);
                        }
                        throw e10;
                    }
                } catch (Throwable th) {
                    c0559f.exit();
                    throw th;
                }
            default:
                Intrinsics.checkNotNullParameter(sink, "sink");
                if (j6 == 0) {
                    return 0L;
                }
                if (j6 < 0) {
                    throw new IllegalArgumentException(androidx.camera.video.u.i(j6, "byteCount < 0: ").toString());
                }
                try {
                    ((F) this.f7345c).throwIfReached();
                    z zVarH = sink.h(1);
                    int i7 = ((InputStream) this.f7344b).read(zVarH.f7391a, zVarH.f7393c, (int) Math.min(j6, 8192 - zVarH.f7393c));
                    if (i7 == -1) {
                        if (zVarH.f7392b == zVarH.f7393c) {
                            sink.f7357a = zVarH.a();
                            A.a(zVarH);
                        }
                        return -1L;
                    }
                    zVarH.f7393c += i7;
                    long j11 = i7;
                    sink.f7358b += j11;
                    return j11;
                } catch (AssertionError e11) {
                    if (AbstractC0555b.e(e11)) {
                        throw new IOException(e11);
                    }
                    throw e11;
                }
        }
    }

    @Override // okio.Source
    public final F timeout() {
        switch (this.f7343a) {
            case 0:
                return (C0559f) this.f7344b;
            default:
                return (F) this.f7345c;
        }
    }

    public final String toString() {
        switch (this.f7343a) {
            case 0:
                return "AsyncTimeout.source(" + ((Source) this.f7345c) + ')';
            default:
                return "source(" + ((InputStream) this.f7344b) + ')';
        }
    }

    public C0558e(C0559f c0559f, Source source) {
        this.f7344b = c0559f;
        this.f7345c = source;
    }
}

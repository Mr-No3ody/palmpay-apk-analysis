package Pg;

import java.io.EOFException;
import kotlin.jvm.internal.Intrinsics;
import okio.Sink;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements Sink {
    @Override // okio.Sink
    public final F timeout() {
        return F.NONE;
    }

    @Override // okio.Sink
    public final void write(k source, long j6) throws EOFException {
        Intrinsics.checkNotNullParameter(source, "source");
        source.skip(j6);
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // okio.Sink, java.io.Flushable
    public final void flush() {
    }
}

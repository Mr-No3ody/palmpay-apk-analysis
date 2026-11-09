package Pg;

import kotlin.jvm.internal.Intrinsics;
import okio.Sink;

/* JADX INFO: loaded from: classes4.dex */
public abstract class n implements Sink {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Sink f7364a;

    public n(Sink delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f7364a = delegate;
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f7364a.close();
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() {
        this.f7364a.flush();
    }

    @Override // okio.Sink
    public final F timeout() {
        return this.f7364a.timeout();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f7364a + ')';
    }

    @Override // okio.Sink
    public void write(k source, long j6) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f7364a.write(source, j6);
    }
}

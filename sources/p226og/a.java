package p226og;

import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicLong f40541a = new AtomicLong(0);

    @Override // java.io.OutputStream
    public final void write(int i7) {
        this.f40541a.addAndGet(1L);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f40541a.addAndGet(bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i7, int i10) {
        this.f40541a.addAndGet(i10);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
    }
}

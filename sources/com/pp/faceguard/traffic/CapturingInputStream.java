package com.pp.faceguard.traffic;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class CapturingInputStream extends InputStream {
    private final ByteArrayOutputStream captured;
    private final AtomicBoolean completed = new AtomicBoolean();
    private final InputStream delegate;
    private final Runnable onComplete;

    public CapturingInputStream(InputStream inputStream, ByteArrayOutputStream byteArrayOutputStream, Runnable runnable) {
        this.delegate = inputStream;
        this.captured = byteArrayOutputStream;
        this.onComplete = runnable;
    }

    private void complete() {
        if (this.completed.compareAndSet(false, true)) {
            this.onComplete.run();
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            this.delegate.close();
        } finally {
            complete();
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int i7 = this.delegate.read();
        if (i7 == -1) {
            complete();
            return i7;
        }
        this.captured.write(i7);
        return i7;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i7, int i10) throws IOException {
        int i11 = this.delegate.read(bArr, i7, i10);
        if (i11 == -1) {
            complete();
            return i11;
        }
        if (i11 > 0) {
            this.captured.write(bArr, i7, i11);
        }
        return i11;
    }
}

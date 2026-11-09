package com.pp.faceguard.traffic;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class CapturingOutputStream extends OutputStream {
    private final ByteArrayOutputStream captured;
    private final OutputStream delegate;

    public CapturingOutputStream(OutputStream outputStream, ByteArrayOutputStream byteArrayOutputStream) {
        this.delegate = outputStream;
        this.captured = byteArrayOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.delegate.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i7) throws IOException {
        this.delegate.write(i7);
        this.captured.write(i7);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i7, int i10) throws IOException {
        this.delegate.write(bArr, i7, i10);
        this.captured.write(bArr, i7, i10);
    }
}

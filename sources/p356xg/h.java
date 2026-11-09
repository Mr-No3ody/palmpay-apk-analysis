package p356xg;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f44001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public OutputStream f44002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f44003c;

    @Override // java.io.OutputStream
    public final void write(int i7) throws IOException {
        write(new byte[]{(byte) i7}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i7, int i10) throws IOException {
        if (!this.f44003c) {
            this.f44002b.write(bArr, i7, i10);
            this.f44001a += (long) i10;
            return;
        }
        throw new IllegalStateException("ZipEntryOutputStream is closed");
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}

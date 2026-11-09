package p213o2;

import java.io.FilterOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class b extends FilterOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f40017a;

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i7, int i10) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i7, i10);
        this.f40017a += (long) i10;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i7) throws IOException {
        ((FilterOutputStream) this).out.write(i7);
        this.f40017a++;
    }
}

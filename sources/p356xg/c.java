package p356xg;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f43995a;

    public c(b bVar) {
        this.f43995a = bVar;
    }

    public void a() {
        this.f43995a.a();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f43995a.close();
    }

    @Override // java.io.OutputStream
    public void write(int i7) throws IOException {
        write(new byte[]{(byte) i7});
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i7, int i10) throws IOException {
        this.f43995a.write(bArr, i7, i10);
    }
}

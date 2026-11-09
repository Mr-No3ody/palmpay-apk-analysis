package J1;

import com.bumptech.glide.load.resource.bitmap.y;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class f extends InputStream {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ArrayDeque f4458c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y f4459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IOException f4460b;

    static {
        char[] cArr = o.f4478a;
        f4458c = new ArrayDeque(0);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f4459a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f4459a.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i7) {
        this.f4459a.mark(i7);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        this.f4459a.getClass();
        return true;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        try {
            return this.f4459a.read();
        } catch (IOException e10) {
            this.f4460b = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.f4459a.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j6) throws IOException {
        try {
            return this.f4459a.skip(j6);
        } catch (IOException e10) {
            this.f4460b = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        try {
            return this.f4459a.read(bArr);
        } catch (IOException e10) {
            this.f4460b = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i7, int i10) throws IOException {
        try {
            return this.f4459a.read(bArr, i7, i10);
        } catch (IOException e10) {
            this.f4460b = e10;
            throw e10;
        }
    }
}

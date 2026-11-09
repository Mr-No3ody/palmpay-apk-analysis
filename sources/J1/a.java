package J1;

import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class a extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f4449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4450b = -1;

    public a(ByteBuffer byteBuffer) {
        this.f4449a = byteBuffer;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f4449a.remaining();
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i7) {
        this.f4450b = this.f4449a.position();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        ByteBuffer byteBuffer = this.f4449a;
        if (byteBuffer.hasRemaining()) {
            return byteBuffer.get() & UnsignedBytes.MAX_VALUE;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        int i7 = this.f4450b;
        if (i7 == -1) {
            throw new IOException("Cannot reset to unset mark position");
        }
        this.f4449a.position(i7);
    }

    @Override // java.io.InputStream
    public final long skip(long j6) {
        ByteBuffer byteBuffer = this.f4449a;
        if (!byteBuffer.hasRemaining()) {
            return -1L;
        }
        long jMin = Math.min(j6, byteBuffer.remaining());
        byteBuffer.position((int) (((long) byteBuffer.position()) + jMin));
        return jMin;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i7, int i10) {
        ByteBuffer byteBuffer = this.f4449a;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        int iMin = Math.min(i10, byteBuffer.remaining());
        byteBuffer.get(bArr, i7, iMin);
        return iMin;
    }
}

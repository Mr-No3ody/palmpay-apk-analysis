package J1;

import androidx.camera.video.u;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class e extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4457b;

    public e(InputStream inputStream, long j6) {
        super(inputStream);
        this.f4456a = j6;
    }

    public final void a(int i7) throws IOException {
        if (i7 >= 0) {
            this.f4457b += i7;
            return;
        }
        long j6 = this.f4457b;
        long j10 = this.f4456a;
        if (j10 - j6 <= 0) {
            return;
        }
        StringBuilder sbR = u.r(j10, "Failed to read all expected data, expected: ", ", but read: ");
        sbR.append(this.f4457b);
        throw new IOException(sbR.toString());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return (int) Math.max(this.f4456a - ((long) this.f4457b), ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int i7;
        i7 = super.read();
        a(i7 >= 0 ? 1 : -1);
        return i7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i7, int i10) {
        int i11;
        i11 = super.read(bArr, i7, i10);
        a(i11);
        return i11;
    }
}

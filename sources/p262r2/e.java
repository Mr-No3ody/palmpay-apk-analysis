package p262r2;

import androidx.camera.video.u;
import com.facebook.common.memory.PooledByteBuffer;
import com.google.common.primitives.UnsignedBytes;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class e extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PooledByteBuffer f41559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f41560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f41561c;

    public e(PooledByteBuffer pooledByteBuffer) {
        p213o2.e.a(Boolean.valueOf(!pooledByteBuffer.isClosed()));
        this.f41559a = pooledByteBuffer;
        this.f41560b = 0;
        this.f41561c = 0;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f41559a.size() - this.f41560b;
    }

    @Override // java.io.InputStream
    public final void mark(int i7) {
        this.f41561c = this.f41560b;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (available() <= 0) {
            return -1;
        }
        int i7 = this.f41560b;
        this.f41560b = i7 + 1;
        return this.f41559a.read(i7) & UnsignedBytes.MAX_VALUE;
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.f41560b = this.f41561c;
    }

    @Override // java.io.InputStream
    public final long skip(long j6) {
        p213o2.e.a(Boolean.valueOf(j6 >= 0));
        int iMin = Math.min((int) j6, available());
        this.f41560b += iMin;
        return iMin;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i7, int i10) {
        if (i7 >= 0 && i10 >= 0 && i7 + i10 <= bArr.length) {
            int iAvailable = available();
            if (iAvailable <= 0) {
                return -1;
            }
            if (i10 <= 0) {
                return 0;
            }
            int iMin = Math.min(iAvailable, i10);
            this.f41559a.read(this.f41560b, bArr, i7, iMin);
            this.f41560b += iMin;
            return iMin;
        }
        StringBuilder sb2 = new StringBuilder("length=");
        u.u(sb2, bArr.length, "; regionStart=", i7, "; regionLength=");
        sb2.append(i10);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }
}

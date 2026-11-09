package p262r2;

import com.facebook.common.references.ResourceReleaser;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.io.InputStream;
import p213o2.e;
import p229p2.a;

/* JADX INFO: loaded from: classes.dex */
public final class d extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f41553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f41554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResourceReleaser f41555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f41556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f41557e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f41558f;

    public d(InputStream inputStream, byte[] bArr, ResourceReleaser resourceReleaser) {
        this.f41553a = inputStream;
        bArr.getClass();
        this.f41554b = bArr;
        resourceReleaser.getClass();
        this.f41555c = resourceReleaser;
        this.f41556d = 0;
        this.f41557e = 0;
        this.f41558f = false;
    }

    public final void a() throws IOException {
        if (this.f41558f) {
            throw new IOException("stream already closed");
        }
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        e.f(this.f41557e <= this.f41556d);
        a();
        return this.f41553a.available() + (this.f41556d - this.f41557e);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f41558f) {
            return;
        }
        this.f41558f = true;
        this.f41555c.release(this.f41554b);
        super.close();
    }

    public final void finalize() throws Throwable {
        if (!this.f41558f) {
            a.h("PooledByteInputStream", "Finalized without closing");
            close();
        }
        super.finalize();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        e.f(this.f41557e <= this.f41556d);
        a();
        int i7 = this.f41557e;
        int i10 = this.f41556d;
        byte[] bArr = this.f41554b;
        if (i7 >= i10) {
            int i11 = this.f41553a.read(bArr);
            if (i11 <= 0) {
                return -1;
            }
            this.f41556d = i11;
            this.f41557e = 0;
        }
        int i12 = this.f41557e;
        this.f41557e = i12 + 1;
        return bArr[i12] & UnsignedBytes.MAX_VALUE;
    }

    @Override // java.io.InputStream
    public final long skip(long j6) throws IOException {
        e.f(this.f41557e <= this.f41556d);
        a();
        int i7 = this.f41556d;
        int i10 = this.f41557e;
        long j10 = i7 - i10;
        if (j10 >= j6) {
            this.f41557e = (int) (((long) i10) + j6);
            return j6;
        }
        this.f41557e = i7;
        return this.f41553a.skip(j6 - j10) + j10;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i7, int i10) throws IOException {
        e.f(this.f41557e <= this.f41556d);
        a();
        int i11 = this.f41557e;
        int i12 = this.f41556d;
        byte[] bArr2 = this.f41554b;
        if (i11 >= i12) {
            int i13 = this.f41553a.read(bArr2);
            if (i13 <= 0) {
                return -1;
            }
            this.f41556d = i13;
            this.f41557e = 0;
        }
        int iMin = Math.min(this.f41556d - this.f41557e, i10);
        System.arraycopy(bArr2, this.f41557e, bArr, i7, iMin);
        this.f41557e += iMin;
        return iMin;
    }
}

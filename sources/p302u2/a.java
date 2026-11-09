package p302u2;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class a extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f42679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f42680b;

    public a(InputStream inputStream, int i7) {
        super(inputStream);
        if (i7 < 0) {
            throw new IllegalArgumentException("limit must be >= 0");
        }
        this.f42679a = i7;
        this.f42680b = -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return Math.min(((FilterInputStream) this).in.available(), this.f42679a);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i7) {
        if (((FilterInputStream) this).in.markSupported()) {
            ((FilterInputStream) this).in.mark(i7);
            this.f42680b = this.f42679a;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.f42679a == 0) {
            return -1;
        }
        int i7 = ((FilterInputStream) this).in.read();
        if (i7 != -1) {
            this.f42679a--;
        }
        return i7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws IOException {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("mark is not supported");
        }
        if (this.f42680b == -1) {
            throw new IOException("mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f42679a = this.f42680b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j6) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(Math.min(j6, this.f42679a));
        this.f42679a = (int) (((long) this.f42679a) - jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i7, int i10) throws IOException {
        int i11 = this.f42679a;
        if (i11 == 0) {
            return -1;
        }
        int i12 = ((FilterInputStream) this).in.read(bArr, i7, Math.min(i10, i11));
        if (i12 > 0) {
            this.f42679a -= i12;
        }
        return i12;
    }
}

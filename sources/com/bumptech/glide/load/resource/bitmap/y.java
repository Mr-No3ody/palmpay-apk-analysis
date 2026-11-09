package com.bumptech.glide.load.resource.bitmap;

import com.google.common.primitives.UnsignedBytes;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class y extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile byte[] f20965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20969e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.f f20970f;

    public y(InputStream inputStream, com.bumptech.glide.load.engine.bitmap_recycle.f fVar) {
        super(inputStream);
        this.f20968d = -1;
        this.f20970f = fVar;
        this.f20965a = (byte[]) fVar.get(65536, byte[].class);
    }

    public static void b() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    public final int a(InputStream inputStream, byte[] bArr) throws IOException {
        int i7 = this.f20968d;
        if (i7 != -1) {
            int i10 = this.f20969e - i7;
            int i11 = this.f20967c;
            if (i10 < i11) {
                if (i7 == 0 && i11 > bArr.length && this.f20966b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i11) {
                        i11 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f20970f.get(i11, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f20965a = bArr2;
                    this.f20970f.put(bArr);
                    bArr = bArr2;
                } else if (i7 > 0) {
                    System.arraycopy(bArr, i7, bArr, 0, bArr.length - i7);
                }
                int i12 = this.f20969e - this.f20968d;
                this.f20969e = i12;
                this.f20968d = 0;
                this.f20966b = 0;
                int i13 = inputStream.read(bArr, i12, bArr.length - i12);
                int i14 = this.f20969e;
                if (i13 > 0) {
                    i14 += i13;
                }
                this.f20966b = i14;
                return i13;
            }
        }
        int i15 = inputStream.read(bArr);
        if (i15 > 0) {
            this.f20968d = -1;
            this.f20969e = 0;
            this.f20966b = i15;
        }
        return i15;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f20965a == null || inputStream == null) {
            b();
            throw null;
        }
        return (this.f20966b - this.f20969e) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f20965a != null) {
            this.f20970f.put(this.f20965a);
            this.f20965a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i7) {
        this.f20967c = Math.max(this.f20967c, i7);
        this.f20968d = this.f20969e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.f20965a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            b();
            throw null;
        }
        if (this.f20969e >= this.f20966b && a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f20965a && (bArr = this.f20965a) == null) {
            b();
            throw null;
        }
        int i7 = this.f20966b;
        int i10 = this.f20969e;
        if (i7 - i10 <= 0) {
            return -1;
        }
        this.f20969e = i10 + 1;
        return bArr[i10] & UnsignedBytes.MAX_VALUE;
    }

    public final synchronized void release() {
        if (this.f20965a != null) {
            this.f20970f.put(this.f20965a);
            this.f20965a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.f20965a == null) {
            throw new IOException("Stream is closed");
        }
        int i7 = this.f20968d;
        if (-1 == i7) {
            throw new Kf.d("Mark has been invalidated, pos: " + this.f20969e + " markLimit: " + this.f20967c);
        }
        this.f20969e = i7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j6) {
        if (j6 < 1) {
            return 0L;
        }
        byte[] bArr = this.f20965a;
        if (bArr == null) {
            b();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            b();
            throw null;
        }
        int i7 = this.f20966b;
        int i10 = this.f20969e;
        if (i7 - i10 >= j6) {
            this.f20969e = (int) (((long) i10) + j6);
            return j6;
        }
        long j10 = ((long) i7) - ((long) i10);
        this.f20969e = i7;
        if (this.f20968d == -1 || j6 > this.f20967c) {
            long jSkip = inputStream.skip(j6 - j10);
            if (jSkip > 0) {
                this.f20968d = -1;
            }
            return j10 + jSkip;
        }
        if (a(inputStream, bArr) == -1) {
            return j10;
        }
        int i11 = this.f20966b;
        int i12 = this.f20969e;
        if (i11 - i12 >= j6 - j10) {
            this.f20969e = (int) ((((long) i12) + j6) - j10);
            return j6;
        }
        long j11 = (j10 + ((long) i11)) - ((long) i12);
        this.f20969e = i11;
        return j11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i7, int i10) {
        int i11;
        int i12;
        byte[] bArr2 = this.f20965a;
        if (bArr2 == null) {
            b();
            throw null;
        }
        if (i10 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i13 = this.f20969e;
            int i14 = this.f20966b;
            if (i13 < i14) {
                int i15 = i14 - i13;
                if (i15 >= i10) {
                    i15 = i10;
                }
                System.arraycopy(bArr2, i13, bArr, i7, i15);
                this.f20969e += i15;
                if (i15 == i10 || inputStream.available() == 0) {
                    return i15;
                }
                i7 += i15;
                i11 = i10 - i15;
            } else {
                i11 = i10;
            }
            while (true) {
                if (this.f20968d == -1 && i11 >= bArr2.length) {
                    i12 = inputStream.read(bArr, i7, i11);
                    if (i12 == -1) {
                        return i11 != i10 ? i10 - i11 : -1;
                    }
                } else {
                    if (a(inputStream, bArr2) == -1) {
                        return i11 != i10 ? i10 - i11 : -1;
                    }
                    if (bArr2 != this.f20965a && (bArr2 = this.f20965a) == null) {
                        b();
                        throw null;
                    }
                    int i16 = this.f20966b;
                    int i17 = this.f20969e;
                    i12 = i16 - i17;
                    if (i12 >= i11) {
                        i12 = i11;
                    }
                    System.arraycopy(bArr2, i17, bArr, i7, i12);
                    this.f20969e += i12;
                }
                i11 -= i12;
                if (i11 == 0) {
                    return i10;
                }
                if (inputStream.available() == 0) {
                    return i10 - i11;
                }
                i7 += i12;
            }
        } else {
            b();
            throw null;
        }
    }
}

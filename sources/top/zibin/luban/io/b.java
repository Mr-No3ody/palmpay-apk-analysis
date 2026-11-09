package top.zibin.luban.io;

import com.google.common.primitives.UnsignedBytes;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile byte[] f42648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f42649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f42650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f42651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f42652e;

    public b(InputStream inputStream) {
        super(inputStream);
        this.f42651d = -1;
        this.f42648a = (byte[]) ((f) a.f().f42647d).get(65536, byte[].class);
    }

    public static void b() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    public final int a(InputStream inputStream, byte[] bArr) throws IOException {
        int i7 = this.f42651d;
        if (i7 != -1) {
            int i10 = this.f42652e - i7;
            int i11 = this.f42650c;
            if (i10 < i11) {
                if (i7 == 0 && i11 > bArr.length && this.f42649b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i11) {
                        i11 = length;
                    }
                    byte[] bArr2 = (byte[]) ((f) a.f().f42647d).get(i11, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f42648a = bArr2;
                    ((f) a.f().f42647d).put(bArr);
                    bArr = bArr2;
                } else if (i7 > 0) {
                    System.arraycopy(bArr, i7, bArr, 0, bArr.length - i7);
                }
                int i12 = this.f42652e - this.f42651d;
                this.f42652e = i12;
                this.f42651d = 0;
                this.f42649b = 0;
                int i13 = inputStream.read(bArr, i12, bArr.length - i12);
                int i14 = this.f42652e;
                if (i13 > 0) {
                    i14 += i13;
                }
                this.f42649b = i14;
                return i13;
            }
        }
        int i15 = inputStream.read(bArr);
        if (i15 > 0) {
            this.f42651d = -1;
            this.f42652e = 0;
            this.f42649b = i15;
        }
        return i15;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream = ((FilterInputStream) this).in;
        if (this.f42648a != null && inputStream != null) {
            return (this.f42649b - this.f42652e) + inputStream.available();
        }
        return 0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f42648a != null) {
            a aVarF = a.f();
            ((f) aVarF.f42647d).put(this.f42648a);
            this.f42648a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i7) {
        this.f42650c = Math.max(this.f42650c, i7);
        this.f42651d = this.f42652e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.f42648a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            b();
            throw null;
        }
        if (this.f42652e >= this.f42649b && a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f42648a && (bArr = this.f42648a) == null) {
            b();
            throw null;
        }
        int i7 = this.f42649b;
        int i10 = this.f42652e;
        if (i7 - i10 <= 0) {
            return -1;
        }
        this.f42652e = i10 + 1;
        return bArr[i10] & UnsignedBytes.MAX_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.f42648a == null) {
            throw new IOException("Stream is closed");
        }
        int i7 = this.f42651d;
        if (-1 == i7) {
            throw new Kf.d("Mark has been invalidated, pos: " + this.f42652e + " markLimit: " + this.f42650c);
        }
        this.f42652e = i7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j6) {
        if (j6 < 1) {
            return 0L;
        }
        byte[] bArr = this.f42648a;
        if (bArr == null) {
            b();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            b();
            throw null;
        }
        int i7 = this.f42649b;
        int i10 = this.f42652e;
        if (i7 - i10 >= j6) {
            this.f42652e = (int) (((long) i10) + j6);
            return j6;
        }
        long j10 = ((long) i7) - ((long) i10);
        this.f42652e = i7;
        if (this.f42651d == -1 || j6 > this.f42650c) {
            return j10 + inputStream.skip(j6 - j10);
        }
        if (a(inputStream, bArr) == -1) {
            return j10;
        }
        int i11 = this.f42649b;
        int i12 = this.f42652e;
        if (i11 - i12 >= j6 - j10) {
            this.f42652e = (int) ((((long) i12) + j6) - j10);
            return j6;
        }
        long j11 = (j10 + ((long) i11)) - ((long) i12);
        this.f42652e = i11;
        return j11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i7, int i10) {
        int i11;
        int iMin;
        byte[] bArr2 = this.f42648a;
        if (bArr2 == null) {
            b();
            throw null;
        }
        if (i10 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i12 = this.f42652e;
            int i13 = this.f42649b;
            if (i12 < i13) {
                int iMin2 = Math.min(i13 - i12, i10);
                System.arraycopy(bArr2, this.f42652e, bArr, i7, iMin2);
                this.f42652e += iMin2;
                if (iMin2 == i10 || inputStream.available() == 0) {
                    return iMin2;
                }
                i7 += iMin2;
                i11 = i10 - iMin2;
            } else {
                i11 = i10;
            }
            while (true) {
                if (this.f42651d == -1 && i11 >= bArr2.length) {
                    iMin = inputStream.read(bArr, i7, i11);
                    if (iMin == -1) {
                        return i11 != i10 ? i10 - i11 : -1;
                    }
                } else {
                    if (a(inputStream, bArr2) == -1) {
                        return i11 != i10 ? i10 - i11 : -1;
                    }
                    if (bArr2 != this.f42648a && (bArr2 = this.f42648a) == null) {
                        b();
                        throw null;
                    }
                    iMin = Math.min(this.f42649b - this.f42652e, i11);
                    System.arraycopy(bArr2, this.f42652e, bArr, i7, iMin);
                    this.f42652e += iMin;
                }
                i11 -= iMin;
                if (i11 == 0) {
                    return i10;
                }
                if (inputStream.available() == 0) {
                    return i10 - i11;
                }
                i7 += iMin;
            }
        } else {
            b();
            throw null;
        }
    }
}

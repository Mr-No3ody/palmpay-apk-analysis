package p302u2;

import com.google.common.primitives.UnsignedBytes;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class b extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f42681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f42682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f42683c;

    public b(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        this.f42681a = bArr;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i7) {
        if (((FilterInputStream) this).in.markSupported()) {
            super.mark(i7);
            this.f42683c = this.f42682b;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i7 = ((FilterInputStream) this).in.read();
        if (i7 != -1) {
            return i7;
        }
        int i10 = this.f42682b;
        byte[] bArr = this.f42681a;
        if (i10 >= bArr.length) {
            return -1;
        }
        this.f42682b = i10 + 1;
        return bArr[i10] & UnsignedBytes.MAX_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws IOException {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("mark is not supported");
        }
        ((FilterInputStream) this).in.reset();
        this.f42682b = this.f42683c;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i7, int i10) throws IOException {
        int i11;
        int i12 = ((FilterInputStream) this).in.read(bArr, i7, i10);
        if (i12 != -1) {
            return i12;
        }
        int i13 = 0;
        if (i10 == 0) {
            return 0;
        }
        while (i13 < i10) {
            int i14 = this.f42682b;
            byte[] bArr2 = this.f42681a;
            if (i14 >= bArr2.length) {
                i11 = -1;
            } else {
                this.f42682b = i14 + 1;
                i11 = bArr2[i14] & UnsignedBytes.MAX_VALUE;
            }
            if (i11 == -1) {
                break;
            }
            bArr[i7 + i13] = (byte) i11;
            i13++;
        }
        if (i13 > 0) {
            return i13;
        }
        return -1;
    }
}

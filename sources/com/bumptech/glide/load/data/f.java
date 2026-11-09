package com.bumptech.glide.load.data;

import C0.G;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class f extends FilterInputStream {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f20534c = {-1, -31, 0, Ascii.FS, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, Ascii.DC2, 0, 2, 0, 0, 0, 1, 0};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f20535d = 31;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f20536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20537b;

    public f(InputStream inputStream, int i7) {
        super(inputStream);
        if (i7 < -1 || i7 > 8) {
            throw new IllegalArgumentException(G.m(i7, "Cannot add invalid orientation: "));
        }
        this.f20536a = (byte) i7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i7;
        int i10;
        int i11 = this.f20537b;
        if (i11 < 2 || i11 > (i10 = f20535d)) {
            i7 = super.read();
        } else {
            i7 = i11 == i10 ? this.f20536a : f20534c[i11 - 2] & UnsignedBytes.MAX_VALUE;
        }
        if (i7 != -1) {
            this.f20537b++;
        }
        return i7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j6) throws IOException {
        long jSkip = super.skip(j6);
        if (jSkip > 0) {
            this.f20537b = (int) (((long) this.f20537b) + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i7, int i10) throws IOException {
        int i11;
        int i12 = this.f20537b;
        int i13 = f20535d;
        if (i12 > i13) {
            i11 = super.read(bArr, i7, i10);
        } else if (i12 == i13) {
            bArr[i7] = this.f20536a;
            i11 = 1;
        } else if (i12 < 2) {
            i11 = super.read(bArr, i7, 2 - i12);
        } else {
            int iMin = Math.min(i13 - i12, i10);
            System.arraycopy(f20534c, this.f20537b - 2, bArr, i7, iMin);
            i11 = iMin;
        }
        if (i11 > 0) {
            this.f20537b += i11;
        }
        return i11;
    }
}

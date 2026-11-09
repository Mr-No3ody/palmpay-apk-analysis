package com.bumptech.glide.load.data;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class c extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileOutputStream f20528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f20529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.f f20530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20531d;

    public c(FileOutputStream fileOutputStream, com.bumptech.glide.load.engine.bitmap_recycle.f fVar) {
        this.f20528a = fileOutputStream;
        this.f20530c = fVar;
        this.f20529b = (byte[]) fVar.get(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileOutputStream fileOutputStream = this.f20528a;
        try {
            flush();
            fileOutputStream.close();
            byte[] bArr = this.f20529b;
            if (bArr != null) {
                this.f20530c.put(bArr);
                this.f20529b = null;
            }
        } catch (Throwable th) {
            fileOutputStream.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        int i7 = this.f20531d;
        FileOutputStream fileOutputStream = this.f20528a;
        if (i7 > 0) {
            fileOutputStream.write(this.f20529b, 0, i7);
            this.f20531d = 0;
        }
        fileOutputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i7) throws IOException {
        byte[] bArr = this.f20529b;
        int i10 = this.f20531d;
        int i11 = i10 + 1;
        this.f20531d = i11;
        bArr[i10] = (byte) i7;
        if (i11 != bArr.length || i11 <= 0) {
            return;
        }
        this.f20528a.write(bArr, 0, i11);
        this.f20531d = 0;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i7, int i10) throws IOException {
        int i11 = 0;
        do {
            int i12 = i10 - i11;
            int i13 = i7 + i11;
            int i14 = this.f20531d;
            FileOutputStream fileOutputStream = this.f20528a;
            if (i14 == 0 && i12 >= this.f20529b.length) {
                fileOutputStream.write(bArr, i13, i12);
                return;
            }
            int iMin = Math.min(i12, this.f20529b.length - i14);
            System.arraycopy(bArr, i13, this.f20529b, this.f20531d, iMin);
            int i15 = this.f20531d + iMin;
            this.f20531d = i15;
            i11 += iMin;
            byte[] bArr2 = this.f20529b;
            if (i15 == bArr2.length && i15 > 0) {
                fileOutputStream.write(bArr2, 0, i15);
                this.f20531d = 0;
            }
        } while (i11 < i10);
    }
}

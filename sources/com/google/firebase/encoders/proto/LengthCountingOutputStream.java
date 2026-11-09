package com.google.firebase.encoders.proto;

import androidx.annotation.NonNull;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
final class LengthCountingOutputStream extends OutputStream {
    private long length = 0;

    public long getLength() {
        return this.length;
    }

    @Override // java.io.OutputStream
    public void write(int i7) {
        this.length++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.length += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(@NonNull byte[] bArr, int i7, int i10) {
        int i11;
        if (i7 >= 0 && i7 <= bArr.length && i10 >= 0 && (i11 = i7 + i10) <= bArr.length && i11 >= 0) {
            this.length += (long) i10;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}

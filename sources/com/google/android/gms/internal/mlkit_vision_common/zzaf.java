package com.google.android.gms.internal.mlkit_vision_common;

import androidx.annotation.NonNull;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
final class zzaf extends OutputStream {
    private long zza = 0;

    @Override // java.io.OutputStream
    public final void write(int i7) {
        this.zza++;
    }

    public final long zza() {
        return this.zza;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.zza += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(@NonNull byte[] bArr, int i7, int i10) {
        int length;
        int i11;
        if (i7 >= 0 && i7 <= (length = bArr.length) && i10 >= 0 && (i11 = i7 + i10) <= length && i11 >= 0) {
            this.zza += (long) i10;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}

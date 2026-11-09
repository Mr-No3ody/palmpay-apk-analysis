package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzms extends InputStream {
    final /* synthetic */ zzacv zza;

    public zzms(zzmu zzmuVar, zzacv zzacvVar) {
        this.zza = zzacvVar;
        Objects.requireNonNull(zzmuVar);
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr = new byte[1];
        if (this.zza.zzK(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0];
    }

    @Override // java.io.InputStream
    public final long skip(long j6) throws IOException {
        if (j6 <= 0) {
            return 0L;
        }
        int i7 = j6 > 2147483647L ? Integer.MAX_VALUE : (int) j6;
        this.zza.zzL(i7);
        return i7;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i7, int i10) throws IOException {
        return this.zza.zzK(bArr, i7, i10);
    }
}

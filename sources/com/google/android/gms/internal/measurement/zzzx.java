package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzzx implements Iterator {
    final /* synthetic */ zzzy zza;
    private final zzyl zzb;
    private int zzc;
    private int zzd;

    public /* synthetic */ zzzx(zzzy zzzyVar, zzyl zzylVar, int i7, byte[] bArr) {
        Objects.requireNonNull(zzzyVar);
        this.zza = zzzyVar;
        this.zzb = zzylVar;
        int i10 = i7 & 31;
        this.zzc = i10;
        this.zzd = i7 >>> (i10 + 5);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzc >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objZze = this.zzb.zze(this.zza.zze(this.zzc));
        int i7 = this.zzd;
        if (i7 == 0) {
            this.zzc = -1;
            return objZze;
        }
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i7) + 1;
        this.zzd >>>= iNumberOfTrailingZeros;
        this.zzc += iNumberOfTrailingZeros;
        return objZze;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

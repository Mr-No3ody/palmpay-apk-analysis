package com.google.android.gms.internal.measurement;

import com.horcrux.svg.d0;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzad implements Iterator {
    final /* synthetic */ zzae zza;
    private int zzb;

    public zzad(zzae zzaeVar) {
        Objects.requireNonNull(zzaeVar);
        this.zza = zzaeVar;
        this.zzb = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zza.zzh();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        zzae zzaeVar = this.zza;
        if (this.zzb >= zzaeVar.zzh()) {
            int i7 = this.zzb;
            throw new NoSuchElementException(d0.n(i7, "Out of bounds index: ", new StringBuilder(String.valueOf(i7).length() + 21)));
        }
        int i10 = this.zzb;
        this.zzb = i10 + 1;
        return zzaeVar.zzl(i10);
    }
}

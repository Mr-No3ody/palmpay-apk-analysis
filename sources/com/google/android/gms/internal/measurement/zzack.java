package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzack extends zzacl {
    final /* synthetic */ zzacr zza;
    private int zzb;
    private final int zzc;

    public zzack(zzacr zzacrVar) {
        Objects.requireNonNull(zzacrVar);
        this.zza = zzacrVar;
        this.zzb = 0;
        this.zzc = zzacrVar.zzb();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzacn
    public final byte zza() {
        int i7 = this.zzb;
        if (i7 >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i7 + 1;
        return this.zza.zza(i7);
    }
}

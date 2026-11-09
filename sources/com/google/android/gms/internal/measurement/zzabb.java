package com.google.android.gms.internal.measurement;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzabb extends AbstractSet {
    final int zza;
    final /* synthetic */ zzabc zzb;

    public zzabb(zzabc zzabcVar, int i7) {
        Objects.requireNonNull(zzabcVar);
        this.zzb = zzabcVar;
        this.zza = i7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return Arrays.binarySearch(this.zzb.zzb(), zzb(), zzc(), obj, this.zza == -1 ? zzabc.zza : zzabe.zzb) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzaba(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return zzc() - zzb();
    }

    public final Object zza(int i7) {
        return this.zzb.zzb()[zzb() + i7];
    }

    public final int zzb() {
        int i7 = this.zza;
        if (i7 == -1) {
            return 0;
        }
        return this.zzb.zzc()[i7];
    }

    public final int zzc() {
        return this.zzb.zzc()[this.zza + 1];
    }
}

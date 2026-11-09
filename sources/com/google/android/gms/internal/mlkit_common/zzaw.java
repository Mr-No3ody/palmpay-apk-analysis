package com.google.android.gms.internal.mlkit_common;

import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
final class zzaw extends zzas {
    private final transient zzar zza;
    private final transient Object[] zzb;
    private final transient int zzc;

    public zzaw(zzar zzarVar, Object[] objArr, int i7, int i10) {
        this.zza = zzarVar;
        this.zzb = objArr;
        this.zzc = i10;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzak, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.zza.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzas, com.google.android.gms.internal.mlkit_common.zzak, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzf().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzak
    public final int zza(Object[] objArr, int i7) {
        return zzf().zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzas, com.google.android.gms.internal.mlkit_common.zzak
    /* JADX INFO: renamed from: zzd */
    public final zzbb iterator() {
        return zzf().listIterator(0);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzas
    public final zzao zzg() {
        return new zzav(this);
    }
}

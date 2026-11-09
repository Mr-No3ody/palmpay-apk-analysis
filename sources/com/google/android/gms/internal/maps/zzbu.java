package com.google.android.gms.internal.maps;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzbu extends zzbk {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    public zzbu(Object[] objArr, int i7, int i10) {
        this.zza = objArr;
        this.zzb = i7;
        this.zzc = i10;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        zzbc.zza(i7, this.zzc, FirebaseAnalytics.Param.INDEX);
        Object obj = this.zza[i7 + i7 + this.zzb];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }
}

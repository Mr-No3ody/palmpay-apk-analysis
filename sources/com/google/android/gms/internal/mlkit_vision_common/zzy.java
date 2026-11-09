package com.google.android.gms.internal.mlkit_vision_common;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes2.dex */
final class zzy extends zzp {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    public zzy(Object[] objArr, int i7, int i10) {
        this.zza = objArr;
        this.zzb = i7;
        this.zzc = i10;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        zzf.zza(i7, this.zzc, FirebaseAnalytics.Param.INDEX);
        Object obj = this.zza[i7 + i7 + this.zzb];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }
}

package com.google.android.gms.internal.mlkit_vision_common;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.AbstractMap;

/* JADX INFO: loaded from: classes2.dex */
final class zzv extends zzp {
    final /* synthetic */ zzw zza;

    public zzv(zzw zzwVar) {
        this.zza = zzwVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i7) {
        zzf.zza(i7, this.zza.zzc, FirebaseAnalytics.Param.INDEX);
        zzw zzwVar = this.zza;
        int i10 = i7 + i7;
        Object obj = zzwVar.zzb[i10];
        obj.getClass();
        Object obj2 = zzwVar.zzb[i10 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzc;
    }
}

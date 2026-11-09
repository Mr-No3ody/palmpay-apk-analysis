package com.google.android.gms.internal.mlkit_vision_face;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.AbstractMap;

/* JADX INFO: loaded from: classes2.dex */
final class zzcd extends zzbn {
    final /* synthetic */ zzce zza;

    public zzcd(zzce zzceVar) {
        this.zza = zzceVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i7) {
        zzab.zza(i7, this.zza.zzc, FirebaseAnalytics.Param.INDEX);
        zzce zzceVar = this.zza;
        int i10 = i7 + i7;
        Object obj = zzceVar.zzb[i10];
        obj.getClass();
        Object obj2 = zzceVar.zzb[i10 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzc;
    }
}

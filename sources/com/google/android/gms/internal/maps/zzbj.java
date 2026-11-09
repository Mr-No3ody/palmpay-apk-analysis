package com.google.android.gms.internal.maps;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes2.dex */
final class zzbj extends zzbk {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzbk zzc;

    public zzbj(zzbk zzbkVar, int i7, int i10) {
        this.zzc = zzbkVar;
        this.zza = i7;
        this.zzb = i10;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        zzbc.zza(i7, this.zzb, FirebaseAnalytics.Param.INDEX);
        return this.zzc.get(i7 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.maps.zzbh
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.maps.zzbh
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.maps.zzbh
    public final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.maps.zzbk, java.util.List
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzbk subList(int i7, int i10) {
        zzbc.zzc(i7, i10, this.zzb);
        int i11 = this.zza;
        return this.zzc.subList(i7 + i11, i10 + i11);
    }
}

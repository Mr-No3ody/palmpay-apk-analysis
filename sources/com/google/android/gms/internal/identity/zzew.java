package com.google.android.gms.internal.identity;

import com.google.firebase.analytics.FirebaseAnalytics;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
final class zzew extends zzex {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzex zzc;

    public zzew(zzex zzexVar, int i7, int i10) {
        this.zzc = zzexVar;
        this.zza = i7;
        this.zzb = i10;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        zzer.zzc(i7, this.zzb, FirebaseAnalytics.Param.INDEX);
        return this.zzc.get(i7 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.identity.zzeu
    @CheckForNull
    public final Object[] zzb() {
        return this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.identity.zzeu
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.identity.zzeu
    public final int zzd() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.identity.zzeu
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.identity.zzex, java.util.List
    /* JADX INFO: renamed from: zzh */
    public final zzex subList(int i7, int i10) {
        zzer.zze(i7, i10, this.zzb);
        int i11 = this.zza;
        return this.zzc.subList(i7 + i11, i10 + i11);
    }
}

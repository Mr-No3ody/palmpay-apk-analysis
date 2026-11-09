package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.analytics.FirebaseAnalytics;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
final class zzan extends zzao {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzao zzc;

    public zzan(zzao zzaoVar, int i7, int i10) {
        this.zzc = zzaoVar;
        this.zza = i7;
        this.zzb = i10;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        zzac.zza(i7, this.zzb, FirebaseAnalytics.Param.INDEX);
        return this.zzc.get(i7 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzak
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzak
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzak
    @CheckForNull
    public final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzao, java.util.List
    /* JADX INFO: renamed from: zzf */
    public final zzao subList(int i7, int i10) {
        zzac.zzc(i7, i10, this.zzb);
        zzao zzaoVar = this.zzc;
        int i11 = this.zza;
        return zzaoVar.subList(i7 + i11, i10 + i11);
    }
}

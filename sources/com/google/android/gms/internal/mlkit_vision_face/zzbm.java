package com.google.android.gms.internal.mlkit_vision_face;

import com.google.firebase.analytics.FirebaseAnalytics;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
final class zzbm extends zzbn {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzbn zzc;

    public zzbm(zzbn zzbnVar, int i7, int i10) {
        this.zzc = zzbnVar;
        this.zza = i7;
        this.zzb = i10;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        zzab.zza(i7, this.zzb, FirebaseAnalytics.Param.INDEX);
        return this.zzc.get(i7 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi
    @CheckForNull
    public final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbn, java.util.List
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzbn subList(int i7, int i10) {
        zzab.zzc(i7, i10, this.zzb);
        zzbn zzbnVar = this.zzc;
        int i11 = this.zza;
        return zzbnVar.subList(i7 + i11, i10 + i11);
    }
}

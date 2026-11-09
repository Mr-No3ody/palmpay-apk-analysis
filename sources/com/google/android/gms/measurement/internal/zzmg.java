package com.google.android.gms.measurement.internal;

import com.airbnb.lottie.model.layer.d;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzmg implements Runnable {
    final /* synthetic */ zzr zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzpl zzc;
    final /* synthetic */ zznl zzd;

    public zzmg(zznl zznlVar, zzr zzrVar, boolean z3, zzpl zzplVar) {
        this.zza = zzrVar;
        this.zzb = z3;
        this.zzc = zzplVar;
        Objects.requireNonNull(zznlVar);
        this.zzd = zznlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznl zznlVar = this.zzd;
        zzgb zzgbVarZzZ = zznlVar.zzZ();
        if (zzgbVarZzZ == null) {
            d.r(zznlVar.zzu, "Discarding data. Failed to set user property");
            return;
        }
        zzr zzrVar = this.zza;
        Preconditions.checkNotNull(zzrVar);
        zznlVar.zzm(zzgbVarZzZ, this.zzb ? null : this.zzc, zzrVar);
        zznlVar.zzV();
    }
}

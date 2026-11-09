package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.airbnb.lottie.model.layer.d;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzmo implements Runnable {
    final /* synthetic */ zzr zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzbf zzc;
    final /* synthetic */ Bundle zzd;
    final /* synthetic */ zznl zze;

    public zzmo(zznl zznlVar, boolean z3, zzr zzrVar, boolean z8, zzbf zzbfVar, Bundle bundle) {
        this.zza = zzrVar;
        this.zzb = z8;
        this.zzc = zzbfVar;
        this.zzd = bundle;
        Objects.requireNonNull(zznlVar);
        this.zze = zznlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznl zznlVar = this.zze;
        zzgb zzgbVarZzZ = zznlVar.zzZ();
        if (zzgbVarZzZ == null) {
            d.r(zznlVar.zzu, "Failed to send default event parameters to service");
            return;
        }
        if (zznlVar.zzu.zzc().zzp(null, zzfy.zzaW)) {
            zzr zzrVar = this.zza;
            Preconditions.checkNotNull(zzrVar);
            zznlVar.zzm(zzgbVarZzZ, this.zzb ? null : this.zzc, zzrVar);
            return;
        }
        try {
            zzr zzrVar2 = this.zza;
            Preconditions.checkNotNull(zzrVar2);
            zzgbVarZzZ.zzu(this.zzd, zzrVar2);
            zznlVar.zzV();
        } catch (RemoteException e10) {
            this.zze.zzu.zzaW().zzb().zzb("Failed to send default event parameters to service", e10);
        }
    }
}

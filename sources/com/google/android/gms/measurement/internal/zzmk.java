package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.airbnb.lottie.model.layer.d;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzmk implements Runnable {
    final /* synthetic */ zzr zza;
    final /* synthetic */ zznl zzb;

    public zzmk(zznl zznlVar, zzr zzrVar, boolean z3) {
        this.zza = zzrVar;
        Objects.requireNonNull(zznlVar);
        this.zzb = zznlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznl zznlVar = this.zzb;
        zzgb zzgbVarZzZ = zznlVar.zzZ();
        if (zzgbVarZzZ == null) {
            d.r(zznlVar.zzu, "Discarding data. Failed to send app launch");
            return;
        }
        try {
            zzr zzrVar = this.zza;
            Preconditions.checkNotNull(zzrVar);
            zzic zzicVar = zznlVar.zzu;
            zzal zzalVarZzc = zzicVar.zzc();
            zzfx zzfxVar = zzfy.zzaW;
            if (zzalVarZzc.zzp(null, zzfxVar)) {
                zznlVar.zzm(zzgbVarZzZ, null, zzrVar);
            }
            zzgbVarZzZ.zzg(zzrVar);
            zznlVar.zzu.zzm().zzo();
            zzicVar.zzc().zzp(null, zzfxVar);
            zznlVar.zzm(zzgbVarZzZ, null, zzrVar);
            zznlVar.zzV();
        } catch (RemoteException e10) {
            this.zzb.zzu.zzaW().zzb().zzb("Failed to send app launch to the service", e10);
        }
    }
}

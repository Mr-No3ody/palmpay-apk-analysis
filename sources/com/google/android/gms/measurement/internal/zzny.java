package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzny {
    final /* synthetic */ zzoc zza;
    private zznx zzb;

    public zzny(zzoc zzocVar) {
        Objects.requireNonNull(zzocVar);
        this.zza = zzocVar;
    }

    @WorkerThread
    public final void zza() {
        zzoc zzocVar = this.zza;
        zzocVar.zzg();
        zznx zznxVar = this.zzb;
        if (zznxVar != null) {
            zzocVar.zzm().removeCallbacks(zznxVar);
        }
        zzocVar.zzu.zzd().zzn.zzb(false);
        zzocVar.zzh(false);
    }

    @WorkerThread
    public final void zzb(long j6) {
        zzoc zzocVar = this.zza;
        this.zzb = new zznx(this, zzocVar.zzu.zzba().currentTimeMillis(), j6);
        zzocVar.zzm().postDelayed(this.zzb, 2000L);
    }
}

package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzoa {

    @VisibleForTesting
    protected long zza;

    @VisibleForTesting
    protected long zzb;
    final /* synthetic */ zzoc zzc;
    private final zzaz zzd;

    public zzoa(zzoc zzocVar) {
        Objects.requireNonNull(zzocVar);
        this.zzc = zzocVar;
        this.zzd = new zznz(this, zzocVar.zzu);
        long jElapsedRealtime = zzocVar.zzu.zzba().elapsedRealtime();
        this.zza = jElapsedRealtime;
        this.zzb = jElapsedRealtime;
    }

    @WorkerThread
    public final void zza(long j6) {
        this.zzc.zzg();
        this.zzd.zzd();
        this.zza = j6;
        this.zzb = j6;
    }

    @WorkerThread
    public final void zzb(long j6) {
        this.zzd.zzd();
    }

    public final void zzc() {
        this.zzd.zzd();
        long jElapsedRealtime = this.zzc.zzu.zzba().elapsedRealtime();
        this.zza = jElapsedRealtime;
        this.zzb = jElapsedRealtime;
    }

    @WorkerThread
    public final boolean zzd(boolean z3, boolean z8, long j6) {
        zzoc zzocVar = this.zzc;
        zzocVar.zzg();
        zzocVar.zzb();
        if (zzocVar.zzu.zzB()) {
            zzic zzicVar = zzocVar.zzu;
            zzicVar.zzd().zzk.zzb(zzicVar.zzba().currentTimeMillis());
        }
        long j10 = j6 - this.zza;
        if (!z3 && j10 < 1000) {
            zzocVar.zzu.zzaW().zzk().zzb("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j10));
            return false;
        }
        if (!z8) {
            j10 = j6 - this.zzb;
            this.zzb = j6;
        }
        zzic zzicVar2 = zzocVar.zzu;
        zzicVar2.zzaW().zzk().zzb("Recording user engagement, ms", Long.valueOf(j10));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j10);
        boolean z10 = !zzicVar2.zzc().zzv();
        zzic zzicVar3 = zzocVar.zzu;
        zzpp.zzay(zzicVar3.zzs().zzh(z10), bundle, true);
        if (!z8) {
            zzicVar3.zzj().zzE("auto", "_e", bundle);
        }
        this.zza = j6;
        zzaz zzazVar = this.zzd;
        zzazVar.zzd();
        zzazVar.zzb(((Long) zzfy.zzap.zzb(null)).longValue());
        return true;
    }
}

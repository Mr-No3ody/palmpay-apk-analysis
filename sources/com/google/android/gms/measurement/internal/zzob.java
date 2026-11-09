package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzob {
    final /* synthetic */ zzoc zza;

    public zzob(zzoc zzocVar) {
        Objects.requireNonNull(zzocVar);
        this.zza = zzocVar;
    }

    @WorkerThread
    public final void zza() {
        zzoc zzocVar = this.zza;
        zzocVar.zzg();
        zzic zzicVar = zzocVar.zzu;
        if (zzicVar.zzd().zzo(zzicVar.zzba().currentTimeMillis())) {
            zzicVar.zzd().zzg.zzb(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                zzicVar.zzaW().zzk().zza("Detected application was in foreground");
                zzc(zzicVar.zzba().currentTimeMillis(), zzicVar.zzc().zzp(null, zzfy.zzbe) ? zzicVar.zzba().elapsedRealtime() : 0L, false);
            }
        }
    }

    @WorkerThread
    public final void zzb(long j6, long j10, boolean z3) {
        zzoc zzocVar = this.zza;
        zzocVar.zzg();
        zzocVar.zzj();
        zzic zzicVar = zzocVar.zzu;
        if (zzicVar.zzd().zzo(j6)) {
            zzicVar.zzd().zzg.zzb(true);
            zzocVar.zzu.zzv().zzi();
        }
        zzicVar.zzd().zzk.zzb(j6);
        if (zzicVar.zzd().zzg.zza()) {
            zzc(j6, j10, z3);
        }
    }

    @VisibleForTesting
    @WorkerThread
    public final void zzc(long j6, long j10, boolean z3) {
        zzoc zzocVar = this.zza;
        zzocVar.zzg();
        if (zzocVar.zzu.zzB()) {
            zzic zzicVar = zzocVar.zzu;
            zzicVar.zzd().zzk.zzb(j6);
            zzicVar.zzaW().zzk().zzb("Session started, time", Long.valueOf(zzicVar.zzba().elapsedRealtime()));
            long j11 = j6 / 1000;
            zzic zzicVar2 = zzocVar.zzu;
            zzicVar2.zzj().zzM("auto", "_sid", Long.valueOf(j11), j6);
            zzicVar.zzd().zzl.zzb(j11);
            zzicVar.zzd().zzg.zzb(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j11);
            zzicVar2.zzj().zzF("auto", "_s", j6, j10, bundle);
            String strZza = zzicVar.zzd().zzq.zza();
            if (TextUtils.isEmpty(strZza)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", strZza);
            zzicVar2.zzj().zzF("auto", "_ssr", j6, j10, bundle2);
        }
    }
}

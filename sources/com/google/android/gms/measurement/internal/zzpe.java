package com.google.android.gms.measurement.internal;

import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
@VisibleForTesting
final class zzpe {
    private final zzpg zza;
    private int zzb = 1;
    private long zzc = zzd();

    public zzpe(zzpg zzpgVar) {
        this.zza = zzpgVar;
    }

    private final long zzd() {
        zzpg zzpgVar = this.zza;
        Preconditions.checkNotNull(zzpgVar);
        long jLongValue = ((Long) zzfy.zzu.zzb(null)).longValue();
        long jLongValue2 = ((Long) zzfy.zzv.zzb(null)).longValue();
        for (int i7 = 1; i7 < this.zzb; i7++) {
            jLongValue += jLongValue;
            if (jLongValue >= jLongValue2) {
                break;
            }
        }
        return Math.min(jLongValue, jLongValue2) + zzpgVar.zzba().currentTimeMillis();
    }

    public final void zza() {
        this.zzb++;
        this.zzc = zzd();
    }

    public final boolean zzb() {
        return this.zza.zzba().currentTimeMillis() >= this.zzc;
    }

    public final /* synthetic */ long zzc() {
        return this.zzc;
    }
}

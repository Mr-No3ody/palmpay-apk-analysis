package com.google.android.gms.internal.measurement;

import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzxo extends zzxz implements zzyi {
    public zzxo(Level level, boolean z3) {
        super(level, false);
    }

    @Override // com.google.android.gms.internal.measurement.zzxz
    public final zzabn zza() {
        return zzabl.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzxz
    public final boolean zzb(zzyd zzydVar) {
        zzzj zzzjVarZzl = zzl();
        int iZza = zzzjVarZzl.zza();
        for (int i7 = 0; i7 < iZza; i7++) {
            if (zzzjVarZzl.zzb(i7).zzd() == "eye3tag") {
                if (zzzjVarZzl.zzd(zzxx.zza) != null) {
                    break;
                }
                zzyl zzylVar = zzxx.zzi;
                if (zzzjVarZzl.zzd(zzylVar) != null) {
                    break;
                }
                zzm(zzylVar, zzyv.SMALL);
                break;
            }
        }
        return super.zzb(zzydVar);
    }
}

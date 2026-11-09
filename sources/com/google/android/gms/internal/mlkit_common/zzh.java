package com.google.android.gms.internal.mlkit_common;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzh {
    public static final zzh zza;
    public static final zzh zzb;
    private final boolean zzc;
    private final boolean zzd = false;
    private final zzao zze;

    static {
        zze zzeVar = null;
        zzf zzfVar = new zzf(zzeVar);
        zzfVar.zza();
        zza = zzfVar.zzc();
        zzf zzfVar2 = new zzf(zzeVar);
        zzfVar2.zzb();
        zzb = zzfVar2.zzc();
    }

    public /* synthetic */ zzh(boolean z3, boolean z8, zzao zzaoVar, zzg zzgVar) {
        this.zzc = z3;
        this.zze = zzaoVar;
    }

    public static /* bridge */ /* synthetic */ boolean zza(zzh zzhVar) {
        boolean z3 = zzhVar.zzd;
        return false;
    }

    public static /* bridge */ /* synthetic */ int zzc(zzh zzhVar, Context context, zzq zzqVar) {
        zzao zzaoVar = zzhVar.zze;
        int size = zzaoVar.size();
        int i7 = 0;
        while (i7 < size) {
            int iZza = ((zzr) zzaoVar.get(i7)).zza();
            int i10 = iZza - 1;
            if (iZza == 0) {
                throw null;
            }
            i7++;
            if (i10 == 0) {
                return 1;
            }
            if (i10 == 1) {
                return 2;
            }
        }
        return 3;
    }
}

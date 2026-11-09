package com.google.android.gms.internal.measurement;

import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes2.dex */
public final class zzain implements zzaim {

    @VisibleForTesting
    @Deprecated
    public static final zzom zza;

    @VisibleForTesting
    @Deprecated
    public static final zzom zzb;

    static {
        zzog zzogVarZzc = zzagr.zzc();
        zza = zzogVarZzc.zza("measurement.experiment.enable_passthrough_experiment_reporting", true);
        zzb = zzogVarZzc.zza("measurement.experiment.enable_phenotype_experiment_reporting", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzaim
    public final boolean zza() {
        return ((Boolean) zza.get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaim
    public final boolean zzb() {
        return ((Boolean) zzb.get()).booleanValue();
    }
}

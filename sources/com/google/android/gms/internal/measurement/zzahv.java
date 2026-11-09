package com.google.android.gms.internal.measurement;

import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes2.dex */
public final class zzahv implements zzahu {

    @VisibleForTesting
    @Deprecated
    public static final zzom zza;

    @VisibleForTesting
    @Deprecated
    public static final zzom zzb;

    static {
        zzog zzogVarZzc = zzagr.zzc();
        zza = zzogVarZzc.zza("45753512", false);
        zzb = zzogVarZzc.zza("measurement.gbraid_campaign.stop_lgclid", false);
    }

    @Override // com.google.android.gms.internal.measurement.zzahu
    public final boolean zza() {
        return ((Boolean) zza.get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzahu
    public final boolean zzb() {
        return ((Boolean) zzb.get()).booleanValue();
    }
}

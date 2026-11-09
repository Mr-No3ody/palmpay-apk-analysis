package com.google.android.gms.internal.measurement;

import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes2.dex */
public final class zzahg implements zzahf {

    @VisibleForTesting
    @Deprecated
    public static final zzom zza;

    @VisibleForTesting
    @Deprecated
    public static final zzom zzb;

    @VisibleForTesting
    @Deprecated
    public static final zzom zzc;

    static {
        zzog zzogVarZzc = zzagr.zzc();
        zza = zzogVarZzc.zzd("45761323", "");
        zzb = zzogVarZzc.zzd("45762029", "");
        zzc = zzogVarZzc.zzd("45762030", "");
    }

    @Override // com.google.android.gms.internal.measurement.zzahf
    public final String zza() {
        return (String) zza.get();
    }

    @Override // com.google.android.gms.internal.measurement.zzahf
    public final String zzb() {
        return (String) zzb.get();
    }

    @Override // com.google.android.gms.internal.measurement.zzahf
    public final String zzc() {
        return (String) zzc.get();
    }
}

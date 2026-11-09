package com.google.android.gms.internal.measurement;

import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes2.dex */
public final class zzajc implements zzajb {

    @VisibleForTesting
    @Deprecated
    public static final zzom zza = zzagr.zzc().zza("measurement.integration.disable_firebase_instance_id", false);

    @Override // com.google.android.gms.internal.measurement.zzajb
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzajb
    public final boolean zzb() {
        return ((Boolean) zza.get()).booleanValue();
    }
}

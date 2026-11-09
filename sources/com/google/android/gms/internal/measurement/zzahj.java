package com.google.android.gms.internal.measurement;

import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes2.dex */
public final class zzahj implements zzahi {

    @VisibleForTesting
    @Deprecated
    public static final zzom zza = zzagr.zzc().zza("measurement.edpb.service", false);

    @Override // com.google.android.gms.internal.measurement.zzahi
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzahi
    public final boolean zzb() {
        return ((Boolean) zza.get()).booleanValue();
    }
}

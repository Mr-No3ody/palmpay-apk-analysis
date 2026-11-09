package com.google.android.gms.internal.measurement;

import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaiw implements zzaiv {

    @VisibleForTesting
    @Deprecated
    public static final zzom zza = zzagr.zzc().zza("measurement.client.sessions.enable_fix_background_engagement", true);

    @Override // com.google.android.gms.internal.measurement.zzaiv
    public final boolean zza() {
        return ((Boolean) zza.get()).booleanValue();
    }
}

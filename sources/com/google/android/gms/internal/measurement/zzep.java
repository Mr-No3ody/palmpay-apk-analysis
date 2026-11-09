package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
final class zzep extends zzcx {
    private final com.google.android.gms.measurement.internal.zzjp zza;

    public zzep(com.google.android.gms.measurement.internal.zzjp zzjpVar) {
        this.zza = zzjpVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzcy
    public final void zze(String str, String str2, Bundle bundle, long j6) {
        this.zza.interceptEvent(str, str2, bundle, j6);
    }

    @Override // com.google.android.gms.internal.measurement.zzcy
    public final int zzf() {
        return System.identityHashCode(this.zza);
    }
}

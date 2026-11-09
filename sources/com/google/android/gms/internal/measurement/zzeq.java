package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
final class zzeq extends zzcx {
    private final com.google.android.gms.measurement.internal.zzjq zza;

    public zzeq(com.google.android.gms.measurement.internal.zzjq zzjqVar) {
        this.zza = zzjqVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzcy
    public final void zze(String str, String str2, Bundle bundle, long j6) {
        this.zza.onEvent(str, str2, bundle, j6);
    }

    @Override // com.google.android.gms.internal.measurement.zzcy
    public final int zzf() {
        return System.identityHashCode(this.zza);
    }
}

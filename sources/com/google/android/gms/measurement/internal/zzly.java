package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzly implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzmb zzb;

    public zzly(zzmb zzmbVar, long j6) {
        this.zza = j6;
        Objects.requireNonNull(zzmbVar);
        this.zzb = zzmbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzmb zzmbVar = this.zzb;
        zzmbVar.zzu.zzw().zzc(this.zza);
        zzmbVar.zza = null;
    }
}

package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzio implements Runnable {
    final /* synthetic */ zzr zza;
    final /* synthetic */ zzjd zzb;

    public zzio(zzjd zzjdVar, zzr zzrVar) {
        this.zza = zzrVar;
        Objects.requireNonNull(zzjdVar);
        this.zzb = zzjdVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        zzjd zzjdVar = this.zzb;
        zzjdVar.zzL().zzaa();
        zzjdVar.zzL().zzac(this.zza);
    }
}

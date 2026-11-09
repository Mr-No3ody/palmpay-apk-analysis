package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zziu implements Runnable {
    final /* synthetic */ zzpl zza;
    final /* synthetic */ zzr zzb;
    final /* synthetic */ zzjd zzc;

    public zziu(zzjd zzjdVar, zzpl zzplVar, zzr zzrVar) {
        this.zza = zzplVar;
        this.zzb = zzrVar;
        Objects.requireNonNull(zzjdVar);
        this.zzc = zzjdVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        zzjd zzjdVar = this.zzc;
        zzjdVar.zzL().zzaa();
        zzpl zzplVar = this.zza;
        if (zzplVar.zza() != null) {
            zzjdVar.zzL().zzad(zzplVar, this.zzb);
        } else {
            zzr zzrVar = this.zzb;
            zzjdVar.zzL().zzae(zzplVar.zzb, zzrVar);
        }
    }
}

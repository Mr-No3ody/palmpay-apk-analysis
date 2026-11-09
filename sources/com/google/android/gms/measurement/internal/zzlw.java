package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzlw implements Runnable {
    final /* synthetic */ zzlu zza;
    final /* synthetic */ zzlu zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzmb zze;

    public zzlw(zzmb zzmbVar, zzlu zzluVar, zzlu zzluVar2, long j6, boolean z3) {
        this.zza = zzluVar;
        this.zzb = zzluVar2;
        this.zzc = j6;
        this.zzd = z3;
        Objects.requireNonNull(zzmbVar);
        this.zze = zzmbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zzm(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}

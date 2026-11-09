package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzkv implements Runnable {
    final /* synthetic */ zzjl zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ zzlj zzd;

    public zzkv(zzlj zzljVar, zzjl zzjlVar, long j6, boolean z3) {
        this.zza = zzjlVar;
        this.zzb = j6;
        this.zzc = z3;
        Objects.requireNonNull(zzljVar);
        this.zzd = zzljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlj zzljVar = this.zzd;
        zzjl zzjlVar = this.zza;
        zzljVar.zzz(zzjlVar);
        zzljVar.zzaj(zzjlVar, this.zzb, false, this.zzc);
    }
}

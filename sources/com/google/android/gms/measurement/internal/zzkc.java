package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzkc implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ Bundle zze;
    final /* synthetic */ boolean zzf;
    final /* synthetic */ boolean zzg;
    final /* synthetic */ boolean zzh;
    final /* synthetic */ String zzi;
    final /* synthetic */ zzlj zzj;

    public zzkc(zzlj zzljVar, String str, String str2, long j6, long j10, Bundle bundle, boolean z3, boolean z8, boolean z10, String str3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j6;
        this.zzd = j10;
        this.zze = bundle;
        this.zzf = z3;
        this.zzg = z8;
        this.zzh = z10;
        this.zzi = str3;
        Objects.requireNonNull(zzljVar);
        this.zzj = zzljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzj.zzG(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
    }
}

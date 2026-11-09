package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
final class zzbd {
    final String zza;
    final String zzb;
    final long zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final Long zzh;
    final Long zzi;
    final Long zzj;
    final Boolean zzk;

    public zzbd(String str, String str2, long j6, long j10, long j11, long j12, long j13, Long l5, Long l6, Long l8, Boolean bool) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkArgument(j6 >= 0);
        Preconditions.checkArgument(j10 >= 0);
        Preconditions.checkArgument(j11 >= 0);
        Preconditions.checkArgument(j13 >= 0);
        this.zza = str;
        this.zzb = str2;
        this.zzc = j6;
        this.zzd = j10;
        this.zze = j11;
        this.zzf = j12;
        this.zzg = j13;
        this.zzh = l5;
        this.zzi = l6;
        this.zzj = l8;
        this.zzk = bool;
    }

    public final zzbd zza(long j6) {
        return new zzbd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, j6, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk);
    }

    public final zzbd zzb(long j6, long j10) {
        return new zzbd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, j6, Long.valueOf(j10), this.zzi, this.zzj, this.zzk);
    }

    public final zzbd zzc(Long l5, Long l6, Boolean bool) {
        return new zzbd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, l5, l6, bool);
    }
}

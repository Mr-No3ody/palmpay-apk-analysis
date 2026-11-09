package com.google.android.gms.measurement.internal;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzlu {

    @Nullable
    public final String zza;

    @Nullable
    public final String zzb;
    public final long zzc;
    boolean zzd;
    public final boolean zze;
    public final long zzf;
    public final long zzg;

    public zzlu(@Nullable String str, @Nullable String str2, long j6, boolean z3, long j10, long j11) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j6;
        this.zzd = false;
        this.zze = z3;
        this.zzf = j10;
        this.zzg = j11;
    }

    public zzlu(@Nullable String str, @Nullable String str2, long j6) {
        this(str, str2, j6, false, 0L, 0L);
    }
}

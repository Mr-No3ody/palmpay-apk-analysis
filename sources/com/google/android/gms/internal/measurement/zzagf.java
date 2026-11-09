package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzagf {
    final Unsafe zza;

    public zzagf(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract void zza(Object obj, long j6, byte b7);

    public abstract boolean zzb(Object obj, long j6);

    public abstract void zzc(Object obj, long j6, boolean z3);

    public abstract float zzd(Object obj, long j6);

    public abstract void zze(Object obj, long j6, float f10);

    public abstract double zzf(Object obj, long j6);

    public abstract void zzg(Object obj, long j6, double d2);
}

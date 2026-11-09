package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
final class zzage extends zzagf {
    public zzage(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.measurement.zzagf
    public final void zza(Object obj, long j6, byte b7) {
        if (zzagg.zzb) {
            zzagg.zzC(obj, j6, b7);
        } else {
            zzagg.zzD(obj, j6, b7);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzagf
    public final boolean zzb(Object obj, long j6) {
        return zzagg.zzb ? zzagg.zzt(obj, j6) : zzagg.zzu(obj, j6);
    }

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.measurement.zzagg.zzv(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.measurement.zzagg.zzw(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z3' boolean)' in method call: com.google.android.gms.internal.measurement.zzagg.zzv(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z3' boolean)' in method call: com.google.android.gms.internal.measurement.zzagg.zzw(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.measurement.zzagf
    public final void zzc(Object obj, long j6, boolean z3) {
        if (zzagg.zzb) {
            zzagg.zzv(obj, j6, z3);
        } else {
            zzagg.zzw(obj, j6, z3);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzagf
    public final float zzd(Object obj, long j6) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j6));
    }

    @Override // com.google.android.gms.internal.measurement.zzagf
    public final void zze(Object obj, long j6, float f10) {
        this.zza.putInt(obj, j6, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.measurement.zzagf
    public final double zzf(Object obj, long j6) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j6));
    }

    @Override // com.google.android.gms.internal.measurement.zzagf
    public final void zzg(Object obj, long j6, double d2) {
        this.zza.putLong(obj, j6, Double.doubleToLongBits(d2));
    }
}

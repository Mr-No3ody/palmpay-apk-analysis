package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzog {
    private final String zza = "com.google.android.gms.measurement";
    private final zzph zzb;

    public zzog(String str, zzph zzphVar) {
        this.zzb = zzphVar;
    }

    public final zzom zza(String str, boolean z3) {
        return new zznx(this.zza, str, this.zzb, z3);
    }

    public final zzom zzb(String str, long j6) {
        return new zzob(this.zza, str, this.zzb, j6);
    }

    public final zzom zzc(String str, double d2) {
        return new zznz(this.zza, "measurement.test.double_flag", this.zzb, -3.0d);
    }

    public final zzom zzd(String str, String str2) {
        return new zzod(this.zza, str, this.zzb, str2);
    }
}

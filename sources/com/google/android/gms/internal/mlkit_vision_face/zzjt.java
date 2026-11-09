package com.google.android.gms.internal.mlkit_vision_face;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjt {
    private Long zza;
    private Long zzb;
    private Long zzc;
    private Long zzd;
    private Long zze;
    private Long zzf;

    public final zzjt zza(Long l5) {
        this.zzc = Long.valueOf(l5.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzjt zzb(Long l5) {
        this.zzd = Long.valueOf(l5.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzjt zzc(Long l5) {
        this.zza = Long.valueOf(l5.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzjt zzd(Long l5) {
        this.zze = Long.valueOf(l5.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzjt zze(Long l5) {
        this.zzb = Long.valueOf(l5.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzjt zzf(Long l5) {
        this.zzf = Long.valueOf(l5.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzjv zzg() {
        return new zzjv(this, null);
    }
}

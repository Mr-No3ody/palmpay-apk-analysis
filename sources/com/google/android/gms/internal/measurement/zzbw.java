package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
final class zzbw extends zzcc {
    private String zza;
    private byte zzb;
    private int zzc;
    private int zzd;

    public final zzcc zza(String str) {
        this.zza = "";
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final zzcc zzb(boolean z3) {
        this.zzb = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final zzcd zzc() {
        if (this.zzb == 1 && this.zza != null && this.zzc != 0 && this.zzd != 0) {
            return new zzbx(this.zza, false, this.zzc, null, this.zzd, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" fileOwner");
        }
        if (this.zzb == 0) {
            sb2.append(" hasDifferentDmaOwner");
        }
        if (this.zzc == 0) {
            sb2.append(" fileChecks");
        }
        if (this.zzd == 0) {
            sb2.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final zzcc zzd(int i7) {
        this.zzc = i7;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final zzcc zze(int i7) {
        this.zzd = 1;
        return this;
    }
}

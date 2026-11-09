package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
final class zzqr {
    private final boolean zza;
    private final int zzb;
    private final int zzc;

    public zzqr() {
        this.zzb = 2;
        this.zzc = 2;
        this.zza = true;
    }

    public final zzmd zza() {
        if (this.zza) {
            return zzmd.zzb();
        }
        int i7 = this.zzb;
        zzmc zzmcVarZza = zzmd.zza();
        zzmcVarZza.zza(i7);
        zzmcVarZza.zzb(this.zzc);
        return (zzmd) zzmcVarZza.zzbd();
    }

    public final int zzb() {
        return this.zzc;
    }

    public final /* synthetic */ int zzc() {
        return this.zzb;
    }

    public zzqr(int i7) {
        this.zzb = 2;
        this.zzc = i7;
        this.zza = false;
    }

    public zzqr(int i7, int i10) {
        this.zzb = i7;
        this.zzc = i10;
        this.zza = false;
    }
}

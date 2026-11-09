package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzabm {
    private final zzaaf zza;
    private int zzb = 0;
    private int zzc = -1;

    public zzabm(zzaaf zzaafVar) {
        zzabr.zza(zzaafVar, "context");
        this.zza = zzaafVar;
    }

    public abstract void zzb(int i7, int i10, zzabh zzabhVar);

    public abstract Object zzg();

    public final zzabn zzh() {
        return this.zza.zza();
    }

    public final String zzi() {
        return this.zza.zzb();
    }

    public final int zzj() {
        return this.zzc + 1;
    }

    public final void zzk(int i7, int i10, zzabh zzabhVar) {
        if (zzabhVar.zzc() < 32) {
            this.zzb |= 1 << zzabhVar.zzc();
        }
        this.zzc = Math.max(this.zzc, zzabhVar.zzc());
        zzb(i7, i10, zzabhVar);
    }

    public final Object zzl() {
        zzaaf zzaafVar = this.zza;
        zzaafVar.zza().zzc(this);
        int i7 = this.zzb;
        if (((i7 + 1) & i7) != 0 || (this.zzc > 31 && i7 != -1)) {
            throw zzabo.zzd(String.format("unreferenced arguments [first missing index=%d]", Integer.valueOf(Integer.numberOfTrailingZeros(~i7))), zzaafVar.zzb());
        }
        return zzg();
    }
}

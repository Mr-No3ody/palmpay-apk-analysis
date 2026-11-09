package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
final class zzaet {
    private static final zzafa zzb = new zzaer();
    private final zzafa zza;

    public zzaet() {
        zzado zzadoVarZza = zzado.zza();
        int i7 = zzacf.zza;
        this.zza = new zzaes(zzadoVarZza, zzb);
    }

    public final zzafp zza(Class cls) {
        int i7 = zzafq.zza;
        if (!zzadu.class.isAssignableFrom(cls)) {
            int i10 = zzacf.zza;
        }
        zzaez zzaezVarZzc = this.zza.zzc(cls);
        if (zzaezVarZzc.zza()) {
            int i11 = zzacf.zza;
            return zzafg.zzh(zzafq.zzB(), zzadi.zza(), zzaezVarZzc.zzb());
        }
        int i12 = zzacf.zza;
        return zzaff.zzm(cls, zzaezVarZzc, zzafi.zza(), zzaep.zza(), zzafq.zzB(), zzaezVarZzc.zzc() + (-1) != 1 ? zzadi.zza() : null, zzaey.zza());
    }
}

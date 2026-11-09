package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
final class zzaes implements zzafa {
    private final zzafa[] zza;

    public zzaes(zzafa... zzafaVarArr) {
        this.zza = zzafaVarArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzafa
    public final boolean zzb(Class cls) {
        for (int i7 = 0; i7 < 2; i7++) {
            if (this.zza[i7].zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzafa
    public final zzaez zzc(Class cls) {
        for (int i7 = 0; i7 < 2; i7++) {
            zzafa zzafaVar = this.zza[i7];
            if (zzafaVar.zzb(cls)) {
                return zzafaVar.zzc(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}

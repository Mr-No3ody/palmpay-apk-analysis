package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
final class zzagb extends zzafz {
    @Override // com.google.android.gms.internal.measurement.zzafz
    public final /* bridge */ /* synthetic */ void zza(Object obj, int i7, long j6) {
        ((zzaga) obj).zzk(i7 << 3, Long.valueOf(j6));
    }

    @Override // com.google.android.gms.internal.measurement.zzafz
    public final /* bridge */ /* synthetic */ void zzb(Object obj, int i7, int i10) {
        ((zzaga) obj).zzk((i7 << 3) | 5, Integer.valueOf(i10));
    }

    @Override // com.google.android.gms.internal.measurement.zzafz
    public final /* bridge */ /* synthetic */ void zzc(Object obj, int i7, long j6) {
        ((zzaga) obj).zzk((i7 << 3) | 1, Long.valueOf(j6));
    }

    @Override // com.google.android.gms.internal.measurement.zzafz
    public final /* bridge */ /* synthetic */ void zzd(Object obj, int i7, zzacr zzacrVar) {
        ((zzaga) obj).zzk((i7 << 3) | 2, zzacrVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzafz
    public final /* bridge */ /* synthetic */ void zze(Object obj, int i7, Object obj2) {
        ((zzaga) obj).zzk((i7 << 3) | 3, (zzaga) obj2);
    }

    @Override // com.google.android.gms.internal.measurement.zzafz
    public final /* synthetic */ Object zzf() {
        return zzaga.zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzafz
    public final /* synthetic */ Object zzg(Object obj) {
        zzaga zzagaVar = (zzaga) obj;
        zzagaVar.zzd();
        return zzagaVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzafz
    public final /* bridge */ /* synthetic */ Object zzh(Object obj) {
        zzadu zzaduVar = (zzadu) obj;
        zzaga zzagaVar = zzaduVar.zzc;
        if (zzagaVar != zzaga.zza()) {
            return zzagaVar;
        }
        zzaga zzagaVarZzb = zzaga.zzb();
        zzaduVar.zzc = zzagaVarZzb;
        return zzagaVarZzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzafz
    public final /* synthetic */ void zzi(Object obj, Object obj2) {
        ((zzadu) obj).zzc = (zzaga) obj2;
    }

    @Override // com.google.android.gms.internal.measurement.zzafz
    public final void zzj(Object obj) {
        ((zzadu) obj).zzc.zzd();
    }
}

package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzabg extends zzabh {
    private final zzabf zza;

    private zzabg(zzza zzzaVar, int i7, zzabf zzabfVar) {
        super(zzzaVar, i7);
        this.zza = zzabfVar;
        StringBuilder sb2 = new StringBuilder("%");
        zzzaVar.zzl(sb2);
        sb2.append(true != zzzaVar.zzk() ? 't' : 'T');
        sb2.append(zzabfVar.zzb());
    }

    public static zzabh zza(zzabf zzabfVar, zzza zzzaVar, int i7) {
        return new zzabg(zzzaVar, i7, zzabfVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzabh
    public final void zzb(zzabi zzabiVar, Object obj) {
        zzabiVar.zzd(obj, this.zza, zzd());
    }
}

package com.google.android.gms.internal.identity;

/* JADX INFO: loaded from: classes2.dex */
final class zzev extends zzet {
    private final zzex zza;

    public zzev(zzex zzexVar, int i7) {
        super(zzexVar.size(), i7);
        this.zza = zzexVar;
    }

    @Override // com.google.android.gms.internal.identity.zzet
    public final Object zza(int i7) {
        return this.zza.get(i7);
    }
}

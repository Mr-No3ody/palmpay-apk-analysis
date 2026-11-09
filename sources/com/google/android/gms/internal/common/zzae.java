package com.google.android.gms.internal.common;

/* JADX INFO: loaded from: classes2.dex */
final class zzae extends zzz {
    private final zzah zza;

    public zzae(zzah zzahVar, int i7) {
        super(zzahVar.size(), i7);
        this.zza = zzahVar;
    }

    @Override // com.google.android.gms.internal.common.zzz
    public final Object zza(int i7) {
        return this.zza.get(i7);
    }
}

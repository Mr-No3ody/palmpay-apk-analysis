package com.google.android.gms.internal.mlkit_common;

/* JADX INFO: loaded from: classes2.dex */
public enum zziu implements zzbj {
    UNKNOWN(0),
    TRANSLATE(1);

    private final int zzd;

    zziu(int i7) {
        this.zzd = i7;
    }

    public static zziu zzb(int i7) {
        for (zziu zziuVar : values()) {
            if (zziuVar.zzd == i7) {
                return zziuVar;
            }
        }
        return UNKNOWN;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbj
    public final int zza() {
        return this.zzd;
    }
}

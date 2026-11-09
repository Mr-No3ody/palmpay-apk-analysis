package com.google.android.gms.internal.mlkit_vision_face;

/* JADX INFO: loaded from: classes2.dex */
public enum zzkr implements zzcs {
    TYPE_UNKNOWN(0),
    TYPE_THIN(1),
    TYPE_THICK(2),
    TYPE_GMV(3);

    private final int zzf;

    zzkr(int i7) {
        this.zzf = i7;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzcs
    public final int zza() {
        return this.zzf;
    }
}

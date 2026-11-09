package com.google.android.gms.internal.mlkit_vision_face;

/* JADX INFO: loaded from: classes2.dex */
public enum zzkb implements zzcs {
    UNKNOWN_PERFORMANCE(0),
    FAST(1),
    ACCURATE(2);

    private final int zze;

    zzkb(int i7) {
        this.zze = i7;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzcs
    public final int zza() {
        return this.zze;
    }
}

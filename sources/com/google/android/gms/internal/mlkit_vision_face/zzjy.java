package com.google.android.gms.internal.mlkit_vision_face;

/* JADX INFO: loaded from: classes2.dex */
public enum zzjy implements zzcs {
    UNKNOWN_CLASSIFICATIONS(0),
    NO_CLASSIFICATIONS(1),
    ALL_CLASSIFICATIONS(2);

    private final int zze;

    zzjy(int i7) {
        this.zze = i7;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzcs
    public final int zza() {
        return this.zze;
    }
}

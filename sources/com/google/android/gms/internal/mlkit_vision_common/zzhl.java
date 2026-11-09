package com.google.android.gms.internal.mlkit_vision_common;

/* JADX INFO: loaded from: classes2.dex */
public enum zzhl implements zzag {
    SOURCE_UNKNOWN(0),
    BITMAP(1),
    BYTEARRAY(2),
    BYTEBUFFER(3),
    FILEPATH(4),
    ANDROID_MEDIA_IMAGE(5);

    private final int zzh;

    zzhl(int i7) {
        this.zzh = i7;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzag
    public final int zza() {
        return this.zzh;
    }
}

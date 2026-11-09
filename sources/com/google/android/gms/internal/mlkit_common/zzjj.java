package com.google.android.gms.internal.mlkit_common;

/* JADX INFO: loaded from: classes2.dex */
public enum zzjj implements zzbj {
    SOURCE_UNKNOWN(0),
    APP_ASSET(1),
    LOCAL(2),
    CLOUD(3),
    SDK_BUILT_IN(4),
    URI(5);

    private final int zzh;

    zzjj(int i7) {
        this.zzh = i7;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbj
    public final int zza() {
        return this.zzh;
    }
}

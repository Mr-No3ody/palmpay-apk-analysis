package com.google.android.gms.internal.maps;

import androidx.camera.camera2.internal.F;

/* JADX INFO: loaded from: classes2.dex */
final class zzbl {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    public zzbl(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    public final IllegalArgumentException zza() {
        Object obj = this.zzc;
        Object obj2 = this.zzb;
        Object obj3 = this.zza;
        String strValueOf = String.valueOf(obj3);
        String strValueOf2 = String.valueOf(obj2);
        return new IllegalArgumentException(F.d(F.f("Multiple entries with same key: ", strValueOf, "=", strValueOf2, " and "), String.valueOf(obj3), "=", String.valueOf(obj)));
    }
}

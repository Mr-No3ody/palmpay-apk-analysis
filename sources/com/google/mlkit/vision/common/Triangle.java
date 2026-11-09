package com.google.mlkit.vision.common;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_vision_common.zzp;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public class Triangle<T> {
    private final zzp zza;

    @KeepForSdk
    public Triangle(@NonNull T t, @NonNull T t3, @NonNull T t8) {
        this.zza = zzp.zzj(t, t3, t8);
    }

    @NonNull
    @KeepForSdk
    public List<T> getAllPoints() {
        return this.zza;
    }
}

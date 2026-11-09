package com.google.android.odml.image;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class ByteBufferMlImageBuilder {
    private final ByteBuffer zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private int zze = 0;
    private Rect zzf;

    public ByteBufferMlImageBuilder(@NonNull ByteBuffer byteBuffer, int i7, int i10, int i11) {
        this.zza = byteBuffer;
        this.zzb = i7;
        this.zzc = i10;
        this.zzd = i11;
        this.zzf = new Rect(0, 0, i7, i10);
    }

    @NonNull
    public MlImage build() {
        return new MlImage(new zzf(this.zza, this.zzd), this.zze, this.zzf, 0L, this.zzb, this.zzc);
    }

    @NonNull
    public ByteBufferMlImageBuilder setRotation(int i7) {
        MlImage.zzc(i7);
        this.zze = i7;
        return this;
    }
}

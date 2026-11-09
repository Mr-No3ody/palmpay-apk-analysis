package com.google.android.gms.internal.mlkit_common;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjp {
    private final zzjl zza;
    private final zzjn zzb = null;
    private final zzjn zzc = null;
    private final Boolean zzd = null;

    public /* synthetic */ zzjp(zzjm zzjmVar, zzjo zzjoVar) {
        this.zza = zzjmVar.zza;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof zzjp) && Objects.equal(this.zza, ((zzjp) obj).zza) && Objects.equal(null, null) && Objects.equal(null, null) && Objects.equal(null, null);
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, null, null, null);
    }

    @Nullable
    @zzbl(zza = 1)
    public final zzjl zza() {
        return this.zza;
    }
}

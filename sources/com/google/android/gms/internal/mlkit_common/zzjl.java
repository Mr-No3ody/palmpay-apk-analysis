package com.google.android.gms.internal.mlkit_common;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjl {
    private final String zza;
    private final zzjj zzc;
    private final String zze;
    private final zzji zzf;
    private final String zzb = null;
    private final String zzd = null;
    private final Long zzg = null;
    private final Boolean zzh = null;
    private final Boolean zzi = null;

    public /* synthetic */ zzjl(zzjh zzjhVar, zzjk zzjkVar) {
        this.zza = zzjhVar.zza;
        this.zzc = zzjhVar.zzb;
        this.zze = zzjhVar.zzc;
        this.zzf = zzjhVar.zzd;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzjl)) {
            return false;
        }
        zzjl zzjlVar = (zzjl) obj;
        return Objects.equal(this.zza, zzjlVar.zza) && Objects.equal(null, null) && Objects.equal(this.zzc, zzjlVar.zzc) && Objects.equal(null, null) && Objects.equal(this.zze, zzjlVar.zze) && Objects.equal(this.zzf, zzjlVar.zzf) && Objects.equal(null, null) && Objects.equal(null, null) && Objects.equal(null, null);
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, null, this.zzc, null, this.zze, this.zzf, null, null, null);
    }

    @Nullable
    @zzbl(zza = 6)
    public final zzji zza() {
        return this.zzf;
    }

    @Nullable
    @zzbl(zza = 3)
    public final zzjj zzb() {
        return this.zzc;
    }

    @Nullable
    @zzbl(zza = 5)
    public final String zzc() {
        return this.zze;
    }

    @Nullable
    @zzbl(zza = 1)
    public final String zzd() {
        return this.zza;
    }
}

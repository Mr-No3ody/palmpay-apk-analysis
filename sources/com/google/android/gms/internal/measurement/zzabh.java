package com.google.android.gms.internal.measurement;

import com.horcrux.svg.d0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzabh {
    private final int zza;
    private final zzza zzb;

    public zzabh(zzza zzzaVar, int i7) {
        if (zzzaVar == null) {
            throw new IllegalArgumentException("format options cannot be null");
        }
        if (i7 < 0) {
            throw new IllegalArgumentException(d0.n(i7, "invalid index: ", new StringBuilder(String.valueOf(i7).length() + 15)));
        }
        this.zza = i7;
        this.zzb = zzzaVar;
    }

    public abstract void zzb(zzabi zzabiVar, Object obj);

    public final int zzc() {
        return this.zza;
    }

    public final zzza zzd() {
        return this.zzb;
    }

    public final void zze(zzabi zzabiVar, Object[] objArr) {
        int i7 = this.zza;
        if (i7 >= objArr.length) {
            zzabiVar.zze();
            return;
        }
        Object obj = objArr[i7];
        if (obj != null) {
            zzb(zzabiVar, obj);
        } else {
            zzabiVar.zzf();
        }
    }
}

package com.google.android.gms.internal.mlkit_common;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
class zzai extends zzaj {
    Object[] zza = new Object[4];
    int zzb = 0;
    boolean zzc;

    public zzai(int i7) {
    }

    private final void zzc(int i7) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length < i7) {
            this.zza = Arrays.copyOf(objArr, zzaj.zzb(length, i7));
            this.zzc = false;
        } else if (this.zzc) {
            this.zza = (Object[]) objArr.clone();
            this.zzc = false;
        }
    }

    public final zzai zza(Object obj) {
        obj.getClass();
        zzc(this.zzb + 1);
        Object[] objArr = this.zza;
        int i7 = this.zzb;
        this.zzb = i7 + 1;
        objArr[i7] = obj;
        return this;
    }
}

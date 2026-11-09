package com.google.android.gms.internal.mlkit_vision_common;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
class zzj extends zzk {
    Object[] zza = new Object[4];
    int zzb = 0;
    boolean zzc;

    public zzj(int i7) {
    }

    private final void zzb(int i7) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length >= i7) {
            if (this.zzc) {
                this.zza = (Object[]) objArr.clone();
                this.zzc = false;
                return;
            }
            return;
        }
        int i10 = length + (length >> 1) + 1;
        if (i10 < i7) {
            int iHighestOneBit = Integer.highestOneBit(i7 - 1);
            i10 = iHighestOneBit + iHighestOneBit;
        }
        if (i10 < 0) {
            i10 = Integer.MAX_VALUE;
        }
        this.zza = Arrays.copyOf(objArr, i10);
        this.zzc = false;
    }

    public final zzj zza(Object obj) {
        obj.getClass();
        zzb(this.zzb + 1);
        Object[] objArr = this.zza;
        int i7 = this.zzb;
        this.zzb = i7 + 1;
        objArr[i7] = obj;
        return this;
    }
}

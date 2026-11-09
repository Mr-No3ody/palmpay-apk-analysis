package com.google.android.gms.internal.common;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
class zzaa extends zzab {
    Object[] zza = new Object[4];
    int zzb = 0;
    boolean zzc;

    public zzaa(int i7) {
    }

    public final zzaa zza(Object obj) {
        int i7;
        obj.getClass();
        int length = this.zza.length;
        int i10 = this.zzb;
        int i11 = i10 + 1;
        if (i11 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i11 <= length) {
            i7 = length;
        } else {
            i7 = (length >> 1) + length + 1;
            if (i7 < i11) {
                int iHighestOneBit = Integer.highestOneBit(i10);
                i7 = iHighestOneBit + iHighestOneBit;
            }
            if (i7 < 0) {
                i7 = Integer.MAX_VALUE;
            }
        }
        if (i7 > length || this.zzc) {
            this.zza = Arrays.copyOf(this.zza, i7);
            this.zzc = false;
        }
        Object[] objArr = this.zza;
        int i12 = this.zzb;
        this.zzb = i12 + 1;
        objArr[i12] = obj;
        return this;
    }
}

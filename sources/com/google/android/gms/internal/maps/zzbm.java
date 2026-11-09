package com.google.android.gms.internal.maps;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbm {
    Object[] zza;
    int zzb;
    zzbl zzc;

    public zzbm() {
        this(4);
    }

    private final void zzb(int i7) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i10 = i7 + i7;
        if (i10 > length) {
            if (i10 > length) {
                length = length + (length >> 1) + 1;
                if (length < i10) {
                    int iHighestOneBit = Integer.highestOneBit(i10 - 1);
                    length = iHighestOneBit + iHighestOneBit;
                }
                if (length < 0) {
                    length = Integer.MAX_VALUE;
                }
            }
            this.zza = Arrays.copyOf(objArr, length);
        }
    }

    public final zzbm zza(Iterable iterable) {
        if (iterable instanceof Collection) {
            zzb(((Collection) iterable).size() + this.zzb);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            zzb(this.zzb + 1);
            zzbf.zza(key, value);
            Object[] objArr = this.zza;
            int i7 = this.zzb;
            int i10 = i7 + i7;
            objArr[i10] = key;
            objArr[i10 + 1] = value;
            this.zzb = i7 + 1;
        }
        return this;
    }

    public zzbm(int i7) {
        this.zza = new Object[i7 + i7];
        this.zzb = 0;
    }
}

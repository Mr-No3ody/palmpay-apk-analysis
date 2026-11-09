package com.google.android.gms.internal.common;

import com.horcrux.svg.d0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzai {
    public static Object[] zza(Object[] objArr, int i7) {
        for (int i10 = 0; i10 < i7; i10++) {
            if (objArr[i10] == null) {
                throw new NullPointerException(d0.n(i10, "at index ", new StringBuilder(String.valueOf(i10).length() + 9)));
            }
        }
        return objArr;
    }
}

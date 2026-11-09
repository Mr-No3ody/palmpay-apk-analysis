package com.google.android.gms.internal.mlkit_vision_common;

import C0.G;

/* JADX INFO: loaded from: classes2.dex */
public final class zzt {
    public static Object[] zza(Object[] objArr, int i7) {
        for (int i10 = 0; i10 < i7; i10++) {
            if (objArr[i10] == null) {
                throw new NullPointerException(G.m(i10, "at index "));
            }
        }
        return objArr;
    }
}

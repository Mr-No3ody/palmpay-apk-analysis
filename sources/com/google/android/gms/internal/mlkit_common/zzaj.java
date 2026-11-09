package com.google.android.gms.internal.mlkit_common;

/* JADX INFO: loaded from: classes2.dex */
public class zzaj {
    public static int zzb(int i7, int i10) {
        if (i10 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int i11 = i7 + (i7 >> 1) + 1;
        if (i11 < i10) {
            int iHighestOneBit = Integer.highestOneBit(i10 - 1);
            i11 = iHighestOneBit + iHighestOneBit;
        }
        if (i11 < 0) {
            return Integer.MAX_VALUE;
        }
        return i11;
    }
}

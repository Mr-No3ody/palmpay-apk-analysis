package com.google.android.gms.common;

/* JADX INFO: loaded from: classes2.dex */
final class zzz {
    public static int zza(int i7) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i10 = 0; i10 < 6; i10++) {
            int i11 = iArr[i10];
            int i12 = i11 - 1;
            if (i11 == 0) {
                throw null;
            }
            if (i12 == i7) {
                return i11;
            }
        }
        return 1;
    }
}

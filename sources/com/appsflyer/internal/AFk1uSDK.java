package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public final class AFk1uSDK {
    private static void AFAdRevenueData(int[] iArr) {
        for (int i7 = 0; i7 < iArr.length / 2; i7++) {
            int i10 = iArr[i7];
            iArr[i7] = iArr[(iArr.length - i7) - 1];
            iArr[(iArr.length - i7) - 1] = i10;
        }
    }

    public static void getMediationNetwork(int i7, int i10, boolean z3, int i11, int[] iArr, int[][] iArr2, int[] iArr3) {
        if (!z3) {
            AFAdRevenueData(iArr);
        }
        int i12 = 0;
        while (i12 < i11) {
            int i13 = i7 ^ iArr[i12];
            int mediationNetwork = i10 ^ getMediationNetwork(i13, iArr2);
            i12++;
            i10 = i13;
            i7 = mediationNetwork;
        }
        int i14 = i7 ^ iArr[iArr.length - 2];
        int i15 = i10 ^ iArr[iArr.length - 1];
        if (!z3) {
            AFAdRevenueData(iArr);
        }
        iArr3[0] = i15;
        iArr3[1] = i14;
    }

    private static int getMediationNetwork(int i7, int[][] iArr) {
        return ((iArr[0][i7 >>> 24] + iArr[1][(i7 >>> 16) & 255]) ^ iArr[2][(i7 >>> 8) & 255]) + iArr[3][i7 & 255];
    }
}

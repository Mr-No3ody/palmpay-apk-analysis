package com.adjust.sdk.sig;

/* JADX INFO: loaded from: classes.dex */
public abstract class w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f19520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f19521b;

    static {
        String[] strArr = new String[93];
        for (int i7 = 0; i7 < 32; i7++) {
            int i10 = (i7 >> 12) & 15;
            int i11 = (i7 >> 8) & 15;
            int i12 = (i7 >> 4) & 15;
            int i13 = i7 & 15;
            strArr[i7] = "\\u" + ((char) (i10 < 10 ? i10 + 48 : i10 + 87)) + ((char) (i11 < 10 ? i11 + 48 : i11 + 87)) + ((char) (i12 < 10 ? i12 + 48 : i12 + 87)) + ((char) (i13 < 10 ? i13 + 48 : i13 + 87));
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f19520a = strArr;
        byte[] bArr = new byte[93];
        for (int i14 = 0; i14 < 32; i14++) {
            bArr[i14] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f19521b = bArr;
    }
}

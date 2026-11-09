package com.nimbusds.jose.shaded.gson.internal;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f23641a;

    static {
        int i7;
        String property = System.getProperty("java.version");
        try {
            String[] strArrSplit = property.split("[._]");
            i7 = Integer.parseInt(strArrSplit[0]);
            if (i7 == 1 && strArrSplit.length > 1) {
                i7 = Integer.parseInt(strArrSplit[1]);
            }
        } catch (NumberFormatException unused) {
            i7 = -1;
        }
        if (i7 == -1) {
            try {
                StringBuilder sb2 = new StringBuilder();
                for (int i10 = 0; i10 < property.length(); i10++) {
                    char cCharAt = property.charAt(i10);
                    if (!Character.isDigit(cCharAt)) {
                        break;
                    }
                    sb2.append(cCharAt);
                }
                i7 = Integer.parseInt(sb2.toString());
            } catch (NumberFormatException unused2) {
                i7 = -1;
            }
        }
        if (i7 == -1) {
            i7 = 6;
        }
        f23641a = i7;
    }
}

package com.adjust.sdk.sig;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f19457a;

    static {
        Object j2Var;
        int length;
        int i7;
        boolean z3;
        int i10;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            if (property != null && (length = property.length()) != 0) {
                int i11 = 0;
                char cCharAt = property.charAt(0);
                int i12 = -2147483647;
                if (cCharAt < '0') {
                    z3 = true;
                    if (length != 1) {
                        if (cCharAt == '+') {
                            i7 = 1;
                            z3 = false;
                        } else if (cCharAt == '-') {
                            i12 = Integer.MIN_VALUE;
                            i7 = 1;
                        }
                    }
                    j2Var = null;
                    break;
                }
                i7 = 0;
                z3 = false;
                int i13 = -59652323;
                while (true) {
                    if (i7 >= length) {
                        if (!z3) {
                            j2Var = Integer.valueOf(-i11);
                            break;
                        } else {
                            j2Var = Integer.valueOf(i11);
                            break;
                        }
                    }
                    int iDigit = Character.digit((int) property.charAt(i7), 10);
                    if (iDigit >= 0 && ((i11 >= i13 || (i13 == -59652323 && i11 >= (i13 = i12 / 10))) && (i10 = i11 * 10) >= i12 + iDigit)) {
                        i11 = i10 - iDigit;
                        i7++;
                    }
                    j2Var = null;
                    break;
                }
            }
            j2Var = null;
            break;
        } catch (Throwable th) {
            j2Var = new j2(th);
        }
        Integer num = (Integer) (j2Var instanceof j2 ? null : j2Var);
        f19457a = num != null ? num.intValue() : 2097152;
    }
}

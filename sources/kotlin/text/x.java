package kotlin.text;

import com.transsnet.palmpay.bean.HomeDialogState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public class x extends w {
    /* JADX WARN: Code duplicated, block: B:106:0x0121  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c5  */
    public static final boolean d(String str) {
        char c6;
        boolean z3;
        boolean z8;
        int i7;
        boolean z10;
        String str2;
        boolean z11;
        boolean z12 = true;
        int length = str.length() - 1;
        int i10 = 0;
        while (true) {
            c6 = ' ';
            if (i10 > length || str.charAt(i10) > ' ') {
                break;
            }
            i10++;
        }
        if (i10 > length) {
            return false;
        }
        while (length > i10 && str.charAt(length) <= ' ') {
            length--;
        }
        if (str.charAt(i10) == '+' || str.charAt(i10) == '-') {
            i10++;
        }
        if (i10 > length) {
            return false;
        }
        if (str.charAt(i10) != '0') {
            z3 = true;
            z8 = false;
        } else {
            int i11 = i10 + 1;
            if (i11 > length) {
                return true;
            }
            if ((str.charAt(i11) | ' ') == 120) {
                int i12 = i10 + 2;
                int i13 = i12;
                while (true) {
                    if (i13 > length) {
                        z3 = z12;
                        break;
                    }
                    char cCharAt = str.charAt(i13);
                    z3 = z12;
                    if (((cCharAt - '0') & 65535) >= 10 && (((cCharAt | ' ') - 97) & 65535) >= 6) {
                        break;
                    }
                    i13++;
                    z12 = z3;
                }
                boolean z13 = i12 != i13 ? z3 : false;
                if (i13 <= length) {
                    if (str.charAt(i13) == '.') {
                        int i14 = i13 + 1;
                        int i15 = i14;
                        while (i15 <= length) {
                            char cCharAt2 = str.charAt(i15);
                            char c10 = c6;
                            if (((cCharAt2 - '0') & 65535) >= 10 && (((cCharAt2 | ' ') - 97) & 65535) >= 6) {
                                break;
                            }
                            i15++;
                            c6 = c10;
                        }
                        z11 = i14 != i15 ? z3 : false;
                        i13 = i15;
                    } else {
                        z11 = false;
                    }
                    if (z13 || z11) {
                        i10 = i13;
                    }
                    if (i10 != -1 || i10 > length) {
                        return false;
                    }
                    z8 = z3;
                }
                i10 = -1;
                if (i10 != -1) {
                }
                return false;
            }
            z3 = true;
            z8 = false;
        }
        if (!z8) {
            int i16 = i10;
            while (i16 <= length && ((str.charAt(i16) - '0') & 65535) < 10) {
                i16++;
            }
            boolean z14 = i10 != i16 ? z3 : false;
            if (i16 > length) {
                i10 = i16;
            } else {
                if (str.charAt(i16) == '.') {
                    int i17 = i16 + 1;
                    i7 = i17;
                    while (i7 <= length && ((str.charAt(i7) - '0') & 65535) < 10) {
                        i7++;
                    }
                    if (i17 != i7) {
                        z10 = z3;
                    }
                    if (!z14 || z10) {
                        i10 = i7;
                    } else {
                        if (length == i7 + 2) {
                            str2 = "NaN";
                        } else {
                            str2 = length == i7 + 7 ? "Infinity" : null;
                        }
                        i10 = (str2 != null && StringsKt__StringsKt.o(false, str2, str, i7) == i7) ? length + 1 : -1;
                    }
                } else {
                    i7 = i16;
                }
                z10 = false;
                if (z14) {
                    i10 = i7;
                } else {
                    i10 = i7;
                }
            }
            if (i10 == -1) {
                return false;
            }
            if (i10 > length) {
                return z3;
            }
        }
        int i18 = i10 + 1;
        int iCharAt = str.charAt(i10) | ' ';
        if (iCharAt != (z8 ? HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR : 101)) {
            if (z8 || (!(iCharAt == 102 || iCharAt == 100) || i18 <= length)) {
                return false;
            }
            return z3;
        }
        if (i18 > length) {
            return false;
        }
        if ((str.charAt(i18) == '+' || str.charAt(i18) == '-') && (i18 = i10 + 2) > length) {
            return false;
        }
        while (i18 <= length && ((str.charAt(i18) - '0') & 65535) < 10) {
            i18++;
        }
        if (i18 > length) {
            return z3;
        }
        if (i18 != length) {
            return false;
        }
        int iCharAt2 = str.charAt(i18) | ' ';
        if (iCharAt2 == 102 || iCharAt2 == 100) {
            return z3;
        }
        return false;
    }

    public static Double e(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            if (d(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }
}

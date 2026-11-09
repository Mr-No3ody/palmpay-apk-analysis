package com.google.common.base;

import com.airbnb.lottie.model.layer.d;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.maps.android.BuildConfig;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Strings {
    private Strings() {
    }

    public static String commonPrefix(CharSequence charSequence, CharSequence charSequence2) {
        Preconditions.checkNotNull(charSequence);
        Preconditions.checkNotNull(charSequence2);
        int iMin = Math.min(charSequence.length(), charSequence2.length());
        int i7 = 0;
        while (i7 < iMin && charSequence.charAt(i7) == charSequence2.charAt(i7)) {
            i7++;
        }
        int i10 = i7 - 1;
        if (validSurrogatePairAt(charSequence, i10) || validSurrogatePairAt(charSequence2, i10)) {
            i7--;
        }
        return charSequence.subSequence(0, i7).toString();
    }

    public static String commonSuffix(CharSequence charSequence, CharSequence charSequence2) {
        Preconditions.checkNotNull(charSequence);
        Preconditions.checkNotNull(charSequence2);
        int iMin = Math.min(charSequence.length(), charSequence2.length());
        int i7 = 0;
        while (i7 < iMin && charSequence.charAt((charSequence.length() - i7) - 1) == charSequence2.charAt((charSequence2.length() - i7) - 1)) {
            i7++;
        }
        if (validSurrogatePairAt(charSequence, (charSequence.length() - i7) - 1) || validSurrogatePairAt(charSequence2, (charSequence2.length() - i7) - 1)) {
            i7--;
        }
        return charSequence.subSequence(charSequence.length() - i7, charSequence.length()).toString();
    }

    @CheckForNull
    public static String emptyToNull(@CheckForNull String str) {
        return Platform.emptyToNull(str);
    }

    public static boolean isNullOrEmpty(@CheckForNull String str) {
        return Platform.stringIsNullOrEmpty(str);
    }

    public static String lenientFormat(@CheckForNull String str, @CheckForNull Object... objArr) {
        int iIndexOf;
        String strValueOf = String.valueOf(str);
        int i7 = 0;
        if (objArr == null) {
            objArr = new Object[]{"(Object[])null"};
        } else {
            for (int i10 = 0; i10 < objArr.length; i10++) {
                objArr[i10] = lenientToString(objArr[i10]);
            }
        }
        StringBuilder sb2 = new StringBuilder((objArr.length * 16) + strValueOf.length());
        int i11 = 0;
        while (i7 < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i11)) != -1) {
            sb2.append((CharSequence) strValueOf, i11, iIndexOf);
            sb2.append(objArr[i7]);
            i11 = iIndexOf + 2;
            i7++;
        }
        sb2.append((CharSequence) strValueOf, i11, strValueOf.length());
        if (i7 < objArr.length) {
            sb2.append(" [");
            sb2.append(objArr[i7]);
            for (int i12 = i7 + 1; i12 < objArr.length; i12++) {
                sb2.append(", ");
                sb2.append(objArr[i12]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    private static String lenientToString(@CheckForNull Object obj) {
        if (obj == null) {
            return BuildConfig.TRAVIS;
        }
        try {
            return obj.toString();
        } catch (Exception e10) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            StringBuilder sb2 = new StringBuilder(d.c(name.length() + 1, hexString));
            sb2.append(name);
            sb2.append('@');
            sb2.append(hexString);
            String string = sb2.toString();
            Logger logger = Logger.getLogger("com.google.common.base.Strings");
            Level level = Level.WARNING;
            String strValueOf = String.valueOf(string);
            logger.log(level, strValueOf.length() != 0 ? "Exception during lenientFormat for ".concat(strValueOf) : new String("Exception during lenientFormat for "), (Throwable) e10);
            String name2 = e10.getClass().getName();
            StringBuilder sbP = d.p("<", name2.length() + d.c(9, string), string, " threw ", name2);
            sbP.append(">");
            return sbP.toString();
        }
    }

    public static String nullToEmpty(@CheckForNull String str) {
        return Platform.nullToEmpty(str);
    }

    public static String padEnd(String str, int i7, char c6) {
        Preconditions.checkNotNull(str);
        if (str.length() >= i7) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(i7);
        sb2.append(str);
        for (int length = str.length(); length < i7; length++) {
            sb2.append(c6);
        }
        return sb2.toString();
    }

    public static String padStart(String str, int i7, char c6) {
        Preconditions.checkNotNull(str);
        if (str.length() >= i7) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(i7);
        for (int length = str.length(); length < i7; length++) {
            sb2.append(c6);
        }
        sb2.append(str);
        return sb2.toString();
    }

    public static String repeat(String str, int i7) {
        Preconditions.checkNotNull(str);
        if (i7 <= 1) {
            Preconditions.checkArgument(i7 >= 0, "invalid count: %s", i7);
            return i7 == 0 ? "" : str;
        }
        int length = str.length();
        long j6 = ((long) length) * ((long) i7);
        int i10 = (int) j6;
        if (i10 != j6) {
            StringBuilder sb2 = new StringBuilder(51);
            sb2.append("Required array size too large: ");
            sb2.append(j6);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        char[] cArr = new char[i10];
        str.getChars(0, length, cArr, 0);
        while (true) {
            int i11 = i10 - length;
            if (length >= i11) {
                System.arraycopy(cArr, 0, cArr, length, i11);
                return new String(cArr);
            }
            System.arraycopy(cArr, 0, cArr, length, length);
            length <<= 1;
        }
    }

    @VisibleForTesting
    public static boolean validSurrogatePairAt(CharSequence charSequence, int i7) {
        return i7 >= 0 && i7 <= charSequence.length() + (-2) && Character.isHighSurrogate(charSequence.charAt(i7)) && Character.isLowSurrogate(charSequence.charAt(i7 + 1));
    }
}

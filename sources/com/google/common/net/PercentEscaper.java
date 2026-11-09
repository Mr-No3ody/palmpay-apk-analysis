package com.google.common.net;

import com.airbnb.lottie.model.layer.d;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.escape.UnicodeEscaper;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class PercentEscaper extends UnicodeEscaper {
    private static final char[] PLUS_SIGN = {'+'};
    private static final char[] UPPER_HEX_DIGITS = "0123456789ABCDEF".toCharArray();
    private final boolean plusForSpace;
    private final boolean[] safeOctets;

    public PercentEscaper(String str, boolean z3) {
        Preconditions.checkNotNull(str);
        if (str.matches(".*[0-9A-Za-z].*")) {
            throw new IllegalArgumentException("Alphanumeric characters are always 'safe' and should not be explicitly specified");
        }
        String strConcat = str.concat("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        if (z3 && strConcat.contains(" ")) {
            throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
        }
        this.plusForSpace = z3;
        this.safeOctets = createSafeOctets(strConcat);
    }

    private static boolean[] createSafeOctets(String str) {
        char[] charArray = str.toCharArray();
        int iMax = -1;
        for (char c6 : charArray) {
            iMax = Math.max((int) c6, iMax);
        }
        boolean[] zArr = new boolean[iMax + 1];
        for (char c10 : charArray) {
            zArr[c10] = true;
        }
        return zArr;
    }

    @Override // com.google.common.escape.UnicodeEscaper, com.google.common.escape.Escaper
    public String escape(String str) {
        Preconditions.checkNotNull(str);
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            char cCharAt = str.charAt(i7);
            boolean[] zArr = this.safeOctets;
            if (cCharAt >= zArr.length || !zArr[cCharAt]) {
                return escapeSlow(str, i7);
            }
        }
        return str;
    }

    @Override // com.google.common.escape.UnicodeEscaper
    public int nextEscapeIndex(CharSequence charSequence, int i7, int i10) {
        Preconditions.checkNotNull(charSequence);
        while (i7 < i10) {
            char cCharAt = charSequence.charAt(i7);
            boolean[] zArr = this.safeOctets;
            if (cCharAt >= zArr.length || !zArr[cCharAt]) {
                break;
            }
            i7++;
        }
        return i7;
    }

    @Override // com.google.common.escape.UnicodeEscaper
    @CheckForNull
    public char[] escape(int i7) {
        boolean[] zArr = this.safeOctets;
        if (i7 < zArr.length && zArr[i7]) {
            return null;
        }
        if (i7 == 32 && this.plusForSpace) {
            return PLUS_SIGN;
        }
        if (i7 <= 127) {
            char[] cArr = UPPER_HEX_DIGITS;
            return new char[]{'%', cArr[i7 >>> 4], cArr[i7 & 15]};
        }
        if (i7 <= 2047) {
            char[] cArr2 = UPPER_HEX_DIGITS;
            return new char[]{'%', cArr2[(i7 >>> 10) | 12], cArr2[(i7 >>> 6) & 15], '%', cArr2[((i7 >>> 4) & 3) | 8], cArr2[i7 & 15]};
        }
        if (i7 <= 65535) {
            char[] cArr3 = UPPER_HEX_DIGITS;
            return new char[]{'%', 'E', cArr3[i7 >>> 12], '%', cArr3[((i7 >>> 10) & 3) | 8], cArr3[(i7 >>> 6) & 15], '%', cArr3[((i7 >>> 4) & 3) | 8], cArr3[i7 & 15]};
        }
        if (i7 <= 1114111) {
            char[] cArr4 = UPPER_HEX_DIGITS;
            return new char[]{'%', 'F', cArr4[(i7 >>> 18) & 7], '%', cArr4[((i7 >>> 16) & 3) | 8], cArr4[(i7 >>> 12) & 15], '%', cArr4[((i7 >>> 10) & 3) | 8], cArr4[(i7 >>> 6) & 15], '%', cArr4[((i7 >>> 4) & 3) | 8], cArr4[i7 & 15]};
        }
        throw new IllegalArgumentException(d.g(43, i7, "Invalid unicode character value "));
    }
}

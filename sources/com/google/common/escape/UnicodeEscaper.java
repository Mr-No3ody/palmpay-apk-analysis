package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class UnicodeEscaper extends Escaper {
    private static final int DEST_PAD = 32;

    public static int codePointAt(CharSequence charSequence, int i7, int i10) {
        Preconditions.checkNotNull(charSequence);
        if (i7 >= i10) {
            throw new IndexOutOfBoundsException("Index exceeds specified range");
        }
        int i11 = i7 + 1;
        char cCharAt = charSequence.charAt(i7);
        if (cCharAt < 55296 || cCharAt > 57343) {
            return cCharAt;
        }
        if (cCharAt > 56319) {
            String strValueOf = String.valueOf(charSequence);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 88);
            sb2.append("Unexpected low surrogate character '");
            sb2.append(cCharAt);
            sb2.append("' with value ");
            sb2.append((int) cCharAt);
            sb2.append(" at index ");
            sb2.append(i7);
            sb2.append(" in '");
            sb2.append(strValueOf);
            sb2.append("'");
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i11 == i10) {
            return -cCharAt;
        }
        char cCharAt2 = charSequence.charAt(i11);
        if (Character.isLowSurrogate(cCharAt2)) {
            return Character.toCodePoint(cCharAt, cCharAt2);
        }
        String strValueOf2 = String.valueOf(charSequence);
        StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 89);
        sb3.append("Expected low surrogate but got char '");
        sb3.append(cCharAt2);
        sb3.append("' with value ");
        sb3.append((int) cCharAt2);
        sb3.append(" at index ");
        sb3.append(i11);
        sb3.append(" in '");
        sb3.append(strValueOf2);
        sb3.append("'");
        throw new IllegalArgumentException(sb3.toString());
    }

    private static char[] growBuffer(char[] cArr, int i7, int i10) {
        if (i10 < 0) {
            throw new AssertionError("Cannot increase internal buffer any further");
        }
        char[] cArr2 = new char[i10];
        if (i7 > 0) {
            System.arraycopy(cArr, 0, cArr2, 0, i7);
        }
        return cArr2;
    }

    @Override // com.google.common.escape.Escaper
    public String escape(String str) {
        Preconditions.checkNotNull(str);
        int length = str.length();
        int iNextEscapeIndex = nextEscapeIndex(str, 0, length);
        return iNextEscapeIndex == length ? str : escapeSlow(str, iNextEscapeIndex);
    }

    @CheckForNull
    public abstract char[] escape(int i7);

    public final String escapeSlow(String str, int i7) {
        int length = str.length();
        char[] cArrCharBufferFromThreadLocal = Platform.charBufferFromThreadLocal();
        int i10 = 0;
        int length2 = 0;
        while (i7 < length) {
            int iCodePointAt = codePointAt(str, i7, length);
            if (iCodePointAt < 0) {
                throw new IllegalArgumentException("Trailing high surrogate at end of input");
            }
            char[] cArrEscape = escape(iCodePointAt);
            int i11 = (Character.isSupplementaryCodePoint(iCodePointAt) ? 2 : 1) + i7;
            if (cArrEscape != null) {
                int i12 = i7 - i10;
                int i13 = length2 + i12;
                int length3 = cArrEscape.length + i13;
                if (cArrCharBufferFromThreadLocal.length < length3) {
                    cArrCharBufferFromThreadLocal = growBuffer(cArrCharBufferFromThreadLocal, length2, (length - i7) + length3 + 32);
                }
                if (i12 > 0) {
                    str.getChars(i10, i7, cArrCharBufferFromThreadLocal, length2);
                    length2 = i13;
                }
                if (cArrEscape.length > 0) {
                    System.arraycopy(cArrEscape, 0, cArrCharBufferFromThreadLocal, length2, cArrEscape.length);
                    length2 += cArrEscape.length;
                }
                i10 = i11;
            }
            i7 = nextEscapeIndex(str, i11, length);
        }
        int i14 = length - i10;
        if (i14 > 0) {
            int i15 = i14 + length2;
            if (cArrCharBufferFromThreadLocal.length < i15) {
                cArrCharBufferFromThreadLocal = growBuffer(cArrCharBufferFromThreadLocal, length2, i15);
            }
            str.getChars(i10, length, cArrCharBufferFromThreadLocal, length2);
            length2 = i15;
        }
        return new String(cArrCharBufferFromThreadLocal, 0, length2);
    }

    public int nextEscapeIndex(CharSequence charSequence, int i7, int i10) {
        while (i7 < i10) {
            int iCodePointAt = codePointAt(charSequence, i7, i10);
            if (iCodePointAt < 0 || escape(iCodePointAt) != null) {
                break;
            }
            i7 += Character.isSupplementaryCodePoint(iCodePointAt) ? 2 : 1;
        }
        return i7;
    }
}

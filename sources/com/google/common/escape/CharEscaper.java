package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class CharEscaper extends Escaper {
    private static final int DEST_PAD_MULTIPLIER = 2;

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
        for (int i7 = 0; i7 < length; i7++) {
            if (escape(str.charAt(i7)) != null) {
                return escapeSlow(str, i7);
            }
        }
        return str;
    }

    @CheckForNull
    public abstract char[] escape(char c6);

    public final String escapeSlow(String str, int i7) {
        int length = str.length();
        char[] cArrCharBufferFromThreadLocal = Platform.charBufferFromThreadLocal();
        int length2 = cArrCharBufferFromThreadLocal.length;
        int i10 = 0;
        int i11 = 0;
        while (i7 < length) {
            char[] cArrEscape = escape(str.charAt(i7));
            if (cArrEscape != null) {
                int length3 = cArrEscape.length;
                int i12 = i7 - i10;
                int i13 = i11 + i12;
                int i14 = i13 + length3;
                if (length2 < i14) {
                    length2 = ((length - i7) * 2) + i14;
                    cArrCharBufferFromThreadLocal = growBuffer(cArrCharBufferFromThreadLocal, i11, length2);
                }
                if (i12 > 0) {
                    str.getChars(i10, i7, cArrCharBufferFromThreadLocal, i11);
                    i11 = i13;
                }
                if (length3 > 0) {
                    System.arraycopy(cArrEscape, 0, cArrCharBufferFromThreadLocal, i11, length3);
                    i11 += length3;
                }
                i10 = i7 + 1;
            }
            i7++;
        }
        int i15 = length - i10;
        if (i15 > 0) {
            int i16 = i15 + i11;
            if (length2 < i16) {
                cArrCharBufferFromThreadLocal = growBuffer(cArrCharBufferFromThreadLocal, i11, i16);
            }
            str.getChars(i10, length, cArrCharBufferFromThreadLocal, i11);
            i11 = i16;
        }
        return new String(cArrCharBufferFromThreadLocal, 0, i11);
    }
}

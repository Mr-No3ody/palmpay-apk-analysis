package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ArrayBasedUnicodeEscaper extends UnicodeEscaper {
    private final char[][] replacements;
    private final int replacementsLength;
    private final int safeMax;
    private final char safeMaxChar;
    private final int safeMin;
    private final char safeMinChar;

    public ArrayBasedUnicodeEscaper(Map<Character, String> map, int i7, int i10, String str) {
        this(ArrayBasedEscaperMap.create(map), i7, i10, str);
    }

    @Override // com.google.common.escape.UnicodeEscaper, com.google.common.escape.Escaper
    public final String escape(String str) {
        Preconditions.checkNotNull(str);
        for (int i7 = 0; i7 < str.length(); i7++) {
            char cCharAt = str.charAt(i7);
            if ((cCharAt < this.replacementsLength && this.replacements[cCharAt] != null) || cCharAt > this.safeMaxChar || cCharAt < this.safeMinChar) {
                return escapeSlow(str, i7);
            }
        }
        return str;
    }

    @CheckForNull
    public abstract char[] escapeUnsafe(int i7);

    @Override // com.google.common.escape.UnicodeEscaper
    public final int nextEscapeIndex(CharSequence charSequence, int i7, int i10) {
        while (i7 < i10) {
            char cCharAt = charSequence.charAt(i7);
            if ((cCharAt < this.replacementsLength && this.replacements[cCharAt] != null) || cCharAt > this.safeMaxChar || cCharAt < this.safeMinChar) {
                break;
            }
            i7++;
        }
        return i7;
    }

    public ArrayBasedUnicodeEscaper(ArrayBasedEscaperMap arrayBasedEscaperMap, int i7, int i10, String str) {
        Preconditions.checkNotNull(arrayBasedEscaperMap);
        char[][] replacementArray = arrayBasedEscaperMap.getReplacementArray();
        this.replacements = replacementArray;
        this.replacementsLength = replacementArray.length;
        if (i10 < i7) {
            i10 = -1;
            i7 = Integer.MAX_VALUE;
        }
        this.safeMin = i7;
        this.safeMax = i10;
        if (i7 >= 55296) {
            this.safeMinChar = (char) 65535;
            this.safeMaxChar = (char) 0;
        } else {
            this.safeMinChar = (char) i7;
            this.safeMaxChar = (char) Math.min(i10, 55295);
        }
    }

    @Override // com.google.common.escape.UnicodeEscaper
    @CheckForNull
    public final char[] escape(int i7) {
        char[] cArr;
        if (i7 < this.replacementsLength && (cArr = this.replacements[i7]) != null) {
            return cArr;
        }
        if (i7 < this.safeMin || i7 > this.safeMax) {
            return escapeUnsafe(i7);
        }
        return null;
    }
}

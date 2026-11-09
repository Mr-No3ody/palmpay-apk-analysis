package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ArrayBasedCharEscaper extends CharEscaper {
    private final char[][] replacements;
    private final int replacementsLength;
    private final char safeMax;
    private final char safeMin;

    public ArrayBasedCharEscaper(Map<Character, String> map, char c6, char c10) {
        this(ArrayBasedEscaperMap.create(map), c6, c10);
    }

    @Override // com.google.common.escape.CharEscaper, com.google.common.escape.Escaper
    public final String escape(String str) {
        Preconditions.checkNotNull(str);
        for (int i7 = 0; i7 < str.length(); i7++) {
            char cCharAt = str.charAt(i7);
            if ((cCharAt < this.replacementsLength && this.replacements[cCharAt] != null) || cCharAt > this.safeMax || cCharAt < this.safeMin) {
                return escapeSlow(str, i7);
            }
        }
        return str;
    }

    @CheckForNull
    public abstract char[] escapeUnsafe(char c6);

    public ArrayBasedCharEscaper(ArrayBasedEscaperMap arrayBasedEscaperMap, char c6, char c10) {
        Preconditions.checkNotNull(arrayBasedEscaperMap);
        char[][] replacementArray = arrayBasedEscaperMap.getReplacementArray();
        this.replacements = replacementArray;
        this.replacementsLength = replacementArray.length;
        if (c10 < c6) {
            c10 = 0;
            c6 = 65535;
        }
        this.safeMin = c6;
        this.safeMax = c10;
    }

    @Override // com.google.common.escape.CharEscaper
    @CheckForNull
    public final char[] escape(char c6) {
        char[] cArr;
        if (c6 < this.replacementsLength && (cArr = this.replacements[c6]) != null) {
            return cArr;
        }
        if (c6 < this.safeMin || c6 > this.safeMax) {
            return escapeUnsafe(c6);
        }
        return null;
    }
}

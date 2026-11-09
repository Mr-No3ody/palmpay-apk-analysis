package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class CharEscaperBuilder {
    private int max = -1;
    private final Map<Character, String> map = new HashMap();

    @CanIgnoreReturnValue
    public CharEscaperBuilder addEscape(char c6, String str) {
        this.map.put(Character.valueOf(c6), (String) Preconditions.checkNotNull(str));
        if (c6 > this.max) {
            this.max = c6;
        }
        return this;
    }

    @CanIgnoreReturnValue
    public CharEscaperBuilder addEscapes(char[] cArr, String str) {
        Preconditions.checkNotNull(str);
        for (char c6 : cArr) {
            addEscape(c6, str);
        }
        return this;
    }

    public char[][] toArray() {
        char[][] cArr = new char[this.max + 1][];
        for (Map.Entry<Character, String> entry : this.map.entrySet()) {
            cArr[entry.getKey().charValue()] = entry.getValue().toCharArray();
        }
        return cArr;
    }

    public Escaper toEscaper() {
        return new CharArrayDecorator(toArray());
    }

    public static class CharArrayDecorator extends CharEscaper {
        private final int replaceLength;
        private final char[][] replacements;

        public CharArrayDecorator(char[][] cArr) {
            this.replacements = cArr;
            this.replaceLength = cArr.length;
        }

        @Override // com.google.common.escape.CharEscaper, com.google.common.escape.Escaper
        public String escape(String str) {
            int length = str.length();
            for (int i7 = 0; i7 < length; i7++) {
                char cCharAt = str.charAt(i7);
                char[][] cArr = this.replacements;
                if (cCharAt < cArr.length && cArr[cCharAt] != null) {
                    return escapeSlow(str, i7);
                }
            }
            return str;
        }

        @Override // com.google.common.escape.CharEscaper
        @CheckForNull
        public char[] escape(char c6) {
            if (c6 < this.replaceLength) {
                return this.replacements[c6];
            }
            return null;
        }
    }
}

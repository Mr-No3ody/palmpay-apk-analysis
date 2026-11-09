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
public final class Escapers {
    private static final Escaper NULL_ESCAPER = new CharEscaper() { // from class: com.google.common.escape.Escapers.1
        @Override // com.google.common.escape.CharEscaper
        @CheckForNull
        public char[] escape(char c6) {
            return null;
        }

        @Override // com.google.common.escape.CharEscaper, com.google.common.escape.Escaper
        public String escape(String str) {
            return (String) Preconditions.checkNotNull(str);
        }
    };

    public static final class Builder {
        private final Map<Character, String> replacementMap;
        private char safeMax;
        private char safeMin;

        @CheckForNull
        private String unsafeReplacement;

        @CanIgnoreReturnValue
        public Builder addEscape(char c6, String str) {
            Preconditions.checkNotNull(str);
            this.replacementMap.put(Character.valueOf(c6), str);
            return this;
        }

        public Escaper build() {
            return new ArrayBasedCharEscaper(this.replacementMap, this.safeMin, this.safeMax) { // from class: com.google.common.escape.Escapers.Builder.1

                @CheckForNull
                private final char[] replacementChars;

                {
                    this.replacementChars = Builder.this.unsafeReplacement != null ? Builder.this.unsafeReplacement.toCharArray() : null;
                }

                @Override // com.google.common.escape.ArrayBasedCharEscaper
                @CheckForNull
                public char[] escapeUnsafe(char c6) {
                    return this.replacementChars;
                }
            };
        }

        @CanIgnoreReturnValue
        public Builder setSafeRange(char c6, char c10) {
            this.safeMin = c6;
            this.safeMax = c10;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setUnsafeReplacement(String str) {
            this.unsafeReplacement = str;
            return this;
        }

        private Builder() {
            this.replacementMap = new HashMap();
            this.safeMin = (char) 0;
            this.safeMax = (char) 65535;
            this.unsafeReplacement = null;
        }
    }

    private Escapers() {
    }

    public static UnicodeEscaper asUnicodeEscaper(Escaper escaper) {
        Preconditions.checkNotNull(escaper);
        if (escaper instanceof UnicodeEscaper) {
            return (UnicodeEscaper) escaper;
        }
        if (escaper instanceof CharEscaper) {
            return wrap((CharEscaper) escaper);
        }
        String name = escaper.getClass().getName();
        throw new IllegalArgumentException(name.length() != 0 ? "Cannot create a UnicodeEscaper from: ".concat(name) : new String("Cannot create a UnicodeEscaper from: "));
    }

    public static Builder builder() {
        return new Builder();
    }

    @CheckForNull
    public static String computeReplacement(CharEscaper charEscaper, char c6) {
        return stringOrNull(charEscaper.escape(c6));
    }

    public static Escaper nullEscaper() {
        return NULL_ESCAPER;
    }

    @CheckForNull
    private static String stringOrNull(@CheckForNull char[] cArr) {
        if (cArr == null) {
            return null;
        }
        return new String(cArr);
    }

    private static UnicodeEscaper wrap(final CharEscaper charEscaper) {
        return new UnicodeEscaper() { // from class: com.google.common.escape.Escapers.2
            @Override // com.google.common.escape.UnicodeEscaper
            @CheckForNull
            public char[] escape(int i7) {
                if (i7 < 65536) {
                    return charEscaper.escape((char) i7);
                }
                char[] cArr = new char[2];
                Character.toChars(i7, cArr, 0);
                char[] cArrEscape = charEscaper.escape(cArr[0]);
                char[] cArrEscape2 = charEscaper.escape(cArr[1]);
                if (cArrEscape == null && cArrEscape2 == null) {
                    return null;
                }
                int length = cArrEscape != null ? cArrEscape.length : 1;
                char[] cArr2 = new char[(cArrEscape2 != null ? cArrEscape2.length : 1) + length];
                if (cArrEscape != null) {
                    for (int i10 = 0; i10 < cArrEscape.length; i10++) {
                        cArr2[i10] = cArrEscape[i10];
                    }
                } else {
                    cArr2[0] = cArr[0];
                }
                if (cArrEscape2 == null) {
                    cArr2[length] = cArr[1];
                    return cArr2;
                }
                for (int i11 = 0; i11 < cArrEscape2.length; i11++) {
                    cArr2[length + i11] = cArrEscape2[i11];
                }
                return cArr2;
            }
        };
    }

    @CheckForNull
    public static String computeReplacement(UnicodeEscaper unicodeEscaper, int i7) {
        return stringOrNull(unicodeEscaper.escape(i7));
    }
}

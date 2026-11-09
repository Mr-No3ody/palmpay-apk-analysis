package com.transsnet.palmpay.util;

/* JADX INFO: loaded from: classes4.dex */
public final class StringUtils {
    private StringUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static boolean equals(CharSequence charSequence, CharSequence charSequence2) {
        int length;
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || (length = charSequence.length()) != charSequence2.length()) {
            return false;
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return charSequence.equals(charSequence2);
        }
        for (int i7 = 0; i7 < length; i7++) {
            if (charSequence.charAt(i7) != charSequence2.charAt(i7)) {
                return false;
            }
        }
        return true;
    }

    public static boolean equalsIgnoreCase(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equalsIgnoreCase(str2);
    }

    public static boolean isEmpty(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static boolean isSpace(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            if (!Character.isWhitespace(str.charAt(i7))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isTrimEmpty(String str) {
        return str == null || str.trim().length() == 0;
    }

    public static int length(CharSequence charSequence) {
        if (charSequence == null) {
            return 0;
        }
        return charSequence.length();
    }

    public static String lowerFirstLetter(String str) {
        if (isEmpty(str) || !Character.isUpperCase(str.charAt(0))) {
            return str;
        }
        return String.valueOf((char) (str.charAt(0) + ' ')) + str.substring(1);
    }

    public static String null2Length0(String str) {
        return str == null ? "" : str;
    }

    public static String reverse(String str) {
        int length = length(str);
        if (length <= 1) {
            return str;
        }
        int i7 = length >> 1;
        char[] charArray = str.toCharArray();
        for (int i10 = 0; i10 < i7; i10++) {
            char c6 = charArray[i10];
            int i11 = (length - i10) - 1;
            charArray[i10] = charArray[i11];
            charArray[i11] = c6;
        }
        return new String(charArray);
    }

    public static String toDBC(String str) {
        if (isEmpty(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        for (int i7 = 0; i7 < length; i7++) {
            char c6 = charArray[i7];
            if (c6 == 12288) {
                charArray[i7] = ' ';
            } else if (65281 > c6 || c6 > 65374) {
                charArray[i7] = c6;
            } else {
                charArray[i7] = (char) (c6 - 65248);
            }
        }
        return new String(charArray);
    }

    public static String toSBC(String str) {
        if (isEmpty(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        for (int i7 = 0; i7 < length; i7++) {
            char c6 = charArray[i7];
            if (c6 == ' ') {
                charArray[i7] = 12288;
            } else if ('!' > c6 || c6 > '~') {
                charArray[i7] = c6;
            } else {
                charArray[i7] = (char) (c6 + 65248);
            }
        }
        return new String(charArray);
    }

    public static String upperFirstLetter(String str) {
        if (isEmpty(str) || !Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        return String.valueOf((char) (str.charAt(0) - ' ')) + str.substring(1);
    }
}

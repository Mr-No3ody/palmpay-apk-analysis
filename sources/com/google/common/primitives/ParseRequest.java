package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;

/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
final class ParseRequest {
    final int radix;
    final String rawValue;

    private ParseRequest(String str, int i7) {
        this.rawValue = str;
        this.radix = i7;
    }

    public static ParseRequest fromString(String str) {
        if (str.length() == 0) {
            throw new NumberFormatException("empty string");
        }
        char cCharAt = str.charAt(0);
        int i7 = 16;
        if (str.startsWith("0x") || str.startsWith("0X")) {
            str = str.substring(2);
        } else if (cCharAt == '#') {
            str = str.substring(1);
        } else if (cCharAt != '0' || str.length() <= 1) {
            i7 = 10;
        } else {
            str = str.substring(1);
            i7 = 8;
        }
        return new ParseRequest(str, i7);
    }
}

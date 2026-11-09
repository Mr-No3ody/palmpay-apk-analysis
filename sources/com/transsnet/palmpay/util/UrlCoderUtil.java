package com.transsnet.palmpay.util;

import android.text.TextUtils;
import android.util.Log;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.BitSet;

/* JADX INFO: loaded from: classes4.dex */
public class UrlCoderUtil {
    private static final String TAG = "UrlCoderUtil";
    static BitSet dontNeedEncoding = new BitSet(128);

    static {
        for (int i7 = 97; i7 <= 122; i7++) {
            dontNeedEncoding.set(i7);
        }
        for (int i10 = 65; i10 <= 90; i10++) {
            dontNeedEncoding.set(i10);
        }
        for (int i11 = 48; i11 <= 57; i11++) {
            dontNeedEncoding.set(i11);
        }
        dontNeedEncoding.set(43);
        dontNeedEncoding.set(45);
        dontNeedEncoding.set(95);
        dontNeedEncoding.set(46);
        dontNeedEncoding.set(42);
        dontNeedEncoding.set(37);
    }

    private UrlCoderUtil() {
    }

    public static String decode(String str) {
        return decode(str, StandardCharsets.UTF_8);
    }

    public static String encode(String str) {
        return encode(str, StandardCharsets.UTF_8);
    }

    public static boolean hasEnCode(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int i7 = 0;
        while (i7 < str.length()) {
            char cCharAt = str.charAt(i7);
            if (!dontNeedEncoding.get(cCharAt)) {
                return false;
            }
            if (cCharAt == '%' && i7 + 2 < str.length()) {
                char cCharAt2 = str.charAt(i7 + 1);
                i7 += 2;
                char cCharAt3 = str.charAt(i7);
                if (!isDigit16Char(cCharAt2) || !isDigit16Char(cCharAt3)) {
                    return false;
                }
            }
            i7++;
        }
        return true;
    }

    private static boolean isDigit16Char(char c6) {
        if (c6 < '0' || c6 > '9') {
            return c6 >= 'A' && c6 <= 'F';
        }
        return true;
    }

    public static String decode(String str, Charset charset) {
        try {
            return URLDecoder.decode(str, charset.name());
        } catch (Exception e10) {
            Log.e(TAG, "decode: ", e10);
            return null;
        }
    }

    public static String encode(String str, Charset charset) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return URLEncoder.encode(str, charset.name());
        } catch (Exception e10) {
            Log.e(TAG, "encode: ", e10);
            return null;
        }
    }
}

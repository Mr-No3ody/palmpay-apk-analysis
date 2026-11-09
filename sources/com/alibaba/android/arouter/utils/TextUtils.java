package com.alibaba.android.arouter.utils;

import android.net.Uri;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class TextUtils {
    public static String formatStackTrace(StackTraceElement[] stackTraceElementArr) {
        StringBuilder sb2 = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            sb2.append("    at ");
            sb2.append(stackTraceElement.toString());
            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        }
        return sb2.toString();
    }

    public static String getLeft(String str) {
        return (!str.contains("|") || str.endsWith("|")) ? str : str.substring(0, str.indexOf("|"));
    }

    public static String getRight(String str) {
        return (!str.contains("|") || str.startsWith("|")) ? str : str.substring(str.indexOf("|") + 1);
    }

    public static boolean isEmpty(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static Map<String, String> splitQueryParameters(Uri uri) {
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            return Collections.EMPTY_MAP;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i7 = 0;
        do {
            int iIndexOf = encodedQuery.indexOf(38, i7);
            if (iIndexOf == -1) {
                iIndexOf = encodedQuery.length();
            }
            int iIndexOf2 = encodedQuery.indexOf(61, i7);
            if (iIndexOf2 > iIndexOf || iIndexOf2 == -1) {
                iIndexOf2 = iIndexOf;
            }
            String strSubstring = encodedQuery.substring(i7, iIndexOf2);
            if (!android.text.TextUtils.isEmpty(strSubstring)) {
                linkedHashMap.put(Uri.decode(strSubstring), Uri.decode(iIndexOf2 == iIndexOf ? "" : encodedQuery.substring(iIndexOf2 + 1, iIndexOf)));
            }
            i7 = iIndexOf + 1;
        } while (i7 < encodedQuery.length());
        return Collections.unmodifiableMap(linkedHashMap);
    }
}

package com.palmpay.lib.webview.offline.utils;

import C0.G;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public class UrlParamsUtils {
    private UrlParamsUtils() {
    }

    public static String urlAppendParam(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || str.contains(str2)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str);
        return str.contains("=") ? G.s(sb2, "&", str2, "=", str3) : G.s(sb2, "?", str2, "=", str3);
    }
}

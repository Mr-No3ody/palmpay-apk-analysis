package com.palmpay.lib.webview.offline.utils;

/* JADX INFO: loaded from: classes3.dex */
public class OfflineStringUtils {
    private OfflineStringUtils() {
    }

    public static String appendUnsafeString(String... strArr) {
        StringBuilder sb2 = new StringBuilder();
        for (String str : strArr) {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public static String getErrorString(Throwable th) {
        if (th == null) {
            return "UnknownError";
        }
        try {
            return th.getMessage();
        } catch (Exception unused) {
            return "UnknownError";
        }
    }
}

package com.palmpay.lib.webview.offline.utils;

import android.net.Uri;
import com.palmpay.lib.webview.offline.log.OfflineWebLog;

/* JADX INFO: loaded from: classes3.dex */
public class EnhWebUriUtils {
    private static final String TAG = "EnhWebUriUtils";

    public static String getMonitorUrl(String str) {
        try {
            int iIndexOf = str.indexOf("?");
            if (iIndexOf != -1) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str.substring(0, iIndexOf));
                int iIndexOf2 = str.indexOf("#");
                if (iIndexOf2 != -1) {
                    String strSubstring = str.substring(iIndexOf2);
                    if (strSubstring.contains("?")) {
                        String strSubstring2 = strSubstring.substring(0, strSubstring.indexOf("?"));
                        if (!"#".equals(strSubstring2.trim())) {
                            sb2.append(strSubstring2);
                        }
                        OfflineWebLog.d(TAG, "monitorUrl -> " + ((Object) sb2));
                    }
                }
                return sb2.toString();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return str == null ? "" : str;
    }

    public static String getScheme(String str) {
        try {
            return Uri.parse(str).getScheme();
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }
}

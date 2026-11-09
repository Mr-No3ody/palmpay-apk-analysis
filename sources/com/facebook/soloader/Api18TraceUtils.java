package com.facebook.soloader;

import N8.q0;
import android.annotation.TargetApi;
import android.os.Trace;

/* JADX INFO: loaded from: classes.dex */
@DoNotOptimize
@TargetApi(18)
class Api18TraceUtils {
    public static void a(String str, String str2, String str3) {
        String strY = q0.y(str, str2, str3);
        if (strY.length() > 127 && str2 != null) {
            int length = (127 - str.length()) - str3.length();
            StringBuilder sbS = androidx.camera.video.u.s(str);
            sbS.append(str2.substring(0, length));
            sbS.append(str3);
            strY = sbS.toString();
        }
        Trace.beginSection(strY);
    }
}

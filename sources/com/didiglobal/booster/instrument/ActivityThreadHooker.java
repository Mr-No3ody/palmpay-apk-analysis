package com.didiglobal.booster.instrument;

/* JADX INFO: loaded from: classes.dex */
public class ActivityThreadHooker {
    private static volatile boolean hooked;

    public static void hook(String str) {
        String strTrim;
        if (hooked) {
            return;
        }
        if (str == null) {
            strTrim = "";
        } else {
            try {
                strTrim = str.trim();
            } catch (Throwable unused) {
                return;
            }
        }
        hooked = new ActivityThreadCallback(strTrim.split("\\s*,\\s*")).hook();
    }
}

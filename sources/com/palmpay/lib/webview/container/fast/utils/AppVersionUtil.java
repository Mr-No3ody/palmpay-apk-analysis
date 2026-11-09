package com.palmpay.lib.webview.container.fast.utils;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes3.dex */
public class AppVersionUtil {
    public static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return 0;
        }
    }
}

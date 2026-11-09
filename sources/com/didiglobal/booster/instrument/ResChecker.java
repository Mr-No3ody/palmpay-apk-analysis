package com.didiglobal.booster.instrument;

import android.app.Application;
import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
public class ResChecker {
    public static void checkRes(Application application) {
        if (application.getAssets() == null || application.getResources() == null) {
            Process.killProcess(Process.myPid());
            System.exit(10);
        }
    }
}

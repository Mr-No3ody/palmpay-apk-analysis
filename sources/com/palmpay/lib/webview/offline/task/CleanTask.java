package com.palmpay.lib.webview.offline.task;

import com.palmpay.lib.webview.offline.log.OfflineWebLog;
import com.palmpay.lib.webview.offline.utils.OfflineFileUtils;
import com.palmpay.lib.webview.offline.utils.OfflinePackageUtil;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class CleanTask implements Runnable {
    private static final String TAG = "CleanTask";

    @Override // java.lang.Runnable
    public void run() {
        try {
            OfflineFileUtils.deleteDir(new File(OfflinePackageUtil.getResDir()));
        } catch (Exception e10) {
            OfflineWebLog.e(TAG, e10);
        }
    }
}

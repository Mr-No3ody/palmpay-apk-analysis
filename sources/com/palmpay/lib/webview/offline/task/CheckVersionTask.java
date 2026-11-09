package com.palmpay.lib.webview.offline.task;

import com.palmpay.lib.webview.offline.log.OfflineWebLog;
import com.palmpay.lib.webview.offline.utils.OfflineConstant;
import com.palmpay.lib.webview.offline.utils.OfflineFileUtils;
import com.palmpay.lib.webview.offline.utils.OfflinePackageUtil;
import java.io.File;
import java.io.FileFilter;

/* JADX INFO: loaded from: classes3.dex */
public class CheckVersionTask implements Runnable {
    private static final String TAG = "CheckVersionTask";

    @Override // java.lang.Runnable
    public void run() {
        File[] fileArrListFiles;
        OfflineWebLog.i(TAG, "checkVersions");
        File file = new File(OfflinePackageUtil.getResDir());
        if (!file.exists() || (fileArrListFiles = file.listFiles(new FileFilter() { // from class: com.palmpay.lib.webview.offline.task.CheckVersionTask.1
            @Override // java.io.FileFilter
            public boolean accept(File file2) {
                return file2.isDirectory();
            }
        })) == null || fileArrListFiles.length == 0) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (OfflineWebLog.loggable()) {
                OfflineWebLog.i(TAG, "check :" + file2.getName());
            }
            File file3 = new File(file2, OfflineConstant.NEW_DIR_NAME);
            File file4 = new File(file2, OfflineConstant.CUR_DIR_NAME);
            if (file3.exists() && file4.exists()) {
                OfflineFileUtils.rename(file4, OfflineConstant.OLD_DIR_NAME);
                OfflineFileUtils.rename(file3, OfflineConstant.CUR_DIR_NAME);
                OfflineWebLog.i(TAG, "update replace");
            } else if (file3.exists()) {
                OfflineWebLog.i(TAG, "update");
                OfflineFileUtils.rename(file3, OfflineConstant.CUR_DIR_NAME);
            }
            File file5 = new File(file2, OfflineConstant.OLD_DIR_NAME);
            if (file5.exists()) {
                String str = TAG;
                OfflineWebLog.i(str, "del start");
                OfflineFileUtils.deleteDir(file5);
                OfflineWebLog.i(str, "del done");
            }
        }
    }
}

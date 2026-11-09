package com.palmpay.lib.webview.offline.utils;

import C0.G;
import android.text.TextUtils;
import com.palmpay.lib.webview.offline.info.OfflineZipPackageConfig;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class OfflinePackageUtil {
    private OfflinePackageUtil() {
    }

    public static String getBisDir(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getResDir());
        return G.r(sb2, File.separator, str);
    }

    public static OfflineZipPackageConfig getOfflineConfig(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getBisDir(str));
        String str2 = File.separator;
        sb2.append(str2);
        sb2.append(OfflineConstant.CUR_DIR_NAME);
        sb2.append(str2);
        sb2.append(OfflineConstant.CONFIG_FILE_NAME);
        String file2String = OfflineFileUtils.readFile2String(sb2.toString());
        if (TextUtils.isEmpty(file2String)) {
            return null;
        }
        return (OfflineZipPackageConfig) OfflineGsonUtils.fromJson(file2String, OfflineZipPackageConfig.class);
    }

    public static String getPackageVersion(String str) {
        OfflineZipPackageConfig offlineConfig = getOfflineConfig(str);
        return offlineConfig == null ? "0" : offlineConfig.getVer();
    }

    public static String getPackageVersionCode(String str) {
        OfflineZipPackageConfig offlineConfig = getOfflineConfig(str);
        if (offlineConfig == null) {
            return null;
        }
        return offlineConfig.getVersionCode();
    }

    public static String getResDir() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(OfflineFileUtils.getInternalAppDataPath());
        return G.r(sb2, File.separator, OfflineConstant.ROOT_DIR_NAME);
    }
}

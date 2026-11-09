package com.transsnet.palmpay.util;

import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import com.luck.picture.lib.config.FileSizeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class SDCardUtils {
    private static final String TAG = "SDCardUtils";

    private SDCardUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static long getSDFreeSize() {
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return ((((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize())) / FileSizeUnit.KB) / FileSizeUnit.KB;
        } catch (Exception e10) {
            Log.e(TAG, "getSDFreeSize: ", e10);
            return 0L;
        }
    }

    public static long getSDTotalSize() {
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return ((((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())) / FileSizeUnit.KB) / FileSizeUnit.KB;
        } catch (Exception e10) {
            Log.e(TAG, "getSDTotalSize: ", e10);
            return 0L;
        }
    }
}

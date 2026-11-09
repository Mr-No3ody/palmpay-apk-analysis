package com.palmpay.lib.webview.container.fast.utils;

import com.luck.picture.lib.config.FileSizeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class MemorySizeCalculator {
    private static final int MB = 1048576;
    private static final int MB_10 = 10485760;
    private static final int MB_15 = 31457280;
    private static final int MB_5 = 5242880;

    public static int getSize() {
        int iMaxMemory = (int) (Runtime.getRuntime().maxMemory() / FileSizeUnit.MB);
        if (iMaxMemory >= 512) {
            return MB_15;
        }
        if (iMaxMemory >= 256) {
            return MB_10;
        }
        if (iMaxMemory > 128) {
            return MB_5;
        }
        return 0;
    }
}

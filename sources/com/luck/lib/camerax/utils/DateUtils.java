package com.luck.lib.camerax.utils;

import androidx.camera.video.u;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes3.dex */
public class DateUtils {
    private static final SimpleDateFormat sf = new SimpleDateFormat("yyyyMMddHHmmssSSS");

    public static String getCreateFileName(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sbS = u.s(str);
        sbS.append(sf.format(Long.valueOf(jCurrentTimeMillis)));
        return sbS.toString();
    }
}

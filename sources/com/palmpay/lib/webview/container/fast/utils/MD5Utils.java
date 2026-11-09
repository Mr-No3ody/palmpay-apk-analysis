package com.palmpay.lib.webview.container.fast.utils;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public class MD5Utils {
    public static String bytesToHex(byte[] bArr, boolean z3) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i7 = 0; i7 < bArr.length; i7++) {
            int i10 = bArr[i7];
            if (i10 < 0) {
                i10 += IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
            }
            if (i10 < 16) {
                stringBuffer.append("0");
            }
            stringBuffer.append(Integer.toHexString(i10));
        }
        return z3 ? stringBuffer.toString().toUpperCase() : stringBuffer.toString().toLowerCase();
    }

    public static String getMD5(String str) {
        return getMD5(str, true);
    }

    public static String getMD5(String str, boolean z3) {
        try {
            return bytesToHex(MessageDigest.getInstance("MD5").digest(str.getBytes()), z3);
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }
}

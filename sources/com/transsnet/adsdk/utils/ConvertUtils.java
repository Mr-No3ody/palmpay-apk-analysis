package com.transsnet.adsdk.utils;

import android.content.res.Resources;
import com.transsnet.adsdk.data.bean.req.AdReq;

/* JADX INFO: loaded from: classes3.dex */
public class ConvertUtils {
    public static int dp2px(final float dpValue) {
        return (int) ((dpValue * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static String json2QueryString(AdReq data) {
        String str = data.bizInfo;
        int length = (str != null ? str.length() : 4) + 39;
        String str2 = data.nonceStr;
        int length2 = length + (str2 != null ? str2.length() : 4) + 14;
        String str3 = data.version;
        StringBuilder sb2 = new StringBuilder(length2 + (str3 != null ? str3.length() : 4));
        sb2.append("bizInfo=");
        sb2.append(data.bizInfo);
        sb2.append("&nonceStr=");
        sb2.append(data.nonceStr);
        sb2.append("&requestTime=");
        sb2.append(data.requestTime);
        sb2.append("&version=");
        sb2.append(data.version);
        return sb2.toString();
    }
}

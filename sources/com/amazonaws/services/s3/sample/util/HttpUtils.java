package com.amazonaws.services.s3.sample.util;

import com.adjust.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* JADX INFO: loaded from: classes.dex */
public class HttpUtils {
    public static String urlEncode(String str, boolean z3) {
        try {
            String strEncode = URLEncoder.encode(str, Constants.ENCODING);
            return z3 ? strEncode.replace("%2F", "/") : strEncode;
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 encoding is not supported.", e10);
        }
    }
}

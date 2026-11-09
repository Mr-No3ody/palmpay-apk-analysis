package com.transsnet.palmpay.account.bean.rsp;

import Pa.C0525w;

/* JADX INFO: loaded from: classes3.dex */
public class SecurityVerifyMethod {
    public static final int METHOD_BVN = 3;
    public static final int METHOD_CAC = 8;
    public static final int METHOD_DOB = 4;
    public static final int METHOD_EMAIL = 9;
    public static final int METHOD_FACE = 5;
    public static final int METHOD_NIN = 7;
    public static final int METHOD_OTP = 2;
    public static final int METHOD_PIN = 1;
    public static final int METHOD_PSW = 6;
    public String extendInfo;
    public int verifyMethod;

    public String getString(String str) {
        return C0525w.j(this.extendInfo, str);
    }
}

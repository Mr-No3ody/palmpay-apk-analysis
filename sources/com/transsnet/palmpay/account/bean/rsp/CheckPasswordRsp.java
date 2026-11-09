package com.transsnet.palmpay.account.bean.rsp;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public class CheckPasswordRsp {
    public String errorCode;
    public String errorMessage;
    public String errorMsg;
    public boolean lock;
    public boolean passwordCheck;
    public int remainCount;

    public String getError() {
        if (TextUtils.isEmpty(this.errorMessage)) {
            return !TextUtils.isEmpty(this.errorMsg) ? this.errorMsg : this.errorCode;
        }
        return this.errorMessage;
    }
}

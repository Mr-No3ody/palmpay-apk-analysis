package com.transsnet.palmpay.account.bean.rsp;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public class CheckPinRsp {
    public String errorCode;
    private String errorMessage;
    public String errorMsg;
    private boolean lock;
    private String token;
    private boolean validate;
    private int validateCount;

    public String getError() {
        if (TextUtils.isEmpty(this.errorMessage)) {
            return !TextUtils.isEmpty(this.errorMsg) ? this.errorMsg : this.errorCode;
        }
        return this.errorMessage;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public String getToken() {
        return this.token;
    }

    public int getValidateCount() {
        return this.validateCount;
    }

    public boolean isLock() {
        return this.lock;
    }

    public boolean isValidate() {
        return this.validate;
    }

    public void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public void setLock(boolean z3) {
        this.lock = z3;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setValidate(boolean z3) {
        this.validate = z3;
    }

    public void setValidateCount(int i7) {
        this.validateCount = i7;
    }
}

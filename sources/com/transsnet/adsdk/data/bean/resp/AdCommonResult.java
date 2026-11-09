package com.transsnet.adsdk.data.bean.resp;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class AdCommonResult<T> {
    public static final String SUCCESS_CODE = "00000000";
    public T data;
    public String respCode;
    public String respMsg;

    public boolean isSuccess() {
        return "00000000".equals(this.respCode);
    }

    @NonNull
    public String toString() {
        return "respCode: " + this.respCode + " respMsg " + this.respMsg;
    }
}

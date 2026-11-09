package com.transsnet.mtn.sdk.http.resp;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class SmsHisDataForMtnResp extends CommonResult {
    public List<DataBean> data;

    public static class DataBean {
        public String amount;
        public String createDate;
        public String targetPhone;

        public String toString() {
            return "amount:" + this.amount + "\ncreateDate:" + this.createDate + "\ntargetPhone:" + this.targetPhone;
        }
    }
}

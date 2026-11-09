package com.transsnet.mtn.sdk.http.resp;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class RechargeRecordResp extends CommonResult {
    public List<DataBean> data;

    public static final class DataBean {
        public String rechargeAmount;
        public String rechargeDate;
    }
}

package com.transsnet.palmpay.send_money.bean;

import com.transsnet.palmpay.core.bean.CommonResult;

/* JADX INFO: loaded from: classes4.dex */
public class ApplyVoucherResp extends CommonResult {
    public Data data;

    public static class Data extends TransferData {
        public String status;
        public String statusDesc;
    }
}

package com.transsnet.palmpay.send_money.bean;

import com.transsnet.palmpay.core.bean.CommonResult;

/* JADX INFO: loaded from: classes4.dex */
public class QrcodeParseResp extends CommonResult {
    public Data data;

    public static class Data {
        public long amount;
        public String phone;
        public String ppAccountNo;
        public String recipientAccountId;
        public String recipientAvatar;
        public String recipientFullName;
        public String recipientMemberId;
        public String recipientRemark;
    }
}

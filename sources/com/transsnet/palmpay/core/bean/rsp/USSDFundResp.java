package com.transsnet.palmpay.core.bean.rsp;

import com.transsnet.palmpay.core.bean.CommonResult;

/* JADX INFO: loaded from: classes3.dex */
public class USSDFundResp extends CommonResult {
    public USSDDataBean data;

    public static class USSDDataBean {
        public String bankCode;
        public String bankLogo;
        public String bankName;
        public String dialCode;
        public String opGuide;
        public String opTips;
    }
}

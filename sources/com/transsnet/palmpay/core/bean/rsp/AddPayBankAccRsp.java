package com.transsnet.palmpay.core.bean.rsp;

import com.transsnet.palmpay.core.bean.CommonResult;

/* JADX INFO: loaded from: classes3.dex */
public class AddPayBankAccRsp extends CommonResult {
    public DataBean data;

    public static class DataBean {
        public String changeNameToken;
        public String reference;
        public int status;
        public String verifyMethod;
    }
}

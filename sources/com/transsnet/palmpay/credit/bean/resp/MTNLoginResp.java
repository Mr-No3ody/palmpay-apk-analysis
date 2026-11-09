package com.transsnet.palmpay.credit.bean.resp;

import com.transsnet.palmpay.core.bean.CommonResult;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class MTNLoginResp extends CommonResult {
    public DataBean data;

    public static class DataBean {
        public static final String OTP_INCORRECT = "40080005";
        public static final String OTP_INCORRECT_MANY_TIME = "40080007";
        public List<String> authorizationType;
        public String statusCode;
        public String statusMessage;
        public String transactionFlowUrl;
        public String userId;
    }

    public boolean isLoginOK() {
        return "00000000".equals(this.data.statusCode);
    }
}

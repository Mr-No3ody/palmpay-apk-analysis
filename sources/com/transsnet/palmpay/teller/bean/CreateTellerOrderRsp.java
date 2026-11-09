package com.transsnet.palmpay.teller.bean;

import com.transsnet.palmpay.core.bean.CommonResult;

/* JADX INFO: loaded from: classes4.dex */
public class CreateTellerOrderRsp extends CommonResult {
    public DataBean data;

    public static class DataBean {
        public String address;
        public String calculationExtInfo;
        public String channelTransactionId;
        public String fullName;
        public String orderDesc;
        public String orderNo;
        public int orderStatus;
        public long outstanding;
        public String outstandingTips;
        public String payId;
        public String payRouteId;
        public int payStatus;
        public String subPayId;
        public String token;
        public String url;
        public String verifyCode;
        public int verifyMethod;
    }
}

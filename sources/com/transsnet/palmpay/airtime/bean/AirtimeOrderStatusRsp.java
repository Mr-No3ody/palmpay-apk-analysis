package com.transsnet.palmpay.airtime.bean;

import com.transsnet.palmpay.core.bean.CommonResult;

/* JADX INFO: loaded from: classes3.dex */
public class AirtimeOrderStatusRsp extends CommonResult {
    public DataBean data;

    public static class DataBean {
        public String calculationExtInfo;
        public String mobileNo;
        public String orderDesc;
        public String orderNo;
        public int orderStatus;
    }
}

package com.transsnet.palmpay.core.bean.rsp;

import com.transsnet.palmpay.core.bean.CommonResult;

/* JADX INFO: loaded from: classes3.dex */
public class AllAuthInfoRsp extends CommonResult {
    public DataBean data;

    public static class DataBean {
        public String bankAccount;
        public String bankCard;
        public String bvn;
        public String firstName;
        public String idNum;
        public String lastName;
    }
}

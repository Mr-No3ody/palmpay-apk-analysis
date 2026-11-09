package com.transsnet.palmpay.core.bean.rsp;

import com.transsnet.palmpay.core.bean.CommonResult;

/* JADX INFO: loaded from: classes3.dex */
public class QueryPaymentRewardRsp extends CommonResult {
    public DataBean data;

    public static class DataBean {
        public String content;
        public long endTime;
        public String picUrl;
        public long startTime;
        public String tips;
    }
}

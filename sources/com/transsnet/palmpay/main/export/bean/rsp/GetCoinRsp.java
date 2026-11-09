package com.transsnet.palmpay.main.export.bean.rsp;

import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.rsp.JunePopWindowsBean;

/* JADX INFO: loaded from: classes4.dex */
public class GetCoinRsp extends CommonResult {
    public DataBean data;

    public static class DataBean {
        public String activityId;
        public long amount;
        public String itemName;
        public String itemUrl;
        public JunePopWindowsBean popWindowsDTO;
        public String productNo;
        public String randomId;
        public String type;
        public long value;
    }
}

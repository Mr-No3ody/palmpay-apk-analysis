package com.transsnet.palmpay.account.bean.rsp;

import com.transsnet.palmpay.core.bean.CommonResult;

/* JADX INFO: loaded from: classes3.dex */
public class DeviceActionRsp extends CommonResult {
    public DataBean data;

    public static class DataBean {
        public String businessRiskType;
        public String disposal;
        public String flowId;
    }
}

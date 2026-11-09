package com.transsnet.palmpay.core.bean.rsp;

import com.transsnet.palmpay.core.bean.CommonResult;

/* JADX INFO: loaded from: classes3.dex */
public class QrcodeGenerateResp extends CommonResult {
    public DataBean data;

    public static class DataBean {
        public int expiredate;
        public String qrcodeKey;
    }
}

package com.transsnet.palmpay.core.bean.rsp;

import com.transsnet.palmpay.core.bean.CommonResult;

/* JADX INFO: loaded from: classes3.dex */
public class AnalysisBlankQrCodeRsp extends CommonResult {
    public static final String BIND_STATUS_BINDED = "1";
    public static final String BIND_STATUS_UNBIND = "0";
    public static final String CODE_TYPE_PALMPAY = "1";
    public static final String CODE_TYPE_PARTNER = "2";
    public DataBean data;

    public static class DataBean {
        public String bindStatus;
        public String codeId;
        public String codeType;
        public String memberId;
        public String memberName;
        public String phone;
    }
}

package com.transsnet.palmpay.core.bean.rsp;

import com.transsnet.palmpay.core.bean.CommonResult;

/* JADX INFO: loaded from: classes3.dex */
public class AnalysisPartnerInCodeRsp extends CommonResult {
    private DataBean data;

    public static class DataBean {
        private PalmpayToPartnerPayInfoBean offlineMerchantPayInfo;

        public PalmpayToPartnerPayInfoBean getPalmpayToPartnerPayInfo() {
            return this.offlineMerchantPayInfo;
        }

        public void setPalmpayToPartnerPayInfo(PalmpayToPartnerPayInfoBean palmpayToPartnerPayInfo) {
            this.offlineMerchantPayInfo = palmpayToPartnerPayInfo;
        }
    }

    public DataBean getData() {
        return this.data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }
}

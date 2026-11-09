package com.transsnet.palmpay.main.export.bean.rsp;

import com.transsnet.palmpay.core.bean.CommonResult;

/* JADX INFO: loaded from: classes4.dex */
public class ThirdPartyMerchantResp extends CommonResult {
    private ThirdPartyMerchantListResp.ThirdPartyMerchant data;

    public ThirdPartyMerchantListResp.ThirdPartyMerchant getData() {
        return this.data;
    }

    public void setData(ThirdPartyMerchantListResp.ThirdPartyMerchant thirdPartyMerchant) {
        this.data = thirdPartyMerchant;
    }
}

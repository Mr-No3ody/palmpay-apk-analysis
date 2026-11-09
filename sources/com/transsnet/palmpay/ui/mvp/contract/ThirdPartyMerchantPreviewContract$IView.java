package com.transsnet.palmpay.ui.mvp.contract;

import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IView;
import com.transsnet.palmpay.main.export.bean.rsp.MerchantOrderPreviewResp;

/* JADX INFO: loaded from: classes4.dex */
public interface ThirdPartyMerchantPreviewContract$IView extends SelectPaymentContract$IView {
    void showMerchantOrder(CommonResult commonResult);

    void showMerchantOrderError(String str);

    void showPreviewPayInfo(CommonBeanResult<MerchantOrderPreviewResp> commonBeanResult);

    void showPreviewPayInfoError(String str);
}

package com.transsnet.palmpay.ui.mvp.contract;

import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.main.export.bean.req.MerchantOrderCompleteReq;
import com.transsnet.palmpay.main.export.bean.req.MerchantOrderPreviewReq;

/* JADX INFO: loaded from: classes4.dex */
public interface ThirdPartyMerchantPreviewContract$IPresenter<T> extends IBasePresenter<T> {
    void completeMerchantOrder(MerchantOrderCompleteReq merchantOrderCompleteReq);

    void queryPaymentMethod(MerchantOrderPreviewReq merchantOrderPreviewReq);

    void queryPreviewPayInfo(MerchantOrderPreviewReq merchantOrderPreviewReq);
}

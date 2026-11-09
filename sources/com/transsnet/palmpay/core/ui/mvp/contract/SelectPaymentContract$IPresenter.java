package com.transsnet.palmpay.core.ui.mvp.contract;

import com.transsnet.palmpay.core.bean.req.PreviewPayInfoV2Req;
import com.transsnet.palmpay.core.bean.req.QueryCouponByConditionReq;

/* JADX INFO: loaded from: classes3.dex */
public interface SelectPaymentContract$IPresenter<T> extends BasePaymentContract.IPresenter<T> {
    PreviewPayInfoV2Req getPreviewPayInfoReq();

    void queryCoupons(QueryCouponByConditionReq req);

    void queryLimitAmount(String transType, String payeeAccountType, String payerAccountType);

    void queryOkCardPreCreditInfo(boolean emptyPaymentMethod);

    void queryPaymentMethod(PreviewPayInfoV2Req req);

    default void queryPreviewPayInfo(PreviewPayInfoV2Req req) {
        savePreviewPayInfoReq(req);
    }

    void savePreviewPayInfoReq(PreviewPayInfoV2Req req);
}

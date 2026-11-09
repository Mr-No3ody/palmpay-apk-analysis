package com.transsnet.palmpay.core.ui.mvp.contract;

import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.core.bean.PaymentMethod;
import com.transsnet.palmpay.core.bean.PaymentMethodResp;
import com.transsnet.palmpay.core.bean.payment.PreviewPayInfoResp;
import com.transsnet.palmpay.core.bean.rsp.ActivityConfig;
import com.transsnet.palmpay.core.bean.rsp.LimitAmountResp;
import com.transsnet.palmpay.core.bean.rsp.OkCardPreCreditInfoRsp;
import com.transsnet.palmpay.core.bean.rsp.QueryLimitAmountResp;
import com.transsnet.palmpay.core.bean.rsp.QueryUserCouponsRsp;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface SelectPaymentContract$IView extends BasePaymentContract.IView {
    default boolean checkShowOkCardPreCreditInfo() {
        return false;
    }

    long getOrderAmount();

    default long getPalmPointsAmount() {
        return 0L;
    }

    String getTransType();

    void handleCommonPreviewInfo(PreviewPayInfoResp.DataBean data);

    void handleOkCardPreCreditInfo(OkCardPreCreditInfoRsp data);

    default void handlePaymentMethodActivityText(List<ActivityConfig> data) {
    }

    void handleQueryCouponRsp(QueryUserCouponsRsp rsp);

    void queryLimitAmountOK(QueryLimitAmountResp limitAmountResp);

    default void setCacheKey(String key) {
    }

    void setDefaultMethod(PaymentMethod method);

    void setFeeAmount(long amount);

    void setLimitAmount(LimitAmountResp limitAmountResp);

    void setPayAmount(long payAmount);

    void setUSSDData(List<BankInfo> USSDData);

    void showPaymentMethod(PaymentMethodResp resp);

    void showPaymentMethodError(String msg);

    void showPreviewPayInfo(PaymentMethod method, PreviewPayInfoResp.DataBean previewPayInfoResp);
}

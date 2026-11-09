package com.transsnet.palmpay.teller.ui.mvp.contract;

import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.bean.PaymentMethod;
import com.transsnet.palmpay.core.bean.payment.CheckPayResp;
import com.transsnet.palmpay.core.bean.payment.PreviewPayInfoResp;
import com.transsnet.palmpay.core.bean.req.DefaultPayMethodReq;
import com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IView;
import com.transsnet.palmpay.teller.bean.BettingWithdrawRedeemPayReq;

/* JADX INFO: loaded from: classes4.dex */
public interface BettingConfirmPaymentOrderContract {

    public interface Presenter extends IBasePresenter<View> {
        void bettingWithdrawRedeemCodePay(BettingWithdrawRedeemPayReq req);

        void queryBettingDefaultPayMethod(DefaultPayMethodReq methodReq);
    }

    public interface View extends SelectPaymentContract$IView {
        void handleBettingDefaultPaymentOrder(PaymentMethod bean);

        void handleBettingRedeemCodePay(CheckPayResp resp);

        void updatePreviewInfo(String payAccountType, PreviewPayInfoResp.DataBean bean);
    }
}

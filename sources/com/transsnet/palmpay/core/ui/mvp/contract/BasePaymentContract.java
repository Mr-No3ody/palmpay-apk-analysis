package com.transsnet.palmpay.core.ui.mvp.contract;

import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.core.bean.payment.PayByOrderReq;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;
import com.transsnet.palmpay.core.bean.req.QueryBankListReq;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface BasePaymentContract {

    public interface IPresenter<T> extends IBasePresenter<T> {
        void partnerPayByOrderNo(PayByOrderReq req);

        void payByNewOrderNo(PayByOrderReq req);

        void payByOrderNo(PayByOrderReq req);

        void queryBankList(QueryBankListReq req);
    }

    public interface IView extends IBaseView {
        default void handleBankList(List<BankInfo> bankInfos) {
        }

        default void payProcessUnexpectedStop(String errCode, String errMsg) {
        }

        void showLoadingView(boolean show);

        default void showPayResult(PayByOrderResp resp) {
        }
    }
}

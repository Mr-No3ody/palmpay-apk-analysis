package com.transsnet.palmpay.core.ui.mvp.contract;

import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.bean.payment.CheckPayReq;

/* JADX INFO: loaded from: classes3.dex */
public interface CheckPayContract$IPresenter<T> extends IBasePresenter<T> {
    void checkNewPay(CheckPayReq req);

    void checkPay(CheckPayReq req);

    void checkWithdrawalPay(CheckPayReq req);

    void partnerCheckPay(CheckPayReq req);

    void queryPayResult(CheckPayReq req);

    void queryPaymentReward(int accountType, String transType);

    void querySavingPayResult(CheckPayReq req);
}

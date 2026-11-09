package com.transsnet.palmpay.core.ui.mvp.contract;

import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.payment.CheckPayResp;
import com.transsnet.palmpay.core.bean.rsp.QueryPaymentRewardRsp;

/* JADX INFO: loaded from: classes3.dex */
public interface CheckPayContract$IView extends IBaseView {
    void checkPayFail(String message);

    void queryPaymentRewardOk(QueryPaymentRewardRsp rsp);

    void showCheckPayResult(int verifyMethod, CheckPayResp resp);

    void showQueryPayResult(CheckPayResp resp);
}

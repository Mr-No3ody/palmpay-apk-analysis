package com.transsnet.palmpay.core.ui.mvp.contract;

import com.transsnet.palmpay.core.bean.req.BindBankCardReq;
import com.transsnet.palmpay.core.bean.req.CheckBankCardInfoReq;
import com.transsnet.palmpay.core.bean.req.CheckCardBindNumReq;

/* JADX INFO: loaded from: classes3.dex */
public interface AddNewCardContract$IPresenter<T> extends BasePaymentContract.IPresenter<T> {
    void bindBankCard(BindBankCardReq bindBankCardReq);

    void checkCardBindNum(CheckCardBindNumReq checkCardBindNumReq);

    void checkInputBankCardInfo(CheckBankCardInfoReq checkBankCardInfoReq);

    void getBankInfoByCardNo(String str);

    void getBindBankCardTips();

    void getFundActivityConfig();

    void queryPaymentMethod();
}

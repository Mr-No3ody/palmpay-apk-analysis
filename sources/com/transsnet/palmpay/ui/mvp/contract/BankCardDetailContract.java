package com.transsnet.palmpay.ui.mvp.contract;

import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.LinkBankAccountResp;
import com.transsnet.palmpay.core.bean.LinkBankCardResp;

/* JADX INFO: loaded from: classes4.dex */
public interface BankCardDetailContract {

    public interface Presenter extends IBasePresenter<View> {
        void deleteLinkBankAccount(LinkBankAccountResp.LinkBankAccount linkBankAccount);

        void deleteLinkBankCard(LinkBankCardResp.LinkBankCard linkBankCard);

        void setDefaultPaymentCard(String str, int i7);
    }

    public interface View extends IBaseView {
        void handleSetDefaultCardResult(CommonResult commonResult);

        void showDeleteResult(CommonResult commonResult);

        void showLoadingView(boolean z3);
    }
}

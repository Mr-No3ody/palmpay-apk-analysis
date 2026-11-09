package com.transsnet.palmpay.ui.mvp.contract;

import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.bean.UnlinkBankCardReq;

/* JADX INFO: loaded from: classes4.dex */
public interface BankCardAndAccountContract$IPresenter extends IBasePresenter<BankCardAndAccountContract$IView> {
    void deleteLinkBankAccount(String str);

    void deleteLinkBankCard(String str);

    void queryLinkBankAccountList();

    void queryLinkBankCardList();

    void unlinkBankCard(UnlinkBankCardReq unlinkBankCardReq);
}

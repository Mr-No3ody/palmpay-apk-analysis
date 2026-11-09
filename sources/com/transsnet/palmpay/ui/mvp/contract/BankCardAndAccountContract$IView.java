package com.transsnet.palmpay.ui.mvp.contract;

import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.LinkBankAccountResp;
import com.transsnet.palmpay.core.bean.LinkBankCardResp;

/* JADX INFO: loaded from: classes4.dex */
public interface BankCardAndAccountContract$IView extends IBaseView {
    void showDeleteResult(CommonResult commonResult);

    void showError(String str);

    void showLinkBankAccountResp(LinkBankAccountResp linkBankAccountResp);

    void showLinkBankCardsResp(LinkBankCardResp linkBankCardResp);

    void showUnlinkResult(CommonResult commonResult);
}

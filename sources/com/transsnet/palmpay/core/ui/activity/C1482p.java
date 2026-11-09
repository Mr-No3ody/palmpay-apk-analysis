package com.transsnet.palmpay.core.ui.activity;

import Pa.r0;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.core.bean.PaymentMethod;
import com.transsnet.palmpay.core.dialog.SelectBankDialogV2;

/* JADX INFO: renamed from: com.transsnet.palmpay.core.ui.activity.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1482p implements SelectBankDialogV2.CallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BindNewBankAccountActivity f27801a;

    public C1482p(BindNewBankAccountActivity bindNewBankAccountActivity) {
        this.f27801a = bindNewBankAccountActivity;
    }

    @Override // com.transsnet.palmpay.core.dialog.SelectBankDialogV2.CallBack
    public final void onChooseBankClick(BankInfo bankInfo) {
        BindNewBankAccountActivity bindNewBankAccountActivity = this.f27801a;
        bindNewBankAccountActivity.f27477p.e(true);
        bindNewBankAccountActivity.f27474i = bankInfo;
        bindNewBankAccountActivity.f27477p.f28267d.setText(bankInfo.bankName);
        r0.u1(bindNewBankAccountActivity.f27477p.f28266c, bindNewBankAccountActivity.f27474i.bankUrl, com.transsnet.palmpay.custom_view.r.cv_default_bank_logo);
        bindNewBankAccountActivity.f27473g.dismiss();
    }

    @Override // com.transsnet.palmpay.core.dialog.SelectBankDialogV2.CallBack
    public final void onClickPayMethod(PaymentMethod paymentMethod) {
        BindNewBankAccountActivity bindNewBankAccountActivity = this.f27801a;
        bindNewBankAccountActivity.f27477p.e(true);
        bindNewBankAccountActivity.f27474i = new BankInfo();
        BankInfo bankInfo = bindNewBankAccountActivity.f27474i;
        String str = paymentMethod.bankName;
        bankInfo.bankName = str;
        bankInfo.bankUrl = paymentMethod.bankUrl;
        bankInfo.bankCode = paymentMethod.bankCode;
        bindNewBankAccountActivity.f27477p.f28267d.setText(str);
        r0.u1(bindNewBankAccountActivity.f27477p.f28266c, bindNewBankAccountActivity.f27474i.bankUrl, com.transsnet.palmpay.custom_view.r.cv_default_bank_logo);
        bindNewBankAccountActivity.f27473g.dismiss();
    }
}

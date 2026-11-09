package com.transsnet.palmpay.core.dialog;

import com.transsnet.palmpay.core.adapter.CashierPaymentMethodAdapter$OnPaymentMethodClickListener;
import com.transsnet.palmpay.core.bean.cashier.CashierCombinationPaymentMethodBean;
import com.transsnet.palmpay.core.bean.cashier.CashierPaymentMethodBean;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements CashierPaymentMethodAdapter$OnPaymentMethodClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CashierSelectPayMethodDialog f27378a;

    public c(CashierSelectPayMethodDialog cashierSelectPayMethodDialog) {
        this.f27378a = cashierSelectPayMethodDialog;
    }

    @Override // com.transsnet.palmpay.core.adapter.CashierPaymentMethodAdapter$OnPaymentMethodClickListener
    public final void onAddNewBankAccountClick() {
        CashierSelectPayMethodDialog cashierSelectPayMethodDialog = this.f27378a;
        CashierSelectPayMethodDialog.CallBack callBack = cashierSelectPayMethodDialog.mCallBack;
        if (callBack != null) {
            callBack.onAddNewBankAccountClick();
        }
        cashierSelectPayMethodDialog.dismiss();
    }

    @Override // com.transsnet.palmpay.core.adapter.CashierPaymentMethodAdapter$OnPaymentMethodClickListener
    public final void onAddNewBankCardClick() {
        CashierSelectPayMethodDialog cashierSelectPayMethodDialog = this.f27378a;
        CashierSelectPayMethodDialog.CallBack callBack = cashierSelectPayMethodDialog.mCallBack;
        if (callBack != null) {
            callBack.onAddNewBankCardClick();
        }
        cashierSelectPayMethodDialog.dismiss();
    }

    @Override // com.transsnet.palmpay.core.adapter.CashierPaymentMethodAdapter$OnPaymentMethodClickListener
    public final void onAddNewBankCardOrBankAccountClick() {
        CashierSelectPayMethodDialog cashierSelectPayMethodDialog = this.f27378a;
        CashierSelectPayMethodDialog.CallBack callBack = cashierSelectPayMethodDialog.mCallBack;
        if (callBack != null) {
            callBack.onAddNewBankCardOrBankAccountClick();
        }
        cashierSelectPayMethodDialog.dismiss();
    }

    @Override // com.transsnet.palmpay.core.adapter.CashierPaymentMethodAdapter$OnPaymentMethodClickListener
    public final void onPaymentMethodClick(int i7, CashierPaymentMethodBean cashierPaymentMethodBean) {
        CashierSelectPayMethodDialog cashierSelectPayMethodDialog = this.f27378a;
        if (cashierPaymentMethodBean == null || !(cashierPaymentMethodBean instanceof CashierCombinationPaymentMethodBean)) {
            if ((cashierPaymentMethodBean != null ? cashierPaymentMethodBean.availableBalance : 0L) < cashierSelectPayMethodDialog.mPayAmount && cashierPaymentMethodBean != null && cashierPaymentMethodBean.senderAccountType == 1) {
                com.palmpay.lib.apm.launchcounter.util.d.F("/cashin_out/add_money");
                cashierSelectPayMethodDialog.dismiss();
                return;
            }
        }
        CashierSelectPayMethodDialog.CallBack callBack = cashierSelectPayMethodDialog.mCallBack;
        if (callBack != null) {
            callBack.onPaymentMethodClick(cashierPaymentMethodBean);
        }
    }

    @Override // com.transsnet.palmpay.core.adapter.CashierPaymentMethodAdapter$OnPaymentMethodClickListener
    public final void onUseUSSDClick() {
        CashierSelectPayMethodDialog cashierSelectPayMethodDialog = this.f27378a;
        CashierSelectPayMethodDialog.CallBack callBack = cashierSelectPayMethodDialog.mCallBack;
        if (callBack != null) {
            callBack.onUseUSSDClick();
        }
        cashierSelectPayMethodDialog.dismiss();
    }
}

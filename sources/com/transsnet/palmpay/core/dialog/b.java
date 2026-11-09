package com.transsnet.palmpay.core.dialog;

import com.transsnet.palmpay.core.adapter.CashierPaymentMethodAdapter$OnPaymentMethodClickListener;
import com.transsnet.palmpay.core.bean.cashier.CashierPaymentMethodBean;
import kotlin.jvm.internal.Intrinsics;
import p052da.C1646s;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements CashierPaymentMethodAdapter$OnPaymentMethodClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CashierPayMethodRetryDialog f27377a;

    public b(CashierPayMethodRetryDialog cashierPayMethodRetryDialog) {
        this.f27377a = cashierPayMethodRetryDialog;
    }

    @Override // com.transsnet.palmpay.core.adapter.CashierPaymentMethodAdapter$OnPaymentMethodClickListener
    public final void onAddNewBankAccountClick() {
    }

    @Override // com.transsnet.palmpay.core.adapter.CashierPaymentMethodAdapter$OnPaymentMethodClickListener
    public final void onAddNewBankCardClick() {
    }

    @Override // com.transsnet.palmpay.core.adapter.CashierPaymentMethodAdapter$OnPaymentMethodClickListener
    public final void onAddNewBankCardOrBankAccountClick() {
    }

    @Override // com.transsnet.palmpay.core.adapter.CashierPaymentMethodAdapter$OnPaymentMethodClickListener
    public final void onPaymentMethodClick(int i7, CashierPaymentMethodBean selectMethod) {
        if (selectMethod == null) {
            return;
        }
        CashierPayMethodRetryDialog cashierPayMethodRetryDialog = this.f27377a;
        cashierPayMethodRetryDialog.selectedPaymentMethod = selectMethod;
        C1646s adapter = cashierPayMethodRetryDialog.getAdapter();
        adapter.getClass();
        Intrinsics.checkNotNullParameter(selectMethod, "selectMethod");
        adapter.f35806b = selectMethod;
        cashierPayMethodRetryDialog.getAdapter().notifyDataSetChanged();
        cashierPayMethodRetryDialog.clearPendingSubmitReq();
        cashierPayMethodRetryDialog.setConfirmLoading(true);
        CashierPayMethodRetryDialog.CallBack callBack = cashierPayMethodRetryDialog.callback;
        if (callBack != null) {
            callBack.onPaymentMethodClick(selectMethod);
        }
    }

    @Override // com.transsnet.palmpay.core.adapter.CashierPaymentMethodAdapter$OnPaymentMethodClickListener
    public final void onUseUSSDClick() {
    }
}

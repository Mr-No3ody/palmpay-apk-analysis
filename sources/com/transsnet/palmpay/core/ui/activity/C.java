package com.transsnet.palmpay.core.ui.activity;

import Pa.r0;
import com.transsnet.palmpay.core.bean.cashier.CashierPaymentMethodBean;
import com.transsnet.palmpay.core.bean.payment.SubmitPaymentRetryReq;
import com.transsnet.palmpay.core.dialog.CashierPayMethodRetryDialog;
import com.transsnet.palmpay.core.ui.mvvm.CoreCashierViewModel;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class C implements CashierPayMethodRetryDialog.CallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CoreCashierPreviewActivity f27480a;

    public C(CoreCashierPreviewActivity coreCashierPreviewActivity) {
        this.f27480a = coreCashierPreviewActivity;
    }

    @Override // com.transsnet.palmpay.core.dialog.CashierPayMethodRetryDialog.CallBack
    public final void onCloseClick(String str) {
        int i7 = CoreCashierPreviewActivity.f27486Y0;
        CoreCashierPreviewActivity coreCashierPreviewActivity = this.f27480a;
        coreCashierPreviewActivity.E(str);
        coreCashierPreviewActivity.I();
        coreCashierPreviewActivity.finish();
    }

    @Override // com.transsnet.palmpay.core.dialog.CashierPayMethodRetryDialog.CallBack
    public final void onConfirmClick(SubmitPaymentRetryReq req) {
        int i7 = CoreCashierPreviewActivity.f27486Y0;
        CoreCashierPreviewActivity coreCashierPreviewActivity = this.f27480a;
        if (r0.U0() || req == null) {
            return;
        }
        coreCashierPreviewActivity.I();
        CashierPayMethodRetryDialog cashierPayMethodRetryDialogO = coreCashierPreviewActivity.O();
        if (cashierPayMethodRetryDialogO != null) {
            cashierPayMethodRetryDialogO.dismiss();
        }
        CoreCashierViewModel coreCashierViewModel = (CoreCashierViewModel) coreCashierPreviewActivity.l();
        coreCashierViewModel.getClass();
        Intrinsics.checkNotNullParameter(req, "req");
        Ma.j jVar = new Ma.j(req, null);
        com.transsnet.palmpay.core.base.l lVar = coreCashierViewModel.f28067p;
        lVar.f27356m = req;
        Unit unit = Unit.f38893a;
        p140j8.f.v(coreCashierViewModel, jVar, lVar, 0L);
    }

    @Override // com.transsnet.palmpay.core.dialog.CashierPayMethodRetryDialog.CallBack
    public final void onPaymentMethodClick(CashierPaymentMethodBean paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        int i7 = CoreCashierPreviewActivity.f27486Y0;
        CoreCashierPreviewActivity coreCashierPreviewActivity = this.f27480a;
        if (paymentMethod != null && paymentMethod.enable) {
            coreCashierPreviewActivity.Z(paymentMethod, Boolean.FALSE, new A(coreCashierPreviewActivity, 7));
        }
    }
}

package com.transsnet.palmpay.core.ui.activity;

import Rd.C0592h;
import Wf.AbstractC0780y;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.transsnet.palmpay.core.bean.cashier.CashierPaymentMethodBean;
import com.transsnet.palmpay.core.bean.cashier.CashierReceiveMethodBean;
import com.transsnet.palmpay.core.bean.cashier.DefaultCalcOfWithdrawalReq;
import com.transsnet.palmpay.core.ui.mvvm.CoreWithdrawalViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/core/ui/activity/FinancialWithdrawalPreviewActivity;", "Lcom/transsnet/palmpay/core/ui/activity/BaseCoreCashierPreviewActivity;", "Lcom/transsnet/palmpay/core/ui/mvvm/CoreWithdrawalViewModel;", "LRd/h;", "<init>", "()V", "Wd/z", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FinancialWithdrawalPreviewActivity extends BaseCoreCashierPreviewActivity<CoreWithdrawalViewModel, C0592h> {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ int f27631H = 0;

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        Intent intent = getIntent();
        if (intent != null) {
            this.f27454d = intent.getStringExtra("mOrderNo");
            this.f27455e = intent.getStringExtra("mTransType");
            this.f27456f = intent.getStringExtra("mSubTransType");
            this.f27457g = "999";
            intent.getStringExtra("mCustomerId");
            this.f27458i = intent.getLongExtra("mOrderAmount", 0L);
            this.f27460o = intent.getStringExtra("mCalculationExtInfo");
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity
    public final ViewBinding m() {
        View viewInflate = getLayoutInflater().inflate(p025ba.g.core_activity_withdrawal_preview, (ViewGroup) null, false);
        if (viewInflate == null) {
            throw new NullPointerException("rootView");
        }
        C0592h c0592h = new C0592h((ConstraintLayout) viewInflate, 2);
        Intrinsics.checkNotNullExpressionValue(c0592h, "inflate(...)");
        return c0592h;
    }

    @Override // com.transsnet.palmpay.core.dialog.CashierSelectPayMethodDialog.CallBack
    public final void onPaymentMethodClick(CashierPaymentMethodBean cashierPaymentMethodBean) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        String stringExtra;
        DefaultCalcOfWithdrawalReq req = new DefaultCalcOfWithdrawalReq();
        req.orderNo = this.f27454d;
        req.transType = this.f27455e;
        req.subTransTypeCode = this.f27456f;
        req.orderAmount = this.f27458i;
        Intent intent = getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra("mPayerAccountType")) == null) {
            stringExtra = "";
        }
        req.payerAccountType = stringExtra;
        req.receiveAccountType = s();
        req.calculationExtInfo = this.f27460o;
        CashierReceiveMethodBean receivemethod = new CashierReceiveMethodBean(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097151, null);
        receivemethod.receiveAccountType = s();
        CoreWithdrawalViewModel coreWithdrawalViewModel = (CoreWithdrawalViewModel) l();
        coreWithdrawalViewModel.getClass();
        Intrinsics.checkNotNullParameter(req, "req");
        Intrinsics.checkNotNullParameter(receivemethod, "receivemethod");
        AbstractC0780y.m(androidx.lifecycle.V.h(coreWithdrawalViewModel), null, null, new Ma.n(coreWithdrawalViewModel, req, receivemethod, null), 3);
        io.fastkv.n.B(this, ((CoreWithdrawalViewModel) l()).f28068e, this, new Ba.a(this, 25), new p010a9.m(this, 10), false, null, 240);
    }

    @Override // com.transsnet.palmpay.core.ui.activity.BaseCoreCashierPreviewActivity
    /* JADX INFO: renamed from: r */
    public final String getF27457g() {
        throw null;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.BaseCoreCashierPreviewActivity
    public final String s() {
        String stringExtra;
        Intent intent = getIntent();
        return (intent == null || (stringExtra = intent.getStringExtra("mPayeeAccountType")) == null) ? "" : stringExtra;
    }
}

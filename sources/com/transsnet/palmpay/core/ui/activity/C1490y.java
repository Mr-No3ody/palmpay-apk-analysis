package com.transsnet.palmpay.core.ui.activity;

import Pa.n0;
import Pa.r0;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.transsnet.palmpay.core.bean.cashier.CalcOfPaymentMethodResultBean;
import com.transsnet.palmpay.core.bean.cashier.CalcPaymentFeeInfoBean;
import com.transsnet.palmpay.core.bean.cashier.CashierPaymentMethodBean;
import com.transsnet.palmpay.core.bean.cashier.CashierQueryCouponReq;
import com.transsnet.palmpay.core.bean.cashier.FlexiPayGuideBean;
import com.transsnet.palmpay.core.callback.Argument2Callback;
import com.transsnet.palmpay.core.ui.mvvm.CoreCashierViewModel;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.custom_view.model.ModelPaymentPromotionItem;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.jvm.internal.Intrinsics;
import p052da.C1650w;

/* JADX INFO: renamed from: com.transsnet.palmpay.core.ui.activity.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1490y implements OnItemClickListener, ModelPaymentPromotionItem.OnPromotionItemListener, Argument2Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CoreCashierPreviewActivity f27818a;

    public /* synthetic */ C1490y(CoreCashierPreviewActivity coreCashierPreviewActivity) {
        this.f27818a = coreCashierPreviewActivity;
    }

    @Override // com.transsnet.palmpay.core.callback.Argument2Callback
    public void invoke(Object obj, Object obj2) {
        ((Integer) obj).getClass();
        Intent intent = (Intent) obj2;
        int i7 = CoreCashierPreviewActivity.f27486Y0;
        CoreCashierPreviewActivity coreCashierPreviewActivity = this.f27818a;
        int intExtra = intent != null ? intent.getIntExtra("flexi_pay_open_result", 0) : 0;
        if (intExtra == 1) {
            String stringExtra = intent != null ? intent.getStringExtra("flexi_pay_account_id") : null;
            FlexiPayGuideBean flexiPayGuideBean = coreCashierPreviewActivity.f27489C0;
            if (flexiPayGuideBean != null) {
                flexiPayGuideBean.accountId = stringExtra;
                flexiPayGuideBean.needSign = false;
                coreCashierPreviewActivity.f27504O0 = flexiPayGuideBean;
            }
            coreCashierPreviewActivity.k0();
            return;
        }
        if (intExtra != 2) {
            coreCashierPreviewActivity.Y("PalmPayCashierPreview_FlexiPayActiveTimeout_Click");
            if (intent == null || !intent.getBooleanExtra("flexi_pay_silent_auth_interrupt", false)) {
                p220oa.h.x(coreCashierPreviewActivity, coreCashierPreviewActivity.getString(p025ba.k.core_flexi_pay_permission_denied));
            }
            coreCashierPreviewActivity.d0();
            return;
        }
        coreCashierPreviewActivity.Y("PalmPayCashierPreview_FlexiPayActiveFailed_Click");
        coreCashierPreviewActivity.f27489C0 = null;
        C1650w c1650wN = coreCashierPreviewActivity.N();
        c1650wN.f35828o = null;
        if (c1650wN.f35823e instanceof FlexiPayGuideBean) {
            c1650wN.f35823e = null;
        }
        c1650wN.e();
        coreCashierPreviewActivity.d0();
        S6.a aVar = S6.a.pay_CloseOutline;
        String string = coreCashierPreviewActivity.getString(p025ba.k.core_flexi_pay_activation_failed_switch_method);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        p220oa.h.z(coreCashierPreviewActivity, string, aVar, null, 53);
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(M1.j adapter, View view, int i7) {
        int i10 = 6;
        int i11 = CoreCashierPreviewActivity.f27486Y0;
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(view, "view");
        Object item = adapter.getItem(i7);
        Intrinsics.f(item, "null cannot be cast to non-null type com.transsnet.palmpay.core.bean.cashier.CashierPaymentMethodBean");
        CashierPaymentMethodBean cashierPaymentMethodBean = (CashierPaymentMethodBean) item;
        int i12 = cashierPaymentMethodBean.itemViewType;
        CoreCashierPreviewActivity coreCashierPreviewActivity = this.f27818a;
        if (i12 == 34) {
            FlexiPayGuideBean flexiPayGuideBean = cashierPaymentMethodBean instanceof FlexiPayGuideBean ? (FlexiPayGuideBean) cashierPaymentMethodBean : null;
            if (flexiPayGuideBean == null || r0.U0()) {
                return;
            }
            coreCashierPreviewActivity.f27489C0 = flexiPayGuideBean;
            coreCashierPreviewActivity.Z(flexiPayGuideBean, Boolean.TRUE, new A(coreCashierPreviewActivity, i10));
            return;
        }
        if (i12 == 35) {
            LinearLayout linearLayout = (LinearLayout) coreCashierPreviewActivity.f27499L.getValue();
            if (linearLayout == null || linearLayout.getVisibility() != 0) {
                return;
            }
            coreCashierPreviewActivity.g0(false);
            coreCashierPreviewActivity.H();
            coreCashierPreviewActivity.N().f35823e = cashierPaymentMethodBean;
            coreCashierPreviewActivity.N().notifyDataSetChanged();
            CoreCashierPreviewActivity.a0(coreCashierPreviewActivity, cashierPaymentMethodBean, null, 6);
            return;
        }
        coreCashierPreviewActivity.g0(false);
        if (cashierPaymentMethodBean.availableBalance >= coreCashierPreviewActivity.f27461p || !cashierPaymentMethodBean.isSelfMethod()) {
            coreCashierPreviewActivity.N().f35823e = cashierPaymentMethodBean;
            coreCashierPreviewActivity.N().notifyDataSetChanged();
            CoreCashierPreviewActivity.a0(coreCashierPreviewActivity, cashierPaymentMethodBean, null, 6);
        } else {
            coreCashierPreviewActivity.H();
        }
        n0 n0VarG = n0.g();
        ClickEvent clickEvent = (ClickEvent) C0.G.f("PalmPayCashierPreview_ChangeSecPayMethod_Click", "module_name", "Cashier");
        String str = coreCashierPreviewActivity.f27454d;
        if (str == null) {
            str = "";
        }
        ClickEvent clickEventAdd = clickEvent.add("OrderNo", str);
        String f27455e = coreCashierPreviewActivity.getF27455e();
        if (f27455e == null) {
            f27455e = "";
        }
        ClickEvent clickEventAdd2 = clickEventAdd.add("TransType", f27455e);
        String f27456f = coreCashierPreviewActivity.getF27456f();
        if (f27456f == null) {
            f27456f = "";
        }
        ClickEvent clickEventAdd3 = clickEventAdd2.add("SubTransType", f27456f);
        String strValueOf = String.valueOf(cashierPaymentMethodBean.senderAccountType);
        n0VarG.k(clickEventAdd3.add("PaymentMethod", strValueOf != null ? strValueOf : ""));
    }

    @Override // com.transsnet.palmpay.custom_view.model.ModelPaymentPromotionItem.OnPromotionItemListener
    public void onPromotionItemClick() {
        Long fee;
        Long vat;
        int i7 = CoreCashierPreviewActivity.f27486Y0;
        n0 n0VarG = n0.g();
        ClickEvent clickEvent = (ClickEvent) C0.G.f("PalmPayCashierPreview_UseCoupon_Click", "module_name", "Cashier");
        CoreCashierPreviewActivity coreCashierPreviewActivity = this.f27818a;
        String str = coreCashierPreviewActivity.f27454d;
        if (str == null) {
            str = "";
        }
        ClickEvent clickEventAdd = clickEvent.add("OrderNo", str);
        String f27455e = coreCashierPreviewActivity.getF27455e();
        if (f27455e == null) {
            f27455e = "";
        }
        ClickEvent clickEventAdd2 = clickEventAdd.add("TransType", f27455e);
        String f27456f = coreCashierPreviewActivity.getF27456f();
        n0VarG.k(clickEventAdd2.add("SubTransType", f27456f != null ? f27456f : ""));
        CalcOfPaymentMethodResultBean calcOfPaymentMethodResultBean = coreCashierPreviewActivity.f27502M0;
        if (calcOfPaymentMethodResultBean == null || r0.U0()) {
            return;
        }
        if (coreCashierPreviewActivity.f27504O0 == null) {
            ToastUtils.showLong(p025ba.k.core_msg_select_payment_method);
            return;
        }
        CashierQueryCouponReq req = new CashierQueryCouponReq();
        req.orderAmount = Long.valueOf(coreCashierPreviewActivity.f27458i);
        req.transType = coreCashierPreviewActivity.getF27455e();
        CalcPaymentFeeInfoBean calcPaymentFeeInfoBean = calcOfPaymentMethodResultBean.feeInfo;
        long jLongValue = 0;
        long jLongValue2 = (calcPaymentFeeInfoBean == null || (vat = calcPaymentFeeInfoBean.getVat()) == null) ? 0L : vat.longValue();
        CalcPaymentFeeInfoBean calcPaymentFeeInfoBean2 = calcOfPaymentMethodResultBean.feeInfo;
        if (calcPaymentFeeInfoBean2 != null && (fee = calcPaymentFeeInfoBean2.getFee()) != null) {
            jLongValue = fee.longValue();
        }
        req.feePlusVat = Long.valueOf(jLongValue2 + jLongValue);
        req.subTransTypeCode = coreCashierPreviewActivity.getF27456f();
        CashierPaymentMethodBean cashierPaymentMethodBean = coreCashierPreviewActivity.f27504O0;
        req.useAccountType = cashierPaymentMethodBean != null ? Integer.valueOf(cashierPaymentMethodBean.senderAccountType).toString() : null;
        req.orderNo = coreCashierPreviewActivity.f27454d;
        if (!TextUtils.isEmpty(coreCashierPreviewActivity.f27460o)) {
            req.calculationExtInfo = coreCashierPreviewActivity.f27460o;
        }
        Intrinsics.checkNotNullParameter(req, "req");
        CoreCashierViewModel coreCashierViewModel = (CoreCashierViewModel) coreCashierPreviewActivity.l();
        coreCashierViewModel.getClass();
        Intrinsics.checkNotNullParameter(req, "req");
        p140j8.f.s(coreCashierViewModel, new Ma.g(req, null), coreCashierViewModel.f28061e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }
}

package com.transsnet.palmpay.managemoney.ui.activity;

import N8.q0;
import Pa.r0;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.scwang.smartrefresh.layout.util.DensityUtil;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.custom_view.model.OrderResultViewReceiptModel;
import com.transsnet.palmpay.managemoney.bean.CashBoxInterestDetail;
import com.transsnet.palmpay.managemoney.bean.PayStatus;
import com.transsnet.palmpay.managemoney.bean.resp.GetCashBoxOrderDetailResp;
import com.transsnet.palmpay.managemoney.ui.view.PlanInfoItem;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsnet.palmpay.managemoney.ui.activity.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1561g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CashBoxOrderDetailActivity f32237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CashBoxOrderDetailActivity f32238c;

    public /* synthetic */ C1561g(CashBoxOrderDetailActivity cashBoxOrderDetailActivity, CashBoxOrderDetailActivity cashBoxOrderDetailActivity2, int i7) {
        this.f32236a = i7;
        this.f32237b = cashBoxOrderDetailActivity;
        this.f32238c = cashBoxOrderDetailActivity2;
    }

    /* JADX WARN: Code duplicated, block: B:78:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:88:0x04d6  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float f10;
        long j6;
        String string;
        String payerBank;
        String bankCard;
        int i7 = 0;
        CashBoxOrderDetailActivity cashBoxOrderDetailActivity = this.f32237b;
        switch (this.f32236a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof com.transsnet.palmpay.core.base.o) {
                    cashBoxOrderDetailActivity.showLoadingDialog(true, true);
                } else if (it instanceof com.transsnet.palmpay.core.base.p) {
                    cashBoxOrderDetailActivity.showLoadingDialog(false, true);
                    GetCashBoxOrderDetailResp.CashBoxOrderDetail data = ((GetCashBoxOrderDetailResp) ((com.transsnet.palmpay.core.base.p) it).f27360a).getData();
                    int i10 = CashBoxOrderDetailActivity.f32043w;
                    CashBoxOrderDetailActivity cashBoxOrderDetailActivity2 = this.f32238c;
                    if (data != null) {
                        Object value = cashBoxOrderDetailActivity2.f32052p.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        ((NestedScrollView) value).setVisibility(0);
                        p355xf.t tVar = cashBoxOrderDetailActivity2.f32044c;
                        Object value2 = tVar.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        ((OrderResultViewReceiptModel) value2).setVisibility(data.getPayStatus() == 1 ? 0 : 8);
                        PayStatus payStatusNewInstance = PayStatus.INSTANCE.newInstance(data.getPayStatus());
                        cashBoxOrderDetailActivity2.p().setText(cashBoxOrderDetailActivity2.getResources().getString(payStatusNewInstance.getStatusText()));
                        cashBoxOrderDetailActivity2.p().setCompoundDrawablesRelativeWithIntrinsicBounds(payStatusNewInstance.getStatsDrawableRes(), 0, 0, 0);
                        Object value3 = cashBoxOrderDetailActivity2.f32049i.getValue();
                        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                        TextView textView = (TextView) value3;
                        Long paymentAmount = data.getPaymentAmount();
                        textView.setText(r0.B(paymentAmount != null ? paymentAmount.longValue() : 0L, true));
                        Object value4 = cashBoxOrderDetailActivity2.f32050j.getValue();
                        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                        TextView textView2 = (TextView) value4;
                        String operateName = data.getOperateName();
                        if (operateName == null) {
                            operateName = cashBoxOrderDetailActivity2.getString(p025ba.k.core_cash_box);
                            Intrinsics.checkNotNullExpressionValue(operateName, "getString(...)");
                        }
                        textView2.setText(operateName);
                        int paymentType = data.getPaymentType();
                        p355xf.t tVar2 = cashBoxOrderDetailActivity2.f32045d;
                        if (paymentType == 2) {
                            Object value5 = tVar2.getValue();
                            Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                            r0.h1((ImageView) value5, data.getHeadPortrait(), com.transsnet.palmpay.custom_view.r.cv_cash_box_icon_circle_purple);
                            p355xf.t tVar3 = cashBoxOrderDetailActivity2.f32051o;
                            Object value6 = tVar3.getValue();
                            Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                            LinearLayout linearLayout = (LinearLayout) value6;
                            f10 = 48.0f;
                            com.transsnet.palmpay.managemoney.ui.view.d dVar = new com.transsnet.palmpay.managemoney.ui.view.d(cashBoxOrderDetailActivity2.getResources().getString(com.transsnet.palmpay.custom_view.v.cv_transfer_amount), 12.0f, L6.b.ppColorTextDisable, null, null, false, null, 504);
                            Long transferAmount = data.getTransferAmount();
                            j6 = 0;
                            com.transsnet.palmpay.managemoney.ui.view.d dVar2 = new com.transsnet.palmpay.managemoney.ui.view.d(r0.B(transferAmount != null ? transferAmount.longValue() : 0L, true), 12.0f, L6.b.ppColorTextDisable, null, null, false, null, 504);
                            DensityUtil.dp2px(28.0f);
                            linearLayout.addView(new PlanInfoItem(cashBoxOrderDetailActivity2, dVar, dVar2));
                            Object value7 = tVar3.getValue();
                            Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
                            LinearLayout linearLayout2 = (LinearLayout) value7;
                            com.transsnet.palmpay.managemoney.ui.view.d dVar3 = new com.transsnet.palmpay.managemoney.ui.view.d(cashBoxOrderDetailActivity2.getResources().getString(p025ba.k.core_fee), 12.0f, L6.b.ppColorTextDisable, null, null, false, null, 504);
                            Long fee = data.getFee();
                            com.transsnet.palmpay.managemoney.ui.view.d dVar4 = new com.transsnet.palmpay.managemoney.ui.view.d(r0.B(fee != null ? fee.longValue() : 0L, true), 12.0f, L6.b.ppColorTextDisable, null, null, false, null, 504);
                            DensityUtil.dp2px(28.0f);
                            linearLayout2.addView(new PlanInfoItem(cashBoxOrderDetailActivity2, dVar3, dVar4));
                            Object value8 = tVar3.getValue();
                            Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
                            LinearLayout linearLayout3 = (LinearLayout) value8;
                            com.transsnet.palmpay.managemoney.ui.view.d dVar5 = new com.transsnet.palmpay.managemoney.ui.view.d(cashBoxOrderDetailActivity2.getResources().getString(com.transsnet.palmpay.custom_view.v.cv_payment_amount), 14.0f, L6.b.ppColorTextDisable, null, null, false, null, 504);
                            Long paymentAmount2 = data.getPaymentAmount();
                            com.transsnet.palmpay.managemoney.ui.view.d dVar6 = new com.transsnet.palmpay.managemoney.ui.view.d(r0.B(paymentAmount2 != null ? paymentAmount2.longValue() : 0L, true), 14.0f, L6.b.ppColorTextPrimary, null, null, false, null, 504);
                            DensityUtil.dp2px(32.0f);
                            linearLayout3.addView(new PlanInfoItem(cashBoxOrderDetailActivity2, dVar5, dVar6));
                            LinearLayout linearLayoutN = cashBoxOrderDetailActivity2.n();
                            com.transsnet.palmpay.managemoney.ui.view.d dVar7 = new com.transsnet.palmpay.managemoney.ui.view.d(cashBoxOrderDetailActivity2.getResources().getString(p025ba.k.core_receipt_payer_bank), 0.0f, com.transsnet.palmpay.custom_view.p.cv_color_858a8f, null, null, false, null, 506);
                            String payerBank2 = data.getPayerBank();
                            if (payerBank2 == null) {
                                payerBank = data.getPayerBank();
                            } else {
                                if (payerBank2.length() < 12) {
                                    payerBank2 = null;
                                }
                                if (payerBank2 == null || (payerBank = q0.j(kotlin.text.F.z(12, payerBank2), "...")) == null) {
                                    payerBank = data.getPayerBank();
                                }
                            }
                            String bankCard2 = data.getBankCard();
                            if (bankCard2 == null) {
                                bankCard = data.getBankCard();
                            } else {
                                String str = bankCard2.length() >= 4 ? bankCard2 : null;
                                if (str == null || (bankCard = kotlin.text.F.v(data.getBankCard().length() - 4, str)) == null) {
                                    bankCard = data.getBankCard();
                                }
                            }
                            com.transsnet.palmpay.managemoney.ui.view.d dVar8 = new com.transsnet.palmpay.managemoney.ui.view.d(q0.l(payerBank, "(", bankCard, ")"), 0.0f, 0, null, null, false, null, 510);
                            DensityUtil.dp2px(48.0f);
                            linearLayoutN.addView(new PlanInfoItem(cashBoxOrderDetailActivity2, dVar7, dVar8));
                            LinearLayout linearLayoutN2 = cashBoxOrderDetailActivity2.n();
                            com.transsnet.palmpay.managemoney.ui.view.d dVar9 = new com.transsnet.palmpay.managemoney.ui.view.d(cashBoxOrderDetailActivity2.getResources().getString(p025ba.k.core_receipt_transaction_type), 0.0f, com.transsnet.palmpay.custom_view.p.cv_color_858a8f, null, null, false, null, 506);
                            com.transsnet.palmpay.managemoney.ui.view.d dVar10 = new com.transsnet.palmpay.managemoney.ui.view.d(data.getOperateName(), 0.0f, 0, null, null, false, null, 510);
                            DensityUtil.dp2px(48.0f);
                            linearLayoutN2.addView(new PlanInfoItem(cashBoxOrderDetailActivity2, dVar9, dVar10));
                            LinearLayout linearLayoutN3 = cashBoxOrderDetailActivity2.n();
                            com.transsnet.palmpay.managemoney.ui.view.d dVar11 = new com.transsnet.palmpay.managemoney.ui.view.d(cashBoxOrderDetailActivity2.getResources().getString(p025ba.k.core_receive_account), 0.0f, com.transsnet.palmpay.custom_view.p.cv_color_858a8f, null, null, false, null, 506);
                            com.transsnet.palmpay.managemoney.ui.view.d dVar12 = new com.transsnet.palmpay.managemoney.ui.view.d(cashBoxOrderDetailActivity2.getResources().getString(p025ba.k.core_cash_box), 0.0f, 0, null, null, false, null, 510);
                            DensityUtil.dp2px(48.0f);
                            linearLayoutN3.addView(new PlanInfoItem(cashBoxOrderDetailActivity2, dVar11, dVar12));
                        } else {
                            f10 = 48.0f;
                            j6 = 0;
                            Object value9 = tVar2.getValue();
                            Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
                            ((ImageView) value9).setImageResource(com.transsnet.palmpay.custom_view.r.cv_cash_box_icon_circle_purple);
                            cashBoxOrderDetailActivity2.n().addView(new PlanInfoItem(cashBoxOrderDetailActivity2, new com.transsnet.palmpay.managemoney.ui.view.d(cashBoxOrderDetailActivity2.getResources().getString(p025ba.k.core_receipt_transaction_type), 0.0f, L6.b.ppColorTextAssist, null, null, false, null, 506), new com.transsnet.palmpay.managemoney.ui.view.d(cashBoxOrderDetailActivity2.getString(TextUtils.equals(cashBoxOrderDetailActivity2.o(), TransType.TRANS_TYPE_CASH_BOX_DEPOSIT) ? p025ba.k.core_cash_box_save : Jc.f.mm_cashbox_withdraw), 0.0f, 0, null, null, false, null, 510), i7));
                            if (data.getCouponAmount() != null && data.getCouponAmount().longValue() > 0) {
                                cashBoxOrderDetailActivity2.n().addView(cashBoxOrderDetailActivity2.m());
                                cashBoxOrderDetailActivity2.n().addView(new PlanInfoItem(cashBoxOrderDetailActivity2, new com.transsnet.palmpay.managemoney.ui.view.d(cashBoxOrderDetailActivity2.getResources().getString(Jc.f.mm_cash_rewards), 0.0f, L6.b.ppColorTextAssist, null, null, false, null, 506), new com.transsnet.palmpay.managemoney.ui.view.d(C0.G.o("-", r0.B(data.getCouponAmount().longValue(), true)), 0.0f, 0, null, null, false, null, 510), i7));
                            }
                            cashBoxOrderDetailActivity2.n().addView(cashBoxOrderDetailActivity2.m());
                            LinearLayout linearLayoutN4 = cashBoxOrderDetailActivity2.n();
                            com.transsnet.palmpay.managemoney.ui.view.d dVar13 = new com.transsnet.palmpay.managemoney.ui.view.d(cashBoxOrderDetailActivity2.getResources().getString(p025ba.k.core_payment_method), 0.0f, L6.b.ppColorTextAssist, null, null, false, null, 506);
                            if (data.getPaymentType() == 1) {
                                string = cashBoxOrderDetailActivity2.getResources().getString(Jc.f.mm_plan_palmpay_balance);
                            } else {
                                string = data.getPaymentType() == 40 ? cashBoxOrderDetailActivity2.getString(p025ba.k.core_cash_box) : q0.l(data.getPayerBank(), "(", data.getBankCard(), ")");
                            }
                            linearLayoutN4.addView(new PlanInfoItem(cashBoxOrderDetailActivity2, dVar13, new com.transsnet.palmpay.managemoney.ui.view.d(string, 0.0f, 0, null, null, false, null, 510), i7));
                        }
                        cashBoxOrderDetailActivity2.n().addView(cashBoxOrderDetailActivity2.m());
                        cashBoxOrderDetailActivity2.n().addView(new PlanInfoItem(cashBoxOrderDetailActivity2, new com.transsnet.palmpay.managemoney.ui.view.d(cashBoxOrderDetailActivity2.getResources().getString(p025ba.k.core_receipt_transaction_id), 0.0f, L6.b.ppColorTextAssist, null, null, false, null, 506), new com.transsnet.palmpay.managemoney.ui.view.d(data.getTransactionId(), 0.0f, 0, cashBoxOrderDetailActivity2.getDrawable(com.transsnet.palmpay.custom_view.r.cv_copy_1), new X6.c(data, 24), false, null, 470), i7));
                        cashBoxOrderDetailActivity2.n().addView(cashBoxOrderDetailActivity2.m());
                        LinearLayout linearLayoutN5 = cashBoxOrderDetailActivity2.n();
                        com.transsnet.palmpay.managemoney.ui.view.d dVar14 = new com.transsnet.palmpay.managemoney.ui.view.d(cashBoxOrderDetailActivity2.getResources().getString(p025ba.k.core_creation_time), 0.0f, L6.b.ppColorTextAssist, null, null, false, null, 506);
                        com.transsnet.palmpay.managemoney.ui.view.d dVar15 = new com.transsnet.palmpay.managemoney.ui.view.d(r0.Q(data.getCreateDate()), 0.0f, 0, null, null, false, null, 510);
                        DensityUtil.dp2px(f10);
                        linearLayoutN5.addView(new PlanInfoItem(cashBoxOrderDetailActivity2, dVar14, dVar15));
                        if (data.getCompletionTime() > j6) {
                            cashBoxOrderDetailActivity2.n().addView(cashBoxOrderDetailActivity2.m());
                            LinearLayout linearLayoutN6 = cashBoxOrderDetailActivity2.n();
                            com.transsnet.palmpay.managemoney.ui.view.d dVar16 = new com.transsnet.palmpay.managemoney.ui.view.d(cashBoxOrderDetailActivity2.getResources().getString(p025ba.k.core_completion_time), 0.0f, L6.b.ppColorTextAssist, null, null, false, null, 506);
                            com.transsnet.palmpay.managemoney.ui.view.d dVar17 = new com.transsnet.palmpay.managemoney.ui.view.d(r0.Q(data.getCompletionTime()), 0.0f, 0, null, null, false, null, 510);
                            DensityUtil.dp2px(f10);
                            linearLayoutN6.addView(new PlanInfoItem(cashBoxOrderDetailActivity2, dVar16, dVar17));
                        }
                        cashBoxOrderDetailActivity2.n().addView(cashBoxOrderDetailActivity2.m());
                        cashBoxOrderDetailActivity2.n().addView(new PlanInfoItem(cashBoxOrderDetailActivity2, new com.transsnet.palmpay.managemoney.ui.view.d("View CashBox Account", 14.0f, L6.b.ppColorTextPrimary, null, null, false, null, 504), new com.transsnet.palmpay.managemoney.ui.view.d("", 0.0f, 0, null, new com.transsnet.palmpay.core.ui.activity.T(13), false, null, 462), DensityUtil.dp2px(42.0f), cashBoxOrderDetailActivity2.getDrawable(com.transsnet.palmpay.custom_view.r.cv_shape_rect_corner_12_bg_dark)));
                        cashBoxOrderDetailActivity2.q().c();
                        cashBoxOrderDetailActivity2.q().d(Boolean.FALSE);
                        cashBoxOrderDetailActivity2.q().setOnCustomerServiceModelListener(new C1562h(cashBoxOrderDetailActivity2, data));
                        Object value10 = tVar.getValue();
                        Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
                        ((OrderResultViewReceiptModel) value10).setOnClickListener(new p010a9.b(22, cashBoxOrderDetailActivity2, data));
                    }
                } else if (it instanceof com.transsnet.palmpay.core.base.m) {
                    cashBoxOrderDetailActivity.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    cashBoxOrderDetailActivity.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2 instanceof com.transsnet.palmpay.core.base.o) {
                    cashBoxOrderDetailActivity.showLoadingDialog(true, true);
                } else if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                    cashBoxOrderDetailActivity.showLoadingDialog(false, true);
                    CashBoxInterestDetail cashBoxInterestDetail = (CashBoxInterestDetail) ((CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it2).f27360a).data;
                    int i11 = CashBoxOrderDetailActivity.f32043w;
                    CashBoxOrderDetailActivity cashBoxOrderDetailActivity3 = this.f32238c;
                    if (cashBoxInterestDetail != null) {
                        Object value11 = cashBoxOrderDetailActivity3.f32052p.getValue();
                        Intrinsics.checkNotNullExpressionValue(value11, "getValue(...)");
                        ((NestedScrollView) value11).setVisibility(0);
                        cashBoxOrderDetailActivity3.n().setVisibility(0);
                        Object value12 = cashBoxOrderDetailActivity3.f32050j.getValue();
                        Intrinsics.checkNotNullExpressionValue(value12, "getValue(...)");
                        ((TextView) value12).setText(cashBoxOrderDetailActivity3.getString(p025ba.k.core_cashbox_interest));
                        Object value13 = cashBoxOrderDetailActivity3.f32049i.getValue();
                        Intrinsics.checkNotNullExpressionValue(value13, "getValue(...)");
                        TextView textView3 = (TextView) value13;
                        Long amount = cashBoxInterestDetail.getAmount();
                        textView3.setText(r0.B(amount != null ? amount.longValue() : 0L, true));
                        PayStatus payStatusNewInstance2 = PayStatus.INSTANCE.newInstance(1);
                        cashBoxOrderDetailActivity3.p().setText(cashBoxOrderDetailActivity3.getResources().getString(payStatusNewInstance2.getStatusText()));
                        cashBoxOrderDetailActivity3.p().setCompoundDrawablesRelativeWithIntrinsicBounds(payStatusNewInstance2.getStatsDrawableRes(), 0, 0, 0);
                        LinearLayout linearLayoutN7 = cashBoxOrderDetailActivity3.n();
                        com.transsnet.palmpay.managemoney.ui.view.d dVar18 = new com.transsnet.palmpay.managemoney.ui.view.d(cashBoxOrderDetailActivity3.getResources().getString(Jc.f.mm_receive_account), 14.0f, com.transsnet.palmpay.custom_view.p.cv_color_858a8f, null, null, false, null, 504);
                        com.transsnet.palmpay.managemoney.ui.view.d dVar19 = new com.transsnet.palmpay.managemoney.ui.view.d(cashBoxOrderDetailActivity3.getString(p025ba.k.core_cash_box), 14.0f, L6.b.ppColorTextPrimary, null, null, false, null, 504);
                        DensityUtil.dp2px(48.0f);
                        linearLayoutN7.addView(new PlanInfoItem(cashBoxOrderDetailActivity3, dVar18, dVar19));
                        LinearLayout linearLayoutN8 = cashBoxOrderDetailActivity3.n();
                        com.transsnet.palmpay.managemoney.ui.view.d dVar20 = new com.transsnet.palmpay.managemoney.ui.view.d(cashBoxOrderDetailActivity3.getResources().getString(com.transsnet.palmpay.custom_view.v.cv_transaction_id), 14.0f, com.transsnet.palmpay.custom_view.p.cv_color_858a8f, null, null, false, null, 504);
                        com.transsnet.palmpay.managemoney.ui.view.d dVar21 = new com.transsnet.palmpay.managemoney.ui.view.d(cashBoxInterestDetail.getOrgOrderNo(), 14.0f, L6.b.ppColorTextPrimary, cashBoxOrderDetailActivity3.getDrawable(Jc.b.mm_icon_copy), new X6.c(cashBoxInterestDetail, 25), false, null, 464);
                        DensityUtil.dp2px(48.0f);
                        linearLayoutN8.addView(new PlanInfoItem(cashBoxOrderDetailActivity3, dVar20, dVar21));
                        LinearLayout linearLayoutN9 = cashBoxOrderDetailActivity3.n();
                        com.transsnet.palmpay.managemoney.ui.view.d dVar22 = new com.transsnet.palmpay.managemoney.ui.view.d(cashBoxOrderDetailActivity3.getResources().getString(p025ba.k.core_create_time), 14.0f, com.transsnet.palmpay.custom_view.p.cv_color_858a8f, null, null, false, null, 504);
                        Long interestTime = cashBoxInterestDetail.getInterestTime();
                        com.transsnet.palmpay.managemoney.ui.view.d dVar23 = new com.transsnet.palmpay.managemoney.ui.view.d(r0.N(interestTime != null ? interestTime.longValue() : 0L), 14.0f, L6.b.ppColorTextPrimary, null, null, false, null, 504);
                        DensityUtil.dp2px(48.0f);
                        linearLayoutN9.addView(new PlanInfoItem(cashBoxOrderDetailActivity3, dVar22, dVar23));
                        LinearLayout linearLayoutN10 = cashBoxOrderDetailActivity3.n();
                        com.transsnet.palmpay.managemoney.ui.view.d dVar24 = new com.transsnet.palmpay.managemoney.ui.view.d(cashBoxOrderDetailActivity3.getResources().getString(Jc.f.mm_completion_time), 14.0f, com.transsnet.palmpay.custom_view.p.cv_color_858a8f, null, null, false, null, 504);
                        Long paymentTime = cashBoxInterestDetail.getPaymentTime();
                        com.transsnet.palmpay.managemoney.ui.view.d dVar25 = new com.transsnet.palmpay.managemoney.ui.view.d(r0.N(paymentTime != null ? paymentTime.longValue() : 0L), 14.0f, L6.b.ppColorTextPrimary, null, null, false, null, 504);
                        DensityUtil.dp2px(48.0f);
                        linearLayoutN10.addView(new PlanInfoItem(cashBoxOrderDetailActivity3, dVar24, dVar25));
                        LinearLayout linearLayoutN11 = cashBoxOrderDetailActivity3.n();
                        com.transsnet.palmpay.managemoney.ui.view.d dVar26 = new com.transsnet.palmpay.managemoney.ui.view.d("", 12.0f, L6.b.ppColorTextDisable, null, null, false, null, 504);
                        com.transsnet.palmpay.managemoney.ui.view.d dVar27 = new com.transsnet.palmpay.managemoney.ui.view.d("", 12.0f, L6.b.ppColorTextDisable, null, null, false, null, 504);
                        DensityUtil.dp2px(12.0f);
                        linearLayoutN11.addView(new PlanInfoItem(cashBoxOrderDetailActivity3, dVar26, dVar27));
                        cashBoxOrderDetailActivity3.n().addView(new PlanInfoItem(cashBoxOrderDetailActivity3, new com.transsnet.palmpay.managemoney.ui.view.d("View CashBox Account", 14.0f, L6.b.ppColorTextPrimary, null, null, false, null, 504), new com.transsnet.palmpay.managemoney.ui.view.d("", 0.0f, 0, null, new com.transsnet.palmpay.core.ui.activity.T(14), false, null, 462), DensityUtil.dp2px(42.0f), cashBoxOrderDetailActivity3.getDrawable(com.transsnet.palmpay.custom_view.r.cv_shape_rect_corner_12_bg_dark)));
                        cashBoxOrderDetailActivity3.q().c();
                        cashBoxOrderDetailActivity3.q().d(Boolean.FALSE);
                        cashBoxOrderDetailActivity3.q().setOnCustomerServiceModelListener(new C1563i());
                    }
                } else if (it2 instanceof com.transsnet.palmpay.core.base.m) {
                    cashBoxOrderDetailActivity.showLoadingDialog(false, true);
                } else {
                    if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    cashBoxOrderDetailActivity.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it2).f27358a, new Object[0]);
                }
                return Unit.f38893a;
        }
    }
}

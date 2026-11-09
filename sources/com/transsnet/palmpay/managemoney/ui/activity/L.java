package com.transsnet.palmpay.managemoney.ui.activity;

import B6.ViewOnClickListenerC0087i;
import N8.q0;
import Oc.C0500c;
import Pa.AbstractC0511h;
import Pa.r0;
import Qc.i0;
import Qc.k0;
import Wd.C0751z;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Z;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.scwang.smartrefresh.layout.util.DensityUtil;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.cashier.CoreCashierPaymentExtra;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.ui.activity.ViewOnClickListenerC1478l;
import com.transsnet.palmpay.custom_view.dialog.CommonTipsDialogFragment;
import com.transsnet.palmpay.managemoney.bean.AdvanceSummary;
import com.transsnet.palmpay.managemoney.bean.PayoutOption;
import com.transsnet.palmpay.managemoney.bean.PlanStatus;
import com.transsnet.palmpay.managemoney.bean.PlanStatusFactory;
import com.transsnet.palmpay.managemoney.bean.ProductBean;
import com.transsnet.palmpay.managemoney.bean.resp.AdvanceRepayResp;
import com.transsnet.palmpay.managemoney.bean.resp.GetPlanDetailResp;
import com.transsnet.palmpay.managemoney.ui.view.PlanInfoItem;
import com.transsnet.palmpay.managemoney.ui.viewmodel.PlanDetailViewModel;
import com.transsnet.palmpay.util.TimeUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.C1849p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class L implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PlanDetailActivity f32131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PlanDetailActivity f32132c;

    public /* synthetic */ L(PlanDetailActivity planDetailActivity, PlanDetailActivity planDetailActivity2, int i7) {
        this.f32130a = i7;
        this.f32131b = planDetailActivity;
        this.f32132c = planDetailActivity2;
    }

    /* JADX WARN: Code duplicated, block: B:149:0x031a  */
    /* JADX WARN: Code duplicated, block: B:153:0x0323  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        final PlanDetailActivity planDetailActivity;
        ProductBean productBean;
        ProductBean productBean2;
        String orderId;
        PlanDetailViewModel planDetailViewModel;
        com.transsnet.palmpay.managemoney.ui.view.d dVar;
        String name;
        ImageView rightImageView2;
        int i7;
        Long totalRepayableAmount;
        AdvanceSummary advanceSummary;
        String advanceNo;
        Long paymentAmount;
        Long repayInterest;
        Long repayPrincipal;
        PlanDetailActivity planDetailActivity2 = this.f32132c;
        PlanDetailActivity planDetailActivity3 = this.f32131b;
        final int i10 = 1;
        final int i11 = 0;
        switch (this.f32130a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof com.transsnet.palmpay.core.base.o) {
                    planDetailActivity3.showLoadingDialog(true, true);
                } else if (it instanceof com.transsnet.palmpay.core.base.p) {
                    planDetailActivity3.showLoadingDialog(false, true);
                    GetPlanDetailResp getPlanDetailResp = (GetPlanDetailResp) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                    ProductBean data = getPlanDetailResp.getData();
                    final PlanDetailActivity planDetailActivity4 = this.f32132c;
                    planDetailActivity4.f32168Z = data;
                    final ProductBean data2 = getPlanDetailResp.getData();
                    if (data2 != null) {
                        boolean z3 = (data2.getAdvanceSummary() == null || (advanceSummary = data2.getAdvanceSummary()) == null || (advanceNo = advanceSummary.getAdvanceNo()) == null || advanceNo.length() <= 0) ? false : true;
                        p355xf.t tVar = planDetailActivity4.f32160B;
                        Object value = tVar.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        ConstraintLayout constraintLayout = (ConstraintLayout) value;
                        if (constraintLayout != null) {
                            constraintLayout.setVisibility(z3 ? 0 : 8);
                            Unit unit = Unit.f38893a;
                        }
                        p355xf.t tVar2 = planDetailActivity4.f32163L;
                        if (z3) {
                            Object value2 = planDetailActivity4.f32164M.getValue();
                            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                            TextView textView = (TextView) value2;
                            if (textView != null) {
                                AdvanceSummary advanceSummary2 = data2.getAdvanceSummary();
                                textView.setText(r0.B((advanceSummary2 == null || (totalRepayableAmount = advanceSummary2.getTotalRepayableAmount()) == null) ? 0L : totalRepayableAmount.longValue(), true));
                                Unit unit2 = Unit.f38893a;
                            }
                            Object value3 = planDetailActivity4.f32165Q.getValue();
                            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                            TextView textView2 = (TextView) value3;
                            if (textView2 != null) {
                                AdvanceSummary advanceSummary3 = data2.getAdvanceSummary();
                                textView2.setText(TimeUtils.millis2String(advanceSummary3 != null ? advanceSummary3.getDueDate() : 0L, new SimpleDateFormat("dd MMM yyyy", Locale.ENGLISH)));
                                Unit unit3 = Unit.f38893a;
                            }
                            AdvanceSummary advanceSummary4 = data2.getAdvanceSummary();
                            Integer numValueOf = advanceSummary4 != null ? Integer.valueOf(advanceSummary4.getRepayStatus()) : null;
                            p355xf.t tVar3 = planDetailActivity4.f32166X;
                            if ((numValueOf != null && numValueOf.intValue() == 0) || (numValueOf != null && numValueOf.intValue() == 1)) {
                                Object value4 = tVar3.getValue();
                                Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                                PpButton ppButton = (PpButton) value4;
                                if (ppButton != null) {
                                    ppButton.setText((numValueOf != null && numValueOf.intValue() == 0) ? "Repay" : "Apply Again");
                                    Unit unit4 = Unit.f38893a;
                                }
                                Object value5 = tVar3.getValue();
                                Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                                PpButton ppButton2 = (PpButton) value5;
                                if (ppButton2 != null) {
                                    if (numValueOf != null && numValueOf.intValue() == 1) {
                                        Long maxAdvanceAmount = data2.getMaxAdvanceAmount();
                                        if ((maxAdvanceAmount != null ? maxAdvanceAmount.longValue() : 0L) > 0) {
                                            i7 = 0;
                                        } else if (numValueOf != null && numValueOf.intValue() == 0) {
                                            i7 = 0;
                                        } else {
                                            i7 = 8;
                                        }
                                    } else {
                                        if (numValueOf != null) {
                                            i7 = 0;
                                        }
                                        i7 = 8;
                                    }
                                    ppButton2.setVisibility(i7);
                                    Unit unit5 = Unit.f38893a;
                                }
                                Object value6 = planDetailActivity4.f32161C.getValue();
                                Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                                IconicsTextView iconicsTextView = (IconicsTextView) value6;
                                if (iconicsTextView != null) {
                                    iconicsTextView.setText((numValueOf != null && numValueOf.intValue() == 0) ? "Active" : "Repaid");
                                    Unit unit6 = Unit.f38893a;
                                }
                                Object value7 = tVar2.getValue();
                                Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
                                IconicsTextView iconicsTextView2 = (IconicsTextView) value7;
                                if (iconicsTextView2 != null) {
                                    iconicsTextView2.setText((numValueOf != null && numValueOf.intValue() == 0) ? "Due Date" : "Repaid Date");
                                    Unit unit7 = Unit.f38893a;
                                }
                            }
                            Object value8 = tVar.getValue();
                            Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) value8;
                            if (constraintLayout2 != null) {
                                constraintLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.transsnet.palmpay.managemoney.ui.activity.H
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        AdvanceSummary advanceSummary5;
                                        ProductBean productBean3 = data2;
                                        PlanDetailActivity planDetailActivity5 = planDetailActivity4;
                                        switch (i11) {
                                            case 0:
                                                planDetailActivity5.f32181r0 = true;
                                                Bundle bundle = new Bundle();
                                                bundle.putString("advanceNo", (productBean3 == null || (advanceSummary5 = productBean3.getAdvanceSummary()) == null) ? null : advanceSummary5.getAdvanceNo());
                                                com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "FixedSavingsAdvanceDetail");
                                                break;
                                            case 1:
                                                int i12 = PlanDetailActivity.f32158s0;
                                                AdvanceSummary advanceSummary6 = productBean3.getAdvanceSummary();
                                                CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, (advanceSummary6 == null || advanceSummary6.getRepayStatus() != 0) ? "Repaid Date" : "Due Date", "If you do not complete repayment by the due date, any unrepaid amount will be automatically deducted from your savings plan at maturity.", planDetailActivity5.getString(com.transsnet.palmpay.custom_view.v.cv_confirm), null, 8, null);
                                                Z supportFragmentManager = planDetailActivity5.getSupportFragmentManager();
                                                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                                                commonTipsDialogFragmentCreateDialog$default.show(supportFragmentManager, "showAdvanceTipsDialog");
                                                break;
                                            default:
                                                int i13 = PlanDetailActivity.f32158s0;
                                                String string = planDetailActivity5.getResources().getString(Jc.f.mm_saving_strict_warning, TimeUtils.millis2String(productBean3.getMaturityDate(), new SimpleDateFormat("MMM dd, YYYY", Locale.ENGLISH)), PlanDetailActivity.m(Float.valueOf(productBean3.getEarlyWithdrawalFeeRate())));
                                                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                                O6.c cVar = new O6.c(planDetailActivity5);
                                                cVar.f6596b = O6.d.f(planDetailActivity5.getResources().getString(Jc.f.mm_strict_enabled));
                                                cVar.f6598d = string;
                                                cVar.d(p025ba.k.core_confirm, new ViewOnClickListenerC1478l(16));
                                                cVar.g();
                                                break;
                                        }
                                    }
                                });
                                Unit unit8 = Unit.f38893a;
                            }
                            Object value9 = tVar3.getValue();
                            Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
                            PpButton ppButton3 = (PpButton) value9;
                            if (ppButton3 != null) {
                                ppButton3.setOnClickListener(new ViewOnClickListenerC0087i(numValueOf, 28, data2, planDetailActivity4));
                                Unit unit9 = Unit.f38893a;
                            }
                        }
                        Object value10 = planDetailActivity4.f32162H.getValue();
                        Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
                        IconicsTextView iconicsTextView3 = (IconicsTextView) value10;
                        if (iconicsTextView3 != null) {
                            iconicsTextView3.setOnClickListener(new I(planDetailActivity4, 0));
                            Unit unit10 = Unit.f38893a;
                        }
                        Object value11 = tVar2.getValue();
                        Intrinsics.checkNotNullExpressionValue(value11, "getValue(...)");
                        IconicsTextView iconicsTextView4 = (IconicsTextView) value11;
                        if (iconicsTextView4 != null) {
                            iconicsTextView4.setOnClickListener(new View.OnClickListener() { // from class: com.transsnet.palmpay.managemoney.ui.activity.H
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    AdvanceSummary advanceSummary5;
                                    ProductBean productBean3 = data2;
                                    PlanDetailActivity planDetailActivity5 = planDetailActivity4;
                                    switch (i10) {
                                        case 0:
                                            planDetailActivity5.f32181r0 = true;
                                            Bundle bundle = new Bundle();
                                            bundle.putString("advanceNo", (productBean3 == null || (advanceSummary5 = productBean3.getAdvanceSummary()) == null) ? null : advanceSummary5.getAdvanceNo());
                                            com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "FixedSavingsAdvanceDetail");
                                            break;
                                        case 1:
                                            int i12 = PlanDetailActivity.f32158s0;
                                            AdvanceSummary advanceSummary6 = productBean3.getAdvanceSummary();
                                            CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, (advanceSummary6 == null || advanceSummary6.getRepayStatus() != 0) ? "Repaid Date" : "Due Date", "If you do not complete repayment by the due date, any unrepaid amount will be automatically deducted from your savings plan at maturity.", planDetailActivity5.getString(com.transsnet.palmpay.custom_view.v.cv_confirm), null, 8, null);
                                            Z supportFragmentManager = planDetailActivity5.getSupportFragmentManager();
                                            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                                            commonTipsDialogFragmentCreateDialog$default.show(supportFragmentManager, "showAdvanceTipsDialog");
                                            break;
                                        default:
                                            int i13 = PlanDetailActivity.f32158s0;
                                            String string = planDetailActivity5.getResources().getString(Jc.f.mm_saving_strict_warning, TimeUtils.millis2String(productBean3.getMaturityDate(), new SimpleDateFormat("MMM dd, YYYY", Locale.ENGLISH)), PlanDetailActivity.m(Float.valueOf(productBean3.getEarlyWithdrawalFeeRate())));
                                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                            O6.c cVar = new O6.c(planDetailActivity5);
                                            cVar.f6596b = O6.d.f(planDetailActivity5.getResources().getString(Jc.f.mm_strict_enabled));
                                            cVar.f6598d = string;
                                            cVar.d(p025ba.k.core_confirm, new ViewOnClickListenerC1478l(16));
                                            cVar.g();
                                            break;
                                    }
                                }
                            });
                            Unit unit11 = Unit.f38893a;
                        }
                        kotlin.jvm.internal.B b7 = new kotlin.jvm.internal.B();
                        b7.f38947a = data2.isStrictMode() == 1;
                        p355xf.t tVar4 = planDetailActivity4.f32169c;
                        Object value12 = tVar4.getValue();
                        Intrinsics.checkNotNullExpressionValue(value12, "getValue(...)");
                        AppCompatTextView appCompatTextView = (AppCompatTextView) value12;
                        if (appCompatTextView != null) {
                            appCompatTextView.setVisibility(data2.getPlanStatus() == 2 ? 0 : 8);
                            Unit unit12 = Unit.f38893a;
                        }
                        Object value13 = tVar4.getValue();
                        Intrinsics.checkNotNullExpressionValue(value13, "getValue(...)");
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) value13;
                        if (appCompatTextView2 != null) {
                            appCompatTextView2.setOnClickListener(new ViewOnClickListenerC0087i(planDetailActivity4, 29, data2, b7));
                            Unit unit13 = Unit.f38893a;
                        }
                        planDetailActivity4.f32176k0 = data2.getRenewDepositSwitch() == 1;
                        Object value14 = planDetailActivity4.f32182v.getValue();
                        Intrinsics.checkNotNullExpressionValue(value14, "getValue(...)");
                        PpTitleBar ppTitleBar = (PpTitleBar) value14;
                        if (ppTitleBar != null && (rightImageView2 = ppTitleBar.getRightImageView2()) != null) {
                            rightImageView2.setVisibility(data2.getPlanStatus() == 4 ? 8 : 0);
                            Unit unit14 = Unit.f38893a;
                        }
                        PlanStatus planStatusProduce = PlanStatusFactory.INSTANCE.produce(data2.getPlanStatus());
                        p355xf.t tVar5 = planDetailActivity4.f32171e;
                        Object value15 = tVar5.getValue();
                        Intrinsics.checkNotNullExpressionValue(value15, "getValue(...)");
                        ((LinearLayout) value15).setVisibility((data2.getPlanStatus() == 1 || data2.getPlanStatus() == 3) ? 0 : 8);
                        int planStatus = data2.getPlanStatus();
                        if (planStatus == 1) {
                            planDetailActivity4.p().setText(planDetailActivity4.getResources().getString(Jc.f.mm_plan_status_processing_desc, r0.B(data2.getPrincipal(), true), data2.getShowName()));
                            planDetailActivity4.p().setTextColor(planDetailActivity4.getResources().getColor(L6.b.ppColorWarning));
                            Object value16 = tVar5.getValue();
                            Intrinsics.checkNotNullExpressionValue(value16, "getValue(...)");
                            ((LinearLayout) value16).setBackgroundResource(com.transsnet.palmpay.custom_view.r.cv_shape_rect_corner_12_bg_assist_background);
                        } else if (planStatus == 2) {
                            Object value17 = tVar5.getValue();
                            Intrinsics.checkNotNullExpressionValue(value17, "getValue(...)");
                            LinearLayout linearLayout = (LinearLayout) value17;
                            if (linearLayout != null) {
                                linearLayout.setVisibility(8);
                                Unit unit15 = Unit.f38893a;
                            }
                        } else if (planStatus == 3) {
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                            layoutParams.setMargins(0, 0, 0, 0);
                            planDetailActivity4.p().setLayoutParams(layoutParams);
                            if (data2.getCashFailType() == 4) {
                                planDetailActivity4.p().setText(planDetailActivity4.getResources().getString(Jc.f.mm_detail_account_frozen_desc));
                            } else {
                                AbstractC0511h.f7089a.richText(planDetailActivity4.p(), planDetailActivity4.getResources().getString(Jc.f.mm_plan_detail_hold_desc), C1849p.c("Upgrade your KYC Level"), new C0500c(planDetailActivity4, 11));
                            }
                        }
                        Object value18 = planDetailActivity4.f32178p.getValue();
                        Intrinsics.checkNotNullExpressionValue(value18, "getValue(...)");
                        ((TextView) value18).setText(!TextUtils.isEmpty(data2.getGoal()) ? data2.getGoal() : data2.getProductName());
                        p355xf.t tVar6 = planDetailActivity4.f32177o;
                        Object value19 = tVar6.getValue();
                        Intrinsics.checkNotNullExpressionValue(value19, "getValue(...)");
                        ((TextView) value19).setText(planDetailActivity4.getResources().getString(planStatusProduce.getPlanStatusText()));
                        Object value20 = tVar6.getValue();
                        Intrinsics.checkNotNullExpressionValue(value20, "getValue(...)");
                        ((TextView) value20).setTextColor(planDetailActivity4.getColor(planStatusProduce.getPlanStatusColor()));
                        planDetailActivity4.n().removeAllViews();
                        planDetailActivity4.n().addView(new PlanInfoItem(planDetailActivity4, new com.transsnet.palmpay.managemoney.ui.view.d(planDetailActivity4.getResources().getString(Jc.f.mm_principal_amount), 12.0f, L6.b.ppColorTextAssist, null, null, false, null, 504), new com.transsnet.palmpay.managemoney.ui.view.d(r0.B(data2.getPrincipal(), true), 12.0f, 0, null, null, false, null, 508), 0));
                        Unit unit16 = Unit.f38893a;
                        if (data2.getPlanStatus() == 2 && data2.getRenewDepositNum() > 0) {
                            planDetailActivity4.n().addView(new PlanInfoItem(planDetailActivity4, new com.transsnet.palmpay.managemoney.ui.view.d(planDetailActivity4.getResources().getString(Jc.f.mm_interest_earned), 12.0f, L6.b.ppColorTextAssist, null, null, true, new G(planDetailActivity4, 12), MessageEvent.EVENT_GRAB_COUNT_DOWN_FINISH), new com.transsnet.palmpay.managemoney.ui.view.d(r0.B(data2.getRealEarning(), true), 12.0f, 0, null, null, false, null, 508), 0));
                            planDetailActivity4.n().addView(new PlanInfoItem(planDetailActivity4, new com.transsnet.palmpay.managemoney.ui.view.d(planDetailActivity4.getResources().getString(Jc.f.mm_amount_in_renewal), 12.0f, L6.b.ppColorTextAssist, null, null, false, null, 504), new com.transsnet.palmpay.managemoney.ui.view.d(r0.B(data2.getCurrentPrincipal(), true), 12.0f, 0, null, null, false, null, 508), 0));
                            View view = new View(planDetailActivity4);
                            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, DensityUtil.dp2px(1.0f));
                            layoutParams2.setMargins(0, 8, 0, 8);
                            view.setLayoutParams(layoutParams2);
                            view.setBackgroundColor(view.getResources().getColor(L6.b.ppColorDividerLine));
                            planDetailActivity4.n().addView(view);
                        }
                        int interestSwitchStatus = data2.getInterestSwitchStatus();
                        LinearLayout linearLayoutN = planDetailActivity4.n();
                        com.transsnet.palmpay.managemoney.ui.view.d dVar2 = new com.transsnet.palmpay.managemoney.ui.view.d(planDetailActivity4.getResources().getString(Jc.f.mm_interest_rate), 12.0f, L6.b.ppColorTextAssist, null, null, false, null, 504);
                        if (interestSwitchStatus == 0) {
                            planDetailActivity = planDetailActivity4;
                            dVar = new com.transsnet.palmpay.managemoney.ui.view.d(q0.j(r0.z0(String.valueOf(r0.w1(String.valueOf(data2.getAnnualizedIncomeRatio()), "100"))), "%p.a."), 12.0f, 0, null, null, false, null, 508);
                        } else {
                            planDetailActivity = planDetailActivity4;
                            dVar = new com.transsnet.palmpay.managemoney.ui.view.d(planDetailActivity4.getResources().getString(p025ba.k.core_disabled), 12.0f, L6.b.ppColorTextPrimary, G8.a.x(planDetailActivity4, S6.a.pay_ArrowRight, null, Integer.valueOf(L6.b.ppColorTextPrimary), 16.0f, 114), new com.transsnet.palmpay.core.ui.activity.T(16), false, null, 464);
                        }
                        DensityUtil.dp2px(36.0f);
                        linearLayoutN.addView(new PlanInfoItem(planDetailActivity, dVar2, dVar));
                        LinearLayout linearLayoutN2 = planDetailActivity.n();
                        com.transsnet.palmpay.managemoney.ui.view.d dVar3 = new com.transsnet.palmpay.managemoney.ui.view.d(planDetailActivity.getResources().getString(Jc.f.mm_duration_days), 12.0f, L6.b.ppColorTextAssist, null, null, false, null, 504);
                        com.transsnet.palmpay.managemoney.ui.view.d dVar4 = new com.transsnet.palmpay.managemoney.ui.view.d(data2.getDurationDay() + " Days", 12.0f, 0, null, null, false, null, 508);
                        DensityUtil.dp2px(36.0f);
                        linearLayoutN2.addView(new PlanInfoItem(planDetailActivity, dVar3, dVar4));
                        LinearLayout linearLayoutN3 = planDetailActivity.n();
                        com.transsnet.palmpay.managemoney.ui.view.d dVar5 = new com.transsnet.palmpay.managemoney.ui.view.d(planDetailActivity.getResources().getString(Jc.f.mm_start_data), 12.0f, L6.b.ppColorTextAssist, null, null, false, null, 504);
                        long startDate = data2.getStartDate();
                        Locale locale = Locale.ENGLISH;
                        com.transsnet.palmpay.managemoney.ui.view.d dVar6 = new com.transsnet.palmpay.managemoney.ui.view.d(TimeUtils.millis2String(startDate, new SimpleDateFormat("dd MMM yyyy", locale)), 12.0f, 0, null, null, false, null, 508);
                        DensityUtil.dp2px(36.0f);
                        linearLayoutN3.addView(new PlanInfoItem(planDetailActivity, dVar5, dVar6));
                        LinearLayout linearLayoutN4 = planDetailActivity.n();
                        com.transsnet.palmpay.managemoney.ui.view.d dVar7 = new com.transsnet.palmpay.managemoney.ui.view.d(planDetailActivity.getResources().getString(Jc.f.mm_maturity_date), 12.0f, L6.b.ppColorTextAssist, null, null, data2.getPlanStatus() == 2 || data2.getPlanStatus() == 1, new G(planDetailActivity, 13), MessageEvent.EVENT_GRAB_COUNT_DOWN_FINISH);
                        com.transsnet.palmpay.managemoney.ui.view.d dVar8 = new com.transsnet.palmpay.managemoney.ui.view.d(TimeUtils.millis2String(data2.getMaturityDate(), new SimpleDateFormat("dd MMM yyyy", locale)), 12.0f, 0, null, null, false, null, 508);
                        DensityUtil.dp2px(36.0f);
                        linearLayoutN4.addView(new PlanInfoItem(planDetailActivity, dVar7, dVar8));
                        if (planDetailActivity.f32176k0 && data2.getPlanStatus() != 3 && data2.getPlanStatus() != 5 && (data2.getPlanStatus() != 4 || data2.getRenewDepositNum() != 0)) {
                            TextView textView3 = new TextView(planDetailActivity);
                            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                            layoutParams3.setMargins(0, -16, 0, 0);
                            textView3.setLayoutParams(layoutParams3);
                            textView3.setText("Auto-Renewal Enabled");
                            textView3.setGravity(8388613);
                            textView3.setTextColor(planDetailActivity.getResources().getColor(L6.b.ppColorTextAssist));
                            textView3.setTextSize(1, 12.0f);
                            planDetailActivity.n().addView(textView3);
                        }
                        PayoutOption payoutOption = data2.getPayoutOption();
                        if (payoutOption == null || (name = payoutOption.getName()) == null) {
                            name = "";
                        }
                        planDetailActivity.f32180q0 = name;
                        if (data2.getPlanStatus() != 5) {
                            LinearLayout linearLayoutN5 = planDetailActivity.n();
                            com.transsnet.palmpay.managemoney.ui.view.d dVar9 = new com.transsnet.palmpay.managemoney.ui.view.d(planDetailActivity.getResources().getString(Jc.f.mm_matures_into_your), 12.0f, L6.b.ppColorTextAssist, null, null, true, new G(planDetailActivity, 14), MessageEvent.EVENT_GRAB_COUNT_DOWN_FINISH);
                            PayoutOption payoutOption2 = data2.getPayoutOption();
                            com.transsnet.palmpay.managemoney.ui.view.d dVar10 = new com.transsnet.palmpay.managemoney.ui.view.d(payoutOption2 != null ? payoutOption2.getName() : null, 12.0f, 0, null, null, false, null, 508);
                            DensityUtil.dp2px(36.0f);
                            linearLayoutN5.addView(new PlanInfoItem(planDetailActivity, dVar9, dVar10));
                        }
                        if (data2.getPlanStatus() == 5) {
                            LinearLayout linearLayoutN6 = planDetailActivity.n();
                            com.transsnet.palmpay.managemoney.ui.view.d dVar11 = new com.transsnet.palmpay.managemoney.ui.view.d(planDetailActivity.getResources().getString(Jc.f.mm_break_date), 12.0f, L6.b.ppColorTextAssist, null, null, false, null, 504);
                            com.transsnet.palmpay.managemoney.ui.view.d dVar12 = new com.transsnet.palmpay.managemoney.ui.view.d(TimeUtils.millis2String(data2.getCashTime(), new SimpleDateFormat("dd MMM yyyy", locale)), 12.0f, 0, null, null, false, null, 508);
                            DensityUtil.dp2px(36.0f);
                            linearLayoutN6.addView(new PlanInfoItem(planDetailActivity, dVar11, dVar12));
                            LinearLayout linearLayoutN7 = planDetailActivity.n();
                            com.transsnet.palmpay.managemoney.ui.view.d dVar13 = new com.transsnet.palmpay.managemoney.ui.view.d(planDetailActivity.getResources().getString(Jc.f.mm_break_paid_to), 12.0f, L6.b.ppColorTextAssist, null, null, false, null, 504);
                            PayoutOption payoutOption3 = data2.getPayoutOption();
                            com.transsnet.palmpay.managemoney.ui.view.d dVar14 = new com.transsnet.palmpay.managemoney.ui.view.d(payoutOption3 != null ? payoutOption3.getName() : null, 12.0f, 0, null, null, false, null, 508);
                            DensityUtil.dp2px(36.0f);
                            linearLayoutN7.addView(new PlanInfoItem(planDetailActivity, dVar13, dVar14));
                        }
                        int interestSwitchStatus2 = data2.getInterestSwitchStatus();
                        planDetailActivity.o().removeAllViews();
                        LinearLayout linearLayoutO = planDetailActivity.o();
                        com.transsnet.palmpay.managemoney.ui.view.d dVar15 = new com.transsnet.palmpay.managemoney.ui.view.d(planDetailActivity.getResources().getString(data2.getPlanStatus() < 3 ? Jc.f.mm_interest_expected_value : Jc.f.mm_interest_value), 12.0f, L6.b.ppColorTextAssist, null, null, true, new Hb.A(planDetailActivity, 3, data2, data2), MessageEvent.EVENT_GRAB_COUNT_DOWN_FINISH);
                        com.transsnet.palmpay.managemoney.ui.view.d dVar16 = interestSwitchStatus2 == 0 ? new com.transsnet.palmpay.managemoney.ui.view.d(r0.B(data2.getEarning(), true), 12.0f, 0, null, null, false, null, 508) : new com.transsnet.palmpay.managemoney.ui.view.d(planDetailActivity.getResources().getString(p025ba.k.core_disabled), 12.0f, L6.b.ppColorTextPrimary, G8.a.x(planDetailActivity, S6.a.pay_ArrowRight, null, Integer.valueOf(L6.b.ppColorTextPrimary), 16.0f, 114), new com.transsnet.palmpay.core.ui.activity.T(17), false, null, 464);
                        DensityUtil.dp2px(36.0f);
                        linearLayoutO.addView(new PlanInfoItem(planDetailActivity, dVar15, dVar16));
                        if (data2.getPlanStatus() != 5) {
                            LinearLayout linearLayoutO2 = planDetailActivity.o();
                            com.transsnet.palmpay.managemoney.ui.view.d dVar17 = new com.transsnet.palmpay.managemoney.ui.view.d(planDetailActivity.getResources().getString(Jc.f.mm_withholding_tax), 12.0f, L6.b.ppColorTextAssist, null, null, false, null, 504);
                            com.transsnet.palmpay.managemoney.ui.view.d dVar18 = new com.transsnet.palmpay.managemoney.ui.view.d(r0.B(data2.getIncomeTax(), true), 12.0f, 0, null, null, false, null, 508);
                            DensityUtil.dp2px(36.0f);
                            linearLayoutO2.addView(new PlanInfoItem(planDetailActivity, dVar17, dVar18));
                        }
                        if (data2.getPlanStatus() == 5) {
                            LinearLayout linearLayoutO3 = planDetailActivity.o();
                            com.transsnet.palmpay.managemoney.ui.view.d dVar19 = new com.transsnet.palmpay.managemoney.ui.view.d(planDetailActivity.getResources().getString(Jc.f.mm_interest_lost), 12.0f, L6.b.ppColorTextAssist, null, null, false, null, 504);
                            com.transsnet.palmpay.managemoney.ui.view.d dVar20 = new com.transsnet.palmpay.managemoney.ui.view.d(r0.B(data2.getLostInterest(), true), 12.0f, 0, null, null, false, null, 508);
                            DensityUtil.dp2px(36.0f);
                            linearLayoutO3.addView(new PlanInfoItem(planDetailActivity, dVar19, dVar20));
                        }
                        if ((data2.getPlanStatus() == 4 || data2.getPlanStatus() == 5) && data2.getAutoRepayAmount() != null && data2.getAutoRepayAmount().longValue() > 0) {
                            LinearLayout linearLayoutO4 = planDetailActivity.o();
                            com.transsnet.palmpay.managemoney.ui.view.d dVar21 = new com.transsnet.palmpay.managemoney.ui.view.d(planDetailActivity.getResources().getString(Jc.f.mm_advance_repayment), 12.0f, L6.b.ppColorTextAssist, null, null, true, new G(planDetailActivity, 16), MessageEvent.EVENT_GRAB_COUNT_DOWN_FINISH);
                            Long autoRepayAmount = data2.getAutoRepayAmount();
                            com.transsnet.palmpay.managemoney.ui.view.d dVar22 = new com.transsnet.palmpay.managemoney.ui.view.d(r0.B(autoRepayAmount != null ? autoRepayAmount.longValue() : 0L, true), 12.0f, 0, null, null, false, null, 508);
                            DensityUtil.dp2px(36.0f);
                            linearLayoutO4.addView(new PlanInfoItem(planDetailActivity, dVar21, dVar22));
                        }
                        Long earlyWithdrawalFee = data2.getEarlyWithdrawalFee();
                        if ((earlyWithdrawalFee != null ? earlyWithdrawalFee.longValue() : 0L) > 0) {
                            kotlin.jvm.internal.F f10 = new kotlin.jvm.internal.F();
                            String string = planDetailActivity.getResources().getString(Jc.f.mm_saving_strict_warning, TimeUtils.millis2String(data2.getMaturityDate(), new SimpleDateFormat("dd MMM yyyy", locale)), PlanDetailActivity.m(Float.valueOf(data2.getEarlyWithdrawalFeeRate())));
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            f10.f38951a = string;
                            LinearLayout linearLayoutN8 = planDetailActivity.n();
                            com.transsnet.palmpay.managemoney.ui.view.d dVar23 = new com.transsnet.palmpay.managemoney.ui.view.d("Early Withdraw Fee", 12.0f, L6.b.ppColorTextNormal, null, null, true, new Hb.L(12, f10, planDetailActivity), MessageEvent.EVENT_GRAB_COUNT_DOWN_FINISH);
                            Long earlyWithdrawalFee2 = data2.getEarlyWithdrawalFee();
                            com.transsnet.palmpay.managemoney.ui.view.d dVar24 = new com.transsnet.palmpay.managemoney.ui.view.d(r0.B(earlyWithdrawalFee2 != null ? earlyWithdrawalFee2.longValue() : 0L, true), 12.0f, 0, null, null, false, null, 508);
                            DensityUtil.dp2px(36.0f);
                            linearLayoutN8.addView(new PlanInfoItem(planDetailActivity, dVar23, dVar24));
                        }
                        LinearLayout linearLayoutO5 = planDetailActivity.o();
                        com.transsnet.palmpay.managemoney.ui.view.d dVar25 = new com.transsnet.palmpay.managemoney.ui.view.d(planDetailActivity.getResources().getString(Jc.f.mm_total_value), 12.0f, L6.b.ppColorTextAssist, null, null, false, null, 504);
                        com.transsnet.palmpay.managemoney.ui.view.d dVar26 = new com.transsnet.palmpay.managemoney.ui.view.d(r0.B(data2.getTotalPayback(), true), 12.0f, 0, null, null, false, null, 508);
                        DensityUtil.dp2px(36.0f);
                        linearLayoutO5.addView(new PlanInfoItem(planDetailActivity, dVar25, dVar26));
                        if (data2.getPlanStatus() == 3) {
                            LinearLayout linearLayoutO6 = planDetailActivity.o();
                            com.transsnet.palmpay.managemoney.ui.view.d dVar27 = new com.transsnet.palmpay.managemoney.ui.view.d(planDetailActivity.getResources().getString(Jc.f.mm_remaining_amount), 12.0f, L6.b.ppColorTextAssist, null, null, false, null, 504);
                            com.transsnet.palmpay.managemoney.ui.view.d dVar28 = new com.transsnet.palmpay.managemoney.ui.view.d(r0.B(data2.getRemainingAmount(), true), 12.0f, 0, null, null, false, null, 508);
                            DensityUtil.dp2px(36.0f);
                            linearLayoutO6.addView(new PlanInfoItem(planDetailActivity, dVar27, dVar28));
                        }
                        Object value21 = planDetailActivity.f32172f.getValue();
                        Intrinsics.checkNotNullExpressionValue(value21, "getValue(...)");
                        LinearLayout linearLayout2 = (LinearLayout) value21;
                        if (linearLayout2 != null) {
                            linearLayout2.removeAllViews();
                        }
                        if (data2.getPlanStatus() == 1 || data2.getPlanStatus() == 3) {
                            Object value22 = planDetailActivity.f32173g.getValue();
                            Intrinsics.checkNotNullExpressionValue(value22, "getValue(...)");
                            View view2 = (View) value22;
                            if (view2 != null) {
                                view2.setVisibility(8);
                            }
                        } else if ((data2.getPlanStatus() != 4 && data2.getPlanStatus() != 5) || data2.getRenewDepositNum() > 0) {
                            planDetailActivity.q(data2);
                        }
                        Object value23 = planDetailActivity.t.getValue();
                        Intrinsics.checkNotNullExpressionValue(value23, "getValue(...)");
                        ((NestedScrollView) value23).setVisibility(0);
                        boolean z8 = data2.isStrictMode() == 1;
                        Object value24 = planDetailActivity.f32183w.getValue();
                        Intrinsics.checkNotNullExpressionValue(value24, "getValue(...)");
                        ConstraintLayout constraintLayout3 = (ConstraintLayout) value24;
                        if (constraintLayout3 != null) {
                            constraintLayout3.setVisibility(z8 ? 0 : 8);
                        }
                        Object value25 = planDetailActivity.f32159A.getValue();
                        Intrinsics.checkNotNullExpressionValue(value25, "getValue(...)");
                        IconicsTextView iconicsTextView5 = (IconicsTextView) value25;
                        if (iconicsTextView5 != null) {
                            final int i12 = 2;
                            iconicsTextView5.setOnClickListener(new View.OnClickListener() { // from class: com.transsnet.palmpay.managemoney.ui.activity.H
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    AdvanceSummary advanceSummary5;
                                    ProductBean productBean3 = data2;
                                    PlanDetailActivity planDetailActivity5 = planDetailActivity;
                                    switch (i12) {
                                        case 0:
                                            planDetailActivity5.f32181r0 = true;
                                            Bundle bundle = new Bundle();
                                            bundle.putString("advanceNo", (productBean3 == null || (advanceSummary5 = productBean3.getAdvanceSummary()) == null) ? null : advanceSummary5.getAdvanceNo());
                                            com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "FixedSavingsAdvanceDetail");
                                            break;
                                        case 1:
                                            int i13 = PlanDetailActivity.f32158s0;
                                            AdvanceSummary advanceSummary6 = productBean3.getAdvanceSummary();
                                            CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, (advanceSummary6 == null || advanceSummary6.getRepayStatus() != 0) ? "Repaid Date" : "Due Date", "If you do not complete repayment by the due date, any unrepaid amount will be automatically deducted from your savings plan at maturity.", planDetailActivity5.getString(com.transsnet.palmpay.custom_view.v.cv_confirm), null, 8, null);
                                            Z supportFragmentManager = planDetailActivity5.getSupportFragmentManager();
                                            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                                            commonTipsDialogFragmentCreateDialog$default.show(supportFragmentManager, "showAdvanceTipsDialog");
                                            break;
                                        default:
                                            int i14 = PlanDetailActivity.f32158s0;
                                            String string2 = planDetailActivity5.getResources().getString(Jc.f.mm_saving_strict_warning, TimeUtils.millis2String(productBean3.getMaturityDate(), new SimpleDateFormat("MMM dd, YYYY", Locale.ENGLISH)), PlanDetailActivity.m(Float.valueOf(productBean3.getEarlyWithdrawalFeeRate())));
                                            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                                            O6.c cVar = new O6.c(planDetailActivity5);
                                            cVar.f6596b = O6.d.f(planDetailActivity5.getResources().getString(Jc.f.mm_strict_enabled));
                                            cVar.f6598d = string2;
                                            cVar.d(p025ba.k.core_confirm, new ViewOnClickListenerC1478l(16));
                                            cVar.g();
                                            break;
                                    }
                                }
                            });
                        }
                    } else {
                        planDetailActivity = planDetailActivity4;
                    }
                    if (planDetailActivity.f32179p0 && (((productBean = planDetailActivity.f32168Z) == null || productBean.getAutoRenewal() != 0) && (productBean2 = planDetailActivity.f32168Z) != null && (orderId = productBean2.getOrderId()) != null && (planDetailViewModel = (PlanDetailViewModel) planDetailActivity.l()) != null)) {
                        Intrinsics.checkNotNullParameter(orderId, "orderId");
                        p140j8.f.s(planDetailViewModel, new k0(1, orderId, null), planDetailViewModel.f32786o, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                    }
                } else if (it instanceof com.transsnet.palmpay.core.base.m) {
                    planDetailActivity3.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    planDetailActivity3.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
                }
                return Unit.f38893a;
            case 1:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2 instanceof com.transsnet.palmpay.core.base.o) {
                    planDetailActivity3.showLoadingDialog(true, true);
                } else if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                    planDetailActivity3.showLoadingDialog(false, true);
                    CommonResult commonResult = (CommonResult) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                    if (commonResult.isSuccess()) {
                        int i13 = PlanDetailActivity.f32158s0;
                        PlanDetailViewModel planDetailViewModel2 = (PlanDetailViewModel) planDetailActivity2.l();
                        String stringExtra = planDetailActivity2.getIntent().getStringExtra("orderNo");
                        String stringExtra2 = planDetailActivity2.getIntent().getStringExtra("transType");
                        planDetailViewModel2.getClass();
                        p140j8.f.s(planDetailViewModel2, new i0(stringExtra, stringExtra2, null), planDetailViewModel2.f32781e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0 ? true : true, (28 & 16) == 0);
                        if (planDetailActivity2.f32179p0) {
                            planDetailActivity2.f32179p0 = false;
                            p220oa.h.x(planDetailActivity2, "You have successfully activate Auto-Renewal");
                        }
                        C0.G.u(MessageEvent.EVENT_INVEST_INTEREST, org.greenrobot.eventbus.c.b());
                    } else {
                        planDetailActivity2.f32179p0 = false;
                        String respMsg = commonResult.getRespMsg();
                        if (respMsg != null) {
                            CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, planDetailActivity2.getResources().getString(p025ba.k.core_oops), respMsg, planDetailActivity2.getResources().getString(p025ba.k.core_ok1), null, 8, null);
                            Z supportFragmentManager = planDetailActivity2.getSupportFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                            commonTipsDialogFragmentCreateDialog$default.show(supportFragmentManager, "showErrorDialog");
                        }
                    }
                } else if (it2 instanceof com.transsnet.palmpay.core.base.m) {
                    planDetailActivity3.showLoadingDialog(false, true);
                } else {
                    if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    planDetailActivity3.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it2).f27358a, new Object[0]);
                    String str = ((com.transsnet.palmpay.core.base.n) it2).f27358a;
                    planDetailActivity2.f32179p0 = false;
                    p220oa.h.x(planDetailActivity2, str);
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it3 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (it3 instanceof com.transsnet.palmpay.core.base.o) {
                    planDetailActivity3.showLoadingDialog(true, true);
                } else if (it3 instanceof com.transsnet.palmpay.core.base.p) {
                    planDetailActivity3.showLoadingDialog(false, true);
                    AdvanceRepayResp advanceRepayResp = (AdvanceRepayResp) ((com.transsnet.palmpay.core.base.p) it3).f27360a;
                    if (advanceRepayResp.isSuccess()) {
                        planDetailActivity2.f32181r0 = true;
                        C0751z c0751z = new C0751z(planDetailActivity2, 5);
                        AdvanceRepayResp.AdvanceRepay data3 = advanceRepayResp.getData();
                        c0751z.f4971b = data3 != null ? data3.getOrderId() : null;
                        AdvanceRepayResp.AdvanceRepay data4 = advanceRepayResp.getData();
                        c0751z.c(data4 != null ? data4.getPaymentAmount() : null);
                        c0751z.f4972c = TransType.TRANS_TYPE_FIXED_SAVING_ADANCE_REPAY;
                        c0751z.f4974e = "91";
                        ArrayList arrayList = new ArrayList();
                        AdvanceRepayResp.AdvanceRepay data5 = advanceRepayResp.getData();
                        arrayList.add(new CoreCashierPaymentExtra("Advance Amount", r0.B((data5 == null || (repayPrincipal = data5.getRepayPrincipal()) == null) ? 0L : repayPrincipal.longValue(), false)));
                        AdvanceRepayResp.AdvanceRepay data6 = advanceRepayResp.getData();
                        arrayList.add(new CoreCashierPaymentExtra("Total Service Fee", r0.B((data6 == null || (repayInterest = data6.getRepayInterest()) == null) ? 0L : repayInterest.longValue(), false)));
                        AdvanceRepayResp.AdvanceRepay data7 = advanceRepayResp.getData();
                        arrayList.add(new CoreCashierPaymentExtra("Total Repayable Amount", r0.B((data7 == null || (paymentAmount = data7.getPaymentAmount()) == null) ? 0L : paymentAmount.longValue(), false)));
                        c0751z.b(arrayList);
                        c0751z.d();
                    } else {
                        planDetailActivity2.f32179p0 = false;
                        String respMsg2 = advanceRepayResp.getRespMsg();
                        if (respMsg2 != null) {
                            CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default2 = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, planDetailActivity2.getResources().getString(p025ba.k.core_oops), respMsg2, planDetailActivity2.getResources().getString(p025ba.k.core_ok1), null, 8, null);
                            Z supportFragmentManager2 = planDetailActivity2.getSupportFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "getSupportFragmentManager(...)");
                            commonTipsDialogFragmentCreateDialog$default2.show(supportFragmentManager2, "showErrorDialog");
                        }
                    }
                } else if (it3 instanceof com.transsnet.palmpay.core.base.m) {
                    planDetailActivity3.showLoadingDialog(false, true);
                } else {
                    if (!(it3 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    planDetailActivity3.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it3).f27358a, new Object[0]);
                    String str2 = ((com.transsnet.palmpay.core.base.n) it3).f27358a;
                    planDetailActivity2.f32179p0 = false;
                    p220oa.h.x(planDetailActivity2, str2);
                }
                return Unit.f38893a;
        }
    }
}

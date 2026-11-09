package com.transsnet.palmpay.managemoney.ui.activity;

import N8.m0;
import Pa.i0;
import Pa.r0;
import Wd.C0751z;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Z;
import com.scwang.smartrefresh.layout.util.DensityUtil;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.rsp.GetCashBoxNewcomerResp;
import com.transsnet.palmpay.managemoney.bean.ProductBean;
import com.transsnet.palmpay.managemoney.bean.resp.CreateWithdrawOrderResp;
import com.transsnet.palmpay.managemoney.bean.resp.GetPlanDetailResp;
import com.transsnet.palmpay.managemoney.ui.dialog.CashBoxTermsConditionsWithEventDialogFragment;
import com.transsnet.palmpay.managemoney.ui.view.PlanInfoItem;
import com.transsnet.palmpay.managemoney.ui.viewmodel.PlanDetailViewModel;
import com.transsnet.palmpay.util.TimeUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class F implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PlanBreakPreDetailActivity f32092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PlanBreakPreDetailActivity f32093c;

    public /* synthetic */ F(PlanBreakPreDetailActivity planBreakPreDetailActivity, PlanBreakPreDetailActivity planBreakPreDetailActivity2, int i7) {
        this.f32091a = i7;
        this.f32092b = planBreakPreDetailActivity;
        this.f32093c = planBreakPreDetailActivity2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String strO;
        String stringExtra;
        PlanDetailViewModel planDetailViewModel;
        String cashOrderId;
        switch (this.f32091a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                boolean z3 = it instanceof com.transsnet.palmpay.core.base.o;
                PlanBreakPreDetailActivity planBreakPreDetailActivity = this.f32092b;
                if (z3) {
                    planBreakPreDetailActivity.showLoadingDialog(true, true);
                } else if (it instanceof com.transsnet.palmpay.core.base.p) {
                    planBreakPreDetailActivity.showLoadingDialog(false, true);
                    GetPlanDetailResp getPlanDetailResp = (GetPlanDetailResp) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                    if (getPlanDetailResp.isSuccess()) {
                        ProductBean data = getPlanDetailResp.getData();
                        if (data != null) {
                            PlanBreakPreDetailActivity planBreakPreDetailActivity2 = this.f32093c;
                            planBreakPreDetailActivity2.f32157i = data;
                            data.getPrincipal();
                            LinearLayout linearLayoutM = planBreakPreDetailActivity2.m();
                            com.transsnet.palmpay.managemoney.ui.view.d dVar = new com.transsnet.palmpay.managemoney.ui.view.d(planBreakPreDetailActivity2.getResources().getString(Jc.f.mm_principal_amount), 12.0f, L6.b.ppColorTextNormal, null, null, false, null, 504);
                            com.transsnet.palmpay.managemoney.ui.view.d dVar2 = new com.transsnet.palmpay.managemoney.ui.view.d(r0.B(data.getPrincipal(), true), 12.0f, 0, null, null, false, null, 508);
                            DensityUtil.dp2px(36.0f);
                            linearLayoutM.addView(new PlanInfoItem(planBreakPreDetailActivity2, dVar, dVar2));
                            LinearLayout linearLayoutM2 = planBreakPreDetailActivity2.m();
                            com.transsnet.palmpay.managemoney.ui.view.d dVar3 = new com.transsnet.palmpay.managemoney.ui.view.d(planBreakPreDetailActivity2.getResources().getString(Jc.f.mm_maturity_date), 12.0f, L6.b.ppColorTextNormal, null, null, false, null, 504);
                            long maturityDate = data.getMaturityDate();
                            Locale locale = Locale.ENGLISH;
                            com.transsnet.palmpay.managemoney.ui.view.d dVar4 = new com.transsnet.palmpay.managemoney.ui.view.d(TimeUtils.millis2String(maturityDate, new SimpleDateFormat("dd MMM yyyy", locale)), 12.0f, 0, null, null, false, null, 508);
                            DensityUtil.dp2px(36.0f);
                            linearLayoutM2.addView(new PlanInfoItem(planBreakPreDetailActivity2, dVar3, dVar4));
                            LinearLayout linearLayoutM3 = planBreakPreDetailActivity2.m();
                            com.transsnet.palmpay.managemoney.ui.view.d dVar5 = new com.transsnet.palmpay.managemoney.ui.view.d(planBreakPreDetailActivity2.getResources().getString(Jc.f.mm_interest_expected_value), 12.0f, L6.b.ppColorTextNormal, null, null, false, null, 504);
                            com.transsnet.palmpay.managemoney.ui.view.d dVar6 = data.getInterestSwitchStatus() == 0 ? new com.transsnet.palmpay.managemoney.ui.view.d(r0.B(data.getEarning(), true), 12.0f, 0, null, null, false, null, 508) : new com.transsnet.palmpay.managemoney.ui.view.d(planBreakPreDetailActivity2.getResources().getString(p025ba.k.core_disabled), 12.0f, L6.b.ppColorSuccess, null, null, false, null, 504);
                            DensityUtil.dp2px(36.0f);
                            linearLayoutM3.addView(new PlanInfoItem(planBreakPreDetailActivity2, dVar5, dVar6));
                            LinearLayout linearLayoutM4 = planBreakPreDetailActivity2.m();
                            com.transsnet.palmpay.managemoney.ui.view.d dVar7 = new com.transsnet.palmpay.managemoney.ui.view.d(planBreakPreDetailActivity2.getResources().getString(Jc.f.mm_break_interest_cycles), 12.0f, L6.b.ppColorTextNormal, null, null, false, null, 504);
                            com.transsnet.palmpay.managemoney.ui.view.d dVar8 = new com.transsnet.palmpay.managemoney.ui.view.d(r0.B(data.getRealEarning(), true), 12.0f, 0, null, null, false, null, 508);
                            DensityUtil.dp2px(36.0f);
                            linearLayoutM4.addView(new PlanInfoItem(planBreakPreDetailActivity2, dVar7, dVar8));
                            LinearLayout linearLayoutM5 = planBreakPreDetailActivity2.m();
                            com.transsnet.palmpay.managemoney.ui.view.d dVar9 = new com.transsnet.palmpay.managemoney.ui.view.d(planBreakPreDetailActivity2.getResources().getString(Jc.f.mm_break_interest_cycles_forfeited), 12.0f, L6.b.ppColorTextNormal, null, null, false, null, 504);
                            com.transsnet.palmpay.managemoney.ui.view.d dVar10 = new com.transsnet.palmpay.managemoney.ui.view.d(r0.B(data.getInterestSwitchStatus() == 0 ? data.getLostInterest() : 0L, true), 12.0f, 0, null, null, false, null, 508);
                            DensityUtil.dp2px(36.0f);
                            linearLayoutM5.addView(new PlanInfoItem(planBreakPreDetailActivity2, dVar9, dVar10));
                            Long advanceRepayAmount = data.getAdvanceRepayAmount();
                            if ((advanceRepayAmount != null ? advanceRepayAmount.longValue() : 0L) > 0) {
                                LinearLayout linearLayoutM6 = planBreakPreDetailActivity2.m();
                                com.transsnet.palmpay.managemoney.ui.view.d dVar11 = new com.transsnet.palmpay.managemoney.ui.view.d("Savings Advance Repayment", 12.0f, L6.b.ppColorTextNormal, null, null, true, new D(planBreakPreDetailActivity2, 0), MessageEvent.EVENT_GRAB_COUNT_DOWN_FINISH);
                                Long advanceRepayAmount2 = data.getAdvanceRepayAmount();
                                com.transsnet.palmpay.managemoney.ui.view.d dVar12 = new com.transsnet.palmpay.managemoney.ui.view.d(r0.B(advanceRepayAmount2 != null ? advanceRepayAmount2.longValue() : 0L, true), 12.0f, 0, null, null, false, null, 508);
                                DensityUtil.dp2px(36.0f);
                                linearLayoutM6.addView(new PlanInfoItem(planBreakPreDetailActivity2, dVar11, dVar12));
                                View viewInflate = View.inflate(planBreakPreDetailActivity2, Jc.d.mm_break_pre_savings_child, null);
                                TextView textView = viewInflate != null ? (TextView) viewInflate.findViewById(Jc.c.tvAdvanceValue) : null;
                                TextView textView2 = viewInflate != null ? (TextView) viewInflate.findViewById(Jc.c.tvFeeValue) : null;
                                if (textView != null) {
                                    Long advanceRepayPrincipal = data.getAdvanceRepayPrincipal();
                                    textView.setText(r0.B(advanceRepayPrincipal != null ? advanceRepayPrincipal.longValue() : 0L, true));
                                }
                                if (textView2 != null) {
                                    Long advanceRepayInterest = data.getAdvanceRepayInterest();
                                    textView2.setText(r0.B(advanceRepayInterest != null ? advanceRepayInterest.longValue() : 0L, true));
                                }
                                planBreakPreDetailActivity2.m().addView(viewInflate);
                            }
                            kotlin.jvm.internal.F f10 = new kotlin.jvm.internal.F();
                            Resources resources = planBreakPreDetailActivity2.getResources();
                            int i7 = Jc.f.mm_saving_strict_warning;
                            String strMillis2String = TimeUtils.millis2String(data.getMaturityDate(), new SimpleDateFormat("dd MMM yyyy", locale));
                            String strZ0 = r0.z0(r0.w1(String.valueOf(data.getEarlyWithdrawalFeeRate()), "100").toString());
                            Intrinsics.checkNotNullExpressionValue(strZ0, "getPrettyNumber(...)");
                            String string = resources.getString(i7, strMillis2String, strZ0);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            f10.f38951a = string;
                            Long earlyWithdrawalFee = data.getEarlyWithdrawalFee();
                            if ((earlyWithdrawalFee != null ? earlyWithdrawalFee.longValue() : 0L) > 0) {
                                LinearLayout linearLayoutM7 = planBreakPreDetailActivity2.m();
                                com.transsnet.palmpay.managemoney.ui.view.d dVar13 = new com.transsnet.palmpay.managemoney.ui.view.d("Early Withdraw Fee", 12.0f, L6.b.ppColorTextNormal, null, null, true, new Hb.L(11, f10, planBreakPreDetailActivity2), MessageEvent.EVENT_GRAB_COUNT_DOWN_FINISH);
                                Long earlyWithdrawalFee2 = data.getEarlyWithdrawalFee();
                                com.transsnet.palmpay.managemoney.ui.view.d dVar14 = new com.transsnet.palmpay.managemoney.ui.view.d(r0.B(earlyWithdrawalFee2 != null ? earlyWithdrawalFee2.longValue() : 0L, true), 12.0f, 0, null, null, false, null, 508);
                                DensityUtil.dp2px(36.0f);
                                linearLayoutM7.addView(new PlanInfoItem(planBreakPreDetailActivity2, dVar13, dVar14));
                            }
                            LinearLayout linearLayoutM8 = planBreakPreDetailActivity2.m();
                            com.transsnet.palmpay.managemoney.ui.view.d dVar15 = new com.transsnet.palmpay.managemoney.ui.view.d(planBreakPreDetailActivity2.getResources().getString(Jc.f.mm_total_payable), 12.0f, L6.b.ppColorTextNormal, null, null, false, null, 504);
                            com.transsnet.palmpay.managemoney.ui.view.d dVar16 = new com.transsnet.palmpay.managemoney.ui.view.d(r0.B(data.getTotalPayback(), true), 12.0f, 0, null, null, false, null, 508);
                            DensityUtil.dp2px(20.0f);
                            linearLayoutM8.addView(new PlanInfoItem(planBreakPreDetailActivity2, dVar15, dVar16));
                            if (data.getInterestSwitchStatus() == 0) {
                                Long earlyWithdrawalFee3 = data.getEarlyWithdrawalFee();
                                String strO2 = "";
                                if ((earlyWithdrawalFee3 != null ? earlyWithdrawalFee3.longValue() : 0L) > 0) {
                                    Long earlyWithdrawalFee4 = data.getEarlyWithdrawalFee();
                                    strO = C0.G.o("-", r0.A(earlyWithdrawalFee4 != null ? earlyWithdrawalFee4.longValue() : 0L));
                                } else {
                                    strO = "";
                                }
                                Long advanceRepayAmount3 = data.getAdvanceRepayAmount();
                                if ((advanceRepayAmount3 != null ? advanceRepayAmount3.longValue() : 0L) > 0) {
                                    Long advanceRepayAmount4 = data.getAdvanceRepayAmount();
                                    strO2 = C0.G.o("-", r0.A(advanceRepayAmount4 != null ? advanceRepayAmount4.longValue() : 0L));
                                }
                                String strS = C0.G.s(androidx.camera.camera2.internal.F.f("(", r0.A(data.getPrincipal()), "+", r0.A(data.getEarning()), "-"), r0.A(data.getLostInterest()), strO2, strO, ")");
                                LinearLayout linearLayoutM9 = planBreakPreDetailActivity2.m();
                                com.transsnet.palmpay.managemoney.ui.view.d dVar17 = new com.transsnet.palmpay.managemoney.ui.view.d(strS, 12.0f, L6.b.ppColorTextAssist, null, null, false, null, 504);
                                DensityUtil.dp2px(16.0f);
                                linearLayoutM9.addView(new PlanInfoItem(planBreakPreDetailActivity2, (com.transsnet.palmpay.managemoney.ui.view.d) null, dVar17));
                            }
                            Object value = planBreakPreDetailActivity2.f32154e.getValue();
                            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                            com.transsnet.palmpay.managemoney.ui.view.d dVar18 = new com.transsnet.palmpay.managemoney.ui.view.d(planBreakPreDetailActivity2.getResources().getString(Jc.f.mm_break_paid_to), 12.0f, L6.b.ppColorTextNormal, null, null, false, null, 504);
                            com.transsnet.palmpay.managemoney.ui.view.d dVar19 = new com.transsnet.palmpay.managemoney.ui.view.d(planBreakPreDetailActivity2.getResources().getString(p025ba.k.core_palmpay_payment_cash_box), 12.0f, 0, null, null, false, null, 508);
                            DensityUtil.dp2px(36.0f);
                            ((LinearLayout) value).addView(new PlanInfoItem(planBreakPreDetailActivity2, dVar18, dVar19));
                            Object value2 = planBreakPreDetailActivity2.f32156g.getValue();
                            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                            ((NestedScrollView) value2).setVisibility(0);
                        }
                    } else {
                        String respMsg = getPlanDetailResp.getRespMsg();
                        if (respMsg != null) {
                            ToastUtils.showShort(respMsg, new Object[0]);
                        }
                    }
                } else if (it instanceof com.transsnet.palmpay.core.base.m) {
                    planBreakPreDetailActivity.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    planBreakPreDetailActivity.showLoadingDialog(false, true);
                    com.transsnet.palmpay.core.base.n nVar = (com.transsnet.palmpay.core.base.n) it;
                    ToastUtils.showLong(nVar.f27358a, new Object[0]);
                    ToastUtils.showShort(nVar.f27358a, new Object[0]);
                }
                return Unit.f38893a;
            case 1:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                boolean z8 = it2 instanceof com.transsnet.palmpay.core.base.o;
                PlanBreakPreDetailActivity planBreakPreDetailActivity3 = this.f32092b;
                if (z8) {
                    planBreakPreDetailActivity3.showLoadingDialog(true, true);
                } else if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                    planBreakPreDetailActivity3.showLoadingDialog(false, true);
                    GetCashBoxNewcomerResp getCashBoxNewcomerResp = (GetCashBoxNewcomerResp) ((CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it2).f27360a).data;
                    PlanBreakPreDetailActivity planBreakPreDetailActivity4 = this.f32093c;
                    if (getCashBoxNewcomerResp == null || !getCashBoxNewcomerResp.cashBoxMemberStatus) {
                        Intent intent = planBreakPreDetailActivity4.getIntent();
                        if (intent != null && (stringExtra = intent.getStringExtra("orderNo")) != null && (planDetailViewModel = (PlanDetailViewModel) planBreakPreDetailActivity4.l()) != null) {
                            planDetailViewModel.d(stringExtra);
                        }
                    } else {
                        CashBoxTermsConditionsWithEventDialogFragment cashBoxTermsConditionsWithEventDialogFragmentNewInstance = CashBoxTermsConditionsWithEventDialogFragment.f32287H.newInstance();
                        m0 mDialogOpClick = new m0(planBreakPreDetailActivity4, 3);
                        cashBoxTermsConditionsWithEventDialogFragmentNewInstance.getClass();
                        Intrinsics.checkNotNullParameter(mDialogOpClick, "mDialogOpClick");
                        cashBoxTermsConditionsWithEventDialogFragmentNewInstance.f32288C = mDialogOpClick;
                        Z supportFragmentManager = planBreakPreDetailActivity4.getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                        cashBoxTermsConditionsWithEventDialogFragmentNewInstance.show(supportFragmentManager, "showCashBoxTermsConditionsDialog");
                    }
                } else if (it2 instanceof com.transsnet.palmpay.core.base.m) {
                    planBreakPreDetailActivity3.showLoadingDialog(false, true);
                } else {
                    if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    planBreakPreDetailActivity3.showLoadingDialog(false, true);
                    com.transsnet.palmpay.core.base.n nVar2 = (com.transsnet.palmpay.core.base.n) it2;
                    ToastUtils.showLong(nVar2.f27358a, new Object[0]);
                    ToastUtils.showShort(nVar2.f27358a, new Object[0]);
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it3 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                boolean z10 = it3 instanceof com.transsnet.palmpay.core.base.o;
                PlanBreakPreDetailActivity planBreakPreDetailActivity5 = this.f32092b;
                if (z10) {
                    planBreakPreDetailActivity5.showLoadingDialog(true, true);
                } else if (it3 instanceof com.transsnet.palmpay.core.base.p) {
                    planBreakPreDetailActivity5.showLoadingDialog(false, true);
                    CreateWithdrawOrderResp createWithdrawOrderResp = (CreateWithdrawOrderResp) ((com.transsnet.palmpay.core.base.p) it3).f27360a;
                    boolean zIsSuccess = createWithdrawOrderResp.isSuccess();
                    PlanBreakPreDetailActivity planBreakPreDetailActivity6 = this.f32093c;
                    if (zIsSuccess) {
                        CreateWithdrawOrderResp.CreateWithdrawOrder data2 = createWithdrawOrderResp.getData();
                        if (data2 != null && (cashOrderId = data2.getCashOrderId()) != null) {
                            ProductBean productBean = planBreakPreDetailActivity6.f32157i;
                            if (productBean != null) {
                                productBean.setOrderId(cashOrderId);
                            }
                            C0751z c0751z = new C0751z(planBreakPreDetailActivity6, 4);
                            ProductBean productBean2 = planBreakPreDetailActivity6.f32157i;
                            c0751z.f4971b = productBean2 != null ? productBean2.getOrderId() : null;
                            ProductBean productBean3 = planBreakPreDetailActivity6.f32157i;
                            c0751z.c(productBean3 != null ? Long.valueOf(productBean3.getTotalPayback()) : null);
                            c0751z.f4972c = TransType.TRANS_TYPE_FIXED_SAVING_PAID;
                            c0751z.f4973d = TransType.TRANS_TYPE_FIXED_SAVING_PAID_CHILD;
                            c0751z.f4974e = "71";
                            c0751z.d();
                        }
                    } else {
                        i0.i0(planBreakPreDetailActivity6, createWithdrawOrderResp.getRespCode(), createWithdrawOrderResp.getRespMsg(), false);
                    }
                } else if (it3 instanceof com.transsnet.palmpay.core.base.m) {
                    planBreakPreDetailActivity5.showLoadingDialog(false, true);
                } else {
                    if (!(it3 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    planBreakPreDetailActivity5.showLoadingDialog(false, true);
                    com.transsnet.palmpay.core.base.n nVar3 = (com.transsnet.palmpay.core.base.n) it3;
                    ToastUtils.showLong(nVar3.f27358a, new Object[0]);
                    ToastUtils.showShort(nVar3.f27358a, new Object[0]);
                }
                return Unit.f38893a;
        }
    }
}

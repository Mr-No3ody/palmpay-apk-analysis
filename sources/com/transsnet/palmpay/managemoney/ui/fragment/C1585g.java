package com.transsnet.palmpay.managemoney.ui.fragment;

import Wd.C0751z;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.xiaofeidev.shadow.ShadowFrameLayout;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.cashier.CoreCashierPaymentExtra;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.custom_view.AmountEditText;
import com.transsnet.palmpay.custom_view.dialog.CommonTipsDialogFragment;
import com.transsnet.palmpay.main.export.bean.rsp.GetUserAssetsAmountResp;
import com.transsnet.palmpay.managemoney.bean.resp.CreateCashBoxOrderResp;
import com.transsnet.palmpay.managemoney.bean.resp.GetCashBoxBeforeOrderConfigResp;
import com.transsnet.palmpay.managemoney.bean.resp.GetInterestRateConfigResp;
import com.transsnet.palmpay.managemoney.bean.resp.GetInterestSwitchResp;
import com.transsnet.palmpay.managemoney.ui.dialog.TurnOnAutoSaveSuccessfullyDialogFragment;
import com.transsnet.palmpay.managemoney.ui.view.CashBoxEstimatedInterestView;
import com.transsnet.palmpay.managemoney.ui.viewmodel.CashBoxViewModel;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsnet.palmpay.managemoney.ui.fragment.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1585g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CashBoxDepositFragment f32611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CashBoxDepositFragment f32612c;

    public /* synthetic */ C1585g(CashBoxDepositFragment cashBoxDepositFragment, CashBoxDepositFragment cashBoxDepositFragment2, int i7) {
        this.f32610a = i7;
        this.f32611b = cashBoxDepositFragment;
        this.f32612c = cashBoxDepositFragment2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AmountEditText amountEditTextT;
        GetInterestSwitchResp getInterestSwitchResp;
        CashBoxDepositFragment cashBoxDepositFragment = this.f32612c;
        CashBoxDepositFragment cashBoxDepositFragment2 = this.f32611b;
        switch (this.f32610a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof com.transsnet.palmpay.core.base.o) {
                    cashBoxDepositFragment2.showLoadingDialog(true, true);
                } else if (it instanceof com.transsnet.palmpay.core.base.p) {
                    cashBoxDepositFragment2.showLoadingDialog(false, true);
                    GetCashBoxBeforeOrderConfigResp.CashBoxBeforeOrderConfig data = ((GetCashBoxBeforeOrderConfigResp) ((com.transsnet.palmpay.core.base.p) it).f27360a).getData();
                    if (data != null) {
                        cashBoxDepositFragment.f32365X = data;
                        AmountEditText amountEditTextT2 = cashBoxDepositFragment.t();
                        if (amountEditTextT2 != null) {
                            amountEditTextT2.setHint("Min " + Pa.r0.B(data.getBuyMinLimit(), true) + "-Max " + Pa.r0.B(data.getBuyMaxLimit(), true));
                        }
                        CashBoxEstimatedInterestView cashBoxEstimatedInterestViewV = cashBoxDepositFragment.v();
                        if (cashBoxEstimatedInterestViewV != null) {
                            cashBoxEstimatedInterestViewV.e(data.getCashLevel());
                        }
                    }
                } else if (it instanceof com.transsnet.palmpay.core.base.m) {
                    cashBoxDepositFragment2.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    cashBoxDepositFragment2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
                    ((com.transsnet.palmpay.core.base.n) it).getClass();
                }
                return Unit.f38893a;
            case 1:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2 instanceof com.transsnet.palmpay.core.base.o) {
                    cashBoxDepositFragment2.showLoadingDialog(true, true);
                } else if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                    cashBoxDepositFragment2.showLoadingDialog(false, true);
                    CashBoxDepositFragment.a aVar = CashBoxDepositFragment.f32357p0;
                    SwitchCompat switchCompat = (SwitchCompat) cashBoxDepositFragment.f32373w.getValue();
                    if (switchCompat != null && switchCompat.isChecked()) {
                        TurnOnAutoSaveSuccessfullyDialogFragment turnOnAutoSaveSuccessfullyDialogFragmentNewInstance = TurnOnAutoSaveSuccessfullyDialogFragment.f32327C.newInstance();
                        androidx.fragment.app.Z childFragmentManager = cashBoxDepositFragment.getChildFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                        turnOnAutoSaveSuccessfullyDialogFragmentNewInstance.show(childFragmentManager, "showTurnOnAutoSaveSuccessfullyDialog");
                    }
                } else if (it2 instanceof com.transsnet.palmpay.core.base.m) {
                    cashBoxDepositFragment2.showLoadingDialog(false, true);
                } else {
                    if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    cashBoxDepositFragment2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it2).f27358a, new Object[0]);
                    ((com.transsnet.palmpay.core.base.n) it2).getClass();
                }
                return Unit.f38893a;
            case 2:
                com.transsnet.palmpay.core.base.q it3 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (it3 instanceof com.transsnet.palmpay.core.base.o) {
                    cashBoxDepositFragment2.showLoadingDialog(true, true);
                } else if (it3 instanceof com.transsnet.palmpay.core.base.p) {
                    cashBoxDepositFragment2.showLoadingDialog(false, true);
                    CommonResult commonResult = (CommonResult) ((com.transsnet.palmpay.core.base.p) it3).f27360a;
                    if (commonResult.isSuccess()) {
                        CashBoxDepositFragment.a aVar2 = CashBoxDepositFragment.f32357p0;
                        SwitchCompat switchCompatU = cashBoxDepositFragment.u();
                        if (switchCompatU != null) {
                            if (switchCompatU.isChecked()) {
                                androidx.camera.core.impl.utils.n.v(p025ba.k.core_successful);
                            }
                            p059e1.a.U(switchCompatU.isChecked() ? 1 : 0, "invest_interest_disable");
                            if (!switchCompatU.isChecked() && (amountEditTextT = cashBoxDepositFragment.t()) != null) {
                                CashBoxViewModel cashBoxViewModel = (CashBoxViewModel) cashBoxDepositFragment.f27333i;
                                if (cashBoxViewModel != null) {
                                    cashBoxViewModel.e(amountEditTextT.getLong());
                                }
                                CashBoxEstimatedInterestView cashBoxEstimatedInterestViewV2 = cashBoxDepositFragment.v();
                                if (cashBoxEstimatedInterestViewV2 != null) {
                                    long j6 = amountEditTextT.getLong();
                                    GetUserAssetsAmountResp.Balance balance = cashBoxEstimatedInterestViewV2.f32687A;
                                    long j10 = balance != null ? balance.availableBalance : 0L;
                                    ConstraintLayout constraintLayout = cashBoxEstimatedInterestViewV2.f32696f;
                                    if (constraintLayout != null) {
                                        constraintLayout.setVisibility(j6 > j10 ? 0 : 8);
                                    }
                                }
                            }
                            TextView textView = (TextView) cashBoxDepositFragment.f32360C.getValue();
                            if (textView != null) {
                                textView.setVisibility(switchCompatU.isChecked() ? 0 : 8);
                            }
                        }
                        CashBoxEstimatedInterestView cashBoxEstimatedInterestViewV3 = cashBoxDepositFragment.v();
                        if (cashBoxEstimatedInterestViewV3 != null) {
                            int iD = p059e1.a.D(0, "invest_interest_disable");
                            ShadowFrameLayout shadowFrameLayout = cashBoxEstimatedInterestViewV3.f32694d;
                            if (shadowFrameLayout != null) {
                                shadowFrameLayout.setVisibility(iD != 1 ? 0 : 8);
                            }
                        }
                        C0.G.u(MessageEvent.EVENT_INVEST_INTEREST, org.greenrobot.eventbus.c.b());
                    } else {
                        String respMsg = commonResult.getRespMsg();
                        if (respMsg != null) {
                            ToastUtils.showShort(respMsg, new Object[0]);
                        }
                    }
                } else if (it3 instanceof com.transsnet.palmpay.core.base.m) {
                    cashBoxDepositFragment2.showLoadingDialog(false, true);
                } else {
                    if (!(it3 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    cashBoxDepositFragment2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it3).f27358a, new Object[0]);
                    ((com.transsnet.palmpay.core.base.n) it3).getClass();
                }
                return Unit.f38893a;
            case 3:
                com.transsnet.palmpay.core.base.q it4 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                if (it4 instanceof com.transsnet.palmpay.core.base.o) {
                    cashBoxDepositFragment2.showLoadingDialog(true, true);
                } else if (it4 instanceof com.transsnet.palmpay.core.base.p) {
                    cashBoxDepositFragment2.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it4).f27360a;
                    if (commonBeanResult.isSuccess() && (getInterestSwitchResp = (GetInterestSwitchResp) commonBeanResult.data) != null) {
                        CashBoxDepositFragment.a aVar3 = CashBoxDepositFragment.f32357p0;
                        SwitchCompat switchCompatU2 = cashBoxDepositFragment.u();
                        if (switchCompatU2 != null) {
                            switchCompatU2.setChecked(getInterestSwitchResp.getSwitchStatus() == 1);
                        }
                        p059e1.a.U(getInterestSwitchResp.getSwitchStatus(), "invest_interest_disable");
                        TextView textView2 = (TextView) cashBoxDepositFragment.f32360C.getValue();
                        if (textView2 != null) {
                            textView2.setVisibility(getInterestSwitchResp.getSwitchStatus() == 1 ? 0 : 8);
                        }
                    }
                } else if (it4 instanceof com.transsnet.palmpay.core.base.m) {
                    cashBoxDepositFragment2.showLoadingDialog(false, true);
                } else {
                    if (!(it4 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    cashBoxDepositFragment2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it4).f27358a, new Object[0]);
                    ((com.transsnet.palmpay.core.base.n) it4).getClass();
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it5 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                if (it5 instanceof com.transsnet.palmpay.core.base.o) {
                    cashBoxDepositFragment2.showLoadingDialog(true, true);
                } else if (it5 instanceof com.transsnet.palmpay.core.base.p) {
                    cashBoxDepositFragment2.showLoadingDialog(false, true);
                    CreateCashBoxOrderResp createCashBoxOrderResp = (CreateCashBoxOrderResp) ((com.transsnet.palmpay.core.base.p) it5).f27360a;
                    if (createCashBoxOrderResp.isSuccess()) {
                        CashBoxDepositFragment.a aVar4 = CashBoxDepositFragment.f32357p0;
                        androidx.fragment.app.E e10 = cashBoxDepositFragment.f27319c;
                        Intrinsics.f(e10, "null cannot be cast to non-null type com.transsnet.palmpay.core.base.BaseActivity");
                        C0751z c0751z = new C0751z((BaseActivity) e10, 2);
                        CreateCashBoxOrderResp.CreateCashBoxOrderResult data2 = createCashBoxOrderResp.getData();
                        c0751z.f4971b = data2 != null ? data2.getOrderId() : null;
                        CreateCashBoxOrderResp.CreateCashBoxOrderResult data3 = createCashBoxOrderResp.getData();
                        c0751z.c(data3 != null ? data3.getPrincipal() : null);
                        c0751z.f4972c = TransType.TRANS_TYPE_CASH_BOX_DEPOSIT;
                        c0751z.f4974e = "66";
                        ArrayList arrayList = new ArrayList();
                        String string = cashBoxDepositFragment.getResources().getString(Jc.f.mm_annual_interest_rates);
                        GetInterestRateConfigResp getInterestRateConfigResp = Kc.f.f4999b.getInstance().f5000a;
                        arrayList.add(new CoreCashierPaymentExtra(string, N8.q0.j(Pa.r0.z0(String.valueOf(Pa.r0.w1(getInterestRateConfigResp != null ? getInterestRateConfigResp.getProductRate() : null, "100"))), "%p.a.")));
                        c0751z.b(arrayList);
                        c0751z.d();
                    } else {
                        String respCode = createCashBoxOrderResp.getRespCode();
                        Intrinsics.checkNotNullExpressionValue(respCode, "getRespCode(...)");
                        String respMsg2 = createCashBoxOrderResp.getRespMsg();
                        CashBoxDepositFragment.a aVar5 = CashBoxDepositFragment.f32357p0;
                        if ("CFRONT_800078".equals(respCode) || "33000039".equals(respCode)) {
                            CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, new com.transsnet.palmpay.custom_view.dialog.v(cashBoxDepositFragment.getString(Jc.f.mm_limit_exceeds)), new com.transsnet.palmpay.custom_view.dialog.v(respMsg2, 14.0f, L6.b.ppColorTextNormal), new com.transsnet.palmpay.custom_view.dialog.c(cashBoxDepositFragment.getString(Jc.f.mm_action_exit)), new com.transsnet.palmpay.custom_view.dialog.c(cashBoxDepositFragment.getString(Jc.f.mm_action_upgrade), new com.transsnet.palmpay.core.ui.activity.T(19)), null, 16, null);
                            androidx.fragment.app.Z childFragmentManager2 = cashBoxDepositFragment.getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
                            commonTipsDialogFragmentCreateDialog$default.show(childFragmentManager2, "showCommonTipsDialog");
                        } else if ("CFRONT_800081".equals(respCode) || "33000040".equals(respCode)) {
                            CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default2 = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, new com.transsnet.palmpay.custom_view.dialog.v(cashBoxDepositFragment.getString(Jc.f.mm_limit_exceeds)), new com.transsnet.palmpay.custom_view.dialog.v(respMsg2, 14.0f, L6.b.ppColorTextNormal), new com.transsnet.palmpay.custom_view.dialog.c(cashBoxDepositFragment.getString(Jc.f.mm_action_exit)), new com.transsnet.palmpay.custom_view.dialog.c(cashBoxDepositFragment.getString(Jc.f.mm_action_upgrade), new com.transsnet.palmpay.core.ui.activity.T(20)), null, 16, null);
                            androidx.fragment.app.Z childFragmentManager3 = cashBoxDepositFragment.getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "getChildFragmentManager(...)");
                            commonTipsDialogFragmentCreateDialog$default2.show(childFragmentManager3, "showCommonTipsDialog");
                        } else if ("14003048".equals(respCode)) {
                            CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default3 = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, new com.transsnet.palmpay.custom_view.dialog.v(cashBoxDepositFragment.getString(Jc.f.mm_no_slots_available)), new com.transsnet.palmpay.custom_view.dialog.v(respMsg2, 14.0f, L6.b.ppColorTextNormal), null, new com.transsnet.palmpay.custom_view.dialog.c(cashBoxDepositFragment.getString(p025ba.k.core_confirm)), null, 16, null);
                            androidx.fragment.app.Z childFragmentManager4 = cashBoxDepositFragment.getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager4, "getChildFragmentManager(...)");
                            commonTipsDialogFragmentCreateDialog$default3.show(childFragmentManager4, "showCommonTipsDialog");
                        } else if (Intrinsics.c(respCode, "fb_open_error_code")) {
                            CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default4 = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, cashBoxDepositFragment.getResources().getString(Jc.f.mm_fb_open_code_title), respMsg2, cashBoxDepositFragment.getResources().getString(p025ba.k.core_confirm), null, 8, null);
                            androidx.fragment.app.Z childFragmentManager5 = cashBoxDepositFragment.getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager5, "getChildFragmentManager(...)");
                            commonTipsDialogFragmentCreateDialog$default4.show(childFragmentManager5, "showErrorDialog");
                        } else if ("14003106".equals(respCode)) {
                            String string2 = cashBoxDepositFragment.getResources().getString(Jc.f.mm_capped_title);
                            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                            cashBoxDepositFragment.w(string2, "capped");
                        } else if ("14003107".equals(respCode)) {
                            String string3 = cashBoxDepositFragment.getResources().getString(Jc.f.mm_frozen_title);
                            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                            cashBoxDepositFragment.w(string3, "frozen");
                        } else if ("14003108".equals(respCode)) {
                            String string4 = cashBoxDepositFragment.getResources().getString(Jc.f.mm_suspended_title);
                            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                            cashBoxDepositFragment.w(string4, "suspended");
                        } else {
                            CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default5 = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, new com.transsnet.palmpay.custom_view.dialog.v(cashBoxDepositFragment.getString(p025ba.k.core_opps)), new com.transsnet.palmpay.custom_view.dialog.v(respMsg2, 14.0f, L6.b.ppColorTextNormal), null, new com.transsnet.palmpay.custom_view.dialog.c(cashBoxDepositFragment.getString(p025ba.k.core_confirm)), null, 16, null);
                            androidx.fragment.app.Z childFragmentManager6 = cashBoxDepositFragment.getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager6, "getChildFragmentManager(...)");
                            commonTipsDialogFragmentCreateDialog$default5.show(childFragmentManager6, "showCommonTipsDialog");
                        }
                    }
                } else if (it5 instanceof com.transsnet.palmpay.core.base.m) {
                    cashBoxDepositFragment2.showLoadingDialog(false, true);
                } else {
                    if (!(it5 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    cashBoxDepositFragment2.showLoadingDialog(false, true);
                    String str = ((com.transsnet.palmpay.core.base.n) it5).f27358a;
                    if (!TextUtils.isEmpty(str)) {
                        p220oa.h.y(cashBoxDepositFragment, str);
                    }
                }
                return Unit.f38893a;
        }
    }
}

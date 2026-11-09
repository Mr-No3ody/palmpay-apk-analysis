package com.transsnet.palmpay.managemoney.ui.fragment;

import Wd.C0751z;
import android.text.TextUtils;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.custom_view.dialog.CommonTipsDialogFragment;
import com.transsnet.palmpay.managemoney.bean.resp.CreateCashBoxOrderResp;
import com.transsnet.palmpay.managemoney.bean.resp.GetCashBoxBeforeOrderConfigResp;
import com.transsnet.palmpay.managemoney.ui.view.CashBoxEstimatedInterestView;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class F implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CashBoxWithdrawFragment f32456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CashBoxWithdrawFragment f32457c;

    public /* synthetic */ F(CashBoxWithdrawFragment cashBoxWithdrawFragment, CashBoxWithdrawFragment cashBoxWithdrawFragment2, int i7) {
        this.f32455a = i7;
        this.f32456b = cashBoxWithdrawFragment;
        this.f32457c = cashBoxWithdrawFragment2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CashBoxWithdrawFragment cashBoxWithdrawFragment = this.f32457c;
        CashBoxWithdrawFragment cashBoxWithdrawFragment2 = this.f32456b;
        switch (this.f32455a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof com.transsnet.palmpay.core.base.o) {
                    cashBoxWithdrawFragment2.showLoadingDialog(true, true);
                } else if (it instanceof com.transsnet.palmpay.core.base.p) {
                    cashBoxWithdrawFragment2.showLoadingDialog(false, true);
                    GetCashBoxBeforeOrderConfigResp.CashBoxBeforeOrderConfig data = ((GetCashBoxBeforeOrderConfigResp) ((com.transsnet.palmpay.core.base.p) it).f27360a).getData();
                    if (data != null) {
                        cashBoxWithdrawFragment.f32450w = data;
                        CashBoxEstimatedInterestView cashBoxEstimatedInterestViewU = cashBoxWithdrawFragment.u();
                        if (cashBoxEstimatedInterestViewU != null) {
                            cashBoxEstimatedInterestViewU.e(data.getCashLevel());
                        }
                    }
                } else if (it instanceof com.transsnet.palmpay.core.base.m) {
                    cashBoxWithdrawFragment2.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    cashBoxWithdrawFragment2.showLoadingDialog(false, true);
                    com.transsnet.palmpay.core.base.n nVar = (com.transsnet.palmpay.core.base.n) it;
                    ToastUtils.showLong(nVar.f27358a, new Object[0]);
                    nVar.getClass();
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2 instanceof com.transsnet.palmpay.core.base.o) {
                    cashBoxWithdrawFragment2.showLoadingDialog(true, true);
                } else if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                    cashBoxWithdrawFragment2.showLoadingDialog(false, true);
                    CreateCashBoxOrderResp createCashBoxOrderResp = (CreateCashBoxOrderResp) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                    if (createCashBoxOrderResp.isSuccess()) {
                        CashBoxWithdrawFragment.a aVar = CashBoxWithdrawFragment.f32442H;
                        androidx.fragment.app.E e10 = cashBoxWithdrawFragment.f27319c;
                        Intrinsics.f(e10, "null cannot be cast to non-null type com.transsnet.palmpay.core.base.BaseActivity");
                        C0751z c0751z = new C0751z((BaseActivity) e10, 1);
                        CreateCashBoxOrderResp.CreateCashBoxOrderResult data2 = createCashBoxOrderResp.getData();
                        c0751z.f4971b = data2 != null ? data2.getOrderId() : null;
                        CreateCashBoxOrderResp.CreateCashBoxOrderResult data3 = createCashBoxOrderResp.getData();
                        c0751z.c(data3 != null ? data3.getPrincipal() : null);
                        c0751z.f4976g = "1";
                        c0751z.f4977h = TransType.TRANS_TYPE_BULK_DISBURSEMENT;
                        c0751z.f4972c = TransType.TRANS_TYPE_CASH_BOX_WITHDRAW;
                        c0751z.d();
                    } else {
                        String respCode = createCashBoxOrderResp.getRespCode();
                        Intrinsics.checkNotNullExpressionValue(respCode, "getRespCode(...)");
                        String respMsg = createCashBoxOrderResp.getRespMsg();
                        CashBoxWithdrawFragment.a aVar2 = CashBoxWithdrawFragment.f32442H;
                        if ("CFRONT_800078".equals(respCode) || "33000039".equals(respCode)) {
                            CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, new com.transsnet.palmpay.custom_view.dialog.v(cashBoxWithdrawFragment.getString(Jc.f.mm_limit_exceeds)), new com.transsnet.palmpay.custom_view.dialog.v(respMsg, 14.0f, L6.b.ppColorTextNormal), new com.transsnet.palmpay.custom_view.dialog.c(cashBoxWithdrawFragment.getString(Jc.f.mm_action_exit)), new com.transsnet.palmpay.custom_view.dialog.c(cashBoxWithdrawFragment.getString(Jc.f.mm_action_upgrade), new com.transsnet.palmpay.core.ui.activity.T(24)), null, 16, null);
                            androidx.fragment.app.Z childFragmentManager = cashBoxWithdrawFragment.getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                            commonTipsDialogFragmentCreateDialog$default.show(childFragmentManager, "showCommonTipsDialog");
                        } else if ("CFRONT_800081".equals(respCode) || "33000040".equals(respCode)) {
                            CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default2 = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, new com.transsnet.palmpay.custom_view.dialog.v(cashBoxWithdrawFragment.getString(Jc.f.mm_limit_exceeds)), new com.transsnet.palmpay.custom_view.dialog.v(respMsg, 14.0f, L6.b.ppColorTextNormal), new com.transsnet.palmpay.custom_view.dialog.c(cashBoxWithdrawFragment.getString(Jc.f.mm_action_exit)), new com.transsnet.palmpay.custom_view.dialog.c(cashBoxWithdrawFragment.getString(Jc.f.mm_action_upgrade), new com.transsnet.palmpay.core.ui.activity.T(25)), null, 16, null);
                            androidx.fragment.app.Z childFragmentManager2 = cashBoxWithdrawFragment.getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
                            commonTipsDialogFragmentCreateDialog$default2.show(childFragmentManager2, "showCommonTipsDialog");
                        } else if ("14003106".equals(respCode)) {
                            String string = cashBoxWithdrawFragment.getResources().getString(Jc.f.mm_capped_title);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            cashBoxWithdrawFragment.v(string, "capped");
                        } else if ("14003107".equals(respCode)) {
                            String string2 = cashBoxWithdrawFragment.getResources().getString(Jc.f.mm_frozen_title);
                            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                            cashBoxWithdrawFragment.v(string2, "frozen");
                        } else if ("14003108".equals(respCode)) {
                            String string3 = cashBoxWithdrawFragment.getResources().getString(Jc.f.mm_suspended_title);
                            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                            cashBoxWithdrawFragment.v(string3, "suspended");
                        } else {
                            CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default3 = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, new com.transsnet.palmpay.custom_view.dialog.v(cashBoxWithdrawFragment.getString(p025ba.k.core_opps)), new com.transsnet.palmpay.custom_view.dialog.v(respMsg, 14.0f, L6.b.ppColorTextNormal), null, new com.transsnet.palmpay.custom_view.dialog.c(cashBoxWithdrawFragment.getString(p025ba.k.core_confirm)), null, 16, null);
                            androidx.fragment.app.Z childFragmentManager3 = cashBoxWithdrawFragment.getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "getChildFragmentManager(...)");
                            commonTipsDialogFragmentCreateDialog$default3.show(childFragmentManager3, "showCommonTipsDialog");
                        }
                    }
                } else if (it2 instanceof com.transsnet.palmpay.core.base.m) {
                    cashBoxWithdrawFragment2.showLoadingDialog(false, true);
                } else {
                    if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    cashBoxWithdrawFragment2.showLoadingDialog(false, true);
                    String str = ((com.transsnet.palmpay.core.base.n) it2).f27358a;
                    if (!TextUtils.isEmpty(str)) {
                        p220oa.h.y(cashBoxWithdrawFragment, str);
                    }
                }
                return Unit.f38893a;
        }
    }
}

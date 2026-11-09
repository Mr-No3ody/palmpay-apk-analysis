package com.transsnet.palmpay.managemoney.ui.fragment;

import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.rsp.GetAutoTransferConfigResp;
import com.transsnet.palmpay.custom_view.dialog.CommonTipsDialogFragment;
import com.transsnet.palmpay.managemoney.bean.resp.CashCouponWriteOffResp;
import com.transsnet.palmpay.managemoney.ui.dialog.CashCouponFailDialogFragment;
import com.transsnet.palmpay.managemoney.ui.dialog.CashCouponSuccessDialogFragment;
import com.transsnet.palmpay.managemoney.ui.dialog.TurnOnAutoSaveSuccessDialogFragment;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CashBoxMainFragment f32656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CashBoxMainFragment f32657c;

    public /* synthetic */ r(CashBoxMainFragment cashBoxMainFragment, CashBoxMainFragment cashBoxMainFragment2, int i7) {
        this.f32655a = i7;
        this.f32656b = cashBoxMainFragment;
        this.f32657c = cashBoxMainFragment2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f32655a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                boolean z3 = it instanceof com.transsnet.palmpay.core.base.o;
                CashBoxMainFragment cashBoxMainFragment = this.f32656b;
                if (z3) {
                    cashBoxMainFragment.showLoadingDialog(true, true);
                } else if (it instanceof com.transsnet.palmpay.core.base.p) {
                    cashBoxMainFragment.showLoadingDialog(false, true);
                    CashCouponWriteOffResp.CashCouponWriteOff data = ((CashCouponWriteOffResp) ((com.transsnet.palmpay.core.base.p) it).f27360a).getData();
                    if (data != null && data.getCouponAmount() != null && data.getCouponAmount().longValue() > 0) {
                        Integer status = data.getStatus();
                        CashBoxMainFragment cashBoxMainFragment2 = this.f32657c;
                        if (status != null && status.intValue() == 2) {
                            CashCouponSuccessDialogFragment cashCouponSuccessDialogFragmentNewInstance = CashCouponSuccessDialogFragment.f32291C.newInstance(data.getCouponAmount().longValue(), Pa.i0.T());
                            androidx.fragment.app.Z childFragmentManager = cashBoxMainFragment2.getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                            cashCouponSuccessDialogFragmentNewInstance.show(childFragmentManager, "showCongratulationsDialog");
                        } else {
                            Integer status2 = data.getStatus();
                            if (status2 != null && status2.intValue() == 3) {
                                CashCouponFailDialogFragment cashCouponFailDialogFragmentNewInstance = CashCouponFailDialogFragment.f32290C.newInstance(data.getCouponAmount().longValue(), Pa.i0.T());
                                androidx.fragment.app.Z childFragmentManager2 = cashBoxMainFragment2.getChildFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
                                cashCouponFailDialogFragmentNewInstance.show(childFragmentManager2, "showFailDialog");
                            }
                        }
                    }
                } else if (it instanceof com.transsnet.palmpay.core.base.m) {
                    cashBoxMainFragment.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    cashBoxMainFragment.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
                    ((com.transsnet.palmpay.core.base.n) it).getClass();
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                boolean z8 = it2 instanceof com.transsnet.palmpay.core.base.o;
                CashBoxMainFragment cashBoxMainFragment3 = this.f32656b;
                if (z8) {
                    cashBoxMainFragment3.showLoadingDialog(true, true);
                } else {
                    boolean z10 = it2 instanceof com.transsnet.palmpay.core.base.p;
                    CashBoxMainFragment cashBoxMainFragment4 = this.f32657c;
                    if (z10) {
                        cashBoxMainFragment3.showLoadingDialog(false, true);
                        CommonResult commonResult = (CommonResult) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                        if (commonResult.isSuccess()) {
                            TurnOnAutoSaveSuccessDialogFragment turnOnAutoSaveSuccessDialogFragmentNewInstance = TurnOnAutoSaveSuccessDialogFragment.f32326C.newInstance();
                            C1598u dialogClosedClick = C1598u.f32666a;
                            turnOnAutoSaveSuccessDialogFragmentNewInstance.getClass();
                            Intrinsics.checkNotNullParameter(dialogClosedClick, "dialogClosedClick");
                            androidx.fragment.app.Z childFragmentManager3 = cashBoxMainFragment4.getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "getChildFragmentManager(...)");
                            turnOnAutoSaveSuccessDialogFragmentNewInstance.show(childFragmentManager3, "showTurnOnAutoSaveSuccessDialog");
                            GetAutoTransferConfigResp getAutoTransferConfigResp = cashBoxMainFragment4.f32409S0;
                            if (getAutoTransferConfigResp != null) {
                                getAutoTransferConfigResp.isAutoTransfer = 1;
                            }
                            CashBoxMainFragment.x(cashBoxMainFragment4);
                            cashBoxMainFragment4.A(true);
                        } else if (Intrinsics.c(commonResult.getRespCode(), "fb_open_error_code")) {
                            String respMsg = commonResult.getRespMsg();
                            if (respMsg != null) {
                                CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, cashBoxMainFragment4.getResources().getString(Jc.f.mm_fb_open_code_title), respMsg, cashBoxMainFragment4.getResources().getString(p025ba.k.core_confirm), null, 8, null);
                                androidx.fragment.app.Z childFragmentManager4 = cashBoxMainFragment4.getChildFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(childFragmentManager4, "getChildFragmentManager(...)");
                                commonTipsDialogFragmentCreateDialog$default.show(childFragmentManager4, "showErrorDialog");
                            }
                        } else {
                            CashBoxMainFragment.w(cashBoxMainFragment4);
                        }
                    } else if (it2 instanceof com.transsnet.palmpay.core.base.m) {
                        cashBoxMainFragment3.showLoadingDialog(false, true);
                    } else {
                        if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        cashBoxMainFragment3.showLoadingDialog(false, true);
                        ((com.transsnet.palmpay.core.base.n) it2).getClass();
                        CashBoxMainFragment.w(cashBoxMainFragment4);
                    }
                }
                return Unit.f38893a;
        }
    }
}

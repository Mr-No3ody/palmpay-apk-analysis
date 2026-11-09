package com.transsnet.palmpay.managemoney.ui.fragment;

import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.custom_view.dialog.CommonTipsDialogFragment;
import com.transsnet.palmpay.managemoney.bean.resp.CashCouponWriteOffResp;
import com.transsnet.palmpay.managemoney.bean.resp.GetNewMemberConfigResp;
import com.transsnet.palmpay.managemoney.ui.activity.CashBoxMainActivity;
import com.transsnet.palmpay.managemoney.ui.dialog.CashBoxNewUserOpenDialogFragment;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsnet.palmpay.managemoney.ui.fragment.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1590l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CashBoxIntroductionFragment f32635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CashBoxIntroductionFragment f32636c;

    public /* synthetic */ C1590l(CashBoxIntroductionFragment cashBoxIntroductionFragment, CashBoxIntroductionFragment cashBoxIntroductionFragment2, int i7) {
        this.f32634a = i7;
        this.f32635b = cashBoxIntroductionFragment;
        this.f32636c = cashBoxIntroductionFragment2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Integer status;
        switch (this.f32634a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                boolean z3 = it instanceof com.transsnet.palmpay.core.base.o;
                CashBoxIntroductionFragment cashBoxIntroductionFragment = this.f32635b;
                if (z3) {
                    cashBoxIntroductionFragment.showLoadingDialog(true, true);
                } else if (it instanceof com.transsnet.palmpay.core.base.p) {
                    cashBoxIntroductionFragment.showLoadingDialog(false, true);
                    GetNewMemberConfigResp.NewMemberConfig data = ((GetNewMemberConfigResp) ((com.transsnet.palmpay.core.base.p) it).f27360a).getData();
                    CashBoxIntroductionFragment cashBoxIntroductionFragment2 = this.f32636c;
                    p355xf.t tVar = cashBoxIntroductionFragment2.f32379o;
                    p355xf.t tVar2 = cashBoxIntroductionFragment2.f32381v;
                    if (data != null) {
                        NestedScrollView nestedScrollView = (NestedScrollView) tVar2.getValue();
                        if (nestedScrollView != null) {
                            nestedScrollView.setVisibility(0);
                        }
                        LinearLayout linearLayout = (LinearLayout) tVar.getValue();
                        if (linearLayout != null) {
                            linearLayout.setVisibility(0);
                        }
                        Pa.r0.h1((ImageView) cashBoxIntroductionFragment2.f32380p.getValue(), Pa.i0.T() ? data.getDarkHeaderBannerUrl() : data.getHeaderBannerUrl(), Jc.b.mm_bg_intro_header);
                        Pa.r0.h1((ImageView) cashBoxIntroductionFragment2.t.getValue(), Pa.i0.T() ? data.getDarkBannerUrl() : data.getBannerUrl(), Jc.b.mm_bg_intro_banner);
                    } else {
                        NestedScrollView nestedScrollView2 = (NestedScrollView) tVar2.getValue();
                        if (nestedScrollView2 != null) {
                            nestedScrollView2.setVisibility(8);
                        }
                        LinearLayout linearLayout2 = (LinearLayout) tVar.getValue();
                        if (linearLayout2 != null) {
                            linearLayout2.setVisibility(8);
                        }
                    }
                } else if (it instanceof com.transsnet.palmpay.core.base.m) {
                    cashBoxIntroductionFragment.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    cashBoxIntroductionFragment.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
                }
                return Unit.f38893a;
            case 1:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                boolean z8 = it2 instanceof com.transsnet.palmpay.core.base.o;
                CashBoxIntroductionFragment cashBoxIntroductionFragment3 = this.f32635b;
                if (z8) {
                    cashBoxIntroductionFragment3.showLoadingDialog(true, true);
                } else {
                    boolean z10 = it2 instanceof com.transsnet.palmpay.core.base.p;
                    CashBoxIntroductionFragment cashBoxIntroductionFragment4 = this.f32636c;
                    if (z10) {
                        cashBoxIntroductionFragment3.showLoadingDialog(false, true);
                        CashCouponWriteOffResp.CashCouponWriteOff data2 = ((CashCouponWriteOffResp) ((com.transsnet.palmpay.core.base.p) it2).f27360a).getData();
                        if (data2 != null && (status = data2.getStatus()) != null && status.intValue() == 1 && data2.getCouponAmount() != null && data2.getCouponAmount().longValue() > 0) {
                            CashBoxNewUserOpenDialogFragment cashBoxNewUserOpenDialogFragmentNewInstance = CashBoxNewUserOpenDialogFragment.f32282L.newInstance(data2.getCouponAmount().longValue());
                            androidx.fragment.app.Z childFragmentManager = cashBoxIntroductionFragment4.getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                            cashBoxNewUserOpenDialogFragmentNewInstance.show(childFragmentManager, "showOpenDialog");
                        }
                    } else if (it2 instanceof com.transsnet.palmpay.core.base.m) {
                        cashBoxIntroductionFragment3.showLoadingDialog(false, true);
                    } else {
                        if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        cashBoxIntroductionFragment3.showLoadingDialog(false, true);
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it2).f27358a, new Object[0]);
                        String str = ((com.transsnet.palmpay.core.base.n) it2).f27358a;
                        if (!TextUtils.isEmpty(str)) {
                            p220oa.h.y(cashBoxIntroductionFragment4, str);
                        }
                    }
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it3 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                boolean z11 = it3 instanceof com.transsnet.palmpay.core.base.o;
                CashBoxIntroductionFragment cashBoxIntroductionFragment5 = this.f32635b;
                if (z11) {
                    cashBoxIntroductionFragment5.showLoadingDialog(true, true);
                } else {
                    boolean z12 = it3 instanceof com.transsnet.palmpay.core.base.p;
                    CashBoxIntroductionFragment cashBoxIntroductionFragment6 = this.f32636c;
                    if (z12) {
                        cashBoxIntroductionFragment5.showLoadingDialog(false, true);
                        CommonResult commonResult = (CommonResult) ((com.transsnet.palmpay.core.base.p) it3).f27360a;
                        if (commonResult.isSuccess()) {
                            androidx.fragment.app.E activity = cashBoxIntroductionFragment6.getActivity();
                            if (activity != null && (activity instanceof CashBoxMainActivity)) {
                                p059e1.a.X("SHOW_NEWER_TIP", true);
                                com.palmpay.lib.apm.launchcounter.util.d.F("/manage_money/cash_box_main_activity");
                                ((CashBoxMainActivity) activity).finish();
                            }
                        } else if (Intrinsics.c(commonResult.getRespCode(), "fb_open_error_code")) {
                            String respMsg = commonResult.getRespMsg();
                            if (respMsg != null) {
                                CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, cashBoxIntroductionFragment6.getResources().getString(Jc.f.mm_fb_open_code_title), respMsg, cashBoxIntroductionFragment6.getResources().getString(p025ba.k.core_confirm), null, 8, null);
                                androidx.fragment.app.Z childFragmentManager2 = cashBoxIntroductionFragment6.getChildFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
                                commonTipsDialogFragmentCreateDialog$default.show(childFragmentManager2, "showErrorDialog");
                            }
                        } else {
                            String respMsg2 = commonResult.getRespMsg();
                            if (respMsg2 != null) {
                                CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default2 = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, cashBoxIntroductionFragment6.getResources().getString(p025ba.k.core_oops), respMsg2, cashBoxIntroductionFragment6.getResources().getString(p025ba.k.core_ok1), null, 8, null);
                                androidx.fragment.app.Z childFragmentManager3 = cashBoxIntroductionFragment6.getChildFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "getChildFragmentManager(...)");
                                commonTipsDialogFragmentCreateDialog$default2.show(childFragmentManager3, "showErrorDialog");
                            }
                        }
                    } else if (it3 instanceof com.transsnet.palmpay.core.base.m) {
                        cashBoxIntroductionFragment5.showLoadingDialog(false, true);
                    } else {
                        if (!(it3 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        cashBoxIntroductionFragment5.showLoadingDialog(false, true);
                        String str2 = ((com.transsnet.palmpay.core.base.n) it3).f27358a;
                        if (!TextUtils.isEmpty(str2)) {
                            p220oa.h.y(cashBoxIntroductionFragment6, str2);
                        }
                    }
                }
                return Unit.f38893a;
        }
    }
}

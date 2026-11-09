package com.transsnet.palmpay.credit.ui.fragment;

import C0.G;
import L6.i;
import Pa.C0525w;
import Pa.i0;
import Pa.n0;
import Ya.e;
import Ya.f;
import Ya.g;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.E;
import androidx.lifecycle.AbstractC1205o;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.gson.Gson;
import com.horcrux.svg.d0;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.callback.HomeAcCallback;
import com.transsnet.palmpay.core.util.statistic.core.AutoTrackUtil;
import com.transsnet.palmpay.credit.bean.LoanHomeBottomInfo;
import com.transsnet.palmpay.credit.bean.req.CLInitReq;
import com.transsnet.palmpay.credit.bean.resp.OcApplyResultData;
import com.transsnet.palmpay.credit.bean.rsp.CLMainData;
import com.transsnet.palmpay.credit.bean.rsp.CashLoanWhitelistData;
import com.transsnet.palmpay.credit.bean.rsp.OkCardMainPageRspData;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcMainActivity;
import com.transsnet.palmpay.credit.ui.fragment.OcGuideCashOpenFragment;
import com.transsnet.palmpay.credit.view.FlexiUserEvaluationView;
import com.transsnet.palmpay.credit.view.LoanHomeBottomInfoView;
import com.transsnet.palmpay.util.AppUtils;
import com.transsnet.palmpay.util.BarUtils;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.util.ToastUtils;
import io.fastkv.n;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p025ba.k;
import p071ef.b;
import p186mb.d;
import p220oa.h;
import p221ob.c;
import p310ub.h1;
import p355xf.C2131j;
import p355xf.t;
import p382zb.C2168k;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/credit_score/oc_cash_open_guide_fragment")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/fragment/OcGuideCashOpenFragment;", "Lcom/transsnet/palmpay/credit/ui/fragment/OpenAccountBaseFragment;", "<init>", "()V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcGuideCashOpenFragment extends OpenAccountBaseFragment {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final a f30411s0 = new a(null);

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final t f30412Z;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final t f30413k0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final t f30414p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final t f30415q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final t f30416r0;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OcGuideCashOpenFragment newInstance(boolean z3) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("KEY_NEED_BACK", z3);
            OcGuideCashOpenFragment ocGuideCashOpenFragment = new OcGuideCashOpenFragment();
            ocGuideCashOpenFragment.setArguments(bundle);
            return ocGuideCashOpenFragment;
        }

        private a() {
        }
    }

    public OcGuideCashOpenFragment() {
        final int i7 = 0;
        this.f30412Z = C2131j.b(new Function0(this) { // from class: zb.J

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcGuideCashOpenFragment f44530b;

            {
                this.f44530b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcGuideCashOpenFragment ocGuideCashOpenFragment = this.f44530b;
                switch (i7) {
                    case 0:
                        OcGuideCashOpenFragment.a aVar = OcGuideCashOpenFragment.f30411s0;
                        View view = ocGuideCashOpenFragment.f27318b;
                        if (view != null) {
                            return (LoanHomeBottomInfoView) view.findViewById(e.viewLoanHomeBottomInfo);
                        }
                        return null;
                    case 1:
                        OcGuideCashOpenFragment.a aVar2 = OcGuideCashOpenFragment.f30411s0;
                        View view2 = ocGuideCashOpenFragment.f27318b;
                        if (view2 != null) {
                            return (FlexiUserEvaluationView) view2.findViewById(e.flexiUserEvalutionView);
                        }
                        return null;
                    case 2:
                        OcGuideCashOpenFragment.a aVar3 = OcGuideCashOpenFragment.f30411s0;
                        View view3 = ocGuideCashOpenFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(e.open_flexi_tv);
                        }
                        return null;
                    case 3:
                        OcGuideCashOpenFragment.a aVar4 = OcGuideCashOpenFragment.f30411s0;
                        View view4 = ocGuideCashOpenFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvAmount);
                        }
                        return null;
                    default:
                        OcGuideCashOpenFragment.a aVar5 = OcGuideCashOpenFragment.f30411s0;
                        View view5 = ocGuideCashOpenFragment.f27318b;
                        if (view5 != null) {
                            return (PpTitleBar) view5.findViewById(e.titleBar);
                        }
                        return null;
                }
            }
        });
        final int i10 = 1;
        this.f30413k0 = C2131j.b(new Function0(this) { // from class: zb.J

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcGuideCashOpenFragment f44530b;

            {
                this.f44530b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcGuideCashOpenFragment ocGuideCashOpenFragment = this.f44530b;
                switch (i10) {
                    case 0:
                        OcGuideCashOpenFragment.a aVar = OcGuideCashOpenFragment.f30411s0;
                        View view = ocGuideCashOpenFragment.f27318b;
                        if (view != null) {
                            return (LoanHomeBottomInfoView) view.findViewById(e.viewLoanHomeBottomInfo);
                        }
                        return null;
                    case 1:
                        OcGuideCashOpenFragment.a aVar2 = OcGuideCashOpenFragment.f30411s0;
                        View view2 = ocGuideCashOpenFragment.f27318b;
                        if (view2 != null) {
                            return (FlexiUserEvaluationView) view2.findViewById(e.flexiUserEvalutionView);
                        }
                        return null;
                    case 2:
                        OcGuideCashOpenFragment.a aVar3 = OcGuideCashOpenFragment.f30411s0;
                        View view3 = ocGuideCashOpenFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(e.open_flexi_tv);
                        }
                        return null;
                    case 3:
                        OcGuideCashOpenFragment.a aVar4 = OcGuideCashOpenFragment.f30411s0;
                        View view4 = ocGuideCashOpenFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvAmount);
                        }
                        return null;
                    default:
                        OcGuideCashOpenFragment.a aVar5 = OcGuideCashOpenFragment.f30411s0;
                        View view5 = ocGuideCashOpenFragment.f27318b;
                        if (view5 != null) {
                            return (PpTitleBar) view5.findViewById(e.titleBar);
                        }
                        return null;
                }
            }
        });
        final int i11 = 2;
        this.f30414p0 = C2131j.b(new Function0(this) { // from class: zb.J

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcGuideCashOpenFragment f44530b;

            {
                this.f44530b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcGuideCashOpenFragment ocGuideCashOpenFragment = this.f44530b;
                switch (i11) {
                    case 0:
                        OcGuideCashOpenFragment.a aVar = OcGuideCashOpenFragment.f30411s0;
                        View view = ocGuideCashOpenFragment.f27318b;
                        if (view != null) {
                            return (LoanHomeBottomInfoView) view.findViewById(e.viewLoanHomeBottomInfo);
                        }
                        return null;
                    case 1:
                        OcGuideCashOpenFragment.a aVar2 = OcGuideCashOpenFragment.f30411s0;
                        View view2 = ocGuideCashOpenFragment.f27318b;
                        if (view2 != null) {
                            return (FlexiUserEvaluationView) view2.findViewById(e.flexiUserEvalutionView);
                        }
                        return null;
                    case 2:
                        OcGuideCashOpenFragment.a aVar3 = OcGuideCashOpenFragment.f30411s0;
                        View view3 = ocGuideCashOpenFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(e.open_flexi_tv);
                        }
                        return null;
                    case 3:
                        OcGuideCashOpenFragment.a aVar4 = OcGuideCashOpenFragment.f30411s0;
                        View view4 = ocGuideCashOpenFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvAmount);
                        }
                        return null;
                    default:
                        OcGuideCashOpenFragment.a aVar5 = OcGuideCashOpenFragment.f30411s0;
                        View view5 = ocGuideCashOpenFragment.f27318b;
                        if (view5 != null) {
                            return (PpTitleBar) view5.findViewById(e.titleBar);
                        }
                        return null;
                }
            }
        });
        final int i12 = 3;
        this.f30415q0 = C2131j.b(new Function0(this) { // from class: zb.J

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcGuideCashOpenFragment f44530b;

            {
                this.f44530b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcGuideCashOpenFragment ocGuideCashOpenFragment = this.f44530b;
                switch (i12) {
                    case 0:
                        OcGuideCashOpenFragment.a aVar = OcGuideCashOpenFragment.f30411s0;
                        View view = ocGuideCashOpenFragment.f27318b;
                        if (view != null) {
                            return (LoanHomeBottomInfoView) view.findViewById(e.viewLoanHomeBottomInfo);
                        }
                        return null;
                    case 1:
                        OcGuideCashOpenFragment.a aVar2 = OcGuideCashOpenFragment.f30411s0;
                        View view2 = ocGuideCashOpenFragment.f27318b;
                        if (view2 != null) {
                            return (FlexiUserEvaluationView) view2.findViewById(e.flexiUserEvalutionView);
                        }
                        return null;
                    case 2:
                        OcGuideCashOpenFragment.a aVar3 = OcGuideCashOpenFragment.f30411s0;
                        View view3 = ocGuideCashOpenFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(e.open_flexi_tv);
                        }
                        return null;
                    case 3:
                        OcGuideCashOpenFragment.a aVar4 = OcGuideCashOpenFragment.f30411s0;
                        View view4 = ocGuideCashOpenFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvAmount);
                        }
                        return null;
                    default:
                        OcGuideCashOpenFragment.a aVar5 = OcGuideCashOpenFragment.f30411s0;
                        View view5 = ocGuideCashOpenFragment.f27318b;
                        if (view5 != null) {
                            return (PpTitleBar) view5.findViewById(e.titleBar);
                        }
                        return null;
                }
            }
        });
        final int i13 = 4;
        this.f30416r0 = C2131j.b(new Function0(this) { // from class: zb.J

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcGuideCashOpenFragment f44530b;

            {
                this.f44530b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcGuideCashOpenFragment ocGuideCashOpenFragment = this.f44530b;
                switch (i13) {
                    case 0:
                        OcGuideCashOpenFragment.a aVar = OcGuideCashOpenFragment.f30411s0;
                        View view = ocGuideCashOpenFragment.f27318b;
                        if (view != null) {
                            return (LoanHomeBottomInfoView) view.findViewById(e.viewLoanHomeBottomInfo);
                        }
                        return null;
                    case 1:
                        OcGuideCashOpenFragment.a aVar2 = OcGuideCashOpenFragment.f30411s0;
                        View view2 = ocGuideCashOpenFragment.f27318b;
                        if (view2 != null) {
                            return (FlexiUserEvaluationView) view2.findViewById(e.flexiUserEvalutionView);
                        }
                        return null;
                    case 2:
                        OcGuideCashOpenFragment.a aVar3 = OcGuideCashOpenFragment.f30411s0;
                        View view3 = ocGuideCashOpenFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(e.open_flexi_tv);
                        }
                        return null;
                    case 3:
                        OcGuideCashOpenFragment.a aVar4 = OcGuideCashOpenFragment.f30411s0;
                        View view4 = ocGuideCashOpenFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvAmount);
                        }
                        return null;
                    default:
                        OcGuideCashOpenFragment.a aVar5 = OcGuideCashOpenFragment.f30411s0;
                        View view5 = ocGuideCashOpenFragment.f27318b;
                        if (view5 != null) {
                            return (PpTitleBar) view5.findViewById(e.titleBar);
                        }
                        return null;
                }
            }
        });
        new ArrayList();
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return f.cs_cl_open_guide_view;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        if (this.f30369o == null) {
            u();
            Bundle arguments = getArguments();
            boolean z3 = arguments != null ? arguments.getBoolean("KEY_NEED_BACK") : false;
            PpTitleBar ppTitleBar = (PpTitleBar) this.f30416r0.getValue();
            if (ppTitleBar != null) {
                h.s(ppTitleBar, z3);
            }
        }
        LoanHomeBottomInfoView loanHomeBottomInfoView = (LoanHomeBottomInfoView) this.f30412Z.getValue();
        if (loanHomeBottomInfoView != null) {
            LoanHomeBottomInfo loanHomeBottomInfo = d.f39634e.getInstance().f39636a;
            int i7 = LoanHomeBottomInfoView.f30793c;
            loanHomeBottomInfoView.e(loanHomeBottomInfo, null, null);
        }
        return 0;
    }

    @Override // com.transsnet.palmpay.credit.ui.fragment.OcBaseFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        super.o();
        if (getContext() == null) {
            return 0;
        }
        v();
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        showLoadingDialog(true);
        c.f40268a.getInstance().getClass();
        c.a().getCashLoanNew().k(p298tf.f.f42629b).i(b.a()).subscribe(new C2168k(this, 4));
        v();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsnet.palmpay.credit.ui.fragment.OcBaseFragment
    public final void v() {
        Context context;
        final int i7 = 0;
        final int i10 = 1;
        t tVar = this.f30416r0;
        PpTitleBar ppTitleBar = (PpTitleBar) tVar.getValue();
        if (ppTitleBar != null) {
            PpTitleBar ppTitleBar2 = (PpTitleBar) tVar.getValue();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) (ppTitleBar2 != null ? ppTitleBar2.getLayoutParams() : null);
            if (layoutParams != null) {
                layoutParams.topMargin = BarUtils.getStatusBarHeight();
            } else {
                layoutParams = null;
            }
            ppTitleBar.setLayoutParams(layoutParams);
        }
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("oc_guide_data") : null;
        if (!TextUtils.isEmpty(string)) {
            this.f30369o = (OkCardMainPageRspData) d0.l(OkCardMainPageRspData.class, string);
        }
        HashMap map = new HashMap();
        boolean zHasLogin = BaseApplication.hasLogin();
        t tVar2 = this.f30414p0;
        if (zHasLogin) {
            OkCardMainPageRspData okCardMainPageRspData = this.f30369o;
            if (Intrinsics.c(okCardMainPageRspData != null ? okCardMainPageRspData.getUserTag() : null, "BLACK_LIST_USER")) {
                map.put("screen_name", "OcGuideCashOpenFragment_black_list");
            } else {
                Integer num = this.f30368j;
                if (num != null && num.intValue() == 7) {
                    map.put("screen_name", "OcGuideCashOpenFragment_can_active");
                } else {
                    OkCardMainPageRspData okCardMainPageRspData2 = this.f30369o;
                    if (Intrinsics.c(okCardMainPageRspData2 != null ? okCardMainPageRspData2.getNoLockUserWhitelist() : null, "1")) {
                        map.put("screen_name", "OcGuideCashOpenFragment_can_active");
                    } else {
                        map.put("screen_name", "OcGuideCashOpenFragment_no_lock_no_white_list");
                    }
                }
            }
        } else {
            TextView textView = (TextView) tVar2.getValue();
            if (textView != null) {
                textView.setText(getString(g.cs_login_view));
            }
            map.put("screen_name", "OcGuideCashOpenFragment_visitor");
        }
        FlexiUserEvaluationView flexiUserEvaluationView = (FlexiUserEvaluationView) this.f30413k0.getValue();
        if (flexiUserEvaluationView != null) {
            AbstractC1205o lifecycle = getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
            flexiUserEvaluationView.setLifecycleRegistry(lifecycle);
        }
        PpTitleBar ppTitleBar3 = (PpTitleBar) tVar.getValue();
        if (ppTitleBar3 != null) {
            ppTitleBar3.setBackButtonClickListener(new View.OnClickListener(this) { // from class: zb.K

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OcGuideCashOpenFragment f44532b;

                {
                    this.f44532b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CLMainData cLMainData;
                    CLMainData cLMainData2;
                    Integer remainingDays;
                    CashLoanWhitelistData cashLoanWhitelistData;
                    Integer busiType;
                    CashLoanWhitelistData cashLoanWhitelistData2;
                    Integer busiType2;
                    Integer shuntType;
                    Integer okCardAccountStatus;
                    OcGuideCashOpenFragment ocGuideCashOpenFragment = this.f44532b;
                    switch (i7) {
                        case 0:
                            OcGuideCashOpenFragment.a aVar = OcGuideCashOpenFragment.f30411s0;
                            E activity = ocGuideCashOpenFragment.getActivity();
                            if (activity != null) {
                                activity.onBackPressed();
                            }
                            break;
                        default:
                            OcGuideCashOpenFragment.a aVar2 = OcGuideCashOpenFragment.f30411s0;
                            if (view.getId() == e.open_flexi_tv) {
                                if (ocGuideCashOpenFragment.getContext() != null) {
                                    CLMainData cLMainData3 = ocGuideCashOpenFragment.t;
                                    if (cLMainData3 != null && (okCardAccountStatus = cLMainData3.getOkCardAccountStatus()) != null && okCardAccountStatus.intValue() == 1) {
                                        Context contextRequireContext = ocGuideCashOpenFragment.requireContext();
                                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                        n.O(contextRequireContext, 0, Integer.valueOf(g.cs_flexi_overdue), null, Integer.valueOf(Ya.d.cs_oc_finance_tip_warn_icon_black), null, null, ocGuideCashOpenFragment.getString(g.cs_borrow_when_flexi_bill_overdue), null, ocGuideCashOpenFragment.getString(g.cs_cl_oc_repay), new h1(17), null, null, null, null, false, i.ppFlexiCashDialogTheme, 8124789);
                                        break;
                                    } else {
                                        CLMainData cLMainData4 = ocGuideCashOpenFragment.t;
                                        if ((cLMainData4 == null || (shuntType = cLMainData4.getShuntType()) == null || shuntType.intValue() != 2) && (((cLMainData = ocGuideCashOpenFragment.t) == null || (cashLoanWhitelistData2 = cLMainData.getCashLoanWhitelistData()) == null || (busiType2 = cashLoanWhitelistData2.getBusiType()) == null || busiType2.intValue() != 12) && ((cLMainData2 = ocGuideCashOpenFragment.t) == null || (cashLoanWhitelistData = cLMainData2.getCashLoanWhitelistData()) == null || (busiType = cashLoanWhitelistData.getBusiType()) == null || busiType.intValue() != 13))) {
                                            CLMainData cLMainData5 = ocGuideCashOpenFragment.t;
                                            if (((cLMainData5 == null || (remainingDays = cLMainData5.getRemainingDays()) == null) ? 0 : remainingDays.intValue()) > 0) {
                                                CLMainData cLMainData6 = ocGuideCashOpenFragment.t;
                                                String str = "Please try again after " + (cLMainData6 != null ? cLMainData6.getRemainingDays() : null) + " days";
                                                Integer num2 = ocGuideCashOpenFragment.f30368j;
                                                ARouter.getInstance().build("/credit_score/ol_open_result_activity").withString("cl_open_result", ((Gson) C0525w.f().f7166b).toJson(new OcApplyResultData("", 2, 0L, 0L, 0L, str, Integer.valueOf(num2 != null ? num2.intValue() : 2), "", null))).navigation();
                                            } else {
                                                p186mb.b.f39631b.getInstance().f39633a = 2;
                                                ocGuideCashOpenFragment.showLoadingDialog(true);
                                                G.h(c.f40268a).clInitApply(new CLInitReq(ocGuideCashOpenFragment.f30501v, ocGuideCashOpenFragment.f30502w, 2, null, Boolean.FALSE, null, 32, null)).k(p298tf.f.f42629b).i(b.a()).subscribe(new m0(ocGuideCashOpenFragment, 0));
                                            }
                                        } else if (AppUtils.isAppInstalled("com.legend.cash")) {
                                            i0.Z(ocGuideCashOpenFragment.getContext());
                                        } else {
                                            CLMainData cLMainData7 = ocGuideCashOpenFragment.t;
                                            if (TextUtils.isEmpty(cLMainData7 != null ? cLMainData7.getCashAppDownloadUrl() : null)) {
                                                ToastUtils.showLong("download Flexi Cash url is null", new Object[0]);
                                            } else {
                                                CLMainData cLMainData8 = ocGuideCashOpenFragment.t;
                                                i0.c0(cLMainData8 != null ? cLMainData8.getCashAppDownloadUrl() : null);
                                            }
                                        }
                                    }
                                }
                                n0 n0VarG = n0.g();
                                TextView textView2 = (TextView) ocGuideCashOpenFragment.f30414p0.getValue();
                                n0VarG.m("OcGuideCashOpenFragment_element_click", String.valueOf(textView2 != null ? textView2.getText() : null), "");
                            }
                            break;
                    }
                }
            });
        }
        h.q(new View.OnClickListener(this) { // from class: zb.K

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcGuideCashOpenFragment f44532b;

            {
                this.f44532b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CLMainData cLMainData;
                CLMainData cLMainData2;
                Integer remainingDays;
                CashLoanWhitelistData cashLoanWhitelistData;
                Integer busiType;
                CashLoanWhitelistData cashLoanWhitelistData2;
                Integer busiType2;
                Integer shuntType;
                Integer okCardAccountStatus;
                OcGuideCashOpenFragment ocGuideCashOpenFragment = this.f44532b;
                switch (i10) {
                    case 0:
                        OcGuideCashOpenFragment.a aVar = OcGuideCashOpenFragment.f30411s0;
                        E activity = ocGuideCashOpenFragment.getActivity();
                        if (activity != null) {
                            activity.onBackPressed();
                        }
                        break;
                    default:
                        OcGuideCashOpenFragment.a aVar2 = OcGuideCashOpenFragment.f30411s0;
                        if (view.getId() == e.open_flexi_tv) {
                            if (ocGuideCashOpenFragment.getContext() != null) {
                                CLMainData cLMainData3 = ocGuideCashOpenFragment.t;
                                if (cLMainData3 != null && (okCardAccountStatus = cLMainData3.getOkCardAccountStatus()) != null && okCardAccountStatus.intValue() == 1) {
                                    Context contextRequireContext = ocGuideCashOpenFragment.requireContext();
                                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                    n.O(contextRequireContext, 0, Integer.valueOf(g.cs_flexi_overdue), null, Integer.valueOf(Ya.d.cs_oc_finance_tip_warn_icon_black), null, null, ocGuideCashOpenFragment.getString(g.cs_borrow_when_flexi_bill_overdue), null, ocGuideCashOpenFragment.getString(g.cs_cl_oc_repay), new h1(17), null, null, null, null, false, i.ppFlexiCashDialogTheme, 8124789);
                                    break;
                                } else {
                                    CLMainData cLMainData4 = ocGuideCashOpenFragment.t;
                                    if ((cLMainData4 == null || (shuntType = cLMainData4.getShuntType()) == null || shuntType.intValue() != 2) && (((cLMainData = ocGuideCashOpenFragment.t) == null || (cashLoanWhitelistData2 = cLMainData.getCashLoanWhitelistData()) == null || (busiType2 = cashLoanWhitelistData2.getBusiType()) == null || busiType2.intValue() != 12) && ((cLMainData2 = ocGuideCashOpenFragment.t) == null || (cashLoanWhitelistData = cLMainData2.getCashLoanWhitelistData()) == null || (busiType = cashLoanWhitelistData.getBusiType()) == null || busiType.intValue() != 13))) {
                                        CLMainData cLMainData5 = ocGuideCashOpenFragment.t;
                                        if (((cLMainData5 == null || (remainingDays = cLMainData5.getRemainingDays()) == null) ? 0 : remainingDays.intValue()) > 0) {
                                            CLMainData cLMainData6 = ocGuideCashOpenFragment.t;
                                            String str = "Please try again after " + (cLMainData6 != null ? cLMainData6.getRemainingDays() : null) + " days";
                                            Integer num2 = ocGuideCashOpenFragment.f30368j;
                                            ARouter.getInstance().build("/credit_score/ol_open_result_activity").withString("cl_open_result", ((Gson) C0525w.f().f7166b).toJson(new OcApplyResultData("", 2, 0L, 0L, 0L, str, Integer.valueOf(num2 != null ? num2.intValue() : 2), "", null))).navigation();
                                        } else {
                                            p186mb.b.f39631b.getInstance().f39633a = 2;
                                            ocGuideCashOpenFragment.showLoadingDialog(true);
                                            G.h(c.f40268a).clInitApply(new CLInitReq(ocGuideCashOpenFragment.f30501v, ocGuideCashOpenFragment.f30502w, 2, null, Boolean.FALSE, null, 32, null)).k(p298tf.f.f42629b).i(b.a()).subscribe(new m0(ocGuideCashOpenFragment, 0));
                                        }
                                    } else if (AppUtils.isAppInstalled("com.legend.cash")) {
                                        i0.Z(ocGuideCashOpenFragment.getContext());
                                    } else {
                                        CLMainData cLMainData7 = ocGuideCashOpenFragment.t;
                                        if (TextUtils.isEmpty(cLMainData7 != null ? cLMainData7.getCashAppDownloadUrl() : null)) {
                                            ToastUtils.showLong("download Flexi Cash url is null", new Object[0]);
                                        } else {
                                            CLMainData cLMainData8 = ocGuideCashOpenFragment.t;
                                            i0.c0(cLMainData8 != null ? cLMainData8.getCashAppDownloadUrl() : null);
                                        }
                                    }
                                }
                            }
                            n0 n0VarG = n0.g();
                            TextView textView2 = (TextView) ocGuideCashOpenFragment.f30414p0.getValue();
                            n0VarG.m("OcGuideCashOpenFragment_element_click", String.valueOf(textView2 != null ? textView2.getText() : null), "");
                        }
                        break;
                }
            }
        }, (TextView) tVar2.getValue());
        AutoTrackUtil.trackActivityProperties(getActivity(), map);
        if (SPUtils.getInstance().getBoolean("has_show_company_dialog") || (context = getContext()) == 0) {
            return;
        }
        O6.c cVar = new O6.c(context);
        cVar.f6596b = O6.d.f(getString(g.cs_oc_disclaimer));
        cVar.f6598d = getString(g.cs_oc_company_dialog_content);
        cVar.d(k.core_got_it, null);
        O6.d dVarA = cVar.a();
        if (getActivity() instanceof OcMainActivity) {
            dVarA.show();
        } else if (getActivity() instanceof HomeAcCallback) {
            ((HomeAcCallback) context).showDialog(dVarA, 93);
        }
        SPUtils.getInstance().put("has_show_company_dialog", true);
    }
}

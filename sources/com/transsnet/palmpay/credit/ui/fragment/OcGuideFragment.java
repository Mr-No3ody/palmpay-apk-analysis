package com.transsnet.palmpay.credit.ui.fragment;

import O6.c;
import Pa.r0;
import Ya.e;
import Ya.f;
import Ya.g;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1205o;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.horcrux.svg.d0;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.callback.HomeAcCallback;
import com.transsnet.palmpay.core.util.statistic.core.AutoTrackUtil;
import com.transsnet.palmpay.credit.bean.LoanHomeBottomInfo;
import com.transsnet.palmpay.credit.bean.rsp.OkCardMainPageRspData;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcMainActivity;
import com.transsnet.palmpay.credit.ui.fragment.OcGuideFragment;
import com.transsnet.palmpay.credit.view.FlexiUserEvaluationView;
import com.transsnet.palmpay.credit.view.LoanHomeBottomInfoView;
import com.transsnet.palmpay.util.BarUtils;
import com.transsnet.palmpay.util.SPUtils;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;
import p186mb.d;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;
import p382zb.M;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/credit_score/oc_guide_fragment")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/fragment/OcGuideFragment;", "Lcom/transsnet/palmpay/credit/ui/fragment/OcBaseFragment;", "<init>", "()V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcGuideFragment extends OcBaseFragment {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ int f30422H = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f30423A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final t f30424B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final t f30425C;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f30426v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f30427w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    public OcGuideFragment() {
        final int i7 = 0;
        this.f30426v = C2131j.b(new Function0(this) { // from class: zb.L

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcGuideFragment f44534b;

            {
                this.f44534b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcGuideFragment ocGuideFragment = this.f44534b;
                switch (i7) {
                    case 0:
                        int i10 = OcGuideFragment.f30422H;
                        View view = ocGuideFragment.f27318b;
                        if (view != null) {
                            return (LoanHomeBottomInfoView) view.findViewById(e.viewLoanHomeBottomInfo);
                        }
                        return null;
                    case 1:
                        int i11 = OcGuideFragment.f30422H;
                        View view2 = ocGuideFragment.f27318b;
                        if (view2 != null) {
                            return (FlexiUserEvaluationView) view2.findViewById(e.flexiUserEvalutionView);
                        }
                        return null;
                    case 2:
                        int i12 = OcGuideFragment.f30422H;
                        View view3 = ocGuideFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(e.open_flexi_tv);
                        }
                        return null;
                    case 3:
                        int i13 = OcGuideFragment.f30422H;
                        View view4 = ocGuideFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvAmount);
                        }
                        return null;
                    default:
                        int i14 = OcGuideFragment.f30422H;
                        View view5 = ocGuideFragment.f27318b;
                        if (view5 != null) {
                            return (PpTitleBar) view5.findViewById(e.titleBar);
                        }
                        return null;
                }
            }
        });
        final int i10 = 1;
        this.f30427w = C2131j.b(new Function0(this) { // from class: zb.L

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcGuideFragment f44534b;

            {
                this.f44534b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcGuideFragment ocGuideFragment = this.f44534b;
                switch (i10) {
                    case 0:
                        int i11 = OcGuideFragment.f30422H;
                        View view = ocGuideFragment.f27318b;
                        if (view != null) {
                            return (LoanHomeBottomInfoView) view.findViewById(e.viewLoanHomeBottomInfo);
                        }
                        return null;
                    case 1:
                        int i12 = OcGuideFragment.f30422H;
                        View view2 = ocGuideFragment.f27318b;
                        if (view2 != null) {
                            return (FlexiUserEvaluationView) view2.findViewById(e.flexiUserEvalutionView);
                        }
                        return null;
                    case 2:
                        int i13 = OcGuideFragment.f30422H;
                        View view3 = ocGuideFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(e.open_flexi_tv);
                        }
                        return null;
                    case 3:
                        int i14 = OcGuideFragment.f30422H;
                        View view4 = ocGuideFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvAmount);
                        }
                        return null;
                    default:
                        int i15 = OcGuideFragment.f30422H;
                        View view5 = ocGuideFragment.f27318b;
                        if (view5 != null) {
                            return (PpTitleBar) view5.findViewById(e.titleBar);
                        }
                        return null;
                }
            }
        });
        final int i11 = 2;
        this.f30423A = C2131j.b(new Function0(this) { // from class: zb.L

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcGuideFragment f44534b;

            {
                this.f44534b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcGuideFragment ocGuideFragment = this.f44534b;
                switch (i11) {
                    case 0:
                        int i12 = OcGuideFragment.f30422H;
                        View view = ocGuideFragment.f27318b;
                        if (view != null) {
                            return (LoanHomeBottomInfoView) view.findViewById(e.viewLoanHomeBottomInfo);
                        }
                        return null;
                    case 1:
                        int i13 = OcGuideFragment.f30422H;
                        View view2 = ocGuideFragment.f27318b;
                        if (view2 != null) {
                            return (FlexiUserEvaluationView) view2.findViewById(e.flexiUserEvalutionView);
                        }
                        return null;
                    case 2:
                        int i14 = OcGuideFragment.f30422H;
                        View view3 = ocGuideFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(e.open_flexi_tv);
                        }
                        return null;
                    case 3:
                        int i15 = OcGuideFragment.f30422H;
                        View view4 = ocGuideFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvAmount);
                        }
                        return null;
                    default:
                        int i16 = OcGuideFragment.f30422H;
                        View view5 = ocGuideFragment.f27318b;
                        if (view5 != null) {
                            return (PpTitleBar) view5.findViewById(e.titleBar);
                        }
                        return null;
                }
            }
        });
        final int i12 = 3;
        this.f30424B = C2131j.b(new Function0(this) { // from class: zb.L

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcGuideFragment f44534b;

            {
                this.f44534b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcGuideFragment ocGuideFragment = this.f44534b;
                switch (i12) {
                    case 0:
                        int i13 = OcGuideFragment.f30422H;
                        View view = ocGuideFragment.f27318b;
                        if (view != null) {
                            return (LoanHomeBottomInfoView) view.findViewById(e.viewLoanHomeBottomInfo);
                        }
                        return null;
                    case 1:
                        int i14 = OcGuideFragment.f30422H;
                        View view2 = ocGuideFragment.f27318b;
                        if (view2 != null) {
                            return (FlexiUserEvaluationView) view2.findViewById(e.flexiUserEvalutionView);
                        }
                        return null;
                    case 2:
                        int i15 = OcGuideFragment.f30422H;
                        View view3 = ocGuideFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(e.open_flexi_tv);
                        }
                        return null;
                    case 3:
                        int i16 = OcGuideFragment.f30422H;
                        View view4 = ocGuideFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvAmount);
                        }
                        return null;
                    default:
                        int i17 = OcGuideFragment.f30422H;
                        View view5 = ocGuideFragment.f27318b;
                        if (view5 != null) {
                            return (PpTitleBar) view5.findViewById(e.titleBar);
                        }
                        return null;
                }
            }
        });
        final int i13 = 4;
        this.f30425C = C2131j.b(new Function0(this) { // from class: zb.L

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcGuideFragment f44534b;

            {
                this.f44534b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcGuideFragment ocGuideFragment = this.f44534b;
                switch (i13) {
                    case 0:
                        int i14 = OcGuideFragment.f30422H;
                        View view = ocGuideFragment.f27318b;
                        if (view != null) {
                            return (LoanHomeBottomInfoView) view.findViewById(e.viewLoanHomeBottomInfo);
                        }
                        return null;
                    case 1:
                        int i15 = OcGuideFragment.f30422H;
                        View view2 = ocGuideFragment.f27318b;
                        if (view2 != null) {
                            return (FlexiUserEvaluationView) view2.findViewById(e.flexiUserEvalutionView);
                        }
                        return null;
                    case 2:
                        int i16 = OcGuideFragment.f30422H;
                        View view3 = ocGuideFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(e.open_flexi_tv);
                        }
                        return null;
                    case 3:
                        int i17 = OcGuideFragment.f30422H;
                        View view4 = ocGuideFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvAmount);
                        }
                        return null;
                    default:
                        int i18 = OcGuideFragment.f30422H;
                        View view5 = ocGuideFragment.f27318b;
                        if (view5 != null) {
                            return (PpTitleBar) view5.findViewById(e.titleBar);
                        }
                        return null;
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return f.cs_oc_open_guide_view;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        if (this.f30369o == null) {
            u();
        }
        Bundle arguments = getArguments();
        boolean z3 = arguments != null ? arguments.getBoolean("KEY_NEED_BACK") : false;
        PpTitleBar ppTitleBar = (PpTitleBar) this.f30425C.getValue();
        if (ppTitleBar != null) {
            h.s(ppTitleBar, z3);
        }
        LoanHomeBottomInfoView loanHomeBottomInfoView = (LoanHomeBottomInfoView) this.f30426v.getValue();
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
        if (getContext() != null) {
            v();
        }
        FlexiUserEvaluationView flexiUserEvaluationView = (FlexiUserEvaluationView) this.f30427w.getValue();
        if (flexiUserEvaluationView != null) {
            AbstractC1205o lifecycle = getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
            flexiUserEvaluationView.setLifecycleRegistry(lifecycle);
        }
        PpTitleBar ppTitleBar = (PpTitleBar) this.f30425C.getValue();
        if (ppTitleBar == null) {
            return 0;
        }
        ppTitleBar.setBackButtonClickListener(new M(this, 0));
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsnet.palmpay.credit.ui.fragment.OcBaseFragment
    public final void v() {
        Integer flexiRemainingDays;
        Context context;
        t tVar = this.f30425C;
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
        TextView textView = (TextView) this.f30424B.getValue();
        if (textView != null) {
            textView.setText(r0.A(15000000L));
        }
        HashMap map = new HashMap();
        boolean zHasLogin = BaseApplication.hasLogin();
        t tVar2 = this.f30423A;
        if (zHasLogin) {
            OkCardMainPageRspData okCardMainPageRspData = this.f30369o;
            if (((okCardMainPageRspData == null || (flexiRemainingDays = okCardMainPageRspData.getFlexiRemainingDays()) == null) ? 0 : flexiRemainingDays.intValue()) > 0) {
                TextView textView2 = (TextView) tVar2.getValue();
                if (textView2 != null) {
                    textView2.setText(getString(g.cs_view_credit_result));
                }
            } else {
                TextView textView3 = (TextView) tVar2.getValue();
                if (textView3 != null) {
                    textView3.setText(getString(g.cs_oc_get_flexi_credit_limit));
                }
            }
            OkCardMainPageRspData okCardMainPageRspData2 = this.f30369o;
            if (Intrinsics.c(okCardMainPageRspData2 != null ? okCardMainPageRspData2.getUserTag() : null, "BLACK_LIST_USER")) {
                map.put("screen_name", "OcGuideFragment_black_list");
            } else {
                Integer num = this.f30368j;
                if (num != null && num.intValue() == 7) {
                    map.put("screen_name", "OcGuideFragment_can_active");
                } else {
                    OkCardMainPageRspData okCardMainPageRspData3 = this.f30369o;
                    if (Intrinsics.c(okCardMainPageRspData3 != null ? okCardMainPageRspData3.getNoLockUserWhitelist() : null, "1")) {
                        map.put("screen_name", "OcGuideFragment_can_active");
                    } else {
                        map.put("screen_name", "OcGuideFragment_no_lock_no_white_list");
                    }
                }
            }
        } else {
            TextView textView4 = (TextView) tVar2.getValue();
            if (textView4 != null) {
                textView4.setText(getString(g.cs_login_view));
            }
            map.put("screen_name", "OcGuideFragment_visitor");
        }
        TextView textView5 = (TextView) tVar2.getValue();
        if (textView5 != null) {
            h.l(new M(this, 1), textView5);
        }
        AutoTrackUtil.trackActivityProperties(getActivity(), map);
        if (SPUtils.getInstance().getBoolean("has_show_company_dialog") || (context = getContext()) == 0) {
            return;
        }
        c cVar = new c(context);
        cVar.f6596b = O6.d.f(getString(g.cs_oc_disclaimer));
        cVar.f6598d = getString(g.cs_oc_company_dialog_content);
        cVar.d(k.core_got_it, null);
        O6.d dVarA = cVar.a();
        if (getActivity() instanceof OcMainActivity) {
            dVarA.show();
        } else {
            ((HomeAcCallback) context).showDialog(dVarA, 93);
        }
        SPUtils.getInstance().put("has_show_company_dialog", true);
    }
}

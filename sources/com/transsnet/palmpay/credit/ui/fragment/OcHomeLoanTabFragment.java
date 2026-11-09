package com.transsnet.palmpay.credit.ui.fragment;

import C0.G;
import F6.d;
import G9.i;
import Jb.C0357p;
import Pa.C0525w;
import Ya.e;
import Ya.f;
import Ya.g;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Z;
import androidx.lifecycle.F;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.gson.Gson;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmFragment;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.LocationRecord;
import com.transsnet.palmpay.core.bean.PalmPayLatLng;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.message.PushMessage;
import com.transsnet.palmpay.credit.bean.LoanHomeDataInfo;
import com.transsnet.palmpay.credit.bean.ProductContentInfo;
import com.transsnet.palmpay.credit.handler.MultiLoanPopupHost;
import com.transsnet.palmpay.credit.ui.fragment.OcHomeLoanTabFragment;
import com.transsnet.palmpay.credit.viewmodel.OcHomeFinanceViewModel;
import com.transsnet.palmpay.util.PermissionUtils;
import com.transsnet.palmpay.util.SPUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.c;
import org.jetbrains.annotations.Nullable;
import p177m.j;
import p220oa.h;
import p284sb.C2023v;
import p355xf.C2131j;
import p355xf.t;
import p369yd.p;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/credit_score/oc_home_loan_tab_fragment")
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/fragment/OcHomeLoanTabFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmFragment;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "Lcom/transsnet/palmpay/credit/handler/MultiLoanPopupHost;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/PushMessage;", "pushMessage", "", "onReceivePushMessage", "(Lcom/transsnet/palmpay/core/bean/message/PushMessage;)V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOcHomeLoanTabFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OcHomeLoanTabFragment.kt\ncom/transsnet/palmpay/credit/ui/fragment/OcHomeLoanTabFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,372:1\n115#2,8:373\n145#2:381\n*S KotlinDebug\n*F\n+ 1 OcHomeLoanTabFragment.kt\ncom/transsnet/palmpay/credit/ui/fragment/OcHomeLoanTabFragment\n*L\n114#1:373,8\n114#1:381\n*E\n"})
public final class OcHomeLoanTabFragment extends BaseMvvmFragment<BaseViewModel> implements MultiLoanPopupHost {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f30430v = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Fragment f30431j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LoanHomeDataInfo f30432o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f30433p = C2131j.b(new p325vb.a(this, 7));
    public final androidx.activity.result.a t;

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

    public OcHomeLoanTabFragment() {
        androidx.activity.result.a aVarRegisterForActivityResult = registerForActivityResult(new j(), new i(this, 15));
        Intrinsics.checkNotNullExpressionValue(aVarRegisterForActivityResult, "registerForActivityResult(...)");
        this.t = aVarRegisterForActivityResult;
    }

    @Override // com.transsnet.palmpay.credit.handler.MultiLoanPopupHost
    public final ProductContentInfo findInstallmentProductForMultiLoanPopup() {
        List<ProductContentInfo> list;
        F f10;
        LoanHomeDataInfo loanHomeDataInfo;
        LoanHomeDataInfo loanHomeDataInfo2 = this.f30432o;
        Object obj = null;
        if (loanHomeDataInfo2 == null || (list = loanHomeDataInfo2.productContentInfo) == null) {
            OcHomeFinanceViewModel ocHomeFinanceViewModelU = u();
            list = (ocHomeFinanceViewModelU == null || (f10 = ocHomeFinanceViewModelU.f30912e) == null || (loanHomeDataInfo = (LoanHomeDataInfo) f10.d()) == null) ? null : loanHomeDataInfo.productContentInfo;
        }
        if (list == null) {
            return null;
        }
        for (Object obj2 : list) {
            Integer num = ((ProductContentInfo) obj2).accountType;
            if (num != null && num.intValue() == 9) {
                obj = obj2;
                break;
            }
        }
        return (ProductContentInfo) obj;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return f.cs_fragment_home_loan;
    }

    @Override // com.transsnet.palmpay.credit.handler.MultiLoanPopupHost
    public final boolean isNewLoanHomeForMultiLoanPopup() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        F f10;
        F f11;
        OcHomeFinanceViewModel ocHomeFinanceViewModelU = u();
        if (ocHomeFinanceViewModelU != null && (f11 = ocHomeFinanceViewModelU.f30912e) != null) {
            final int i7 = 0;
            f11.e(getViewLifecycleOwner(), new C2023v(new Function1(this) { // from class: zb.O

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OcHomeLoanTabFragment f44540b;

                {
                    this.f44540b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    OcHomeFinanceViewModel ocHomeFinanceViewModelU2;
                    Fragment fragment = null;
                    OcHomeLoanTabFragment ocHomeLoanTabFragment = this.f44540b;
                    switch (i7) {
                        case 0:
                            LoanHomeDataInfo loanHomeDataInfo = (LoanHomeDataInfo) obj;
                            if (loanHomeDataInfo != null) {
                                ocHomeLoanTabFragment.f30432o = loanHomeDataInfo;
                                try {
                                    Fragment fragmentD = ocHomeLoanTabFragment.getChildFragmentManager().D(e.fin_fl);
                                    if (fragmentD != null && "/credit_score/oc_home_finance_fragment".equals(fragmentD.getTag())) {
                                        fragment = fragmentD;
                                    }
                                    if (fragment != null) {
                                        c.b().f(new MessageEvent(MessageEvent.EVENT_OC_REFRESH_LOAN_HOME_DATA, ((Gson) C0525w.f().f7166b).toJson(loanHomeDataInfo)));
                                    } else {
                                        Object objNavigation = ARouter.getInstance().build("/credit_score/oc_home_finance_fragment").navigation();
                                        Intrinsics.f(objNavigation, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
                                        Fragment fragment2 = (Fragment) objNavigation;
                                        Bundle bundle = new Bundle();
                                        bundle.putString("home_loan_data", ((Gson) C0525w.f().f7166b).toJson(loanHomeDataInfo));
                                        fragment2.setArguments(bundle);
                                        Z childFragmentManager = ocHomeLoanTabFragment.getChildFragmentManager();
                                        childFragmentManager.getClass();
                                        C1161a c1161a = new C1161a(childFragmentManager);
                                        c1161a.e(e.fin_fl, fragment2, "/credit_score/oc_home_finance_fragment");
                                        c1161a.h(true);
                                        ocHomeLoanTabFragment.f30431j = fragment2;
                                    }
                                } catch (Exception e10) {
                                    e10.printStackTrace();
                                }
                            } else {
                                ocHomeLoanTabFragment.f30432o = null;
                                ocHomeLoanTabFragment.v();
                            }
                            break;
                        default:
                            int i10 = OcHomeLoanTabFragment.f30430v;
                            if (Intrinsics.c((Boolean) obj, Boolean.TRUE) && (ocHomeFinanceViewModelU2 = ocHomeLoanTabFragment.u()) != null) {
                                p140j8.f.s(ocHomeFinanceViewModelU2, new C0357p(1, null), ocHomeFinanceViewModelU2.f30909C, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                            }
                            break;
                    }
                    return Unit.f38893a;
                }
            }, 20));
        }
        OcHomeFinanceViewModel ocHomeFinanceViewModelU2 = u();
        if (ocHomeFinanceViewModelU2 != null && (f10 = ocHomeFinanceViewModelU2.f30914g) != null) {
            final int i10 = 1;
            f10.e(getViewLifecycleOwner(), new C2023v(new Function1(this) { // from class: zb.O

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OcHomeLoanTabFragment f44540b;

                {
                    this.f44540b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    OcHomeFinanceViewModel ocHomeFinanceViewModelU3;
                    Fragment fragment = null;
                    OcHomeLoanTabFragment ocHomeLoanTabFragment = this.f44540b;
                    switch (i10) {
                        case 0:
                            LoanHomeDataInfo loanHomeDataInfo = (LoanHomeDataInfo) obj;
                            if (loanHomeDataInfo != null) {
                                ocHomeLoanTabFragment.f30432o = loanHomeDataInfo;
                                try {
                                    Fragment fragmentD = ocHomeLoanTabFragment.getChildFragmentManager().D(e.fin_fl);
                                    if (fragmentD != null && "/credit_score/oc_home_finance_fragment".equals(fragmentD.getTag())) {
                                        fragment = fragmentD;
                                    }
                                    if (fragment != null) {
                                        c.b().f(new MessageEvent(MessageEvent.EVENT_OC_REFRESH_LOAN_HOME_DATA, ((Gson) C0525w.f().f7166b).toJson(loanHomeDataInfo)));
                                    } else {
                                        Object objNavigation = ARouter.getInstance().build("/credit_score/oc_home_finance_fragment").navigation();
                                        Intrinsics.f(objNavigation, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
                                        Fragment fragment2 = (Fragment) objNavigation;
                                        Bundle bundle = new Bundle();
                                        bundle.putString("home_loan_data", ((Gson) C0525w.f().f7166b).toJson(loanHomeDataInfo));
                                        fragment2.setArguments(bundle);
                                        Z childFragmentManager = ocHomeLoanTabFragment.getChildFragmentManager();
                                        childFragmentManager.getClass();
                                        C1161a c1161a = new C1161a(childFragmentManager);
                                        c1161a.e(e.fin_fl, fragment2, "/credit_score/oc_home_finance_fragment");
                                        c1161a.h(true);
                                        ocHomeLoanTabFragment.f30431j = fragment2;
                                    }
                                } catch (Exception e10) {
                                    e10.printStackTrace();
                                }
                            } else {
                                ocHomeLoanTabFragment.f30432o = null;
                                ocHomeLoanTabFragment.v();
                            }
                            break;
                        default:
                            int i11 = OcHomeLoanTabFragment.f30430v;
                            if (Intrinsics.c((Boolean) obj, Boolean.TRUE) && (ocHomeFinanceViewModelU3 = ocHomeLoanTabFragment.u()) != null) {
                                p140j8.f.s(ocHomeFinanceViewModelU3, new C0357p(1, null), ocHomeFinanceViewModelU3.f30909C, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                            }
                            break;
                    }
                    return Unit.f38893a;
                }
            }, 20));
        }
        OcHomeFinanceViewModel ocHomeFinanceViewModelU3 = u();
        l lVar = ocHomeFinanceViewModelU3 != null ? ocHomeFinanceViewModelU3.f30909C : null;
        if (lVar == null) {
            return 0;
        }
        lVar.e(this, new p369yd.e(new p(this, 3), (char) 0));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        if (BaseApplication.hasLogin()) {
            return 0;
        }
        v();
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        if (c.b().e(this)) {
            return;
        }
        c.b().j(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        c.b().l(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z3) {
        super.onHiddenChanged(z3);
        if (z3) {
            return;
        }
        t();
    }

    @Override // com.transsnet.palmpay.credit.handler.MultiLoanPopupHost
    public final void onMultiLoanPopupCta(ProductContentInfo product) {
        Intrinsics.checkNotNullParameter(product, "product");
        Fragment fragmentD = getChildFragmentManager().D(e.fin_fl);
        if (fragmentD instanceof OcHomeFinanceFragment) {
            ((OcHomeFinanceFragment) fragmentD).onApplyClick(product);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        Fragment fragment = this.f30431j;
        if (fragment != null) {
            fragment.onPause();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onReceivePushMessage(@Nullable PushMessage pushMessage) {
        if ((pushMessage != null ? pushMessage.content : null) == null) {
            return;
        }
        d.c(G.o("pushMessage = ", pushMessage.content.messageType), new Object[0]);
        String str = pushMessage.content.messageType;
        if (str != null) {
            switch (str.hashCode()) {
                case 1626652:
                    str.equals(PushMessage.MESSAGE_TYPE_OC_APPLY_SUCCESS);
                    break;
                case 1626682:
                    str.equals(PushMessage.MESSAGE_TYPE_OC_APPLY_FAILED);
                    break;
                case 1626747:
                    str.equals(PushMessage.MESSAGE_TYPE_CL_APPLY_SUCCESS);
                    break;
                case 72591919:
                    if (str.equals(PushMessage.MESSAGE_TYPE_OC_INCREASE_LIMIT)) {
                        h.y(this, getString(g.cs_finance_okcard_increase_task_limit));
                        break;
                    }
                    break;
                case 72591920:
                    if (str.equals(PushMessage.MESSAGE_TYPE_CL_INCREASE_LIMIT)) {
                        h.y(this, getString(g.cs_finance_cash_increase_task_limit));
                        break;
                    }
                    break;
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        t();
    }

    public final void t() {
        if (PermissionUtils.isGranted(com.transsnet.palmpay.core.config.d.j())) {
            w();
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j6 = SPUtils.getInstance().getLong("last_permission_request_time", 0L);
        if (j6 == 0 || jCurrentTimeMillis - j6 >= 86400000) {
            SPUtils.getInstance().put("last_permission_request_time", jCurrentTimeMillis);
            this.t.a(new String[]{"android.permission.ACCESS_COARSE_LOCATION", com.transsnet.palmpay.core.config.d.j()});
        }
    }

    public final OcHomeFinanceViewModel u() {
        return (OcHomeFinanceViewModel) this.f30433p.getValue();
    }

    public final void v() {
        try {
            Fragment fragmentD = getChildFragmentManager().D(e.fin_fl);
            if (fragmentD == null || !"/credit_score/oc_double_open_guide_fragment".equals(fragmentD.getTag())) {
                fragmentD = null;
            }
            if (fragmentD != null) {
                c.b().f(new MessageEvent(MessageEvent.EVENT_OC_REFRESH_LOAN_HOME_DATA, ((Gson) C0525w.f().f7166b).toJson((Object) null)));
                return;
            }
            Object objNavigation = ARouter.getInstance().build("/credit_score/oc_double_open_guide_fragment").withString("oc_apply_enter_point", "FINANCE").navigation();
            Intrinsics.f(objNavigation, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
            Fragment fragment = (Fragment) objNavigation;
            Bundle bundle = new Bundle();
            bundle.putString("home_loan_data", ((Gson) C0525w.f().f7166b).toJson((Object) null));
            fragment.setArguments(bundle);
            Z childFragmentManager = getChildFragmentManager();
            childFragmentManager.getClass();
            C1161a c1161a = new C1161a(childFragmentManager);
            c1161a.e(e.fin_fl, fragment, "/credit_score/oc_double_open_guide_fragment");
            c1161a.h(true);
            this.f30431j = fragment;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void w() {
        PalmPayLatLng location;
        c.b().f(new MessageEvent(MessageEvent.EVENT_REFRESH_LOCATION));
        LocationRecord locationRecordF = p367ya.a.d().f();
        OcHomeFinanceViewModel ocHomeFinanceViewModelU = u();
        if (ocHomeFinanceViewModelU != null) {
            ocHomeFinanceViewModelU.f((locationRecordF == null || (location = locationRecordF.getLocation()) == null) ? null : Long.valueOf(location.locateTime), "LOAN_TAB");
        }
    }
}

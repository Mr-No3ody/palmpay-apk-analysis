package com.transsnet.palmpay.ui.fragment;

import Ab.C;
import Ab.ViewOnClickListenerC0053e;
import Ac.e;
import Ac.f;
import Ae.j;
import Bc.C0106c;
import C9.C0138e;
import C9.C0142i;
import C9.Q;
import Ce.C0169k;
import F6.d;
import Jb.r;
import N8.q0;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.result.ActivityResultCaller;
import androidx.camera.video.internal.c;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Z;
import androidx.lifecycle.AbstractC1207q;
import androidx.lifecycle.F;
import androidx.lifecycle.V;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.horcrux.svg.d0;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.apm.network.NQEManager;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.common.export.view.NetworkNotConnectView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmFragment;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.credit.bean.LoanHomeDataInfo;
import com.transsnet.palmpay.credit.bean.ProductContentInfo;
import com.transsnet.palmpay.credit.handler.HomeDialogHandler$HandleCallBack;
import com.transsnet.palmpay.credit.handler.MultiLoanPopupHost;
import com.transsnet.palmpay.credit.ui.dialog.MoreFunctionDialogFragment;
import com.transsnet.palmpay.credit.viewmodel.OcHomeFinanceViewModel;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.ui.fragment.HomeFinanceFragment;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.BarUtils;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.chromium.support_lib_boundary.util.b;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import p025ba.k;
import p129ib.m;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/main/home_tab_finance")
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\rB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/transsnet/palmpay/ui/fragment/HomeFinanceFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmFragment;", "Lcom/transsnet/palmpay/credit/viewmodel/OcHomeFinanceViewModel;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "Lcom/transsnet/palmpay/credit/handler/HomeDialogHandler$HandleCallBack;", "Lcom/transsnet/palmpay/credit/handler/MultiLoanPopupHost;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "a", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHomeFinanceFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeFinanceFragment.kt\ncom/transsnet/palmpay/ui/fragment/HomeFinanceFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,394:1\n71#2,8:395\n112#2:403\n1#3:404\n*S KotlinDebug\n*F\n+ 1 HomeFinanceFragment.kt\ncom/transsnet/palmpay/ui/fragment/HomeFinanceFragment\n*L\n142#1:395,8\n142#1:403\n*E\n"})
public final class HomeFinanceFragment extends BaseMvvmFragment<OcHomeFinanceViewModel> implements SwipeRefreshLayout.OnRefreshListener, HomeDialogHandler$HandleCallBack, MultiLoanPopupHost {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ int f35071H = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public m f35072A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f35073B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f35074C;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C0106c f35076o;
    public Fragment t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public NetworkNotConnectView f35078v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public LoanHomeDataInfo f35079w;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f35075j = C2131j.b(new j(this, 4));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f35077p = true;

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

    public static final void t(HomeFinanceFragment homeFinanceFragment, LoanHomeDataInfo loanHomeDataInfo) {
        homeFinanceFragment.f35079w = loanHomeDataInfo;
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) homeFinanceFragment.f35075j.getValue();
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
        if (loanHomeDataInfo != null) {
            Integer num = loanHomeDataInfo.allProductNotCredit;
            if (num != null && num.intValue() == 1) {
                C0106c c0106c = homeFinanceFragment.f35076o;
                if (c0106c != null) {
                    h.c((IconicsImageView) c0106c.f674g);
                }
            } else {
                C0106c c0106c2 = homeFinanceFragment.f35076o;
                if (c0106c2 != null) {
                    h.s((IconicsImageView) c0106c2.f674g, true);
                }
            }
            OcHomeFinanceViewModel ocHomeFinanceViewModel = (OcHomeFinanceViewModel) homeFinanceFragment.f27333i;
            if (ocHomeFinanceViewModel != null) {
                ocHomeFinanceViewModel.e(loanHomeDataInfo);
            }
            if (homeFinanceFragment.f35077p) {
                homeFinanceFragment.f35077p = false;
                homeFinanceFragment.u();
            }
        }
        String str = loanHomeDataInfo != null ? loanHomeDataInfo.appTopMainConfig : null;
        C0106c c0106c3 = homeFinanceFragment.f35076o;
        if (c0106c3 != null) {
            TextView textView = (TextView) c0106c3.f673f;
            if (str == null || StringsKt.F(str)) {
                h.c(textView);
            } else {
                textView.setText(str);
                h.s(textView, true);
            }
        }
        m mVar = homeFinanceFragment.f35072A;
        if (mVar != null) {
            mVar.c();
        }
    }

    @Override // com.transsnet.palmpay.credit.handler.MultiLoanPopupHost
    public final ProductContentInfo findInstallmentProductForMultiLoanPopup() {
        List<ProductContentInfo> list;
        F f10;
        LoanHomeDataInfo loanHomeDataInfo;
        ProductContentInfo productContentInfoFindInstallmentProductForMultiLoanPopup;
        ActivityResultCaller activityResultCaller = this.t;
        Object obj = null;
        MultiLoanPopupHost multiLoanPopupHost = activityResultCaller instanceof MultiLoanPopupHost ? (MultiLoanPopupHost) activityResultCaller : null;
        if (multiLoanPopupHost != null && (productContentInfoFindInstallmentProductForMultiLoanPopup = multiLoanPopupHost.findInstallmentProductForMultiLoanPopup()) != null) {
            return productContentInfoFindInstallmentProductForMultiLoanPopup;
        }
        LoanHomeDataInfo loanHomeDataInfo2 = this.f35079w;
        if (loanHomeDataInfo2 == null || (list = loanHomeDataInfo2.productContentInfo) == null) {
            OcHomeFinanceViewModel ocHomeFinanceViewModel = (OcHomeFinanceViewModel) this.f27333i;
            list = (ocHomeFinanceViewModel == null || (f10 = ocHomeFinanceViewModel.f30912e) == null || (loanHomeDataInfo = (LoanHomeDataInfo) f10.d()) == null) ? null : loanHomeDataInfo.productContentInfo;
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

    @Override // com.transsnet.palmpay.core.base.IBaseView
    public final AbstractC1207q getCoroutineScope() {
        return V.f(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.credit.handler.MultiLoanPopupHost
    public final boolean isNewLoanHomeForMultiLoanPopup() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        F f10;
        OcHomeFinanceViewModel ocHomeFinanceViewModel = (OcHomeFinanceViewModel) this.f27333i;
        if (ocHomeFinanceViewModel != null && (f10 = ocHomeFinanceViewModel.f30913f) != null) {
            f10.e(getViewLifecycleOwner(), new C0138e(new C(this, 4)));
        }
        OcHomeFinanceViewModel ocHomeFinanceViewModel2 = (OcHomeFinanceViewModel) this.f27333i;
        l lVar = ocHomeFinanceViewModel2 != null ? ocHomeFinanceViewModel2.f30920w : null;
        if (lVar != null) {
            lVar.e(this, new C0138e(new Q(1, this, this), (byte) 0));
        }
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final ViewBinding l(LayoutInflater inflater, ViewGroup viewGroup) {
        View viewM;
        View viewM2;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(f.main_fragment_home_finance, viewGroup, false);
        int i7 = e.bgView;
        View viewM3 = p059e1.a.m(i7, viewInflate);
        if (viewM3 != null) {
            i7 = e.fin_fl;
            FrameLayout frameLayout = (FrameLayout) p059e1.a.m(i7, viewInflate);
            if (frameLayout != null) {
                i7 = e.headerBottomBarrier;
                if (((Barrier) p059e1.a.m(i7, viewInflate)) != null && (viewM = p059e1.a.m((i7 = e.indicatorLoan), viewInflate)) != null && (viewM2 = p059e1.a.m((i7 = e.indicatorMobileInstallment), viewInflate)) != null) {
                    i7 = e.ivCustomerService;
                    IconicsImageView iconicsImageView = (IconicsImageView) p059e1.a.m(i7, viewInflate);
                    if (iconicsImageView != null) {
                        i7 = e.ivMenu;
                        IconicsImageView iconicsImageView2 = (IconicsImageView) p059e1.a.m(i7, viewInflate);
                        if (iconicsImageView2 != null) {
                            i7 = e.refreshLayout;
                            if (((SwipeRefreshLayout) p059e1.a.m(i7, viewInflate)) != null) {
                                i7 = e.tabLoan;
                                TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                                if (textView != null) {
                                    i7 = e.tabMobileInstallment;
                                    TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                                    if (textView2 != null) {
                                        i7 = e.title_bar;
                                        PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
                                        if (ppTitleBar != null) {
                                            i7 = e.tvAppTopMainConfig;
                                            TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                                            if (textView3 != null) {
                                                i7 = e.viewNotNetworkStub;
                                                if (((ViewStub) p059e1.a.m(i7, viewInflate)) != null) {
                                                    C0106c c0106c = new C0106c((ConstraintLayout) viewInflate, viewM3, frameLayout, viewM, viewM2, iconicsImageView, iconicsImageView2, textView, textView2, ppTitleBar, textView3);
                                                    this.f35076o = c0106c;
                                                    return c0106c;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        ImageView backImageView;
        E eRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(eRequireActivity, "requireActivity(...)");
        this.f27333i = (BaseViewModel) new c(eRequireActivity).h(OcHomeFinanceViewModel.class);
        C0106c c0106c = this.f35076o;
        if (c0106c != null) {
            final int i7 = 0;
            ((IconicsImageView) c0106c.f674g).setOnClickListener(new View.OnClickListener(this) { // from class: Ce.i

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ HomeFinanceFragment f1490b;

                {
                    this.f1490b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HomeFinanceFragment homeFinanceFragment = this.f1490b;
                    switch (i7) {
                        case 0:
                            int i10 = HomeFinanceFragment.f35071H;
                            MoreFunctionDialogFragment moreFunctionDialogFragmentNewInstance = MoreFunctionDialogFragment.f30000C.newInstance();
                            androidx.fragment.app.Z childFragmentManager = homeFinanceFragment.getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                            moreFunctionDialogFragmentNewInstance.show(childFragmentManager, "showMoreFunctionDialog");
                            break;
                        default:
                            int i11 = HomeFinanceFragment.f35071H;
                            homeFinanceFragment.getClass();
                            String strG = com.transsnet.palmpay.core.config.d.g("/h5/help/main?cardNo=%1$s&deviceTag=%2$s&loanProduct=%3$s&phone=%4$s");
                            Intrinsics.checkNotNullExpressionValue(strG, "getH5Url(...)");
                            String str = String.format(strG, Arrays.copyOf(new Object[]{"", "", "OK_CARD", C0.G.A()}, 4));
                            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                            Pa.i0.c0(str);
                            break;
                    }
                }
            });
        }
        C0106c c0106c2 = this.f35076o;
        if (c0106c2 != null) {
            final int i10 = 1;
            ((IconicsImageView) c0106c2.f671d).setOnClickListener(new View.OnClickListener(this) { // from class: Ce.i

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ HomeFinanceFragment f1490b;

                {
                    this.f1490b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HomeFinanceFragment homeFinanceFragment = this.f1490b;
                    switch (i10) {
                        case 0:
                            int i11 = HomeFinanceFragment.f35071H;
                            MoreFunctionDialogFragment moreFunctionDialogFragmentNewInstance = MoreFunctionDialogFragment.f30000C.newInstance();
                            androidx.fragment.app.Z childFragmentManager = homeFinanceFragment.getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                            moreFunctionDialogFragmentNewInstance.show(childFragmentManager, "showMoreFunctionDialog");
                            break;
                        default:
                            int i12 = HomeFinanceFragment.f35071H;
                            homeFinanceFragment.getClass();
                            String strG = com.transsnet.palmpay.core.config.d.g("/h5/help/main?cardNo=%1$s&deviceTag=%2$s&loanProduct=%3$s&phone=%4$s");
                            Intrinsics.checkNotNullExpressionValue(strG, "getH5Url(...)");
                            String str = String.format(strG, Arrays.copyOf(new Object[]{"", "", "OK_CARD", C0.G.A()}, 4));
                            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                            Pa.i0.c0(str);
                            break;
                    }
                }
            });
        }
        Bundle arguments = getArguments();
        boolean z3 = arguments != null ? arguments.getBoolean("showBackImg", false) : false;
        C0106c c0106c3 = this.f35076o;
        if (c0106c3 != null && (backImageView = ((PpTitleBar) c0106c3.f676j).getBackImageView()) != null) {
            h.s(backImageView, z3);
        }
        org.greenrobot.eventbus.c.b().j(this);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.f35075j.getValue();
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setOnRefreshListener(this);
        }
        C0106c c0106c4 = this.f35076o;
        if (c0106c4 != null) {
            c0106c4.f669b.setOnClickListener(new ViewOnClickListenerC0053e(3));
        }
        u();
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        org.greenrobot.eventbus.c.b().l(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@NotNull MessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getEventType() == 569) {
            q0.u("/credit_score/oc_home_mobile_installment_standalone_activity");
        }
    }

    @Override // com.transsnet.palmpay.credit.handler.MultiLoanPopupHost
    public final void onMultiLoanPopupCta(ProductContentInfo product) {
        Intrinsics.checkNotNullParameter(product, "product");
        ActivityResultCaller activityResultCaller = this.t;
        MultiLoanPopupHost multiLoanPopupHost = activityResultCaller instanceof MultiLoanPopupHost ? (MultiLoanPopupHost) activityResultCaller : null;
        if (multiLoanPopupHost != null) {
            multiLoanPopupHost.onMultiLoanPopupCta(product);
        }
    }

    @Override // com.transsnet.palmpay.credit.handler.HomeDialogHandler$HandleCallBack
    public final void onNoDialogToHandle() {
        String str = this.f27317a;
        d.h(str, 3, "onNoDialogToHandle >>>");
        E activity = getActivity();
        if (ActivityUtils.isValidActivityContext(activity)) {
            d.h(str, 3, "showAdDialog >>> start");
            String string = BaseApplication.get().getString(Ac.h.main_ad_loan_dialog_slot_id);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            b.j(string).show(activity, new C0169k(this, activity));
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public final void onRefresh() {
        d.h(this.f27317a, 3, "onRefresh >>>");
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.f35075j.getValue();
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(true);
        }
        p059e1.a.f35991d = true;
        if (!BaseApplication.hasLogin()) {
            v();
            return;
        }
        OcHomeFinanceViewModel ocHomeFinanceViewModel = (OcHomeFinanceViewModel) this.f27333i;
        if (ocHomeFinanceViewModel == null || !BaseApplication.hasLogin()) {
            return;
        }
        p140j8.f.s(ocHomeFinanceViewModel, new r(1, null), ocHomeFinanceViewModel.f30920w, 0L, false, false);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        int i7 = 1;
        super.onResume();
        p118hf.a.f37382e = Boolean.FALSE;
        d.h(this.f27317a, 3, "onResume >>>");
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j6 = jCurrentTimeMillis - this.f35073B;
        String str = this.f27317a;
        if (j6 <= 100) {
            d.h(str, 5, "doResumeWorks >>> intercept");
            return;
        }
        this.f35073B = jCurrentTimeMillis;
        E activity = getActivity();
        if (activity != null) {
            BarUtils.setStatusBarLightMode(activity, !m());
        }
        p059e1.a.f35991d = false;
        if (BaseApplication.hasLogin()) {
            d.h(str, 3, "showLoanHomeDialog >>> " + this.f35072A);
            if (this.f35072A == null) {
                m mVar = new m(this);
                this.f35072A = mVar;
                Intrinsics.checkNotNullParameter(this, "callBack");
                mVar.f37485d = this;
            }
            m mVar2 = this.f35072A;
            if (mVar2 != null) {
                int i10 = m.f37481g;
                mVar2.a(null);
            }
            OcHomeFinanceViewModel ocHomeFinanceViewModel = (OcHomeFinanceViewModel) this.f27333i;
            if (ocHomeFinanceViewModel != null) {
                boolean z3 = this.f35079w == null;
                if (BaseApplication.hasLogin()) {
                    p140j8.f.s(ocHomeFinanceViewModel, new r(1, null), ocHomeFinanceViewModel.f30920w, 0L, z3, false);
                }
            }
        } else {
            v();
        }
        if (!NQEManager.INSTANCE.isNetworkOffline()) {
            NetworkNotConnectView networkNotConnectView = this.f35078v;
            if (networkNotConnectView != null) {
                h.s(networkNotConnectView, false);
                return;
            }
            return;
        }
        if (this.f35078v == null) {
            this.f27318b.findViewById(e.viewNotNetworkStub).setVisibility(0);
            NetworkNotConnectView networkNotConnectView2 = (NetworkNotConnectView) this.f27318b.findViewById(e.viewNotNetwork);
            this.f35078v = networkNotConnectView2;
            if (networkNotConnectView2 != null) {
                networkNotConnectView2.setTitle(CommonViewExtKt.string(k.core_loan, getContext()));
            }
            NetworkNotConnectView networkNotConnectView3 = this.f35078v;
            if (networkNotConnectView3 != null) {
                networkNotConnectView3.setTopMessage("Flexi Credit Services offers high loan amounts with low interest rates for funding.");
            }
            NetworkNotConnectView networkNotConnectView4 = this.f35078v;
            if (networkNotConnectView4 != null) {
                networkNotConnectView4.setRefreshListener(new C0142i(this, i7));
            }
        }
        NetworkNotConnectView networkNotConnectView5 = this.f35078v;
        if (networkNotConnectView5 != null) {
            h.s(networkNotConnectView5, true);
        }
    }

    public final void u() {
        if (isAdded()) {
            C0106c c0106c = this.f35076o;
            TextView textView = c0106c != null ? c0106c.f669b : null;
            if (textView != null) {
                textView.setTextColor(CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, textView.getContext()));
            }
            C0106c c0106c2 = this.f35076o;
            if (c0106c2 != null) {
                h.s(c0106c2.f678p, false);
            }
            Z childFragmentManager = getChildFragmentManager();
            C1161a c1161aE = q0.e(childFragmentManager, childFragmentManager);
            c1161aE.f(Ac.a.main_anim_tab_enter_left, Ac.a.main_anim_tab_exit_right, 0, 0);
            Intrinsics.checkNotNullExpressionValue(c1161aE, "setCustomAnimations(...)");
            Fragment fragment = this.t;
            if (fragment != null) {
                c1161aE.l(fragment);
            }
            Fragment fragment2 = this.t;
            if (fragment2 == null) {
                Fragment fragment3 = (Fragment) d0.m("/credit_score/oc_home_loan_tab_fragment", "null cannot be cast to non-null type androidx.fragment.app.Fragment");
                this.t = fragment3;
                c1161aE.d(e.fin_fl, fragment3, null, 1);
            } else {
                c1161aE.p(fragment2);
            }
            c1161aE.h(true);
        }
    }

    public final void v() {
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.f35075j.getValue();
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
        OcHomeFinanceViewModel ocHomeFinanceViewModel = (OcHomeFinanceViewModel) this.f27333i;
        if (ocHomeFinanceViewModel != null) {
            ocHomeFinanceViewModel.e(null);
        }
        C0106c c0106c = this.f35076o;
        if (c0106c != null) {
            h.c((TextView) c0106c.f673f);
        }
    }
}

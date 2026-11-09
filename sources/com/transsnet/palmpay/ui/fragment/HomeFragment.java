package com.transsnet.palmpay.ui.fragment;

import Aa.a;
import Ab.k;
import Ac.e;
import Ac.f;
import Ac.h;
import Ae.p;
import C0.G;
import C9.C0158z;
import Ce.C0170l;
import Ce.C0173o;
import Ce.C0174p;
import Ce.r;
import F6.d;
import Fe.I;
import Ie.i;
import Ie.j;
import N8.q0;
import Pa.F;
import Pa.H;
import Pa.i0;
import Pa.r0;
import Wf.AbstractC0780y;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.camera.core.impl.utils.executor.g;
import androidx.core.view.N;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Z;
import androidx.lifecycle.AbstractC1207q;
import androidx.lifecycle.V;
import com.facebook.imagepipeline.nativecode.b;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.transsnet.adsdk.widgets.Interstitial.InterstitialAdView;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.analysis.utils.GsonUtil;
import com.transsnet.palmpay.bean.HomeDialogState;
import com.transsnet.palmpay.bean.HomeFragmentCache;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMVPFragment;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.LastPayerDataBean;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.rsp.HomeMenuBean;
import com.transsnet.palmpay.credit.bean.LoanEnterPreCheckInfo;
import com.transsnet.palmpay.credit.bean.LoanHomeSource;
import com.transsnet.palmpay.credit.viewmodel.OcHomeFinanceViewModel;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.main.export.bean.rsp.GetHomeCommonRsp;
import com.transsnet.palmpay.main.export.bean.rsp.MeTabTotalAssetInfo;
import com.transsnet.palmpay.main.export.bean.rsp.QueryHomeAccountInfoRsp;
import com.transsnet.palmpay.ui.activity.CoinRainActivity;
import com.transsnet.palmpay.ui.activity.HomeActivity;
import com.transsnet.palmpay.ui.activity.UpdateActivity;
import com.transsnet.palmpay.ui.dialog.MoneyRequestDialog;
import com.transsnet.palmpay.ui.dialog.VoucherDialog;
import com.transsnet.palmpay.ui.fragment.HomeFragment;
import com.transsnet.palmpay.ui.mvp.contract.HomeFragmentContract$IView;
import com.transsnet.palmpay.ui.widget.HomeFragmentContainer;
import com.transsnet.palmpay.util.BarUtils;
import com.transsnet.palmpay.util.MainAdUtils;
import com.transsnet.palmpay.util.MainUtils;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.viewmodule.PalmZoneViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.c;
import org.jetbrains.annotations.NotNull;
import p189me.jessyan.autosize.internal.CancelAdapt;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/ui/fragment/HomeFragment;", "Lcom/transsnet/palmpay/core/base/BaseMVPFragment;", "LFe/I;", "Lcom/transsnet/palmpay/ui/mvp/contract/HomeFragmentContract$IView;", "Lme/jessyan/autosize/internal/CancelAdapt;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHomeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeFragment.kt\ncom/transsnet/palmpay/ui/fragment/HomeFragment\n+ 2 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,815:1\n629#2,11:816\n629#2,11:827\n1#3:838\n1761#4,3:839\n*S KotlinDebug\n*F\n+ 1 HomeFragment.kt\ncom/transsnet/palmpay/ui/fragment/HomeFragment\n*L\n179#1:816,11\n228#1:827,11\n686#1:839,3\n*E\n"})
public final class HomeFragment extends BaseMVPFragment<I> implements HomeFragmentContract$IView, CancelAdapt {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f35080A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public HomeFragmentContainer f35081B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f35082C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public long f35083H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f35084L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public Boolean f35085M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final t f35086Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public i f35087X;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public HomeFragmentHomeTab f35088j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public HomeFinanceFragment f35089o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public HomeMeFragment f35090p;
    public HomePalmZoneTabV2 t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public j f35091v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Handler f35092w;

    public HomeFragment() {
        Looper mainLooper = Looper.getMainLooper();
        Intrinsics.e(mainLooper);
        this.f35092w = new Handler(mainLooper);
        this.f35080A = C2131j.b(new a(14));
        this.f35086Q = C2131j.b(new Ae.j(this, 5));
    }

    public static final void u(HomeFragment homeFragment) {
        if (i0.W(homeFragment.getActivity())) {
            HomeActivity homeActivity = (HomeActivity) homeFragment.getActivity();
            if (UpdateActivity.l(homeFragment.getContext()) || homeActivity == null || homeActivity.f34468a) {
                return;
            }
            int iD = p059e1.a.D(0, "app_start_times");
            d.h(homeFragment.f27317a, 3, G.m(iD, "checkUpdateAndLaunchAds: "));
            if (iD > 20 && p367ya.a.d().a()) {
                g.D(homeFragment.getActivity());
            }
            p059e1.a.U(iD + 1, "app_start_times");
            HomeActivity homeActivity2 = (HomeActivity) homeFragment.getActivity();
            if (i0.W(homeActivity2)) {
                String adSlotId = MainAdUtils.getAdSlotId(h.main_ad_home_pop_slot_id);
                Intrinsics.checkNotNullExpressionValue(adSlotId, "getAdSlotId(...)");
                InterstitialAdView interstitialAdView = new InterstitialAdView(adSlotId, 1, new k(6), new org.sufficientlysecure.htmltextview.h(9));
                interstitialAdView.setUseRemoteWebView(MainUtils.checkUseRemoteWebView());
                interstitialAdView.show(homeActivity2, false, new C0174p(homeActivity2, 0));
            }
        }
    }

    public static final void v(HomeFragment homeFragment) {
        homeFragment.getClass();
        AbstractC0780y.m(V.f(homeFragment), null, null, new C0173o(homeFragment, null), 3);
    }

    public static final void w(HomeFragment homeFragment) {
        if (com.transsnet.palmpay.core.config.d.t() && !BaseApplication.hasLogin() && SPUtils.get().getBoolean("key_pre_install_build_privacy_dialog_show", true)) {
            p pVar = new p(homeFragment.requireActivity(), new C0170l(0));
            pVar.show();
            HomeActivity homeActivity = (HomeActivity) homeFragment.getActivity();
            if (homeActivity != null) {
                homeActivity.showDialog(pVar, HomeDialogState.PRIORITY_HIGHEST);
            }
            E activity = homeFragment.getActivity();
            Intrinsics.f(activity, "null cannot be cast to non-null type com.transsnet.palmpay.ui.activity.HomeActivity");
            r0.G1((HomeActivity) activity);
        }
    }

    public static boolean x(int i7, List list) {
        if (list == null) {
            return true;
        }
        if (list.isEmpty()) {
            return false;
        }
        List<HomeMenuBean> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (HomeMenuBean homeMenuBean : list2) {
            if (homeMenuBean.menuId == i7 && homeMenuBean.hideFlag == 0) {
                return true;
            }
        }
        return false;
    }

    public final HomeMeFragment A() {
        HomeFragmentContainer homeFragmentContainer;
        Fragment fragmentB;
        if (this.f35090p == null && (homeFragmentContainer = this.f35081B) != null && (fragmentB = homeFragmentContainer.b("me")) != null) {
            if (!(fragmentB instanceof HomeMeFragment)) {
                fragmentB = null;
            }
            if (fragmentB != null) {
                this.f35090p = (HomeMeFragment) fragmentB;
            }
        }
        return this.f35090p;
    }

    public final HomePalmZoneTabV2 B() {
        HomeFragmentContainer homeFragmentContainer;
        Fragment fragmentB;
        if (this.t == null && (homeFragmentContainer = this.f35081B) != null && (fragmentB = homeFragmentContainer.b("palmzone")) != null) {
            if (!(fragmentB instanceof HomePalmZoneTabV2)) {
                fragmentB = null;
            }
            if (fragmentB != null) {
                this.t = (HomePalmZoneTabV2) fragmentB;
            }
        }
        return this.t;
    }

    public final HomeFragmentHomeTab C() {
        HomeFragmentContainer homeFragmentContainer;
        Fragment fragmentB;
        if (this.f35088j == null && (homeFragmentContainer = this.f35081B) != null && (fragmentB = homeFragmentContainer.b("home")) != null) {
            if (!(fragmentB instanceof HomeFragmentHomeTab)) {
                fragmentB = null;
            }
            if (fragmentB != null) {
                this.f35088j = (HomeFragmentHomeTab) fragmentB;
            }
        }
        return this.f35088j;
    }

    public final int D() {
        HomeFragmentContainer homeFragmentContainer = this.f35081B;
        if (homeFragmentContainer != null) {
            return homeFragmentContainer.c("invest");
        }
        return -1;
    }

    public final int E() {
        HomeFragmentContainer homeFragmentContainer = this.f35081B;
        if (homeFragmentContainer != null) {
            return homeFragmentContainer.c("palmzone");
        }
        return -1;
    }

    public final boolean F() {
        if (p267r9.a.f41645a.a() && this.f35084L && i0.W(getActivity())) {
            if (this.f35083H + (BaseApplication.get().isOldAndroidDevice() ? 45000L : DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT) <= System.currentTimeMillis()) {
                this.f35083H = System.currentTimeMillis();
                d.h(this.f27317a, 3, "launchHighPriorityInterstitialAdView: ");
                HomeActivity homeActivity = (HomeActivity) getActivity();
                String adSlotId = MainAdUtils.getAdSlotId(h.main_ad_home_pop_high_priority_slot_id);
                Intrinsics.checkNotNullExpressionValue(adSlotId, "getAdSlotId(...)");
                InterstitialAdView interstitialAdView = new InterstitialAdView(adSlotId, 1, (List) this.f35080A.getValue(), new C0158z(this, 2), new org.sufficientlysecure.htmltextview.h(9));
                interstitialAdView.setUseRemoteWebView(MainUtils.checkUseRemoteWebView());
                interstitialAdView.show(homeActivity, false, new p279s5.d(1, this, homeActivity));
                return true;
            }
        }
        return false;
    }

    public final Boolean G(boolean z3) {
        I i7 = (I) this.f27328i;
        if (i7 != null) {
            return Boolean.valueOf(i7.queryHomeAccountInfo(z3));
        }
        return null;
    }

    public final void H(int i7) {
        d.h(this.f27317a, 3, G.m(i7, "switchTab: "));
        if (i7 == -1) {
            return;
        }
        BarUtils.setStatusBarLightMode(requireActivity(), !m());
        HomeFragmentContainer homeFragmentContainer = this.f35081B;
        if (homeFragmentContainer != null) {
            Z childFragmentManager = getChildFragmentManager();
            childFragmentManager.getClass();
            homeFragmentContainer.d(new C1161a(childFragmentManager), i7);
        }
        j jVar = this.f35091v;
        if (jVar != null) {
            jVar.e(i7);
        }
    }

    public final void I(String str) {
        HomeFinanceFragment homeFinanceFragmentZ;
        OcHomeFinanceViewModel ocHomeFinanceViewModel;
        if (TextUtils.equals("mobileInstallmentTab", str)) {
            q0.u("/credit_score/oc_home_mobile_installment_standalone_activity");
            return;
        }
        if (b.G(Eb.a.f2267a)) {
            return;
        }
        H(y());
        if (TextUtils.equals("borrow", str) && (homeFinanceFragmentZ = z()) != null && homeFinanceFragmentZ.isAdded() && homeFinanceFragmentZ.t != null && (ocHomeFinanceViewModel = (OcHomeFinanceViewModel) homeFinanceFragmentZ.f27333i) != null) {
            ocHomeFinanceViewModel.f30914g.k(Boolean.TRUE);
        }
        if (!TextUtils.equals("mobileInstallmentTab", str) || z() == null) {
            return;
        }
        q0.u("/credit_score/oc_home_mobile_installment_standalone_activity");
    }

    public final void J(String str) {
        H(E());
        if (str != null) {
            if (TextUtils.isEmpty(str)) {
                str = null;
            }
            if (str != null) {
                try {
                    HomePalmZoneTabV2 homePalmZoneTabV2B = B();
                    if (homePalmZoneTabV2B != null) {
                        long j6 = Long.parseLong(str);
                        PalmZoneViewModel palmZoneViewModel = (PalmZoneViewModel) homePalmZoneTabV2B.f27333i;
                        if (palmZoneViewModel != null) {
                            Long lValueOf = Long.valueOf(j6);
                            int i7 = PalmZoneViewModel.f35388A;
                            palmZoneViewModel.d(lValueOf, 0);
                        }
                        Unit unit = Unit.f38893a;
                    }
                } catch (Exception unused) {
                    Unit unit2 = Unit.f38893a;
                }
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.IBaseView
    public final AbstractC1207q getCoroutineScope() {
        return V.f(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return f.main_fragment_home_v2;
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.HomeFragmentContract$IView
    public final void handleHomeAccountInfo(QueryHomeAccountInfoRsp queryHomeAccountInfoRsp) {
        HomeMeFragment homeMeFragmentA = A();
        if (homeMeFragmentA != null) {
            homeMeFragmentA.handleHomeAccountInfo(queryHomeAccountInfoRsp);
        }
        HomeFragmentHomeTab homeFragmentHomeTabC = C();
        if (homeFragmentHomeTabC != null) {
            homeFragmentHomeTabC.handleHomeAccountInfo(queryHomeAccountInfoRsp);
        }
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.HomeFragmentContract$IView
    public final void handleLastPayer(LastPayerDataBean lastPayerDataBean) {
        HomeActivity homeActivity;
        if (lastPayerDataBean != null) {
            int i7 = lastPayerDataBean.businessType;
            if (i7 == 4) {
                HomeActivity homeActivity2 = (HomeActivity) getActivity();
                if (homeActivity2 != null) {
                    homeActivity2.showDialog(new MoneyRequestDialog(getContext(), lastPayerDataBean), 101);
                }
            } else if (i7 == 5 && (homeActivity = (HomeActivity) getActivity()) != null) {
                homeActivity.showDialog(new VoucherDialog(getContext(), lastPayerDataBean), 101);
            }
            I i10 = (I) this.f27328i;
            if (i10 != null) {
                i10.smDialogShown(lastPayerDataBean.orderId);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsnet.palmpay.ui.mvp.contract.HomeFragmentContract$IView
    public final void handleLoanPreCheckInfoResult(CommonBeanResult commonBeanResult) {
        LoanEnterPreCheckInfo loanEnterPreCheckInfo;
        i iVar;
        if (commonBeanResult == null || (loanEnterPreCheckInfo = (LoanEnterPreCheckInfo) commonBeanResult.data) == null) {
            return;
        }
        d.h(this.f27317a, 3, "alreadyLoan=" + loanEnterPreCheckInfo.alreadyLoan + ", jumpPath=" + loanEnterPreCheckInfo.jumpPath + ", rnEnabled=" + loanEnterPreCheckInfo.rnEnabled + ", rnNewEnabled=" + loanEnterPreCheckInfo.rnNewEnabled + ", newVersionEnabled=" + loanEnterPreCheckInfo.newVersionEnabled + ", useNewDomain=" + loanEnterPreCheckInfo.useNewDomain);
        b.c(loanEnterPreCheckInfo.rnEnabled, loanEnterPreCheckInfo.rnNewEnabled, loanEnterPreCheckInfo.newVersionEnabled, loanEnterPreCheckInfo.useNewDomain);
        Boolean bool = loanEnterPreCheckInfo.alreadyLoan;
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.c(bool, bool2) || TextUtils.isEmpty(loanEnterPreCheckInfo.jumpPath)) {
            Eb.a.f2267a = LoanHomeSource.INSTANCE.normalize(LoanHomeSource.BOTTOM_TAB);
            if (b.G(LoanHomeSource.BOTTOM_TAB) || (iVar = this.f35087X) == null) {
                return;
            }
            iVar.invoke(Boolean.FALSE);
            return;
        }
        F.f(loanEnterPreCheckInfo.jumpPath, loanEnterPreCheckInfo.jumpType, loanEnterPreCheckInfo.jumpParams);
        i iVar2 = this.f35087X;
        if (iVar2 != null) {
            iVar2.invoke(bool2);
        }
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.HomeFragmentContract$IView
    public final void handleMeTabTotalAssetInfo(MeTabTotalAssetInfo meTabTotalAssetInfo) {
        HomeMeFragment homeMeFragmentA = A();
        if (homeMeFragmentA != null) {
            homeMeFragmentA.f35126M = meTabTotalAssetInfo;
            Ke.i iVar = homeMeFragmentA.t;
            if (iVar != null) {
                iVar.f(meTabTotalAssetInfo);
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        Window window;
        super.n();
        Handler handler = this.f35092w;
        E activity = getActivity();
        View decorView = (activity == null || (window = activity.getWindow()) == null) ? null : window.getDecorView();
        if (decorView != null) {
            decorView.post(new r(handler, this, this, 1));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        GetHomeCommonRsp getHomeCommonRsp;
        GetHomeCommonRsp.DataBean data;
        Window window;
        ViewStub viewStub;
        View viewInflate;
        Window window2;
        final View decorView;
        Window window3;
        int i7 = 0;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        d.h(this.f27317a, 3, "onCreateView: ");
        this.f27318b = inflater.inflate(f.main_fragment_home_v2, viewGroup, false);
        c.b().j(this);
        this.f35081B = (HomeFragmentContainer) this.f27318b.findViewById(e.fragmentContainer);
        View view = this.f27318b;
        if (view != null && (viewStub = (ViewStub) view.findViewById(e.bottomTabViewStub)) != null && (viewInflate = viewStub.inflate()) != null) {
            this.f35091v = new j(this, viewInflate);
            if (Build.VERSION.SDK_INT >= 35) {
                E activity = getActivity();
                if (activity != null && (window3 = activity.getWindow()) != null) {
                    window3.setNavigationBarColor(CommonViewExtKt.colorInt(L6.b.ppColorBackgroundLight, getActivity()));
                }
                E activity2 = getActivity();
                if (activity2 != null && (window2 = activity2.getWindow()) != null && (decorView = window2.getDecorView()) != null) {
                    OnApplyWindowInsetsListener onApplyWindowInsetsListener = new OnApplyWindowInsetsListener() { // from class: Ce.m
                        @Override // androidx.core.view.OnApplyWindowInsetsListener
                        public final androidx.core.view.q0 onApplyWindowInsets(View view2, androidx.core.view.q0 insets) {
                            View view3;
                            ViewGroup.LayoutParams layoutParams;
                            Intrinsics.checkNotNullParameter(view2, "<unused var>");
                            Intrinsics.checkNotNullParameter(insets, "insets");
                            int i10 = insets.f16277a.g(2).f16061d;
                            HomeFragment homeFragment = this.f1500a;
                            p355xf.t tVar = homeFragment.f35086Q;
                            View view4 = (View) tVar.getValue();
                            if (view4 != null && (layoutParams = view4.getLayoutParams()) != null) {
                                layoutParams.height = i10;
                                View view5 = (View) tVar.getValue();
                                if (view5 != null) {
                                    view5.setLayoutParams(layoutParams);
                                }
                            }
                            View view6 = (View) tVar.getValue();
                            if (view6 != null) {
                                view6.setBackgroundColor(CommonViewExtKt.colorInt(L6.b.ppColorBackgroundLight, homeFragment.getActivity()));
                            }
                            HomeFragmentContainer homeFragmentContainer = homeFragment.f35081B;
                            if (homeFragmentContainer != null) {
                                p220oa.h.k(homeFragmentContainer, null, null, null, Integer.valueOf(CommonViewExtKt.getDp(56.0f) + i10), 7);
                            }
                            Ie.j jVar = homeFragment.f35091v;
                            if (jVar != null) {
                                ImageView imageView = jVar.f4360c;
                                if ((imageView != null ? imageView.getParent() : null) instanceof View) {
                                    Object parent = imageView != null ? imageView.getParent() : null;
                                    Intrinsics.f(parent, "null cannot be cast to non-null type android.view.View");
                                    view3 = (View) parent;
                                } else {
                                    view3 = null;
                                }
                                if (view3 != null) {
                                    p220oa.h.k(view3, null, null, null, Integer.valueOf(i10), 7);
                                }
                            }
                            WeakHashMap weakHashMap = androidx.core.view.N.f16168a;
                            androidx.core.view.E.n(decorView, null);
                            return insets;
                        }
                    };
                    WeakHashMap weakHashMap = N.f16168a;
                    androidx.core.view.E.n(decorView, onApplyWindowInsetsListener);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new HomeFragmentCache("home"));
        String strO = g.o();
        HashMap map = H.f7018b;
        View decorView2 = null;
        String string = (!TextUtils.isEmpty(strO) && strO.startsWith("Pref_")) ? H.e().getString(strO, null) : null;
        List<HomeMenuBean> list = (TextUtils.isEmpty(string) || (getHomeCommonRsp = (GetHomeCommonRsp) GsonUtil.get().fromJson(string, GetHomeCommonRsp.class)) == null || (data = getHomeCommonRsp.getData()) == null) ? null : data.bottomTabMenu;
        if (!(BaseApplication.hasLogin() && BaseApplication.get().getUser().isTeenager()) && x(63, list)) {
            j jVar = this.f35091v;
            if (jVar != null) {
                ImageView imageView = jVar.f4368p;
                if (imageView != null) {
                    p220oa.h.s(imageView, true);
                }
                TextView textView = jVar.f4367o;
                if (textView != null) {
                    p220oa.h.s(textView, true);
                }
                SingleAdView singleAdView = jVar.t;
                if (singleAdView != null) {
                    p220oa.h.s(singleAdView, true);
                }
            }
            arrayList.add(new HomeFragmentCache("finance"));
        } else {
            j jVar2 = this.f35091v;
            if (jVar2 != null) {
                ImageView imageView2 = jVar2.f4368p;
                if (imageView2 != null) {
                    p220oa.h.s(imageView2, false);
                }
                TextView textView2 = jVar2.f4367o;
                if (textView2 != null) {
                    p220oa.h.s(textView2, false);
                }
                SingleAdView singleAdView2 = jVar2.t;
                if (singleAdView2 != null) {
                    p220oa.h.s(singleAdView2, false);
                }
            }
        }
        if (x(65, list)) {
            j jVar3 = this.f35091v;
            if (jVar3 != null) {
                TextView textView3 = jVar3.f4369v;
                if (textView3 != null) {
                    p220oa.h.s(textView3, true);
                }
                ImageView imageView3 = jVar3.f4370w;
                if (imageView3 != null) {
                    p220oa.h.s(imageView3, true);
                }
                SingleAdView singleAdView3 = jVar3.f4354A;
                if (singleAdView3 != null) {
                    p220oa.h.s(singleAdView3, true);
                }
            }
            arrayList.add(new HomeFragmentCache("invest"));
        } else {
            j jVar4 = this.f35091v;
            if (jVar4 != null) {
                TextView textView4 = jVar4.f4369v;
                if (textView4 != null) {
                    p220oa.h.s(textView4, false);
                }
                ImageView imageView4 = jVar4.f4370w;
                if (imageView4 != null) {
                    p220oa.h.s(imageView4, false);
                }
                SingleAdView singleAdView4 = jVar4.f4354A;
                if (singleAdView4 != null) {
                    p220oa.h.s(singleAdView4, false);
                }
            }
        }
        if (x(64, list)) {
            j jVar5 = this.f35091v;
            if (jVar5 != null) {
                jVar5.f(true);
            }
            arrayList.add(new HomeFragmentCache("palmzone"));
        } else {
            j jVar6 = this.f35091v;
            if (jVar6 != null) {
                jVar6.f(false);
            }
        }
        arrayList.add(new HomeFragmentCache("me"));
        HomeFragmentContainer homeFragmentContainer = this.f35081B;
        if (homeFragmentContainer != null) {
            ArrayList arrayList2 = new ArrayList();
            homeFragmentContainer.f35349a = arrayList2;
            arrayList2.addAll(arrayList);
            homeFragmentContainer.removeAllViews();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                FrameLayout frameLayout = new FrameLayout(homeFragmentContainer.getContext());
                frameLayout.setId(homeFragmentContainer.f35350b[i10]);
                homeFragmentContainer.addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
            }
        }
        HomeFragmentContainer homeFragmentContainer2 = this.f35081B;
        if (homeFragmentContainer2 != null) {
            Z childFragmentManager = getChildFragmentManager();
            childFragmentManager.getClass();
            homeFragmentContainer2.d(new C1161a(childFragmentManager), 0);
        }
        j jVar7 = this.f35091v;
        if (jVar7 != null) {
            jVar7.e(0);
        }
        HomeActivity homeActivity = (HomeActivity) getActivity();
        if (homeActivity != null) {
            HomeActivity.a aVar = HomeActivity.f34463H;
            homeActivity.m(homeActivity.getIntent());
        }
        Handler handler = this.f35092w;
        E activity3 = getActivity();
        if (activity3 != null && (window = activity3.getWindow()) != null) {
            decorView2 = window.getDecorView();
        }
        if (decorView2 != null) {
            decorView2.post(new r(handler, this, this, i7));
        }
        return this.f27318b;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment, com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f35092w.removeCallbacksAndMessages(null);
        c.b().l(this);
        g.f14172c = null;
        g.f14173d = null;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@NotNull MessageEvent event) {
        I i7;
        j jVar;
        Intrinsics.checkNotNullParameter(event, "event");
        int eventType = event.getEventType();
        if (eventType == 273 || eventType == 345) {
            if (this.f35082C) {
                return;
            }
            HomeFragmentHomeTab homeFragmentHomeTabC = C();
            if (homeFragmentHomeTabC != null && (i7 = (I) homeFragmentHomeTabC.f27328i) != null) {
                i7.queryMessages();
            }
            I i10 = (I) this.f27328i;
            if (i10 != null) {
                i10.queryLastTransactionHistory();
                return;
            }
            return;
        }
        if (eventType == 388) {
            UpdateActivity.l(requireContext());
            return;
        }
        if (eventType == 544) {
            CoinRainActivity.f34450i.start(getActivity(), null, event.getEventContent(), (String) event.getEventObj());
        } else if (eventType == 553 && (jVar = this.f35091v) != null) {
            jVar.e(jVar.f4355B);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.f35084L = true;
        this.f35082C = true;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        d.h(this.f27317a, 3, "onResume: ");
        F();
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.HomeFragmentContract$IView
    public final void queryLastTransactionHistoryOk(List list) {
        C();
        HomeMeFragment homeMeFragmentA = A();
        if (homeMeFragmentA != null) {
            homeMeFragmentA.queryLastTransactionHistoryOk(list);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment
    public final IBasePresenter t() {
        return new I();
    }

    public final int y() {
        HomeFragmentContainer homeFragmentContainer = this.f35081B;
        if (homeFragmentContainer != null) {
            return homeFragmentContainer.c("finance");
        }
        return -1;
    }

    public final HomeFinanceFragment z() {
        HomeFragmentContainer homeFragmentContainer;
        Fragment fragmentB;
        if (this.f35089o == null && (homeFragmentContainer = this.f35081B) != null && (fragmentB = homeFragmentContainer.b("finance")) != null) {
            if (!(fragmentB instanceof HomeFinanceFragment)) {
                fragmentB = null;
            }
            if (fragmentB != null) {
                this.f35089o = (HomeFinanceFragment) fragmentB;
            }
        }
        return this.f35089o;
    }
}

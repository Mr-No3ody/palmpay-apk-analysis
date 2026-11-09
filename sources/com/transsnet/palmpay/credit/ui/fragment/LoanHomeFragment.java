package com.transsnet.palmpay.credit.ui.fragment;

import C0.G;
import C9.C0158z;
import G9.i;
import L6.b;
import Pa.i0;
import Pa.r0;
import Wf.AbstractC0780y;
import Ya.e;
import Ya.f;
import Ya.g;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.E;
import androidx.fragment.app.Z;
import androidx.lifecycle.AbstractC1205o;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.V;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.adsdk.widgets.Interstitial.InterstitialAdView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.LocationRecord;
import com.transsnet.palmpay.core.bean.PalmPayLatLng;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.config.d;
import com.transsnet.palmpay.credit.base.CreditBaseMvvmFragment;
import com.transsnet.palmpay.credit.bean.LoanHomeDataInfoV2;
import com.transsnet.palmpay.credit.bean.ProductContentInfo;
import com.transsnet.palmpay.credit.handler.HomeDialogHandler$HandleCallBack;
import com.transsnet.palmpay.credit.handler.MultiLoanPopupHost;
import com.transsnet.palmpay.credit.ui.dialog.MoreFunctionDialogFragment;
import com.transsnet.palmpay.credit.ui.fragment.LoanHomeFragment;
import com.transsnet.palmpay.credit.viewmodel.OcHomeFinanceViewModel;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.managemoney.ui.activity.C1559e;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.PermissionUtils;
import com.transsnet.palmpay.util.SPUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C1850q;
import kotlin.collections.CollectionsKt;
import kotlin.collections.z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.greenrobot.eventbus.c;
import org.jetbrains.annotations.NotNull;
import org.sufficientlysecure.htmltextview.h;
import p129ib.m;
import p141j9.C1798f;
import p177m.j;
import p355xf.C2131j;
import p355xf.t;
import p377z5.l;
import p382zb.C2177u;
import p382zb.C2178v;
import p382zb.C2181y;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/fragment/LoanHomeFragment;", "Lcom/transsnet/palmpay/credit/base/CreditBaseMvvmFragment;", "Lcom/transsnet/palmpay/credit/viewmodel/OcHomeFinanceViewModel;", "Lcom/transsnet/palmpay/credit/handler/HomeDialogHandler$HandleCallBack;", "Lcom/transsnet/palmpay/credit/ui/fragment/LoanHomeRefreshHost;", "Lcom/transsnet/palmpay/credit/handler/MultiLoanPopupHost;", "<init>", "()V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLoanHomeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoanHomeFragment.kt\ncom/transsnet/palmpay/credit/ui/fragment/LoanHomeFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,755:1\n1#2:756\n171#3,12:757\n215#3:769\n808#4,11:770\n808#4,11:781\n*S KotlinDebug\n*F\n+ 1 LoanHomeFragment.kt\ncom/transsnet/palmpay/credit/ui/fragment/LoanHomeFragment\n*L\n225#1:757,12\n225#1:769\n369#1:770,11\n378#1:781,11\n*E\n"})
public final class LoanHomeFragment extends CreditBaseMvvmFragment<OcHomeFinanceViewModel> implements HomeDialogHandler$HandleCallBack, LoanHomeRefreshHost, MultiLoanPopupHost {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final a f30338Z = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f30339A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public LoanHomeDataInfoV2 f30340B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f30341C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f30342H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final t f30343L = C2131j.b(new C2177u(this, 0));

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final t f30344M = C2131j.b(new C2177u(this, 1));

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final t f30345Q = C2131j.b(new C2177u(this, 2));

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final t f30346X = C2131j.b(new C2177u(this, 3));

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final androidx.activity.result.a f30347Y;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TabLayoutMediator f30348j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public m f30349o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f30350p;
    public boolean t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f30351v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f30352w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final LoanHomeFragment newInstance() {
            LoanHomeFragment loanHomeFragment = new LoanHomeFragment();
            loanHomeFragment.setArguments(new Bundle());
            return loanHomeFragment;
        }

        private a() {
        }
    }

    public LoanHomeFragment() {
        androidx.activity.result.a aVarRegisterForActivityResult = registerForActivityResult(new j(), new i(this, 14));
        Intrinsics.checkNotNullExpressionValue(aVarRegisterForActivityResult, "registerForActivityResult(...)");
        this.f30347Y = aVarRegisterForActivityResult;
    }

    public final void A() {
        Context context;
        this.f30351v = true;
        LoanHomeDataInfoV2 loanHomeDataInfoV2 = this.f30340B;
        if (l.H(loanHomeDataInfoV2) && !this.f30352w && !this.f30339A && isAdded() && isResumed() && !isHidden()) {
            View view = this.f27318b;
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup == null) {
                return;
            }
            ArrayList arrayListD = l.D(loanHomeDataInfoV2, m());
            if (arrayListD.isEmpty() || (context = getContext()) == null) {
                return;
            }
            String str = (String) CollectionsKt.F(arrayListD);
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            AbstractC0780y.m(V.f(viewLifecycleOwner), null, null, new C2181y(this, viewGroup, arrayListD, context, str, null), 3);
        }
    }

    public final void B(TabLayout.Tab tab, boolean z3) {
        View customView;
        if (tab == null || (customView = tab.getCustomView()) == null) {
            return;
        }
        TextView textView = (TextView) customView.findViewById(e.tvTabText);
        AppCompatImageView appCompatImageView = (AppCompatImageView) customView.findViewById(e.ivTabIcon);
        int color = requireContext().getColor(b.ppColorFlexiCashPrimary);
        int color2 = requireContext().getColor(b.ppColorTextPrimary);
        textView.setTextColor(z3 ? color : color2);
        if (!z3) {
            color = color2;
        }
        appCompatImageView.setColorFilter(color);
        customView.setBackground(z3 ? requireContext().getDrawable(r.cv_shape_round_corner_dark) : null);
    }

    @Override // com.transsnet.palmpay.credit.handler.MultiLoanPopupHost
    public final ProductContentInfo findInstallmentProductForMultiLoanPopup() {
        LoanHomeDataInfoV2 loanHomeDataInfoV2 = this.f30340B;
        Object obj = null;
        List<ProductContentInfo> list = loanHomeDataInfoV2 != null ? loanHomeDataInfoV2.productContentInfo : null;
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
        return f.cs_fragment_loan_home;
    }

    @Override // com.transsnet.palmpay.credit.handler.MultiLoanPopupHost
    public final boolean isNewLoanHomeForMultiLoanPopup() {
        return true;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        OcHomeFinanceViewModel ocHomeFinanceViewModel = (OcHomeFinanceViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar = ocHomeFinanceViewModel != null ? ocHomeFinanceViewModel.f30907A : null;
        if (lVar == null) {
            return 0;
        }
        lVar.e(this, new p369yd.e(new p382zb.r(this, this, 1), (byte) 0));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        refreshLoanHomeData(true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        Intent intent;
        ViewPager2 viewPager2;
        final int i7 = 2;
        final int i10 = 0;
        final int i11 = 1;
        super.o();
        p118hf.a.e(this, (OcHomeFinanceViewModel) this.f27333i, new C1798f(this, 28));
        t tVar = this.f30345Q;
        PpTitleBar ppTitleBar = (PpTitleBar) tVar.getValue();
        if (ppTitleBar != null) {
            ppTitleBar.setRightImageView2ClickListener(new View.OnClickListener(this) { // from class: zb.t

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ LoanHomeFragment f44618b;

                {
                    this.f44618b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LoanHomeFragment loanHomeFragment = this.f44618b;
                    switch (i10) {
                        case 0:
                            LoanHomeFragment.a aVar = LoanHomeFragment.f30338Z;
                            loanHomeFragment.getClass();
                            String strG = d.g("/h5/help/main?cardNo=%1$s&deviceTag=%2$s&loanProduct=%3$s&phone=%4$s");
                            Intrinsics.checkNotNullExpressionValue(strG, "getH5Url(...)");
                            String str = String.format(strG, Arrays.copyOf(new Object[]{"", "", "OK_CARD", G.A()}, 4));
                            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                            i0.c0(str);
                            break;
                        case 1:
                            LoanHomeFragment.a aVar2 = LoanHomeFragment.f30338Z;
                            MoreFunctionDialogFragment moreFunctionDialogFragmentNewInstance = MoreFunctionDialogFragment.f30000C.newInstance();
                            Z childFragmentManager = loanHomeFragment.getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                            moreFunctionDialogFragmentNewInstance.show(childFragmentManager, "showMoreFunctionDialog");
                            break;
                        default:
                            LoanHomeFragment.a aVar3 = LoanHomeFragment.f30338Z;
                            E activity = loanHomeFragment.getActivity();
                            if (activity != null) {
                                activity.onBackPressed();
                            }
                            break;
                    }
                }
            });
        }
        PpTitleBar ppTitleBar2 = (PpTitleBar) tVar.getValue();
        if (ppTitleBar2 != null) {
            ppTitleBar2.setRightImageView1ClickListener(new View.OnClickListener(this) { // from class: zb.t

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ LoanHomeFragment f44618b;

                {
                    this.f44618b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LoanHomeFragment loanHomeFragment = this.f44618b;
                    switch (i11) {
                        case 0:
                            LoanHomeFragment.a aVar = LoanHomeFragment.f30338Z;
                            loanHomeFragment.getClass();
                            String strG = d.g("/h5/help/main?cardNo=%1$s&deviceTag=%2$s&loanProduct=%3$s&phone=%4$s");
                            Intrinsics.checkNotNullExpressionValue(strG, "getH5Url(...)");
                            String str = String.format(strG, Arrays.copyOf(new Object[]{"", "", "OK_CARD", G.A()}, 4));
                            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                            i0.c0(str);
                            break;
                        case 1:
                            LoanHomeFragment.a aVar2 = LoanHomeFragment.f30338Z;
                            MoreFunctionDialogFragment moreFunctionDialogFragmentNewInstance = MoreFunctionDialogFragment.f30000C.newInstance();
                            Z childFragmentManager = loanHomeFragment.getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                            moreFunctionDialogFragmentNewInstance.show(childFragmentManager, "showMoreFunctionDialog");
                            break;
                        default:
                            LoanHomeFragment.a aVar3 = LoanHomeFragment.f30338Z;
                            E activity = loanHomeFragment.getActivity();
                            if (activity != null) {
                                activity.onBackPressed();
                            }
                            break;
                    }
                }
            });
        }
        PpTitleBar ppTitleBar3 = (PpTitleBar) tVar.getValue();
        if (ppTitleBar3 != null) {
            ppTitleBar3.setBackButtonClickListener(new View.OnClickListener(this) { // from class: zb.t

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ LoanHomeFragment f44618b;

                {
                    this.f44618b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LoanHomeFragment loanHomeFragment = this.f44618b;
                    switch (i7) {
                        case 0:
                            LoanHomeFragment.a aVar = LoanHomeFragment.f30338Z;
                            loanHomeFragment.getClass();
                            String strG = d.g("/h5/help/main?cardNo=%1$s&deviceTag=%2$s&loanProduct=%3$s&phone=%4$s");
                            Intrinsics.checkNotNullExpressionValue(strG, "getH5Url(...)");
                            String str = String.format(strG, Arrays.copyOf(new Object[]{"", "", "OK_CARD", G.A()}, 4));
                            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                            i0.c0(str);
                            break;
                        case 1:
                            LoanHomeFragment.a aVar2 = LoanHomeFragment.f30338Z;
                            MoreFunctionDialogFragment moreFunctionDialogFragmentNewInstance = MoreFunctionDialogFragment.f30000C.newInstance();
                            Z childFragmentManager = loanHomeFragment.getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                            moreFunctionDialogFragmentNewInstance.show(childFragmentManager, "showMoreFunctionDialog");
                            break;
                        default:
                            LoanHomeFragment.a aVar3 = LoanHomeFragment.f30338Z;
                            E activity = loanHomeFragment.getActivity();
                            if (activity != null) {
                                activity.onBackPressed();
                            }
                            break;
                    }
                }
            });
        }
        ArrayList arrayListE = C1850q.e(LoanProductListFragment.f30354p.newInstance(), LoanRepaymentListFragment.f30356w.newInstance());
        t tVar2 = this.f30344M;
        ViewPager2 viewPager3 = (ViewPager2) tVar2.getValue();
        if (viewPager3 != null) {
            t tVar3 = this.f30343L;
            TabLayout tabLayout = (TabLayout) tVar3.getValue();
            if (tabLayout != null) {
                Z childFragmentManager = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                AbstractC1205o lifecycle = getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                viewPager3.setAdapter(new p052da.E(childFragmentManager, lifecycle, arrayListE, 1));
                TabLayoutMediator tabLayoutMediator = this.f30348j;
                if (tabLayoutMediator != null) {
                    tabLayoutMediator.detach();
                }
                TabLayoutMediator tabLayoutMediator2 = new TabLayoutMediator(tabLayout, viewPager3, new p287se.d(this, 26));
                tabLayoutMediator2.attach();
                this.f30348j = tabLayoutMediator2;
                tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C2178v(this));
                TabLayout tabLayout2 = (TabLayout) tVar3.getValue();
                if (tabLayout2 != null) {
                    int tabCount = tabLayout2.getTabCount();
                    int i12 = 0;
                    while (i12 < tabCount) {
                        B(tabLayout2.getTabAt(i12), i12 == tabLayout2.getSelectedTabPosition());
                        i12++;
                    }
                }
                E activity = getActivity();
                if (activity != null && (intent = activity.getIntent()) != null && "repayment".equals(intent.getStringExtra("tab")) && (viewPager2 = (ViewPager2) tVar2.getValue()) != null) {
                    viewPager2.setCurrentItem(1, false);
                }
            }
        }
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        View viewFindViewWithTag;
        View view = this.f27318b;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        Intrinsics.checkNotNullParameter("cs_loan_home_onboarding_overlay", "tag");
        if (viewGroup != null && (viewFindViewWithTag = viewGroup.findViewWithTag("cs_loan_home_onboarding_overlay")) != null) {
            viewGroup.removeView(viewFindViewWithTag);
        }
        this.f30352w = false;
        TabLayoutMediator tabLayoutMediator = this.f30348j;
        if (tabLayoutMediator != null) {
            tabLayoutMediator.detach();
        }
        this.f30348j = null;
        super.onDestroyView();
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z3) {
        super.onHiddenChanged(z3);
        if (z3) {
            return;
        }
        x();
    }

    @Override // com.transsnet.palmpay.credit.handler.MultiLoanPopupHost
    public final void onMultiLoanPopupCta(ProductContentInfo product) {
        Intrinsics.checkNotNullParameter(product, "product");
        LoanProductListFragment loanProductListFragmentV = v();
        if (loanProductListFragmentV != null) {
            loanProductListFragmentV.onApplyClick(product);
        }
    }

    @Override // com.transsnet.palmpay.credit.handler.HomeDialogHandler$HandleCallBack
    public final void onNoDialogToHandle() {
        InterstitialAdView interstitialAdView;
        int i7 = 1;
        F6.d.h("LoanHomeLoggedFragment", 3, "onNoDialogToHandle >>>");
        if (this.t) {
            A();
            return;
        }
        E activity = getActivity();
        if (ActivityUtils.isValidActivityContext(activity)) {
            F6.d.h("LoanHomeLoggedFragment", 3, "showAdDialog >>> start");
            String string = BaseApplication.get().getString(g.cs_ad_home_finance_pop_slot_id);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            C0158z c0158z = new C0158z(this, 20);
            if (TextUtils.isEmpty(string)) {
                interstitialAdView = null;
            } else {
                InterstitialAdView interstitialAdView2 = new InterstitialAdView(string, 1, c0158z, new h(9));
                interstitialAdView2.setUseRemoteWebView(false);
                interstitialAdView = interstitialAdView2;
            }
            interstitialAdView.show(activity, new C1559e(this, i7));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.f30342H = true;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        List<Activity> activityList;
        super.onResume();
        x();
        if (this.f30342H) {
            this.f30342H = false;
            Activity activityO = com.facebook.imagepipeline.nativecode.b.o("LoanHome", "LoanTabHome");
            if (activityO == null || (activityList = ActivityUtils.getActivityList()) == null || activityList.isEmpty() || CollectionsKt.K(activityList) != activityO) {
                if (y()) {
                    refreshLoanHomeData(false);
                    return;
                }
                LoanRepaymentListFragment loanRepaymentListFragmentW = w();
                if (loanRepaymentListFragmentW != null) {
                    loanRepaymentListFragmentW.v(false, true);
                } else {
                    refreshLoanHomeData(false);
                }
            }
        }
    }

    @Override // com.transsnet.palmpay.credit.ui.fragment.LoanHomeRefreshHost
    public final void refreshLoanHomeData(boolean z3) {
        OcHomeFinanceViewModel ocHomeFinanceViewModel = (OcHomeFinanceViewModel) this.f27333i;
        if (ocHomeFinanceViewModel == null || !BaseApplication.hasLogin()) {
            return;
        }
        p140j8.f.s(ocHomeFinanceViewModel, new Jb.t(1, null), ocHomeFinanceViewModel.f30907A, 0L, z3, false);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0029  */
    /* JADX WARN: Code duplicated, block: B:18:0x002f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0031  */
    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    /* JADX WARN: Code duplicated, block: B:27:0x0043 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0045  */
    /* JADX WARN: Code duplicated, block: B:29:0x0048  */
    /* JADX WARN: Code duplicated, block: B:31:0x004b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0059  */
    public final void t(LoanHomeDataInfoV2 loanHomeDataInfoV2) {
        String str;
        String str2;
        this.f30340B = loanHomeDataInfoV2;
        ImageView imageView = (ImageView) this.f30346X.getValue();
        if (imageView != null) {
            String str3 = null;
            if (m()) {
                String str4 = loanHomeDataInfoV2 != null ? loanHomeDataInfoV2.topFMBDark : null;
                if (str4 == null || StringsKt.F(str4)) {
                    if (m()) {
                        if (loanHomeDataInfoV2 != null) {
                            str = loanHomeDataInfoV2.topFMBDark;
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            if (loanHomeDataInfoV2 != null) {
                                str3 = loanHomeDataInfoV2.topFMB;
                            }
                        } else if (loanHomeDataInfoV2 != null) {
                            str3 = loanHomeDataInfoV2.topFMB;
                        }
                    } else {
                        if (loanHomeDataInfoV2 != null) {
                            str2 = loanHomeDataInfoV2.topFMB;
                        } else {
                            str2 = null;
                        }
                        if (str2 != null) {
                            if (loanHomeDataInfoV2 != null) {
                                str = loanHomeDataInfoV2.topFMBDark;
                            } else {
                                str = null;
                            }
                            if (str != null) {
                                if (loanHomeDataInfoV2 != null) {
                                    str3 = loanHomeDataInfoV2.topFMB;
                                }
                            } else if (loanHomeDataInfoV2 != null) {
                                str3 = loanHomeDataInfoV2.topFMB;
                            }
                        } else {
                            if (loanHomeDataInfoV2 != null) {
                                str = loanHomeDataInfoV2.topFMBDark;
                            } else {
                                str = null;
                            }
                            if (str != null) {
                                if (loanHomeDataInfoV2 != null) {
                                    str3 = loanHomeDataInfoV2.topFMB;
                                }
                            } else if (loanHomeDataInfoV2 != null) {
                                str3 = loanHomeDataInfoV2.topFMB;
                            }
                        }
                    }
                } else if (loanHomeDataInfoV2 != null) {
                    str3 = loanHomeDataInfoV2.topFMBDark;
                }
            } else if (m()) {
                if (loanHomeDataInfoV2 != null) {
                    str = loanHomeDataInfoV2.topFMBDark;
                } else {
                    str = null;
                }
                if (str != null || StringsKt.F(str)) {
                    if (loanHomeDataInfoV2 != null) {
                        str3 = loanHomeDataInfoV2.topFMB;
                    }
                } else if (loanHomeDataInfoV2 != null) {
                    str3 = loanHomeDataInfoV2.topFMBDark;
                }
            } else {
                if (loanHomeDataInfoV2 != null) {
                    str2 = loanHomeDataInfoV2.topFMB;
                } else {
                    str2 = null;
                }
                if (str2 != null || StringsKt.F(str2)) {
                    if (loanHomeDataInfoV2 != null) {
                        str = loanHomeDataInfoV2.topFMBDark;
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        if (loanHomeDataInfoV2 != null) {
                            str3 = loanHomeDataInfoV2.topFMB;
                        }
                    } else if (loanHomeDataInfoV2 != null) {
                        str3 = loanHomeDataInfoV2.topFMB;
                    }
                } else if (loanHomeDataInfoV2 != null) {
                    str3 = loanHomeDataInfoV2.topFMB;
                }
            }
            if (str3 == null || StringsKt.F(str3)) {
                imageView.setImageResource(Ya.d.cs_loan_home_product_logo);
            } else {
                r0.l1(str3, imageView);
            }
        }
        LoanHomeDataInfoV2 loanHomeDataInfoV3 = this.f30340B;
        if (loanHomeDataInfoV3 != null) {
            u(loanHomeDataInfoV3);
        }
        m mVar = this.f30349o;
        if (mVar != null) {
            mVar.c();
        }
        if (l.H(loanHomeDataInfoV2)) {
            ArrayList urls = l.D(loanHomeDataInfoV2, m());
            Context context = getContext();
            Intrinsics.checkNotNullParameter(urls, "urls");
            if (context != null && !urls.isEmpty()) {
                Iterator it = urls.iterator();
                while (it.hasNext()) {
                    r0.D1(context, (String) it.next());
                }
            }
        }
        if (this.f30351v) {
            A();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v7, types: [kotlin.collections.z] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v17, types: [com.transsnet.palmpay.credit.view.ProductContentListView] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void u(LoanHomeDataInfoV2 loanHomeDataInfoV2) {
        LoanProductListFragment loanProductListFragmentV = v();
        if (loanProductListFragmentV != null) {
            boolean zY = y();
            if (loanProductListFragmentV.isAdded()) {
                p099gb.i iVar = (p099gb.i) loanProductListFragmentV.f27335j;
                if (iVar != null) {
                    iVar.f37165e.setRefreshing(false);
                }
                loanProductListFragmentV.showLoadingDialog(false);
                ViewBinding viewBinding = loanProductListFragmentV.f27335j;
                if (viewBinding == null || !zY) {
                    return;
                }
                ?? arrayList = 0;
                if (loanHomeDataInfoV2 == null) {
                    loanProductListFragmentV.v();
                    p099gb.i iVar2 = (p099gb.i) loanProductListFragmentV.f27335j;
                    if (iVar2 != null) {
                        iVar2.f37167g.g(null);
                    }
                    p099gb.i iVar3 = (p099gb.i) loanProductListFragmentV.f27335j;
                    if (iVar3 != null) {
                        iVar3.f37168i.f(null);
                        return;
                    }
                    return;
                }
                org.chromium.support_lib_boundary.util.b.c(((p099gb.i) viewBinding).f37162b);
                p099gb.i iVar4 = (p099gb.i) loanProductListFragmentV.f27335j;
                if (iVar4 != null) {
                    iVar4.f37162b.setSlotId(loanHomeDataInfoV2.topAdvertisementId);
                }
                p099gb.i iVar5 = (p099gb.i) loanProductListFragmentV.f27335j;
                if (iVar5 != null) {
                    iVar5.f37163c.setVisibility(0);
                }
                View view = loanProductListFragmentV.f30355o;
                if (view != null) {
                    view.setVisibility(8);
                }
                List<ProductContentInfo> list = loanHomeDataInfoV2.productContentInfo;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (!Intrinsics.c(((ProductContentInfo) obj).isOtherLoan, Boolean.TRUE)) {
                            arrayList.add(obj);
                        }
                    }
                }
                if (arrayList == 0) {
                    arrayList = z.f38935a;
                }
                p099gb.i iVar6 = (p099gb.i) loanProductListFragmentV.f27335j;
                if (iVar6 != null) {
                    iVar6.f37167g.g(loanHomeDataInfoV2.outstandingContentInfo);
                }
                p099gb.i iVar7 = (p099gb.i) loanProductListFragmentV.f27335j;
                if (iVar7 != null) {
                    iVar7.f37168i.f(arrayList);
                }
                p099gb.i iVar8 = (p099gb.i) loanProductListFragmentV.f27335j;
                if (iVar8 != null) {
                    iVar8.f37166f.e(p186mb.d.f39634e.getInstance().f39636a, loanHomeDataInfoV2.bottomFMB, loanHomeDataInfoV2.bottomFMBDark);
                }
            }
        }
    }

    public final LoanProductListFragment v() {
        List listF = getChildFragmentManager().f17069c.f();
        Intrinsics.checkNotNullExpressionValue(listF, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : listF) {
            if (obj instanceof LoanProductListFragment) {
                arrayList.add(obj);
            }
        }
        return (LoanProductListFragment) CollectionsKt.firstOrNull(arrayList);
    }

    public final LoanRepaymentListFragment w() {
        List listF = getChildFragmentManager().f17069c.f();
        Intrinsics.checkNotNullExpressionValue(listF, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : listF) {
            if (obj instanceof LoanRepaymentListFragment) {
                arrayList.add(obj);
            }
        }
        return (LoanRepaymentListFragment) CollectionsKt.firstOrNull(arrayList);
    }

    public final void x() {
        List<Activity> activityList;
        Activity activityO = com.facebook.imagepipeline.nativecode.b.o("LoanHome", "LoanTabHome");
        if ((activityO == null || (activityList = ActivityUtils.getActivityList()) == null || activityList.isEmpty() || CollectionsKt.K(activityList) != activityO) ? false : true) {
            F6.d.h("LoanHomeLoggedFragment", 3, "handlePageVisible skip: RN LoanHome on top");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f30350p <= 100) {
            F6.d.h("LoanHomeLoggedFragment", 5, "showLoanHomeDialog >>> intercept");
        } else {
            this.f30350p = jCurrentTimeMillis;
            if (isAdded() && BaseApplication.hasLogin()) {
                F6.d.h("LoanHomeLoggedFragment", 3, "showLoanHomeDialog >>> " + this.f30349o);
                m mVar = this.f30349o;
                if (mVar == null) {
                    mVar = new m(this);
                    Intrinsics.checkNotNullParameter(this, "callBack");
                    mVar.f37485d = this;
                    this.f30349o = mVar;
                }
                int i7 = m.f37481g;
                mVar.a(null);
            }
        }
        if (PermissionUtils.isGranted(d.j())) {
            z();
        } else {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            long j6 = SPUtils.getInstance().getLong("last_permission_request_time", 0L);
            if (j6 == 0 || jCurrentTimeMillis2 - j6 >= 86400000) {
                SPUtils.getInstance().put("last_permission_request_time", jCurrentTimeMillis2);
                this.f30347Y.a(new String[]{"android.permission.ACCESS_COARSE_LOCATION", d.j()});
            }
        }
        if (this.f30351v) {
            A();
        }
    }

    public final boolean y() {
        ViewPager2 viewPager2 = (ViewPager2) this.f30344M.getValue();
        return viewPager2 != null && viewPager2.getCurrentItem() == 0;
    }

    public final void z() {
        PalmPayLatLng location;
        c.b().f(new MessageEvent(MessageEvent.EVENT_REFRESH_LOCATION));
        LocationRecord locationRecordF = p367ya.a.d().f();
        OcHomeFinanceViewModel ocHomeFinanceViewModel = (OcHomeFinanceViewModel) this.f27333i;
        if (ocHomeFinanceViewModel != null) {
            ocHomeFinanceViewModel.f((locationRecordF == null || (location = locationRecordF.getLocation()) == null) ? null : Long.valueOf(location.locateTime), "LOAN_TAB");
        }
    }
}

package Ce;

import Pa.AbstractC0508e;
import Wf.AbstractC0780y;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import androidx.lifecycle.C1212w;
import androidx.lifecycle.EnumC1204n;
import androidx.lifecycle.LifecycleOwner;
import com.transsnet.adsdk.BatchAdManager;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.adsdk.widgets.snackbar.SnackBarAdView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.ui.fragment.HomeFragment;
import com.transsnet.palmpay.ui.fragment.HomeFragmentHomeTab;
import com.transsnet.palmpay.ui.view.HomeScrollView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: renamed from: Ce.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC0178u implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HomeFragmentHomeTab f1535b;

    public /* synthetic */ RunnableC0178u(HomeFragmentHomeTab homeFragmentHomeTab, int i7) {
        this.f1534a = i7;
        this.f1535b = homeFragmentHomeTab;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x001c  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        Context applicationContext;
        String strAddBatchAd;
        View viewInflate;
        View viewInflate2;
        HomeFragmentHomeTab homeFragmentHomeTab = this.f1535b;
        int i7 = 1;
        boolean zB = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (this.f1534a) {
            case 0:
                int i10 = HomeFragmentHomeTab.f35093A0;
                Fe.I i11 = (Fe.I) homeFragmentHomeTab.f27328i;
                if (i11 != null) {
                    i11.queryMessages();
                }
                break;
            case 1:
                int i12 = HomeFragmentHomeTab.f35093A0;
                Regex regex = AbstractC0508e.f7078a;
                try {
                    zB = p183m6.n.f39523a.instance().b("featureHomepageClipboardPopUp", false);
                    break;
                } catch (Exception unused) {
                }
                if (zB && BaseApplication.hasLogin() && homeFragmentHomeTab.isResumed() && ((C1212w) homeFragmentHomeTab.getViewLifecycleOwner().getLifecycle()).f17478d.a(EnumC1204n.f17464e) && (context = homeFragmentHomeTab.getContext()) != null && (applicationContext = context.getApplicationContext()) != null) {
                    LifecycleOwner viewLifecycleOwner = homeFragmentHomeTab.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC0780y.m(androidx.lifecycle.V.f(viewLifecycleOwner), null, null, new C0180w(homeFragmentHomeTab, applicationContext, null), 3);
                    break;
                }
                break;
            case 2:
                Je.d dVar = homeFragmentHomeTab.f35110r0;
                if (dVar != null && dVar.f4779c) {
                    Ie.q.f4388a.showNextCorner(dVar.f4784h);
                    dVar.c();
                    dVar.f4779c = false;
                }
                homeFragmentHomeTab.C();
                HomeScrollView homeScrollViewW = homeFragmentHomeTab.w();
                if (homeScrollViewW != null) {
                    homeScrollViewW.r();
                }
                break;
            case 3:
                int i13 = HomeFragmentHomeTab.f35093A0;
                Fe.I i14 = (Fe.I) homeFragmentHomeTab.f27328i;
                if (i14 != null) {
                    i14.queryHomeBusinessInfo();
                }
                break;
            case 4:
                int i15 = HomeFragmentHomeTab.f35093A0;
                HomeFragment homeFragment = (HomeFragment) homeFragmentHomeTab.getParentFragment();
                if (homeFragment != null) {
                    homeFragment.G(false);
                }
                break;
            default:
                int i16 = HomeFragmentHomeTab.f35093A0;
                boolean zB2 = p183m6.n.f39523a.instance().b("featureBatchPullAd", false);
                if (homeFragmentHomeTab.f35096C == null) {
                    ViewStub viewStub = (ViewStub) homeFragmentHomeTab.f27318b.findViewById(Ac.e.asyncGuestTopAd);
                    if (viewStub != null && (viewInflate = viewStub.inflate()) != null) {
                        SingleAdView singleAdView = (SingleAdView) viewInflate.findViewById(Ac.e.adHomeGuestTop);
                        homeFragmentHomeTab.f35096C = singleAdView;
                        if (singleAdView != null) {
                            singleAdView.setAdListener(new F(homeFragmentHomeTab, i7));
                        }
                        SingleAdView singleAdView2 = homeFragmentHomeTab.f35096C;
                        if (singleAdView2 != null) {
                            singleAdView2.setSlotId(CommonViewExtKt.string(Ac.h.main_ad_home_guest_top, homeFragmentHomeTab.getContext()), !zB2);
                        }
                    }
                    if (zB2) {
                        strAddBatchAd = BatchAdManager.INSTANCE.addBatchAd(homeFragmentHomeTab.f35096C);
                    } else {
                        strAddBatchAd = null;
                    }
                } else {
                    strAddBatchAd = null;
                }
                ViewStub viewStub2 = (ViewStub) homeFragmentHomeTab.f27318b.findViewById(Ac.e.ch_signup_login_text_area_stub);
                if (viewStub2 != null && (viewInflate2 = viewStub2.inflate()) != null) {
                    p220oa.h.s(viewInflate2, true);
                    SingleAdView singleAdView3 = (SingleAdView) viewInflate2.findViewById(Ac.e.homeBottomAd);
                    homeFragmentHomeTab.f35099M = singleAdView3;
                    if (singleAdView3 != null) {
                        singleAdView3.setAdListener(new F(homeFragmentHomeTab, objArr2 == true ? 1 : 0));
                    }
                    SingleAdView singleAdView4 = homeFragmentHomeTab.f35099M;
                    if (singleAdView4 != null) {
                        singleAdView4.setSlotId(CommonViewExtKt.string(Ac.h.main_ad_home_not_log_in, viewInflate2.getContext()), !zB2);
                    }
                    if (zB2) {
                        if (TextUtils.isEmpty(strAddBatchAd)) {
                            strAddBatchAd = BatchAdManager.INSTANCE.addBatchAd(homeFragmentHomeTab.f35099M);
                        } else {
                            BatchAdManager.INSTANCE.appendBatchAd(strAddBatchAd, homeFragmentHomeTab.f35099M);
                        }
                    }
                }
                ViewStub viewStub3 = (ViewStub) homeFragmentHomeTab.f27318b.findViewById(Ac.e.middleAdStub);
                if (viewStub3 != null) {
                    View viewInflate3 = viewStub3.inflate();
                    SingleAdView singleAdView5 = viewInflate3 != null ? (SingleAdView) viewInflate3.findViewById(Ac.e.middleHomeBanner1) : null;
                    if (singleAdView5 != null) {
                        singleAdView5.setAdListener(new G(singleAdView5));
                        singleAdView5.setSlotId(CommonViewExtKt.string(Ac.h.main_ad_home_middle_banner, viewStub3.getContext()), !zB2);
                    }
                    if (zB2) {
                        if (TextUtils.isEmpty(strAddBatchAd)) {
                            strAddBatchAd = BatchAdManager.INSTANCE.addBatchAd(singleAdView5);
                        } else {
                            BatchAdManager.INSTANCE.appendBatchAd(strAddBatchAd, singleAdView5);
                        }
                    }
                }
                if (zB2) {
                    homeFragmentHomeTab.f35094A = strAddBatchAd;
                    BatchAdManager.INSTANCE.refreshBatchAd(strAddBatchAd);
                }
                if (homeFragmentHomeTab.isAdded() && !homeFragmentHomeTab.isDetached()) {
                    try {
                        String string = homeFragmentHomeTab.getString(Ac.h.main_home_tab_snack_slot_id);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        new SnackBarAdView(string, new Ab.k(7)).show(homeFragmentHomeTab.getContext(), new J(homeFragmentHomeTab, objArr == true ? 1 : 0));
                    } catch (Exception unused2) {
                        return;
                    }
                    break;
                }
                break;
        }
    }
}

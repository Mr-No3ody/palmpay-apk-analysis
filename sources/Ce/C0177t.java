package Ce;

import android.view.View;
import android.view.ViewStub;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.mikepenz.iconics.view.IconicsTextView;
import com.transsnet.adsdk.data.local.entity.AdEntity;
import com.transsnet.adsdk.widgets.MarqueeTextView.MarqueeViewV2;
import com.transsnet.adsdk.widgets.banner.BannerAdView;
import com.transsnet.adsdk.widgets.banner.bannerview.BannerViewPager;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.ui.fragment.HomeFragmentHomeTab;
import com.transsnet.palmpay.util.MainAdUtils;
import com.zhpan.indicator.IndicatorView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ce.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0177t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HomeFragmentHomeTab f1531b;

    public /* synthetic */ C0177t(HomeFragmentHomeTab homeFragmentHomeTab, int i7) {
        this.f1530a = i7;
        this.f1531b = homeFragmentHomeTab;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BannerViewPager<AdEntity> indicatorVisibility;
        int i7 = 0;
        HomeFragmentHomeTab homeFragmentHomeTab = this.f1531b;
        switch (this.f1530a) {
            case 0:
                View view = (View) obj;
                int i10 = HomeFragmentHomeTab.f35093A0;
                Intrinsics.checkNotNullParameter(view, "view");
                boolean z3 = BaseApplication.hasLogin() && com.horcrux.svg.d0.t();
                if (homeFragmentHomeTab.f35115v0 == null) {
                    Ie.h hVar = new Ie.h();
                    hVar.f4342a = view;
                    if (view != null) {
                        int i11 = Ac.e.bottomBarrier;
                        if (((Barrier) p059e1.a.m(i11, view)) != null) {
                            i11 = Ac.e.bottomSpace;
                            if (((Space) p059e1.a.m(i11, view)) != null) {
                                i11 = Ac.e.groupNotNetwork;
                                Group group = (Group) p059e1.a.m(i11, view);
                                if (group != null) {
                                    i11 = Ac.e.ivBg;
                                    if (((AppCompatImageView) p059e1.a.m(i11, view)) != null) {
                                        i11 = Ac.e.ivEye;
                                        AppCompatImageView appCompatImageView = (AppCompatImageView) p059e1.a.m(i11, view);
                                        if (appCompatImageView != null) {
                                            i11 = Ac.e.ivTipsBg;
                                            if (((AppCompatImageView) p059e1.a.m(i11, view)) != null) {
                                                i11 = Ac.e.loadingViewStub;
                                                ViewStub viewStub = (ViewStub) p059e1.a.m(i11, view);
                                                if (viewStub != null) {
                                                    i11 = Ac.e.tvAmount;
                                                    TextView textView = (TextView) p059e1.a.m(i11, view);
                                                    if (textView != null) {
                                                        i11 = Ac.e.tvFund;
                                                        TextView textView2 = (TextView) p059e1.a.m(i11, view);
                                                        if (textView2 != null) {
                                                            i11 = Ac.e.tvNetworkTips;
                                                            TextView textView3 = (TextView) p059e1.a.m(i11, view);
                                                            if (textView3 != null) {
                                                                i11 = Ac.e.tvTitle;
                                                                IconicsTextView iconicsTextView = (IconicsTextView) p059e1.a.m(i11, view);
                                                                if (iconicsTextView != null) {
                                                                    i11 = Ac.e.tvTransHistory;
                                                                    if (((IconicsTextView) p059e1.a.m(i11, view)) != null) {
                                                                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                                                        hVar.f4344c = new Bc.f(constraintLayout, group, appCompatImageView, viewStub, textView, textView2, textView3, iconicsTextView);
                                                                        int i12 = Ac.e.ivBusinessIcon;
                                                                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) p059e1.a.m(i12, view);
                                                                        if (appCompatImageView2 != null) {
                                                                            i12 = Ac.e.ivBusinessJumpIcon;
                                                                            AppCompatImageView appCompatImageView3 = (AppCompatImageView) p059e1.a.m(i12, view);
                                                                            if (appCompatImageView3 != null) {
                                                                                i12 = Ac.e.rootAccountBottom;
                                                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) p059e1.a.m(i12, view);
                                                                                if (constraintLayout2 != null) {
                                                                                    i12 = Ac.e.tvContent;
                                                                                    TextView textView4 = (TextView) p059e1.a.m(i12, view);
                                                                                    if (textView4 != null) {
                                                                                        i12 = Ac.e.tvJumpContent;
                                                                                        TextView textView5 = (TextView) p059e1.a.m(i12, view);
                                                                                        if (textView5 != null) {
                                                                                            hVar.f4345d = new Bc.k(constraintLayout, appCompatImageView2, appCompatImageView3, constraintLayout2, textView4, textView5, 3);
                                                                                            hVar.f4346e = view.findViewById(Ac.e.accountTopModule);
                                                                                            hVar.f4347f = view.findViewById(Ac.e.accountBottomModule);
                                                                                            Pa.r0.R1(textView, "fonts/PalmPayNum-Bold.ttf");
                                                                                            ((TextView) view.findViewById(Ac.e.tvTransHistory)).setOnClickListener(hVar);
                                                                                            ((TextView) view.findViewById(Ac.e.tvFund)).setOnClickListener(hVar);
                                                                                            textView.setOnClickListener(hVar);
                                                                                            appCompatImageView.setOnClickListener(hVar);
                                                                                            constraintLayout2.setOnClickListener(new Ha.d(hVar, 10));
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i12)));
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
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
                    }
                    homeFragmentHomeTab.f35115v0 = hVar;
                }
                if (z3) {
                    p220oa.h.s(view, false);
                } else {
                    p220oa.h.s(view, true);
                    homeFragmentHomeTab.C();
                }
                return Unit.f38893a;
            case 1:
                View it = (View) obj;
                int i13 = HomeFragmentHomeTab.f35093A0;
                Intrinsics.checkNotNullParameter(it, "it");
                homeFragmentHomeTab.f35098L = (BannerAdView) homeFragmentHomeTab.f27318b.findViewById(Ac.e.adBannerTop);
                if (homeFragmentHomeTab.isDetached() || !homeFragmentHomeTab.isAdded() || homeFragmentHomeTab.isRemoving()) {
                    F6.d.h(homeFragmentHomeTab.f27317a, 3, "initActivityBanner invalid fragment state");
                    return Unit.f38893a;
                }
                BannerAdView bannerAdView = homeFragmentHomeTab.f35098L;
                if (bannerAdView != null) {
                    bannerAdView.setSlotId(MainAdUtils.getAdSlotId(Ac.h.main_ad_home_banner_slot_id));
                }
                IndicatorView indicatorView = (IndicatorView) homeFragmentHomeTab.f27318b.findViewById(Ac.e.banner_indicator_view);
                BannerAdView bannerAdView2 = homeFragmentHomeTab.f35098L;
                if (bannerAdView2 != null && (indicatorVisibility = bannerAdView2.setIndicatorVisibility(8)) != null) {
                    indicatorVisibility.setIndicatorView(indicatorView);
                }
                BannerAdView bannerAdView3 = homeFragmentHomeTab.f35098L;
                if (bannerAdView3 != null) {
                    bannerAdView3.setAdListener(new E(i7, indicatorView, homeFragmentHomeTab));
                }
                return Unit.f38893a;
            default:
                View it2 = (View) obj;
                int i14 = HomeFragmentHomeTab.f35093A0;
                Intrinsics.checkNotNullParameter(it2, "it");
                homeFragmentHomeTab.f35100Q = (MarqueeViewV2) homeFragmentHomeTab.f27318b.findViewById(Ac.e.topTextAd);
                if (homeFragmentHomeTab.isDetached() || !homeFragmentHomeTab.isAdded() || homeFragmentHomeTab.isRemoving()) {
                    F6.d.h(homeFragmentHomeTab.f27317a, 3, "setupTextAdView invalid fragment state");
                    MarqueeViewV2 marqueeViewV2 = homeFragmentHomeTab.f35100Q;
                    if (marqueeViewV2 != null) {
                        marqueeViewV2.release();
                    }
                    return Unit.f38893a;
                }
                MarqueeViewV2 marqueeViewV3 = homeFragmentHomeTab.f35100Q;
                if (marqueeViewV3 != null) {
                    marqueeViewV3.setSlotId(MainAdUtils.getAdSlotId(Ac.h.main_home_top_text_slot_id));
                }
                MarqueeViewV2 marqueeViewV4 = homeFragmentHomeTab.f35100Q;
                if (marqueeViewV4 != null) {
                    marqueeViewV4.setAdListener(new F(homeFragmentHomeTab, 2));
                }
                return Unit.f38893a;
        }
    }
}

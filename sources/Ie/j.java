package Ie;

import C0.G;
import Fe.I;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.mikepenz.iconics.IconicsDrawable;
import com.transsnet.adsdk.BatchAdManager;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.rsp.HomeMenuBean;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.ui.fragment.HomeFragment;
import com.transsnet.palmpay.ui.widget.HomeFragmentContainer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements View.OnClickListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public SingleAdView f4354A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f4355B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public List f4356C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public String f4357H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HomeFragment f4358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f4359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f4360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f4361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f4362e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f4363f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SingleAdView f4364g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f4365i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ImageView f4366j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f4367o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ImageView f4368p;
    public SingleAdView t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final TextView f4369v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ImageView f4370w;

    public j(HomeFragment homeFragment, View view) {
        this.f4358a = homeFragment;
        this.f4359b = view;
        ImageView imageView = (ImageView) view.findViewById(Ac.e.fh_iv_home);
        this.f4360c = imageView;
        ImageView imageView2 = (ImageView) view.findViewById(Ac.e.fh_iv_finance);
        this.f4368p = imageView2;
        ImageView imageView3 = (ImageView) view.findViewById(Ac.e.fh_iv_zone);
        this.f4362e = imageView3;
        ImageView imageView4 = (ImageView) view.findViewById(Ac.e.fh_iv_me);
        this.f4366j = imageView4;
        ImageView imageView5 = (ImageView) view.findViewById(Ac.e.fh_ivInvest);
        this.f4370w = imageView5;
        if (imageView != null) {
            imageView.setOnClickListener(this);
        }
        if (imageView2 != null) {
            imageView2.setOnClickListener(this);
        }
        if (imageView5 != null) {
            imageView5.setOnClickListener(this);
        }
        if (imageView3 != null) {
            imageView3.setOnClickListener(this);
        }
        if (imageView4 != null) {
            imageView4.setOnClickListener(this);
        }
        TextView textView = (TextView) view.findViewById(Ac.e.fh_tv_home);
        this.f4361d = textView;
        TextView textView2 = (TextView) view.findViewById(Ac.e.fh_tv_finance);
        this.f4367o = textView2;
        TextView textView3 = (TextView) view.findViewById(Ac.e.fh_tvInvest);
        this.f4369v = textView3;
        TextView textView4 = (TextView) view.findViewById(Ac.e.fh_tv_zone);
        this.f4363f = textView4;
        TextView textView5 = (TextView) view.findViewById(Ac.e.fh_tv_me);
        this.f4365i = textView5;
        if (textView != null) {
            textView.setOnClickListener(this);
        }
        if (textView2 != null) {
            textView2.setOnClickListener(this);
        }
        if (textView4 != null) {
            textView4.setOnClickListener(this);
        }
        if (textView5 != null) {
            textView5.setOnClickListener(this);
        }
        if (textView3 != null) {
            textView3.setOnClickListener(this);
        }
    }

    public static void d(ImageView imageView, HomeMenuBean homeMenuBean, boolean z3, IconicsDrawable iconicsDrawable) {
        if (homeMenuBean == null) {
            r0.e1(imageView, iconicsDrawable);
            return;
        }
        if (i0.V(imageView)) {
            String str = z3 ? homeMenuBean.darkIconUrl : homeMenuBean.darkIconUrlUnSelected;
            if (r0.n(imageView)) {
                r0.j1(imageView, str, (G1.d) ((G1.d) new G1.d().y(iconicsDrawable)).k(iconicsDrawable));
                return;
            }
            return;
        }
        String str2 = z3 ? homeMenuBean.iconUrl : homeMenuBean.iconUrlUnSelected;
        if (r0.n(imageView)) {
            r0.j1(imageView, str2, (G1.d) ((G1.d) new G1.d().y(iconicsDrawable)).k(iconicsDrawable));
        }
    }

    public final void a(SingleAdView singleAdView) {
        if (TextUtils.isEmpty(this.f4357H)) {
            this.f4357H = BatchAdManager.INSTANCE.addBatchAd(singleAdView);
        } else {
            BatchAdManager.INSTANCE.appendBatchAd(this.f4357H, singleAdView);
        }
    }

    public final IconicsDrawable b(int i7, int i10, boolean z3) {
        S6.a aVar;
        Context context = this.f4359b.getContext();
        if (context == null) {
            return null;
        }
        switch (i7) {
            case HomeMenuBean.BOTTOM_TAB_ME /* 62 */:
                aVar = !z3 ? S6.a.pay_MeOutline : S6.a.pay_MeFill;
                break;
            case HomeMenuBean.BOTTOM_TAB_FINANCE /* 63 */:
                aVar = !z3 ? S6.a.pay_Loan : S6.a.pay_LoanFill;
                break;
            case 64:
                aVar = !z3 ? S6.a.pay_RewardOutline : S6.a.pay_RewardFill;
                break;
            case HomeMenuBean.BOTTOM_TAB_INVEST /* 65 */:
                aVar = !z3 ? S6.a.pay_FinanceOutline : S6.a.pay_FinanceFill;
                break;
            default:
                aVar = !z3 ? S6.a.pay_HomePageOutline : S6.a.pay_HomePageFill;
                break;
        }
        return G8.a.x(context, aVar, Integer.valueOf(i10), null, 24.0f, 116);
    }

    public final HomeMenuBean c(int i7) {
        List list = this.f4356C;
        if (list == null || !(!list.isEmpty())) {
            return null;
        }
        List<HomeMenuBean> list2 = this.f4356C;
        Intrinsics.e(list2);
        for (HomeMenuBean homeMenuBean : list2) {
            if (i7 == homeMenuBean.menuId) {
                return homeMenuBean;
            }
        }
        return null;
    }

    public final void e(int i7) {
        this.f4355B = i7;
        HomeFragment homeFragment = this.f4358a;
        HomeFragmentContainer homeFragmentContainer = homeFragment.f35081B;
        if (i7 == (homeFragmentContainer != null ? homeFragmentContainer.c("home") : -1)) {
            com.transsnet.palmpay.main.export.c.f31994b.getInstance().f31995a = "home";
        } else if (i7 == homeFragment.y()) {
            com.transsnet.palmpay.main.export.c.f31994b.getInstance().f31995a = "finance";
        } else {
            HomeFragmentContainer homeFragmentContainer2 = homeFragment.f35081B;
            if (i7 == (homeFragmentContainer2 != null ? homeFragmentContainer2.c("me") : -1)) {
                com.transsnet.palmpay.main.export.c.f31994b.getInstance().f31995a = "me";
            } else if (i7 == homeFragment.E()) {
                com.transsnet.palmpay.main.export.c.f31994b.getInstance().f31995a = "palmzone";
            } else if (i7 == homeFragment.D()) {
                com.transsnet.palmpay.main.export.c.f31994b.getInstance().f31995a = "invest";
            }
        }
        h(0, i7 == 0);
        h(1, i7 == 1);
        h(2, i7 == 2);
        h(3, i7 == 3);
        h(4, i7 == 4);
    }

    public final void f(boolean z3) {
        ImageView imageView = this.f4362e;
        if (imageView != null) {
            p220oa.h.s(imageView, z3);
        }
        TextView textView = this.f4363f;
        if (textView != null) {
            p220oa.h.s(textView, z3);
        }
        if (z3) {
            g();
            return;
        }
        SingleAdView singleAdView = this.f4364g;
        if (singleAdView != null) {
            p220oa.h.s(singleAdView, false);
        }
    }

    public final void g() {
        View viewInflate;
        ImageView imageView = this.f4362e;
        if (imageView == null || !p220oa.h.e(imageView)) {
            return;
        }
        if (this.f4364g == null) {
            ViewStub viewStub = (ViewStub) this.f4359b.findViewById(Ac.e.fhRewardsAdStub);
            if (viewStub != null && (viewInflate = viewStub.inflate()) != null) {
                this.f4364g = (SingleAdView) viewInflate.findViewById(Ac.e.adView);
            }
            SingleAdView singleAdView = this.f4364g;
            if (singleAdView != null) {
                singleAdView.setSlotId(CommonViewExtKt.string(Ac.h.main_home_rewards_tab_corner_ad_slot_id, singleAdView.getContext()), !p183m6.n.f39523a.instance().b("featureBatchPullAd", false));
            }
            a(this.f4364g);
        }
        SingleAdView singleAdView2 = this.f4364g;
        if (singleAdView2 != null) {
            p220oa.h.s(singleAdView2, true);
        }
    }

    public final void h(int i7, boolean z3) {
        HomeFragment homeFragment = this.f4358a;
        if (homeFragment.getActivity() == null) {
            return;
        }
        int iColorInt = z3 ? CommonViewExtKt.colorInt(L6.b.ppColorPrimary, homeFragment.getContext()) : CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, homeFragment.getContext());
        HomeFragmentContainer homeFragmentContainer = homeFragment.f35081B;
        if (i7 == (homeFragmentContainer != null ? homeFragmentContainer.c("home") : -1)) {
            HomeMenuBean homeMenuBeanC = c(61);
            d(this.f4360c, homeMenuBeanC, z3, b(61, iColorInt, z3));
            TextView textView = this.f4361d;
            if (textView != null) {
                textView.setTextColor(iColorInt);
            }
            if (TextUtils.isEmpty(homeMenuBeanC != null ? homeMenuBeanC.menuName : null) || textView == null) {
                return;
            }
            textView.setText(homeMenuBeanC != null ? homeMenuBeanC.menuName : null);
            return;
        }
        if (i7 == homeFragment.y()) {
            HomeMenuBean homeMenuBeanC2 = c(63);
            d(this.f4368p, homeMenuBeanC2, z3, b(63, iColorInt, z3));
            TextView textView2 = this.f4367o;
            if (textView2 != null) {
                textView2.setTextColor(iColorInt);
            }
            if (TextUtils.isEmpty(homeMenuBeanC2 != null ? homeMenuBeanC2.menuName : null) || textView2 == null) {
                return;
            }
            textView2.setText(homeMenuBeanC2 != null ? homeMenuBeanC2.menuName : null);
            return;
        }
        HomeFragmentContainer homeFragmentContainer2 = homeFragment.f35081B;
        if (i7 == (homeFragmentContainer2 != null ? homeFragmentContainer2.c("me") : -1)) {
            HomeMenuBean homeMenuBeanC3 = c(62);
            d(this.f4366j, homeMenuBeanC3, z3, b(62, iColorInt, z3));
            TextView textView3 = this.f4365i;
            if (textView3 != null) {
                textView3.setTextColor(iColorInt);
            }
            if (TextUtils.isEmpty(homeMenuBeanC3 != null ? homeMenuBeanC3.menuName : null) || textView3 == null) {
                return;
            }
            textView3.setText(homeMenuBeanC3 != null ? homeMenuBeanC3.menuName : null);
            return;
        }
        if (i7 == homeFragment.E()) {
            HomeMenuBean homeMenuBeanC4 = c(64);
            d(this.f4362e, homeMenuBeanC4, z3, b(64, iColorInt, z3));
            TextView textView4 = this.f4363f;
            if (textView4 != null) {
                textView4.setTextColor(iColorInt);
            }
            if (TextUtils.isEmpty(homeMenuBeanC4 != null ? homeMenuBeanC4.menuName : null) || textView4 == null) {
                return;
            }
            textView4.setText(homeMenuBeanC4 != null ? homeMenuBeanC4.menuName : null);
            return;
        }
        if (i7 == homeFragment.D()) {
            HomeMenuBean homeMenuBeanC5 = c(65);
            d(this.f4370w, homeMenuBeanC5, z3, b(65, iColorInt, z3));
            TextView textView5 = this.f4369v;
            if (textView5 != null) {
                textView5.setTextColor(iColorInt);
            }
            if (TextUtils.isEmpty(homeMenuBeanC5 != null ? homeMenuBeanC5.menuName : null) || textView5 == null) {
                return;
            }
            textView5.setText(homeMenuBeanC5 != null ? homeMenuBeanC5.menuName : null);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        int id2 = v3.getId();
        int i7 = Ac.e.fh_iv_home;
        HomeFragment homeFragment = this.f4358a;
        if (id2 == i7 || id2 == Ac.e.fh_tv_home) {
            n0 n0VarG = n0.g();
            ClickEvent clickEvent = (ClickEvent) G.f("page_tab_element_click", "module_name", "Home");
            HomeMenuBean homeMenuBeanC = c(61);
            n0VarG.k(clickEvent.add("display_name", homeMenuBeanC != null ? homeMenuBeanC.menuName : null));
            HomeFragmentContainer homeFragmentContainer = homeFragment.f35081B;
            int iC = homeFragmentContainer != null ? homeFragmentContainer.c("home") : -1;
            if (this.f4355B == iC || -1 == iC) {
                return;
            }
            F6.d.h("debug_tag", 3, "onClick().. go to home tab");
            homeFragment.H(iC);
            this.f4355B = iC;
            e(iC);
            return;
        }
        if (id2 == Ac.e.fh_iv_me || id2 == Ac.e.fh_tv_me) {
            n0 n0VarG2 = n0.g();
            ClickEvent clickEvent2 = (ClickEvent) G.f("page_tab_element_click", "module_name", "Me");
            HomeMenuBean homeMenuBeanC2 = c(62);
            n0VarG2.k(clickEvent2.add("display_name", homeMenuBeanC2 != null ? homeMenuBeanC2.menuName : null));
            HomeFragmentContainer homeFragmentContainer2 = homeFragment.f35081B;
            int iC2 = homeFragmentContainer2 != null ? homeFragmentContainer2.c("me") : -1;
            if (this.f4355B == iC2 || -1 == iC2) {
                return;
            }
            homeFragment.H(iC2);
            this.f4355B = iC2;
            e(iC2);
            return;
        }
        if (id2 == Ac.e.fh_iv_finance || id2 == Ac.e.fh_tv_finance) {
            n0 n0VarG3 = n0.g();
            ClickEvent clickEvent3 = (ClickEvent) G.f("page_tab_element_click", "module_name", "Finance");
            HomeMenuBean homeMenuBeanC3 = c(63);
            n0VarG3.k(clickEvent3.add("display_name", homeMenuBeanC3 != null ? homeMenuBeanC3.menuName : null));
            int iY = homeFragment.y();
            if (this.f4355B == iY || -1 == iY) {
                return;
            }
            SingleAdView singleAdView = this.t;
            if (singleAdView != null) {
                singleAdView.refreshData();
            }
            i preCheckCallback = new i(this, iY, 0);
            Intrinsics.checkNotNullParameter(preCheckCallback, "preCheckCallback");
            F6.d.h(homeFragment.f27317a, 3, "preCheckFinanceTab >>>");
            if (!BaseApplication.hasLogin()) {
                preCheckCallback.invoke(Boolean.FALSE);
                return;
            }
            homeFragment.f35087X = preCheckCallback;
            I i10 = (I) homeFragment.f27328i;
            if (i10 != null) {
                i10.loanEnterPreCheck();
                return;
            }
            return;
        }
        if (id2 == Ac.e.fh_iv_zone || id2 == Ac.e.fh_tv_zone) {
            n0 n0VarG4 = n0.g();
            ClickEvent clickEvent4 = (ClickEvent) G.f("page_tab_element_click", "module_name", "Reward");
            HomeMenuBean homeMenuBeanC4 = c(64);
            n0VarG4.k(clickEvent4.add("display_name", homeMenuBeanC4 != null ? homeMenuBeanC4.menuName : null));
            int iE = homeFragment.E();
            if (this.f4355B == iE || -1 == iE) {
                return;
            }
            homeFragment.H(iE);
            this.f4355B = iE;
            e(iE);
            return;
        }
        if (id2 == Ac.e.fh_ivInvest || id2 == Ac.e.fh_tvInvest) {
            n0 n0VarG5 = n0.g();
            ClickEvent clickEvent5 = (ClickEvent) G.f("page_tab_element_click", "module_name", "Invest");
            HomeMenuBean homeMenuBeanC5 = c(65);
            n0VarG5.k(clickEvent5.add("display_name", homeMenuBeanC5 != null ? homeMenuBeanC5.menuName : null));
            int iD = homeFragment.D();
            if (this.f4355B == iD || -1 == iD) {
                return;
            }
            homeFragment.H(iD);
            this.f4355B = iD;
            e(iD);
            SingleAdView singleAdView2 = this.f4354A;
            if (singleAdView2 != null) {
                singleAdView2.refreshData();
            }
        }
    }
}

package com.transsnet.palmpay.cash_in.ui.activity;

import C9.C0138e;
import C9.C0139f;
import C9.C0158z;
import C9.U;
import C9.W;
import J9.w;
import L6.b;
import android.os.Bundle;
import android.util.SparseArray;
import android.widget.ImageView;
import androidx.fragment.app.Z;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.android.material.tabs.TabLayout;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.adsdk.widgets.Interstitial.InterstitialAdView;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.cash_in.ui.activity.WithdrawHomeActivity;
import com.transsnet.palmpay.cash_in.ui.fragment.WithdrawHomeFragment;
import com.transsnet.palmpay.cash_in.ui.fragment.WithdrawV2Fragment;
import com.transsnet.palmpay.cash_in.ui.viewmodel.WithdrawHomeViewModel;
import com.transsnet.palmpay.cash_in.ui.viewmodel.WithdrawViewModel;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.ui.widget.DragView;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.SPUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p025ba.k;
import p140j8.f;
import p355xf.C2131j;
import p355xf.t;
import p366y9.c;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/cashout/withdraw_home")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/cash_in/ui/activity/WithdrawHomeActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/cash_in/ui/viewmodel/WithdrawViewModel;", "<init>", "()V", "C9/U", "a", "module_cash_in_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWithdrawHomeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WithdrawHomeActivity.kt\ncom/transsnet/palmpay/cash_in/ui/activity/WithdrawHomeActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,235:1\n115#2,8:236\n145#2:244\n*S KotlinDebug\n*F\n+ 1 WithdrawHomeActivity.kt\ncom/transsnet/palmpay/cash_in/ui/activity/WithdrawHomeActivity\n*L\n83#1:236,8\n83#1:244\n*E\n"})
public final class WithdrawHomeActivity extends BaseMvvmActivity<WithdrawViewModel> {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f26933v;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f26934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f26935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f26936e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f26937f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f26938g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f26939i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public U f26940j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f26941o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SparseArray f26942p;
    public final t t;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
        f26933v = 1;
    }

    public WithdrawHomeActivity() {
        final int i7 = 0;
        this.f26934c = C2131j.b(new Function0(this) { // from class: C9.T

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawHomeActivity f1279b;

            {
                this.f1279b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WithdrawHomeActivity withdrawHomeActivity = this.f1279b;
                switch (i7) {
                    case 0:
                        int i10 = WithdrawHomeActivity.f26933v;
                        return (SingleAdView) withdrawHomeActivity.findViewById(p366y9.b.cs_float_ads_view);
                    case 1:
                        int i11 = WithdrawHomeActivity.f26933v;
                        return (DragView) withdrawHomeActivity.findViewById(p366y9.b.cs_dragview);
                    case 2:
                        int i12 = WithdrawHomeActivity.f26933v;
                        return (ViewPager) withdrawHomeActivity.findViewById(p366y9.b.mViewpager);
                    case 3:
                        int i13 = WithdrawHomeActivity.f26933v;
                        return (TabLayout) withdrawHomeActivity.findViewById(p366y9.b.tabLayout);
                    case 4:
                        int i14 = WithdrawHomeActivity.f26933v;
                        return (ImageView) withdrawHomeActivity.findViewById(p366y9.b.ivAd);
                    case 5:
                        int i15 = WithdrawHomeActivity.f26933v;
                        return (PpTitleBar) withdrawHomeActivity.findViewById(p366y9.b.mtb_title_bar);
                    default:
                        int i16 = WithdrawHomeActivity.f26933v;
                        return (WithdrawHomeViewModel) new androidx.camera.video.internal.c(withdrawHomeActivity).h(WithdrawHomeViewModel.class);
                }
            }
        });
        final int i10 = 1;
        this.f26935d = C2131j.b(new Function0(this) { // from class: C9.T

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawHomeActivity f1279b;

            {
                this.f1279b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WithdrawHomeActivity withdrawHomeActivity = this.f1279b;
                switch (i10) {
                    case 0:
                        int i11 = WithdrawHomeActivity.f26933v;
                        return (SingleAdView) withdrawHomeActivity.findViewById(p366y9.b.cs_float_ads_view);
                    case 1:
                        int i12 = WithdrawHomeActivity.f26933v;
                        return (DragView) withdrawHomeActivity.findViewById(p366y9.b.cs_dragview);
                    case 2:
                        int i13 = WithdrawHomeActivity.f26933v;
                        return (ViewPager) withdrawHomeActivity.findViewById(p366y9.b.mViewpager);
                    case 3:
                        int i14 = WithdrawHomeActivity.f26933v;
                        return (TabLayout) withdrawHomeActivity.findViewById(p366y9.b.tabLayout);
                    case 4:
                        int i15 = WithdrawHomeActivity.f26933v;
                        return (ImageView) withdrawHomeActivity.findViewById(p366y9.b.ivAd);
                    case 5:
                        int i16 = WithdrawHomeActivity.f26933v;
                        return (PpTitleBar) withdrawHomeActivity.findViewById(p366y9.b.mtb_title_bar);
                    default:
                        int i17 = WithdrawHomeActivity.f26933v;
                        return (WithdrawHomeViewModel) new androidx.camera.video.internal.c(withdrawHomeActivity).h(WithdrawHomeViewModel.class);
                }
            }
        });
        final int i11 = 2;
        this.f26936e = C2131j.b(new Function0(this) { // from class: C9.T

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawHomeActivity f1279b;

            {
                this.f1279b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WithdrawHomeActivity withdrawHomeActivity = this.f1279b;
                switch (i11) {
                    case 0:
                        int i12 = WithdrawHomeActivity.f26933v;
                        return (SingleAdView) withdrawHomeActivity.findViewById(p366y9.b.cs_float_ads_view);
                    case 1:
                        int i13 = WithdrawHomeActivity.f26933v;
                        return (DragView) withdrawHomeActivity.findViewById(p366y9.b.cs_dragview);
                    case 2:
                        int i14 = WithdrawHomeActivity.f26933v;
                        return (ViewPager) withdrawHomeActivity.findViewById(p366y9.b.mViewpager);
                    case 3:
                        int i15 = WithdrawHomeActivity.f26933v;
                        return (TabLayout) withdrawHomeActivity.findViewById(p366y9.b.tabLayout);
                    case 4:
                        int i16 = WithdrawHomeActivity.f26933v;
                        return (ImageView) withdrawHomeActivity.findViewById(p366y9.b.ivAd);
                    case 5:
                        int i17 = WithdrawHomeActivity.f26933v;
                        return (PpTitleBar) withdrawHomeActivity.findViewById(p366y9.b.mtb_title_bar);
                    default:
                        int i18 = WithdrawHomeActivity.f26933v;
                        return (WithdrawHomeViewModel) new androidx.camera.video.internal.c(withdrawHomeActivity).h(WithdrawHomeViewModel.class);
                }
            }
        });
        final int i12 = 3;
        this.f26937f = C2131j.b(new Function0(this) { // from class: C9.T

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawHomeActivity f1279b;

            {
                this.f1279b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WithdrawHomeActivity withdrawHomeActivity = this.f1279b;
                switch (i12) {
                    case 0:
                        int i13 = WithdrawHomeActivity.f26933v;
                        return (SingleAdView) withdrawHomeActivity.findViewById(p366y9.b.cs_float_ads_view);
                    case 1:
                        int i14 = WithdrawHomeActivity.f26933v;
                        return (DragView) withdrawHomeActivity.findViewById(p366y9.b.cs_dragview);
                    case 2:
                        int i15 = WithdrawHomeActivity.f26933v;
                        return (ViewPager) withdrawHomeActivity.findViewById(p366y9.b.mViewpager);
                    case 3:
                        int i16 = WithdrawHomeActivity.f26933v;
                        return (TabLayout) withdrawHomeActivity.findViewById(p366y9.b.tabLayout);
                    case 4:
                        int i17 = WithdrawHomeActivity.f26933v;
                        return (ImageView) withdrawHomeActivity.findViewById(p366y9.b.ivAd);
                    case 5:
                        int i18 = WithdrawHomeActivity.f26933v;
                        return (PpTitleBar) withdrawHomeActivity.findViewById(p366y9.b.mtb_title_bar);
                    default:
                        int i19 = WithdrawHomeActivity.f26933v;
                        return (WithdrawHomeViewModel) new androidx.camera.video.internal.c(withdrawHomeActivity).h(WithdrawHomeViewModel.class);
                }
            }
        });
        final int i13 = 4;
        this.f26938g = C2131j.b(new Function0(this) { // from class: C9.T

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawHomeActivity f1279b;

            {
                this.f1279b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WithdrawHomeActivity withdrawHomeActivity = this.f1279b;
                switch (i13) {
                    case 0:
                        int i14 = WithdrawHomeActivity.f26933v;
                        return (SingleAdView) withdrawHomeActivity.findViewById(p366y9.b.cs_float_ads_view);
                    case 1:
                        int i15 = WithdrawHomeActivity.f26933v;
                        return (DragView) withdrawHomeActivity.findViewById(p366y9.b.cs_dragview);
                    case 2:
                        int i16 = WithdrawHomeActivity.f26933v;
                        return (ViewPager) withdrawHomeActivity.findViewById(p366y9.b.mViewpager);
                    case 3:
                        int i17 = WithdrawHomeActivity.f26933v;
                        return (TabLayout) withdrawHomeActivity.findViewById(p366y9.b.tabLayout);
                    case 4:
                        int i18 = WithdrawHomeActivity.f26933v;
                        return (ImageView) withdrawHomeActivity.findViewById(p366y9.b.ivAd);
                    case 5:
                        int i19 = WithdrawHomeActivity.f26933v;
                        return (PpTitleBar) withdrawHomeActivity.findViewById(p366y9.b.mtb_title_bar);
                    default:
                        int i110 = WithdrawHomeActivity.f26933v;
                        return (WithdrawHomeViewModel) new androidx.camera.video.internal.c(withdrawHomeActivity).h(WithdrawHomeViewModel.class);
                }
            }
        });
        final int i14 = 5;
        this.f26939i = C2131j.b(new Function0(this) { // from class: C9.T

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawHomeActivity f1279b;

            {
                this.f1279b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WithdrawHomeActivity withdrawHomeActivity = this.f1279b;
                switch (i14) {
                    case 0:
                        int i15 = WithdrawHomeActivity.f26933v;
                        return (SingleAdView) withdrawHomeActivity.findViewById(p366y9.b.cs_float_ads_view);
                    case 1:
                        int i16 = WithdrawHomeActivity.f26933v;
                        return (DragView) withdrawHomeActivity.findViewById(p366y9.b.cs_dragview);
                    case 2:
                        int i17 = WithdrawHomeActivity.f26933v;
                        return (ViewPager) withdrawHomeActivity.findViewById(p366y9.b.mViewpager);
                    case 3:
                        int i18 = WithdrawHomeActivity.f26933v;
                        return (TabLayout) withdrawHomeActivity.findViewById(p366y9.b.tabLayout);
                    case 4:
                        int i19 = WithdrawHomeActivity.f26933v;
                        return (ImageView) withdrawHomeActivity.findViewById(p366y9.b.ivAd);
                    case 5:
                        int i110 = WithdrawHomeActivity.f26933v;
                        return (PpTitleBar) withdrawHomeActivity.findViewById(p366y9.b.mtb_title_bar);
                    default:
                        int i111 = WithdrawHomeActivity.f26933v;
                        return (WithdrawHomeViewModel) new androidx.camera.video.internal.c(withdrawHomeActivity).h(WithdrawHomeViewModel.class);
                }
            }
        });
        final int i15 = 6;
        this.t = C2131j.b(new Function0(this) { // from class: C9.T

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawHomeActivity f1279b;

            {
                this.f1279b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WithdrawHomeActivity withdrawHomeActivity = this.f1279b;
                switch (i15) {
                    case 0:
                        int i16 = WithdrawHomeActivity.f26933v;
                        return (SingleAdView) withdrawHomeActivity.findViewById(p366y9.b.cs_float_ads_view);
                    case 1:
                        int i17 = WithdrawHomeActivity.f26933v;
                        return (DragView) withdrawHomeActivity.findViewById(p366y9.b.cs_dragview);
                    case 2:
                        int i18 = WithdrawHomeActivity.f26933v;
                        return (ViewPager) withdrawHomeActivity.findViewById(p366y9.b.mViewpager);
                    case 3:
                        int i19 = WithdrawHomeActivity.f26933v;
                        return (TabLayout) withdrawHomeActivity.findViewById(p366y9.b.tabLayout);
                    case 4:
                        int i110 = WithdrawHomeActivity.f26933v;
                        return (ImageView) withdrawHomeActivity.findViewById(p366y9.b.ivAd);
                    case 5:
                        int i111 = WithdrawHomeActivity.f26933v;
                        return (PpTitleBar) withdrawHomeActivity.findViewById(p366y9.b.mtb_title_bar);
                    default:
                        int i112 = WithdrawHomeActivity.f26933v;
                        return (WithdrawHomeViewModel) new androidx.camera.video.internal.c(withdrawHomeActivity).h(WithdrawHomeViewModel.class);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return c.cash_in_activity_withdraw_tab;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        l lVar = ((WithdrawViewModel) l()).f27110A;
        if (lVar != null) {
            lVar.e(this, new C0138e(new C0139f(this, 3), (char) 0));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final ViewPager m() {
        Object value = this.f26936e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ViewPager) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        WithdrawViewModel withdrawViewModel = (WithdrawViewModel) l();
        withdrawViewModel.getClass();
        f.s(withdrawViewModel, new w(1, null), withdrawViewModel.f27110A, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        ARouter.getInstance().inject(this);
        initStatusBar(CommonViewExtKt.colorInt(b.ppColorBackgroundLight, this), !isDarkMode());
        SparseArray sparseArray = new SparseArray();
        Intrinsics.checkNotNullParameter(sparseArray, "<set-?>");
        this.f26942p = sparseArray;
        WithdrawHomeFragment withdrawHomeFragment = new WithdrawHomeFragment();
        WithdrawV2Fragment withdrawV2Fragment = new WithdrawV2Fragment();
        SparseArray sparseArray2 = this.f26942p;
        if (sparseArray2 == null) {
            Intrinsics.n("mFragmentsCache");
            throw null;
        }
        sparseArray2.put(0, withdrawHomeFragment);
        SparseArray sparseArray3 = this.f26942p;
        if (sparseArray3 == null) {
            Intrinsics.n("mFragmentsCache");
            throw null;
        }
        sparseArray3.put(f26933v, withdrawV2Fragment);
        Z supportFragmentManager = getSupportFragmentManager();
        SparseArray sparseArray4 = this.f26942p;
        if (sparseArray4 == null) {
            Intrinsics.n("mFragmentsCache");
            throw null;
        }
        this.f26940j = new U(supportFragmentManager, sparseArray4);
        m().setAdapter(this.f26940j);
        m().setOffscreenPageLimit(2);
        t tVar = this.f26937f;
        Object value = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((TabLayout) value).setupWithViewPager(m());
        Object value2 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((TabLayout) value2).addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new W());
        if (this.f26941o == -1) {
            this.f26941o = SPUtils.getInstance("WITHDRAW_MODULE").getInt("TAB_CURRENT", 0);
            m().setCurrentItem(this.f26941o);
        } else {
            m().setCurrentItem(this.f26941o);
        }
        Object value3 = this.f26939i.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        ((PpTitleBar) value3).setBackButtonClickListener(new A8.b(this, 23));
        Object value4 = this.f26934c.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        ((SingleAdView) value4).setAdListener(new C0158z(this, 1));
        String string = getString(k.ad_withdraw_agent_pop_slot_id);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        InterstitialAdView interstitialAdView = new InterstitialAdView(string, null);
        interstitialAdView.setInterstitialListener(new Ab.k(4));
        Intrinsics.checkNotNullParameter(this, "<this>");
        InterstitialAdView.show$default(interstitialAdView, this, null, 2, null);
    }
}

package com.transsnet.palmpay.ui.fragment;

import Ac.f;
import C9.C0142i;
import C9.C0144k;
import C9.C0158z;
import Ce.C0174p;
import Ce.V;
import Ce.X;
import Ce.Y;
import Ce.Z;
import Ce.a0;
import Ie.d;
import Ie.e;
import Ie.o;
import Ie.u;
import Ie.v;
import Ie.w;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import Pe.C0551x;
import Pe.C0552y;
import android.graphics.drawable.LevelListDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.palmpay.lib.apm.network.NQEManager;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.shencoder.pagergridlayoutmanager.PagerGridLayoutManager;
import com.transsnet.adsdk.widgets.Interstitial.InterstitialAdView;
import com.transsnet.adsdk.widgets.MarqueeTextView.MarqueeViewV2;
import com.transsnet.adsdk.widgets.banner.BannerAdView;
import com.transsnet.palmpay.common.export.view.NetworkNotConnectView;
import com.transsnet.palmpay.core.base.BaseLazyMvvmFragment;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.custom_view.CashBoxIntroductionView;
import com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.main.export.bean.rsp.FinanceSavingsV1HomeResp;
import com.transsnet.palmpay.ui.activity.HomeActivity;
import com.transsnet.palmpay.ui.fragment.HomeSavingsUserV2Fragment;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.viewmodule.HomeSavingsViewModel;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.c;
import org.jetbrains.annotations.NotNull;
import p025ba.k;
import p355xf.C2131j;
import p355xf.t;
import p385ze.b;
import p385ze.h;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/ui/fragment/HomeSavingsUserV2Fragment;", "Lcom/transsnet/palmpay/core/base/BaseLazyMvvmFragment;", "Lcom/transsnet/palmpay/viewmodule/HomeSavingsViewModel;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "a", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHomeSavingsUserV2Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeSavingsUserV2Fragment.kt\ncom/transsnet/palmpay/ui/fragment/HomeSavingsUserV2Fragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,764:1\n1#2:765\n115#3,8:766\n145#3:774\n115#3,8:775\n145#3:783\n115#3,8:784\n145#3:792\n115#3,8:793\n145#3:801\n115#3,8:802\n145#3:810\n115#3,8:811\n145#3:819\n115#3,8:820\n145#3:828\n115#3,8:829\n145#3:837\n1878#4,3:838\n13567#5,3:841\n*S KotlinDebug\n*F\n+ 1 HomeSavingsUserV2Fragment.kt\ncom/transsnet/palmpay/ui/fragment/HomeSavingsUserV2Fragment\n*L\n359#1:766,8\n359#1:774\n366#1:775,8\n366#1:783\n373#1:784,8\n373#1:792\n380#1:793,8\n380#1:801\n387#1:802,8\n387#1:810\n394#1:811,8\n394#1:819\n401#1:820,8\n401#1:828\n408#1:829,8\n408#1:837\n547#1:838,3\n737#1:841,3\n*E\n"})
public final class HomeSavingsUserV2Fragment extends BaseLazyMvvmFragment<HomeSavingsViewModel> implements View.OnClickListener {

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public static final a f35149F0 = new a(null);

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public static final String f35150G0 = "FIXED";

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public static final String f35151H0 = "Insurance";

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public static final String f35152I0 = "Saving";

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public static final String f35153J0 = "Stock";

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public static final String f35154K0 = "Fund";

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public static final String f35155L0 = "Target";

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f35156A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public v f35157A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final t f35158B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public e f35159B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final t f35160C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public w f35161C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public NetworkNotConnectView f35162D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public final t f35163E0 = C2131j.b(new Aa.a(16));

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final t f35164H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final t f35165L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final t f35166M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final t f35167Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final t f35168X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final t f35169Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final t f35170Z;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final t f35171k0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final t f35172p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final t f35173q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final t f35174r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public FinanceSavingsV1HomeResp f35175s0;
    public final t t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public h f35176t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public b f35177u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f35178v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public ArrayList f35179v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f35180w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public o f35181w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public d f35182x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public u f35183y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public O2.a f35184z0;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getPRODUCT_FIXED_SAVINGS_MODULE() {
            return HomeSavingsUserV2Fragment.f35150G0;
        }

        @NotNull
        public final String getPRODUCT_FUND_MODULE() {
            return HomeSavingsUserV2Fragment.f35154K0;
        }

        @NotNull
        public final String getPRODUCT_INSURANCE_MODULE() {
            return HomeSavingsUserV2Fragment.f35151H0;
        }

        @NotNull
        public final String getPRODUCT_SAVING_MODULE() {
            return HomeSavingsUserV2Fragment.f35152I0;
        }

        @NotNull
        public final String getPRODUCT_STOCK_MODULE() {
            return HomeSavingsUserV2Fragment.f35153J0;
        }

        @NotNull
        public final String getPRODUCT_TARGET_MODULE() {
            return HomeSavingsUserV2Fragment.f35155L0;
        }

        @NotNull
        public final HomeSavingsUserV2Fragment newInstance() {
            return new HomeSavingsUserV2Fragment();
        }

        private a() {
        }
    }

    public HomeSavingsUserV2Fragment() {
        final int i7 = 13;
        this.t = C2131j.b(new Function0(this) { // from class: Ce.W

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeSavingsUserV2Fragment f1456b;

            {
                this.f1456b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                HomeSavingsUserV2Fragment homeSavingsUserV2Fragment = this.f1456b;
                switch (i7) {
                    case 0:
                        HomeSavingsUserV2Fragment.a aVar = HomeSavingsUserV2Fragment.f35149F0;
                        View view = homeSavingsUserV2Fragment.f27318b;
                        if (view != null) {
                            return (RecyclerView) view.findViewById(Ac.e.functionList);
                        }
                        return null;
                    case 1:
                        HomeSavingsUserV2Fragment.a aVar2 = HomeSavingsUserV2Fragment.f35149F0;
                        View view2 = homeSavingsUserV2Fragment.f27318b;
                        if (view2 != null) {
                            return (MarqueeViewV2) view2.findViewById(Ac.e.topTextAd);
                        }
                        return null;
                    case 2:
                        HomeSavingsUserV2Fragment.a aVar3 = HomeSavingsUserV2Fragment.f35149F0;
                        View view3 = homeSavingsUserV2Fragment.f27318b;
                        if (view3 != null) {
                            return (VerticalSwipeRefreshLayout) view3.findViewById(Ac.e.refreshLayout);
                        }
                        return null;
                    case 3:
                        HomeSavingsUserV2Fragment.a aVar4 = HomeSavingsUserV2Fragment.f35149F0;
                        View view4 = homeSavingsUserV2Fragment.f27318b;
                        if (view4 != null) {
                            return (CashBoxIntroductionView) view4.findViewById(Ac.e.cashBoxIntroductionView);
                        }
                        return null;
                    case 4:
                        HomeSavingsUserV2Fragment.a aVar5 = HomeSavingsUserV2Fragment.f35149F0;
                        View view5 = homeSavingsUserV2Fragment.f27318b;
                        if (view5 != null) {
                            return (RecyclerView) view5.findViewById(Ac.e.rl_accountList);
                        }
                        return null;
                    case 5:
                        HomeSavingsUserV2Fragment.a aVar6 = HomeSavingsUserV2Fragment.f35149F0;
                        View view6 = homeSavingsUserV2Fragment.f27318b;
                        if (view6 != null) {
                            return (LinearLayout) view6.findViewById(Ac.e.ll_account);
                        }
                        return null;
                    case 6:
                        HomeSavingsUserV2Fragment.a aVar7 = HomeSavingsUserV2Fragment.f35149F0;
                        View view7 = homeSavingsUserV2Fragment.f27318b;
                        if (view7 != null) {
                            return (ImageView) view7.findViewById(Ac.e.imageViewNext);
                        }
                        return null;
                    case 7:
                        HomeSavingsUserV2Fragment.a aVar8 = HomeSavingsUserV2Fragment.f35149F0;
                        View view8 = homeSavingsUserV2Fragment.f27318b;
                        if (view8 != null) {
                            return (ImageView) view8.findViewById(Ac.e.ivYesterDayArrow);
                        }
                        return null;
                    case 8:
                        HomeSavingsUserV2Fragment.a aVar9 = HomeSavingsUserV2Fragment.f35149F0;
                        View view9 = homeSavingsUserV2Fragment.f27318b;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(Ac.e.tvYesterdayReturnAmount);
                        }
                        return null;
                    case 9:
                        HomeSavingsUserV2Fragment.a aVar10 = HomeSavingsUserV2Fragment.f35149F0;
                        View view10 = homeSavingsUserV2Fragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(Ac.e.tvTotalAssetsAmount);
                        }
                        return null;
                    case 10:
                        HomeSavingsUserV2Fragment.a aVar11 = HomeSavingsUserV2Fragment.f35149F0;
                        View view11 = homeSavingsUserV2Fragment.f27318b;
                        if (view11 != null) {
                            return (ImageView) view11.findViewById(Ac.e.ivToggleShowBalance);
                        }
                        return null;
                    case 11:
                        HomeSavingsUserV2Fragment.a aVar12 = HomeSavingsUserV2Fragment.f35149F0;
                        View view12 = homeSavingsUserV2Fragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(Ac.e.tvTotalAssets);
                        }
                        return null;
                    case 12:
                        HomeSavingsUserV2Fragment.a aVar13 = HomeSavingsUserV2Fragment.f35149F0;
                        View view13 = homeSavingsUserV2Fragment.f27318b;
                        if (view13 != null) {
                            return (ConstraintLayout) view13.findViewById(Ac.e.layoutMyFortune);
                        }
                        return null;
                    case 13:
                        HomeSavingsUserV2Fragment.a aVar14 = HomeSavingsUserV2Fragment.f35149F0;
                        View view14 = homeSavingsUserV2Fragment.f27318b;
                        if (view14 != null) {
                            return (ImageView) view14.findViewById(Ac.e.imageViewUp);
                        }
                        return null;
                    case 14:
                        HomeSavingsUserV2Fragment.a aVar15 = HomeSavingsUserV2Fragment.f35149F0;
                        View view15 = homeSavingsUserV2Fragment.f27318b;
                        if (view15 != null) {
                            return (LinearLayout) view15.findViewById(Ac.e.ll_dynmic_module);
                        }
                        return null;
                    case 15:
                        HomeSavingsUserV2Fragment.a aVar16 = HomeSavingsUserV2Fragment.f35149F0;
                        View view16 = homeSavingsUserV2Fragment.f27318b;
                        if (view16 != null) {
                            return (BannerAdView) view16.findViewById(Ac.e.adMiddle);
                        }
                        return null;
                    default:
                        HomeSavingsUserV2Fragment.a aVar17 = HomeSavingsUserV2Fragment.f35149F0;
                        View view17 = homeSavingsUserV2Fragment.f27318b;
                        if (view17 != null) {
                            return (LinearLayout) view17.findViewById(Ac.e.functionIndicator);
                        }
                        return null;
                }
            }
        });
        final int i10 = 4;
        this.f35178v = C2131j.b(new Function0(this) { // from class: Ce.W

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeSavingsUserV2Fragment f1456b;

            {
                this.f1456b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                HomeSavingsUserV2Fragment homeSavingsUserV2Fragment = this.f1456b;
                switch (i10) {
                    case 0:
                        HomeSavingsUserV2Fragment.a aVar = HomeSavingsUserV2Fragment.f35149F0;
                        View view = homeSavingsUserV2Fragment.f27318b;
                        if (view != null) {
                            return (RecyclerView) view.findViewById(Ac.e.functionList);
                        }
                        return null;
                    case 1:
                        HomeSavingsUserV2Fragment.a aVar2 = HomeSavingsUserV2Fragment.f35149F0;
                        View view2 = homeSavingsUserV2Fragment.f27318b;
                        if (view2 != null) {
                            return (MarqueeViewV2) view2.findViewById(Ac.e.topTextAd);
                        }
                        return null;
                    case 2:
                        HomeSavingsUserV2Fragment.a aVar3 = HomeSavingsUserV2Fragment.f35149F0;
                        View view3 = homeSavingsUserV2Fragment.f27318b;
                        if (view3 != null) {
                            return (VerticalSwipeRefreshLayout) view3.findViewById(Ac.e.refreshLayout);
                        }
                        return null;
                    case 3:
                        HomeSavingsUserV2Fragment.a aVar4 = HomeSavingsUserV2Fragment.f35149F0;
                        View view4 = homeSavingsUserV2Fragment.f27318b;
                        if (view4 != null) {
                            return (CashBoxIntroductionView) view4.findViewById(Ac.e.cashBoxIntroductionView);
                        }
                        return null;
                    case 4:
                        HomeSavingsUserV2Fragment.a aVar5 = HomeSavingsUserV2Fragment.f35149F0;
                        View view5 = homeSavingsUserV2Fragment.f27318b;
                        if (view5 != null) {
                            return (RecyclerView) view5.findViewById(Ac.e.rl_accountList);
                        }
                        return null;
                    case 5:
                        HomeSavingsUserV2Fragment.a aVar6 = HomeSavingsUserV2Fragment.f35149F0;
                        View view6 = homeSavingsUserV2Fragment.f27318b;
                        if (view6 != null) {
                            return (LinearLayout) view6.findViewById(Ac.e.ll_account);
                        }
                        return null;
                    case 6:
                        HomeSavingsUserV2Fragment.a aVar7 = HomeSavingsUserV2Fragment.f35149F0;
                        View view7 = homeSavingsUserV2Fragment.f27318b;
                        if (view7 != null) {
                            return (ImageView) view7.findViewById(Ac.e.imageViewNext);
                        }
                        return null;
                    case 7:
                        HomeSavingsUserV2Fragment.a aVar8 = HomeSavingsUserV2Fragment.f35149F0;
                        View view8 = homeSavingsUserV2Fragment.f27318b;
                        if (view8 != null) {
                            return (ImageView) view8.findViewById(Ac.e.ivYesterDayArrow);
                        }
                        return null;
                    case 8:
                        HomeSavingsUserV2Fragment.a aVar9 = HomeSavingsUserV2Fragment.f35149F0;
                        View view9 = homeSavingsUserV2Fragment.f27318b;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(Ac.e.tvYesterdayReturnAmount);
                        }
                        return null;
                    case 9:
                        HomeSavingsUserV2Fragment.a aVar10 = HomeSavingsUserV2Fragment.f35149F0;
                        View view10 = homeSavingsUserV2Fragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(Ac.e.tvTotalAssetsAmount);
                        }
                        return null;
                    case 10:
                        HomeSavingsUserV2Fragment.a aVar11 = HomeSavingsUserV2Fragment.f35149F0;
                        View view11 = homeSavingsUserV2Fragment.f27318b;
                        if (view11 != null) {
                            return (ImageView) view11.findViewById(Ac.e.ivToggleShowBalance);
                        }
                        return null;
                    case 11:
                        HomeSavingsUserV2Fragment.a aVar12 = HomeSavingsUserV2Fragment.f35149F0;
                        View view12 = homeSavingsUserV2Fragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(Ac.e.tvTotalAssets);
                        }
                        return null;
                    case 12:
                        HomeSavingsUserV2Fragment.a aVar13 = HomeSavingsUserV2Fragment.f35149F0;
                        View view13 = homeSavingsUserV2Fragment.f27318b;
                        if (view13 != null) {
                            return (ConstraintLayout) view13.findViewById(Ac.e.layoutMyFortune);
                        }
                        return null;
                    case 13:
                        HomeSavingsUserV2Fragment.a aVar14 = HomeSavingsUserV2Fragment.f35149F0;
                        View view14 = homeSavingsUserV2Fragment.f27318b;
                        if (view14 != null) {
                            return (ImageView) view14.findViewById(Ac.e.imageViewUp);
                        }
                        return null;
                    case 14:
                        HomeSavingsUserV2Fragment.a aVar15 = HomeSavingsUserV2Fragment.f35149F0;
                        View view15 = homeSavingsUserV2Fragment.f27318b;
                        if (view15 != null) {
                            return (LinearLayout) view15.findViewById(Ac.e.ll_dynmic_module);
                        }
                        return null;
                    case 15:
                        HomeSavingsUserV2Fragment.a aVar16 = HomeSavingsUserV2Fragment.f35149F0;
                        View view16 = homeSavingsUserV2Fragment.f27318b;
                        if (view16 != null) {
                            return (BannerAdView) view16.findViewById(Ac.e.adMiddle);
                        }
                        return null;
                    default:
                        HomeSavingsUserV2Fragment.a aVar17 = HomeSavingsUserV2Fragment.f35149F0;
                        View view17 = homeSavingsUserV2Fragment.f27318b;
                        if (view17 != null) {
                            return (LinearLayout) view17.findViewById(Ac.e.functionIndicator);
                        }
                        return null;
                }
            }
        });
        final int i11 = 5;
        this.f35180w = C2131j.b(new Function0(this) { // from class: Ce.W

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeSavingsUserV2Fragment f1456b;

            {
                this.f1456b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                HomeSavingsUserV2Fragment homeSavingsUserV2Fragment = this.f1456b;
                switch (i11) {
                    case 0:
                        HomeSavingsUserV2Fragment.a aVar = HomeSavingsUserV2Fragment.f35149F0;
                        View view = homeSavingsUserV2Fragment.f27318b;
                        if (view != null) {
                            return (RecyclerView) view.findViewById(Ac.e.functionList);
                        }
                        return null;
                    case 1:
                        HomeSavingsUserV2Fragment.a aVar2 = HomeSavingsUserV2Fragment.f35149F0;
                        View view2 = homeSavingsUserV2Fragment.f27318b;
                        if (view2 != null) {
                            return (MarqueeViewV2) view2.findViewById(Ac.e.topTextAd);
                        }
                        return null;
                    case 2:
                        HomeSavingsUserV2Fragment.a aVar3 = HomeSavingsUserV2Fragment.f35149F0;
                        View view3 = homeSavingsUserV2Fragment.f27318b;
                        if (view3 != null) {
                            return (VerticalSwipeRefreshLayout) view3.findViewById(Ac.e.refreshLayout);
                        }
                        return null;
                    case 3:
                        HomeSavingsUserV2Fragment.a aVar4 = HomeSavingsUserV2Fragment.f35149F0;
                        View view4 = homeSavingsUserV2Fragment.f27318b;
                        if (view4 != null) {
                            return (CashBoxIntroductionView) view4.findViewById(Ac.e.cashBoxIntroductionView);
                        }
                        return null;
                    case 4:
                        HomeSavingsUserV2Fragment.a aVar5 = HomeSavingsUserV2Fragment.f35149F0;
                        View view5 = homeSavingsUserV2Fragment.f27318b;
                        if (view5 != null) {
                            return (RecyclerView) view5.findViewById(Ac.e.rl_accountList);
                        }
                        return null;
                    case 5:
                        HomeSavingsUserV2Fragment.a aVar6 = HomeSavingsUserV2Fragment.f35149F0;
                        View view6 = homeSavingsUserV2Fragment.f27318b;
                        if (view6 != null) {
                            return (LinearLayout) view6.findViewById(Ac.e.ll_account);
                        }
                        return null;
                    case 6:
                        HomeSavingsUserV2Fragment.a aVar7 = HomeSavingsUserV2Fragment.f35149F0;
                        View view7 = homeSavingsUserV2Fragment.f27318b;
                        if (view7 != null) {
                            return (ImageView) view7.findViewById(Ac.e.imageViewNext);
                        }
                        return null;
                    case 7:
                        HomeSavingsUserV2Fragment.a aVar8 = HomeSavingsUserV2Fragment.f35149F0;
                        View view8 = homeSavingsUserV2Fragment.f27318b;
                        if (view8 != null) {
                            return (ImageView) view8.findViewById(Ac.e.ivYesterDayArrow);
                        }
                        return null;
                    case 8:
                        HomeSavingsUserV2Fragment.a aVar9 = HomeSavingsUserV2Fragment.f35149F0;
                        View view9 = homeSavingsUserV2Fragment.f27318b;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(Ac.e.tvYesterdayReturnAmount);
                        }
                        return null;
                    case 9:
                        HomeSavingsUserV2Fragment.a aVar10 = HomeSavingsUserV2Fragment.f35149F0;
                        View view10 = homeSavingsUserV2Fragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(Ac.e.tvTotalAssetsAmount);
                        }
                        return null;
                    case 10:
                        HomeSavingsUserV2Fragment.a aVar11 = HomeSavingsUserV2Fragment.f35149F0;
                        View view11 = homeSavingsUserV2Fragment.f27318b;
                        if (view11 != null) {
                            return (ImageView) view11.findViewById(Ac.e.ivToggleShowBalance);
                        }
                        return null;
                    case 11:
                        HomeSavingsUserV2Fragment.a aVar12 = HomeSavingsUserV2Fragment.f35149F0;
                        View view12 = homeSavingsUserV2Fragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(Ac.e.tvTotalAssets);
                        }
                        return null;
                    case 12:
                        HomeSavingsUserV2Fragment.a aVar13 = HomeSavingsUserV2Fragment.f35149F0;
                        View view13 = homeSavingsUserV2Fragment.f27318b;
                        if (view13 != null) {
                            return (ConstraintLayout) view13.findViewById(Ac.e.layoutMyFortune);
                        }
                        return null;
                    case 13:
                        HomeSavingsUserV2Fragment.a aVar14 = HomeSavingsUserV2Fragment.f35149F0;
                        View view14 = homeSavingsUserV2Fragment.f27318b;
                        if (view14 != null) {
                            return (ImageView) view14.findViewById(Ac.e.imageViewUp);
                        }
                        return null;
                    case 14:
                        HomeSavingsUserV2Fragment.a aVar15 = HomeSavingsUserV2Fragment.f35149F0;
                        View view15 = homeSavingsUserV2Fragment.f27318b;
                        if (view15 != null) {
                            return (LinearLayout) view15.findViewById(Ac.e.ll_dynmic_module);
                        }
                        return null;
                    case 15:
                        HomeSavingsUserV2Fragment.a aVar16 = HomeSavingsUserV2Fragment.f35149F0;
                        View view16 = homeSavingsUserV2Fragment.f27318b;
                        if (view16 != null) {
                            return (BannerAdView) view16.findViewById(Ac.e.adMiddle);
                        }
                        return null;
                    default:
                        HomeSavingsUserV2Fragment.a aVar17 = HomeSavingsUserV2Fragment.f35149F0;
                        View view17 = homeSavingsUserV2Fragment.f27318b;
                        if (view17 != null) {
                            return (LinearLayout) view17.findViewById(Ac.e.functionIndicator);
                        }
                        return null;
                }
            }
        });
        final int i12 = 6;
        this.f35156A = C2131j.b(new Function0(this) { // from class: Ce.W

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeSavingsUserV2Fragment f1456b;

            {
                this.f1456b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                HomeSavingsUserV2Fragment homeSavingsUserV2Fragment = this.f1456b;
                switch (i12) {
                    case 0:
                        HomeSavingsUserV2Fragment.a aVar = HomeSavingsUserV2Fragment.f35149F0;
                        View view = homeSavingsUserV2Fragment.f27318b;
                        if (view != null) {
                            return (RecyclerView) view.findViewById(Ac.e.functionList);
                        }
                        return null;
                    case 1:
                        HomeSavingsUserV2Fragment.a aVar2 = HomeSavingsUserV2Fragment.f35149F0;
                        View view2 = homeSavingsUserV2Fragment.f27318b;
                        if (view2 != null) {
                            return (MarqueeViewV2) view2.findViewById(Ac.e.topTextAd);
                        }
                        return null;
                    case 2:
                        HomeSavingsUserV2Fragment.a aVar3 = HomeSavingsUserV2Fragment.f35149F0;
                        View view3 = homeSavingsUserV2Fragment.f27318b;
                        if (view3 != null) {
                            return (VerticalSwipeRefreshLayout) view3.findViewById(Ac.e.refreshLayout);
                        }
                        return null;
                    case 3:
                        HomeSavingsUserV2Fragment.a aVar4 = HomeSavingsUserV2Fragment.f35149F0;
                        View view4 = homeSavingsUserV2Fragment.f27318b;
                        if (view4 != null) {
                            return (CashBoxIntroductionView) view4.findViewById(Ac.e.cashBoxIntroductionView);
                        }
                        return null;
                    case 4:
                        HomeSavingsUserV2Fragment.a aVar5 = HomeSavingsUserV2Fragment.f35149F0;
                        View view5 = homeSavingsUserV2Fragment.f27318b;
                        if (view5 != null) {
                            return (RecyclerView) view5.findViewById(Ac.e.rl_accountList);
                        }
                        return null;
                    case 5:
                        HomeSavingsUserV2Fragment.a aVar6 = HomeSavingsUserV2Fragment.f35149F0;
                        View view6 = homeSavingsUserV2Fragment.f27318b;
                        if (view6 != null) {
                            return (LinearLayout) view6.findViewById(Ac.e.ll_account);
                        }
                        return null;
                    case 6:
                        HomeSavingsUserV2Fragment.a aVar7 = HomeSavingsUserV2Fragment.f35149F0;
                        View view7 = homeSavingsUserV2Fragment.f27318b;
                        if (view7 != null) {
                            return (ImageView) view7.findViewById(Ac.e.imageViewNext);
                        }
                        return null;
                    case 7:
                        HomeSavingsUserV2Fragment.a aVar8 = HomeSavingsUserV2Fragment.f35149F0;
                        View view8 = homeSavingsUserV2Fragment.f27318b;
                        if (view8 != null) {
                            return (ImageView) view8.findViewById(Ac.e.ivYesterDayArrow);
                        }
                        return null;
                    case 8:
                        HomeSavingsUserV2Fragment.a aVar9 = HomeSavingsUserV2Fragment.f35149F0;
                        View view9 = homeSavingsUserV2Fragment.f27318b;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(Ac.e.tvYesterdayReturnAmount);
                        }
                        return null;
                    case 9:
                        HomeSavingsUserV2Fragment.a aVar10 = HomeSavingsUserV2Fragment.f35149F0;
                        View view10 = homeSavingsUserV2Fragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(Ac.e.tvTotalAssetsAmount);
                        }
                        return null;
                    case 10:
                        HomeSavingsUserV2Fragment.a aVar11 = HomeSavingsUserV2Fragment.f35149F0;
                        View view11 = homeSavingsUserV2Fragment.f27318b;
                        if (view11 != null) {
                            return (ImageView) view11.findViewById(Ac.e.ivToggleShowBalance);
                        }
                        return null;
                    case 11:
                        HomeSavingsUserV2Fragment.a aVar12 = HomeSavingsUserV2Fragment.f35149F0;
                        View view12 = homeSavingsUserV2Fragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(Ac.e.tvTotalAssets);
                        }
                        return null;
                    case 12:
                        HomeSavingsUserV2Fragment.a aVar13 = HomeSavingsUserV2Fragment.f35149F0;
                        View view13 = homeSavingsUserV2Fragment.f27318b;
                        if (view13 != null) {
                            return (ConstraintLayout) view13.findViewById(Ac.e.layoutMyFortune);
                        }
                        return null;
                    case 13:
                        HomeSavingsUserV2Fragment.a aVar14 = HomeSavingsUserV2Fragment.f35149F0;
                        View view14 = homeSavingsUserV2Fragment.f27318b;
                        if (view14 != null) {
                            return (ImageView) view14.findViewById(Ac.e.imageViewUp);
                        }
                        return null;
                    case 14:
                        HomeSavingsUserV2Fragment.a aVar15 = HomeSavingsUserV2Fragment.f35149F0;
                        View view15 = homeSavingsUserV2Fragment.f27318b;
                        if (view15 != null) {
                            return (LinearLayout) view15.findViewById(Ac.e.ll_dynmic_module);
                        }
                        return null;
                    case 15:
                        HomeSavingsUserV2Fragment.a aVar16 = HomeSavingsUserV2Fragment.f35149F0;
                        View view16 = homeSavingsUserV2Fragment.f27318b;
                        if (view16 != null) {
                            return (BannerAdView) view16.findViewById(Ac.e.adMiddle);
                        }
                        return null;
                    default:
                        HomeSavingsUserV2Fragment.a aVar17 = HomeSavingsUserV2Fragment.f35149F0;
                        View view17 = homeSavingsUserV2Fragment.f27318b;
                        if (view17 != null) {
                            return (LinearLayout) view17.findViewById(Ac.e.functionIndicator);
                        }
                        return null;
                }
            }
        });
        final int i13 = 7;
        this.f35158B = C2131j.b(new Function0(this) { // from class: Ce.W

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeSavingsUserV2Fragment f1456b;

            {
                this.f1456b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                HomeSavingsUserV2Fragment homeSavingsUserV2Fragment = this.f1456b;
                switch (i13) {
                    case 0:
                        HomeSavingsUserV2Fragment.a aVar = HomeSavingsUserV2Fragment.f35149F0;
                        View view = homeSavingsUserV2Fragment.f27318b;
                        if (view != null) {
                            return (RecyclerView) view.findViewById(Ac.e.functionList);
                        }
                        return null;
                    case 1:
                        HomeSavingsUserV2Fragment.a aVar2 = HomeSavingsUserV2Fragment.f35149F0;
                        View view2 = homeSavingsUserV2Fragment.f27318b;
                        if (view2 != null) {
                            return (MarqueeViewV2) view2.findViewById(Ac.e.topTextAd);
                        }
                        return null;
                    case 2:
                        HomeSavingsUserV2Fragment.a aVar3 = HomeSavingsUserV2Fragment.f35149F0;
                        View view3 = homeSavingsUserV2Fragment.f27318b;
                        if (view3 != null) {
                            return (VerticalSwipeRefreshLayout) view3.findViewById(Ac.e.refreshLayout);
                        }
                        return null;
                    case 3:
                        HomeSavingsUserV2Fragment.a aVar4 = HomeSavingsUserV2Fragment.f35149F0;
                        View view4 = homeSavingsUserV2Fragment.f27318b;
                        if (view4 != null) {
                            return (CashBoxIntroductionView) view4.findViewById(Ac.e.cashBoxIntroductionView);
                        }
                        return null;
                    case 4:
                        HomeSavingsUserV2Fragment.a aVar5 = HomeSavingsUserV2Fragment.f35149F0;
                        View view5 = homeSavingsUserV2Fragment.f27318b;
                        if (view5 != null) {
                            return (RecyclerView) view5.findViewById(Ac.e.rl_accountList);
                        }
                        return null;
                    case 5:
                        HomeSavingsUserV2Fragment.a aVar6 = HomeSavingsUserV2Fragment.f35149F0;
                        View view6 = homeSavingsUserV2Fragment.f27318b;
                        if (view6 != null) {
                            return (LinearLayout) view6.findViewById(Ac.e.ll_account);
                        }
                        return null;
                    case 6:
                        HomeSavingsUserV2Fragment.a aVar7 = HomeSavingsUserV2Fragment.f35149F0;
                        View view7 = homeSavingsUserV2Fragment.f27318b;
                        if (view7 != null) {
                            return (ImageView) view7.findViewById(Ac.e.imageViewNext);
                        }
                        return null;
                    case 7:
                        HomeSavingsUserV2Fragment.a aVar8 = HomeSavingsUserV2Fragment.f35149F0;
                        View view8 = homeSavingsUserV2Fragment.f27318b;
                        if (view8 != null) {
                            return (ImageView) view8.findViewById(Ac.e.ivYesterDayArrow);
                        }
                        return null;
                    case 8:
                        HomeSavingsUserV2Fragment.a aVar9 = HomeSavingsUserV2Fragment.f35149F0;
                        View view9 = homeSavingsUserV2Fragment.f27318b;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(Ac.e.tvYesterdayReturnAmount);
                        }
                        return null;
                    case 9:
                        HomeSavingsUserV2Fragment.a aVar10 = HomeSavingsUserV2Fragment.f35149F0;
                        View view10 = homeSavingsUserV2Fragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(Ac.e.tvTotalAssetsAmount);
                        }
                        return null;
                    case 10:
                        HomeSavingsUserV2Fragment.a aVar11 = HomeSavingsUserV2Fragment.f35149F0;
                        View view11 = homeSavingsUserV2Fragment.f27318b;
                        if (view11 != null) {
                            return (ImageView) view11.findViewById(Ac.e.ivToggleShowBalance);
                        }
                        return null;
                    case 11:
                        HomeSavingsUserV2Fragment.a aVar12 = HomeSavingsUserV2Fragment.f35149F0;
                        View view12 = homeSavingsUserV2Fragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(Ac.e.tvTotalAssets);
                        }
                        return null;
                    case 12:
                        HomeSavingsUserV2Fragment.a aVar13 = HomeSavingsUserV2Fragment.f35149F0;
                        View view13 = homeSavingsUserV2Fragment.f27318b;
                        if (view13 != null) {
                            return (ConstraintLayout) view13.findViewById(Ac.e.layoutMyFortune);
                        }
                        return null;
                    case 13:
                        HomeSavingsUserV2Fragment.a aVar14 = HomeSavingsUserV2Fragment.f35149F0;
                        View view14 = homeSavingsUserV2Fragment.f27318b;
                        if (view14 != null) {
                            return (ImageView) view14.findViewById(Ac.e.imageViewUp);
                        }
                        return null;
                    case 14:
                        HomeSavingsUserV2Fragment.a aVar15 = HomeSavingsUserV2Fragment.f35149F0;
                        View view15 = homeSavingsUserV2Fragment.f27318b;
                        if (view15 != null) {
                            return (LinearLayout) view15.findViewById(Ac.e.ll_dynmic_module);
                        }
                        return null;
                    case 15:
                        HomeSavingsUserV2Fragment.a aVar16 = HomeSavingsUserV2Fragment.f35149F0;
                        View view16 = homeSavingsUserV2Fragment.f27318b;
                        if (view16 != null) {
                            return (BannerAdView) view16.findViewById(Ac.e.adMiddle);
                        }
                        return null;
                    default:
                        HomeSavingsUserV2Fragment.a aVar17 = HomeSavingsUserV2Fragment.f35149F0;
                        View view17 = homeSavingsUserV2Fragment.f27318b;
                        if (view17 != null) {
                            return (LinearLayout) view17.findViewById(Ac.e.functionIndicator);
                        }
                        return null;
                }
            }
        });
        final int i14 = 8;
        this.f35160C = C2131j.b(new Function0(this) { // from class: Ce.W

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeSavingsUserV2Fragment f1456b;

            {
                this.f1456b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                HomeSavingsUserV2Fragment homeSavingsUserV2Fragment = this.f1456b;
                switch (i14) {
                    case 0:
                        HomeSavingsUserV2Fragment.a aVar = HomeSavingsUserV2Fragment.f35149F0;
                        View view = homeSavingsUserV2Fragment.f27318b;
                        if (view != null) {
                            return (RecyclerView) view.findViewById(Ac.e.functionList);
                        }
                        return null;
                    case 1:
                        HomeSavingsUserV2Fragment.a aVar2 = HomeSavingsUserV2Fragment.f35149F0;
                        View view2 = homeSavingsUserV2Fragment.f27318b;
                        if (view2 != null) {
                            return (MarqueeViewV2) view2.findViewById(Ac.e.topTextAd);
                        }
                        return null;
                    case 2:
                        HomeSavingsUserV2Fragment.a aVar3 = HomeSavingsUserV2Fragment.f35149F0;
                        View view3 = homeSavingsUserV2Fragment.f27318b;
                        if (view3 != null) {
                            return (VerticalSwipeRefreshLayout) view3.findViewById(Ac.e.refreshLayout);
                        }
                        return null;
                    case 3:
                        HomeSavingsUserV2Fragment.a aVar4 = HomeSavingsUserV2Fragment.f35149F0;
                        View view4 = homeSavingsUserV2Fragment.f27318b;
                        if (view4 != null) {
                            return (CashBoxIntroductionView) view4.findViewById(Ac.e.cashBoxIntroductionView);
                        }
                        return null;
                    case 4:
                        HomeSavingsUserV2Fragment.a aVar5 = HomeSavingsUserV2Fragment.f35149F0;
                        View view5 = homeSavingsUserV2Fragment.f27318b;
                        if (view5 != null) {
                            return (RecyclerView) view5.findViewById(Ac.e.rl_accountList);
                        }
                        return null;
                    case 5:
                        HomeSavingsUserV2Fragment.a aVar6 = HomeSavingsUserV2Fragment.f35149F0;
                        View view6 = homeSavingsUserV2Fragment.f27318b;
                        if (view6 != null) {
                            return (LinearLayout) view6.findViewById(Ac.e.ll_account);
                        }
                        return null;
                    case 6:
                        HomeSavingsUserV2Fragment.a aVar7 = HomeSavingsUserV2Fragment.f35149F0;
                        View view7 = homeSavingsUserV2Fragment.f27318b;
                        if (view7 != null) {
                            return (ImageView) view7.findViewById(Ac.e.imageViewNext);
                        }
                        return null;
                    case 7:
                        HomeSavingsUserV2Fragment.a aVar8 = HomeSavingsUserV2Fragment.f35149F0;
                        View view8 = homeSavingsUserV2Fragment.f27318b;
                        if (view8 != null) {
                            return (ImageView) view8.findViewById(Ac.e.ivYesterDayArrow);
                        }
                        return null;
                    case 8:
                        HomeSavingsUserV2Fragment.a aVar9 = HomeSavingsUserV2Fragment.f35149F0;
                        View view9 = homeSavingsUserV2Fragment.f27318b;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(Ac.e.tvYesterdayReturnAmount);
                        }
                        return null;
                    case 9:
                        HomeSavingsUserV2Fragment.a aVar10 = HomeSavingsUserV2Fragment.f35149F0;
                        View view10 = homeSavingsUserV2Fragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(Ac.e.tvTotalAssetsAmount);
                        }
                        return null;
                    case 10:
                        HomeSavingsUserV2Fragment.a aVar11 = HomeSavingsUserV2Fragment.f35149F0;
                        View view11 = homeSavingsUserV2Fragment.f27318b;
                        if (view11 != null) {
                            return (ImageView) view11.findViewById(Ac.e.ivToggleShowBalance);
                        }
                        return null;
                    case 11:
                        HomeSavingsUserV2Fragment.a aVar12 = HomeSavingsUserV2Fragment.f35149F0;
                        View view12 = homeSavingsUserV2Fragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(Ac.e.tvTotalAssets);
                        }
                        return null;
                    case 12:
                        HomeSavingsUserV2Fragment.a aVar13 = HomeSavingsUserV2Fragment.f35149F0;
                        View view13 = homeSavingsUserV2Fragment.f27318b;
                        if (view13 != null) {
                            return (ConstraintLayout) view13.findViewById(Ac.e.layoutMyFortune);
                        }
                        return null;
                    case 13:
                        HomeSavingsUserV2Fragment.a aVar14 = HomeSavingsUserV2Fragment.f35149F0;
                        View view14 = homeSavingsUserV2Fragment.f27318b;
                        if (view14 != null) {
                            return (ImageView) view14.findViewById(Ac.e.imageViewUp);
                        }
                        return null;
                    case 14:
                        HomeSavingsUserV2Fragment.a aVar15 = HomeSavingsUserV2Fragment.f35149F0;
                        View view15 = homeSavingsUserV2Fragment.f27318b;
                        if (view15 != null) {
                            return (LinearLayout) view15.findViewById(Ac.e.ll_dynmic_module);
                        }
                        return null;
                    case 15:
                        HomeSavingsUserV2Fragment.a aVar16 = HomeSavingsUserV2Fragment.f35149F0;
                        View view16 = homeSavingsUserV2Fragment.f27318b;
                        if (view16 != null) {
                            return (BannerAdView) view16.findViewById(Ac.e.adMiddle);
                        }
                        return null;
                    default:
                        HomeSavingsUserV2Fragment.a aVar17 = HomeSavingsUserV2Fragment.f35149F0;
                        View view17 = homeSavingsUserV2Fragment.f27318b;
                        if (view17 != null) {
                            return (LinearLayout) view17.findViewById(Ac.e.functionIndicator);
                        }
                        return null;
                }
            }
        });
        final int i15 = 9;
        this.f35164H = C2131j.b(new Function0(this) { // from class: Ce.W

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeSavingsUserV2Fragment f1456b;

            {
                this.f1456b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                HomeSavingsUserV2Fragment homeSavingsUserV2Fragment = this.f1456b;
                switch (i15) {
                    case 0:
                        HomeSavingsUserV2Fragment.a aVar = HomeSavingsUserV2Fragment.f35149F0;
                        View view = homeSavingsUserV2Fragment.f27318b;
                        if (view != null) {
                            return (RecyclerView) view.findViewById(Ac.e.functionList);
                        }
                        return null;
                    case 1:
                        HomeSavingsUserV2Fragment.a aVar2 = HomeSavingsUserV2Fragment.f35149F0;
                        View view2 = homeSavingsUserV2Fragment.f27318b;
                        if (view2 != null) {
                            return (MarqueeViewV2) view2.findViewById(Ac.e.topTextAd);
                        }
                        return null;
                    case 2:
                        HomeSavingsUserV2Fragment.a aVar3 = HomeSavingsUserV2Fragment.f35149F0;
                        View view3 = homeSavingsUserV2Fragment.f27318b;
                        if (view3 != null) {
                            return (VerticalSwipeRefreshLayout) view3.findViewById(Ac.e.refreshLayout);
                        }
                        return null;
                    case 3:
                        HomeSavingsUserV2Fragment.a aVar4 = HomeSavingsUserV2Fragment.f35149F0;
                        View view4 = homeSavingsUserV2Fragment.f27318b;
                        if (view4 != null) {
                            return (CashBoxIntroductionView) view4.findViewById(Ac.e.cashBoxIntroductionView);
                        }
                        return null;
                    case 4:
                        HomeSavingsUserV2Fragment.a aVar5 = HomeSavingsUserV2Fragment.f35149F0;
                        View view5 = homeSavingsUserV2Fragment.f27318b;
                        if (view5 != null) {
                            return (RecyclerView) view5.findViewById(Ac.e.rl_accountList);
                        }
                        return null;
                    case 5:
                        HomeSavingsUserV2Fragment.a aVar6 = HomeSavingsUserV2Fragment.f35149F0;
                        View view6 = homeSavingsUserV2Fragment.f27318b;
                        if (view6 != null) {
                            return (LinearLayout) view6.findViewById(Ac.e.ll_account);
                        }
                        return null;
                    case 6:
                        HomeSavingsUserV2Fragment.a aVar7 = HomeSavingsUserV2Fragment.f35149F0;
                        View view7 = homeSavingsUserV2Fragment.f27318b;
                        if (view7 != null) {
                            return (ImageView) view7.findViewById(Ac.e.imageViewNext);
                        }
                        return null;
                    case 7:
                        HomeSavingsUserV2Fragment.a aVar8 = HomeSavingsUserV2Fragment.f35149F0;
                        View view8 = homeSavingsUserV2Fragment.f27318b;
                        if (view8 != null) {
                            return (ImageView) view8.findViewById(Ac.e.ivYesterDayArrow);
                        }
                        return null;
                    case 8:
                        HomeSavingsUserV2Fragment.a aVar9 = HomeSavingsUserV2Fragment.f35149F0;
                        View view9 = homeSavingsUserV2Fragment.f27318b;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(Ac.e.tvYesterdayReturnAmount);
                        }
                        return null;
                    case 9:
                        HomeSavingsUserV2Fragment.a aVar10 = HomeSavingsUserV2Fragment.f35149F0;
                        View view10 = homeSavingsUserV2Fragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(Ac.e.tvTotalAssetsAmount);
                        }
                        return null;
                    case 10:
                        HomeSavingsUserV2Fragment.a aVar11 = HomeSavingsUserV2Fragment.f35149F0;
                        View view11 = homeSavingsUserV2Fragment.f27318b;
                        if (view11 != null) {
                            return (ImageView) view11.findViewById(Ac.e.ivToggleShowBalance);
                        }
                        return null;
                    case 11:
                        HomeSavingsUserV2Fragment.a aVar12 = HomeSavingsUserV2Fragment.f35149F0;
                        View view12 = homeSavingsUserV2Fragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(Ac.e.tvTotalAssets);
                        }
                        return null;
                    case 12:
                        HomeSavingsUserV2Fragment.a aVar13 = HomeSavingsUserV2Fragment.f35149F0;
                        View view13 = homeSavingsUserV2Fragment.f27318b;
                        if (view13 != null) {
                            return (ConstraintLayout) view13.findViewById(Ac.e.layoutMyFortune);
                        }
                        return null;
                    case 13:
                        HomeSavingsUserV2Fragment.a aVar14 = HomeSavingsUserV2Fragment.f35149F0;
                        View view14 = homeSavingsUserV2Fragment.f27318b;
                        if (view14 != null) {
                            return (ImageView) view14.findViewById(Ac.e.imageViewUp);
                        }
                        return null;
                    case 14:
                        HomeSavingsUserV2Fragment.a aVar15 = HomeSavingsUserV2Fragment.f35149F0;
                        View view15 = homeSavingsUserV2Fragment.f27318b;
                        if (view15 != null) {
                            return (LinearLayout) view15.findViewById(Ac.e.ll_dynmic_module);
                        }
                        return null;
                    case 15:
                        HomeSavingsUserV2Fragment.a aVar16 = HomeSavingsUserV2Fragment.f35149F0;
                        View view16 = homeSavingsUserV2Fragment.f27318b;
                        if (view16 != null) {
                            return (BannerAdView) view16.findViewById(Ac.e.adMiddle);
                        }
                        return null;
                    default:
                        HomeSavingsUserV2Fragment.a aVar17 = HomeSavingsUserV2Fragment.f35149F0;
                        View view17 = homeSavingsUserV2Fragment.f27318b;
                        if (view17 != null) {
                            return (LinearLayout) view17.findViewById(Ac.e.functionIndicator);
                        }
                        return null;
                }
            }
        });
        final int i16 = 10;
        this.f35165L = C2131j.b(new Function0(this) { // from class: Ce.W

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeSavingsUserV2Fragment f1456b;

            {
                this.f1456b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                HomeSavingsUserV2Fragment homeSavingsUserV2Fragment = this.f1456b;
                switch (i16) {
                    case 0:
                        HomeSavingsUserV2Fragment.a aVar = HomeSavingsUserV2Fragment.f35149F0;
                        View view = homeSavingsUserV2Fragment.f27318b;
                        if (view != null) {
                            return (RecyclerView) view.findViewById(Ac.e.functionList);
                        }
                        return null;
                    case 1:
                        HomeSavingsUserV2Fragment.a aVar2 = HomeSavingsUserV2Fragment.f35149F0;
                        View view2 = homeSavingsUserV2Fragment.f27318b;
                        if (view2 != null) {
                            return (MarqueeViewV2) view2.findViewById(Ac.e.topTextAd);
                        }
                        return null;
                    case 2:
                        HomeSavingsUserV2Fragment.a aVar3 = HomeSavingsUserV2Fragment.f35149F0;
                        View view3 = homeSavingsUserV2Fragment.f27318b;
                        if (view3 != null) {
                            return (VerticalSwipeRefreshLayout) view3.findViewById(Ac.e.refreshLayout);
                        }
                        return null;
                    case 3:
                        HomeSavingsUserV2Fragment.a aVar4 = HomeSavingsUserV2Fragment.f35149F0;
                        View view4 = homeSavingsUserV2Fragment.f27318b;
                        if (view4 != null) {
                            return (CashBoxIntroductionView) view4.findViewById(Ac.e.cashBoxIntroductionView);
                        }
                        return null;
                    case 4:
                        HomeSavingsUserV2Fragment.a aVar5 = HomeSavingsUserV2Fragment.f35149F0;
                        View view5 = homeSavingsUserV2Fragment.f27318b;
                        if (view5 != null) {
                            return (RecyclerView) view5.findViewById(Ac.e.rl_accountList);
                        }
                        return null;
                    case 5:
                        HomeSavingsUserV2Fragment.a aVar6 = HomeSavingsUserV2Fragment.f35149F0;
                        View view6 = homeSavingsUserV2Fragment.f27318b;
                        if (view6 != null) {
                            return (LinearLayout) view6.findViewById(Ac.e.ll_account);
                        }
                        return null;
                    case 6:
                        HomeSavingsUserV2Fragment.a aVar7 = HomeSavingsUserV2Fragment.f35149F0;
                        View view7 = homeSavingsUserV2Fragment.f27318b;
                        if (view7 != null) {
                            return (ImageView) view7.findViewById(Ac.e.imageViewNext);
                        }
                        return null;
                    case 7:
                        HomeSavingsUserV2Fragment.a aVar8 = HomeSavingsUserV2Fragment.f35149F0;
                        View view8 = homeSavingsUserV2Fragment.f27318b;
                        if (view8 != null) {
                            return (ImageView) view8.findViewById(Ac.e.ivYesterDayArrow);
                        }
                        return null;
                    case 8:
                        HomeSavingsUserV2Fragment.a aVar9 = HomeSavingsUserV2Fragment.f35149F0;
                        View view9 = homeSavingsUserV2Fragment.f27318b;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(Ac.e.tvYesterdayReturnAmount);
                        }
                        return null;
                    case 9:
                        HomeSavingsUserV2Fragment.a aVar10 = HomeSavingsUserV2Fragment.f35149F0;
                        View view10 = homeSavingsUserV2Fragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(Ac.e.tvTotalAssetsAmount);
                        }
                        return null;
                    case 10:
                        HomeSavingsUserV2Fragment.a aVar11 = HomeSavingsUserV2Fragment.f35149F0;
                        View view11 = homeSavingsUserV2Fragment.f27318b;
                        if (view11 != null) {
                            return (ImageView) view11.findViewById(Ac.e.ivToggleShowBalance);
                        }
                        return null;
                    case 11:
                        HomeSavingsUserV2Fragment.a aVar12 = HomeSavingsUserV2Fragment.f35149F0;
                        View view12 = homeSavingsUserV2Fragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(Ac.e.tvTotalAssets);
                        }
                        return null;
                    case 12:
                        HomeSavingsUserV2Fragment.a aVar13 = HomeSavingsUserV2Fragment.f35149F0;
                        View view13 = homeSavingsUserV2Fragment.f27318b;
                        if (view13 != null) {
                            return (ConstraintLayout) view13.findViewById(Ac.e.layoutMyFortune);
                        }
                        return null;
                    case 13:
                        HomeSavingsUserV2Fragment.a aVar14 = HomeSavingsUserV2Fragment.f35149F0;
                        View view14 = homeSavingsUserV2Fragment.f27318b;
                        if (view14 != null) {
                            return (ImageView) view14.findViewById(Ac.e.imageViewUp);
                        }
                        return null;
                    case 14:
                        HomeSavingsUserV2Fragment.a aVar15 = HomeSavingsUserV2Fragment.f35149F0;
                        View view15 = homeSavingsUserV2Fragment.f27318b;
                        if (view15 != null) {
                            return (LinearLayout) view15.findViewById(Ac.e.ll_dynmic_module);
                        }
                        return null;
                    case 15:
                        HomeSavingsUserV2Fragment.a aVar16 = HomeSavingsUserV2Fragment.f35149F0;
                        View view16 = homeSavingsUserV2Fragment.f27318b;
                        if (view16 != null) {
                            return (BannerAdView) view16.findViewById(Ac.e.adMiddle);
                        }
                        return null;
                    default:
                        HomeSavingsUserV2Fragment.a aVar17 = HomeSavingsUserV2Fragment.f35149F0;
                        View view17 = homeSavingsUserV2Fragment.f27318b;
                        if (view17 != null) {
                            return (LinearLayout) view17.findViewById(Ac.e.functionIndicator);
                        }
                        return null;
                }
            }
        });
        final int i17 = 11;
        this.f35166M = C2131j.b(new Function0(this) { // from class: Ce.W

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeSavingsUserV2Fragment f1456b;

            {
                this.f1456b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                HomeSavingsUserV2Fragment homeSavingsUserV2Fragment = this.f1456b;
                switch (i17) {
                    case 0:
                        HomeSavingsUserV2Fragment.a aVar = HomeSavingsUserV2Fragment.f35149F0;
                        View view = homeSavingsUserV2Fragment.f27318b;
                        if (view != null) {
                            return (RecyclerView) view.findViewById(Ac.e.functionList);
                        }
                        return null;
                    case 1:
                        HomeSavingsUserV2Fragment.a aVar2 = HomeSavingsUserV2Fragment.f35149F0;
                        View view2 = homeSavingsUserV2Fragment.f27318b;
                        if (view2 != null) {
                            return (MarqueeViewV2) view2.findViewById(Ac.e.topTextAd);
                        }
                        return null;
                    case 2:
                        HomeSavingsUserV2Fragment.a aVar3 = HomeSavingsUserV2Fragment.f35149F0;
                        View view3 = homeSavingsUserV2Fragment.f27318b;
                        if (view3 != null) {
                            return (VerticalSwipeRefreshLayout) view3.findViewById(Ac.e.refreshLayout);
                        }
                        return null;
                    case 3:
                        HomeSavingsUserV2Fragment.a aVar4 = HomeSavingsUserV2Fragment.f35149F0;
                        View view4 = homeSavingsUserV2Fragment.f27318b;
                        if (view4 != null) {
                            return (CashBoxIntroductionView) view4.findViewById(Ac.e.cashBoxIntroductionView);
                        }
                        return null;
                    case 4:
                        HomeSavingsUserV2Fragment.a aVar5 = HomeSavingsUserV2Fragment.f35149F0;
                        View view5 = homeSavingsUserV2Fragment.f27318b;
                        if (view5 != null) {
                            return (RecyclerView) view5.findViewById(Ac.e.rl_accountList);
                        }
                        return null;
                    case 5:
                        HomeSavingsUserV2Fragment.a aVar6 = HomeSavingsUserV2Fragment.f35149F0;
                        View view6 = homeSavingsUserV2Fragment.f27318b;
                        if (view6 != null) {
                            return (LinearLayout) view6.findViewById(Ac.e.ll_account);
                        }
                        return null;
                    case 6:
                        HomeSavingsUserV2Fragment.a aVar7 = HomeSavingsUserV2Fragment.f35149F0;
                        View view7 = homeSavingsUserV2Fragment.f27318b;
                        if (view7 != null) {
                            return (ImageView) view7.findViewById(Ac.e.imageViewNext);
                        }
                        return null;
                    case 7:
                        HomeSavingsUserV2Fragment.a aVar8 = HomeSavingsUserV2Fragment.f35149F0;
                        View view8 = homeSavingsUserV2Fragment.f27318b;
                        if (view8 != null) {
                            return (ImageView) view8.findViewById(Ac.e.ivYesterDayArrow);
                        }
                        return null;
                    case 8:
                        HomeSavingsUserV2Fragment.a aVar9 = HomeSavingsUserV2Fragment.f35149F0;
                        View view9 = homeSavingsUserV2Fragment.f27318b;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(Ac.e.tvYesterdayReturnAmount);
                        }
                        return null;
                    case 9:
                        HomeSavingsUserV2Fragment.a aVar10 = HomeSavingsUserV2Fragment.f35149F0;
                        View view10 = homeSavingsUserV2Fragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(Ac.e.tvTotalAssetsAmount);
                        }
                        return null;
                    case 10:
                        HomeSavingsUserV2Fragment.a aVar11 = HomeSavingsUserV2Fragment.f35149F0;
                        View view11 = homeSavingsUserV2Fragment.f27318b;
                        if (view11 != null) {
                            return (ImageView) view11.findViewById(Ac.e.ivToggleShowBalance);
                        }
                        return null;
                    case 11:
                        HomeSavingsUserV2Fragment.a aVar12 = HomeSavingsUserV2Fragment.f35149F0;
                        View view12 = homeSavingsUserV2Fragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(Ac.e.tvTotalAssets);
                        }
                        return null;
                    case 12:
                        HomeSavingsUserV2Fragment.a aVar13 = HomeSavingsUserV2Fragment.f35149F0;
                        View view13 = homeSavingsUserV2Fragment.f27318b;
                        if (view13 != null) {
                            return (ConstraintLayout) view13.findViewById(Ac.e.layoutMyFortune);
                        }
                        return null;
                    case 13:
                        HomeSavingsUserV2Fragment.a aVar14 = HomeSavingsUserV2Fragment.f35149F0;
                        View view14 = homeSavingsUserV2Fragment.f27318b;
                        if (view14 != null) {
                            return (ImageView) view14.findViewById(Ac.e.imageViewUp);
                        }
                        return null;
                    case 14:
                        HomeSavingsUserV2Fragment.a aVar15 = HomeSavingsUserV2Fragment.f35149F0;
                        View view15 = homeSavingsUserV2Fragment.f27318b;
                        if (view15 != null) {
                            return (LinearLayout) view15.findViewById(Ac.e.ll_dynmic_module);
                        }
                        return null;
                    case 15:
                        HomeSavingsUserV2Fragment.a aVar16 = HomeSavingsUserV2Fragment.f35149F0;
                        View view16 = homeSavingsUserV2Fragment.f27318b;
                        if (view16 != null) {
                            return (BannerAdView) view16.findViewById(Ac.e.adMiddle);
                        }
                        return null;
                    default:
                        HomeSavingsUserV2Fragment.a aVar17 = HomeSavingsUserV2Fragment.f35149F0;
                        View view17 = homeSavingsUserV2Fragment.f27318b;
                        if (view17 != null) {
                            return (LinearLayout) view17.findViewById(Ac.e.functionIndicator);
                        }
                        return null;
                }
            }
        });
        final int i18 = 12;
        this.f35167Q = C2131j.b(new Function0(this) { // from class: Ce.W

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeSavingsUserV2Fragment f1456b;

            {
                this.f1456b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                HomeSavingsUserV2Fragment homeSavingsUserV2Fragment = this.f1456b;
                switch (i18) {
                    case 0:
                        HomeSavingsUserV2Fragment.a aVar = HomeSavingsUserV2Fragment.f35149F0;
                        View view = homeSavingsUserV2Fragment.f27318b;
                        if (view != null) {
                            return (RecyclerView) view.findViewById(Ac.e.functionList);
                        }
                        return null;
                    case 1:
                        HomeSavingsUserV2Fragment.a aVar2 = HomeSavingsUserV2Fragment.f35149F0;
                        View view2 = homeSavingsUserV2Fragment.f27318b;
                        if (view2 != null) {
                            return (MarqueeViewV2) view2.findViewById(Ac.e.topTextAd);
                        }
                        return null;
                    case 2:
                        HomeSavingsUserV2Fragment.a aVar3 = HomeSavingsUserV2Fragment.f35149F0;
                        View view3 = homeSavingsUserV2Fragment.f27318b;
                        if (view3 != null) {
                            return (VerticalSwipeRefreshLayout) view3.findViewById(Ac.e.refreshLayout);
                        }
                        return null;
                    case 3:
                        HomeSavingsUserV2Fragment.a aVar4 = HomeSavingsUserV2Fragment.f35149F0;
                        View view4 = homeSavingsUserV2Fragment.f27318b;
                        if (view4 != null) {
                            return (CashBoxIntroductionView) view4.findViewById(Ac.e.cashBoxIntroductionView);
                        }
                        return null;
                    case 4:
                        HomeSavingsUserV2Fragment.a aVar5 = HomeSavingsUserV2Fragment.f35149F0;
                        View view5 = homeSavingsUserV2Fragment.f27318b;
                        if (view5 != null) {
                            return (RecyclerView) view5.findViewById(Ac.e.rl_accountList);
                        }
                        return null;
                    case 5:
                        HomeSavingsUserV2Fragment.a aVar6 = HomeSavingsUserV2Fragment.f35149F0;
                        View view6 = homeSavingsUserV2Fragment.f27318b;
                        if (view6 != null) {
                            return (LinearLayout) view6.findViewById(Ac.e.ll_account);
                        }
                        return null;
                    case 6:
                        HomeSavingsUserV2Fragment.a aVar7 = HomeSavingsUserV2Fragment.f35149F0;
                        View view7 = homeSavingsUserV2Fragment.f27318b;
                        if (view7 != null) {
                            return (ImageView) view7.findViewById(Ac.e.imageViewNext);
                        }
                        return null;
                    case 7:
                        HomeSavingsUserV2Fragment.a aVar8 = HomeSavingsUserV2Fragment.f35149F0;
                        View view8 = homeSavingsUserV2Fragment.f27318b;
                        if (view8 != null) {
                            return (ImageView) view8.findViewById(Ac.e.ivYesterDayArrow);
                        }
                        return null;
                    case 8:
                        HomeSavingsUserV2Fragment.a aVar9 = HomeSavingsUserV2Fragment.f35149F0;
                        View view9 = homeSavingsUserV2Fragment.f27318b;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(Ac.e.tvYesterdayReturnAmount);
                        }
                        return null;
                    case 9:
                        HomeSavingsUserV2Fragment.a aVar10 = HomeSavingsUserV2Fragment.f35149F0;
                        View view10 = homeSavingsUserV2Fragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(Ac.e.tvTotalAssetsAmount);
                        }
                        return null;
                    case 10:
                        HomeSavingsUserV2Fragment.a aVar11 = HomeSavingsUserV2Fragment.f35149F0;
                        View view11 = homeSavingsUserV2Fragment.f27318b;
                        if (view11 != null) {
                            return (ImageView) view11.findViewById(Ac.e.ivToggleShowBalance);
                        }
                        return null;
                    case 11:
                        HomeSavingsUserV2Fragment.a aVar12 = HomeSavingsUserV2Fragment.f35149F0;
                        View view12 = homeSavingsUserV2Fragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(Ac.e.tvTotalAssets);
                        }
                        return null;
                    case 12:
                        HomeSavingsUserV2Fragment.a aVar13 = HomeSavingsUserV2Fragment.f35149F0;
                        View view13 = homeSavingsUserV2Fragment.f27318b;
                        if (view13 != null) {
                            return (ConstraintLayout) view13.findViewById(Ac.e.layoutMyFortune);
                        }
                        return null;
                    case 13:
                        HomeSavingsUserV2Fragment.a aVar14 = HomeSavingsUserV2Fragment.f35149F0;
                        View view14 = homeSavingsUserV2Fragment.f27318b;
                        if (view14 != null) {
                            return (ImageView) view14.findViewById(Ac.e.imageViewUp);
                        }
                        return null;
                    case 14:
                        HomeSavingsUserV2Fragment.a aVar15 = HomeSavingsUserV2Fragment.f35149F0;
                        View view15 = homeSavingsUserV2Fragment.f27318b;
                        if (view15 != null) {
                            return (LinearLayout) view15.findViewById(Ac.e.ll_dynmic_module);
                        }
                        return null;
                    case 15:
                        HomeSavingsUserV2Fragment.a aVar16 = HomeSavingsUserV2Fragment.f35149F0;
                        View view16 = homeSavingsUserV2Fragment.f27318b;
                        if (view16 != null) {
                            return (BannerAdView) view16.findViewById(Ac.e.adMiddle);
                        }
                        return null;
                    default:
                        HomeSavingsUserV2Fragment.a aVar17 = HomeSavingsUserV2Fragment.f35149F0;
                        View view17 = homeSavingsUserV2Fragment.f27318b;
                        if (view17 != null) {
                            return (LinearLayout) view17.findViewById(Ac.e.functionIndicator);
                        }
                        return null;
                }
            }
        });
        final int i19 = 14;
        this.f35168X = C2131j.b(new Function0(this) { // from class: Ce.W

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeSavingsUserV2Fragment f1456b;

            {
                this.f1456b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                HomeSavingsUserV2Fragment homeSavingsUserV2Fragment = this.f1456b;
                switch (i19) {
                    case 0:
                        HomeSavingsUserV2Fragment.a aVar = HomeSavingsUserV2Fragment.f35149F0;
                        View view = homeSavingsUserV2Fragment.f27318b;
                        if (view != null) {
                            return (RecyclerView) view.findViewById(Ac.e.functionList);
                        }
                        return null;
                    case 1:
                        HomeSavingsUserV2Fragment.a aVar2 = HomeSavingsUserV2Fragment.f35149F0;
                        View view2 = homeSavingsUserV2Fragment.f27318b;
                        if (view2 != null) {
                            return (MarqueeViewV2) view2.findViewById(Ac.e.topTextAd);
                        }
                        return null;
                    case 2:
                        HomeSavingsUserV2Fragment.a aVar3 = HomeSavingsUserV2Fragment.f35149F0;
                        View view3 = homeSavingsUserV2Fragment.f27318b;
                        if (view3 != null) {
                            return (VerticalSwipeRefreshLayout) view3.findViewById(Ac.e.refreshLayout);
                        }
                        return null;
                    case 3:
                        HomeSavingsUserV2Fragment.a aVar4 = HomeSavingsUserV2Fragment.f35149F0;
                        View view4 = homeSavingsUserV2Fragment.f27318b;
                        if (view4 != null) {
                            return (CashBoxIntroductionView) view4.findViewById(Ac.e.cashBoxIntroductionView);
                        }
                        return null;
                    case 4:
                        HomeSavingsUserV2Fragment.a aVar5 = HomeSavingsUserV2Fragment.f35149F0;
                        View view5 = homeSavingsUserV2Fragment.f27318b;
                        if (view5 != null) {
                            return (RecyclerView) view5.findViewById(Ac.e.rl_accountList);
                        }
                        return null;
                    case 5:
                        HomeSavingsUserV2Fragment.a aVar6 = HomeSavingsUserV2Fragment.f35149F0;
                        View view6 = homeSavingsUserV2Fragment.f27318b;
                        if (view6 != null) {
                            return (LinearLayout) view6.findViewById(Ac.e.ll_account);
                        }
                        return null;
                    case 6:
                        HomeSavingsUserV2Fragment.a aVar7 = HomeSavingsUserV2Fragment.f35149F0;
                        View view7 = homeSavingsUserV2Fragment.f27318b;
                        if (view7 != null) {
                            return (ImageView) view7.findViewById(Ac.e.imageViewNext);
                        }
                        return null;
                    case 7:
                        HomeSavingsUserV2Fragment.a aVar8 = HomeSavingsUserV2Fragment.f35149F0;
                        View view8 = homeSavingsUserV2Fragment.f27318b;
                        if (view8 != null) {
                            return (ImageView) view8.findViewById(Ac.e.ivYesterDayArrow);
                        }
                        return null;
                    case 8:
                        HomeSavingsUserV2Fragment.a aVar9 = HomeSavingsUserV2Fragment.f35149F0;
                        View view9 = homeSavingsUserV2Fragment.f27318b;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(Ac.e.tvYesterdayReturnAmount);
                        }
                        return null;
                    case 9:
                        HomeSavingsUserV2Fragment.a aVar10 = HomeSavingsUserV2Fragment.f35149F0;
                        View view10 = homeSavingsUserV2Fragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(Ac.e.tvTotalAssetsAmount);
                        }
                        return null;
                    case 10:
                        HomeSavingsUserV2Fragment.a aVar11 = HomeSavingsUserV2Fragment.f35149F0;
                        View view11 = homeSavingsUserV2Fragment.f27318b;
                        if (view11 != null) {
                            return (ImageView) view11.findViewById(Ac.e.ivToggleShowBalance);
                        }
                        return null;
                    case 11:
                        HomeSavingsUserV2Fragment.a aVar12 = HomeSavingsUserV2Fragment.f35149F0;
                        View view12 = homeSavingsUserV2Fragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(Ac.e.tvTotalAssets);
                        }
                        return null;
                    case 12:
                        HomeSavingsUserV2Fragment.a aVar13 = HomeSavingsUserV2Fragment.f35149F0;
                        View view13 = homeSavingsUserV2Fragment.f27318b;
                        if (view13 != null) {
                            return (ConstraintLayout) view13.findViewById(Ac.e.layoutMyFortune);
                        }
                        return null;
                    case 13:
                        HomeSavingsUserV2Fragment.a aVar14 = HomeSavingsUserV2Fragment.f35149F0;
                        View view14 = homeSavingsUserV2Fragment.f27318b;
                        if (view14 != null) {
                            return (ImageView) view14.findViewById(Ac.e.imageViewUp);
                        }
                        return null;
                    case 14:
                        HomeSavingsUserV2Fragment.a aVar15 = HomeSavingsUserV2Fragment.f35149F0;
                        View view15 = homeSavingsUserV2Fragment.f27318b;
                        if (view15 != null) {
                            return (LinearLayout) view15.findViewById(Ac.e.ll_dynmic_module);
                        }
                        return null;
                    case 15:
                        HomeSavingsUserV2Fragment.a aVar16 = HomeSavingsUserV2Fragment.f35149F0;
                        View view16 = homeSavingsUserV2Fragment.f27318b;
                        if (view16 != null) {
                            return (BannerAdView) view16.findViewById(Ac.e.adMiddle);
                        }
                        return null;
                    default:
                        HomeSavingsUserV2Fragment.a aVar17 = HomeSavingsUserV2Fragment.f35149F0;
                        View view17 = homeSavingsUserV2Fragment.f27318b;
                        if (view17 != null) {
                            return (LinearLayout) view17.findViewById(Ac.e.functionIndicator);
                        }
                        return null;
                }
            }
        });
        final int i20 = 15;
        this.f35169Y = C2131j.b(new Function0(this) { // from class: Ce.W

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeSavingsUserV2Fragment f1456b;

            {
                this.f1456b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                HomeSavingsUserV2Fragment homeSavingsUserV2Fragment = this.f1456b;
                switch (i20) {
                    case 0:
                        HomeSavingsUserV2Fragment.a aVar = HomeSavingsUserV2Fragment.f35149F0;
                        View view = homeSavingsUserV2Fragment.f27318b;
                        if (view != null) {
                            return (RecyclerView) view.findViewById(Ac.e.functionList);
                        }
                        return null;
                    case 1:
                        HomeSavingsUserV2Fragment.a aVar2 = HomeSavingsUserV2Fragment.f35149F0;
                        View view2 = homeSavingsUserV2Fragment.f27318b;
                        if (view2 != null) {
                            return (MarqueeViewV2) view2.findViewById(Ac.e.topTextAd);
                        }
                        return null;
                    case 2:
                        HomeSavingsUserV2Fragment.a aVar3 = HomeSavingsUserV2Fragment.f35149F0;
                        View view3 = homeSavingsUserV2Fragment.f27318b;
                        if (view3 != null) {
                            return (VerticalSwipeRefreshLayout) view3.findViewById(Ac.e.refreshLayout);
                        }
                        return null;
                    case 3:
                        HomeSavingsUserV2Fragment.a aVar4 = HomeSavingsUserV2Fragment.f35149F0;
                        View view4 = homeSavingsUserV2Fragment.f27318b;
                        if (view4 != null) {
                            return (CashBoxIntroductionView) view4.findViewById(Ac.e.cashBoxIntroductionView);
                        }
                        return null;
                    case 4:
                        HomeSavingsUserV2Fragment.a aVar5 = HomeSavingsUserV2Fragment.f35149F0;
                        View view5 = homeSavingsUserV2Fragment.f27318b;
                        if (view5 != null) {
                            return (RecyclerView) view5.findViewById(Ac.e.rl_accountList);
                        }
                        return null;
                    case 5:
                        HomeSavingsUserV2Fragment.a aVar6 = HomeSavingsUserV2Fragment.f35149F0;
                        View view6 = homeSavingsUserV2Fragment.f27318b;
                        if (view6 != null) {
                            return (LinearLayout) view6.findViewById(Ac.e.ll_account);
                        }
                        return null;
                    case 6:
                        HomeSavingsUserV2Fragment.a aVar7 = HomeSavingsUserV2Fragment.f35149F0;
                        View view7 = homeSavingsUserV2Fragment.f27318b;
                        if (view7 != null) {
                            return (ImageView) view7.findViewById(Ac.e.imageViewNext);
                        }
                        return null;
                    case 7:
                        HomeSavingsUserV2Fragment.a aVar8 = HomeSavingsUserV2Fragment.f35149F0;
                        View view8 = homeSavingsUserV2Fragment.f27318b;
                        if (view8 != null) {
                            return (ImageView) view8.findViewById(Ac.e.ivYesterDayArrow);
                        }
                        return null;
                    case 8:
                        HomeSavingsUserV2Fragment.a aVar9 = HomeSavingsUserV2Fragment.f35149F0;
                        View view9 = homeSavingsUserV2Fragment.f27318b;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(Ac.e.tvYesterdayReturnAmount);
                        }
                        return null;
                    case 9:
                        HomeSavingsUserV2Fragment.a aVar10 = HomeSavingsUserV2Fragment.f35149F0;
                        View view10 = homeSavingsUserV2Fragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(Ac.e.tvTotalAssetsAmount);
                        }
                        return null;
                    case 10:
                        HomeSavingsUserV2Fragment.a aVar11 = HomeSavingsUserV2Fragment.f35149F0;
                        View view11 = homeSavingsUserV2Fragment.f27318b;
                        if (view11 != null) {
                            return (ImageView) view11.findViewById(Ac.e.ivToggleShowBalance);
                        }
                        return null;
                    case 11:
                        HomeSavingsUserV2Fragment.a aVar12 = HomeSavingsUserV2Fragment.f35149F0;
                        View view12 = homeSavingsUserV2Fragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(Ac.e.tvTotalAssets);
                        }
                        return null;
                    case 12:
                        HomeSavingsUserV2Fragment.a aVar13 = HomeSavingsUserV2Fragment.f35149F0;
                        View view13 = homeSavingsUserV2Fragment.f27318b;
                        if (view13 != null) {
                            return (ConstraintLayout) view13.findViewById(Ac.e.layoutMyFortune);
                        }
                        return null;
                    case 13:
                        HomeSavingsUserV2Fragment.a aVar14 = HomeSavingsUserV2Fragment.f35149F0;
                        View view14 = homeSavingsUserV2Fragment.f27318b;
                        if (view14 != null) {
                            return (ImageView) view14.findViewById(Ac.e.imageViewUp);
                        }
                        return null;
                    case 14:
                        HomeSavingsUserV2Fragment.a aVar15 = HomeSavingsUserV2Fragment.f35149F0;
                        View view15 = homeSavingsUserV2Fragment.f27318b;
                        if (view15 != null) {
                            return (LinearLayout) view15.findViewById(Ac.e.ll_dynmic_module);
                        }
                        return null;
                    case 15:
                        HomeSavingsUserV2Fragment.a aVar16 = HomeSavingsUserV2Fragment.f35149F0;
                        View view16 = homeSavingsUserV2Fragment.f27318b;
                        if (view16 != null) {
                            return (BannerAdView) view16.findViewById(Ac.e.adMiddle);
                        }
                        return null;
                    default:
                        HomeSavingsUserV2Fragment.a aVar17 = HomeSavingsUserV2Fragment.f35149F0;
                        View view17 = homeSavingsUserV2Fragment.f27318b;
                        if (view17 != null) {
                            return (LinearLayout) view17.findViewById(Ac.e.functionIndicator);
                        }
                        return null;
                }
            }
        });
        final int i21 = 16;
        this.f35170Z = C2131j.b(new Function0(this) { // from class: Ce.W

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeSavingsUserV2Fragment f1456b;

            {
                this.f1456b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                HomeSavingsUserV2Fragment homeSavingsUserV2Fragment = this.f1456b;
                switch (i21) {
                    case 0:
                        HomeSavingsUserV2Fragment.a aVar = HomeSavingsUserV2Fragment.f35149F0;
                        View view = homeSavingsUserV2Fragment.f27318b;
                        if (view != null) {
                            return (RecyclerView) view.findViewById(Ac.e.functionList);
                        }
                        return null;
                    case 1:
                        HomeSavingsUserV2Fragment.a aVar2 = HomeSavingsUserV2Fragment.f35149F0;
                        View view2 = homeSavingsUserV2Fragment.f27318b;
                        if (view2 != null) {
                            return (MarqueeViewV2) view2.findViewById(Ac.e.topTextAd);
                        }
                        return null;
                    case 2:
                        HomeSavingsUserV2Fragment.a aVar3 = HomeSavingsUserV2Fragment.f35149F0;
                        View view3 = homeSavingsUserV2Fragment.f27318b;
                        if (view3 != null) {
                            return (VerticalSwipeRefreshLayout) view3.findViewById(Ac.e.refreshLayout);
                        }
                        return null;
                    case 3:
                        HomeSavingsUserV2Fragment.a aVar4 = HomeSavingsUserV2Fragment.f35149F0;
                        View view4 = homeSavingsUserV2Fragment.f27318b;
                        if (view4 != null) {
                            return (CashBoxIntroductionView) view4.findViewById(Ac.e.cashBoxIntroductionView);
                        }
                        return null;
                    case 4:
                        HomeSavingsUserV2Fragment.a aVar5 = HomeSavingsUserV2Fragment.f35149F0;
                        View view5 = homeSavingsUserV2Fragment.f27318b;
                        if (view5 != null) {
                            return (RecyclerView) view5.findViewById(Ac.e.rl_accountList);
                        }
                        return null;
                    case 5:
                        HomeSavingsUserV2Fragment.a aVar6 = HomeSavingsUserV2Fragment.f35149F0;
                        View view6 = homeSavingsUserV2Fragment.f27318b;
                        if (view6 != null) {
                            return (LinearLayout) view6.findViewById(Ac.e.ll_account);
                        }
                        return null;
                    case 6:
                        HomeSavingsUserV2Fragment.a aVar7 = HomeSavingsUserV2Fragment.f35149F0;
                        View view7 = homeSavingsUserV2Fragment.f27318b;
                        if (view7 != null) {
                            return (ImageView) view7.findViewById(Ac.e.imageViewNext);
                        }
                        return null;
                    case 7:
                        HomeSavingsUserV2Fragment.a aVar8 = HomeSavingsUserV2Fragment.f35149F0;
                        View view8 = homeSavingsUserV2Fragment.f27318b;
                        if (view8 != null) {
                            return (ImageView) view8.findViewById(Ac.e.ivYesterDayArrow);
                        }
                        return null;
                    case 8:
                        HomeSavingsUserV2Fragment.a aVar9 = HomeSavingsUserV2Fragment.f35149F0;
                        View view9 = homeSavingsUserV2Fragment.f27318b;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(Ac.e.tvYesterdayReturnAmount);
                        }
                        return null;
                    case 9:
                        HomeSavingsUserV2Fragment.a aVar10 = HomeSavingsUserV2Fragment.f35149F0;
                        View view10 = homeSavingsUserV2Fragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(Ac.e.tvTotalAssetsAmount);
                        }
                        return null;
                    case 10:
                        HomeSavingsUserV2Fragment.a aVar11 = HomeSavingsUserV2Fragment.f35149F0;
                        View view11 = homeSavingsUserV2Fragment.f27318b;
                        if (view11 != null) {
                            return (ImageView) view11.findViewById(Ac.e.ivToggleShowBalance);
                        }
                        return null;
                    case 11:
                        HomeSavingsUserV2Fragment.a aVar12 = HomeSavingsUserV2Fragment.f35149F0;
                        View view12 = homeSavingsUserV2Fragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(Ac.e.tvTotalAssets);
                        }
                        return null;
                    case 12:
                        HomeSavingsUserV2Fragment.a aVar13 = HomeSavingsUserV2Fragment.f35149F0;
                        View view13 = homeSavingsUserV2Fragment.f27318b;
                        if (view13 != null) {
                            return (ConstraintLayout) view13.findViewById(Ac.e.layoutMyFortune);
                        }
                        return null;
                    case 13:
                        HomeSavingsUserV2Fragment.a aVar14 = HomeSavingsUserV2Fragment.f35149F0;
                        View view14 = homeSavingsUserV2Fragment.f27318b;
                        if (view14 != null) {
                            return (ImageView) view14.findViewById(Ac.e.imageViewUp);
                        }
                        return null;
                    case 14:
                        HomeSavingsUserV2Fragment.a aVar15 = HomeSavingsUserV2Fragment.f35149F0;
                        View view15 = homeSavingsUserV2Fragment.f27318b;
                        if (view15 != null) {
                            return (LinearLayout) view15.findViewById(Ac.e.ll_dynmic_module);
                        }
                        return null;
                    case 15:
                        HomeSavingsUserV2Fragment.a aVar16 = HomeSavingsUserV2Fragment.f35149F0;
                        View view16 = homeSavingsUserV2Fragment.f27318b;
                        if (view16 != null) {
                            return (BannerAdView) view16.findViewById(Ac.e.adMiddle);
                        }
                        return null;
                    default:
                        HomeSavingsUserV2Fragment.a aVar17 = HomeSavingsUserV2Fragment.f35149F0;
                        View view17 = homeSavingsUserV2Fragment.f27318b;
                        if (view17 != null) {
                            return (LinearLayout) view17.findViewById(Ac.e.functionIndicator);
                        }
                        return null;
                }
            }
        });
        final int i22 = 0;
        this.f35171k0 = C2131j.b(new Function0(this) { // from class: Ce.W

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeSavingsUserV2Fragment f1456b;

            {
                this.f1456b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                HomeSavingsUserV2Fragment homeSavingsUserV2Fragment = this.f1456b;
                switch (i22) {
                    case 0:
                        HomeSavingsUserV2Fragment.a aVar = HomeSavingsUserV2Fragment.f35149F0;
                        View view = homeSavingsUserV2Fragment.f27318b;
                        if (view != null) {
                            return (RecyclerView) view.findViewById(Ac.e.functionList);
                        }
                        return null;
                    case 1:
                        HomeSavingsUserV2Fragment.a aVar2 = HomeSavingsUserV2Fragment.f35149F0;
                        View view2 = homeSavingsUserV2Fragment.f27318b;
                        if (view2 != null) {
                            return (MarqueeViewV2) view2.findViewById(Ac.e.topTextAd);
                        }
                        return null;
                    case 2:
                        HomeSavingsUserV2Fragment.a aVar3 = HomeSavingsUserV2Fragment.f35149F0;
                        View view3 = homeSavingsUserV2Fragment.f27318b;
                        if (view3 != null) {
                            return (VerticalSwipeRefreshLayout) view3.findViewById(Ac.e.refreshLayout);
                        }
                        return null;
                    case 3:
                        HomeSavingsUserV2Fragment.a aVar4 = HomeSavingsUserV2Fragment.f35149F0;
                        View view4 = homeSavingsUserV2Fragment.f27318b;
                        if (view4 != null) {
                            return (CashBoxIntroductionView) view4.findViewById(Ac.e.cashBoxIntroductionView);
                        }
                        return null;
                    case 4:
                        HomeSavingsUserV2Fragment.a aVar5 = HomeSavingsUserV2Fragment.f35149F0;
                        View view5 = homeSavingsUserV2Fragment.f27318b;
                        if (view5 != null) {
                            return (RecyclerView) view5.findViewById(Ac.e.rl_accountList);
                        }
                        return null;
                    case 5:
                        HomeSavingsUserV2Fragment.a aVar6 = HomeSavingsUserV2Fragment.f35149F0;
                        View view6 = homeSavingsUserV2Fragment.f27318b;
                        if (view6 != null) {
                            return (LinearLayout) view6.findViewById(Ac.e.ll_account);
                        }
                        return null;
                    case 6:
                        HomeSavingsUserV2Fragment.a aVar7 = HomeSavingsUserV2Fragment.f35149F0;
                        View view7 = homeSavingsUserV2Fragment.f27318b;
                        if (view7 != null) {
                            return (ImageView) view7.findViewById(Ac.e.imageViewNext);
                        }
                        return null;
                    case 7:
                        HomeSavingsUserV2Fragment.a aVar8 = HomeSavingsUserV2Fragment.f35149F0;
                        View view8 = homeSavingsUserV2Fragment.f27318b;
                        if (view8 != null) {
                            return (ImageView) view8.findViewById(Ac.e.ivYesterDayArrow);
                        }
                        return null;
                    case 8:
                        HomeSavingsUserV2Fragment.a aVar9 = HomeSavingsUserV2Fragment.f35149F0;
                        View view9 = homeSavingsUserV2Fragment.f27318b;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(Ac.e.tvYesterdayReturnAmount);
                        }
                        return null;
                    case 9:
                        HomeSavingsUserV2Fragment.a aVar10 = HomeSavingsUserV2Fragment.f35149F0;
                        View view10 = homeSavingsUserV2Fragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(Ac.e.tvTotalAssetsAmount);
                        }
                        return null;
                    case 10:
                        HomeSavingsUserV2Fragment.a aVar11 = HomeSavingsUserV2Fragment.f35149F0;
                        View view11 = homeSavingsUserV2Fragment.f27318b;
                        if (view11 != null) {
                            return (ImageView) view11.findViewById(Ac.e.ivToggleShowBalance);
                        }
                        return null;
                    case 11:
                        HomeSavingsUserV2Fragment.a aVar12 = HomeSavingsUserV2Fragment.f35149F0;
                        View view12 = homeSavingsUserV2Fragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(Ac.e.tvTotalAssets);
                        }
                        return null;
                    case 12:
                        HomeSavingsUserV2Fragment.a aVar13 = HomeSavingsUserV2Fragment.f35149F0;
                        View view13 = homeSavingsUserV2Fragment.f27318b;
                        if (view13 != null) {
                            return (ConstraintLayout) view13.findViewById(Ac.e.layoutMyFortune);
                        }
                        return null;
                    case 13:
                        HomeSavingsUserV2Fragment.a aVar14 = HomeSavingsUserV2Fragment.f35149F0;
                        View view14 = homeSavingsUserV2Fragment.f27318b;
                        if (view14 != null) {
                            return (ImageView) view14.findViewById(Ac.e.imageViewUp);
                        }
                        return null;
                    case 14:
                        HomeSavingsUserV2Fragment.a aVar15 = HomeSavingsUserV2Fragment.f35149F0;
                        View view15 = homeSavingsUserV2Fragment.f27318b;
                        if (view15 != null) {
                            return (LinearLayout) view15.findViewById(Ac.e.ll_dynmic_module);
                        }
                        return null;
                    case 15:
                        HomeSavingsUserV2Fragment.a aVar16 = HomeSavingsUserV2Fragment.f35149F0;
                        View view16 = homeSavingsUserV2Fragment.f27318b;
                        if (view16 != null) {
                            return (BannerAdView) view16.findViewById(Ac.e.adMiddle);
                        }
                        return null;
                    default:
                        HomeSavingsUserV2Fragment.a aVar17 = HomeSavingsUserV2Fragment.f35149F0;
                        View view17 = homeSavingsUserV2Fragment.f27318b;
                        if (view17 != null) {
                            return (LinearLayout) view17.findViewById(Ac.e.functionIndicator);
                        }
                        return null;
                }
            }
        });
        final int i23 = 1;
        this.f35172p0 = C2131j.b(new Function0(this) { // from class: Ce.W

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeSavingsUserV2Fragment f1456b;

            {
                this.f1456b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                HomeSavingsUserV2Fragment homeSavingsUserV2Fragment = this.f1456b;
                switch (i23) {
                    case 0:
                        HomeSavingsUserV2Fragment.a aVar = HomeSavingsUserV2Fragment.f35149F0;
                        View view = homeSavingsUserV2Fragment.f27318b;
                        if (view != null) {
                            return (RecyclerView) view.findViewById(Ac.e.functionList);
                        }
                        return null;
                    case 1:
                        HomeSavingsUserV2Fragment.a aVar2 = HomeSavingsUserV2Fragment.f35149F0;
                        View view2 = homeSavingsUserV2Fragment.f27318b;
                        if (view2 != null) {
                            return (MarqueeViewV2) view2.findViewById(Ac.e.topTextAd);
                        }
                        return null;
                    case 2:
                        HomeSavingsUserV2Fragment.a aVar3 = HomeSavingsUserV2Fragment.f35149F0;
                        View view3 = homeSavingsUserV2Fragment.f27318b;
                        if (view3 != null) {
                            return (VerticalSwipeRefreshLayout) view3.findViewById(Ac.e.refreshLayout);
                        }
                        return null;
                    case 3:
                        HomeSavingsUserV2Fragment.a aVar4 = HomeSavingsUserV2Fragment.f35149F0;
                        View view4 = homeSavingsUserV2Fragment.f27318b;
                        if (view4 != null) {
                            return (CashBoxIntroductionView) view4.findViewById(Ac.e.cashBoxIntroductionView);
                        }
                        return null;
                    case 4:
                        HomeSavingsUserV2Fragment.a aVar5 = HomeSavingsUserV2Fragment.f35149F0;
                        View view5 = homeSavingsUserV2Fragment.f27318b;
                        if (view5 != null) {
                            return (RecyclerView) view5.findViewById(Ac.e.rl_accountList);
                        }
                        return null;
                    case 5:
                        HomeSavingsUserV2Fragment.a aVar6 = HomeSavingsUserV2Fragment.f35149F0;
                        View view6 = homeSavingsUserV2Fragment.f27318b;
                        if (view6 != null) {
                            return (LinearLayout) view6.findViewById(Ac.e.ll_account);
                        }
                        return null;
                    case 6:
                        HomeSavingsUserV2Fragment.a aVar7 = HomeSavingsUserV2Fragment.f35149F0;
                        View view7 = homeSavingsUserV2Fragment.f27318b;
                        if (view7 != null) {
                            return (ImageView) view7.findViewById(Ac.e.imageViewNext);
                        }
                        return null;
                    case 7:
                        HomeSavingsUserV2Fragment.a aVar8 = HomeSavingsUserV2Fragment.f35149F0;
                        View view8 = homeSavingsUserV2Fragment.f27318b;
                        if (view8 != null) {
                            return (ImageView) view8.findViewById(Ac.e.ivYesterDayArrow);
                        }
                        return null;
                    case 8:
                        HomeSavingsUserV2Fragment.a aVar9 = HomeSavingsUserV2Fragment.f35149F0;
                        View view9 = homeSavingsUserV2Fragment.f27318b;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(Ac.e.tvYesterdayReturnAmount);
                        }
                        return null;
                    case 9:
                        HomeSavingsUserV2Fragment.a aVar10 = HomeSavingsUserV2Fragment.f35149F0;
                        View view10 = homeSavingsUserV2Fragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(Ac.e.tvTotalAssetsAmount);
                        }
                        return null;
                    case 10:
                        HomeSavingsUserV2Fragment.a aVar11 = HomeSavingsUserV2Fragment.f35149F0;
                        View view11 = homeSavingsUserV2Fragment.f27318b;
                        if (view11 != null) {
                            return (ImageView) view11.findViewById(Ac.e.ivToggleShowBalance);
                        }
                        return null;
                    case 11:
                        HomeSavingsUserV2Fragment.a aVar12 = HomeSavingsUserV2Fragment.f35149F0;
                        View view12 = homeSavingsUserV2Fragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(Ac.e.tvTotalAssets);
                        }
                        return null;
                    case 12:
                        HomeSavingsUserV2Fragment.a aVar13 = HomeSavingsUserV2Fragment.f35149F0;
                        View view13 = homeSavingsUserV2Fragment.f27318b;
                        if (view13 != null) {
                            return (ConstraintLayout) view13.findViewById(Ac.e.layoutMyFortune);
                        }
                        return null;
                    case 13:
                        HomeSavingsUserV2Fragment.a aVar14 = HomeSavingsUserV2Fragment.f35149F0;
                        View view14 = homeSavingsUserV2Fragment.f27318b;
                        if (view14 != null) {
                            return (ImageView) view14.findViewById(Ac.e.imageViewUp);
                        }
                        return null;
                    case 14:
                        HomeSavingsUserV2Fragment.a aVar15 = HomeSavingsUserV2Fragment.f35149F0;
                        View view15 = homeSavingsUserV2Fragment.f27318b;
                        if (view15 != null) {
                            return (LinearLayout) view15.findViewById(Ac.e.ll_dynmic_module);
                        }
                        return null;
                    case 15:
                        HomeSavingsUserV2Fragment.a aVar16 = HomeSavingsUserV2Fragment.f35149F0;
                        View view16 = homeSavingsUserV2Fragment.f27318b;
                        if (view16 != null) {
                            return (BannerAdView) view16.findViewById(Ac.e.adMiddle);
                        }
                        return null;
                    default:
                        HomeSavingsUserV2Fragment.a aVar17 = HomeSavingsUserV2Fragment.f35149F0;
                        View view17 = homeSavingsUserV2Fragment.f27318b;
                        if (view17 != null) {
                            return (LinearLayout) view17.findViewById(Ac.e.functionIndicator);
                        }
                        return null;
                }
            }
        });
        final int i24 = 2;
        this.f35173q0 = C2131j.b(new Function0(this) { // from class: Ce.W

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeSavingsUserV2Fragment f1456b;

            {
                this.f1456b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                HomeSavingsUserV2Fragment homeSavingsUserV2Fragment = this.f1456b;
                switch (i24) {
                    case 0:
                        HomeSavingsUserV2Fragment.a aVar = HomeSavingsUserV2Fragment.f35149F0;
                        View view = homeSavingsUserV2Fragment.f27318b;
                        if (view != null) {
                            return (RecyclerView) view.findViewById(Ac.e.functionList);
                        }
                        return null;
                    case 1:
                        HomeSavingsUserV2Fragment.a aVar2 = HomeSavingsUserV2Fragment.f35149F0;
                        View view2 = homeSavingsUserV2Fragment.f27318b;
                        if (view2 != null) {
                            return (MarqueeViewV2) view2.findViewById(Ac.e.topTextAd);
                        }
                        return null;
                    case 2:
                        HomeSavingsUserV2Fragment.a aVar3 = HomeSavingsUserV2Fragment.f35149F0;
                        View view3 = homeSavingsUserV2Fragment.f27318b;
                        if (view3 != null) {
                            return (VerticalSwipeRefreshLayout) view3.findViewById(Ac.e.refreshLayout);
                        }
                        return null;
                    case 3:
                        HomeSavingsUserV2Fragment.a aVar4 = HomeSavingsUserV2Fragment.f35149F0;
                        View view4 = homeSavingsUserV2Fragment.f27318b;
                        if (view4 != null) {
                            return (CashBoxIntroductionView) view4.findViewById(Ac.e.cashBoxIntroductionView);
                        }
                        return null;
                    case 4:
                        HomeSavingsUserV2Fragment.a aVar5 = HomeSavingsUserV2Fragment.f35149F0;
                        View view5 = homeSavingsUserV2Fragment.f27318b;
                        if (view5 != null) {
                            return (RecyclerView) view5.findViewById(Ac.e.rl_accountList);
                        }
                        return null;
                    case 5:
                        HomeSavingsUserV2Fragment.a aVar6 = HomeSavingsUserV2Fragment.f35149F0;
                        View view6 = homeSavingsUserV2Fragment.f27318b;
                        if (view6 != null) {
                            return (LinearLayout) view6.findViewById(Ac.e.ll_account);
                        }
                        return null;
                    case 6:
                        HomeSavingsUserV2Fragment.a aVar7 = HomeSavingsUserV2Fragment.f35149F0;
                        View view7 = homeSavingsUserV2Fragment.f27318b;
                        if (view7 != null) {
                            return (ImageView) view7.findViewById(Ac.e.imageViewNext);
                        }
                        return null;
                    case 7:
                        HomeSavingsUserV2Fragment.a aVar8 = HomeSavingsUserV2Fragment.f35149F0;
                        View view8 = homeSavingsUserV2Fragment.f27318b;
                        if (view8 != null) {
                            return (ImageView) view8.findViewById(Ac.e.ivYesterDayArrow);
                        }
                        return null;
                    case 8:
                        HomeSavingsUserV2Fragment.a aVar9 = HomeSavingsUserV2Fragment.f35149F0;
                        View view9 = homeSavingsUserV2Fragment.f27318b;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(Ac.e.tvYesterdayReturnAmount);
                        }
                        return null;
                    case 9:
                        HomeSavingsUserV2Fragment.a aVar10 = HomeSavingsUserV2Fragment.f35149F0;
                        View view10 = homeSavingsUserV2Fragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(Ac.e.tvTotalAssetsAmount);
                        }
                        return null;
                    case 10:
                        HomeSavingsUserV2Fragment.a aVar11 = HomeSavingsUserV2Fragment.f35149F0;
                        View view11 = homeSavingsUserV2Fragment.f27318b;
                        if (view11 != null) {
                            return (ImageView) view11.findViewById(Ac.e.ivToggleShowBalance);
                        }
                        return null;
                    case 11:
                        HomeSavingsUserV2Fragment.a aVar12 = HomeSavingsUserV2Fragment.f35149F0;
                        View view12 = homeSavingsUserV2Fragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(Ac.e.tvTotalAssets);
                        }
                        return null;
                    case 12:
                        HomeSavingsUserV2Fragment.a aVar13 = HomeSavingsUserV2Fragment.f35149F0;
                        View view13 = homeSavingsUserV2Fragment.f27318b;
                        if (view13 != null) {
                            return (ConstraintLayout) view13.findViewById(Ac.e.layoutMyFortune);
                        }
                        return null;
                    case 13:
                        HomeSavingsUserV2Fragment.a aVar14 = HomeSavingsUserV2Fragment.f35149F0;
                        View view14 = homeSavingsUserV2Fragment.f27318b;
                        if (view14 != null) {
                            return (ImageView) view14.findViewById(Ac.e.imageViewUp);
                        }
                        return null;
                    case 14:
                        HomeSavingsUserV2Fragment.a aVar15 = HomeSavingsUserV2Fragment.f35149F0;
                        View view15 = homeSavingsUserV2Fragment.f27318b;
                        if (view15 != null) {
                            return (LinearLayout) view15.findViewById(Ac.e.ll_dynmic_module);
                        }
                        return null;
                    case 15:
                        HomeSavingsUserV2Fragment.a aVar16 = HomeSavingsUserV2Fragment.f35149F0;
                        View view16 = homeSavingsUserV2Fragment.f27318b;
                        if (view16 != null) {
                            return (BannerAdView) view16.findViewById(Ac.e.adMiddle);
                        }
                        return null;
                    default:
                        HomeSavingsUserV2Fragment.a aVar17 = HomeSavingsUserV2Fragment.f35149F0;
                        View view17 = homeSavingsUserV2Fragment.f27318b;
                        if (view17 != null) {
                            return (LinearLayout) view17.findViewById(Ac.e.functionIndicator);
                        }
                        return null;
                }
            }
        });
        final int i25 = 3;
        this.f35174r0 = C2131j.b(new Function0(this) { // from class: Ce.W

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeSavingsUserV2Fragment f1456b;

            {
                this.f1456b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                HomeSavingsUserV2Fragment homeSavingsUserV2Fragment = this.f1456b;
                switch (i25) {
                    case 0:
                        HomeSavingsUserV2Fragment.a aVar = HomeSavingsUserV2Fragment.f35149F0;
                        View view = homeSavingsUserV2Fragment.f27318b;
                        if (view != null) {
                            return (RecyclerView) view.findViewById(Ac.e.functionList);
                        }
                        return null;
                    case 1:
                        HomeSavingsUserV2Fragment.a aVar2 = HomeSavingsUserV2Fragment.f35149F0;
                        View view2 = homeSavingsUserV2Fragment.f27318b;
                        if (view2 != null) {
                            return (MarqueeViewV2) view2.findViewById(Ac.e.topTextAd);
                        }
                        return null;
                    case 2:
                        HomeSavingsUserV2Fragment.a aVar3 = HomeSavingsUserV2Fragment.f35149F0;
                        View view3 = homeSavingsUserV2Fragment.f27318b;
                        if (view3 != null) {
                            return (VerticalSwipeRefreshLayout) view3.findViewById(Ac.e.refreshLayout);
                        }
                        return null;
                    case 3:
                        HomeSavingsUserV2Fragment.a aVar4 = HomeSavingsUserV2Fragment.f35149F0;
                        View view4 = homeSavingsUserV2Fragment.f27318b;
                        if (view4 != null) {
                            return (CashBoxIntroductionView) view4.findViewById(Ac.e.cashBoxIntroductionView);
                        }
                        return null;
                    case 4:
                        HomeSavingsUserV2Fragment.a aVar5 = HomeSavingsUserV2Fragment.f35149F0;
                        View view5 = homeSavingsUserV2Fragment.f27318b;
                        if (view5 != null) {
                            return (RecyclerView) view5.findViewById(Ac.e.rl_accountList);
                        }
                        return null;
                    case 5:
                        HomeSavingsUserV2Fragment.a aVar6 = HomeSavingsUserV2Fragment.f35149F0;
                        View view6 = homeSavingsUserV2Fragment.f27318b;
                        if (view6 != null) {
                            return (LinearLayout) view6.findViewById(Ac.e.ll_account);
                        }
                        return null;
                    case 6:
                        HomeSavingsUserV2Fragment.a aVar7 = HomeSavingsUserV2Fragment.f35149F0;
                        View view7 = homeSavingsUserV2Fragment.f27318b;
                        if (view7 != null) {
                            return (ImageView) view7.findViewById(Ac.e.imageViewNext);
                        }
                        return null;
                    case 7:
                        HomeSavingsUserV2Fragment.a aVar8 = HomeSavingsUserV2Fragment.f35149F0;
                        View view8 = homeSavingsUserV2Fragment.f27318b;
                        if (view8 != null) {
                            return (ImageView) view8.findViewById(Ac.e.ivYesterDayArrow);
                        }
                        return null;
                    case 8:
                        HomeSavingsUserV2Fragment.a aVar9 = HomeSavingsUserV2Fragment.f35149F0;
                        View view9 = homeSavingsUserV2Fragment.f27318b;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(Ac.e.tvYesterdayReturnAmount);
                        }
                        return null;
                    case 9:
                        HomeSavingsUserV2Fragment.a aVar10 = HomeSavingsUserV2Fragment.f35149F0;
                        View view10 = homeSavingsUserV2Fragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(Ac.e.tvTotalAssetsAmount);
                        }
                        return null;
                    case 10:
                        HomeSavingsUserV2Fragment.a aVar11 = HomeSavingsUserV2Fragment.f35149F0;
                        View view11 = homeSavingsUserV2Fragment.f27318b;
                        if (view11 != null) {
                            return (ImageView) view11.findViewById(Ac.e.ivToggleShowBalance);
                        }
                        return null;
                    case 11:
                        HomeSavingsUserV2Fragment.a aVar12 = HomeSavingsUserV2Fragment.f35149F0;
                        View view12 = homeSavingsUserV2Fragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(Ac.e.tvTotalAssets);
                        }
                        return null;
                    case 12:
                        HomeSavingsUserV2Fragment.a aVar13 = HomeSavingsUserV2Fragment.f35149F0;
                        View view13 = homeSavingsUserV2Fragment.f27318b;
                        if (view13 != null) {
                            return (ConstraintLayout) view13.findViewById(Ac.e.layoutMyFortune);
                        }
                        return null;
                    case 13:
                        HomeSavingsUserV2Fragment.a aVar14 = HomeSavingsUserV2Fragment.f35149F0;
                        View view14 = homeSavingsUserV2Fragment.f27318b;
                        if (view14 != null) {
                            return (ImageView) view14.findViewById(Ac.e.imageViewUp);
                        }
                        return null;
                    case 14:
                        HomeSavingsUserV2Fragment.a aVar15 = HomeSavingsUserV2Fragment.f35149F0;
                        View view15 = homeSavingsUserV2Fragment.f27318b;
                        if (view15 != null) {
                            return (LinearLayout) view15.findViewById(Ac.e.ll_dynmic_module);
                        }
                        return null;
                    case 15:
                        HomeSavingsUserV2Fragment.a aVar16 = HomeSavingsUserV2Fragment.f35149F0;
                        View view16 = homeSavingsUserV2Fragment.f27318b;
                        if (view16 != null) {
                            return (BannerAdView) view16.findViewById(Ac.e.adMiddle);
                        }
                        return null;
                    default:
                        HomeSavingsUserV2Fragment.a aVar17 = HomeSavingsUserV2Fragment.f35149F0;
                        View view17 = homeSavingsUserV2Fragment.f27318b;
                        if (view17 != null) {
                            return (LinearLayout) view17.findViewById(Ac.e.functionIndicator);
                        }
                        return null;
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return f.main_home_savings_v2_fragment;
    }

    @Override // com.transsnet.palmpay.core.base.BaseLazyMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        ImageView backImageView;
        c.b().j(this);
        n0.g().v("FinanceTab_View");
        PpTitleBar ppTitleBar = (PpTitleBar) this.f27318b.findViewById(Ac.e.titleBar);
        if (ppTitleBar != null) {
            ppTitleBar.setTitle(getString(k.core_wealth));
        }
        if (ppTitleBar != null && (backImageView = ppTitleBar.getBackImageView()) != null) {
            p220oa.h.s(backImageView, false);
        }
        if (ppTitleBar != null) {
            ppTitleBar.setRightImageView1Icon(S6.a.pay_Menu);
        }
        if (ppTitleBar != null) {
            ppTitleBar.setRightImageView1ClickListener(new X(this, 1));
        }
        t tVar = this.f35178v;
        RecyclerView recyclerView = (RecyclerView) tVar.getValue();
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        }
        b bVar = new b();
        bVar.f44691a = true;
        this.f35177u0 = bVar;
        RecyclerView recyclerView2 = (RecyclerView) tVar.getValue();
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.f35177u0);
        }
        h hVar = new h(getContext());
        this.f35176t0 = hVar;
        hVar.f44697e = true;
        hVar.f4985b = (ArrayList) this.f35163E0.getValue();
        PagerGridLayoutManager pagerGridLayoutManager = new PagerGridLayoutManager(2, 4);
        pagerGridLayoutManager.f25200Q = false;
        t tVar2 = this.f35171k0;
        RecyclerView recyclerView3 = (RecyclerView) tVar2.getValue();
        if (recyclerView3 != null) {
            recyclerView3.setLayoutManager(pagerGridLayoutManager);
        }
        pagerGridLayoutManager.f25197H = new Y(this);
        RecyclerView recyclerView4 = (RecyclerView) tVar2.getValue();
        if (recyclerView4 != null) {
            recyclerView4.setAdapter(this.f35176t0);
        }
        RecyclerView recyclerView5 = (RecyclerView) tVar2.getValue();
        if (recyclerView5 != null) {
            recyclerView5.setHasFixedSize(true);
        }
        RecyclerView recyclerView6 = (RecyclerView) tVar2.getValue();
        if (recyclerView6 != null) {
            recyclerView6.addItemDecoration(new Z());
        }
        h hVar2 = this.f35176t0;
        if (hVar2 != null) {
            hVar2.f4986c = new V(this);
        }
        VerticalSwipeRefreshLayout verticalSwipeRefreshLayoutX = x();
        if (verticalSwipeRefreshLayoutX != null) {
            verticalSwipeRefreshLayoutX.setOnRefreshListener(new V(this));
        }
        ImageView imageView = (ImageView) this.f35156A.getValue();
        if (imageView != null) {
            imageView.setOnClickListener(this);
        }
        ImageView imageView2 = (ImageView) this.t.getValue();
        if (imageView2 != null) {
            imageView2.setOnClickListener(this);
        }
        TextView textView = (TextView) this.f35166M.getValue();
        if (textView != null) {
            textView.setOnClickListener(this);
        }
        t tVar3 = this.f35164H;
        TextView textView2 = (TextView) tVar3.getValue();
        if (textView2 != null) {
            textView2.setOnClickListener(this);
        }
        ImageView imageView3 = (ImageView) this.f35165L.getValue();
        if (imageView3 != null) {
            imageView3.setOnClickListener(this);
        }
        TextView textViewY = y();
        if (textViewY != null) {
            textViewY.setOnClickListener(this);
        }
        ImageView imageView4 = (ImageView) this.f35158B.getValue();
        if (imageView4 != null) {
            imageView4.setOnClickListener(this);
        }
        r0.R1((TextView) tVar3.getValue(), "fonts/PalmPayNum-Bold.ttf");
        r0.R1(y(), "fonts/PalmPayNum-Bold.ttf");
        HomeActivity homeActivity = (HomeActivity) getActivity();
        if (i0.W(homeActivity)) {
            String string = getString(Ac.h.main_ad_home_invest_pop_slot_id);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            new InterstitialAdView(string, 0, new Ab.k(9), new org.sufficientlysecure.htmltextview.h(9)).show(homeActivity, false, new C0174p(homeActivity, 2));
        }
        MarqueeViewV2 marqueeViewV2 = (MarqueeViewV2) this.f35172p0.getValue();
        if (marqueeViewV2 != null) {
            marqueeViewV2.setAdListener(new C0158z(this, 5));
        }
        BannerAdView bannerAdView = (BannerAdView) this.f35169Y.getValue();
        if (bannerAdView != null) {
            org.chromium.support_lib_boundary.util.b.c(bannerAdView);
        }
        l lVar = ((HomeSavingsViewModel) this.f27327p).f35365e;
        if (lVar != null) {
            lVar.e(this, new C0144k(new a0(this, 0), 9));
        }
        l lVar2 = ((HomeSavingsViewModel) this.f27327p).f35366f;
        if (lVar2 != null) {
            lVar2.e(this, new C0144k(new a0(this, 1), 9));
        }
        l lVar3 = ((HomeSavingsViewModel) this.f27327p).f35367g;
        if (lVar3 != null) {
            lVar3.e(this, new C0144k(new a0(this, 2), 9));
        }
        l lVar4 = ((HomeSavingsViewModel) this.f27327p).f35372v;
        if (lVar4 != null) {
            lVar4.e(this, new C0144k(new a0(this, 3), 9));
        }
        l lVar5 = ((HomeSavingsViewModel) this.f27327p).f35368i;
        if (lVar5 != null) {
            lVar5.e(this, new C0144k(new a0(this, 4), 9));
        }
        l lVar6 = ((HomeSavingsViewModel) this.f27327p).f35369j;
        if (lVar6 != null) {
            lVar6.e(this, new C0144k(new a0(this, 5), 9));
        }
        l lVar7 = ((HomeSavingsViewModel) this.f27327p).f35370o;
        if (lVar7 != null) {
            lVar7.e(this, new C0144k(new a0(this, 6), 9));
        }
        l lVar8 = ((HomeSavingsViewModel) this.f27327p).f35373w;
        if (lVar8 != null) {
            lVar8.e(this, new C0144k(new a0(this, 7), 9));
        }
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseLazyMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        HomeSavingsViewModel homeSavingsViewModel = (HomeSavingsViewModel) this.f27327p;
        if (homeSavingsViewModel != null) {
            p140j8.f.s(homeSavingsViewModel, new C0551x(1, null), homeSavingsViewModel.f35370o, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        int i7 = Ac.e.imageViewNext;
        t tVar = this.f35167Q;
        t tVar2 = this.f35156A;
        t tVar3 = this.f35180w;
        if (numValueOf != null && numValueOf.intValue() == i7) {
            n0.g().l("FinanceTab_Breakdown_Click");
            LinearLayout linearLayout = (LinearLayout) tVar3.getValue();
            if (linearLayout != null) {
                LinearLayout linearLayout2 = (LinearLayout) tVar3.getValue();
                linearLayout.setVisibility((linearLayout2 == null || linearLayout2.getVisibility() != 8) ? 8 : 0);
            }
            ImageView imageView = (ImageView) tVar2.getValue();
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) tVar.getValue();
            if (constraintLayout != null) {
                constraintLayout.setBackgroundResource(Ac.d.main_rect_bg_7b43fa_corner_tl_tr_12);
                return;
            }
            return;
        }
        int i10 = Ac.e.imageViewUp;
        if (numValueOf != null && numValueOf.intValue() == i10) {
            ConstraintLayout constraintLayout2 = (ConstraintLayout) tVar.getValue();
            if (constraintLayout2 != null) {
                constraintLayout2.setBackgroundResource(Ac.d.main_rect_bg_7b43fa_corner_12);
            }
            ImageView imageView2 = (ImageView) tVar2.getValue();
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
            LinearLayout linearLayout3 = (LinearLayout) tVar3.getValue();
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(8);
                return;
            }
            return;
        }
        int i11 = Ac.e.tvTotalAssets;
        if (numValueOf != null && numValueOf.intValue() == i11) {
            com.palmpay.lib.apm.launchcounter.util.d.F("/main/my_assets_page");
            n0.g().l("FinanceTab_Asset_Click");
            return;
        }
        int i12 = Ac.e.tvTotalAssetsAmount;
        if (numValueOf != null && numValueOf.intValue() == i12) {
            com.palmpay.lib.apm.launchcounter.util.d.F("/main/my_assets_page");
            n0.g().l("FinanceTab_Asset_Click");
            return;
        }
        int i13 = Ac.e.ivToggleShowBalance;
        if (numValueOf != null && numValueOf.intValue() == i13) {
            n0.g().l("FinanceTab_Asset_Eye_Click");
            ImageView imageView3 = (ImageView) this.f35165L.getValue();
            LevelListDrawable levelListDrawable = (LevelListDrawable) (imageView3 != null ? imageView3.getDrawable() : null);
            if (levelListDrawable != null) {
                levelListDrawable.setLevel(levelListDrawable.getLevel() == 0 ? 1 : 0);
                p059e1.a.X("main_sp_show_balance", levelListDrawable.getLevel() == 0);
                z(this.f35175s0);
                return;
            }
            return;
        }
        int i14 = Ac.e.ivYesterDayArrow;
        if (numValueOf == null || numValueOf.intValue() != i14) {
            int i15 = Ac.e.tvYesterdayReturnAmount;
            if (numValueOf == null || numValueOf.intValue() != i15) {
                return;
            }
        }
        n0.g().l("FinanceTab_Earnings_Click");
        com.palmpay.lib.apm.launchcounter.util.d.x(null, "FinanceEarnings");
    }

    @Override // com.transsnet.palmpay.core.base.BaseLazyMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        MarqueeViewV2 marqueeViewV2 = (MarqueeViewV2) this.f35172p0.getValue();
        if (marqueeViewV2 != null) {
            marqueeViewV2.release();
        }
        super.onDestroyView();
        c.b().l(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@NotNull MessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int eventType = event.getEventType();
        if (eventType == 392 || eventType == 407) {
            n();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseLazyMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ((HomeSavingsViewModel) this.f27327p).d();
        HomeSavingsViewModel homeSavingsViewModel = (HomeSavingsViewModel) this.f27327p;
        homeSavingsViewModel.getClass();
        p140j8.f.s(homeSavingsViewModel, new C0552y(1, null), homeSavingsViewModel.f35368i, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        if (NQEManager.INSTANCE.isNetworkOffline()) {
            if (this.f35162D0 == null) {
                this.f27318b.findViewById(Ac.e.viewNotNetworkStub).setVisibility(0);
                NetworkNotConnectView networkNotConnectView = (NetworkNotConnectView) this.f27318b.findViewById(Ac.e.viewNotNetwork);
                this.f35162D0 = networkNotConnectView;
                if (networkNotConnectView != null) {
                    networkNotConnectView.setTitle(CommonViewExtKt.string(k.core_wealth, getContext()));
                }
                NetworkNotConnectView networkNotConnectView2 = this.f35162D0;
                if (networkNotConnectView2 != null) {
                    networkNotConnectView2.setTopMessage("Maximize your earnings with our top investment products.");
                }
                NetworkNotConnectView networkNotConnectView3 = this.f35162D0;
                if (networkNotConnectView3 != null) {
                    networkNotConnectView3.setRefreshListener(new C0142i(this, 3));
                }
            }
            NetworkNotConnectView networkNotConnectView4 = this.f35162D0;
            if (networkNotConnectView4 != null) {
                networkNotConnectView4.setVisibility(0);
            }
            n0.g().v("open_the_app_without_internet_first");
        }
        CashBoxIntroductionView cashBoxIntroductionView = (CashBoxIntroductionView) this.f35174r0.getValue();
        if (cashBoxIntroductionView != null) {
            Group group = cashBoxIntroductionView.f30947d;
            if (group != null) {
                group.setVisibility(0);
            }
            cashBoxIntroductionView.setFundLicenseText(SPUtils.getInstance().getString("cash_box_fund_license"));
        }
    }

    public final LinearLayout w() {
        return (LinearLayout) this.f35168X.getValue();
    }

    public final VerticalSwipeRefreshLayout x() {
        return (VerticalSwipeRefreshLayout) this.f35173q0.getValue();
    }

    public final TextView y() {
        return (TextView) this.f35160C.getValue();
    }

    public final void z(FinanceSavingsV1HomeResp financeSavingsV1HomeResp) {
        boolean zC = p059e1.a.C("main_sp_show_balance", false);
        ImageView imageView = (ImageView) this.f35165L.getValue();
        LevelListDrawable levelListDrawable = (LevelListDrawable) (imageView != null ? imageView.getDrawable() : null);
        if (levelListDrawable != null) {
            levelListDrawable.setLevel(!zC ? 1 : 0);
        }
        t tVar = this.f35164H;
        if (zC) {
            TextView textView = (TextView) tVar.getValue();
            if (textView != null) {
                textView.setText(r0.B(financeSavingsV1HomeResp != null ? financeSavingsV1HomeResp.totalAsserts : 0L, true));
            }
            TextView textViewY = y();
            if (textViewY != null) {
                textViewY.setText(financeSavingsV1HomeResp != null ? financeSavingsV1HomeResp.totalYesterdayEarnings : null);
            }
        } else {
            TextView textView2 = (TextView) tVar.getValue();
            if (textView2 != null) {
                textView2.setText("****");
            }
            TextView textViewY2 = y();
            if (textViewY2 != null) {
                textViewY2.setText("****");
            }
        }
        b bVar = this.f35177u0;
        if (bVar != null) {
            bVar.f44691a = zC;
        }
        if (bVar != null) {
            bVar.notifyDataSetChanged();
        }
    }
}

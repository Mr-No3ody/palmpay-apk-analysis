package com.transsnet.palmpay.ui.fragment;

import Ac.f;
import C9.C0142i;
import C9.C0144k;
import Ce.c0;
import Ce.d0;
import Ce.e0;
import Ie.d;
import Ie.e;
import Ie.o;
import Ie.u;
import Ie.x;
import Pa.n0;
import Pe.C0553z;
import Pe.r;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.palmpay.lib.apm.network.NQEManager;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.shencoder.pagergridlayoutmanager.PagerGridLayoutManager;
import com.transsnet.palmpay.common.export.view.NetworkNotConnectView;
import com.transsnet.palmpay.core.base.BaseLazyMvvmFragment;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.custom_view.CashBoxIntroductionView;
import com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.ui.fragment.InvestGuideFragment;
import com.transsnet.palmpay.viewmodule.HomeSavingsViewModel;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p025ba.k;
import p355xf.C2131j;
import p355xf.t;
import p385ze.h;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/ui/fragment/InvestGuideFragment;", "Lcom/transsnet/palmpay/core/base/BaseLazyMvvmFragment;", "Lcom/transsnet/palmpay/viewmodule/HomeSavingsViewModel;", "<init>", "()V", "a", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInvestGuideFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvestGuideFragment.kt\ncom/transsnet/palmpay/ui/fragment/InvestGuideFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,475:1\n115#2,8:476\n145#2:484\n115#2,8:485\n145#2:493\n115#2,8:494\n145#2:502\n115#2,8:503\n145#2:511\n115#2,8:512\n145#2:520\n115#2,8:521\n145#2:529\n1#3:530\n1573#4:531\n1604#4,4:532\n1878#4,3:536\n*S KotlinDebug\n*F\n+ 1 InvestGuideFragment.kt\ncom/transsnet/palmpay/ui/fragment/InvestGuideFragment\n*L\n184#1:476,8\n184#1:484\n191#1:485,8\n191#1:493\n198#1:494,8\n198#1:502\n205#1:503,8\n205#1:511\n212#1:512,8\n212#1:520\n218#1:521,8\n218#1:529\n314#1:531\n314#1:532,4\n362#1:536,3\n*E\n"})
public final class InvestGuideFragment extends BaseLazyMvvmFragment<HomeSavingsViewModel> {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final a f35185t0 = new a(null);

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final String f35186u0 = "CashBox";

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final String f35187v0 = "FIXED";

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final String f35188w0 = "Insurance";

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final String f35189x0 = "Fund";

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final String f35190y0 = "Target Savings";

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final String f35191z0 = "Spend & Save";

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f35192A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final t f35193B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final t f35194C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public h f35195H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public ArrayList f35196L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public o f35197M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public d f35198Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public u f35199X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Ie.a f35200Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public Ie.t f35201Z;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public x f35202k0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Ie.a f35203p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public e f35204q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public NetworkNotConnectView f35205r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final t f35206s0 = C2131j.b(new Aa.a(17));
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f35207v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f35208w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getPRODUCT_CASHBOX_MODULE() {
            return InvestGuideFragment.f35186u0;
        }

        @NotNull
        public final String getPRODUCT_FIXED_SAVINGS_MODULE() {
            return InvestGuideFragment.f35187v0;
        }

        @NotNull
        public final String getPRODUCT_FUND_MODULE() {
            return InvestGuideFragment.f35189x0;
        }

        @NotNull
        public final String getPRODUCT_INSURANCE_MODULE() {
            return InvestGuideFragment.f35188w0;
        }

        @NotNull
        public final String getPRODUCT_SPEND_SAVE_MODULE() {
            return InvestGuideFragment.f35191z0;
        }

        @NotNull
        public final String getPRODUCT_TARGET_MODULE() {
            return InvestGuideFragment.f35190y0;
        }

        @NotNull
        public final InvestGuideFragment newInstance() {
            return new InvestGuideFragment();
        }

        private a() {
        }
    }

    public InvestGuideFragment() {
        final int i7 = 0;
        this.t = C2131j.b(new Function0(this) { // from class: Ce.b0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestGuideFragment f1467b;

            {
                this.f1467b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InvestGuideFragment investGuideFragment = this.f1467b;
                switch (i7) {
                    case 0:
                        InvestGuideFragment.a aVar = InvestGuideFragment.f35185t0;
                        View view = investGuideFragment.f27318b;
                        if (view != null) {
                            return (LinearLayout) view.findViewById(Ac.e.ll_dynmic_module);
                        }
                        return null;
                    case 1:
                        InvestGuideFragment.a aVar2 = InvestGuideFragment.f35185t0;
                        View view2 = investGuideFragment.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(Ac.e.functionIndicator);
                        }
                        return null;
                    case 2:
                        InvestGuideFragment.a aVar3 = InvestGuideFragment.f35185t0;
                        View view3 = investGuideFragment.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(Ac.e.functionList);
                        }
                        return null;
                    case 3:
                        InvestGuideFragment.a aVar4 = InvestGuideFragment.f35185t0;
                        View view4 = investGuideFragment.f27318b;
                        if (view4 != null) {
                            return (VerticalSwipeRefreshLayout) view4.findViewById(Ac.e.refreshLayout);
                        }
                        return null;
                    case 4:
                        InvestGuideFragment.a aVar5 = InvestGuideFragment.f35185t0;
                        View view5 = investGuideFragment.f27318b;
                        if (view5 != null) {
                            return (LinearLayout) view5.findViewById(Ac.e.layoutTag);
                        }
                        return null;
                    default:
                        InvestGuideFragment.a aVar6 = InvestGuideFragment.f35185t0;
                        View view6 = investGuideFragment.f27318b;
                        if (view6 != null) {
                            return (CashBoxIntroductionView) view6.findViewById(Ac.e.cashBoxIntroductionView);
                        }
                        return null;
                }
            }
        });
        final int i10 = 1;
        this.f35207v = C2131j.b(new Function0(this) { // from class: Ce.b0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestGuideFragment f1467b;

            {
                this.f1467b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InvestGuideFragment investGuideFragment = this.f1467b;
                switch (i10) {
                    case 0:
                        InvestGuideFragment.a aVar = InvestGuideFragment.f35185t0;
                        View view = investGuideFragment.f27318b;
                        if (view != null) {
                            return (LinearLayout) view.findViewById(Ac.e.ll_dynmic_module);
                        }
                        return null;
                    case 1:
                        InvestGuideFragment.a aVar2 = InvestGuideFragment.f35185t0;
                        View view2 = investGuideFragment.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(Ac.e.functionIndicator);
                        }
                        return null;
                    case 2:
                        InvestGuideFragment.a aVar3 = InvestGuideFragment.f35185t0;
                        View view3 = investGuideFragment.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(Ac.e.functionList);
                        }
                        return null;
                    case 3:
                        InvestGuideFragment.a aVar4 = InvestGuideFragment.f35185t0;
                        View view4 = investGuideFragment.f27318b;
                        if (view4 != null) {
                            return (VerticalSwipeRefreshLayout) view4.findViewById(Ac.e.refreshLayout);
                        }
                        return null;
                    case 4:
                        InvestGuideFragment.a aVar5 = InvestGuideFragment.f35185t0;
                        View view5 = investGuideFragment.f27318b;
                        if (view5 != null) {
                            return (LinearLayout) view5.findViewById(Ac.e.layoutTag);
                        }
                        return null;
                    default:
                        InvestGuideFragment.a aVar6 = InvestGuideFragment.f35185t0;
                        View view6 = investGuideFragment.f27318b;
                        if (view6 != null) {
                            return (CashBoxIntroductionView) view6.findViewById(Ac.e.cashBoxIntroductionView);
                        }
                        return null;
                }
            }
        });
        final int i11 = 2;
        this.f35208w = C2131j.b(new Function0(this) { // from class: Ce.b0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestGuideFragment f1467b;

            {
                this.f1467b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InvestGuideFragment investGuideFragment = this.f1467b;
                switch (i11) {
                    case 0:
                        InvestGuideFragment.a aVar = InvestGuideFragment.f35185t0;
                        View view = investGuideFragment.f27318b;
                        if (view != null) {
                            return (LinearLayout) view.findViewById(Ac.e.ll_dynmic_module);
                        }
                        return null;
                    case 1:
                        InvestGuideFragment.a aVar2 = InvestGuideFragment.f35185t0;
                        View view2 = investGuideFragment.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(Ac.e.functionIndicator);
                        }
                        return null;
                    case 2:
                        InvestGuideFragment.a aVar3 = InvestGuideFragment.f35185t0;
                        View view3 = investGuideFragment.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(Ac.e.functionList);
                        }
                        return null;
                    case 3:
                        InvestGuideFragment.a aVar4 = InvestGuideFragment.f35185t0;
                        View view4 = investGuideFragment.f27318b;
                        if (view4 != null) {
                            return (VerticalSwipeRefreshLayout) view4.findViewById(Ac.e.refreshLayout);
                        }
                        return null;
                    case 4:
                        InvestGuideFragment.a aVar5 = InvestGuideFragment.f35185t0;
                        View view5 = investGuideFragment.f27318b;
                        if (view5 != null) {
                            return (LinearLayout) view5.findViewById(Ac.e.layoutTag);
                        }
                        return null;
                    default:
                        InvestGuideFragment.a aVar6 = InvestGuideFragment.f35185t0;
                        View view6 = investGuideFragment.f27318b;
                        if (view6 != null) {
                            return (CashBoxIntroductionView) view6.findViewById(Ac.e.cashBoxIntroductionView);
                        }
                        return null;
                }
            }
        });
        final int i12 = 3;
        this.f35192A = C2131j.b(new Function0(this) { // from class: Ce.b0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestGuideFragment f1467b;

            {
                this.f1467b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InvestGuideFragment investGuideFragment = this.f1467b;
                switch (i12) {
                    case 0:
                        InvestGuideFragment.a aVar = InvestGuideFragment.f35185t0;
                        View view = investGuideFragment.f27318b;
                        if (view != null) {
                            return (LinearLayout) view.findViewById(Ac.e.ll_dynmic_module);
                        }
                        return null;
                    case 1:
                        InvestGuideFragment.a aVar2 = InvestGuideFragment.f35185t0;
                        View view2 = investGuideFragment.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(Ac.e.functionIndicator);
                        }
                        return null;
                    case 2:
                        InvestGuideFragment.a aVar3 = InvestGuideFragment.f35185t0;
                        View view3 = investGuideFragment.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(Ac.e.functionList);
                        }
                        return null;
                    case 3:
                        InvestGuideFragment.a aVar4 = InvestGuideFragment.f35185t0;
                        View view4 = investGuideFragment.f27318b;
                        if (view4 != null) {
                            return (VerticalSwipeRefreshLayout) view4.findViewById(Ac.e.refreshLayout);
                        }
                        return null;
                    case 4:
                        InvestGuideFragment.a aVar5 = InvestGuideFragment.f35185t0;
                        View view5 = investGuideFragment.f27318b;
                        if (view5 != null) {
                            return (LinearLayout) view5.findViewById(Ac.e.layoutTag);
                        }
                        return null;
                    default:
                        InvestGuideFragment.a aVar6 = InvestGuideFragment.f35185t0;
                        View view6 = investGuideFragment.f27318b;
                        if (view6 != null) {
                            return (CashBoxIntroductionView) view6.findViewById(Ac.e.cashBoxIntroductionView);
                        }
                        return null;
                }
            }
        });
        final int i13 = 4;
        this.f35193B = C2131j.b(new Function0(this) { // from class: Ce.b0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestGuideFragment f1467b;

            {
                this.f1467b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InvestGuideFragment investGuideFragment = this.f1467b;
                switch (i13) {
                    case 0:
                        InvestGuideFragment.a aVar = InvestGuideFragment.f35185t0;
                        View view = investGuideFragment.f27318b;
                        if (view != null) {
                            return (LinearLayout) view.findViewById(Ac.e.ll_dynmic_module);
                        }
                        return null;
                    case 1:
                        InvestGuideFragment.a aVar2 = InvestGuideFragment.f35185t0;
                        View view2 = investGuideFragment.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(Ac.e.functionIndicator);
                        }
                        return null;
                    case 2:
                        InvestGuideFragment.a aVar3 = InvestGuideFragment.f35185t0;
                        View view3 = investGuideFragment.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(Ac.e.functionList);
                        }
                        return null;
                    case 3:
                        InvestGuideFragment.a aVar4 = InvestGuideFragment.f35185t0;
                        View view4 = investGuideFragment.f27318b;
                        if (view4 != null) {
                            return (VerticalSwipeRefreshLayout) view4.findViewById(Ac.e.refreshLayout);
                        }
                        return null;
                    case 4:
                        InvestGuideFragment.a aVar5 = InvestGuideFragment.f35185t0;
                        View view5 = investGuideFragment.f27318b;
                        if (view5 != null) {
                            return (LinearLayout) view5.findViewById(Ac.e.layoutTag);
                        }
                        return null;
                    default:
                        InvestGuideFragment.a aVar6 = InvestGuideFragment.f35185t0;
                        View view6 = investGuideFragment.f27318b;
                        if (view6 != null) {
                            return (CashBoxIntroductionView) view6.findViewById(Ac.e.cashBoxIntroductionView);
                        }
                        return null;
                }
            }
        });
        final int i14 = 5;
        this.f35194C = C2131j.b(new Function0(this) { // from class: Ce.b0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestGuideFragment f1467b;

            {
                this.f1467b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InvestGuideFragment investGuideFragment = this.f1467b;
                switch (i14) {
                    case 0:
                        InvestGuideFragment.a aVar = InvestGuideFragment.f35185t0;
                        View view = investGuideFragment.f27318b;
                        if (view != null) {
                            return (LinearLayout) view.findViewById(Ac.e.ll_dynmic_module);
                        }
                        return null;
                    case 1:
                        InvestGuideFragment.a aVar2 = InvestGuideFragment.f35185t0;
                        View view2 = investGuideFragment.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(Ac.e.functionIndicator);
                        }
                        return null;
                    case 2:
                        InvestGuideFragment.a aVar3 = InvestGuideFragment.f35185t0;
                        View view3 = investGuideFragment.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(Ac.e.functionList);
                        }
                        return null;
                    case 3:
                        InvestGuideFragment.a aVar4 = InvestGuideFragment.f35185t0;
                        View view4 = investGuideFragment.f27318b;
                        if (view4 != null) {
                            return (VerticalSwipeRefreshLayout) view4.findViewById(Ac.e.refreshLayout);
                        }
                        return null;
                    case 4:
                        InvestGuideFragment.a aVar5 = InvestGuideFragment.f35185t0;
                        View view5 = investGuideFragment.f27318b;
                        if (view5 != null) {
                            return (LinearLayout) view5.findViewById(Ac.e.layoutTag);
                        }
                        return null;
                    default:
                        InvestGuideFragment.a aVar6 = InvestGuideFragment.f35185t0;
                        View view6 = investGuideFragment.f27318b;
                        if (view6 != null) {
                            return (CashBoxIntroductionView) view6.findViewById(Ac.e.cashBoxIntroductionView);
                        }
                        return null;
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return f.main_invest_guide_fg_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseLazyMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        ImageView backImageView;
        PpTitleBar ppTitleBar = (PpTitleBar) this.f27318b.findViewById(Ac.e.titleBar);
        if (ppTitleBar != null) {
            ppTitleBar.setTitle(getString(k.core_wealth));
        }
        if (ppTitleBar != null && (backImageView = ppTitleBar.getBackImageView()) != null) {
            p220oa.h.s(backImageView, false);
        }
        h hVar = new h(getContext());
        this.f35195H = hVar;
        hVar.f44697e = true;
        hVar.f4985b = (ArrayList) this.f35206s0.getValue();
        PagerGridLayoutManager pagerGridLayoutManager = new PagerGridLayoutManager(1, 4);
        pagerGridLayoutManager.f25200Q = false;
        t tVar = this.f35208w;
        RecyclerView recyclerView = (RecyclerView) tVar.getValue();
        if (recyclerView != null) {
            recyclerView.setLayoutManager(pagerGridLayoutManager);
        }
        pagerGridLayoutManager.f25197H = new c0(this);
        RecyclerView recyclerView2 = (RecyclerView) tVar.getValue();
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.f35195H);
        }
        RecyclerView recyclerView3 = (RecyclerView) tVar.getValue();
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
        }
        RecyclerView recyclerView4 = (RecyclerView) tVar.getValue();
        if (recyclerView4 != null) {
            recyclerView4.addItemDecoration(new d0());
        }
        h hVar2 = this.f35195H;
        if (hVar2 != null) {
            hVar2.f4986c = new B8.d(2);
        }
        VerticalSwipeRefreshLayout verticalSwipeRefreshLayoutX = x();
        if (verticalSwipeRefreshLayoutX != null) {
            verticalSwipeRefreshLayoutX.setOnRefreshListener(new A8.a(this, 24));
        }
        l lVar = ((HomeSavingsViewModel) this.f27327p).t;
        if (lVar != null) {
            lVar.e(this, new C0144k(new e0(this, 0), 10));
        }
        l lVar2 = ((HomeSavingsViewModel) this.f27327p).f35366f;
        if (lVar2 != null) {
            lVar2.e(this, new C0144k(new e0(this, 1), 10));
        }
        l lVar3 = ((HomeSavingsViewModel) this.f27327p).f35372v;
        if (lVar3 != null) {
            lVar3.e(this, new C0144k(new e0(this, 2), 10));
        }
        l lVar4 = ((HomeSavingsViewModel) this.f27327p).f35369j;
        if (lVar4 != null) {
            lVar4.e(this, new C0144k(new e0(this, 3), 10));
        }
        l lVar5 = ((HomeSavingsViewModel) this.f27327p).f35371p;
        if (lVar5 != null) {
            lVar5.e(this, new C0144k(new e0(this, 4), 10));
        }
        l lVar6 = ((HomeSavingsViewModel) this.f27327p).f35364A;
        if (lVar6 != null) {
            lVar6.e(this, new C0144k(new e0(this, 5), 10));
        }
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseLazyMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        HomeSavingsViewModel homeSavingsViewModel = (HomeSavingsViewModel) this.f27327p;
        homeSavingsViewModel.getClass();
        p140j8.f.s(homeSavingsViewModel, new r(1, null), homeSavingsViewModel.f35364A, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        HomeSavingsViewModel homeSavingsViewModel2 = (HomeSavingsViewModel) this.f27327p;
        if (homeSavingsViewModel2 != null) {
            p140j8.f.s(homeSavingsViewModel2, new C0553z(1, null), homeSavingsViewModel2.t, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseLazyMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (NQEManager.INSTANCE.isNetworkOffline()) {
            if (this.f35205r0 == null) {
                this.f27318b.findViewById(Ac.e.viewNotNetworkStub).setVisibility(0);
                NetworkNotConnectView networkNotConnectView = (NetworkNotConnectView) this.f27318b.findViewById(Ac.e.viewNotNetwork);
                this.f35205r0 = networkNotConnectView;
                if (networkNotConnectView != null) {
                    networkNotConnectView.setTitle(CommonViewExtKt.string(k.core_wealth, getContext()));
                }
                NetworkNotConnectView networkNotConnectView2 = this.f35205r0;
                if (networkNotConnectView2 != null) {
                    networkNotConnectView2.setTopMessage("Maximize your earnings with our top investment products.");
                }
                NetworkNotConnectView networkNotConnectView3 = this.f35205r0;
                if (networkNotConnectView3 != null) {
                    networkNotConnectView3.setRefreshListener(new C0142i(this, 4));
                }
            }
            NetworkNotConnectView networkNotConnectView4 = this.f35205r0;
            if (networkNotConnectView4 != null) {
                networkNotConnectView4.setVisibility(0);
            }
            n0.g().v("open_the_app_without_internet_first");
        }
    }

    public final LinearLayout w() {
        return (LinearLayout) this.t.getValue();
    }

    public final VerticalSwipeRefreshLayout x() {
        return (VerticalSwipeRefreshLayout) this.f35192A.getValue();
    }
}

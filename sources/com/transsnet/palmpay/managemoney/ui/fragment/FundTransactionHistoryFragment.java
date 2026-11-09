package com.transsnet.palmpay.managemoney.ui.fragment;

import Pa.C0525w;
import Wf.AbstractC0780y;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseMvvmFragment;
import com.transsnet.palmpay.core.dialog.MonthPickDialog;
import com.transsnet.palmpay.core.ui.widget.TransFilterLayout;
import com.transsnet.palmpay.custom_view.EmptyView;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.managemoney.bean.req.QueryFundStatReq;
import com.transsnet.palmpay.managemoney.ui.viewmodel.FundTransactionHistoryViewModel;
import com.transsnet.palmpay.util.SizeUtils;
import java.util.ArrayList;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.collections.C1850q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/fragment/FundTransactionHistoryFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmFragment;", "Lcom/transsnet/palmpay/managemoney/ui/viewmodel/FundTransactionHistoryViewModel;", "<init>", "()V", "a", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFundTransactionHistoryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FundTransactionHistoryFragment.kt\ncom/transsnet/palmpay/managemoney/ui/fragment/FundTransactionHistoryFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,474:1\n33#2,2:475\n383#2:477\n401#2:478\n383#2:479\n401#2:480\n115#2,8:481\n145#2:489\n*S KotlinDebug\n*F\n+ 1 FundTransactionHistoryFragment.kt\ncom/transsnet/palmpay/managemoney/ui/fragment/FundTransactionHistoryFragment\n*L\n232#1:475,2\n240#1:477\n240#1:478\n285#1:479\n285#1:480\n305#1:481,8\n305#1:489\n*E\n"})
public final class FundTransactionHistoryFragment extends BaseMvvmFragment<FundTransactionHistoryViewModel> {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final a f32458Z = new a(null);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public LinearLayout f32460B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public TextView f32461C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f32462H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public TextView f32463L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public TextView f32464M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public C1599v f32465Q;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public String f32467Y;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p355xf.t f32468j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p355xf.t f32469o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p355xf.t f32470p;
    public MonthPickDialog t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Nc.k f32471v = new Nc.k();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f32472w = 5;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f32459A = 2018;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final ArrayList f32466X = C1850q.e("", "x6_02", "x7_01", "x6_01", "x7_02");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FundTransactionHistoryFragment newInstance() {
            return new FundTransactionHistoryFragment();
        }

        private a() {
        }
    }

    public FundTransactionHistoryFragment() {
        final int i7 = 0;
        this.f32468j = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.H

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FundTransactionHistoryFragment f32476b;

            {
                this.f32476b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FundTransactionHistoryFragment fundTransactionHistoryFragment = this.f32476b;
                switch (i7) {
                    case 0:
                        FundTransactionHistoryFragment.a aVar = FundTransactionHistoryFragment.f32458Z;
                        View view = fundTransactionHistoryFragment.f27318b;
                        if (view != null) {
                            return (SwipeRecyclerView) view.findViewById(Jc.c.billList);
                        }
                        return null;
                    case 1:
                        FundTransactionHistoryFragment.a aVar2 = FundTransactionHistoryFragment.f32458Z;
                        View view2 = fundTransactionHistoryFragment.f27318b;
                        if (view2 != null) {
                            return (TransFilterLayout) view2.findViewById(Jc.c.layoutTransFilter);
                        }
                        return null;
                    default:
                        FundTransactionHistoryFragment.a aVar3 = FundTransactionHistoryFragment.f32458Z;
                        View view3 = fundTransactionHistoryFragment.f27318b;
                        if (view3 != null) {
                            return (PpTitleBar) view3.findViewById(Jc.c.mtb);
                        }
                        return null;
                }
            }
        });
        final int i10 = 1;
        this.f32469o = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.H

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FundTransactionHistoryFragment f32476b;

            {
                this.f32476b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FundTransactionHistoryFragment fundTransactionHistoryFragment = this.f32476b;
                switch (i10) {
                    case 0:
                        FundTransactionHistoryFragment.a aVar = FundTransactionHistoryFragment.f32458Z;
                        View view = fundTransactionHistoryFragment.f27318b;
                        if (view != null) {
                            return (SwipeRecyclerView) view.findViewById(Jc.c.billList);
                        }
                        return null;
                    case 1:
                        FundTransactionHistoryFragment.a aVar2 = FundTransactionHistoryFragment.f32458Z;
                        View view2 = fundTransactionHistoryFragment.f27318b;
                        if (view2 != null) {
                            return (TransFilterLayout) view2.findViewById(Jc.c.layoutTransFilter);
                        }
                        return null;
                    default:
                        FundTransactionHistoryFragment.a aVar3 = FundTransactionHistoryFragment.f32458Z;
                        View view3 = fundTransactionHistoryFragment.f27318b;
                        if (view3 != null) {
                            return (PpTitleBar) view3.findViewById(Jc.c.mtb);
                        }
                        return null;
                }
            }
        });
        final int i11 = 2;
        this.f32470p = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.H

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FundTransactionHistoryFragment f32476b;

            {
                this.f32476b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FundTransactionHistoryFragment fundTransactionHistoryFragment = this.f32476b;
                switch (i11) {
                    case 0:
                        FundTransactionHistoryFragment.a aVar = FundTransactionHistoryFragment.f32458Z;
                        View view = fundTransactionHistoryFragment.f27318b;
                        if (view != null) {
                            return (SwipeRecyclerView) view.findViewById(Jc.c.billList);
                        }
                        return null;
                    case 1:
                        FundTransactionHistoryFragment.a aVar2 = FundTransactionHistoryFragment.f32458Z;
                        View view2 = fundTransactionHistoryFragment.f27318b;
                        if (view2 != null) {
                            return (TransFilterLayout) view2.findViewById(Jc.c.layoutTransFilter);
                        }
                        return null;
                    default:
                        FundTransactionHistoryFragment.a aVar3 = FundTransactionHistoryFragment.f32458Z;
                        View view3 = fundTransactionHistoryFragment.f27318b;
                        if (view3 != null) {
                            return (PpTitleBar) view3.findViewById(Jc.c.mtb);
                        }
                        return null;
                }
            }
        });
    }

    public static long t(int i7, int i10) {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(i7, i10 - 1, 1);
        return calendar.getTimeInMillis();
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return Jc.d.mm_target_savings_transaction_history_fragment;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        FundTransactionHistoryViewModel fundTransactionHistoryViewModel = (FundTransactionHistoryViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar = fundTransactionHistoryViewModel != null ? fundTransactionHistoryViewModel.f32772o : null;
        if (lVar != null) {
            lVar.e(this, new Wd.I(new I(this, 1), 22));
        }
        FundTransactionHistoryViewModel fundTransactionHistoryViewModel2 = (FundTransactionHistoryViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar2 = fundTransactionHistoryViewModel2 != null ? fundTransactionHistoryViewModel2.f32769g : null;
        if (lVar2 != null) {
            lVar2.e(this, new Wd.I(new T8.o(18, lVar2, this), 22));
        }
        FundTransactionHistoryViewModel fundTransactionHistoryViewModel3 = (FundTransactionHistoryViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar3 = fundTransactionHistoryViewModel3 != null ? fundTransactionHistoryViewModel3.f32773p : null;
        if (lVar3 != null) {
            lVar3.e(this, new Wd.I(new C1596s(lVar3, 2), 22));
        }
        FundTransactionHistoryViewModel fundTransactionHistoryViewModel4 = (FundTransactionHistoryViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar4 = fundTransactionHistoryViewModel4 != null ? fundTransactionHistoryViewModel4.f32770i : null;
        if (lVar4 == null) {
            return 0;
        }
        lVar4.e(this, new Wd.I(new I(this, 0), 22));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        TransFilterLayout transFilterLayoutV = v();
        if (transFilterLayoutV != null) {
            transFilterLayoutV.setBusinessType(1);
        }
        w(true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        View viewFindViewById;
        View viewFindViewById2;
        this.f32460B = (LinearLayout) this.f27318b.findViewById(Jc.c.ll_container_top);
        this.f32461C = (TextView) this.f27318b.findViewById(Jc.c.abl_month_tv);
        this.f32463L = (TextView) this.f27318b.findViewById(Jc.c.money_in_textViewSummary);
        this.f32464M = (TextView) this.f27318b.findViewById(Jc.c.money_out_textViewSummary);
        MonthPickDialog monthPickDialog = new MonthPickDialog(getActivity());
        this.t = monthPickDialog;
        monthPickDialog.setShowConfirmBtn(true);
        this.f32465Q = new C1599v(this, 1);
        PpTitleBar ppTitleBar = (PpTitleBar) this.f32470p.getValue();
        if (ppTitleBar != null) {
            final int i7 = 0;
            ppTitleBar.setBackButtonClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.G

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ FundTransactionHistoryFragment f32474b;

                {
                    this.f32474b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FundTransactionHistoryFragment fundTransactionHistoryFragment = this.f32474b;
                    switch (i7) {
                        case 0:
                            FundTransactionHistoryFragment.a aVar = FundTransactionHistoryFragment.f32458Z;
                            androidx.fragment.app.E activity = fundTransactionHistoryFragment.getActivity();
                            if (activity != null) {
                                activity.finish();
                            }
                            break;
                        case 1:
                            FundTransactionHistoryFragment.a aVar2 = FundTransactionHistoryFragment.f32458Z;
                            TransFilterLayout transFilterLayoutV = fundTransactionHistoryFragment.v();
                            if (transFilterLayoutV != null) {
                                transFilterLayoutV.j();
                            }
                            break;
                        default:
                            FundTransactionHistoryFragment.a aVar3 = FundTransactionHistoryFragment.f32458Z;
                            fundTransactionHistoryFragment.x();
                            break;
                    }
                }
            });
        }
        TransFilterLayout transFilterLayoutV = v();
        if (transFilterLayoutV != null) {
            transFilterLayoutV.setBusinessType(1);
        }
        TransFilterLayout transFilterLayoutV2 = v();
        if (transFilterLayoutV2 != null && (viewFindViewById2 = transFilterLayoutV2.findViewById(p025ba.e.flFilter)) != null) {
            viewFindViewById2.setVisibility(8);
        }
        TransFilterLayout transFilterLayoutV3 = v();
        if (transFilterLayoutV3 != null) {
            transFilterLayoutV3.setOnSelectListener(new L(this));
        }
        TransFilterLayout transFilterLayoutV4 = v();
        if (transFilterLayoutV4 != null && (viewFindViewById = transFilterLayoutV4.findViewById(p025ba.e.flFilterIO)) != null) {
            final int i10 = 1;
            viewFindViewById.setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.G

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ FundTransactionHistoryFragment f32474b;

                {
                    this.f32474b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FundTransactionHistoryFragment fundTransactionHistoryFragment = this.f32474b;
                    switch (i10) {
                        case 0:
                            FundTransactionHistoryFragment.a aVar = FundTransactionHistoryFragment.f32458Z;
                            androidx.fragment.app.E activity = fundTransactionHistoryFragment.getActivity();
                            if (activity != null) {
                                activity.finish();
                            }
                            break;
                        case 1:
                            FundTransactionHistoryFragment.a aVar2 = FundTransactionHistoryFragment.f32458Z;
                            TransFilterLayout transFilterLayoutV5 = fundTransactionHistoryFragment.v();
                            if (transFilterLayoutV5 != null) {
                                transFilterLayoutV5.j();
                            }
                            break;
                        default:
                            FundTransactionHistoryFragment.a aVar3 = FundTransactionHistoryFragment.f32458Z;
                            fundTransactionHistoryFragment.x();
                            break;
                    }
                }
            });
        }
        SwipeRecyclerView swipeRecyclerViewU = u();
        if (swipeRecyclerViewU != null) {
            swipeRecyclerViewU.setOnLoadListener(new M(this));
        }
        com.palmpay.lib.bridgewrapper.photo.upload.a itemClickListener = new com.palmpay.lib.bridgewrapper.photo.upload.a(20);
        Nc.k kVar = this.f32471v;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(itemClickListener, "itemClickListener");
        kVar.f6332c = itemClickListener;
        kVar.f6333d = new C0525w(this, 21);
        TextView textView = this.f32461C;
        if (textView != null) {
            final int i11 = 2;
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.G

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ FundTransactionHistoryFragment f32474b;

                {
                    this.f32474b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FundTransactionHistoryFragment fundTransactionHistoryFragment = this.f32474b;
                    switch (i11) {
                        case 0:
                            FundTransactionHistoryFragment.a aVar = FundTransactionHistoryFragment.f32458Z;
                            androidx.fragment.app.E activity = fundTransactionHistoryFragment.getActivity();
                            if (activity != null) {
                                activity.finish();
                            }
                            break;
                        case 1:
                            FundTransactionHistoryFragment.a aVar2 = FundTransactionHistoryFragment.f32458Z;
                            TransFilterLayout transFilterLayoutV5 = fundTransactionHistoryFragment.v();
                            if (transFilterLayoutV5 != null) {
                                transFilterLayoutV5.j();
                            }
                            break;
                        default:
                            FundTransactionHistoryFragment.a aVar3 = FundTransactionHistoryFragment.f32458Z;
                            fundTransactionHistoryFragment.x();
                            break;
                    }
                }
            });
        }
        SwipeRecyclerView swipeRecyclerViewU2 = u();
        if (swipeRecyclerViewU2 != null) {
            swipeRecyclerViewU2.setRefreshEnable(true);
        }
        SwipeRecyclerView swipeRecyclerViewU3 = u();
        if (swipeRecyclerViewU3 != null) {
            swipeRecyclerViewU3.setLoadMoreEnable(true);
        }
        SwipeRecyclerView swipeRecyclerViewU4 = u();
        if (swipeRecyclerViewU4 != null && (recyclerView2 = swipeRecyclerViewU4.getRecyclerView()) != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        }
        SwipeRecyclerView swipeRecyclerViewU5 = u();
        if (swipeRecyclerViewU5 != null) {
            swipeRecyclerViewU5.setAdapter(kVar);
        }
        SwipeRecyclerView swipeRecyclerViewU6 = u();
        if (swipeRecyclerViewU6 != null) {
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            EmptyView emptyView = new EmptyView(contextRequireContext);
            emptyView.setTips(getString(Jc.f.mm_no_transaction_record));
            swipeRecyclerViewU6.setEmptyView(emptyView);
        }
        SwipeRecyclerView swipeRecyclerViewU7 = u();
        if (swipeRecyclerViewU7 != null && (recyclerView = swipeRecyclerViewU7.getRecyclerView()) != null) {
            recyclerView.addOnScrollListener(new K(this));
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f32472w = Pa.r0.h0(jCurrentTimeMillis);
        int iN0 = Pa.r0.N0(jCurrentTimeMillis);
        this.f32459A = iN0;
        y(iN0, this.f32472w);
        super.o();
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        MonthPickDialog monthPickDialog = this.t;
        if (monthPickDialog != null) {
            monthPickDialog.setCallBack(null);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        MonthPickDialog monthPickDialog = this.t;
        if (monthPickDialog != null) {
            monthPickDialog.setCallBack(this.f32465Q);
        }
    }

    public final SwipeRecyclerView u() {
        return (SwipeRecyclerView) this.f32468j.getValue();
    }

    public final TransFilterLayout v() {
        return (TransFilterLayout) this.f32469o.getValue();
    }

    public final void w(boolean z3) {
        QueryFundStatReq queryFundStatReq;
        QueryFundStatReq queryFundStatReq2;
        QueryFundStatReq queryFundStatReq3;
        FundTransactionHistoryViewModel fundTransactionHistoryViewModel = (FundTransactionHistoryViewModel) this.f27333i;
        if (fundTransactionHistoryViewModel != null && (queryFundStatReq3 = fundTransactionHistoryViewModel.f32768f) != null) {
            queryFundStatReq3.setFundId(this.f32467Y);
        }
        FundTransactionHistoryViewModel fundTransactionHistoryViewModel2 = (FundTransactionHistoryViewModel) this.f27333i;
        if (fundTransactionHistoryViewModel2 != null && (queryFundStatReq2 = fundTransactionHistoryViewModel2.f32767e) != null) {
            queryFundStatReq2.setFundId(this.f32467Y);
        }
        if (z3) {
            this.f32462H = 0;
            if (SizeUtils.dp2px(20.0f) < 0) {
                LinearLayout linearLayout = this.f32460B;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
            } else {
                LinearLayout linearLayout2 = this.f32460B;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(8);
                }
            }
            FundTransactionHistoryViewModel fundTransactionHistoryViewModel3 = (FundTransactionHistoryViewModel) this.f27333i;
            if (fundTransactionHistoryViewModel3 != null && (queryFundStatReq = fundTransactionHistoryViewModel3.f32768f) != null) {
                queryFundStatReq.setEndTime(t(this.f32459A, this.f32472w + 1));
            }
        }
        FundTransactionHistoryViewModel fundTransactionHistoryViewModel4 = (FundTransactionHistoryViewModel) this.f27333i;
        if (fundTransactionHistoryViewModel4 != null) {
            fundTransactionHistoryViewModel4.f(fundTransactionHistoryViewModel4.g(System.currentTimeMillis()), fundTransactionHistoryViewModel4.e(System.currentTimeMillis()));
            QueryFundStatReq queryFundStatReq4 = fundTransactionHistoryViewModel4.f32768f;
            if (z3) {
                queryFundStatReq4.setPageNum(1);
            }
            queryFundStatReq4.setPageSize(20);
            queryFundStatReq4.setStartTime(-1L);
            AbstractC0780y.m(androidx.lifecycle.V.h(fundTransactionHistoryViewModel4), null, null, new Qc.U(fundTransactionHistoryViewModel4, z3, null), 3);
        }
    }

    public final void x() {
        int i7;
        MonthPickDialog monthPickDialog;
        MonthPickDialog monthPickDialog2 = this.t;
        if (monthPickDialog2 != null) {
            monthPickDialog2.show();
        }
        MonthPickDialog monthPickDialog3 = this.t;
        if (monthPickDialog3 != null) {
            monthPickDialog3.setCanceledOnTouchOutside(true);
        }
        int i10 = this.f32472w;
        if (i10 <= 0 || (i7 = this.f32459A) <= 0 || (monthPickDialog = this.t) == null) {
            return;
        }
        monthPickDialog.setNowPickDate(i7, i10);
    }

    public final void y(int i7, int i10) {
        if (i10 <= 0 || this.f32461C == null) {
            return;
        }
        if (Pa.r0.N0(System.currentTimeMillis()) == i7) {
            TextView textView = this.f32461C;
            if (textView != null) {
                textView.setText(Pa.r0.i0(i10 - 1));
                return;
            }
            return;
        }
        TextView textView2 = this.f32461C;
        if (textView2 != null) {
            textView2.setText(Pa.r0.i0(i10 - 1) + " " + i7);
        }
    }
}

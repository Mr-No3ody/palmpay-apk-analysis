package com.transsnet.palmpay.managemoney.ui.fragment;

import Qc.C0565f;
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
import com.transsnet.palmpay.managemoney.bean.req.QueryCashBoxStatReq;
import com.transsnet.palmpay.managemoney.ui.viewmodel.CashBoxTransactionHistoryViewModel;
import com.transsnet.palmpay.util.SizeUtils;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/fragment/CashBoxTransactionHistoryFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmFragment;", "Lcom/transsnet/palmpay/managemoney/ui/viewmodel/CashBoxTransactionHistoryViewModel;", "<init>", "()V", "a", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCashBoxTransactionHistoryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CashBoxTransactionHistoryFragment.kt\ncom/transsnet/palmpay/managemoney/ui/fragment/CashBoxTransactionHistoryFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,551:1\n33#2,2:552\n383#2:554\n401#2:555\n383#2:556\n401#2:557\n115#2,8:558\n145#2:566\n*S KotlinDebug\n*F\n+ 1 CashBoxTransactionHistoryFragment.kt\ncom/transsnet/palmpay/managemoney/ui/fragment/CashBoxTransactionHistoryFragment\n*L\n300#1:552,2\n308#1:554\n308#1:555\n356#1:556\n356#1:557\n377#1:558,8\n377#1:566\n*E\n"})
public final class CashBoxTransactionHistoryFragment extends BaseMvvmFragment<CashBoxTransactionHistoryViewModel> {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final a f32428Y = new a(null);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public LinearLayout f32430B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public TextView f32431C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f32432H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public TextView f32433L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public TextView f32434M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public C1599v f32435Q;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p355xf.t f32437j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p355xf.t f32438o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p355xf.t f32439p;
    public MonthPickDialog t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Nc.e f32440v = new Nc.e(3);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f32441w = 5;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f32429A = 2018;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public int f32436X = -1;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CashBoxTransactionHistoryFragment newInstance() {
            return new CashBoxTransactionHistoryFragment();
        }

        private a() {
        }
    }

    public CashBoxTransactionHistoryFragment() {
        final int i7 = 0;
        this.f32437j = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxTransactionHistoryFragment f32679b;

            {
                this.f32679b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxTransactionHistoryFragment cashBoxTransactionHistoryFragment = this.f32679b;
                switch (i7) {
                    case 0:
                        CashBoxTransactionHistoryFragment.a aVar = CashBoxTransactionHistoryFragment.f32428Y;
                        View view = cashBoxTransactionHistoryFragment.f27318b;
                        if (view != null) {
                            return (SwipeRecyclerView) view.findViewById(Jc.c.billList);
                        }
                        return null;
                    case 1:
                        CashBoxTransactionHistoryFragment.a aVar2 = CashBoxTransactionHistoryFragment.f32428Y;
                        View view2 = cashBoxTransactionHistoryFragment.f27318b;
                        if (view2 != null) {
                            return (TransFilterLayout) view2.findViewById(Jc.c.layoutTransFilter);
                        }
                        return null;
                    default:
                        CashBoxTransactionHistoryFragment.a aVar3 = CashBoxTransactionHistoryFragment.f32428Y;
                        View view3 = cashBoxTransactionHistoryFragment.f27318b;
                        if (view3 != null) {
                            return (PpTitleBar) view3.findViewById(Jc.c.mtb);
                        }
                        return null;
                }
            }
        });
        final int i10 = 1;
        this.f32438o = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxTransactionHistoryFragment f32679b;

            {
                this.f32679b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxTransactionHistoryFragment cashBoxTransactionHistoryFragment = this.f32679b;
                switch (i10) {
                    case 0:
                        CashBoxTransactionHistoryFragment.a aVar = CashBoxTransactionHistoryFragment.f32428Y;
                        View view = cashBoxTransactionHistoryFragment.f27318b;
                        if (view != null) {
                            return (SwipeRecyclerView) view.findViewById(Jc.c.billList);
                        }
                        return null;
                    case 1:
                        CashBoxTransactionHistoryFragment.a aVar2 = CashBoxTransactionHistoryFragment.f32428Y;
                        View view2 = cashBoxTransactionHistoryFragment.f27318b;
                        if (view2 != null) {
                            return (TransFilterLayout) view2.findViewById(Jc.c.layoutTransFilter);
                        }
                        return null;
                    default:
                        CashBoxTransactionHistoryFragment.a aVar3 = CashBoxTransactionHistoryFragment.f32428Y;
                        View view3 = cashBoxTransactionHistoryFragment.f27318b;
                        if (view3 != null) {
                            return (PpTitleBar) view3.findViewById(Jc.c.mtb);
                        }
                        return null;
                }
            }
        });
        final int i11 = 2;
        this.f32439p = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxTransactionHistoryFragment f32679b;

            {
                this.f32679b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxTransactionHistoryFragment cashBoxTransactionHistoryFragment = this.f32679b;
                switch (i11) {
                    case 0:
                        CashBoxTransactionHistoryFragment.a aVar = CashBoxTransactionHistoryFragment.f32428Y;
                        View view = cashBoxTransactionHistoryFragment.f27318b;
                        if (view != null) {
                            return (SwipeRecyclerView) view.findViewById(Jc.c.billList);
                        }
                        return null;
                    case 1:
                        CashBoxTransactionHistoryFragment.a aVar2 = CashBoxTransactionHistoryFragment.f32428Y;
                        View view2 = cashBoxTransactionHistoryFragment.f27318b;
                        if (view2 != null) {
                            return (TransFilterLayout) view2.findViewById(Jc.c.layoutTransFilter);
                        }
                        return null;
                    default:
                        CashBoxTransactionHistoryFragment.a aVar3 = CashBoxTransactionHistoryFragment.f32428Y;
                        View view3 = cashBoxTransactionHistoryFragment.f27318b;
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
        return Jc.d.mm_cash_box_transaction_history_fragment;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        CashBoxTransactionHistoryViewModel cashBoxTransactionHistoryViewModel = (CashBoxTransactionHistoryViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar = cashBoxTransactionHistoryViewModel != null ? cashBoxTransactionHistoryViewModel.f32730o : null;
        if (lVar != null) {
            lVar.e(this, new Wd.I(new C1602y(this, 1), 20));
        }
        CashBoxTransactionHistoryViewModel cashBoxTransactionHistoryViewModel2 = (CashBoxTransactionHistoryViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar2 = cashBoxTransactionHistoryViewModel2 != null ? cashBoxTransactionHistoryViewModel2.f32727g : null;
        if (lVar2 != null) {
            lVar2.e(this, new Wd.I(new T8.o(17, lVar2, this), 20));
        }
        CashBoxTransactionHistoryViewModel cashBoxTransactionHistoryViewModel3 = (CashBoxTransactionHistoryViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar3 = cashBoxTransactionHistoryViewModel3 != null ? cashBoxTransactionHistoryViewModel3.f32731p : null;
        if (lVar3 != null) {
            lVar3.e(this, new Wd.I(new C1596s(lVar3, 1), 20));
        }
        CashBoxTransactionHistoryViewModel cashBoxTransactionHistoryViewModel4 = (CashBoxTransactionHistoryViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar4 = cashBoxTransactionHistoryViewModel4 != null ? cashBoxTransactionHistoryViewModel4.f32728i : null;
        if (lVar4 == null) {
            return 0;
        }
        lVar4.e(this, new Wd.I(new C1602y(this, 0), 20));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        QueryCashBoxStatReq queryCashBoxStatReq;
        QueryCashBoxStatReq queryCashBoxStatReq2;
        int i7 = this.f32436X;
        if (i7 > 0) {
            CashBoxTransactionHistoryViewModel cashBoxTransactionHistoryViewModel = (CashBoxTransactionHistoryViewModel) this.f27333i;
            if (cashBoxTransactionHistoryViewModel != null && (queryCashBoxStatReq2 = cashBoxTransactionHistoryViewModel.f32725e) != null) {
                queryCashBoxStatReq2.setTransactionType(i7);
            }
            CashBoxTransactionHistoryViewModel cashBoxTransactionHistoryViewModel2 = (CashBoxTransactionHistoryViewModel) this.f27333i;
            if (cashBoxTransactionHistoryViewModel2 != null && (queryCashBoxStatReq = cashBoxTransactionHistoryViewModel2.f32726f) != null) {
                queryCashBoxStatReq.setTransactionType(this.f32436X);
            }
            p355xf.t tVar = this.f32438o;
            TransFilterLayout transFilterLayout = (TransFilterLayout) tVar.getValue();
            if (transFilterLayout != null) {
                transFilterLayout.setBillType(String.valueOf(this.f32436X));
            }
            TransFilterLayout transFilterLayout2 = (TransFilterLayout) tVar.getValue();
            if (transFilterLayout2 != null) {
                transFilterLayout2.setFilterTextWithType(this.f32436X);
            }
        }
        v(true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        View viewFindViewById;
        this.f32430B = (LinearLayout) this.f27318b.findViewById(Jc.c.ll_container_top);
        this.f32431C = (TextView) this.f27318b.findViewById(Jc.c.abl_month_tv);
        this.f32433L = (TextView) this.f27318b.findViewById(Jc.c.money_in_textViewSummary);
        this.f32434M = (TextView) this.f27318b.findViewById(Jc.c.money_out_textViewSummary);
        MonthPickDialog monthPickDialog = new MonthPickDialog(getActivity());
        this.t = monthPickDialog;
        monthPickDialog.setShowConfirmBtn(true);
        this.f32435Q = new C1599v(this, 0);
        PpTitleBar ppTitleBar = (PpTitleBar) this.f32439p.getValue();
        if (ppTitleBar != null) {
            final int i7 = 0;
            ppTitleBar.setBackButtonClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.w

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CashBoxTransactionHistoryFragment f32675b;

                {
                    this.f32675b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CashBoxTransactionHistoryFragment cashBoxTransactionHistoryFragment = this.f32675b;
                    switch (i7) {
                        case 0:
                            CashBoxTransactionHistoryFragment.a aVar = CashBoxTransactionHistoryFragment.f32428Y;
                            androidx.fragment.app.E activity = cashBoxTransactionHistoryFragment.getActivity();
                            if (activity != null) {
                                activity.finish();
                            }
                            break;
                        case 1:
                            CashBoxTransactionHistoryFragment.a aVar2 = CashBoxTransactionHistoryFragment.f32428Y;
                            TransFilterLayout transFilterLayout = (TransFilterLayout) cashBoxTransactionHistoryFragment.f32438o.getValue();
                            if (transFilterLayout != null) {
                                transFilterLayout.i();
                            }
                            break;
                        default:
                            CashBoxTransactionHistoryFragment.a aVar3 = CashBoxTransactionHistoryFragment.f32428Y;
                            cashBoxTransactionHistoryFragment.w();
                            break;
                    }
                }
            });
        }
        p355xf.t tVar = this.f32438o;
        TransFilterLayout transFilterLayout = (TransFilterLayout) tVar.getValue();
        if (transFilterLayout != null) {
            transFilterLayout.setOnSelectListener(new B(this));
        }
        TransFilterLayout transFilterLayout2 = (TransFilterLayout) tVar.getValue();
        if (transFilterLayout2 != null && (viewFindViewById = transFilterLayout2.findViewById(p025ba.e.flFilter)) != null) {
            final int i10 = 1;
            viewFindViewById.setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.w

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CashBoxTransactionHistoryFragment f32675b;

                {
                    this.f32675b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CashBoxTransactionHistoryFragment cashBoxTransactionHistoryFragment = this.f32675b;
                    switch (i10) {
                        case 0:
                            CashBoxTransactionHistoryFragment.a aVar = CashBoxTransactionHistoryFragment.f32428Y;
                            androidx.fragment.app.E activity = cashBoxTransactionHistoryFragment.getActivity();
                            if (activity != null) {
                                activity.finish();
                            }
                            break;
                        case 1:
                            CashBoxTransactionHistoryFragment.a aVar2 = CashBoxTransactionHistoryFragment.f32428Y;
                            TransFilterLayout transFilterLayout3 = (TransFilterLayout) cashBoxTransactionHistoryFragment.f32438o.getValue();
                            if (transFilterLayout3 != null) {
                                transFilterLayout3.i();
                            }
                            break;
                        default:
                            CashBoxTransactionHistoryFragment.a aVar3 = CashBoxTransactionHistoryFragment.f32428Y;
                            cashBoxTransactionHistoryFragment.w();
                            break;
                    }
                }
            });
        }
        SwipeRecyclerView swipeRecyclerViewU = u();
        if (swipeRecyclerViewU != null) {
            swipeRecyclerViewU.setOnLoadListener(new C(this));
        }
        com.transsnet.palmpay.core.ui.activity.Z itemClickListener = new com.transsnet.palmpay.core.ui.activity.Z(this, 17);
        Nc.e eVar = this.f32440v;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(itemClickListener, "itemClickListener");
        eVar.f6314d = itemClickListener;
        eVar.f6315e = new Oe.a(this, 18);
        TextView textView = this.f32431C;
        if (textView != null) {
            final int i11 = 2;
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.w

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CashBoxTransactionHistoryFragment f32675b;

                {
                    this.f32675b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CashBoxTransactionHistoryFragment cashBoxTransactionHistoryFragment = this.f32675b;
                    switch (i11) {
                        case 0:
                            CashBoxTransactionHistoryFragment.a aVar = CashBoxTransactionHistoryFragment.f32428Y;
                            androidx.fragment.app.E activity = cashBoxTransactionHistoryFragment.getActivity();
                            if (activity != null) {
                                activity.finish();
                            }
                            break;
                        case 1:
                            CashBoxTransactionHistoryFragment.a aVar2 = CashBoxTransactionHistoryFragment.f32428Y;
                            TransFilterLayout transFilterLayout3 = (TransFilterLayout) cashBoxTransactionHistoryFragment.f32438o.getValue();
                            if (transFilterLayout3 != null) {
                                transFilterLayout3.i();
                            }
                            break;
                        default:
                            CashBoxTransactionHistoryFragment.a aVar3 = CashBoxTransactionHistoryFragment.f32428Y;
                            cashBoxTransactionHistoryFragment.w();
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
            swipeRecyclerViewU5.setAdapter(eVar);
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
            recyclerView.addOnScrollListener(new A(this));
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f32441w = Pa.r0.h0(jCurrentTimeMillis);
        int iN0 = Pa.r0.N0(jCurrentTimeMillis);
        this.f32429A = iN0;
        x(iN0, this.f32441w);
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
            monthPickDialog.setCallBack(this.f32435Q);
        }
    }

    public final SwipeRecyclerView u() {
        return (SwipeRecyclerView) this.f32437j.getValue();
    }

    public final void v(boolean z3) {
        QueryCashBoxStatReq queryCashBoxStatReq;
        if (z3) {
            this.f32432H = 0;
            if (SizeUtils.dp2px(20.0f) < 0) {
                LinearLayout linearLayout = this.f32430B;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
            } else {
                LinearLayout linearLayout2 = this.f32430B;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(8);
                }
            }
            CashBoxTransactionHistoryViewModel cashBoxTransactionHistoryViewModel = (CashBoxTransactionHistoryViewModel) this.f27333i;
            if (cashBoxTransactionHistoryViewModel != null && (queryCashBoxStatReq = cashBoxTransactionHistoryViewModel.f32726f) != null) {
                queryCashBoxStatReq.setStartTime(t(this.f32429A, this.f32441w + 1));
            }
        }
        CashBoxTransactionHistoryViewModel cashBoxTransactionHistoryViewModel2 = (CashBoxTransactionHistoryViewModel) this.f27333i;
        if (cashBoxTransactionHistoryViewModel2 != null) {
            cashBoxTransactionHistoryViewModel2.f(cashBoxTransactionHistoryViewModel2.g(System.currentTimeMillis()), cashBoxTransactionHistoryViewModel2.e(System.currentTimeMillis()));
            if (z3) {
                cashBoxTransactionHistoryViewModel2.f32726f.setPageNum(1);
            }
            AbstractC0780y.m(androidx.lifecycle.V.h(cashBoxTransactionHistoryViewModel2), null, null, new C0565f(cashBoxTransactionHistoryViewModel2, z3, null), 3);
        }
    }

    public final void w() {
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
        int i10 = this.f32441w;
        if (i10 <= 0 || (i7 = this.f32429A) <= 0 || (monthPickDialog = this.t) == null) {
            return;
        }
        monthPickDialog.setNowPickDate(i7, i10);
    }

    public final void x(int i7, int i10) {
        if (i10 <= 0 || this.f32431C == null) {
            return;
        }
        if (Pa.r0.N0(System.currentTimeMillis()) == i7) {
            TextView textView = this.f32431C;
            if (textView != null) {
                textView.setText(Pa.r0.i0(i10 - 1));
                return;
            }
            return;
        }
        TextView textView2 = this.f32431C;
        if (textView2 != null) {
            textView2.setText(Pa.r0.i0(i10 - 1) + " " + i7);
        }
    }
}

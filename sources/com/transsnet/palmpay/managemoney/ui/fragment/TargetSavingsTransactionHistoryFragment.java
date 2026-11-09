package com.transsnet.palmpay.managemoney.ui.fragment;

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
import com.transsnet.palmpay.managemoney.ui.viewmodel.TargetSavingsTransactionHistoryViewModel;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/fragment/TargetSavingsTransactionHistoryFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmFragment;", "Lcom/transsnet/palmpay/managemoney/ui/viewmodel/TargetSavingsTransactionHistoryViewModel;", "<init>", "()V", "a", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTargetSavingsTransactionHistoryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TargetSavingsTransactionHistoryFragment.kt\ncom/transsnet/palmpay/managemoney/ui/fragment/TargetSavingsTransactionHistoryFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,478:1\n33#2,2:479\n383#2:481\n401#2:482\n383#2:483\n401#2:484\n115#2,8:485\n145#2:493\n*S KotlinDebug\n*F\n+ 1 TargetSavingsTransactionHistoryFragment.kt\ncom/transsnet/palmpay/managemoney/ui/fragment/TargetSavingsTransactionHistoryFragment\n*L\n238#1:479,2\n246#1:481\n246#1:482\n291#1:483\n291#1:484\n311#1:485,8\n311#1:493\n*E\n"})
public final class TargetSavingsTransactionHistoryFragment extends BaseMvvmFragment<TargetSavingsTransactionHistoryViewModel> {

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final a f32549X = new a(null);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public LinearLayout f32551B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public TextView f32552C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f32553H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public TextView f32554L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public TextView f32555M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public C1599v f32556Q;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p355xf.t f32557j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p355xf.t f32558o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p355xf.t f32559p;
    public MonthPickDialog t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Nc.e f32560v = new Nc.e(1);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f32561w = 5;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f32550A = 2018;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TargetSavingsTransactionHistoryFragment newInstance() {
            return new TargetSavingsTransactionHistoryFragment();
        }

        private a() {
        }
    }

    public TargetSavingsTransactionHistoryFragment() {
        final int i7 = 0;
        this.f32557j = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.l0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TargetSavingsTransactionHistoryFragment f32638b;

            {
                this.f32638b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TargetSavingsTransactionHistoryFragment targetSavingsTransactionHistoryFragment = this.f32638b;
                switch (i7) {
                    case 0:
                        TargetSavingsTransactionHistoryFragment.a aVar = TargetSavingsTransactionHistoryFragment.f32549X;
                        View view = targetSavingsTransactionHistoryFragment.f27318b;
                        if (view != null) {
                            return (SwipeRecyclerView) view.findViewById(Jc.c.billList);
                        }
                        return null;
                    case 1:
                        TargetSavingsTransactionHistoryFragment.a aVar2 = TargetSavingsTransactionHistoryFragment.f32549X;
                        View view2 = targetSavingsTransactionHistoryFragment.f27318b;
                        if (view2 != null) {
                            return (TransFilterLayout) view2.findViewById(Jc.c.layoutTransFilter);
                        }
                        return null;
                    default:
                        TargetSavingsTransactionHistoryFragment.a aVar3 = TargetSavingsTransactionHistoryFragment.f32549X;
                        View view3 = targetSavingsTransactionHistoryFragment.f27318b;
                        if (view3 != null) {
                            return (PpTitleBar) view3.findViewById(Jc.c.mtb);
                        }
                        return null;
                }
            }
        });
        final int i10 = 1;
        this.f32558o = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.l0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TargetSavingsTransactionHistoryFragment f32638b;

            {
                this.f32638b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TargetSavingsTransactionHistoryFragment targetSavingsTransactionHistoryFragment = this.f32638b;
                switch (i10) {
                    case 0:
                        TargetSavingsTransactionHistoryFragment.a aVar = TargetSavingsTransactionHistoryFragment.f32549X;
                        View view = targetSavingsTransactionHistoryFragment.f27318b;
                        if (view != null) {
                            return (SwipeRecyclerView) view.findViewById(Jc.c.billList);
                        }
                        return null;
                    case 1:
                        TargetSavingsTransactionHistoryFragment.a aVar2 = TargetSavingsTransactionHistoryFragment.f32549X;
                        View view2 = targetSavingsTransactionHistoryFragment.f27318b;
                        if (view2 != null) {
                            return (TransFilterLayout) view2.findViewById(Jc.c.layoutTransFilter);
                        }
                        return null;
                    default:
                        TargetSavingsTransactionHistoryFragment.a aVar3 = TargetSavingsTransactionHistoryFragment.f32549X;
                        View view3 = targetSavingsTransactionHistoryFragment.f27318b;
                        if (view3 != null) {
                            return (PpTitleBar) view3.findViewById(Jc.c.mtb);
                        }
                        return null;
                }
            }
        });
        final int i11 = 2;
        this.f32559p = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.l0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TargetSavingsTransactionHistoryFragment f32638b;

            {
                this.f32638b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TargetSavingsTransactionHistoryFragment targetSavingsTransactionHistoryFragment = this.f32638b;
                switch (i11) {
                    case 0:
                        TargetSavingsTransactionHistoryFragment.a aVar = TargetSavingsTransactionHistoryFragment.f32549X;
                        View view = targetSavingsTransactionHistoryFragment.f27318b;
                        if (view != null) {
                            return (SwipeRecyclerView) view.findViewById(Jc.c.billList);
                        }
                        return null;
                    case 1:
                        TargetSavingsTransactionHistoryFragment.a aVar2 = TargetSavingsTransactionHistoryFragment.f32549X;
                        View view2 = targetSavingsTransactionHistoryFragment.f27318b;
                        if (view2 != null) {
                            return (TransFilterLayout) view2.findViewById(Jc.c.layoutTransFilter);
                        }
                        return null;
                    default:
                        TargetSavingsTransactionHistoryFragment.a aVar3 = TargetSavingsTransactionHistoryFragment.f32549X;
                        View view3 = targetSavingsTransactionHistoryFragment.f27318b;
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
        TargetSavingsTransactionHistoryViewModel targetSavingsTransactionHistoryViewModel = (TargetSavingsTransactionHistoryViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar = targetSavingsTransactionHistoryViewModel != null ? targetSavingsTransactionHistoryViewModel.f32793o : null;
        if (lVar != null) {
            lVar.e(this, new Wd.I(new n0(this, 1), 26));
        }
        TargetSavingsTransactionHistoryViewModel targetSavingsTransactionHistoryViewModel2 = (TargetSavingsTransactionHistoryViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar2 = targetSavingsTransactionHistoryViewModel2 != null ? targetSavingsTransactionHistoryViewModel2.f32790g : null;
        if (lVar2 != null) {
            lVar2.e(this, new Wd.I(new T8.o(20, lVar2, this), 26));
        }
        TargetSavingsTransactionHistoryViewModel targetSavingsTransactionHistoryViewModel3 = (TargetSavingsTransactionHistoryViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar3 = targetSavingsTransactionHistoryViewModel3 != null ? targetSavingsTransactionHistoryViewModel3.f32794p : null;
        if (lVar3 != null) {
            lVar3.e(this, new Wd.I(new C1596s(lVar3, 3), 26));
        }
        TargetSavingsTransactionHistoryViewModel targetSavingsTransactionHistoryViewModel4 = (TargetSavingsTransactionHistoryViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar4 = targetSavingsTransactionHistoryViewModel4 != null ? targetSavingsTransactionHistoryViewModel4.f32791i : null;
        if (lVar4 == null) {
            return 0;
        }
        lVar4.e(this, new Wd.I(new n0(this, 0), 26));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        TransFilterLayout transFilterLayout = (TransFilterLayout) this.f32558o.getValue();
        if (transFilterLayout != null) {
            transFilterLayout.setBusinessType(1);
        }
        v(true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        View viewFindViewById;
        this.f32551B = (LinearLayout) this.f27318b.findViewById(Jc.c.ll_container_top);
        this.f32552C = (TextView) this.f27318b.findViewById(Jc.c.abl_month_tv);
        this.f32554L = (TextView) this.f27318b.findViewById(Jc.c.money_in_textViewSummary);
        this.f32555M = (TextView) this.f27318b.findViewById(Jc.c.money_out_textViewSummary);
        MonthPickDialog monthPickDialog = new MonthPickDialog(getActivity());
        this.t = monthPickDialog;
        monthPickDialog.setShowConfirmBtn(true);
        this.f32556Q = new C1599v(this, 2);
        PpTitleBar ppTitleBar = (PpTitleBar) this.f32559p.getValue();
        if (ppTitleBar != null) {
            final int i7 = 0;
            ppTitleBar.setBackButtonClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.m0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ TargetSavingsTransactionHistoryFragment f32642b;

                {
                    this.f32642b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TargetSavingsTransactionHistoryFragment targetSavingsTransactionHistoryFragment = this.f32642b;
                    switch (i7) {
                        case 0:
                            TargetSavingsTransactionHistoryFragment.a aVar = TargetSavingsTransactionHistoryFragment.f32549X;
                            androidx.fragment.app.E activity = targetSavingsTransactionHistoryFragment.getActivity();
                            if (activity != null) {
                                activity.finish();
                            }
                            break;
                        case 1:
                            TargetSavingsTransactionHistoryFragment.a aVar2 = TargetSavingsTransactionHistoryFragment.f32549X;
                            TransFilterLayout transFilterLayout = (TransFilterLayout) targetSavingsTransactionHistoryFragment.f32558o.getValue();
                            if (transFilterLayout != null) {
                                transFilterLayout.k();
                            }
                            break;
                        default:
                            TargetSavingsTransactionHistoryFragment.a aVar3 = TargetSavingsTransactionHistoryFragment.f32549X;
                            targetSavingsTransactionHistoryFragment.w();
                            break;
                    }
                }
            });
        }
        p355xf.t tVar = this.f32558o;
        TransFilterLayout transFilterLayout = (TransFilterLayout) tVar.getValue();
        if (transFilterLayout != null) {
            transFilterLayout.setOnSelectListener(new q0(this));
        }
        TransFilterLayout transFilterLayout2 = (TransFilterLayout) tVar.getValue();
        if (transFilterLayout2 != null && (viewFindViewById = transFilterLayout2.findViewById(p025ba.e.flFilter)) != null) {
            final int i10 = 1;
            viewFindViewById.setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.m0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ TargetSavingsTransactionHistoryFragment f32642b;

                {
                    this.f32642b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TargetSavingsTransactionHistoryFragment targetSavingsTransactionHistoryFragment = this.f32642b;
                    switch (i10) {
                        case 0:
                            TargetSavingsTransactionHistoryFragment.a aVar = TargetSavingsTransactionHistoryFragment.f32549X;
                            androidx.fragment.app.E activity = targetSavingsTransactionHistoryFragment.getActivity();
                            if (activity != null) {
                                activity.finish();
                            }
                            break;
                        case 1:
                            TargetSavingsTransactionHistoryFragment.a aVar2 = TargetSavingsTransactionHistoryFragment.f32549X;
                            TransFilterLayout transFilterLayout3 = (TransFilterLayout) targetSavingsTransactionHistoryFragment.f32558o.getValue();
                            if (transFilterLayout3 != null) {
                                transFilterLayout3.k();
                            }
                            break;
                        default:
                            TargetSavingsTransactionHistoryFragment.a aVar3 = TargetSavingsTransactionHistoryFragment.f32549X;
                            targetSavingsTransactionHistoryFragment.w();
                            break;
                    }
                }
            });
        }
        SwipeRecyclerView swipeRecyclerViewU = u();
        if (swipeRecyclerViewU != null) {
            swipeRecyclerViewU.setOnLoadListener(new r0(this));
        }
        com.palmpay.lib.bridgewrapper.photo.upload.a itemClickListener = new com.palmpay.lib.bridgewrapper.photo.upload.a(21);
        Nc.e eVar = this.f32560v;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(itemClickListener, "itemClickListener");
        eVar.f6314d = itemClickListener;
        eVar.f6315e = new Sd.b(this, 19);
        TextView textView = this.f32552C;
        if (textView != null) {
            final int i11 = 2;
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.m0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ TargetSavingsTransactionHistoryFragment f32642b;

                {
                    this.f32642b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TargetSavingsTransactionHistoryFragment targetSavingsTransactionHistoryFragment = this.f32642b;
                    switch (i11) {
                        case 0:
                            TargetSavingsTransactionHistoryFragment.a aVar = TargetSavingsTransactionHistoryFragment.f32549X;
                            androidx.fragment.app.E activity = targetSavingsTransactionHistoryFragment.getActivity();
                            if (activity != null) {
                                activity.finish();
                            }
                            break;
                        case 1:
                            TargetSavingsTransactionHistoryFragment.a aVar2 = TargetSavingsTransactionHistoryFragment.f32549X;
                            TransFilterLayout transFilterLayout3 = (TransFilterLayout) targetSavingsTransactionHistoryFragment.f32558o.getValue();
                            if (transFilterLayout3 != null) {
                                transFilterLayout3.k();
                            }
                            break;
                        default:
                            TargetSavingsTransactionHistoryFragment.a aVar3 = TargetSavingsTransactionHistoryFragment.f32549X;
                            targetSavingsTransactionHistoryFragment.w();
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
            recyclerView.addOnScrollListener(new p0(this));
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f32561w = Pa.r0.h0(jCurrentTimeMillis);
        int iN0 = Pa.r0.N0(jCurrentTimeMillis);
        this.f32550A = iN0;
        x(iN0, this.f32561w);
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
            monthPickDialog.setCallBack(this.f32556Q);
        }
    }

    public final SwipeRecyclerView u() {
        return (SwipeRecyclerView) this.f32557j.getValue();
    }

    public final void v(boolean z3) {
        QueryCashBoxStatReq queryCashBoxStatReq;
        if (z3) {
            this.f32553H = 0;
            if (SizeUtils.dp2px(20.0f) < 0) {
                LinearLayout linearLayout = this.f32551B;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
            } else {
                LinearLayout linearLayout2 = this.f32551B;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(8);
                }
            }
            TargetSavingsTransactionHistoryViewModel targetSavingsTransactionHistoryViewModel = (TargetSavingsTransactionHistoryViewModel) this.f27333i;
            if (targetSavingsTransactionHistoryViewModel != null && (queryCashBoxStatReq = targetSavingsTransactionHistoryViewModel.f32789f) != null) {
                queryCashBoxStatReq.setEndTime(t(this.f32550A, this.f32561w + 1));
            }
        }
        TargetSavingsTransactionHistoryViewModel targetSavingsTransactionHistoryViewModel2 = (TargetSavingsTransactionHistoryViewModel) this.f27333i;
        if (targetSavingsTransactionHistoryViewModel2 != null) {
            targetSavingsTransactionHistoryViewModel2.f(targetSavingsTransactionHistoryViewModel2.g(System.currentTimeMillis()), targetSavingsTransactionHistoryViewModel2.e(System.currentTimeMillis()));
            QueryCashBoxStatReq queryCashBoxStatReq2 = targetSavingsTransactionHistoryViewModel2.f32789f;
            if (z3) {
                queryCashBoxStatReq2.setPageNum(1);
            }
            queryCashBoxStatReq2.setPageSize(20);
            queryCashBoxStatReq2.setStartTime(-1L);
            AbstractC0780y.m(androidx.lifecycle.V.h(targetSavingsTransactionHistoryViewModel2), null, null, new Qc.m0(targetSavingsTransactionHistoryViewModel2, z3, null), 3);
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
        int i10 = this.f32561w;
        if (i10 <= 0 || (i7 = this.f32550A) <= 0 || (monthPickDialog = this.t) == null) {
            return;
        }
        monthPickDialog.setNowPickDate(i7, i10);
    }

    public final void x(int i7, int i10) {
        if (i10 <= 0 || this.f32552C == null) {
            return;
        }
        if (Pa.r0.N0(System.currentTimeMillis()) == i7) {
            TextView textView = this.f32552C;
            if (textView != null) {
                textView.setText(Pa.r0.i0(i10 - 1));
                return;
            }
            return;
        }
        TextView textView2 = this.f32552C;
        if (textView2 != null) {
            textView2.setText(Pa.r0.i0(i10 - 1) + " " + i7);
        }
    }
}

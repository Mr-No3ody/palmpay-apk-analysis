package com.transsnet.palmpay.ui.fragment;

import Ac.f;
import Ac.h;
import C9.C0144k;
import C9.Q;
import Ce.ViewOnClickListenerC0159a;
import Ce.g0;
import Ce.h0;
import L6.b;
import Pa.r0;
import Pe.C0533e;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmFragment;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.req.AccountFlowReq;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.core.dialog.MonthPickDialog;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.custom_view.model.ModelEmptyView;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.ui.fragment.MeBalanceStatementFragment;
import com.transsnet.palmpay.util.SizeUtils;
import com.transsnet.palmpay.viewmodule.BalanceViewModel;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p328ve.s;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/ui/fragment/MeBalanceStatementFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmFragment;", "Lcom/transsnet/palmpay/viewmodule/BalanceViewModel;", "Lcom/transsnet/palmpay/core/dialog/MonthPickDialog$CallBack;", "<init>", "()V", "a", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMeBalanceStatementFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeBalanceStatementFragment.kt\ncom/transsnet/palmpay/ui/fragment/MeBalanceStatementFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,320:1\n115#2,8:321\n145#2:329\n152#2:330\n169#2:331\n383#2:332\n401#2:333\n*S KotlinDebug\n*F\n+ 1 MeBalanceStatementFragment.kt\ncom/transsnet/palmpay/ui/fragment/MeBalanceStatementFragment\n*L\n174#1:321,8\n174#1:329\n184#1:330\n184#1:331\n217#1:332\n217#1:333\n*E\n"})
public final class MeBalanceStatementFragment extends BaseMvvmFragment<BalanceViewModel> implements MonthPickDialog.CallBack {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final a f35209Z = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public s f35210A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f35211B = "";

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f35212C = 1;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final int f35213H = 10;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f35214L = 12;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f35215M = 2022;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f35216Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public String f35217X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public String f35218Y;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f35219j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f35220o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f35221p;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f35222v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public MonthPickDialog f35223w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MeBalanceStatementFragment newInstance(@NotNull String type) {
            Intrinsics.checkNotNullParameter(type, "type");
            Bundle bundle = new Bundle();
            bundle.putString("TYPE_MONEY_TYPE", type);
            MeBalanceStatementFragment meBalanceStatementFragment = new MeBalanceStatementFragment();
            meBalanceStatementFragment.setArguments(bundle);
            return meBalanceStatementFragment;
        }

        private a() {
        }
    }

    public MeBalanceStatementFragment() {
        final int i7 = 0;
        this.f35219j = C2131j.b(new Function0(this) { // from class: Ce.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MeBalanceStatementFragment f1482b;

            {
                this.f1482b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MeBalanceStatementFragment meBalanceStatementFragment = this.f1482b;
                switch (i7) {
                    case 0:
                        MeBalanceStatementFragment.a aVar = MeBalanceStatementFragment.f35209Z;
                        View view = meBalanceStatementFragment.f27318b;
                        if (view != null) {
                            return (SwipeRecyclerView) view.findViewById(Ac.e.billList);
                        }
                        return null;
                    case 1:
                        MeBalanceStatementFragment.a aVar2 = MeBalanceStatementFragment.f35209Z;
                        View view2 = meBalanceStatementFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(Ac.e.tvOut);
                        }
                        return null;
                    case 2:
                        MeBalanceStatementFragment.a aVar3 = MeBalanceStatementFragment.f35209Z;
                        View view3 = meBalanceStatementFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(Ac.e.tvIn);
                        }
                        return null;
                    case 3:
                        MeBalanceStatementFragment.a aVar4 = MeBalanceStatementFragment.f35209Z;
                        View view4 = meBalanceStatementFragment.f27318b;
                        if (view4 != null) {
                            return (LinearLayout) view4.findViewById(Ac.e.summaryContainer);
                        }
                        return null;
                    default:
                        MeBalanceStatementFragment.a aVar5 = MeBalanceStatementFragment.f35209Z;
                        View view5 = meBalanceStatementFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(Ac.e.tvMonth);
                        }
                        return null;
                }
            }
        });
        final int i10 = 1;
        this.f35220o = C2131j.b(new Function0(this) { // from class: Ce.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MeBalanceStatementFragment f1482b;

            {
                this.f1482b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MeBalanceStatementFragment meBalanceStatementFragment = this.f1482b;
                switch (i10) {
                    case 0:
                        MeBalanceStatementFragment.a aVar = MeBalanceStatementFragment.f35209Z;
                        View view = meBalanceStatementFragment.f27318b;
                        if (view != null) {
                            return (SwipeRecyclerView) view.findViewById(Ac.e.billList);
                        }
                        return null;
                    case 1:
                        MeBalanceStatementFragment.a aVar2 = MeBalanceStatementFragment.f35209Z;
                        View view2 = meBalanceStatementFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(Ac.e.tvOut);
                        }
                        return null;
                    case 2:
                        MeBalanceStatementFragment.a aVar3 = MeBalanceStatementFragment.f35209Z;
                        View view3 = meBalanceStatementFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(Ac.e.tvIn);
                        }
                        return null;
                    case 3:
                        MeBalanceStatementFragment.a aVar4 = MeBalanceStatementFragment.f35209Z;
                        View view4 = meBalanceStatementFragment.f27318b;
                        if (view4 != null) {
                            return (LinearLayout) view4.findViewById(Ac.e.summaryContainer);
                        }
                        return null;
                    default:
                        MeBalanceStatementFragment.a aVar5 = MeBalanceStatementFragment.f35209Z;
                        View view5 = meBalanceStatementFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(Ac.e.tvMonth);
                        }
                        return null;
                }
            }
        });
        final int i11 = 2;
        this.f35221p = C2131j.b(new Function0(this) { // from class: Ce.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MeBalanceStatementFragment f1482b;

            {
                this.f1482b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MeBalanceStatementFragment meBalanceStatementFragment = this.f1482b;
                switch (i11) {
                    case 0:
                        MeBalanceStatementFragment.a aVar = MeBalanceStatementFragment.f35209Z;
                        View view = meBalanceStatementFragment.f27318b;
                        if (view != null) {
                            return (SwipeRecyclerView) view.findViewById(Ac.e.billList);
                        }
                        return null;
                    case 1:
                        MeBalanceStatementFragment.a aVar2 = MeBalanceStatementFragment.f35209Z;
                        View view2 = meBalanceStatementFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(Ac.e.tvOut);
                        }
                        return null;
                    case 2:
                        MeBalanceStatementFragment.a aVar3 = MeBalanceStatementFragment.f35209Z;
                        View view3 = meBalanceStatementFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(Ac.e.tvIn);
                        }
                        return null;
                    case 3:
                        MeBalanceStatementFragment.a aVar4 = MeBalanceStatementFragment.f35209Z;
                        View view4 = meBalanceStatementFragment.f27318b;
                        if (view4 != null) {
                            return (LinearLayout) view4.findViewById(Ac.e.summaryContainer);
                        }
                        return null;
                    default:
                        MeBalanceStatementFragment.a aVar5 = MeBalanceStatementFragment.f35209Z;
                        View view5 = meBalanceStatementFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(Ac.e.tvMonth);
                        }
                        return null;
                }
            }
        });
        final int i12 = 3;
        this.t = C2131j.b(new Function0(this) { // from class: Ce.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MeBalanceStatementFragment f1482b;

            {
                this.f1482b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MeBalanceStatementFragment meBalanceStatementFragment = this.f1482b;
                switch (i12) {
                    case 0:
                        MeBalanceStatementFragment.a aVar = MeBalanceStatementFragment.f35209Z;
                        View view = meBalanceStatementFragment.f27318b;
                        if (view != null) {
                            return (SwipeRecyclerView) view.findViewById(Ac.e.billList);
                        }
                        return null;
                    case 1:
                        MeBalanceStatementFragment.a aVar2 = MeBalanceStatementFragment.f35209Z;
                        View view2 = meBalanceStatementFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(Ac.e.tvOut);
                        }
                        return null;
                    case 2:
                        MeBalanceStatementFragment.a aVar3 = MeBalanceStatementFragment.f35209Z;
                        View view3 = meBalanceStatementFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(Ac.e.tvIn);
                        }
                        return null;
                    case 3:
                        MeBalanceStatementFragment.a aVar4 = MeBalanceStatementFragment.f35209Z;
                        View view4 = meBalanceStatementFragment.f27318b;
                        if (view4 != null) {
                            return (LinearLayout) view4.findViewById(Ac.e.summaryContainer);
                        }
                        return null;
                    default:
                        MeBalanceStatementFragment.a aVar5 = MeBalanceStatementFragment.f35209Z;
                        View view5 = meBalanceStatementFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(Ac.e.tvMonth);
                        }
                        return null;
                }
            }
        });
        final int i13 = 4;
        this.f35222v = C2131j.b(new Function0(this) { // from class: Ce.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MeBalanceStatementFragment f1482b;

            {
                this.f1482b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MeBalanceStatementFragment meBalanceStatementFragment = this.f1482b;
                switch (i13) {
                    case 0:
                        MeBalanceStatementFragment.a aVar = MeBalanceStatementFragment.f35209Z;
                        View view = meBalanceStatementFragment.f27318b;
                        if (view != null) {
                            return (SwipeRecyclerView) view.findViewById(Ac.e.billList);
                        }
                        return null;
                    case 1:
                        MeBalanceStatementFragment.a aVar2 = MeBalanceStatementFragment.f35209Z;
                        View view2 = meBalanceStatementFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(Ac.e.tvOut);
                        }
                        return null;
                    case 2:
                        MeBalanceStatementFragment.a aVar3 = MeBalanceStatementFragment.f35209Z;
                        View view3 = meBalanceStatementFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(Ac.e.tvIn);
                        }
                        return null;
                    case 3:
                        MeBalanceStatementFragment.a aVar4 = MeBalanceStatementFragment.f35209Z;
                        View view4 = meBalanceStatementFragment.f27318b;
                        if (view4 != null) {
                            return (LinearLayout) view4.findViewById(Ac.e.summaryContainer);
                        }
                        return null;
                    default:
                        MeBalanceStatementFragment.a aVar5 = MeBalanceStatementFragment.f35209Z;
                        View view5 = meBalanceStatementFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(Ac.e.tvMonth);
                        }
                        return null;
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return f.main_fragment_me_balance_statement;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        String string;
        TextView textView;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        int i7 = 4;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("TYPE_MONEY_TYPE")) == null) {
            string = "";
        }
        this.f35211B = string;
        this.f35210A = new s(requireContext());
        SwipeRecyclerView swipeRecyclerViewT = t();
        if (swipeRecyclerViewT != null && (recyclerView3 = swipeRecyclerViewT.getRecyclerView()) != null) {
            recyclerView3.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        }
        SwipeRecyclerView swipeRecyclerViewT2 = t();
        if (swipeRecyclerViewT2 != null && (recyclerView2 = swipeRecyclerViewT2.getRecyclerView()) != null) {
            recyclerView2.setItemViewCacheSize(4);
        }
        SwipeRecyclerView swipeRecyclerViewT3 = t();
        if (swipeRecyclerViewT3 != null) {
            swipeRecyclerViewT3.setRefreshEnable(true);
        }
        SwipeRecyclerView swipeRecyclerViewT4 = t();
        if (swipeRecyclerViewT4 != null) {
            swipeRecyclerViewT4.setLoadMoreEnable(true);
        }
        C1548f c1548f = new C1548f(requireContext().getColor(b.ppColorDividerLine), SizeUtils.dp2px(0.5f), SizeUtils.dp2px(15.0f), SizeUtils.dp2px(15.0f));
        c1548f.f31336e = false;
        SwipeRecyclerView swipeRecyclerViewT5 = t();
        if (swipeRecyclerViewT5 != null && (recyclerView = swipeRecyclerViewT5.getRecyclerView()) != null) {
            recyclerView.addItemDecoration(c1548f);
        }
        ModelEmptyView modelEmptyView = new ModelEmptyView(getContext());
        modelEmptyView.f31512c.setText(h.main_no_records);
        modelEmptyView.f31511b.setImageResource(r.cv_empty_no_transaction_history);
        SwipeRecyclerView swipeRecyclerViewT6 = t();
        if (swipeRecyclerViewT6 != null) {
            swipeRecyclerViewT6.setEmptyView(modelEmptyView);
        }
        SwipeRecyclerView swipeRecyclerViewT7 = t();
        if (swipeRecyclerViewT7 != null) {
            swipeRecyclerViewT7.setOnLoadListener(new h0(this));
        }
        SwipeRecyclerView swipeRecyclerViewT8 = t();
        if (swipeRecyclerViewT8 != null) {
            swipeRecyclerViewT8.setAdapter(this.f35210A);
        }
        s sVar = this.f35210A;
        if (sVar != null) {
            sVar.f4986c = new A8.a(this, 25);
        }
        MonthPickDialog monthPickDialog = new MonthPickDialog(requireContext());
        this.f35223w = monthPickDialog;
        monthPickDialog.setShowConfirmBtn(true);
        ViewOnClickListenerC0159a viewOnClickListenerC0159a = new ViewOnClickListenerC0159a(this, i7);
        t tVar = this.f35222v;
        p220oa.h.q(viewOnClickListenerC0159a, (TextView) tVar.getValue());
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f35214L = r0.h0(jCurrentTimeMillis);
        this.f35215M = r0.N0(jCurrentTimeMillis);
        if (this.f35214L > 0 && (textView = (TextView) tVar.getValue()) != null) {
            textView.setText(r0.i0(this.f35214L - 1));
        }
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        BalanceViewModel balanceViewModel = (BalanceViewModel) this.f27333i;
        l lVar = balanceViewModel != null ? balanceViewModel.f35351e : null;
        if (lVar != null) {
            lVar.e(this, new C0144k(new g0(this, 0), 11));
        }
        BalanceViewModel balanceViewModel2 = (BalanceViewModel) this.f27333i;
        l lVar2 = balanceViewModel2 != null ? balanceViewModel2.f35352f : null;
        if (lVar2 != null) {
            lVar2.e(this, new C0144k(new g0(this, 1), 11));
        }
        BalanceViewModel balanceViewModel3 = (BalanceViewModel) this.f27333i;
        l lVar3 = balanceViewModel3 != null ? balanceViewModel3.f35353g : null;
        if (lVar3 != null) {
            lVar3.e(this, new C0144k(new Q(3, lVar3, this), 11));
        }
        BalanceViewModel balanceViewModel4 = (BalanceViewModel) this.f27333i;
        if (balanceViewModel4 != null) {
            p140j8.f.s(balanceViewModel4, new C0533e(1, null), balanceViewModel4.f35351e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
        u();
    }

    @Override // com.transsnet.palmpay.core.dialog.MonthPickDialog.CallBack
    public final void onConfirmClick() {
        TextView textView;
        MonthPickDialog monthPickDialog = this.f35223w;
        int nowPickYear = monthPickDialog != null ? monthPickDialog.getNowPickYear() : 2022;
        MonthPickDialog monthPickDialog2 = this.f35223w;
        int nowPickMonth = monthPickDialog2 != null ? monthPickDialog2.getNowPickMonth() : 12;
        int i7 = this.f35215M;
        int i10 = this.f35214L;
        this.f35215M = nowPickYear;
        this.f35214L = nowPickMonth;
        if (i7 != nowPickMonth || i10 != nowPickYear) {
            this.f35212C = 1;
            u();
        }
        if (this.f35214L <= 0 || (textView = (TextView) this.f35222v.getValue()) == null) {
            return;
        }
        textView.setText(r0.i0(this.f35214L - 1));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        MonthPickDialog monthPickDialog = this.f35223w;
        if (monthPickDialog != null) {
            monthPickDialog.setCallBack(null);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        MonthPickDialog monthPickDialog = this.f35223w;
        if (monthPickDialog != null) {
            monthPickDialog.setCallBack(this);
        }
    }

    public final SwipeRecyclerView t() {
        return (SwipeRecyclerView) this.f35219j.getValue();
    }

    public final void u() {
        BalanceViewModel balanceViewModel;
        String balanceAccountId = this.f35217X;
        if (TextUtils.isEmpty(balanceAccountId)) {
            User user = BaseApplication.getInstance().getUser();
            balanceAccountId = user != null ? user.getBalanceAccountId() : null;
        }
        if (TextUtils.isEmpty(balanceAccountId) || (balanceViewModel = (BalanceViewModel) this.f27333i) == null) {
            return;
        }
        AccountFlowReq accountFlowReq = new AccountFlowReq();
        accountFlowReq.setAccountId(balanceAccountId);
        int i7 = this.f35215M;
        int i10 = this.f35214L;
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(i7, i10 - 1, 1);
        accountFlowReq.setBeginTime(calendar.getTimeInMillis());
        int i11 = this.f35215M;
        int i12 = this.f35214L;
        Calendar calendar2 = Calendar.getInstance();
        calendar2.clear();
        calendar2.set(i11, i12, 1);
        accountFlowReq.setEndTime(calendar2.getTimeInMillis());
        accountFlowReq.setPageNum(this.f35212C);
        accountFlowReq.setPageSize(this.f35213H);
        accountFlowReq.setDcType(this.f35211B);
        accountFlowReq.setTotalFlag(this.f35212C != 1 ? 0 : 1);
        balanceViewModel.d(accountFlowReq);
    }
}

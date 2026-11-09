package com.transsnet.palmpay.send_money.ui.fragment;

import A8.b;
import Ae.n;
import C0.G;
import Cd.i;
import Cd.j;
import F6.d;
import Pa.r0;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.camera.video.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.BaseMVPFragment;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.bean.bill.BillRsp;
import com.transsnet.palmpay.core.bean.bill.TransHistoryRsp;
import com.transsnet.palmpay.core.dialog.MonthPickDialog;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.custom_view.model.ModelEmptyView;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.send_money.contract.MoneyTransferHistoryContract;
import com.transsnet.palmpay.send_money.ui.fragment.MoneyTransferHistoryFragment;
import com.transsnet.palmpay.util.SizeUtils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p025ba.k;
import p159kd.e;
import p159kd.h;
import p255qd.f;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/sm/money_transfer_history_fragment")
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/fragment/MoneyTransferHistoryFragment;", "Lcom/transsnet/palmpay/core/base/BaseMVPFragment;", "Lqd/f;", "Lcom/transsnet/palmpay/send_money/contract/MoneyTransferHistoryContract$View;", "Lcom/transsnet/palmpay/core/dialog/MonthPickDialog$CallBack;", "<init>", "()V", "a", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMoneyTransferHistoryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MoneyTransferHistoryFragment.kt\ncom/transsnet/palmpay/send_money/ui/fragment/MoneyTransferHistoryFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,395:1\n1#2:396\n*E\n"})
public final class MoneyTransferHistoryFragment extends BaseMVPFragment<f> implements MoneyTransferHistoryContract.View, MonthPickDialog.CallBack {

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final /* synthetic */ int f33669X = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f33670A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f33671B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f33672C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public String f33673H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f33674L = 5;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f33675M = 2018;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f33676Q;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f33677j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f33678o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f33679p;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f33680v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public MonthPickDialog f33681w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MoneyTransferHistoryFragment newInstance(int i7) {
            MoneyTransferHistoryFragment moneyTransferHistoryFragment = new MoneyTransferHistoryFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("filter_type", i7);
            moneyTransferHistoryFragment.setArguments(bundle);
            return moneyTransferHistoryFragment;
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    public MoneyTransferHistoryFragment() {
        final int i7 = 0;
        this.f33677j = C2131j.b(new Function0(this) { // from class: Cd.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoneyTransferHistoryFragment f1367b;

            {
                this.f1367b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MoneyTransferHistoryFragment fragment = this.f1367b;
                switch (i7) {
                    case 0:
                        int i10 = MoneyTransferHistoryFragment.f33669X;
                        View view = fragment.f27318b;
                        if (view != null) {
                            return (LinearLayout) view.findViewById(p159kd.e.ll_month_top);
                        }
                        return null;
                    case 1:
                        int i11 = MoneyTransferHistoryFragment.f33669X;
                        View view2 = fragment.f27318b;
                        if (view2 != null) {
                            return (SwipeRecyclerView) view2.findViewById(p159kd.e.billList);
                        }
                        return null;
                    case 2:
                        int i12 = MoneyTransferHistoryFragment.f33669X;
                        LinearLayout linearLayoutV = fragment.v();
                        if (linearLayoutV != null) {
                            return (TextView) linearLayoutV.findViewById(p159kd.e.abl_month_tv);
                        }
                        return null;
                    case 3:
                        int i13 = MoneyTransferHistoryFragment.f33669X;
                        LinearLayout linearLayoutV2 = fragment.v();
                        if (linearLayoutV2 != null) {
                            return (TextView) linearLayoutV2.findViewById(p159kd.e.money_out_textViewSummary);
                        }
                        return null;
                    case 4:
                        int i14 = MoneyTransferHistoryFragment.f33669X;
                        LinearLayout linearLayoutV3 = fragment.v();
                        if (linearLayoutV3 != null) {
                            return (TextView) linearLayoutV3.findViewById(p159kd.e.money_in_textViewSummary);
                        }
                        return null;
                    default:
                        int i15 = MoneyTransferHistoryFragment.f33669X;
                        Context contextRequireContext = fragment.requireContext();
                        Intrinsics.checkNotNullParameter(fragment, "fragment");
                        p173ld.d dVar = new p173ld.d(contextRequireContext);
                        dVar.f39330e = fragment;
                        return dVar;
                }
            }
        });
        final int i10 = 1;
        this.f33678o = C2131j.b(new Function0(this) { // from class: Cd.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoneyTransferHistoryFragment f1367b;

            {
                this.f1367b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MoneyTransferHistoryFragment fragment = this.f1367b;
                switch (i10) {
                    case 0:
                        int i11 = MoneyTransferHistoryFragment.f33669X;
                        View view = fragment.f27318b;
                        if (view != null) {
                            return (LinearLayout) view.findViewById(p159kd.e.ll_month_top);
                        }
                        return null;
                    case 1:
                        int i12 = MoneyTransferHistoryFragment.f33669X;
                        View view2 = fragment.f27318b;
                        if (view2 != null) {
                            return (SwipeRecyclerView) view2.findViewById(p159kd.e.billList);
                        }
                        return null;
                    case 2:
                        int i13 = MoneyTransferHistoryFragment.f33669X;
                        LinearLayout linearLayoutV = fragment.v();
                        if (linearLayoutV != null) {
                            return (TextView) linearLayoutV.findViewById(p159kd.e.abl_month_tv);
                        }
                        return null;
                    case 3:
                        int i14 = MoneyTransferHistoryFragment.f33669X;
                        LinearLayout linearLayoutV2 = fragment.v();
                        if (linearLayoutV2 != null) {
                            return (TextView) linearLayoutV2.findViewById(p159kd.e.money_out_textViewSummary);
                        }
                        return null;
                    case 4:
                        int i15 = MoneyTransferHistoryFragment.f33669X;
                        LinearLayout linearLayoutV3 = fragment.v();
                        if (linearLayoutV3 != null) {
                            return (TextView) linearLayoutV3.findViewById(p159kd.e.money_in_textViewSummary);
                        }
                        return null;
                    default:
                        int i16 = MoneyTransferHistoryFragment.f33669X;
                        Context contextRequireContext = fragment.requireContext();
                        Intrinsics.checkNotNullParameter(fragment, "fragment");
                        p173ld.d dVar = new p173ld.d(contextRequireContext);
                        dVar.f39330e = fragment;
                        return dVar;
                }
            }
        });
        final int i11 = 2;
        this.f33679p = C2131j.b(new Function0(this) { // from class: Cd.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoneyTransferHistoryFragment f1367b;

            {
                this.f1367b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MoneyTransferHistoryFragment fragment = this.f1367b;
                switch (i11) {
                    case 0:
                        int i12 = MoneyTransferHistoryFragment.f33669X;
                        View view = fragment.f27318b;
                        if (view != null) {
                            return (LinearLayout) view.findViewById(p159kd.e.ll_month_top);
                        }
                        return null;
                    case 1:
                        int i13 = MoneyTransferHistoryFragment.f33669X;
                        View view2 = fragment.f27318b;
                        if (view2 != null) {
                            return (SwipeRecyclerView) view2.findViewById(p159kd.e.billList);
                        }
                        return null;
                    case 2:
                        int i14 = MoneyTransferHistoryFragment.f33669X;
                        LinearLayout linearLayoutV = fragment.v();
                        if (linearLayoutV != null) {
                            return (TextView) linearLayoutV.findViewById(p159kd.e.abl_month_tv);
                        }
                        return null;
                    case 3:
                        int i15 = MoneyTransferHistoryFragment.f33669X;
                        LinearLayout linearLayoutV2 = fragment.v();
                        if (linearLayoutV2 != null) {
                            return (TextView) linearLayoutV2.findViewById(p159kd.e.money_out_textViewSummary);
                        }
                        return null;
                    case 4:
                        int i16 = MoneyTransferHistoryFragment.f33669X;
                        LinearLayout linearLayoutV3 = fragment.v();
                        if (linearLayoutV3 != null) {
                            return (TextView) linearLayoutV3.findViewById(p159kd.e.money_in_textViewSummary);
                        }
                        return null;
                    default:
                        int i17 = MoneyTransferHistoryFragment.f33669X;
                        Context contextRequireContext = fragment.requireContext();
                        Intrinsics.checkNotNullParameter(fragment, "fragment");
                        p173ld.d dVar = new p173ld.d(contextRequireContext);
                        dVar.f39330e = fragment;
                        return dVar;
                }
            }
        });
        final int i12 = 3;
        this.t = C2131j.b(new Function0(this) { // from class: Cd.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoneyTransferHistoryFragment f1367b;

            {
                this.f1367b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MoneyTransferHistoryFragment fragment = this.f1367b;
                switch (i12) {
                    case 0:
                        int i13 = MoneyTransferHistoryFragment.f33669X;
                        View view = fragment.f27318b;
                        if (view != null) {
                            return (LinearLayout) view.findViewById(p159kd.e.ll_month_top);
                        }
                        return null;
                    case 1:
                        int i14 = MoneyTransferHistoryFragment.f33669X;
                        View view2 = fragment.f27318b;
                        if (view2 != null) {
                            return (SwipeRecyclerView) view2.findViewById(p159kd.e.billList);
                        }
                        return null;
                    case 2:
                        int i15 = MoneyTransferHistoryFragment.f33669X;
                        LinearLayout linearLayoutV = fragment.v();
                        if (linearLayoutV != null) {
                            return (TextView) linearLayoutV.findViewById(p159kd.e.abl_month_tv);
                        }
                        return null;
                    case 3:
                        int i16 = MoneyTransferHistoryFragment.f33669X;
                        LinearLayout linearLayoutV2 = fragment.v();
                        if (linearLayoutV2 != null) {
                            return (TextView) linearLayoutV2.findViewById(p159kd.e.money_out_textViewSummary);
                        }
                        return null;
                    case 4:
                        int i17 = MoneyTransferHistoryFragment.f33669X;
                        LinearLayout linearLayoutV3 = fragment.v();
                        if (linearLayoutV3 != null) {
                            return (TextView) linearLayoutV3.findViewById(p159kd.e.money_in_textViewSummary);
                        }
                        return null;
                    default:
                        int i18 = MoneyTransferHistoryFragment.f33669X;
                        Context contextRequireContext = fragment.requireContext();
                        Intrinsics.checkNotNullParameter(fragment, "fragment");
                        p173ld.d dVar = new p173ld.d(contextRequireContext);
                        dVar.f39330e = fragment;
                        return dVar;
                }
            }
        });
        final int i13 = 4;
        this.f33680v = C2131j.b(new Function0(this) { // from class: Cd.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoneyTransferHistoryFragment f1367b;

            {
                this.f1367b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MoneyTransferHistoryFragment fragment = this.f1367b;
                switch (i13) {
                    case 0:
                        int i14 = MoneyTransferHistoryFragment.f33669X;
                        View view = fragment.f27318b;
                        if (view != null) {
                            return (LinearLayout) view.findViewById(p159kd.e.ll_month_top);
                        }
                        return null;
                    case 1:
                        int i15 = MoneyTransferHistoryFragment.f33669X;
                        View view2 = fragment.f27318b;
                        if (view2 != null) {
                            return (SwipeRecyclerView) view2.findViewById(p159kd.e.billList);
                        }
                        return null;
                    case 2:
                        int i16 = MoneyTransferHistoryFragment.f33669X;
                        LinearLayout linearLayoutV = fragment.v();
                        if (linearLayoutV != null) {
                            return (TextView) linearLayoutV.findViewById(p159kd.e.abl_month_tv);
                        }
                        return null;
                    case 3:
                        int i17 = MoneyTransferHistoryFragment.f33669X;
                        LinearLayout linearLayoutV2 = fragment.v();
                        if (linearLayoutV2 != null) {
                            return (TextView) linearLayoutV2.findViewById(p159kd.e.money_out_textViewSummary);
                        }
                        return null;
                    case 4:
                        int i18 = MoneyTransferHistoryFragment.f33669X;
                        LinearLayout linearLayoutV3 = fragment.v();
                        if (linearLayoutV3 != null) {
                            return (TextView) linearLayoutV3.findViewById(p159kd.e.money_in_textViewSummary);
                        }
                        return null;
                    default:
                        int i19 = MoneyTransferHistoryFragment.f33669X;
                        Context contextRequireContext = fragment.requireContext();
                        Intrinsics.checkNotNullParameter(fragment, "fragment");
                        p173ld.d dVar = new p173ld.d(contextRequireContext);
                        dVar.f39330e = fragment;
                        return dVar;
                }
            }
        });
        final int i14 = 5;
        this.f33670A = C2131j.b(new Function0(this) { // from class: Cd.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoneyTransferHistoryFragment f1367b;

            {
                this.f1367b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MoneyTransferHistoryFragment fragment = this.f1367b;
                switch (i14) {
                    case 0:
                        int i15 = MoneyTransferHistoryFragment.f33669X;
                        View view = fragment.f27318b;
                        if (view != null) {
                            return (LinearLayout) view.findViewById(p159kd.e.ll_month_top);
                        }
                        return null;
                    case 1:
                        int i16 = MoneyTransferHistoryFragment.f33669X;
                        View view2 = fragment.f27318b;
                        if (view2 != null) {
                            return (SwipeRecyclerView) view2.findViewById(p159kd.e.billList);
                        }
                        return null;
                    case 2:
                        int i17 = MoneyTransferHistoryFragment.f33669X;
                        LinearLayout linearLayoutV = fragment.v();
                        if (linearLayoutV != null) {
                            return (TextView) linearLayoutV.findViewById(p159kd.e.abl_month_tv);
                        }
                        return null;
                    case 3:
                        int i18 = MoneyTransferHistoryFragment.f33669X;
                        LinearLayout linearLayoutV2 = fragment.v();
                        if (linearLayoutV2 != null) {
                            return (TextView) linearLayoutV2.findViewById(p159kd.e.money_out_textViewSummary);
                        }
                        return null;
                    case 4:
                        int i19 = MoneyTransferHistoryFragment.f33669X;
                        LinearLayout linearLayoutV3 = fragment.v();
                        if (linearLayoutV3 != null) {
                            return (TextView) linearLayoutV3.findViewById(p159kd.e.money_in_textViewSummary);
                        }
                        return null;
                    default:
                        int i110 = MoneyTransferHistoryFragment.f33669X;
                        Context contextRequireContext = fragment.requireContext();
                        Intrinsics.checkNotNullParameter(fragment, "fragment");
                        p173ld.d dVar = new p173ld.d(contextRequireContext);
                        dVar.f39330e = fragment;
                        return dVar;
                }
            }
        });
    }

    public final void A(int i7, int i10, BillRsp.DataBean.ExtDataBean bean) {
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(bean, "bean");
        List list = w().f4985b;
        Intrinsics.f(list, "null cannot be cast to non-null type kotlin.collections.List<com.transsnet.palmpay.core.bean.bill.TransHistoryRsp.DataBean.ListBean>");
        int size = list.size();
        boolean z3 = false;
        for (int i11 = 0; i11 < size; i11++) {
            TransHistoryRsp.DataBean.ListBean listBean = (TransHistoryRsp.DataBean.ListBean) list.get(i11);
            if (listBean.itemType == 1) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(listBean.updateTime);
                int i12 = calendar.get(1);
                long j6 = listBean.updateTime;
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(j6);
                if (calendar2.get(2) + 1 == i10 && i12 == i7 && (listBean.inComeAmount != bean.getInComeAmount() || listBean.payOutAmount != bean.getPayOutAmount())) {
                    listBean.inComeAmount = bean.getInComeAmount();
                    listBean.payOutAmount = bean.getPayOutAmount();
                    z3 = true;
                }
            }
        }
        if (z3) {
            SwipeRecyclerView swipeRecyclerViewU = u();
            if (swipeRecyclerViewU == null || (recyclerView = swipeRecyclerViewU.getRecyclerView()) == null || !recyclerView.isComputingLayout()) {
                w().notifyDataSetChanged();
                return;
            }
            SwipeRecyclerView swipeRecyclerViewU2 = u();
            if (swipeRecyclerViewU2 != null) {
                swipeRecyclerViewU2.post(new n(this, 6));
            }
        }
    }

    public final void B() {
        int i7;
        MonthPickDialog monthPickDialog;
        MonthPickDialog monthPickDialog2 = this.f33681w;
        if (monthPickDialog2 != null) {
            monthPickDialog2.show();
        }
        MonthPickDialog monthPickDialog3 = this.f33681w;
        if (monthPickDialog3 != null) {
            monthPickDialog3.setCanceledOnTouchOutside(true);
        }
        int i10 = this.f33674L;
        if (i10 <= 0 || (i7 = this.f33675M) <= 0 || (monthPickDialog = this.f33681w) == null) {
            return;
        }
        monthPickDialog.setNowPickDate(i7, i10);
    }

    public final void C() {
        d.h("Zenfer", 3, u.h(this.f33676Q, "smoothDistance = ", SizeUtils.dp2px(20.0f), " & dip20 = "));
        if (this.f33676Q > SizeUtils.dp2px(20.0f)) {
            LinearLayout linearLayoutV = v();
            if (linearLayoutV != null) {
                linearLayoutV.setVisibility(0);
                return;
            }
            return;
        }
        LinearLayout linearLayoutV2 = v();
        if (linearLayoutV2 != null) {
            linearLayoutV2.setVisibility(8);
        }
    }

    public final void D(int i7, int i10) {
        LinearLayout linearLayoutV = v();
        TextView textView = linearLayoutV != null ? (TextView) linearLayoutV.findViewById(e.abl_month_tv) : null;
        if (i10 <= 0 || textView == null) {
            return;
        }
        if (r0.N0(System.currentTimeMillis()) == i7) {
            textView.setText(r0.i0(i10 - 1));
            return;
        }
        textView.setText(r0.i0(i10 - 1) + " " + i7);
    }

    public final void E(TransHistoryRsp.DataBean.ListBean listBean) {
        if (listBean != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(listBean.updateTime);
            int i7 = calendar.get(2) + 1;
            int i10 = calendar.get(1);
            D(i10, i7);
            ((f) this.f27328i).getAmountSummary(i10, i7, this.f33673H, this.f33672C, this.f33671B);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return p159kd.f.sm_fragment_money_transfer_history;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        super.n();
        z(this.f33675M, this.f33674L, false);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        ARouter.getInstance().inject(this);
        C();
        SwipeRecyclerView swipeRecyclerViewU = u();
        if (swipeRecyclerViewU != null && (recyclerView3 = swipeRecyclerViewU.getRecyclerView()) != null) {
            recyclerView3.setLayoutManager(new LinearLayoutManager(getActivity(), 1, false));
        }
        SwipeRecyclerView swipeRecyclerViewU2 = u();
        if (swipeRecyclerViewU2 != null && (recyclerView2 = swipeRecyclerViewU2.getRecyclerView()) != null) {
            recyclerView2.setItemViewCacheSize(4);
        }
        SwipeRecyclerView swipeRecyclerViewU3 = u();
        if (swipeRecyclerViewU3 != null) {
            swipeRecyclerViewU3.setRefreshEnable(true);
        }
        SwipeRecyclerView swipeRecyclerViewU4 = u();
        if (swipeRecyclerViewU4 != null && (recyclerView = swipeRecyclerViewU4.getRecyclerView()) != null) {
            recyclerView.addOnScrollListener(new i(this));
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f33674L = r0.h0(jCurrentTimeMillis);
        int iN0 = r0.N0(jCurrentTimeMillis);
        this.f33675M = iN0;
        D(iN0, this.f33674L);
        MonthPickDialog monthPickDialog = new MonthPickDialog(getActivity());
        this.f33681w = monthPickDialog;
        monthPickDialog.setShowConfirmBtn(true);
        TextView textView = (TextView) this.f33679p.getValue();
        if (textView != null) {
            textView.setOnClickListener(new b(this, 26));
        }
        SwipeRecyclerView swipeRecyclerViewU5 = u();
        if (swipeRecyclerViewU5 != null) {
            swipeRecyclerViewU5.setOnLoadListener(new j(this));
        }
        SwipeRecyclerView swipeRecyclerViewU6 = u();
        if (swipeRecyclerViewU6 != null) {
            swipeRecyclerViewU6.setAdapter(w());
        }
        w().f4986c = new B8.d(this);
        SwipeRecyclerView swipeRecyclerViewU7 = u();
        if ((swipeRecyclerViewU7 != null ? swipeRecyclerViewU7.getEmptyView() : null) == null) {
            ModelEmptyView modelEmptyView = new ModelEmptyView(getActivity());
            modelEmptyView.f31511b.setImageResource(r.cv_empty_no_transaction_history);
            modelEmptyView.f31512c.setText(h.sm_no_collect_record_text);
            modelEmptyView.f31512c.setTextColor(requireContext().getColor(p159kd.b.sm_color_9076b6));
            SwipeRecyclerView swipeRecyclerViewU8 = u();
            if (swipeRecyclerViewU8 != null) {
                swipeRecyclerViewU8.setEmptyView(modelEmptyView);
            }
        }
        return 0;
    }

    @Override // com.transsnet.palmpay.core.dialog.MonthPickDialog.CallBack
    public final void onConfirmClick() {
        MonthPickDialog monthPickDialog = this.f33681w;
        Integer numValueOf = monthPickDialog != null ? Integer.valueOf(monthPickDialog.getNowPickYear()) : null;
        Intrinsics.e(numValueOf);
        int iIntValue = numValueOf.intValue();
        MonthPickDialog monthPickDialog2 = this.f33681w;
        Integer numValueOf2 = monthPickDialog2 != null ? Integer.valueOf(monthPickDialog2.getNowPickMonth()) : null;
        Intrinsics.e(numValueOf2);
        int iIntValue2 = numValueOf2.intValue();
        D(iIntValue, iIntValue2);
        if (this.f33674L != iIntValue2 || this.f33675M != iIntValue) {
            z(iIntValue, iIntValue2, false);
        }
        this.f33675M = iIntValue;
        this.f33674L = iIntValue2;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        MonthPickDialog monthPickDialog = this.f33681w;
        if (monthPickDialog != null) {
            monthPickDialog.setCallBack(null);
        }
        super.onDestroyView();
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        MonthPickDialog monthPickDialog = this.f33681w;
        if (monthPickDialog != null) {
            monthPickDialog.setCallBack(this);
        }
    }

    @Override // com.transsnet.palmpay.send_money.contract.MoneyTransferHistoryContract.View
    public final void showTransactionData(boolean z3, List list) {
        if (list != null && !list.isEmpty() && !z3) {
            E((TransHistoryRsp.DataBean.ListBean) list.get(0));
        }
        w().f4985b = list != null ? new ArrayList(list) : null;
        w().notifyDataSetChanged();
    }

    @Override // com.transsnet.palmpay.send_money.contract.MoneyTransferHistoryContract.View
    public final void stopLoadMore() {
        SwipeRecyclerView swipeRecyclerViewU = u();
        if (swipeRecyclerViewU != null) {
            swipeRecyclerViewU.setRefreshing(false);
        }
        SwipeRecyclerView swipeRecyclerViewU2 = u();
        if (swipeRecyclerViewU2 != null) {
            swipeRecyclerViewU2.c();
        }
        SwipeRecyclerView swipeRecyclerViewU3 = u();
        if (swipeRecyclerViewU3 != null) {
            swipeRecyclerViewU3.b(getString(k.core_list_end));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment
    public final IBasePresenter t() {
        return new f();
    }

    public final SwipeRecyclerView u() {
        return (SwipeRecyclerView) this.f33678o.getValue();
    }

    @Override // com.transsnet.palmpay.send_money.contract.MoneyTransferHistoryContract.View
    public final void updateTotalAmount(int i7, int i10, long j6, long j10, String key) {
        TextView textViewX;
        Intrinsics.checkNotNullParameter(key, "key");
        if (Intrinsics.c(i7 + "/" + i10 + "/" + this.f33673H + "/" + this.f33672C + "/" + this.f33671B, key)) {
            TextView textViewY = y();
            if (textViewY != null) {
                textViewY.setVisibility(0);
            }
            TextView textViewX2 = x();
            if (textViewX2 != null) {
                textViewX2.setVisibility(0);
            }
            int i11 = this.f33672C;
            if (i11 == 1) {
                TextView textViewY2 = y();
                if (textViewY2 != null) {
                    textViewY2.setVisibility(8);
                }
            } else if (i11 == 2 && (textViewX = x()) != null) {
                textViewX.setVisibility(8);
            }
            TextView textViewX3 = x();
            if (textViewX3 != null) {
                textViewX3.setText(G.i("In  ").setForegroundColor(requireContext().getColor(p159kd.b.sm_color_858a8f)).append(r0.B(j6, false)).create());
            }
            TextView textViewY3 = y();
            if (textViewY3 != null) {
                textViewY3.setText(G.i("Out  ").setForegroundColor(requireContext().getColor(p159kd.b.sm_color_858a8f)).append(r0.B(Math.abs(j10), false)).create());
            }
        }
    }

    public final LinearLayout v() {
        return (LinearLayout) this.f33677j.getValue();
    }

    public final p173ld.d w() {
        return (p173ld.d) this.f33670A.getValue();
    }

    public final TextView x() {
        return (TextView) this.f33680v.getValue();
    }

    public final TextView y() {
        return (TextView) this.t.getValue();
    }

    public final void z(int i7, int i10, boolean z3) {
        if (!z3) {
            this.f33676Q = 0;
            C();
        }
        ((f) this.f27328i).loadTransactionData(i7, i10, this.f33673H, this.f33672C, this.f33671B, z3);
    }
}

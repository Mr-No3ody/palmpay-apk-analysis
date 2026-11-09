package com.transsnet.palmpay.r2c.ui.activity;

import L6.b;
import Pa.r0;
import Pd.d;
import Rd.O;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.airtime.bean.R2CHistoryItemListBean;
import com.transsnet.palmpay.core.base.BaseMvvmVBActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.CommonListResult;
import com.transsnet.palmpay.custom_view.model.ModelEmptyView;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.managemoney.ui.view.c;
import com.transsnet.palmpay.r2c.viewmodel.Recharge2CashResultViewModel;
import com.transsnet.palmpay.teller.bean.HistoryOrderReq;
import io.fastkv.n;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p010a9.m;
import p052da.K;
import p059e1.a;
import p085fd.e;
import p140j8.f;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/r2c/ui/activity/Recharge2CashRecordActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBActivity;", "Lcom/transsnet/palmpay/r2c/viewmodel/Recharge2CashResultViewModel;", "LRd/O;", "<init>", "()V", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Recharge2CashRecordActivity extends BaseMvvmVBActivity<Recharge2CashResultViewModel, O> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f33127g = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f33128d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f33129e = 15;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f33130f = C2131j.b(new c(5));

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        p();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(CommonViewExtKt.colorInt(b.ppColorBackgroundLight, this));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity
    public final ViewBinding m() {
        View viewInflate = getLayoutInflater().inflate(d.qt_airtime_share_record, (ViewGroup) null, false);
        int i7 = Pd.c.cpi_loading;
        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) a.m(i7, viewInflate);
        if (circularProgressIndicator != null) {
            i7 = Pd.c.ry_history;
            RecyclerView recyclerView = (RecyclerView) a.m(i7, viewInflate);
            if (recyclerView != null) {
                i7 = Pd.c.srl_history;
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) a.m(i7, viewInflate);
                if (swipeRefreshLayout != null) {
                    i7 = Pd.c.titleBar;
                    if (((PpTitleBar) a.m(i7, viewInflate)) != null) {
                        O o10 = new O((LinearLayout) viewInflate, circularProgressIndicator, recyclerView, swipeRefreshLayout);
                        Intrinsics.checkNotNullExpressionValue(o10, "inflate(...)");
                        return o10;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    public final p069ed.c n() {
        return (p069ed.c) this.f33130f.getValue();
    }

    public final ArrayList o(CommonListResult.CommonList commonList, boolean z3) {
        List<T> list;
        List<Object> data;
        ArrayList arrayList = new ArrayList();
        if (commonList != null && (list = commonList.list) != 0) {
            int iJ0 = (z3 || (data = n().getData()) == null || data.isEmpty()) ? -1 : r0.j0(((R2CHistoryItemListBean) CollectionsKt.K(n().getData())).createTime);
            for (T t : list) {
                int iJ1 = r0.j0(t.createTime);
                if (iJ1 != iJ0) {
                    R2CHistoryItemListBean r2CHistoryItemListBean = new R2CHistoryItemListBean();
                    r2CHistoryItemListBean.createTime = t.createTime;
                    r2CHistoryItemListBean.itemType = 2;
                    arrayList.add(r2CHistoryItemListBean);
                    iJ0 = iJ1;
                }
                t.itemType = 1;
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public final void p() {
        l lVar;
        Recharge2CashResultViewModel recharge2CashResultViewModel = (Recharge2CashResultViewModel) l();
        if (Intrinsics.c((recharge2CashResultViewModel == null || (lVar = recharge2CashResultViewModel.f33139f) == null) ? null : (q) lVar.d(), o.f27359a)) {
            return;
        }
        this.f33128d = 1;
        Recharge2CashResultViewModel recharge2CashResultViewModel2 = (Recharge2CashResultViewModel) l();
        if (recharge2CashResultViewModel2 != null) {
            HistoryOrderReq req = new HistoryOrderReq(this.f33128d, this.f33129e);
            Intrinsics.checkNotNullParameter(req, "req");
            e eVar = new e(req, null);
            Boolean bool = Boolean.TRUE;
            l lVar2 = recharge2CashResultViewModel2.f33139f;
            lVar2.f27356m = bool;
            Unit unit = Unit.f38893a;
            f.v(recharge2CashResultViewModel2, eVar, lVar2, 0L);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        n.B(this, ((Recharge2CashResultViewModel) l()).f33139f, this, new Ba.a(this, 26), new m(this, 20), false, null, 224);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        O o10 = (O) this.f27334c;
        if (o10 != null) {
            o10.f8122c.setLayoutManager(new LinearLayoutManager(this, 1, false));
        }
        O o11 = (O) this.f27334c;
        if (o11 != null) {
            o11.f8122c.setAdapter(n());
        }
        n().getLoadMoreModule().getClass();
        n().getLoadMoreModule().f8647f = true;
        p069ed.c cVarN = n();
        ModelEmptyView modelEmptyView = new ModelEmptyView(this);
        modelEmptyView.f31511b.setImageResource(r.cv_empty_no_transaction_history);
        modelEmptyView.f31512c.setText(Pd.f.qt_no_history);
        modelEmptyView.f31512c.setTextColor(modelEmptyView.getContext().getResources().getColor(b.ppColorTextPrimary));
        cVarN.setEmptyView(modelEmptyView);
        S1.c loadMoreModule = n().getLoadMoreModule();
        K k2 = new K(this, 30);
        loadMoreModule.getClass();
        Intrinsics.checkNotNullParameter(k2, "<set-?>");
        loadMoreModule.f8646e = k2;
        n().getLoadMoreModule().setOnLoadMoreListener(new p054dd.l(this));
        O o12 = (O) this.f27334c;
        if (o12 != null) {
            o12.f8123d.setOnRefreshListener(new p054dd.l(this));
        }
    }
}

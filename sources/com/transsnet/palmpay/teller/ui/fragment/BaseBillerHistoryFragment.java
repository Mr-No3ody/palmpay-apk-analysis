package com.transsnet.palmpay.teller.ui.fragment;

import L6.b;
import M1.d;
import N8.C0463g;
import Pa.r0;
import Pd.f;
import Rd.e0;
import S1.c;
import Zd.C0798c;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.transsnet.palmpay.core.base.BaseMvvmVBFragment;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.CommonListResult;
import com.transsnet.palmpay.custom_view.model.ModelEmptyView;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.teller.bean.HistoryOrderReq;
import com.transsnet.palmpay.teller.bean.resp.BillerHistoryItemBean;
import com.transsnet.palmpay.teller.ui.fragment.BaseBillerHistoryFragment;
import com.transsnet.palmpay.teller.viewmodel.BillerHistoryViewModel;
import io.fastkv.n;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p052da.K;
import p086fe.G0;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/teller/ui/fragment/BaseBillerHistoryFragment;", "Lcom/transsnet/palmpay/teller/viewmodel/BillerHistoryViewModel;", "VM", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBFragment;", "LRd/e0;", "<init>", "()V", "a", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class BaseBillerHistoryFragment<VM extends BillerHistoryViewModel> extends BaseMvvmVBFragment<VM, e0> {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f34252v = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f34253o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f34254p;
    public int t = 1;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    public BaseBillerHistoryFragment() {
        final int i7 = 0;
        this.f34253o = C2131j.b(new Function0(this) { // from class: Zd.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BaseBillerHistoryFragment f11655b;

            {
                this.f11655b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String string;
                Bundle arguments;
                BaseBillerHistoryFragment baseBillerHistoryFragment = this.f11655b;
                switch (i7) {
                    case 0:
                        int i10 = BaseBillerHistoryFragment.f34252v;
                        Bundle arguments2 = baseBillerHistoryFragment.getArguments();
                        return (arguments2 == null || (string = arguments2.getString("key_history_category_id")) == null) ? "" : string;
                    default:
                        int i11 = BaseBillerHistoryFragment.f34252v;
                        Bundle arguments3 = baseBillerHistoryFragment.getArguments();
                        return Integer.valueOf(((arguments3 != null ? arguments3.getInt("key_history_page_size") : 0) <= 0 || (arguments = baseBillerHistoryFragment.getArguments()) == null) ? 10 : arguments.getInt("key_history_page_size"));
                }
            }
        });
        final int i10 = 1;
        this.f34254p = C2131j.b(new Function0(this) { // from class: Zd.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BaseBillerHistoryFragment f11655b;

            {
                this.f11655b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String string;
                Bundle arguments;
                BaseBillerHistoryFragment baseBillerHistoryFragment = this.f11655b;
                switch (i10) {
                    case 0:
                        int i11 = BaseBillerHistoryFragment.f34252v;
                        Bundle arguments2 = baseBillerHistoryFragment.getArguments();
                        return (arguments2 == null || (string = arguments2.getString("key_history_category_id")) == null) ? "" : string;
                    default:
                        int i12 = BaseBillerHistoryFragment.f34252v;
                        Bundle arguments3 = baseBillerHistoryFragment.getArguments();
                        return Integer.valueOf(((arguments3 != null ? arguments3.getInt("key_history_page_size") : 0) <= 0 || (arguments = baseBillerHistoryFragment.getArguments()) == null) ? 10 : arguments.getInt("key_history_page_size"));
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public int k() {
        x();
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public void n() {
        BillerHistoryViewModel billerHistoryViewModel = (BillerHistoryViewModel) this.f27333i;
        n.B(this, billerHistoryViewModel != null ? billerHistoryViewModel.f34418e : null, this, new Ba.a(this, 23), new C0463g(this, 28), false, null, 224);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public int o() {
        super.o();
        e0 e0Var = (e0) this.f27335j;
        if (e0Var != null) {
            e0Var.f8266c.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        }
        e0 e0Var2 = (e0) this.f27335j;
        if (e0Var2 != null) {
            e0Var2.f8266c.setAdapter(u());
        }
        u().getLoadMoreModule().getClass();
        u().getLoadMoreModule().f8647f = true;
        if (getContext() != null) {
            d dVarU = u();
            ModelEmptyView modelEmptyView = new ModelEmptyView(getActivity());
            modelEmptyView.f31511b.setImageResource(r.cv_empty_no_data);
            modelEmptyView.f31512c.setText(f.qt_no_history);
            modelEmptyView.f31512c.setTextColor(modelEmptyView.getContext().getResources().getColor(b.ppColorTextPrimary));
            dVarU.setEmptyView(modelEmptyView);
        }
        c loadMoreModule = u().getLoadMoreModule();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        K k2 = new K(contextRequireContext, 30);
        loadMoreModule.getClass();
        Intrinsics.checkNotNullParameter(k2, "<set-?>");
        loadMoreModule.f8646e = k2;
        u().getLoadMoreModule().setOnLoadMoreListener(new C0798c(this));
        e0 e0Var3 = (e0) this.f27335j;
        if (e0Var3 != null) {
            e0Var3.f8267d.setOnRefreshListener(new C0798c(this));
        }
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment
    public final ViewBinding t(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(Pd.d.qt_fragment_base_biller_history, viewGroup, false);
        int i7 = Pd.c.cpi_loading;
        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) p059e1.a.m(i7, viewInflate);
        if (circularProgressIndicator != null) {
            i7 = Pd.c.ry_history;
            RecyclerView recyclerView = (RecyclerView) p059e1.a.m(i7, viewInflate);
            if (recyclerView != null) {
                i7 = Pd.c.srl_history;
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) p059e1.a.m(i7, viewInflate);
                if (swipeRefreshLayout != null) {
                    e0 e0Var = new e0((LinearLayout) viewInflate, circularProgressIndicator, recyclerView, swipeRefreshLayout);
                    Intrinsics.checkNotNullExpressionValue(e0Var, "inflate(...)");
                    return e0Var;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    public abstract d u();

    public final String v() {
        return (String) this.f34253o.getValue();
    }

    public final ArrayList w(CommonListResult.CommonList commonList, boolean z3) {
        List<T> list;
        int iJ0;
        List<Object> data;
        ArrayList arrayList = new ArrayList();
        if (commonList != null && (list = commonList.list) != 0) {
            if (z3 || (data = u().getData()) == null || data.isEmpty()) {
                iJ0 = -1;
            } else {
                Long createTime = ((BillerHistoryItemBean) CollectionsKt.K(u().getData())).getCreateTime();
                iJ0 = r0.j0(createTime != null ? createTime.longValue() : 0L);
            }
            for (T t : list) {
                Long createTime2 = t.getCreateTime();
                if (createTime2 != null) {
                    int iJ1 = r0.j0(createTime2.longValue());
                    if (iJ1 != iJ0) {
                        arrayList.add(new BillerHistoryItemBean(null, null, null, null, null, null, null, null, t.getCreateTime(), null, null, null, null, null, null, null, null, null, null, null, null, 2, 2096895, null));
                        iJ0 = iJ1;
                    }
                    t.setItemType(1);
                    arrayList.add(t);
                }
            }
        }
        return arrayList;
    }

    public final void x() {
        l lVar;
        BillerHistoryViewModel billerHistoryViewModel = (BillerHistoryViewModel) this.f27333i;
        if (Intrinsics.c((billerHistoryViewModel == null || (lVar = billerHistoryViewModel.f34418e) == null) ? null : (q) lVar.d(), o.f27359a)) {
            return;
        }
        this.t = 1;
        BillerHistoryViewModel billerHistoryViewModel2 = (BillerHistoryViewModel) this.f27333i;
        if (billerHistoryViewModel2 != null) {
            HistoryOrderReq req = new HistoryOrderReq(v(), this.t, ((Number) this.f34254p.getValue()).intValue());
            Intrinsics.checkNotNullParameter(req, "req");
            G0 g7 = new G0(req, null);
            Boolean bool = Boolean.TRUE;
            l lVar2 = billerHistoryViewModel2.f34418e;
            lVar2.f27356m = bool;
            Unit unit = Unit.f38893a;
            p140j8.f.v(billerHistoryViewModel2, g7, lVar2, 0L);
        }
    }
}

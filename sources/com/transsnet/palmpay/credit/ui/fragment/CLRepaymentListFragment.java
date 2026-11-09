package com.transsnet.palmpay.credit.ui.fragment;

import C0.G;
import Oe.a;
import Ua.n0;
import Ya.e;
import Ya.f;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.base.BaseFragment;
import com.transsnet.palmpay.credit.bean.req.OLRepaymentListReq;
import com.transsnet.palmpay.credit.ui.fragment.CLRepaymentListFragment;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p071ef.b;
import p221ob.c;
import p351xb.v;
import p355xf.C2131j;
import p355xf.t;
import p382zb.C2172o;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/fragment/CLRepaymentListFragment;", "Lcom/transsnet/palmpay/core/base/BaseFragment;", "<init>", "()V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLRepaymentListFragment extends BaseFragment {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f30326i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f30327j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f30328o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public v f30329p;
    public int t = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f30330v = -1;

    public CLRepaymentListFragment() {
        final int i7 = 0;
        this.f30326i = C2131j.b(new Function0(this) { // from class: zb.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentListFragment f44607b;

            {
                this.f44607b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        View view = this.f44607b.f27318b;
                        if (view != null) {
                            return (RecyclerView) view.findViewById(e.repayment_rv);
                        }
                        return null;
                    default:
                        View view2 = this.f44607b.f27318b;
                        if (view2 != null) {
                            return view2.findViewById(e.layout_rv_empty);
                        }
                        return null;
                }
            }
        });
        final int i10 = 1;
        this.f30327j = C2131j.b(new Function0(this) { // from class: zb.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentListFragment f44607b;

            {
                this.f44607b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        View view = this.f44607b.f27318b;
                        if (view != null) {
                            return (RecyclerView) view.findViewById(e.repayment_rv);
                        }
                        return null;
                    default:
                        View view2 = this.f44607b.f27318b;
                        if (view2 != null) {
                            return view2.findViewById(e.layout_rv_empty);
                        }
                        return null;
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return f.cs_cl_repayment_list_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        t(true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        Context context = getContext();
        if (context != null) {
            this.f30328o = new ArrayList();
            ArrayList data = this.f30328o;
            if (data == null) {
                Intrinsics.n("mData");
                throw null;
            }
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            this.f30329p = new v(context, data);
            RecyclerView recyclerViewU = u();
            if (recyclerViewU != null) {
                recyclerViewU.setLayoutManager(new LinearLayoutManager(context, 1, false));
            }
            RecyclerView recyclerViewU2 = u();
            if (recyclerViewU2 != null) {
                v vVar = this.f30329p;
                if (vVar == null) {
                    Intrinsics.n("mAdapter");
                    throw null;
                }
                recyclerViewU2.setAdapter(vVar);
            }
        }
        RecyclerView recyclerViewU3 = u();
        if (recyclerViewU3 != null) {
            recyclerViewU3.addOnScrollListener(new C2172o(this));
        }
        v vVar2 = this.f30329p;
        if (vVar2 == null) {
            Intrinsics.n("mAdapter");
            throw null;
        }
        a itemClickListener = new a(this, 29);
        Intrinsics.checkNotNullParameter(itemClickListener, "itemClickListener");
        vVar2.f4993c = itemClickListener;
        return 0;
    }

    public final void t(boolean z3) {
        if (z3) {
            this.t = 1;
        } else {
            this.t++;
        }
        G.h(c.f40268a).clGetRepaymentList(new OLRepaymentListReq(null, null, "2,4,26,27", Integer.valueOf(this.t), 100, null, 32, null)).k(p298tf.f.f42629b).i(b.a()).subscribe(new n0(this, z3, 6));
    }

    public final RecyclerView u() {
        return (RecyclerView) this.f30326i.getValue();
    }
}

package com.transsnet.palmpay.credit.ui.fragment;

import C0.G;
import Ua.n0;
import Ya.e;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.base.BaseFragment;
import com.transsnet.palmpay.credit.bean.req.CLHistoryBillReq;
import com.transsnet.palmpay.credit.ui.fragment.CLBorrowListFragment;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p071ef.b;
import p221ob.c;
import p351xb.f;
import p355xf.C2131j;
import p355xf.t;
import p382zb.C2160c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/fragment/CLBorrowListFragment;", "Lcom/transsnet/palmpay/core/base/BaseFragment;", "<init>", "()V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLBorrowListFragment extends BaseFragment {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f30233i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f30234j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f30235o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public f f30236p;
    public int t = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f30237v = -1;

    public CLBorrowListFragment() {
        final int i7 = 0;
        this.f30233i = C2131j.b(new Function0(this) { // from class: zb.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowListFragment f44567b;

            {
                this.f44567b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        View view = this.f44567b.f27318b;
                        if (view != null) {
                            return view.findViewById(e.layout_rv_empty);
                        }
                        return null;
                    default:
                        View view2 = this.f44567b.f27318b;
                        if (view2 != null) {
                            return (RecyclerView) view2.findViewById(e.borrow_list_rv);
                        }
                        return null;
                }
            }
        });
        final int i10 = 1;
        this.f30234j = C2131j.b(new Function0(this) { // from class: zb.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowListFragment f44567b;

            {
                this.f44567b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        View view = this.f44567b.f27318b;
                        if (view != null) {
                            return view.findViewById(e.layout_rv_empty);
                        }
                        return null;
                    default:
                        View view2 = this.f44567b.f27318b;
                        if (view2 != null) {
                            return (RecyclerView) view2.findViewById(e.borrow_list_rv);
                        }
                        return null;
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return Ya.f.cs_cl_borrow_list_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        u(true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        Context context = getContext();
        if (context != null) {
            this.f30235o = new ArrayList();
            ArrayList data = this.f30235o;
            if (data == null) {
                Intrinsics.n("mData");
                throw null;
            }
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            this.f30236p = new f(context, data);
            RecyclerView recyclerViewT = t();
            if (recyclerViewT != null) {
                recyclerViewT.setLayoutManager(new LinearLayoutManager(context, 1, false));
            }
            RecyclerView recyclerViewT2 = t();
            if (recyclerViewT2 != null) {
                f fVar = this.f30236p;
                if (fVar == null) {
                    Intrinsics.n("mAdapter");
                    throw null;
                }
                recyclerViewT2.setAdapter(fVar);
            }
        }
        RecyclerView recyclerViewT3 = t();
        if (recyclerViewT3 != null) {
            recyclerViewT3.addOnScrollListener(new C2160c(this));
        }
        f fVar2 = this.f30236p;
        if (fVar2 == null) {
            Intrinsics.n("mAdapter");
            throw null;
        }
        org.greenrobot.eventbus.f itemClickListener = new org.greenrobot.eventbus.f(this, 24);
        Intrinsics.checkNotNullParameter(itemClickListener, "itemClickListener");
        fVar2.f4993c = itemClickListener;
        return 0;
    }

    public final RecyclerView t() {
        return (RecyclerView) this.f30234j.getValue();
    }

    public final void u(boolean z3) {
        if (z3) {
            this.t = 1;
        } else {
            this.t++;
        }
        G.h(c.f40268a).clQueryHistoryBillList(new CLHistoryBillReq(Integer.valueOf(this.t), 100)).k(p298tf.f.f42629b).i(b.a()).subscribe(new n0(this, z3, 5));
    }
}

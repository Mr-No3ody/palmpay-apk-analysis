package com.transsnet.palmpay.teller.ui.fragment;

import C0.C0127t;
import M1.j;
import Pd.c;
import Pd.d;
import Zd.D;
import Zd.F;
import Zd.G;
import Zd.I;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Observer;
import androidx.lifecycle.b0;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.base.BaseMvvmFragment;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.BillQuickAccessBean;
import com.transsnet.palmpay.core.bean.BillerAccessItem;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.viewmodel.ModelBillQuickAccessItem;
import com.transsnet.palmpay.custom_view.CatchCrashStaggeredGridLayoutManager;
import com.transsnet.palmpay.custom_view.E;
import com.transsnet.palmpay.teller.bean.TvItemTipsBean;
import com.transsnet.palmpay.teller.bean.TvListByCategoryIdResp;
import com.transsnet.palmpay.teller.ui.fragment.TvPaymentListFragment;
import com.transsnet.palmpay.teller.viewmodel.BillQuickAccessDataViewModel;
import com.transsnet.palmpay.util.SizeUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p002a.a;
import p086fe.U0;
import p355xf.C2131j;
import p355xf.EnumC2132k;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/teller/ui/fragment/TvPaymentListFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmFragment;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "<init>", "()V", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTvPaymentListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TvPaymentListFragment.kt\ncom/transsnet/palmpay/teller/ui/fragment/TvPaymentListFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,236:1\n106#2,15:237\n106#2,15:252\n1869#3:267\n295#3,2:268\n1870#3:270\n1#4:271\n*S KotlinDebug\n*F\n+ 1 TvPaymentListFragment.kt\ncom/transsnet/palmpay/teller/ui/fragment/TvPaymentListFragment\n*L\n39#1:237,15\n40#1:252,15\n218#1:267\n219#1:268,2\n218#1:270\n*E\n"})
public final class TvPaymentListFragment extends BaseMvvmFragment<BaseViewModel> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ModelBillQuickAccessItem f34315j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b0 f34316o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b0 f34317p;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f34318v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f34319w;

    public TvPaymentListFragment() {
        G g7 = new G(this, 0);
        EnumC2132k enumC2132k = EnumC2132k.f43971c;
        Lazy lazyA = C2131j.a(enumC2132k, new C0127t(g7, 9));
        this.f34316o = a.h(this, kotlin.jvm.internal.G.a(BillQuickAccessDataViewModel.class), new D(lazyA, 4), new D(lazyA, 5), new I(this, lazyA, 0));
        Lazy lazyA2 = C2131j.a(enumC2132k, new C0127t(new G(this, 1), 10));
        this.f34317p = a.h(this, kotlin.jvm.internal.G.a(U0.class), new D(lazyA2, 6), new D(lazyA2, 7), new I(this, lazyA2, 1));
        this.t = C2131j.b(new G(this, 2));
        C2131j.b(new G(this, 3));
        this.f34318v = C2131j.b(new G(this, 4));
        this.f34319w = C2131j.b(new Pa.b0(29));
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return d.qt_fragment_tv_payment_list;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        q qVar;
        ArrayList<TvListByCategoryIdResp.TvItemChildBean> itemList;
        TvListByCategoryIdResp.TvCategoryBean tvCategoryBean = (TvListByCategoryIdResp.TvCategoryBean) this.f34318v.getValue();
        if (tvCategoryBean == null || (itemList = tvCategoryBean.getItemList()) == null) {
            j.setDiffNewData$default(t(), new ArrayList(), null, 2, null);
        } else {
            j.setDiffNewData$default(t(), itemList, null, 2, null);
        }
        b0 b0Var = this.f34317p;
        U0 u6 = (U0) b0Var.getValue();
        String operatorId = (String) this.t.getValue();
        u6.getClass();
        Intrinsics.checkNotNullParameter(operatorId, "operatorId");
        Map map = (Map) u6.f36586d.d();
        ArrayList arrayList = map != null ? (ArrayList) map.get(operatorId) : null;
        if (arrayList != null) {
            u(arrayList);
        }
        final int i7 = 0;
        ((U0) b0Var.getValue()).f36586d.e(this, new Observer(this) { // from class: Zd.H

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TvPaymentListFragment f11648b;

            {
                this.f11648b = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                switch (i7) {
                    case 0:
                        TvPaymentListFragment tvPaymentListFragment = this.f11648b;
                        ArrayList arrayList2 = (ArrayList) ((Map) obj).get((String) tvPaymentListFragment.t.getValue());
                        if (arrayList2 != null) {
                            tvPaymentListFragment.u(arrayList2);
                        }
                        break;
                    default:
                        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                        Intrinsics.checkNotNullParameter(it, "it");
                        this.f11648b.v(it);
                        break;
                }
            }
        });
        b0 b0Var2 = this.f34316o;
        l lVar = ((BillQuickAccessDataViewModel) b0Var2.getValue()).f34417e;
        if (lVar != null && (qVar = (q) lVar.d()) != null) {
            v(qVar);
        }
        final int i10 = 1;
        ((BillQuickAccessDataViewModel) b0Var2.getValue()).f34417e.e(this, new Observer(this) { // from class: Zd.H

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TvPaymentListFragment f11648b;

            {
                this.f11648b = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                switch (i10) {
                    case 0:
                        TvPaymentListFragment tvPaymentListFragment = this.f11648b;
                        ArrayList arrayList2 = (ArrayList) ((Map) obj).get((String) tvPaymentListFragment.t.getValue());
                        if (arrayList2 != null) {
                            tvPaymentListFragment.u(arrayList2);
                        }
                        break;
                    default:
                        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                        Intrinsics.checkNotNullParameter(it, "it");
                        this.f11648b.v(it);
                        break;
                }
            }
        });
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        super.o();
        Context context = getContext();
        if (context != null) {
            RecyclerView recyclerView = (RecyclerView) this.f27318b.findViewById(c.ry_payment_list);
            Intrinsics.checkNotNullParameter(context, "context");
            recyclerView.setLayoutManager(new CatchCrashStaggeredGridLayoutManager(2, 1));
            recyclerView.addItemDecoration(new E(SizeUtils.dp2px(10.0f)));
            recyclerView.setAdapter(t());
            View viewInflate = LayoutInflater.from(getContext()).inflate(d.qt_item_tv_foot, (ViewGroup) null);
            ModelBillQuickAccessItem modelBillQuickAccessItem = (ModelBillQuickAccessItem) viewInflate.findViewById(c.model_quick_access_item);
            this.f34315j = modelBillQuickAccessItem;
            if (modelBillQuickAccessItem != null) {
                modelBillQuickAccessItem.b("17", m());
            }
            t().setEmptyView(d.qt_fragment_data_bundle_wallet_empty);
            j.addFooterView$default(t(), viewInflate, 0, 0, 6, null);
            t().setOnItemClickListener(new F(this));
            t().setOnItemChildClickListener(new F(this));
        }
        return 0;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        String string;
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putString("operatorCode", (String) this.t.getValue());
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("listJson")) == null || string.length() <= 0) {
            return;
        }
        outState.putString("listJson", string);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (bundle != null) {
            Bundle arguments = getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            Bundle bundle2 = new Bundle(arguments);
            String string = bundle.getString("operatorCode");
            if (string != null && string.length() > 0) {
                bundle2.putString("operatorCode", string);
            }
            String string2 = bundle.getString("listJson");
            if (string2 != null && string2.length() > 0) {
                bundle2.putString("listJson", string2);
            }
            setArguments(bundle2);
        }
    }

    public final Xd.D t() {
        return (Xd.D) this.f34319w.getValue();
    }

    public final void u(ArrayList arrayList) {
        Object next;
        Iterator<T> it = t().getData().iterator();
        while (it.hasNext()) {
            TvListByCategoryIdResp.TvItemChildBean tvItemChildBean = (TvListByCategoryIdResp.TvItemChildBean) it.next();
            Iterator it2 = arrayList.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!Intrinsics.c(((TvItemTipsBean) next).getPaymentItemId(), tvItemChildBean.getItemId()));
            TvItemTipsBean tvItemTipsBean = (TvItemTipsBean) next;
            if (tvItemTipsBean != null) {
                tvItemChildBean.setRemark(tvItemTipsBean.getRemark());
            } else {
                tvItemChildBean.setRemark("");
            }
        }
        t().notifyDataSetChanged();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v(q qVar) {
        CommonBeanResult commonBeanResult;
        BillQuickAccessBean billQuickAccessBean;
        List<BillerAccessItem> list;
        ModelBillQuickAccessItem modelBillQuickAccessItem;
        if (qVar instanceof p) {
            p pVar = (p) qVar;
            CommonBeanResult commonBeanResult2 = (CommonBeanResult) pVar.f27360a;
            if (commonBeanResult2 == null || !commonBeanResult2.isSuccess() || (commonBeanResult = (CommonBeanResult) pVar.f27360a) == null || (billQuickAccessBean = (BillQuickAccessBean) commonBeanResult.data) == null || (list = billQuickAccessBean.list) == null || !(!list.isEmpty()) || (modelBillQuickAccessItem = this.f34315j) == null) {
                return;
            }
            CommonBeanResult commonBeanResult3 = (CommonBeanResult) pVar.f27360a;
            modelBillQuickAccessItem.c(commonBeanResult3 != null ? (BillQuickAccessBean) commonBeanResult3.data : null);
        }
    }
}

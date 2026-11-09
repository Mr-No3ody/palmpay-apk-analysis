package com.transsnet.palmpay.managemoney.ui.fragment;

import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsnet.palmpay.managemoney.ui.fragment.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1602y implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CashBoxTransactionHistoryFragment f32683b;

    public /* synthetic */ C1602y(CashBoxTransactionHistoryFragment cashBoxTransactionHistoryFragment, int i7) {
        this.f32682a = i7;
        this.f32683b = cashBoxTransactionHistoryFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List list;
        RecyclerView recyclerView;
        CashBoxTransactionHistoryFragment cashBoxTransactionHistoryFragment = this.f32683b;
        switch (this.f32682a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it instanceof com.transsnet.palmpay.core.base.p) {
                        List list2 = (List) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                        Nc.e eVar = cashBoxTransactionHistoryFragment.f32440v;
                        List list3 = eVar.f6313c;
                        if (list3 == null || list3.isEmpty() || (list = list2) == null || list.isEmpty()) {
                            eVar.f6313c = list2;
                            eVar.notifyDataSetChanged();
                        } else {
                            DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new C1603z(eVar.f6313c, list2), true);
                            Intrinsics.checkNotNullExpressionValue(diffResultCalculateDiff, "calculateDiff(...)");
                            eVar.f6313c = list2;
                            diffResultCalculateDiff.dispatchUpdatesTo(eVar);
                        }
                    } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
                        ((com.transsnet.palmpay.core.base.n) it).getClass();
                    }
                }
                return Unit.f38893a;
            default:
                if (obj != null) {
                    if (((Boolean) obj).booleanValue()) {
                        CashBoxTransactionHistoryFragment.a aVar = CashBoxTransactionHistoryFragment.f32428Y;
                        SwipeRecyclerView swipeRecyclerViewU = cashBoxTransactionHistoryFragment.u();
                        if (swipeRecyclerViewU != null) {
                            swipeRecyclerViewU.setRefreshing(false);
                        }
                        SwipeRecyclerView swipeRecyclerViewU2 = cashBoxTransactionHistoryFragment.u();
                        if (swipeRecyclerViewU2 != null && (recyclerView = swipeRecyclerViewU2.getRecyclerView()) != null) {
                            recyclerView.scrollToPosition(0);
                        }
                    }
                    CashBoxTransactionHistoryFragment.a aVar2 = CashBoxTransactionHistoryFragment.f32428Y;
                    SwipeRecyclerView swipeRecyclerViewU3 = cashBoxTransactionHistoryFragment.u();
                    if (swipeRecyclerViewU3 != null) {
                        swipeRecyclerViewU3.c();
                    }
                    SwipeRecyclerView swipeRecyclerViewU4 = cashBoxTransactionHistoryFragment.u();
                    if (swipeRecyclerViewU4 != null) {
                        swipeRecyclerViewU4.b("--- End ---");
                    }
                }
                return Unit.f38893a;
        }
    }
}

package com.transsnet.palmpay.managemoney.ui.fragment;

import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class I implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FundTransactionHistoryFragment f32478b;

    public /* synthetic */ I(FundTransactionHistoryFragment fundTransactionHistoryFragment, int i7) {
        this.f32477a = i7;
        this.f32478b = fundTransactionHistoryFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List list;
        RecyclerView recyclerView;
        FundTransactionHistoryFragment fundTransactionHistoryFragment = this.f32478b;
        switch (this.f32477a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it instanceof com.transsnet.palmpay.core.base.p) {
                        List list2 = (List) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                        Nc.k kVar = fundTransactionHistoryFragment.f32471v;
                        List list3 = kVar.f6331b;
                        if (list3 == null || list3.isEmpty() || (list = list2) == null || list.isEmpty()) {
                            kVar.f6331b = list2;
                            kVar.notifyDataSetChanged();
                        } else {
                            DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new J(kVar.f6331b, list2), true);
                            Intrinsics.checkNotNullExpressionValue(diffResultCalculateDiff, "calculateDiff(...)");
                            kVar.f6331b = list2;
                            diffResultCalculateDiff.dispatchUpdatesTo(kVar);
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
                        FundTransactionHistoryFragment.a aVar = FundTransactionHistoryFragment.f32458Z;
                        SwipeRecyclerView swipeRecyclerViewU = fundTransactionHistoryFragment.u();
                        if (swipeRecyclerViewU != null) {
                            swipeRecyclerViewU.setRefreshing(false);
                        }
                        SwipeRecyclerView swipeRecyclerViewU2 = fundTransactionHistoryFragment.u();
                        if (swipeRecyclerViewU2 != null && (recyclerView = swipeRecyclerViewU2.getRecyclerView()) != null) {
                            recyclerView.scrollToPosition(0);
                        }
                    }
                    FundTransactionHistoryFragment.a aVar2 = FundTransactionHistoryFragment.f32458Z;
                    SwipeRecyclerView swipeRecyclerViewU3 = fundTransactionHistoryFragment.u();
                    if (swipeRecyclerViewU3 != null) {
                        swipeRecyclerViewU3.c();
                    }
                    SwipeRecyclerView swipeRecyclerViewU4 = fundTransactionHistoryFragment.u();
                    if (swipeRecyclerViewU4 != null) {
                        swipeRecyclerViewU4.b("--- End ---");
                    }
                }
                return Unit.f38893a;
        }
    }
}

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
public final class n0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TargetSavingsTransactionHistoryFragment f32646b;

    public /* synthetic */ n0(TargetSavingsTransactionHistoryFragment targetSavingsTransactionHistoryFragment, int i7) {
        this.f32645a = i7;
        this.f32646b = targetSavingsTransactionHistoryFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List list;
        RecyclerView recyclerView;
        TargetSavingsTransactionHistoryFragment targetSavingsTransactionHistoryFragment = this.f32646b;
        switch (this.f32645a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it instanceof com.transsnet.palmpay.core.base.p) {
                        List list2 = (List) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                        Nc.e eVar = targetSavingsTransactionHistoryFragment.f32560v;
                        List list3 = eVar.f6313c;
                        if (list3 == null || list3.isEmpty() || (list = list2) == null || list.isEmpty()) {
                            eVar.f6313c = list2;
                            eVar.notifyDataSetChanged();
                        } else {
                            DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new o0(eVar.f6313c, list2), true);
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
                        TargetSavingsTransactionHistoryFragment.a aVar = TargetSavingsTransactionHistoryFragment.f32549X;
                        SwipeRecyclerView swipeRecyclerViewU = targetSavingsTransactionHistoryFragment.u();
                        if (swipeRecyclerViewU != null) {
                            swipeRecyclerViewU.setRefreshing(false);
                        }
                        SwipeRecyclerView swipeRecyclerViewU2 = targetSavingsTransactionHistoryFragment.u();
                        if (swipeRecyclerViewU2 != null && (recyclerView = swipeRecyclerViewU2.getRecyclerView()) != null) {
                            recyclerView.scrollToPosition(0);
                        }
                    }
                    TargetSavingsTransactionHistoryFragment.a aVar2 = TargetSavingsTransactionHistoryFragment.f32549X;
                    SwipeRecyclerView swipeRecyclerViewU3 = targetSavingsTransactionHistoryFragment.u();
                    if (swipeRecyclerViewU3 != null) {
                        swipeRecyclerViewU3.c();
                    }
                    SwipeRecyclerView swipeRecyclerViewU4 = targetSavingsTransactionHistoryFragment.u();
                    if (swipeRecyclerViewU4 != null) {
                        swipeRecyclerViewU4.b("--- End ---");
                    }
                }
                return Unit.f38893a;
        }
    }
}

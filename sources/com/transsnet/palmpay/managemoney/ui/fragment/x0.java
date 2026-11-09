package com.transsnet.palmpay.managemoney.ui.fragment;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.managemoney.bean.ProductBean;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class x0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UserFixedSavingFragment f32681b;

    public /* synthetic */ x0(UserFixedSavingFragment userFixedSavingFragment, int i7) {
        this.f32680a = i7;
        this.f32681b = userFixedSavingFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Integer numValueOf;
        List list;
        RecyclerView recyclerView;
        UserFixedSavingFragment userFixedSavingFragment = this.f32681b;
        int i7 = 0;
        switch (this.f32680a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it instanceof com.transsnet.palmpay.core.base.p) {
                        List list2 = (List) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                        List list3 = userFixedSavingFragment.v().f6304c;
                        if (list3 == null || list3.isEmpty()) {
                            Nc.A aV = userFixedSavingFragment.v();
                            aV.f6304c = list2;
                            aV.notifyDataSetChanged();
                        } else {
                            DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new y0(userFixedSavingFragment.v().f6304c, list2, 0), true);
                            Intrinsics.checkNotNullExpressionValue(diffResultCalculateDiff, "calculateDiff(...)");
                            userFixedSavingFragment.v().f6304c = list2;
                            diffResultCalculateDiff.dispatchUpdatesTo(userFixedSavingFragment.v());
                            List list4 = list2;
                            if (list4 == null || list4.isEmpty()) {
                                userFixedSavingFragment.x();
                            }
                        }
                    } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        com.transsnet.palmpay.core.base.n nVar = (com.transsnet.palmpay.core.base.n) it;
                        ToastUtils.showLong(nVar.f27358a, new Object[0]);
                        nVar.getClass();
                    }
                }
                return Unit.f38893a;
            case 1:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (!(it2 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                        List list5 = (List) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                        List list6 = userFixedSavingFragment.v().f6304c;
                        if (list6 == null || list6.isEmpty()) {
                            Nc.A aV2 = userFixedSavingFragment.v();
                            aV2.f6304c = list5;
                            aV2.notifyDataSetChanged();
                        } else {
                            DiffUtil.DiffResult diffResultCalculateDiff2 = DiffUtil.calculateDiff(new y0(userFixedSavingFragment.v().f6304c, list5, 1), true);
                            Intrinsics.checkNotNullExpressionValue(diffResultCalculateDiff2, "calculateDiff(...)");
                            userFixedSavingFragment.v().f6304c = list5;
                            diffResultCalculateDiff2.dispatchUpdatesTo(userFixedSavingFragment.v());
                        }
                    } else if (!(it2 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it2).f27358a, new Object[0]);
                        ((com.transsnet.palmpay.core.base.n) it2).getClass();
                    }
                }
                return Unit.f38893a;
            case 2:
                com.transsnet.palmpay.core.base.q it3 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (!(it3 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it3 instanceof com.transsnet.palmpay.core.base.p) {
                        Pair pair = (Pair) ((com.transsnet.palmpay.core.base.p) it3).f27360a;
                        Nc.A aV3 = userFixedSavingFragment.v();
                        String str = (String) pair.f38891a;
                        Object obj2 = pair.f38892b;
                        Intrinsics.e(obj2);
                        int iIntValue = ((Number) obj2).intValue();
                        if (TextUtils.isEmpty(str) || (list = aV3.f6304c) == null || list.isEmpty()) {
                            numValueOf = -1;
                        } else {
                            List list7 = aV3.f6304c;
                            if (list7 != null) {
                                Iterator it4 = list7.iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        i7 = -1;
                                    } else if (!TextUtils.equals(((ProductBean) it4.next()).getOrderId(), str)) {
                                        i7++;
                                    }
                                }
                                numValueOf = Integer.valueOf(i7);
                            } else {
                                numValueOf = null;
                            }
                        }
                        int iIntValue2 = numValueOf != null ? numValueOf.intValue() : -1;
                        Integer numValueOf2 = iIntValue2 != -1 ? Integer.valueOf(iIntValue2) : null;
                        List list8 = aV3.f6304c;
                        if (list8 != null) {
                            Intrinsics.e(numValueOf2);
                        }
                        List list9 = aV3.f6304c;
                        if (list9 != null) {
                            Intrinsics.e(numValueOf2);
                            ProductBean productBean = (ProductBean) list9.get(numValueOf2.intValue());
                            if (productBean != null) {
                                productBean.setPlanStatus(iIntValue);
                                int iIntValue3 = numValueOf2.intValue();
                                Bundle bundle = new Bundle();
                                bundle.putInt("plan_status", iIntValue);
                                Unit unit = Unit.f38893a;
                                aV3.notifyItemChanged(iIntValue3, bundle);
                            }
                        }
                    } else if (!(it3 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it3 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it3).f27358a, new Object[0]);
                        ((com.transsnet.palmpay.core.base.n) it3).getClass();
                    }
                }
                return Unit.f38893a;
            default:
                if (obj != null) {
                    if (((Boolean) obj).booleanValue()) {
                        UserFixedSavingFragment.a aVar = UserFixedSavingFragment.f32574v;
                        SwipeRecyclerView swipeRecyclerViewW = userFixedSavingFragment.w();
                        if (swipeRecyclerViewW != null) {
                            swipeRecyclerViewW.setRefreshing(false);
                        }
                        SwipeRecyclerView swipeRecyclerViewW2 = userFixedSavingFragment.w();
                        if (swipeRecyclerViewW2 != null && (recyclerView = swipeRecyclerViewW2.getRecyclerView()) != null) {
                            recyclerView.scrollToPosition(0);
                        }
                    }
                    UserFixedSavingFragment.a aVar2 = UserFixedSavingFragment.f32574v;
                    SwipeRecyclerView swipeRecyclerViewW3 = userFixedSavingFragment.w();
                    if (swipeRecyclerViewW3 != null) {
                        swipeRecyclerViewW3.c();
                    }
                    SwipeRecyclerView swipeRecyclerViewW4 = userFixedSavingFragment.w();
                    if (swipeRecyclerViewW4 != null) {
                        swipeRecyclerViewW4.b("--- End ---");
                    }
                }
                return Unit.f38893a;
        }
    }
}

package com.transsnet.palmpay.managemoney.ui.fragment;

import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.custom_view.EmptyView;
import com.transsnet.palmpay.managemoney.bean.FixedSavingPlanRenewPopBean;
import com.transsnet.palmpay.managemoney.bean.ProductBean;
import com.transsnet.palmpay.managemoney.bean.resp.GetIntroductionResp;
import com.transsnet.palmpay.managemoney.ui.dialog.AutoFixedSaveDialogFragment;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class Q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NewUserFixedSavingFragment f32543b;

    public /* synthetic */ Q(NewUserFixedSavingFragment newUserFixedSavingFragment, int i7) {
        this.f32542a = i7;
        this.f32543b = newUserFixedSavingFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List<ProductBean> productList;
        int i7 = 0;
        NewUserFixedSavingFragment newUserFixedSavingFragment = this.f32543b;
        switch (this.f32542a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it instanceof com.transsnet.palmpay.core.base.p) {
                        GetIntroductionResp getIntroductionResp = (GetIntroductionResp) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                        EmptyView emptyView = (EmptyView) newUserFixedSavingFragment.t.getValue();
                        if (emptyView != null) {
                            GetIntroductionResp.Data data = getIntroductionResp.getData();
                            if (data != null && (productList = data.getProductList()) != null && !productList.isEmpty()) {
                                i7 = 8;
                            }
                            emptyView.setVisibility(i7);
                        }
                        new Nc.s();
                        RecyclerView recyclerView = (RecyclerView) newUserFixedSavingFragment.f32485v.getValue();
                        RecyclerView.Adapter adapter = recyclerView != null ? recyclerView.getAdapter() : null;
                        Intrinsics.f(adapter, "null cannot be cast to non-null type com.transsnet.palmpay.managemoney.ui.adapter.NewUserFixedProductListAdapter");
                        Nc.s sVar = (Nc.s) adapter;
                        sVar.f6350a = getIntroductionResp.getData();
                        sVar.notifyDataSetChanged();
                    } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (!(it2 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                        FixedSavingPlanRenewPopBean fixedSavingPlanRenewPopBean = (FixedSavingPlanRenewPopBean) ((CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it2).f27360a).data;
                        NewUserFixedSavingFragment.a aVar = NewUserFixedSavingFragment.f32484A;
                        if (fixedSavingPlanRenewPopBean != null) {
                            Pa.n0.g().v("AutoRenewPopup_View");
                            AutoFixedSaveDialogFragment autoFixedSaveDialogFragmentNewInstance = AutoFixedSaveDialogFragment.f32277H.newInstance(fixedSavingPlanRenewPopBean);
                            androidx.fragment.app.Z childFragmentManager = newUserFixedSavingFragment.getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                            autoFixedSaveDialogFragmentNewInstance.show(childFragmentManager, "renewPopUpDialog");
                            p059e1.a.Y(System.currentTimeMillis(), "fixedAutoSave");
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
        }
    }
}

package Hb;

import Pa.n0;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.credit.bean.ProductContentInfo;
import com.transsnet.palmpay.credit.view.ProductContentListAdapter$OnApplyClickListener;
import com.transsnet.palmpay.credit.view.ProductContentListView;
import java.util.Set;
import kotlin.collections.C1847n;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Hb.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC0299a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProductContentInfo f3817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BaseViewHolder f3818c;

    public /* synthetic */ ViewOnClickListenerC0299a(ProductContentInfo productContentInfo, BaseViewHolder baseViewHolder, int i7) {
        this.f3816a = i7;
        this.f3817b = productContentInfo;
        this.f3818c = baseViewHolder;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        BaseViewHolder baseViewHolder = this.f3818c;
        ProductContentInfo productContentInfo = this.f3817b;
        switch (this.f3816a) {
            case 0:
                if (!Intrinsics.c(productContentInfo.loanProduct, "PALMPAY_BUSINESS_LOAN")) {
                    ProductContentListView.f30875c.addClickEvent(productContentInfo);
                    String[] elements = {"needApply", "disable", "canBorrow", "declined"};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    if (!CollectionsKt.A(C1847n.A(elements), productContentInfo.status)) {
                        Pa.F.f(productContentInfo.jumpPath, productContentInfo.jumpType, productContentInfo.jumpParams);
                    } else {
                        RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter = baseViewHolder.getBindingAdapter();
                        Intrinsics.f(bindingAdapter, "null cannot be cast to non-null type com.transsnet.palmpay.credit.view.ProductContentListAdapter");
                        ProductContentListAdapter$OnApplyClickListener productContentListAdapter$OnApplyClickListener = ((Gb.O) bindingAdapter).f3255c;
                        if (productContentListAdapter$OnApplyClickListener != null) {
                            productContentListAdapter$OnApplyClickListener.onApplyClick(productContentInfo);
                        }
                    }
                } else {
                    n0.g().k((ClickEvent) C0.G.f("BusinessLoanCreditLoanPageClick", "module_name", "Apply"));
                    Pa.F.f(productContentInfo.jumpPath, productContentInfo.jumpType, productContentInfo.jumpParams);
                }
                break;
            case 1:
                if (!Intrinsics.c(productContentInfo.loanProduct, "PALMPAY_BUSINESS_LOAN")) {
                    ProductContentListView.f30875c.addClickEvent(productContentInfo);
                    String[] elements2 = {"needApply", "disable", "canBorrow", "declined"};
                    Intrinsics.checkNotNullParameter(elements2, "elements");
                    if (!CollectionsKt.A(C1847n.A(elements2), productContentInfo.status)) {
                        Pa.F.f(productContentInfo.jumpPath, productContentInfo.jumpType, productContentInfo.jumpParams);
                    } else {
                        RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter2 = baseViewHolder.getBindingAdapter();
                        Intrinsics.f(bindingAdapter2, "null cannot be cast to non-null type com.transsnet.palmpay.credit.view.ProductContentListAdapter");
                        ProductContentListAdapter$OnApplyClickListener productContentListAdapter$OnApplyClickListener2 = ((Gb.O) bindingAdapter2).f3255c;
                        if (productContentListAdapter$OnApplyClickListener2 != null) {
                            productContentListAdapter$OnApplyClickListener2.onApplyClick(productContentInfo);
                        }
                    }
                } else {
                    n0.g().k((ClickEvent) C0.G.f("BusinessLoanCreditLoanPageClick", "module_name", "Card"));
                    Pa.F.e(productContentInfo.androidLinkCard);
                }
                break;
            case 2:
                ProductContentListView.f30875c.addClickEvent(productContentInfo);
                if (TextUtils.equals("needApply", productContentInfo.status) || TextUtils.equals("disable", productContentInfo.status)) {
                    RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter3 = baseViewHolder.getBindingAdapter();
                    Intrinsics.f(bindingAdapter3, "null cannot be cast to non-null type com.transsnet.palmpay.credit.view.ProductContentListAdapter");
                    ProductContentListAdapter$OnApplyClickListener productContentListAdapter$OnApplyClickListener3 = ((Gb.O) bindingAdapter3).f3255c;
                    if (productContentListAdapter$OnApplyClickListener3 != null) {
                        productContentListAdapter$OnApplyClickListener3.onApplyClick(productContentInfo);
                    }
                } else {
                    Pa.F.f(productContentInfo.jumpPath, productContentInfo.jumpType, productContentInfo.jumpParams);
                }
                break;
            case 3:
                ProductContentListView.f30875c.addClickEvent(productContentInfo);
                if (Intrinsics.c(productContentInfo.loanProduct, "PALMPAY_BUSINESS_LOAN")) {
                    Pa.F.f(productContentInfo.jumpPath, productContentInfo.jumpType, productContentInfo.jumpParams);
                } else if (!TextUtils.isEmpty(productContentInfo.androidLinkCard)) {
                    Pa.F.e(productContentInfo.androidLinkCard);
                } else {
                    String[] elements3 = {"needApply", "disable", "canBorrow", "declined"};
                    Intrinsics.checkNotNullParameter(elements3, "elements");
                    if (!CollectionsKt.A(C1847n.A(elements3), productContentInfo.status)) {
                        Pa.F.f(productContentInfo.jumpPath, productContentInfo.jumpType, productContentInfo.jumpParams);
                    } else {
                        RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter4 = baseViewHolder.getBindingAdapter();
                        Intrinsics.f(bindingAdapter4, "null cannot be cast to non-null type com.transsnet.palmpay.credit.view.ProductContentListAdapter");
                        ProductContentListAdapter$OnApplyClickListener productContentListAdapter$OnApplyClickListener4 = ((Gb.O) bindingAdapter4).f3255c;
                        if (productContentListAdapter$OnApplyClickListener4 != null) {
                            productContentListAdapter$OnApplyClickListener4.onApplyClick(productContentInfo);
                        }
                    }
                }
                break;
            case 4:
                ProductContentListView.f30875c.addClickEvent(productContentInfo);
                RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter5 = baseViewHolder.getBindingAdapter();
                Intrinsics.f(bindingAdapter5, "null cannot be cast to non-null type com.transsnet.palmpay.credit.view.ProductContentListAdapter");
                ProductContentListAdapter$OnApplyClickListener productContentListAdapter$OnApplyClickListener5 = ((Gb.O) bindingAdapter5).f3255c;
                if (productContentListAdapter$OnApplyClickListener5 != null) {
                    productContentListAdapter$OnApplyClickListener5.onApplyClick(productContentInfo);
                }
                break;
            case 5:
                ProductContentListView.f30875c.addClickEvent(productContentInfo);
                RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter6 = baseViewHolder.getBindingAdapter();
                Intrinsics.f(bindingAdapter6, "null cannot be cast to non-null type com.transsnet.palmpay.credit.view.ProductContentListAdapter");
                ProductContentListAdapter$OnApplyClickListener productContentListAdapter$OnApplyClickListener6 = ((Gb.O) bindingAdapter6).f3255c;
                if (productContentListAdapter$OnApplyClickListener6 != null) {
                    productContentListAdapter$OnApplyClickListener6.onApplyClick(productContentInfo);
                }
                break;
            default:
                ProductContentListView.f30875c.addClickEvent(productContentInfo);
                Set set = Eb.b.f2269a;
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                Eb.b.b(context, productContentInfo);
                String[] elements4 = {"needApply", "disable", "canBorrow", "declined"};
                Intrinsics.checkNotNullParameter(elements4, "elements");
                if (!CollectionsKt.A(C1847n.A(elements4), productContentInfo.status)) {
                    Pa.F.f(productContentInfo.jumpPath, productContentInfo.jumpType, productContentInfo.jumpParams);
                } else {
                    RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter7 = baseViewHolder.getBindingAdapter();
                    Intrinsics.f(bindingAdapter7, "null cannot be cast to non-null type com.transsnet.palmpay.credit.view.ProductContentListAdapter");
                    ProductContentListAdapter$OnApplyClickListener productContentListAdapter$OnApplyClickListener7 = ((Gb.O) bindingAdapter7).f3255c;
                    if (productContentListAdapter$OnApplyClickListener7 != null) {
                        productContentListAdapter$OnApplyClickListener7.onApplyClick(productContentInfo);
                    }
                }
                break;
        }
    }
}

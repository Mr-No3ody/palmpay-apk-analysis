package com.transsnet.palmpay.credit.view;

import Ae.j;
import Ae.n;
import F6.d;
import Gb.O;
import Gb.P;
import Pa.n0;
import Ya.f;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.credit.bean.ProductContentInfo;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.util.SizeUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0012\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/transsnet/palmpay/credit/view/ProductContentListView;", "Lcom/transsnet/palmpay/credit/view/BaseLoanView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/transsnet/palmpay/credit/view/ProductContentListAdapter$OnApplyClickListener;", "applyClickListener", "", "setOnApplyClickListener", "(Lcom/transsnet/palmpay/credit/view/ProductContentListAdapter$OnApplyClickListener;)V", "Landroidx/recyclerview/widget/RecyclerView;", "a", "Lkotlin/Lazy;", "getRvProductList", "()Landroidx/recyclerview/widget/RecyclerView;", "rvProductList", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProductContentListView extends BaseLoanView {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f30875c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f30876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ProductContentListAdapter$OnApplyClickListener f30877b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void addClickEvent(@NotNull ProductContentInfo item) {
            String string;
            Intrinsics.checkNotNullParameter(item, "item");
            n0 n0VarG = n0.g();
            ClickEvent clickEventAdd = new ClickEvent("loan_product_button_click").add("status", item.status).add("loanProduct", item.loanProduct).add("style", item.style);
            Integer num = item.productSubId;
            if (num == null || (string = num.toString()) == null) {
                string = "";
            }
            n0VarG.k(clickEventAdd.add("productSubId", string));
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductContentListView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f30876a = C2131j.b(new j(this, 16));
        d.h("ProductContentListView", 3, "ProductContentListView >>> init");
        LayoutInflater.from(context).inflate(f.cs_cl_product_content_list_view, this);
        RecyclerView rvProductList = getRvProductList();
        if (rvProductList != null) {
            rvProductList.setLayoutManager(new LinearLayoutManager(context, 1, false));
        }
        RecyclerView rvProductList2 = getRvProductList();
        if (rvProductList2 != null) {
            rvProductList2.setAdapter(new O(this));
        }
        RecyclerView rvProductList3 = getRvProductList();
        if (rvProductList3 != null) {
            P p3 = new P(context.getColor(p.transparent), SizeUtils.dp2px(12.0f));
            p3.f31336e = false;
            rvProductList3.addItemDecoration(p3);
        }
    }

    public static void e(ProductContentListView productContentListView) {
        RecyclerView rvProductList = productContentListView.getRvProductList();
        if (rvProductList != null) {
            rvProductList.requestLayout();
        }
    }

    private final RecyclerView getRvProductList() {
        return (RecyclerView) this.f30876a.getValue();
    }

    public final void f(List list) {
        if (list != null) {
            setVisibility(0);
            RecyclerView rvProductList = getRvProductList();
            O o10 = (O) (rvProductList != null ? rvProductList.getAdapter() : null);
            if (o10 != null) {
                o10.setList(list);
            }
            RecyclerView rvProductList2 = getRvProductList();
            if ((rvProductList2 != null ? Boolean.valueOf(rvProductList2.post(new n(this, 18))) : null) != null) {
                return;
            }
        }
        setVisibility(8);
        Unit unit = Unit.f38893a;
    }

    public final void setOnApplyClickListener(@NotNull ProductContentListAdapter$OnApplyClickListener applyClickListener) {
        Intrinsics.checkNotNullParameter(applyClickListener, "applyClickListener");
        this.f30877b = applyClickListener;
        RecyclerView rvProductList = getRvProductList();
        O o10 = (O) (rvProductList != null ? rvProductList.getAdapter() : null);
        if (o10 != null) {
            Intrinsics.checkNotNullParameter(applyClickListener, "applyClickListener");
            o10.f3255c = applyClickListener;
        }
    }
}

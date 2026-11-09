package Nc;

import Ce.u0;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.adsdk.widgets.banner.BannerAdView;
import com.transsnet.palmpay.managemoney.bean.ProductBean;
import com.transsnet.palmpay.managemoney.bean.resp.GetIntroductionResp;
import com.transsnet.palmpay.managemoney.ui.fragment.O;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f6349c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GetIntroductionResp.Data f6350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public O f6351b;

    static {
        new o(null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        List<ProductBean> productList;
        List<ProductBean> productList2;
        GetIntroductionResp.Data data = this.f6350a;
        if (data == null || !(data == null || (productList2 = data.getProductList()) == null || !productList2.isEmpty())) {
            return 1;
        }
        GetIntroductionResp.Data data2 = this.f6350a;
        int size = (data2 == null || (productList = data2.getProductList()) == null) ? 0 : productList.size();
        GetIntroductionResp.Data data3 = this.f6350a;
        return data3 != null ? Intrinsics.c(data3.getFixedSavingShow(), Boolean.FALSE) : false ? size + 1 : size + 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i7) {
        List<ProductBean> productList;
        List<ProductBean> productList2;
        GetIntroductionResp.Data data = this.f6350a;
        if (data == null || !(data == null || (productList2 = data.getProductList()) == null || !productList2.isEmpty())) {
            return 0;
        }
        GetIntroductionResp.Data data2 = this.f6350a;
        int size = (data2 == null || (productList = data2.getProductList()) == null) ? 0 : productList.size();
        GetIntroductionResp.Data data3 = this.f6350a;
        if (data3 != null ? Intrinsics.c(data3.getFixedSavingShow(), Boolean.FALSE) : false) {
            return i7 == 0 ? 0 : 1;
        }
        if (i7 == size + 1) {
            return 2;
        }
        return i7 == 0 ? 0 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        List<ProductBean> productList;
        AbstractC0482a holder = (AbstractC0482a) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (getItemViewType(i7) == 0) {
            holder.a(i7, this.f6350a);
            return;
        }
        ProductBean productBean = null;
        if (getItemViewType(i7) == 2) {
            GetIntroductionResp.Data data = this.f6350a;
            holder.a(i7, data != null ? data.getFixedSavingShow() : null);
            return;
        }
        GetIntroductionResp.Data data2 = this.f6350a;
        if (data2 != null && (productList = data2.getProductList()) != null) {
            productBean = productList.get(i7 - 1);
        }
        holder.a(i7 - 1, productBean);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (i7 == 0) {
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(Jc.d.mm_item_product_top, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
            return new q(this, viewInflate);
        }
        if (i7 != 2) {
            View viewInflate2 = LayoutInflater.from(parent.getContext()).inflate(Jc.d.mm_item_product, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate2, "inflate(...)");
            return new r(this, viewInflate2);
        }
        View itemView = LayoutInflater.from(parent.getContext()).inflate(Jc.d.mm_item_product_bottom, parent, false);
        Intrinsics.checkNotNullExpressionValue(itemView, "inflate(...)");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        n nVar = new n(itemView);
        View viewFindViewById = itemView.findViewById(Jc.c.llLeft);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        LinearLayout linearLayout = (LinearLayout) viewFindViewById;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new K8.a(12));
        }
        View viewFindViewById2 = itemView.findViewById(Jc.c.viewPager);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        BannerAdView bannerAdView = (BannerAdView) viewFindViewById2;
        nVar.f6339b = bannerAdView;
        View viewFindViewById3 = itemView.findViewById(Jc.c.llRight);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        LinearLayout linearLayout2 = (LinearLayout) viewFindViewById3;
        if (linearLayout2 != null) {
            linearLayout2.setOnClickListener(new K8.a(12));
        }
        bannerAdView.setAdListener(new u0(nVar, 1));
        return nVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7, List payloads) {
        AbstractC0482a holder = (AbstractC0482a) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if ((holder instanceof q) && i7 == 0 && !payloads.isEmpty()) {
            ((q) holder).getClass();
        } else {
            super.onBindViewHolder(holder, i7, payloads);
        }
    }
}

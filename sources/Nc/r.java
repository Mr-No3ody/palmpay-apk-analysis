package Nc;

import B6.ViewOnClickListenerC0087i;
import Pa.r0;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.custom_view.RoundedTextView;
import com.transsnet.palmpay.main.export.bean.rsp.SavingProduct;
import com.transsnet.palmpay.managemoney.bean.ProductBean;
import com.transsnet.palmpay.managemoney.bean.resp.GetIntroductionResp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends AbstractC0482a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f6344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f6345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f6346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RoundedTextView f6347e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s f6348f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f6348f = sVar;
        View viewFindViewById = itemView.findViewById(Jc.c.ivIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f6344b = (ImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(Jc.c.tvInterestAmount);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f6345c = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(Jc.c.tvDurationNum);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f6346d = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(Jc.c.rtvInvest);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f6347e = (RoundedTextView) viewFindViewById4;
    }

    @Override // Nc.AbstractC0482a
    public final void a(int i7, Object obj) {
        List<ProductBean> productList;
        super.a(i7, obj);
        if (obj != null) {
            ProductBean productBean = (ProductBean) obj;
            s sVar = this.f6348f;
            GetIntroductionResp.Data data = sVar.f6350a;
            int size = (data == null || (productList = data.getProductList()) == null) ? 0 : productList.size();
            if (size == 1) {
                GetIntroductionResp.Data data2 = sVar.f6350a;
                List<SavingProduct> exclusiveList = data2 != null ? data2.getExclusiveList() : null;
                if (exclusiveList == null || exclusiveList.isEmpty()) {
                    this.itemView.setBackgroundResource(com.transsnet.palmpay.custom_view.r.cv_rect_corner_12_bg_white);
                } else {
                    this.itemView.setBackgroundResource(Jc.b.mm_bg_product_info_bottom);
                }
            } else {
                GetIntroductionResp.Data data3 = sVar.f6350a;
                List<SavingProduct> exclusiveList2 = data3 != null ? data3.getExclusiveList() : null;
                if ((exclusiveList2 == null || exclusiveList2.isEmpty()) && i7 == 0) {
                    this.itemView.setBackgroundResource(Jc.b.mm_bg_product_info_top);
                } else {
                    this.itemView.setBackgroundResource(i7 == size - 1 ? Jc.b.mm_bg_product_info_bottom : Jc.b.mm_bg_product_info_middle);
                }
            }
            r0.h1(this.f6344b, productBean.getProductIcon(), com.transsnet.palmpay.custom_view.r.cv_fixed_saving);
            String strZ0 = r0.z0(r0.w1(String.valueOf(productBean.getAnnualizedIncomeRatio()), "100").toPlainString());
            TextView textView = this.f6345c;
            textView.setText(strZ0);
            this.f6346d.setText(productBean.getDurationDay() + "-" + productBean.getMaxDurationDay());
            int color = (productBean.getProductStatus() == 7 || productBean.getProductStatus() == 1) ? this.itemView.getContext().getColor(Jc.a.mm_color_caaee4) : this.itemView.getContext().getColor(L6.b.ppColorPrimary);
            RoundedTextView roundedTextView = this.f6347e;
            roundedTextView.setRoundedBackgroundColor(color);
            roundedTextView.setOnClickListener(new ViewOnClickListenerC0087i(sVar, 15, this, productBean));
            r0.R1(textView, "fonts/PalmPayNum-Bold.ttf");
        }
    }
}

package Nc;

import Pa.r0;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.custom_view.RoundedTextView;
import com.transsnet.palmpay.managemoney.bean.ProductBean;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends AbstractC0482a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f6306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f6307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f6308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RoundedTextView f6309e;

    @Override // Nc.AbstractC0482a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void a(ProductBean productBean, int i7) {
        super.a(i7, productBean);
        if (productBean != null) {
            r0.h1(this.f6306b, productBean.getProductIcon(), com.transsnet.palmpay.custom_view.r.cv_fixed_saving);
            this.f6307c.setText(productBean.getProductName());
            this.f6308d.setText(productBean.getProductIncreaseUpContent());
            this.f6309e.setRoundedBackgroundColor((productBean.getProductStatus() == 7 || productBean.getProductStatus() == 1) ? this.itemView.getContext().getColor(L6.b.ppColorDisabled) : this.itemView.getContext().getColor(L6.b.ppColorPrimary));
        }
    }
}

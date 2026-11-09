package p155k9;

import M1.j;
import N8.q0;
import Pa.r0;
import Pd.c;
import Pd.f;
import android.widget.TextView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.airtime.bean.rsp.FlashSalesProductsDataBean;
import com.transsnet.palmpay.core.base.BaseApplication;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends j {
    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        FlashSalesProductsDataBean item = (FlashSalesProductsDataBean) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        holder.getView(c.ira_root);
        TextView textView = (TextView) holder.getView(c.ira_discount_amount_tv);
        TextView textView2 = (TextView) holder.getView(c.ira_amount_tv);
        holder.setText(c.ira_amount_tv, r0.L(12, 20, 0, item.price));
        textView.setText(getContext().getString(f.qt_airtime_pay_x, q0.j(BaseApplication.getCurrencySymbol(), r0.n0(item.sellingPrice))));
        if (item.remainingQty <= 0 || item.suspend) {
            textView.setAlpha(0.4f);
            textView2.setAlpha(0.4f);
        } else {
            textView.setAlpha(1.0f);
            textView2.setAlpha(1.0f);
        }
    }
}

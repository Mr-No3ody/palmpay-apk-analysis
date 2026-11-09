package Q3;

import android.text.TextUtils;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.flexibank.sdk.cashier.bean.FlexiBankCashierTaxDetailBean;
import com.flexibank.sdk.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e extends M1.j {
    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        FlexiBankCashierTaxDetailBean.TaxDetail item = (FlexiBankCashierTaxDetailBean.TaxDetail) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        int i7 = p.fb_tvName;
        String title = item.getTitle();
        if (title == null) {
            title = "";
        }
        holder.setText(i7, title);
        Long taxAmount = item.getTaxAmount();
        holder.setText(p.fb_tvAmount, p118hf.a.t(taxAmount != null ? taxAmount.longValue() : 0L, false));
        if (TextUtils.isEmpty(item.getRemark())) {
            holder.setGone(p.fb_tvDetail, true);
        } else {
            holder.setText(p.fb_tvDetail, item.getRemark());
            holder.setGone(p.fb_tvDetail, false);
        }
    }
}

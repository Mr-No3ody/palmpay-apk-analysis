package Ha;

import Pa.r0;
import android.text.TextUtils;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.core.bean.cashier.CashierTaxDetailBean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends M1.j {
    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        CashierTaxDetailBean.TaxDetail item = (CashierTaxDetailBean.TaxDetail) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        int i7 = p025ba.e.tvName;
        String title = item.getTitle();
        if (title == null) {
            title = "";
        }
        holder.setText(i7, title);
        Long taxAmount = item.getTaxAmount();
        holder.setText(p025ba.e.tvAmount, r0.B(taxAmount != null ? taxAmount.longValue() : 0L, false));
        if (TextUtils.isEmpty(item.getRemark())) {
            holder.setGone(p025ba.e.tvDetail, true);
        } else {
            holder.setText(p025ba.e.tvDetail, item.getRemark());
            holder.setGone(p025ba.e.tvDetail, false);
        }
    }
}

package F9;

import M1.j;
import Pa.r0;
import android.text.TextUtils;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.cash_in.bean.SubTaxItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends j {
    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        SubTaxItem item = (SubTaxItem) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        int i7 = p366y9.b.tvName;
        String feeName = item.getFeeName();
        if (feeName == null) {
            feeName = "";
        }
        holder.setText(i7, feeName);
        int i10 = p366y9.b.tvAmount;
        Long fee = item.getFee();
        holder.setText(i10, r0.B(fee != null ? fee.longValue() : 0L, false));
        if (TextUtils.isEmpty(item.getFeeDesc())) {
            holder.setGone(p366y9.b.tvDetail, true);
        } else {
            holder.setText(p366y9.b.tvDetail, item.getFeeDesc());
            holder.setGone(p366y9.b.tvDetail, false);
        }
    }
}

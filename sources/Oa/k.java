package Oa;

import Pa.r0;
import android.text.TextUtils;
import android.widget.ImageView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.core.bean.payment.CashierManualGetRewardItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends M1.j {
    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        ImageView imageView;
        CashierManualGetRewardItem item = (CashierManualGetRewardItem) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        if (!TextUtils.isEmpty(item.getName())) {
            holder.setText(p025ba.e.tv_earn_title, item.getName());
        }
        if (!TextUtils.isEmpty(item.getValue())) {
            holder.setText(p025ba.e.tv_earn_content, item.getValue());
        }
        if (TextUtils.isEmpty(item.getTagUrl()) || (imageView = (ImageView) holder.getView(p025ba.e.ivRewardTag)) == null) {
            return;
        }
        r0.l1(item.getTagUrl(), imageView);
    }
}

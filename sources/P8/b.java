package P8;

import F8.d;
import M1.j;
import Pa.r0;
import android.widget.TextView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.account.bean.SignUpCouponItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends j {
    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        SignUpCouponItem.DataBean item = (SignUpCouponItem.DataBean) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        holder.setText(d.tvRewardType, item.title);
        TextView textView = (TextView) holder.getView(d.tvAmount);
        r0.R1(textView, "fonts/PalmPayNum-Bold.ttf");
        textView.setText(r0.F(item.amount));
        holder.setText(d.text1, item.type);
    }
}

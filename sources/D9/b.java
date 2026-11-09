package D9;

import M1.j;
import Pa.i0;
import Pa.r0;
import android.text.TextUtils;
import android.widget.ImageView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.cash_in.bean.response.FundViewBean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends j {
    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        FundViewBean item = (FundViewBean) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        ImageView imageView = (ImageView) holder.getView(p366y9.b.iv_icon);
        String str = item.icon;
        String str2 = item.darkIcon;
        int i7 = p366y9.a.ci_default;
        if (!TextUtils.isEmpty(str2) && i0.V(imageView)) {
            str = str2;
        }
        r0.j1(imageView, str, (G1.d) G1.d.O(i7).j(i7));
        r0.l1(item.iconUrl, (ImageView) holder.getView(p366y9.b.ivCornerMark));
        holder.setText(p366y9.b.tv_title, item.name).setText(p366y9.b.tv_tip, item.content).itemView.setOnClickListener(new A8.c(12, this, item));
    }
}

package p328ve;

import Ac.e;
import M1.j;
import Pa.r0;
import android.text.TextUtils;
import android.widget.ImageView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.core.bean.HomePageMenuData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends j {
    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        HomePageMenuData item = (HomePageMenuData) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        holder.setText(e.tv_bill_like_menu_name, item.menuName);
        r0.l1(item.iconUrlBig, (ImageView) holder.getView(e.iv_bill_like_menu_icon));
        if (TextUtils.isEmpty(item.menuDesc) || item.editEnable) {
            holder.setVisible(e.tv_bill_like_remark, false);
        } else {
            holder.setVisible(e.tv_bill_like_remark, true);
            holder.setText(e.tv_bill_like_remark, item.menuDesc);
        }
        holder.setGone(e.iv_bill_like_menu_minus_icon, !item.editEnable);
    }
}

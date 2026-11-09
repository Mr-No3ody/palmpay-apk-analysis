package p052da;

import L6.b;
import M1.j;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.core.bean.rsp.TransactionFilterResp;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import kotlin.jvm.internal.Intrinsics;
import p025ba.e;
import p025ba.g;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 extends j {
    public b0() {
        super(g.core_item_transaction_filter, null);
    }

    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        TransactionFilterResp.FilterBean item = (TransactionFilterResp.FilterBean) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        holder.setText(e.tvContent, item.getName()).setTextColor(e.tvContent, item.getIsSelected() ? CommonViewExtKt.colorInt(b.ppColorPrimary, getContext()) : CommonViewExtKt.colorInt(b.ppColorTextPrimary, getContext())).setBackgroundResource(e.tvContent, item.getIsSelected() ? r.cv_shape_rect_corner_8_bg_secondary : r.cv_shape_rect_corner_8_bg_dark);
    }
}

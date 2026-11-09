package p173ld;

import M1.j;
import Pa.r0;
import android.text.TextUtils;
import android.widget.ImageView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.send_money.bean.resp.TransReceiptTypeBean;
import kotlin.jvm.internal.Intrinsics;
import p159kd.d;
import p159kd.e;

/* JADX INFO: loaded from: classes4.dex */
public final class v extends j {
    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        TransReceiptTypeBean item = (TransReceiptTypeBean) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        if (TextUtils.isEmpty(item.getThumbnail())) {
            ((ImageView) holder.getView(e.iv_receipt_type)).setImageResource(d.sm_ic_receipt_default);
        } else {
            r0.l1(item.getThumbnail(), (ImageView) holder.getView(e.iv_receipt_type));
        }
        holder.setVisible(e.iv_check, item.getIsCheck());
    }
}

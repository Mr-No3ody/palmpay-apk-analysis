package Ad;

import Pa.i0;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.core.bean.BillProcessData2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a0 extends M1.j {
    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        BillProcessData2 item = (BillProcessData2) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        holder.setText(p159kd.e.tv_progress_title, item.shortTips).setTextColor(p159kd.e.tv_progress_title, getContext().getColor(item.selected ? L6.b.ppColorTextPrimary : L6.b.ppColorTextDisable)).setText(p159kd.e.tv_progress_tips, item.tips).setGone(p159kd.e.v_divider, holder.getAdapterPosition() == getData().size() - 1).setImageResource(p159kd.e.iv_progress, i0.A(item.nodeStatus));
    }
}

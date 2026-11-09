package Gd;

import Pa.i0;
import android.content.Context;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.core.bean.TransferToBankProcessItem;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class w extends M1.j {
    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        TransferToBankProcessItem item = (TransferToBankProcessItem) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        BaseViewHolder imageResource = holder.setText(p159kd.e.tv_progress, item.shortTips).setGone(p159kd.e.v_divider_left, holder.getAdapterPosition() == 0).setGone(p159kd.e.v_divider_right, holder.getAdapterPosition() == getData().size() - 1).setImageResource(p159kd.e.iv_progress, i0.A(item.nodeStatus));
        int i7 = p159kd.e.v_divider_left;
        Context context = getContext();
        int i10 = (!item.selected && item.nodeStatus == 0) ? L6.b.ppColorDividerLine : L6.b.ppColorSuccess;
        BaseViewHolder backgroundColor = imageResource.setBackgroundColor(i7, context.getColor(i10)).setBackgroundColor(p159kd.e.v_divider_right, getContext().getColor(item.nodeStatus == 2 ? L6.b.ppColorSuccess : L6.b.ppColorDividerLine));
        int i11 = p159kd.e.tv_time;
        long j6 = item.timestamp;
        backgroundColor.setText(i11, j6 > 0 ? new SimpleDateFormat("MM-dd h:mm aa", Locale.ENGLISH).format(Long.valueOf(j6)) : "");
    }
}

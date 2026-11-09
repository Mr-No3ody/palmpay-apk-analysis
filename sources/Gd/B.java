package Gd;

import Pa.r0;
import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.send_money.bean.OrderCompensateStatusBean;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class B extends M1.j {
    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        int i7;
        OrderCompensateStatusBean item = (OrderCompensateStatusBean) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        BaseViewHolder text = holder.setText(p159kd.e.tv_progress, item.getShortTips());
        int i10 = p159kd.e.tv_time;
        Long statusTime = item.getStatusTime();
        BaseViewHolder text2 = text.setText(i10, new SimpleDateFormat("MM-dd h:mm:ss aa", Locale.ENGLISH).format(Long.valueOf(statusTime != null ? statusTime.longValue() : 0L)));
        int i11 = p159kd.e.tv_time;
        Long statusTime2 = item.getStatusTime();
        BaseViewHolder gone = text2.setGone(i11, (statusTime2 != null ? statusTime2.longValue() : 0L) == 0).setGone(p159kd.e.v_divider_left, holder.getAdapterPosition() == 0).setGone(p159kd.e.v_divider_right, holder.getAdapterPosition() == getData().size() - 1);
        int i12 = p159kd.e.iv_progress;
        int nodeStatus = item.getNodeStatus();
        if (nodeStatus == 1) {
            i7 = com.transsnet.palmpay.custom_view.r.cv_order_result_processing_40;
        } else if (nodeStatus == 2) {
            i7 = com.transsnet.palmpay.custom_view.r.cv_order_result_success_40;
        } else {
            i7 = nodeStatus == 3 ? com.transsnet.palmpay.custom_view.r.cv_order_result_fail_40 : com.transsnet.palmpay.custom_view.r.cv_check_gray_c0c3c8;
        }
        BaseViewHolder imageResource = gone.setImageResource(i12, i7);
        int i13 = p159kd.e.v_divider_left;
        Context context = getContext();
        int i14 = (!Intrinsics.c(item.getSelected(), Boolean.TRUE) && item.getNodeStatus() == 0) ? L6.b.ppColorTextDisable : L6.b.ppColorSuccess;
        imageResource.setBackgroundColor(i13, context.getColor(i14)).setBackgroundColor(p159kd.e.v_divider_right, getContext().getColor(item.getNodeStatus() == 2 ? L6.b.ppColorSuccess : L6.b.ppColorTextDisable));
        if (!TextUtils.isEmpty(item.getCornerMarkIcon())) {
            r0.l1(item.getCornerMarkIcon(), (ImageView) holder.getView(p159kd.e.iv_countdown));
            holder.setVisible(p159kd.e.iv_countdown, true).setGone(p159kd.e.tv_completion_time, true);
        } else if (TextUtils.isEmpty(item.getCornerMarkTips())) {
            holder.setVisible(p159kd.e.iv_countdown, false).setGone(p159kd.e.tv_completion_time, true);
        } else {
            holder.setVisible(p159kd.e.iv_countdown, false).setGone(p159kd.e.tv_completion_time, false).setText(p159kd.e.tv_completion_time, item.getCornerMarkTips());
        }
    }
}

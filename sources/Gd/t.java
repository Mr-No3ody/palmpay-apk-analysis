package Gd;

import Pa.i0;
import android.content.Context;
import android.text.TextUtils;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.core.bean.BillProcessTitleData1;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class t extends M1.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3372a;

    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        BillProcessTitleData1 item = (BillProcessTitleData1) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        boolean z3 = false;
        BaseViewHolder gone = holder.setText(p159kd.e.tv_progress, item.shortTips).setGone(p159kd.e.v_divider_left, holder.getAdapterPosition() == 0).setGone(p159kd.e.v_divider_right, holder.getAdapterPosition() == getData().size() - 1);
        int i7 = p159kd.e.iv_bubble_triangle;
        if (item.selected && this.f3372a && !TextUtils.isEmpty(item.tips)) {
            z3 = true;
        }
        BaseViewHolder imageResource = gone.setVisible(i7, z3).setImageResource(p159kd.e.iv_progress, i0.A(item.nodeStatus));
        int i10 = p159kd.e.v_divider_left;
        Context context = getContext();
        int i11 = (!item.selected && item.nodeStatus == 0) ? L6.b.ppColorDividerLine : L6.b.ppColorSuccess;
        BaseViewHolder backgroundColor = imageResource.setBackgroundColor(i10, context.getColor(i11)).setBackgroundColor(p159kd.e.v_divider_right, getContext().getColor(item.nodeStatus == 2 ? L6.b.ppColorSuccess : L6.b.ppColorDividerLine));
        int i12 = p159kd.e.tv_time;
        long j6 = item.timestamp;
        backgroundColor.setText(i12, j6 > 0 ? new SimpleDateFormat("MM-dd h:mm:ss aa", Locale.ENGLISH).format(Long.valueOf(j6)) : "");
    }
}

package I9;

import M1.j;
import Pa.i0;
import android.content.Context;
import android.text.TextUtils;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.core.bean.BillProcessTitleData1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends j {
    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        BillProcessTitleData1 item = (BillProcessTitleData1) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        boolean z3 = false;
        BaseViewHolder gone = holder.setText(p366y9.b.tv_progress, item.shortTips).setGone(p366y9.b.v_divider_left, holder.getAdapterPosition() == 0).setGone(p366y9.b.v_divider_right, holder.getAdapterPosition() == getData().size() - 1);
        int i7 = p366y9.b.iv_bubble_triangle;
        if (item.selected && !TextUtils.isEmpty(item.tips)) {
            z3 = true;
        }
        BaseViewHolder imageResource = gone.setVisible(i7, z3).setImageResource(p366y9.b.iv_progress, i0.A(item.nodeStatus));
        int i10 = p366y9.b.v_divider_left;
        Context context = getContext();
        int i11 = (!item.selected && item.nodeStatus == 0) ? L6.b.ppColorDividerLine : L6.b.ppColorSuccess;
        imageResource.setBackgroundColor(i10, context.getColor(i11)).setBackgroundColor(p366y9.b.v_divider_right, getContext().getColor(item.nodeStatus == 2 ? L6.b.ppColorSuccess : L6.b.ppColorDividerLine));
    }
}

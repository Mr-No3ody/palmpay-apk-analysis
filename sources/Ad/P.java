package Ad;

import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class P extends M1.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f184a;

    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        O item = (O) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        holder.setText(p159kd.e.tv_date, String.valueOf(item.f183b)).setTextColor(p159kd.e.tv_date, getContext().getColor(this.f184a == holder.getLayoutPosition() ? L6.b.ppColorPrimary : L6.b.ppColorTextPrimary)).setBackgroundResource(p159kd.e.tv_date, this.f184a == holder.getLayoutPosition() ? p025ba.d.core_rect_round_corner_bg_f3ebf9 : com.transsnet.palmpay.custom_view.p.transparent);
    }
}

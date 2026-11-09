package p155k9;

import M1.j;
import Pd.c;
import Pd.d;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.airtime.bean.ScheduleTopUpFAQBean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends j {
    public n() {
        super(d.qt_airtime_schedule_faq_item_layout, null);
    }

    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        ScheduleTopUpFAQBean item = (ScheduleTopUpFAQBean) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        holder.setText(c.tvQuestion, item.getTitle());
    }
}

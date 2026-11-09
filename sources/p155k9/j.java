package p155k9;

import L6.b;
import Pa.r0;
import Pd.c;
import Pd.d;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.airtime.bean.rsp.ScheduleTopUpAmountItemBean;
import com.transsnet.palmpay.custom_view.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends M1.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38717a;

    public j() {
        super(d.qt_airtime_item_rechagre_amount_ng, null);
        this.f38717a = -1;
    }

    public final void a(int i7) {
        this.f38717a = i7;
        notifyDataSetChanged();
    }

    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        ScheduleTopUpAmountItemBean item = (ScheduleTopUpAmountItemBean) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        int itemPosition = getItemPosition(item);
        Long price = item.getPrice();
        SpannableStringBuilder spannableStringBuilderL = r0.L(12, 20, 0, price != null ? price.longValue() : 0L);
        TextView textView = (TextView) holder.getView(c.itemNameTv);
        TextView textView2 = (TextView) holder.getView(c.itemVauleTv);
        View view = holder.getView(c.ira_root);
        textView.setText(spannableStringBuilderL);
        int color = getContext().getColor(b.ppColorPrimary);
        if (itemPosition != this.f38717a || Intrinsics.c(item.getSuspend(), Boolean.TRUE)) {
            view.setBackground(getContext().getDrawable(r.cv_shape_rect_corner_8_bg_dark));
            textView.setTextColor(getContext().getColor(b.ppColorTextPrimary));
        } else {
            view.setBackground(getContext().getDrawable(r.cv_rect_corner_8_bg_second_storke_purple));
            textView.setTextColor(color);
        }
        if (TextUtils.isEmpty(item.getRewardsRateText())) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(item.getRewardsRateText());
            textView2.setVisibility(0);
        }
    }
}

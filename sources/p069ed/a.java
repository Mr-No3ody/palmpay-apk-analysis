package p069ed;

import L6.b;
import M1.j;
import Pa.r0;
import Pd.c;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.airtime.bean.R2CProductsResp;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36284a;

    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        R2CProductsResp item = (R2CProductsResp) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        int itemPosition = getItemPosition(item);
        SpannableStringBuilder spannableStringBuilderL = r0.L(12, 20, 0, item.price);
        TextView textView = (TextView) holder.getView(c.ira_amount_tv);
        TextView textView2 = (TextView) holder.getView(c.ira_discount_amount_tv);
        View view = holder.getView(c.ira_root);
        textView.setText(spannableStringBuilderL);
        if (itemPosition != this.f36284a || item.suspend) {
            view.setBackground(getContext().getDrawable(r.cv_shape_rect_corner_8_bg_dark));
            textView.setTextColor(CommonViewExtKt.colorInt(b.ppColorTextPrimary, getContext()));
        } else {
            view.setBackground(getContext().getDrawable(r.cv_rect_corner_8_bg_second_storke_purple));
            textView.setTextColor(CommonViewExtKt.colorInt(b.ppColorPrimary, getContext()));
        }
        if (TextUtils.isEmpty(item.rewardsAmountText)) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(item.rewardsAmountText);
            textView2.setVisibility(0);
        }
    }
}

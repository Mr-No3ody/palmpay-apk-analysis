package Xd;

import Pa.r0;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.teller.bean.PaymentAmountItemBean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Xd.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0784c extends M1.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11143a;

    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        PaymentAmountItemBean item = (PaymentAmountItemBean) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        int itemPosition = getItemPosition(item);
        SpannableStringBuilder spannableStringBuilderL = r0.L(12, 20, 0, item.price);
        TextView textView = (TextView) holder.getView(Pd.c.ira_amount_tv);
        TextView textView2 = (TextView) holder.getView(Pd.c.ira_discount_amount_tv);
        View view = holder.getView(Pd.c.ira_root);
        textView.setText(spannableStringBuilderL);
        int color = getContext().getColor(L6.b.ppColorPrimary);
        if (itemPosition == this.f11143a) {
            view.setBackground(getContext().getResources().getDrawable(com.transsnet.palmpay.custom_view.r.cv_rect_corner_8_bg_second_storke_purple));
            textView.setTextColor(color);
        } else {
            view.setBackground(getContext().getResources().getDrawable(com.transsnet.palmpay.custom_view.r.cv_shape_rect_corner_8_bg_dark));
            textView.setTextColor(getContext().getColor(L6.b.ppColorTextPrimary));
        }
        if (TextUtils.isEmpty(item.discountText)) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(item.discountText);
            textView2.setVisibility(0);
        }
    }
}

package p155k9;

import L6.b;
import M1.j;
import Pa.r0;
import Pd.c;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends j {
    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        long jLongValue = ((Number) obj).longValue();
        Intrinsics.checkNotNullParameter(holder, "holder");
        SpannableStringBuilder spannableStringBuilderL = r0.L(12, 20, 0, jLongValue);
        TextView textView = (TextView) holder.getView(c.ira_amount_tv);
        View view = holder.getView(c.ira_root);
        textView.setText(spannableStringBuilderL);
        view.setBackground(getContext().getResources().getDrawable(com.transsnet.palmpay.custom_view.r.cv_shape_rect_corner_8_bg_dark));
        textView.setTextColor(getContext().getColor(b.ppColorTextPrimary));
    }
}

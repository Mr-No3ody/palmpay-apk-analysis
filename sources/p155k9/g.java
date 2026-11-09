package p155k9;

import L6.b;
import M1.j;
import Pd.c;
import android.widget.TextView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.core.bean.DayPickBean;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38716a;

    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        DayPickBean item = (DayPickBean) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        TextView textView = (TextView) holder.itemView.findViewById(c.cip_tv);
        textView.setText(String.valueOf(item.getDay()));
        if (getItemPosition(item) == this.f38716a) {
            textView.setTextColor(CommonViewExtKt.colorInt(b.ppColorPrimary, getContext()));
            textView.setBackgroundResource(r.cv_shape_rect_corner_8_bg_secondary);
        } else {
            textView.setTextColor(CommonViewExtKt.colorInt(b.ppColorTextPrimary, getContext()));
            textView.setBackgroundResource(0);
        }
    }
}

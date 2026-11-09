package Ae;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends M1.j {
    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        l item = (l) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        ImageView imageView = (ImageView) holder.getViewOrNull(p025ba.e.iv_method_icon);
        Drawable drawable = item.f286b;
        if (drawable != null) {
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            }
            if (imageView != null) {
                imageView.setVisibility(0);
            }
        } else if (imageView != null) {
            imageView.setVisibility(8);
        }
        holder.setText(p025ba.e.tv_method_title, item.f285a);
    }
}

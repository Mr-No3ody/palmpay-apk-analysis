package Vb;

import android.text.TextUtils;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends M1.j {
    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        d item = (d) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        if (!TextUtils.isEmpty(item.f10285a)) {
            holder.setText(com.transsnet.palmpay.custom_view.s.tv_earn_title, item.f10285a);
        }
        String str = item.f10286b;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        holder.setText(com.transsnet.palmpay.custom_view.s.tv_earn_content, str);
    }
}

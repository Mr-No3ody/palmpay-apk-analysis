package S3;

import M1.j;
import android.text.TextUtils;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.flexibank.sdk.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a extends j {
    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        b item = (b) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        if (!TextUtils.isEmpty(item.f8663a)) {
            holder.setText(p.fb_tv_earn_title, item.f8663a);
        }
        String str = item.f8664b;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        holder.setText(p.fb_tv_earn_content, str);
    }
}

package Ua;

import android.text.TextUtils;
import android.widget.ImageView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.core.bean.BillerAccessItem;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class C extends M1.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f9306a;

    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        BillerAccessItem item = (BillerAccessItem) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        ImageView imageView = (ImageView) holder.getViewOrNull(p025ba.e.iv_icon);
        String str = (!this.f9306a || TextUtils.isEmpty(item.darkImage)) ? item.image : item.darkImage;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Pa.r0.i1(imageView, str, Integer.MIN_VALUE, CommonViewExtKt.getDp(60));
    }
}

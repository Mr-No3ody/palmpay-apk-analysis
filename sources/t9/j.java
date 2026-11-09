package t9;

import Pa.r0;
import android.text.TextUtils;
import android.widget.ImageView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.core.bean.BillerAccessItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends M1.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f42364a;

    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        BillerAccessItem item = (BillerAccessItem) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        ImageView imageView = (ImageView) holder.getView(Pd.c.bannerIv);
        String str = (!this.f42364a || TextUtils.isEmpty(item.darkImage)) ? item.image : item.darkImage;
        if (str == null) {
            str = "";
        }
        r0.l1(str, imageView);
    }
}

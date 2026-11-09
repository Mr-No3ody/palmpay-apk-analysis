package p370ye;

import Ac.e;
import M1.j;
import Pa.r0;
import android.text.TextUtils;
import android.widget.ImageView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.main.export.bean.rsp.PremiumBenefitsItemBean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends j {
    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        PremiumBenefitsItemBean item = (PremiumBenefitsItemBean) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        ImageView imageView = (ImageView) holder.getView(e.ivIcon);
        if (!TextUtils.isEmpty(item.icon)) {
            r0.l1(item.icon, imageView);
        }
        int i7 = e.tvTitle;
        String str = item.title;
        if (str == null) {
            str = "";
        }
        holder.setText(i7, str);
        int i10 = e.tvSubTitle;
        String str2 = item.subtitle;
        holder.setText(i10, str2 != null ? str2 : "");
        String str3 = item.label;
        if (str3 == null || str3.length() == 0) {
            holder.setGone(e.ivTag, true);
        } else {
            holder.setGone(e.ivTag, false);
            ImageView imageView2 = (ImageView) holder.getView(e.ivTag);
            if (!TextUtils.isEmpty(item.label)) {
                r0.l1(item.label, imageView2);
            }
        }
        int i11 = e.tvStatus;
        Integer num = item.benefitStatus;
        holder.setGone(i11, num == null || num.intValue() != 2);
        int i12 = e.ivLock;
        Integer num2 = item.benefitStatus;
        holder.setGone(i12, num2 == null || num2.intValue() != 3);
    }
}

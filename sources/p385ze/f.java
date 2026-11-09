package p385ze;

import Ac.e;
import M1.j;
import Pa.r0;
import android.widget.ImageView;
import android.widget.TextView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.main.export.bean.rsp.QueryInsuranceModuleResp;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends j {
    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        QueryInsuranceModuleResp item = (QueryInsuranceModuleResp) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.insuranceName;
        if (str != null) {
            holder.setText(e.tvTitle, str);
        }
        holder.setText(e.tvDesc, item.introduction);
        holder.setText(e.tvAmount, item.premiumDesc);
        holder.setText(e.tvInterval, item.premiumDurationDesc);
        ((ImageView) holder.getView(e.ivPic)).setVisibility(8);
        String str2 = item.headerImageUrl;
        if (str2 != null) {
            ((ImageView) holder.getView(e.ivPic)).setVisibility(0);
            r0.l1(str2, (ImageView) holder.getView(e.ivPic));
        }
        r0.R1((TextView) holder.getView(e.tvAmount), "fonts/PalmPayNum-Bold.ttf");
    }
}

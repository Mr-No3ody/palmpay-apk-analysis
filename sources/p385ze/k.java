package p385ze;

import Ac.e;
import M1.j;
import Pa.r0;
import android.widget.ImageView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.main.export.bean.rsp.QueryTargetSavingModuleResp;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends j {
    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        QueryTargetSavingModuleResp item = (QueryTargetSavingModuleResp) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        holder.setText(e.tvTitle, item.targetCategory);
        holder.setText(e.tvDesc, item.targetDesc);
        String str = item.imageUrl;
        if (str != null) {
            ((ImageView) holder.getView(e.ivPic)).setVisibility(0);
            r0.l1(str, (ImageView) holder.getView(e.ivPic));
        }
    }
}

package E9;

import Pa.r0;
import android.widget.ImageView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.core.bean.rsp.WithdrawalMenuRsp;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends M1.j {
    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        WithdrawalMenuRsp.WithdrawalMenuBean item = (WithdrawalMenuRsp.WithdrawalMenuBean) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        holder.setText(p366y9.b.tvContent, item.getCopywriting());
        r0.v1(item.getPictureUrl(), (ImageView) holder.getView(p366y9.b.ivPic));
        r0.l1(item.getLabelUrl(), (ImageView) holder.getView(p366y9.b.iv_tag));
    }
}

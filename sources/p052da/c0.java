package p052da;

import M1.j;
import android.widget.TextView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.core.bean.rsp.TransactionFilterResp;
import kotlin.jvm.internal.Intrinsics;
import p025ba.e;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends j {
    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        TransactionFilterResp.FilterBean item = (TransactionFilterResp.FilterBean) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        ((TextView) holder.getView(e.tvContent)).setText(item.getName());
        holder.setGone(e.iivIcon, !item.getIsSelected());
    }
}

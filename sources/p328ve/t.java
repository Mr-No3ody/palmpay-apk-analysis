package p328ve;

import Ac.e;
import M1.j;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.main.export.bean.rsp.PaymentMethodListResp;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class t extends j {
    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        PaymentMethodListResp.DataBean.Data item = (PaymentMethodListResp.DataBean.Data) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        holder.setText(e.tvMessage, item.getName());
        ((AppCompatCheckBox) holder.getView(e.itemCheck)).setChecked(item.getPrefered() == 1);
    }
}

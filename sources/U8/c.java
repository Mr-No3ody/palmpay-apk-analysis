package U8;

import M1.j;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.account.bean.AccountHistoryListRsp;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends j {
    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        AccountHistoryListRsp.ItemListBean item = (AccountHistoryListRsp.ItemListBean) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        holder.setText(F8.d.tvMessage, item.itemContent);
        ((AppCompatCheckBox) holder.getView(F8.d.itemCheck)).setChecked(item.check);
    }
}

package Yd;

import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.core.bean.SingleKeyValueBean;
import com.transsnet.palmpay.custom_view.model.OrderResultItemModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends M1.j {
    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        SingleKeyValueBean item = (SingleKeyValueBean) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        View view = holder.itemView;
        if (view instanceof OrderResultItemModel) {
            OrderResultItemModel orderResultItemModel = (OrderResultItemModel) view;
            CharSequence key = item.getKey();
            if (key == null) {
                key = "";
            }
            orderResultItemModel.h(key);
            CharSequence value = item.getValue();
            orderResultItemModel.j(value != null ? value : "");
        }
    }

    @Override // M1.j
    public final BaseViewHolder onCreateDefViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -2);
        OrderResultItemModel orderResultItemModel = new OrderResultItemModel(getContext(), (AttributeSet) null, 0, 0.0f, 8.0f, 0, 46);
        orderResultItemModel.setLayoutParams(layoutParams);
        return createBaseViewHolder(orderResultItemModel);
    }
}

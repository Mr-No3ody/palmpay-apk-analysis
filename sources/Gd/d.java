package Gd;

import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.core.bean.OrderDetailQuestionBean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends M1.j {
    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        OrderDetailQuestionBean item = (OrderDetailQuestionBean) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        holder.setText(p159kd.e.tv_questions, item.title);
    }
}

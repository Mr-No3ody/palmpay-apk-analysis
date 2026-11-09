package Xd;

import android.widget.TextView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.teller.bean.TvRenewDataInfoBean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class F extends M1.j {
    public F() {
        super(Pd.d.qt_layout_item_info_2, null);
        addChildClickViewIds(Pd.c.iv_more);
    }

    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        TvRenewDataInfoBean.Item item = (TvRenewDataInfoBean.Item) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        int i7 = Pd.c.qli_title_tv;
        String key = item.getKey();
        if (key == null) {
            key = "";
        }
        BaseViewHolder text = holder.setText(i7, key);
        int i10 = Pd.c.qli_content_tv;
        String value = item.getValue();
        text.setText(i10, value != null ? value : "");
        TextView textView = (TextView) holder.getView(Pd.c.qli_content_tv);
        textView.setText(item.getValue());
        textView.post(new E(textView, holder, 0));
    }
}

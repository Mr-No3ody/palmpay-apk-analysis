package p385ze;

import Ac.b;
import Ac.d;
import Ac.e;
import M1.j;
import Pa.i0;
import Pa.r0;
import android.widget.ImageView;
import android.widget.TextView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.main.export.bean.rsp.QueryHotStockModuleResp;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.y;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends j {
    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        QueryHotStockModuleResp item = (QueryHotStockModuleResp) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.stockName;
        if (str != null) {
            holder.setText(e.tvTitle, str);
        }
        String str2 = item.changePercent;
        if (str2 != null) {
            holder.setText(e.tvChangePercent, y.k(str2, "-", "") + "%");
            TextView textView = (TextView) holder.getView(e.tvChangePercent);
            if (textView != null) {
                textView.setTextColor(holder.itemView.getContext().getResources().getColor(StringsKt.N(str2, '-') ? b.main_color_d05151 : b.main_color_64D051));
            }
            ((TextView) holder.getView(e.tvChangePercent)).setCompoundDrawablesWithIntrinsicBounds(StringsKt.N(str2, '-') ? d.main_stock_down : d.main_stock_up, 0, 0, 0);
        }
        String str3 = item.logo;
        if (str3 != null) {
            ((ImageView) holder.getView(e.ivPic)).setVisibility(0);
            r0.p1((ImageView) holder.getView(e.ivPic), str3, i0.T());
        }
    }
}

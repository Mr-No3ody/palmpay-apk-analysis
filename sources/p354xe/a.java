package p354xe;

import Ac.e;
import M1.j;
import Pa.n0;
import Pa.r0;
import android.widget.ImageView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.transsnet.palmpay.main.export.bean.rsp.NewExclusiveDataBean;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends j {
    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        NewExclusiveDataBean item = (NewExclusiveDataBean) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        String title = item.getTitle();
        if (title != null) {
            holder.setText(e.text1, y.k(title, "\\n", ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE));
            HashMap map = new HashMap();
            map.put("element_name", title);
            n0.g().w("new_user_bonus_page_element_show", map);
        }
        holder.setText(e.text2, r0.E(item.getRewardAmount()));
        ((ImageView) holder.getView(e.iv_hot)).setVisibility(8);
        if (holder.getAdapterPosition() == 0) {
            ((ImageView) holder.getView(e.iv_hot)).setVisibility(0);
        }
    }
}

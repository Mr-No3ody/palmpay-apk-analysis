package p385ze;

import Ac.e;
import M1.j;
import Pa.r0;
import android.widget.ImageView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.main.export.bean.rsp.InvestGuideBeanRsp;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends j {
    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        InvestGuideBeanRsp.WealthCommentList item = (InvestGuideBeanRsp.WealthCommentList) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.userName;
        if (str != null) {
            holder.setText(e.tvTitle, str);
        }
        int i7 = e.tvDesc;
        String str2 = item.connect;
        if (str2 == null) {
            str2 = "";
        }
        holder.setText(i7, str2);
        String str3 = item.profileUrl;
        if (str3 != null) {
            r0.l1(str3, (ImageView) holder.getView(e.ivPic));
        }
    }
}

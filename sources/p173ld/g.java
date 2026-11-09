package p173ld;

import M1.j;
import Pa.r0;
import android.text.TextUtils;
import android.widget.ImageView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.send_money.bean.RecipientListResp;
import kotlin.jvm.internal.Intrinsics;
import p002a.a;
import p159kd.d;
import p159kd.e;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends j {
    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        RecipientListResp.RecipientBean item = (RecipientListResp.RecipientBean) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        getContext();
        a.r(item.getRecipientHeadImage(), (ImageView) holder.getView(e.ivRecentlyBank));
        holder.setText(e.tvRecentlyBankName, item.getRecipientNickname()).setGone(e.tvRecentlyBankName, TextUtils.isEmpty(item.getRecipientNickname())).setText(e.tvReceiptName, r0.B0(item.getRecipientBankName(), item.getRecipientAccountNumber()));
        if (item.tagType == 1) {
            holder.setGone(e.iv_tag, false).setImageResource(e.iv_tag, d.sm_ic_my_own);
        } else {
            holder.setGone(e.iv_tag, true);
        }
    }
}

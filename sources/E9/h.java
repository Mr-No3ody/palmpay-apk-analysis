package E9;

import C0.G;
import Pa.i0;
import Pa.r0;
import android.widget.ImageView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.core.bean.QueryMemberByCodePlateResp;
import com.transsnet.palmpay.custom_view.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends M1.j {
    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        QueryMemberByCodePlateResp item = (QueryMemberByCodePlateResp) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        BaseViewHolder text = holder.setText(p366y9.b.tv_name, item.businessName);
        int i7 = p366y9.b.tv_account_no;
        String str = item.accountNo;
        if (str == null) {
            str = "";
        }
        text.setText(i7, G.i("Account No. ").append(i0.n(str, false)).setForegroundColor(getContext().getResources().getColor(L6.b.ppColorSuccess)).create());
        String str2 = item.cashBackPictureUrl;
        if (str2 != null) {
            holder.setGone(p366y9.b.ivCashback, false);
            r0.l1(str2, (ImageView) holder.getView(p366y9.b.ivCashback));
        } else {
            holder.setGone(p366y9.b.ivCashback, true);
        }
        holder.setGone(p366y9.b.ivAgent, item.labelType == 0);
        holder.setImageResource(p366y9.b.ivAgent, item.labelType == 1 ? r.cv_sm_ic_send_agent_tag : r.cv_sm_ic_send_merchant_tag);
    }
}

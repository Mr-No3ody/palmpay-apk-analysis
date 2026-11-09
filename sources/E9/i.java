package E9;

import C0.G;
import Pa.i0;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.core.bean.rsp.QueryRecentlyMerchantResp;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends M1.j {
    public i() {
        super(p366y9.c.cash_in_item_recently, null);
    }

    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        QueryRecentlyMerchantResp.Data item = (QueryRecentlyMerchantResp.Data) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        holder.setText(p366y9.b.tv_name, item.getMerchantName()).setText(p366y9.b.tv_account_no, G.i("Account No.").append(i0.n(item.getSnNo(), false)).setForegroundColor(getContext().getResources().getColor(L6.b.ppColorSuccess)).create());
    }
}

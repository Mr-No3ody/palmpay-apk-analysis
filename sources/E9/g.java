package E9;

import C0.G;
import Pa.i0;
import Pa.r0;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.cash_in.bean.response.NearbyAgentsResp;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends M1.j {
    public g() {
        super(p366y9.c.cash_in_item_recently, null);
    }

    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        NearbyAgentsResp.NearbyShopListBean item = (NearbyAgentsResp.NearbyShopListBean) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.accountNo;
        holder.setText(p366y9.b.tv_name, item.networkName).setText(p366y9.b.tv_account_no, G.i("Account No.").append(i0.n(i0.n((str == null || str.length() == 0) ? r0.Z(item.networkMobile) : item.accountNo, false), false)).setForegroundColor(getContext().getResources().getColor(L6.b.ppColorSuccess)).create());
        double d2 = item.distance;
        if (d2 == 0.0d) {
            holder.setText(p366y9.b.tvLocation, "");
        } else {
            holder.setText(p366y9.b.tvLocation, d2 >= 1.0d ? com.airbnb.lottie.model.layer.d.n(new Object[]{Double.valueOf(d2)}, 1, "%.2fkm", "format(...)") : com.airbnb.lottie.model.layer.d.n(new Object[]{Integer.valueOf((int) (d2 * ((double) 1000)))}, 1, "%dm", "format(...)"));
        }
    }
}

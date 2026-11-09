package p052da;

import M1.j;
import Pa.r0;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CouponItem;
import kotlin.jvm.internal.Intrinsics;
import p025ba.e;
import p025ba.g;

/* JADX INFO: loaded from: classes3.dex */
public final class J extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35703a;

    public J(int i7) {
        super(g.core_item_coupon_item2, null);
        this.f35703a = i7;
    }

    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        CouponItem item = (CouponItem) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        holder.setText(e.tvCouponAmount, BaseApplication.getCurrencySymbol() + r0.E(item.nominaValue));
    }

    @Override // M1.j, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return Math.min(getData().size(), this.f35703a);
    }
}

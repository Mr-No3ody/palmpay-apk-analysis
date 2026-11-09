package Xd;

import Pa.r0;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.teller.bean.resp.BillerCouponItemBean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Xd.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0788g extends M1.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11147a;

    public C0788g(int i7) {
        super(p025ba.g.core_item_coupon_item2, null);
        this.f11147a = i7;
    }

    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        BillerCouponItemBean item = (BillerCouponItemBean) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        int i7 = p025ba.e.tvCouponAmount;
        String currencySymbol = BaseApplication.getCurrencySymbol();
        Long nominaValue = item.getNominaValue();
        holder.setText(i7, currencySymbol + r0.E(nominaValue != null ? nominaValue.longValue() : 0L));
    }

    @Override // M1.j, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return Math.min(getData().size(), this.f11147a);
    }
}

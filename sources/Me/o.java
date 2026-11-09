package Me;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.main.export.bean.rsp.HomeCouponRewardsItems;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView f5987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ba.a f5988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final P8.a f5989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f5990d;

    public o(RecyclerView rewardsList, Ba.a onClaimCoupon) {
        Intrinsics.checkNotNullParameter(rewardsList, "rewardsList");
        Intrinsics.checkNotNullParameter(onClaimCoupon, "onClaimCoupon");
        this.f5987a = rewardsList;
        this.f5988b = onClaimCoupon;
        Context context = rewardsList.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f5990d = context;
        rewardsList.setLayoutManager(new LinearLayoutManager(context, 0, false));
        rewardsList.addOnScrollListener(new n());
        P8.a aVar = new P8.a(Ac.f.main_layout_home_coupon_rewards_item, null, 8);
        this.f5989c = aVar;
        rewardsList.setAdapter(aVar);
        rewardsList.addItemDecoration(new Qb.c(0, 0, 0, 12));
        P8.a aVar2 = this.f5989c;
        if (aVar2 != null) {
            aVar2.addChildClickViewIds(Ac.e.btnClaim, Ac.e.btnUse);
        }
        P8.a aVar3 = this.f5989c;
        if (aVar3 != null) {
            aVar3.setOnItemChildClickListener(new Dg.a(this, 29));
        }
    }

    public final void a(int i7, boolean z3) {
        P8.a aVar = this.f5989c;
        if (i7 >= (aVar != null ? aVar.getItemCount() : 0)) {
            return;
        }
        P8.a aVar2 = this.f5989c;
        HomeCouponRewardsItems homeCouponRewardsItems = aVar2 != null ? (HomeCouponRewardsItems) aVar2.getItem(i7) : null;
        if (homeCouponRewardsItems != null) {
            homeCouponRewardsItems.isLoading = z3;
            P8.a aVar3 = this.f5989c;
            if (aVar3 != null) {
                aVar3.notifyItemChanged(i7);
            }
        }
    }
}

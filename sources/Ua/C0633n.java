package Ua;

import android.view.View;
import android.view.ViewStub;
import com.transsnet.palmpay.core.viewmodel.ModelAvailableCouponItem;
import com.transsnet.palmpay.core.viewmodel.ModelClaimCouponListItemView;
import com.transsnet.palmpay.core.viewmodel.ModelCouponListItemView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ua.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0633n implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModelAvailableCouponItem f9436b;

    public /* synthetic */ C0633n(ModelAvailableCouponItem modelAvailableCouponItem, int i7) {
        this.f9435a = i7;
        this.f9436b = modelAvailableCouponItem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ModelAvailableCouponItem modelAvailableCouponItem = this.f9436b;
        switch (this.f9435a) {
            case 0:
                int i7 = ModelAvailableCouponItem.f28246o;
                View viewInflate = ((ViewStub) modelAvailableCouponItem.findViewById(p025ba.e.vs_coupon_claimable_list)).inflate();
                Intrinsics.f(viewInflate, "null cannot be cast to non-null type com.transsnet.palmpay.core.viewmodel.ModelClaimCouponListItemView");
                return (ModelClaimCouponListItemView) viewInflate;
            case 1:
                int i10 = ModelAvailableCouponItem.f28246o;
                View viewInflate2 = ((ViewStub) modelAvailableCouponItem.findViewById(p025ba.e.vs_coupon_available_list)).inflate();
                Intrinsics.f(viewInflate2, "null cannot be cast to non-null type com.transsnet.palmpay.core.viewmodel.ModelCouponListItemView");
                ModelCouponListItemView modelCouponListItemView = (ModelCouponListItemView) viewInflate2;
                modelCouponListItemView.setOnClickListener(new R8.d(modelAvailableCouponItem, 15));
                return modelCouponListItemView;
            default:
                return ModelAvailableCouponItem.a(modelAvailableCouponItem);
        }
    }
}

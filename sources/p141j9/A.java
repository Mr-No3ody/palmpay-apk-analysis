package p141j9;

import Pd.c;
import Rd.H;
import android.view.View;
import android.view.ViewStub;
import com.transsnet.palmpay.airtime.ui.TopupAirtimeActivity;
import com.transsnet.palmpay.airtime.ui.view.ModelAirtimeDataPlanQuickBuyItem;
import com.transsnet.palmpay.airtime.ui.view.ModelAirtimeGoupPurchaseSaleView;
import com.transsnet.palmpay.airtime.viewmodel.AirTimeTopupViewModel;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.teller.ui.view.ModelActivityBannerWithCoupon;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o9.C1911p;
import p140j8.f;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class A implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TopupAirtimeActivity f38363b;

    public /* synthetic */ A(TopupAirtimeActivity topupAirtimeActivity, int i7) {
        this.f38362a = i7;
        this.f38363b = topupAirtimeActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        AirTimeTopupViewModel airTimeTopupViewModel;
        ViewStub viewStub;
        ViewStub viewStub2;
        ViewStub viewStub3;
        ViewStub viewStub4;
        ViewStub viewStub5;
        ViewStub viewStub6;
        TopupAirtimeActivity topupAirtimeActivity = this.f38363b;
        switch (this.f38362a) {
            case 0:
                int i7 = TopupAirtimeActivity.f26495x0;
                AirTimeTopupViewModel airTimeTopupViewModel2 = (AirTimeTopupViewModel) topupAirtimeActivity.l();
                if (airTimeTopupViewModel2 != null) {
                    airTimeTopupViewModel2.f();
                }
                if (BaseApplication.hasLogin() && (airTimeTopupViewModel = (AirTimeTopupViewModel) topupAirtimeActivity.l()) != null) {
                    f.s(airTimeTopupViewModel, new C1911p(1, null), airTimeTopupViewModel.f26626g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                }
                ModelActivityBannerWithCoupon modelActivityBannerWithCoupon = topupAirtimeActivity.f26498C;
                if (modelActivityBannerWithCoupon != null) {
                    modelActivityBannerWithCoupon.f();
                }
                topupAirtimeActivity.z();
                AirTimeTopupViewModel airTimeTopupViewModel3 = (AirTimeTopupViewModel) topupAirtimeActivity.l();
                if (airTimeTopupViewModel3 != null) {
                    airTimeTopupViewModel3.d();
                }
                return Unit.f38893a;
            case 1:
                int i10 = TopupAirtimeActivity.f26495x0;
                H h7 = (H) topupAirtimeActivity.f27334c;
                if (((h7 == null || (viewStub3 = h7.f8058C) == null) ? null : viewStub3.getParent()) != null) {
                    H h10 = (H) topupAirtimeActivity.f27334c;
                    View viewInflate = (h10 == null || (viewStub2 = h10.f8058C) == null) ? null : viewStub2.inflate();
                    if (viewInflate != null) {
                        return (ModelAirtimeDataPlanQuickBuyItem) viewInflate.findViewById(c.model_airtime_data_plan_quick_buy_item);
                    }
                    return null;
                }
                H h11 = (H) topupAirtimeActivity.f27334c;
                if (h11 == null || (viewStub = h11.f8058C) == null) {
                    return null;
                }
                return (ModelAirtimeDataPlanQuickBuyItem) viewStub.findViewById(c.model_airtime_data_plan_quick_buy_item);
            case 2:
                int i11 = TopupAirtimeActivity.f26495x0;
                H h12 = (H) topupAirtimeActivity.f27334c;
                if (((h12 == null || (viewStub6 = h12.f8059H) == null) ? null : viewStub6.getParent()) != null) {
                    H h13 = (H) topupAirtimeActivity.f27334c;
                    View viewInflate2 = (h13 == null || (viewStub5 = h13.f8059H) == null) ? null : viewStub5.inflate();
                    if (viewInflate2 != null) {
                        return (ModelAirtimeGoupPurchaseSaleView) viewInflate2.findViewById(c.modelGoupPurchaseSaleItem);
                    }
                    return null;
                }
                H h14 = (H) topupAirtimeActivity.f27334c;
                if (h14 == null || (viewStub4 = h14.f8059H) == null) {
                    return null;
                }
                return (ModelAirtimeGoupPurchaseSaleView) viewStub4.findViewById(c.modelGoupPurchaseSaleItem);
            default:
                ModelAirtimeDataPlanQuickBuyItem modelAirtimeDataPlanQuickBuyItem = (ModelAirtimeDataPlanQuickBuyItem) topupAirtimeActivity.f26510p.getValue();
                if (modelAirtimeDataPlanQuickBuyItem == null) {
                    return null;
                }
                modelAirtimeDataPlanQuickBuyItem.setOnItemClickListener(new w(topupAirtimeActivity, 4));
                modelAirtimeDataPlanQuickBuyItem.setOnInfoClickListener(new w(topupAirtimeActivity, 5));
                return modelAirtimeDataPlanQuickBuyItem;
        }
    }
}

package p141j9;

import C0.G;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import Pd.f;
import Rd.H;
import com.transsnet.palmpay.airtime.bean.rsp.FlashSalesProductsDataBean;
import com.transsnet.palmpay.airtime.ui.TopupAirtimeActivity;
import com.transsnet.palmpay.airtime.ui.view.DailyFlashSalesView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import kotlin.jvm.internal.Intrinsics;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
public final class F implements DailyFlashSalesView.OnDailyFlashSalesListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TopupAirtimeActivity f38370a;

    public F(TopupAirtimeActivity topupAirtimeActivity) {
        this.f38370a = topupAirtimeActivity;
    }

    @Override // com.transsnet.palmpay.airtime.ui.view.DailyFlashSalesView.OnDailyFlashSalesListener
    public final void onItemClick(FlashSalesProductsDataBean data, int i7) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (!BaseApplication.hasLogin()) {
            i0.K(null, null);
            return;
        }
        long j6 = data.remainingQty;
        TopupAirtimeActivity topupAirtimeActivity = this.f38370a;
        if (j6 <= 0) {
            h.x(topupAirtimeActivity, topupAirtimeActivity.getString(f.qt_airtime_just_sold_out));
            return;
        }
        topupAirtimeActivity.f26502Q = data.sellingPrice;
        topupAirtimeActivity.f26508k0 = data;
        H h7 = (H) topupAirtimeActivity.f27334c;
        if (h7 != null) {
            h7.f8057B.setSelectedPosition(i7);
        }
        if (topupAirtimeActivity.v() || r0.U0()) {
            return;
        }
        TopupAirtimeActivity.G(topupAirtimeActivity, 2, null, 2);
        n0.g().k(((ClickEvent) G.f("airtime_recharge_info_page_element_click", "module_name", "Fund Area-Special Top up")).add("element_name", String.valueOf(topupAirtimeActivity.f26502Q)));
        n0.g().l("Airtime_click_amount");
    }
}

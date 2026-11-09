package p141j9;

import Pa.i0;
import Pa.n0;
import Pa.r0;
import Pd.c;
import android.view.View;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.transsnet.palmpay.airtime.bean.AirtimeDetailData;
import com.transsnet.palmpay.airtime.ui.TopupAirtimeActivity;
import com.transsnet.palmpay.airtime.ui.TopupResultActivityV2;
import com.transsnet.palmpay.airtime.viewmodel.AirTimeResultViewModel;
import com.transsnet.palmpay.core.bean.BillProcessDetail;
import com.transsnet.palmpay.core.bean.OrderInfoForCustomerService;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o9.C1904i;
import p025ba.k;
import p140j8.f;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class H implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TopupResultActivityV2 f38374b;

    public /* synthetic */ H(TopupResultActivityV2 topupResultActivityV2, int i7) {
        this.f38373a = i7;
        this.f38374b = topupResultActivityV2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TopupResultActivityV2 topupResultActivityV2 = this.f38374b;
        switch (this.f38373a) {
            case 0:
                int i7 = TopupResultActivityV2.f26521k0;
                topupResultActivityV2.getClass();
                if (!r0.U0() && i0.W(topupResultActivityV2)) {
                    AirtimeDetailData airtimeDetailData = topupResultActivityV2.f26522A;
                    String orderNo = airtimeDetailData != null ? airtimeDetailData.getOrderNo() : null;
                    if (orderNo != null && !StringsKt.F(orderNo)) {
                        AirTimeResultViewModel airTimeResultViewModel = (AirTimeResultViewModel) topupResultActivityV2.l();
                        airTimeResultViewModel.getClass();
                        Intrinsics.checkNotNullParameter(orderNo, "orderNo");
                        f.s(airTimeResultViewModel, new C1904i(orderNo, null), airTimeResultViewModel.f26609e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                        break;
                    }
                }
                break;
            case 1:
                int i10 = TopupResultActivityV2.f26521k0;
                int id2 = view.getId();
                if (id2 == c.actur_topup_again_btn) {
                    i0.G(TopupAirtimeActivity.class);
                    n0.g().l("PPay_Airtime_Btn_Top up Airtime");
                    topupResultActivityV2.finish();
                } else if (id2 == c.tv_view_detail || id2 == c.iv_view_detail) {
                    n0.g().l("PPay_Airtime_Btn_View Detail");
                    ARouter.getInstance().build("/airtime/billdetail").withString("orderNo", topupResultActivityV2.f26541w).navigation();
                }
                break;
            case 2:
                topupResultActivityV2.f26530Y = true;
                d.x(null, "NotificationSettings");
                break;
            case 3:
                int i11 = TopupResultActivityV2.f26521k0;
                topupResultActivityV2.getOnBackPressedDispatcher().d();
                break;
            default:
                AirtimeDetailData airtimeDetailData2 = topupResultActivityV2.f26522A;
                if (airtimeDetailData2 != null) {
                    OrderInfoForCustomerService orderInfoForCustomerService = new OrderInfoForCustomerService();
                    orderInfoForCustomerService.paymentType = topupResultActivityV2.getString(k.core_top_up_airtime);
                    Long updateTime = airtimeDetailData2.getUpdateTime();
                    orderInfoForCustomerService.time = updateTime != null ? updateTime.longValue() : 0L;
                    Long payAmount = airtimeDetailData2.getPayAmount();
                    orderInfoForCustomerService.amount = payAmount != null ? payAmount.longValue() : 0L;
                    Long payFee = airtimeDetailData2.getPayFee();
                    orderInfoForCustomerService.fee = payFee != null ? payFee.longValue() : 0L;
                    orderInfoForCustomerService.orderNumber = airtimeDetailData2.getOrderNo();
                    orderInfoForCustomerService.orderStatus = airtimeDetailData2.getOrderStatusDesc();
                    Long taxFee = airtimeDetailData2.getTaxFee();
                    orderInfoForCustomerService.vat = taxFee != null ? taxFee.longValue() : 0L;
                    Long loyaltyPoint = airtimeDetailData2.getLoyaltyPoint();
                    orderInfoForCustomerService.pointsUsed = loyaltyPoint != null ? loyaltyPoint.longValue() : 0L;
                    Long returnPoint = airtimeDetailData2.getReturnPoint();
                    orderInfoForCustomerService.pointsEarned = returnPoint != null ? returnPoint.longValue() : 0L;
                    BillProcessDetail orderStatusInfo = airtimeDetailData2.getOrderStatusInfo();
                    orderInfoForCustomerService.faqUrl = orderStatusInfo != null ? orderStatusInfo.faqLink : null;
                    BillProcessDetail orderStatusInfo2 = airtimeDetailData2.getOrderStatusInfo();
                    orderInfoForCustomerService.feedbackLink = orderStatusInfo2 != null ? orderStatusInfo2.feedbackLink : null;
                    orderInfoForCustomerService.transType = airtimeDetailData2.getTransType();
                    i0.M(topupResultActivityV2, orderInfoForCustomerService);
                }
                break;
        }
    }
}

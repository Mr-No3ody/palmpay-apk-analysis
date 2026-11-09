package p054dd;

import Pa.i0;
import android.view.View;
import com.transsnet.palmpay.airtime.bean.rsp.R2COrderDetailResp;
import com.transsnet.palmpay.core.bean.BillProcessDetail;
import com.transsnet.palmpay.core.bean.OrderInfoForCustomerService;
import com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel;
import com.transsnet.palmpay.r2c.ui.activity.Recharge2CashDetailActivity;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements OrderResultCustomerServiceModel.OnCustomerServiceModelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Recharge2CashDetailActivity f35871a;

    public a(Recharge2CashDetailActivity recharge2CashDetailActivity) {
        this.f35871a = recharge2CashDetailActivity;
    }

    @Override // com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel.OnCustomerServiceModelListener
    public final void onLeftClick(View v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        int i7 = Recharge2CashDetailActivity.f33114f;
        Recharge2CashDetailActivity recharge2CashDetailActivity = this.f35871a;
        recharge2CashDetailActivity.getClass();
        OrderInfoForCustomerService orderInfoForCustomerService = new OrderInfoForCustomerService();
        R2COrderDetailResp r2COrderDetailResp = recharge2CashDetailActivity.f33116e;
        if (r2COrderDetailResp != null) {
            orderInfoForCustomerService.paymentType = recharge2CashDetailActivity.getString(k.core_top_up_airtime);
            orderInfoForCustomerService.time = r2COrderDetailResp.updateTime;
            orderInfoForCustomerService.amount = r2COrderDetailResp.sharedAmount;
            orderInfoForCustomerService.fee = r2COrderDetailResp.convenienceFee;
            orderInfoForCustomerService.orderNumber = r2COrderDetailResp.orderNo;
            orderInfoForCustomerService.orderStatus = recharge2CashDetailActivity.n(r2COrderDetailResp.orderStatus);
            orderInfoForCustomerService.vat = r2COrderDetailResp.payeeVat;
            orderInfoForCustomerService.pointsUsed = 0L;
            orderInfoForCustomerService.pointsEarned = 0L;
            BillProcessDetail billProcessDetail = r2COrderDetailResp.orderStatusInfo;
            orderInfoForCustomerService.faqUrl = billProcessDetail.faqLink;
            orderInfoForCustomerService.feedbackLink = billProcessDetail.feedbackLink;
            orderInfoForCustomerService.transType = r2COrderDetailResp.transType;
            orderInfoForCustomerService.paymentMethod = "Recharge2cash";
        }
        i0.M(recharge2CashDetailActivity, orderInfoForCustomerService);
    }

    @Override // com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel.OnCustomerServiceModelListener
    public final void onRightClick(View v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
    }
}

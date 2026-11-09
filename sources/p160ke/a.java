package p160ke;

import Pa.i0;
import Pa.r0;
import android.view.View;
import com.transsnet.palmpay.core.bean.OrderInfoForCustomerService;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.rsp.BuyEarlyRefundOrderDetailRsp;
import com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel;
import com.transsnet.palmpay.ui.activity.detail.BuyEarlyRefundDetailActivity;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements OrderResultCustomerServiceModel.OnCustomerServiceModelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BuyEarlyRefundDetailActivity f38748a;

    public a(BuyEarlyRefundDetailActivity buyEarlyRefundDetailActivity) {
        this.f38748a = buyEarlyRefundDetailActivity;
    }

    @Override // com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel.OnCustomerServiceModelListener
    public final void onLeftClick(View v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        BuyEarlyRefundDetailActivity buyEarlyRefundDetailActivity = this.f38748a;
        buyEarlyRefundDetailActivity.getClass();
        OrderInfoForCustomerService orderInfoForCustomerService = new OrderInfoForCustomerService();
        if (buyEarlyRefundDetailActivity.f34673d != null) {
            orderInfoForCustomerService.paymentType = buyEarlyRefundDetailActivity.getString(k.core_top_up_airtime);
            BuyEarlyRefundOrderDetailRsp.DataBean dataBean = buyEarlyRefundDetailActivity.f34673d;
            Intrinsics.e(dataBean);
            orderInfoForCustomerService.time = dataBean.updateTime;
            BuyEarlyRefundOrderDetailRsp.DataBean dataBean2 = buyEarlyRefundDetailActivity.f34673d;
            Intrinsics.e(dataBean2);
            orderInfoForCustomerService.amount = dataBean2.amount;
            BuyEarlyRefundOrderDetailRsp.DataBean dataBean3 = buyEarlyRefundDetailActivity.f34673d;
            Intrinsics.e(dataBean3);
            orderInfoForCustomerService.orderNumber = dataBean3.orderNo;
            orderInfoForCustomerService.transType = "04";
        }
        i0.M(buyEarlyRefundDetailActivity, orderInfoForCustomerService);
    }

    @Override // com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel.OnCustomerServiceModelListener
    public final void onRightClick(View v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        BuyEarlyRefundOrderDetailRsp.DataBean dataBean = this.f38748a.f34673d;
        if (dataBean != null) {
            i0.J(TransType.TRANS_TYPE_AUTO_DEDUCT, dataBean.orderNo, r0.q0(dataBean.payerAccountType, dataBean.bankName, dataBean.payerCardNo), "Early Refund");
        }
    }
}

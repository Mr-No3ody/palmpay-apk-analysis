package p270rd;

import Pa.i0;
import android.net.Uri;
import android.view.View;
import androidx.camera.camera2.internal.F;
import com.transsnet.palmpay.core.bean.BillProcessDetail;
import com.transsnet.palmpay.core.bean.OrderInfoForCustomerService;
import com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel;
import com.transsnet.palmpay.send_money.bean.resp.CompensationDetailResp;
import com.transsnet.palmpay.send_money.ui.activity.CompensationDetailActivity;
import kotlin.jvm.internal.Intrinsics;
import p159kd.h;

/* JADX INFO: renamed from: rd.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1963f implements OrderResultCustomerServiceModel.OnCustomerServiceModelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CompensationDetailActivity f41741a;

    public C1963f(CompensationDetailActivity compensationDetailActivity) {
        this.f41741a = compensationDetailActivity;
    }

    @Override // com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel.OnCustomerServiceModelListener
    public final void onLeftClick(View v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        CompensationDetailActivity compensationDetailActivity = this.f41741a;
        if (compensationDetailActivity.f33171j != null) {
            OrderInfoForCustomerService orderInfoForCustomerService = new OrderInfoForCustomerService();
            CompensationDetailResp compensationDetailResp = compensationDetailActivity.f33171j;
            if (compensationDetailResp != null) {
                orderInfoForCustomerService.paymentType = compensationDetailActivity.getString(h.sm_money_transfer_label);
                Long gmtCreated = compensationDetailResp.getGmtCreated();
                orderInfoForCustomerService.time = gmtCreated != null ? gmtCreated.longValue() : 0L;
                Long payAmount = compensationDetailResp.getPayAmount();
                orderInfoForCustomerService.amount = payAmount != null ? payAmount.longValue() : 0L;
                orderInfoForCustomerService.orderNumber = compensationDetailResp.getOrderNo();
                orderInfoForCustomerService.orderStatus = compensationDetailResp.getOrderStatusDesc();
                BillProcessDetail orderStatusInfo = compensationDetailResp.getOrderStatusInfo();
                if (orderStatusInfo != null) {
                    orderInfoForCustomerService.faqUrl = orderStatusInfo.faqLink;
                }
                orderInfoForCustomerService.transType = "03";
            }
            i0.M(compensationDetailActivity, orderInfoForCustomerService);
        }
    }

    @Override // com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel.OnCustomerServiceModelListener
    public final void onRightClick(View v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        CompensationDetailResp compensationDetailResp = this.f41741a.f33171j;
        if (compensationDetailResp != null) {
            String orderNo = compensationDetailResp.getOrderNo();
            String strEncode = Uri.encode(compensationDetailResp.getReceiveMethod());
            String strEncode2 = Uri.encode(compensationDetailResp.getPaymentTypeDesc());
            StringBuilder sbF = F.f("orderType=1&orderNo=", orderNo, "&paymentMethod=", strEncode, "&paymentType=");
            sbF.append(strEncode2);
            i0.a0(sbF.toString());
        }
    }
}

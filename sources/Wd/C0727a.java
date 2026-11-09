package Wd;

import Pa.i0;
import android.view.View;
import com.transsnet.palmpay.core.bean.OrderInfoForCustomerService;
import com.transsnet.palmpay.core.bean.bill.TransTypeUtils;
import com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel;
import com.transsnet.palmpay.teller.bean.AgentOrderDetailRsp;
import com.transsnet.palmpay.teller.ui.activity.AgentOrderDetailActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Wd.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0727a implements OrderResultCustomerServiceModel.OnCustomerServiceModelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AgentOrderDetailActivity f10747a;

    public C0727a(AgentOrderDetailActivity agentOrderDetailActivity) {
        this.f10747a = agentOrderDetailActivity;
    }

    @Override // com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel.OnCustomerServiceModelListener
    public final void onLeftClick(View v3) {
        OrderInfoForCustomerService orderInfoForCustomerService;
        Intrinsics.checkNotNullParameter(v3, "v");
        AgentOrderDetailActivity agentOrderDetailActivity = this.f10747a;
        AgentOrderDetailRsp.DataBean dataBean = agentOrderDetailActivity.f34142f;
        if (dataBean != null) {
            String str = p070ee.c.f36289a;
            orderInfoForCustomerService = new OrderInfoForCustomerService();
            orderInfoForCustomerService.paymentType = TransTypeUtils.translateTransType(dataBean.transType);
            orderInfoForCustomerService.time = dataBean.completeTime;
            orderInfoForCustomerService.amount = dataBean.businessAmount;
            orderInfoForCustomerService.fee = dataBean.withholdingTax;
            orderInfoForCustomerService.orderNumber = dataBean.orderNo;
            orderInfoForCustomerService.orderStatus = dataBean.orderStatusDesc;
            orderInfoForCustomerService.transType = dataBean.transType;
            orderInfoForCustomerService.faqUrl = dataBean.faqLink;
            orderInfoForCustomerService.feedbackLink = dataBean.feedbackLink;
            orderInfoForCustomerService.paymentMethod = agentOrderDetailActivity.f34143g;
        } else {
            orderInfoForCustomerService = null;
        }
        if (orderInfoForCustomerService != null) {
            i0.M(agentOrderDetailActivity, orderInfoForCustomerService);
        }
    }

    @Override // com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel.OnCustomerServiceModelListener
    public final void onRightClick(View v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
    }
}

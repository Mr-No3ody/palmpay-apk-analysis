package Wd;

import Pa.i0;
import android.view.View;
import com.transsnet.palmpay.core.bean.OrderInfoForCustomerService;
import com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel;
import com.transsnet.palmpay.teller.bean.BillPaymentOrderDetailRsp;
import com.transsnet.palmpay.teller.ui.activity.BillPaymentOrderDetailActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Wd.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0735i implements OrderResultCustomerServiceModel.OnCustomerServiceModelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BillPaymentOrderDetailActivity f10762a;

    public C0735i(BillPaymentOrderDetailActivity billPaymentOrderDetailActivity) {
        this.f10762a = billPaymentOrderDetailActivity;
    }

    @Override // com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel.OnCustomerServiceModelListener
    public final void onLeftClick(View v3) {
        OrderInfoForCustomerService orderInfoForCustomerServiceA;
        Intrinsics.checkNotNullParameter(v3, "v");
        BillPaymentOrderDetailActivity billPaymentOrderDetailActivity = this.f10762a;
        BillPaymentOrderDetailRsp billPaymentOrderDetailRsp = billPaymentOrderDetailActivity.f34165f;
        if (billPaymentOrderDetailRsp != null) {
            orderInfoForCustomerServiceA = p070ee.c.a(billPaymentOrderDetailRsp);
            if (orderInfoForCustomerServiceA != null) {
                orderInfoForCustomerServiceA.paymentMethod = billPaymentOrderDetailActivity.f34166g;
            }
        } else {
            orderInfoForCustomerServiceA = null;
        }
        if (orderInfoForCustomerServiceA != null) {
            i0.M(billPaymentOrderDetailActivity, orderInfoForCustomerServiceA);
        }
    }

    @Override // com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel.OnCustomerServiceModelListener
    public final void onRightClick(View v3) {
        OrderInfoForCustomerService orderInfoForCustomerServiceA;
        Intrinsics.checkNotNullParameter(v3, "v");
        BillPaymentOrderDetailActivity billPaymentOrderDetailActivity = this.f10762a;
        BillPaymentOrderDetailRsp billPaymentOrderDetailRsp = billPaymentOrderDetailActivity.f34165f;
        if (billPaymentOrderDetailRsp != null) {
            orderInfoForCustomerServiceA = p070ee.c.a(billPaymentOrderDetailRsp);
            if (orderInfoForCustomerServiceA != null) {
                orderInfoForCustomerServiceA.paymentMethod = billPaymentOrderDetailActivity.f34166g;
            }
        } else {
            orderInfoForCustomerServiceA = null;
        }
        if (orderInfoForCustomerServiceA != null) {
            i0.N(orderInfoForCustomerServiceA);
        }
    }
}

package p238pe;

import Ac.e;
import Pa.i0;
import android.view.View;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.bean.OrderInfoForCustomerService;
import com.transsnet.palmpay.main.export.bean.rsp.PayCodeOrderDetailBean;
import com.transsnet.palmpay.ui.activity.paycode.PayCodeTransactionResultActivity;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PayCodeTransactionResultActivity f41301b;

    public /* synthetic */ b(PayCodeTransactionResultActivity payCodeTransactionResultActivity, int i7) {
        this.f41300a = i7;
        this.f41301b = payCodeTransactionResultActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        OrderInfoForCustomerService orderInfoForCustomerService = null;
        PayCodeTransactionResultActivity payCodeTransactionResultActivity = this.f41301b;
        switch (this.f41300a) {
            case 0:
                int i7 = PayCodeTransactionResultActivity.f34792A;
                payCodeTransactionResultActivity.getClass();
                PayCodeOrderDetailBean payCodeOrderDetailBean = payCodeTransactionResultActivity.t;
                if (payCodeOrderDetailBean != null) {
                    orderInfoForCustomerService = new OrderInfoForCustomerService();
                    orderInfoForCustomerService.paymentType = Intrinsics.c(payCodeTransactionResultActivity.f34794d, "73") ? payCodeTransactionResultActivity.getString(k.core_palmpay_code) : payCodeTransactionResultActivity.getString(k.core_merchant_payment);
                    Long l5 = payCodeOrderDetailBean.updateTime;
                    orderInfoForCustomerService.time = l5 != null ? l5.longValue() : 0L;
                    Long l6 = payCodeOrderDetailBean.amount;
                    orderInfoForCustomerService.amount = l6 != null ? l6.longValue() : 0L;
                    orderInfoForCustomerService.orderNumber = payCodeOrderDetailBean.orderNo;
                    orderInfoForCustomerService.orderStatus = payCodeOrderDetailBean.orderStatusDesc;
                    orderInfoForCustomerService.faqUrl = payCodeOrderDetailBean.faqLink;
                    orderInfoForCustomerService.transType = payCodeOrderDetailBean.transType;
                    orderInfoForCustomerService.paymentMethod = payCodeOrderDetailBean.payTypeDesc;
                }
                if (orderInfoForCustomerService != null) {
                    i0.M(payCodeTransactionResultActivity, orderInfoForCustomerService);
                }
                break;
            default:
                int i10 = PayCodeTransactionResultActivity.f34792A;
                int id2 = view.getId();
                if (id2 == e.tvComplete) {
                    payCodeTransactionResultActivity.getClass();
                    if (!Intrinsics.c(payCodeTransactionResultActivity.f34794d, "73")) {
                        payCodeTransactionResultActivity.m();
                    } else {
                        i0.H(null);
                    }
                } else if (id2 == e.tvDetail || id2 == e.ivDetail) {
                    payCodeTransactionResultActivity.getClass();
                    PayCodeOrderDetailBean payCodeOrderDetailBean2 = payCodeTransactionResultActivity.t;
                    if (payCodeOrderDetailBean2 != null) {
                        ARouter.getInstance().build("/main/paycode_order_detail").withString("orderNo", payCodeOrderDetailBean2.orderNo).withString("extra_type", payCodeOrderDetailBean2.subTransType).navigation();
                    }
                }
                break;
        }
    }
}

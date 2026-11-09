package p146je;

import Pa.i0;
import android.view.View;
import com.transsnet.palmpay.bean.CouponPackageOrderBean;
import com.transsnet.palmpay.core.bean.OrderInfoForCustomerService;
import com.transsnet.palmpay.core.bean.bill.SubTransType;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.ui.activity.coupon.CouponPackageResultActivity;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CouponPackageResultActivity f38592b;

    public /* synthetic */ a(CouponPackageResultActivity couponPackageResultActivity, int i7) {
        this.f38591a = i7;
        this.f38592b = couponPackageResultActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CouponPackageResultActivity couponPackageResultActivity = this.f38592b;
        switch (this.f38591a) {
            case 0:
                int i7 = CouponPackageResultActivity.f34663o;
                couponPackageResultActivity.p();
                break;
            case 1:
                int i10 = CouponPackageResultActivity.f34663o;
                couponPackageResultActivity.p();
                break;
            case 2:
                CouponPackageOrderBean couponPackageOrderBean = couponPackageResultActivity.f34665d;
                if (couponPackageOrderBean != null) {
                    OrderInfoForCustomerService orderInfoForCustomerService = new OrderInfoForCustomerService();
                    Long l5 = couponPackageOrderBean.payFinishTime;
                    orderInfoForCustomerService.time = l5 != null ? l5.longValue() : 0L;
                    Long l6 = couponPackageOrderBean.payAmount;
                    orderInfoForCustomerService.amount = l6 != null ? l6.longValue() : 0L;
                    orderInfoForCustomerService.orderNumber = couponPackageOrderBean.orderNo;
                    orderInfoForCustomerService.orderStatus = couponPackageOrderBean.orderStatusDesc;
                    orderInfoForCustomerService.transType = TransType.TRANS_TYPE_ACTIVITY;
                    i0.M(couponPackageResultActivity, orderInfoForCustomerService);
                }
                break;
            default:
                CouponPackageOrderBean couponPackageOrderBean2 = couponPackageResultActivity.f34665d;
                if (couponPackageOrderBean2 != null) {
                    Ea.a.e(TransType.TRANS_TYPE_ACTIVITY, couponPackageOrderBean2.orderNo, SubTransType.INSTANCE.getSUB_TRANS_TYPE_COUPON_PACKAGE());
                }
                break;
        }
    }
}

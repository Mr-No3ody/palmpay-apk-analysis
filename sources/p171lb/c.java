package p171lb;

import C0.G;
import Pa.r0;
import android.app.Activity;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.credit.bean.req.CLWithdrawReq;
import com.transsnet.palmpay.credit.bean.req.OrderExtendData;
import com.transsnet.palmpay.credit.bean.resp.CLBorrowCouponData;
import com.transsnet.palmpay.credit.bean.resp.CLRepaymentPlanData;
import com.transsnet.palmpay.credit.bean.resp.CLShortCashRepaymentPlanData;
import com.transsnet.palmpay.credit.bean.resp.CLShortCashRepaymentPlanResp;
import com.transsnet.palmpay.credit.bean.resp.RepaymentPlan;
import com.transsnet.palmpay.credit.logicmanager.OneTouchBorrowManager$OneTouchBorrowListener;
import com.transsnet.palmpay.credit.ui.fragment.CLMainFragment;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.SPUtils;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p071ef.b;
import p298tf.f;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f39296f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final t f39297g = C2131j.b(new com.transsnet.palmpay.managemoney.ui.view.c(29));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f39298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f39299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CLRepaymentPlanData f39300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CLMainFragment f39301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OneTouchBorrowManager$OneTouchBorrowListener f39302e;

    public static final void a(c cVar, Disposable disposable) {
        cVar.getClass();
        CLMainFragment cLMainFragment = cVar.f39301d;
        if (cLMainFragment != null) {
            if (cLMainFragment != null) {
                cLMainFragment.f(disposable);
            }
        } else {
            Activity topActivity = ActivityUtils.getTopActivity();
            if (topActivity instanceof BaseActivity) {
                ((BaseActivity) topActivity).addSubscription(disposable);
            }
        }
    }

    public static final void b(c cVar, CLShortCashRepaymentPlanResp cLShortCashRepaymentPlanResp) {
        OneTouchBorrowManager$OneTouchBorrowListener oneTouchBorrowManager$OneTouchBorrowListener;
        cVar.getClass();
        CLShortCashRepaymentPlanData data = cLShortCashRepaymentPlanResp.getData();
        List<CLRepaymentPlanData> calcRepayPlanForFCAndCouponDTOS = data != null ? data.getCalcRepayPlanForFCAndCouponDTOS() : null;
        if (calcRepayPlanForFCAndCouponDTOS == null || calcRepayPlanForFCAndCouponDTOS.isEmpty()) {
            return;
        }
        ArrayList arrayList = cVar.f39299b;
        arrayList.clear();
        CLShortCashRepaymentPlanData data2 = cLShortCashRepaymentPlanResp.getData();
        List<CLRepaymentPlanData> calcRepayPlanForFCAndCouponDTOS2 = data2 != null ? data2.getCalcRepayPlanForFCAndCouponDTOS() : null;
        Intrinsics.e(calcRepayPlanForFCAndCouponDTOS2);
        arrayList.addAll(calcRepayPlanForFCAndCouponDTOS2);
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (Intrinsics.c(((CLRepaymentPlanData) arrayList.get(i7)).getSelect(), Boolean.TRUE)) {
                CLRepaymentPlanData cLRepaymentPlanData = (CLRepaymentPlanData) arrayList.get(i7);
                cVar.f39300c = cLRepaymentPlanData;
                if (cLRepaymentPlanData == null || (oneTouchBorrowManager$OneTouchBorrowListener = cVar.f39302e) == null) {
                    return;
                }
                oneTouchBorrowManager$OneTouchBorrowListener.onOneTouchBorrowInfoSuccess(cLRepaymentPlanData);
                return;
            }
        }
    }

    public final void c() {
        Integer discountType;
        Integer couponDiscountInfo;
        Long couponId;
        RepaymentPlan repaymentPlan;
        CLRepaymentPlanData cLRepaymentPlanData = this.f39300c;
        if (cLRepaymentPlanData != null) {
            Long loanAmount = cLRepaymentPlanData.getLoanAmount();
            List<RepaymentPlan> repaymentPlanList = cLRepaymentPlanData.getRepaymentPlanList();
            Long repaymentDate = (repaymentPlanList == null || (repaymentPlan = repaymentPlanList.get(0)) == null) ? null : repaymentPlan.getRepaymentDate();
            String string = SPUtils.get().getString("cl_borrow_last_order_id");
            CLBorrowCouponData coupon = cLRepaymentPlanData.getCoupon();
            Long lValueOf = Long.valueOf((coupon == null || (couponId = coupon.getCouponId()) == null) ? 0L : couponId.longValue());
            Integer reductionWay = cLRepaymentPlanData.getReductionWay();
            if (reductionWay != null && reductionWay.intValue() == 2) {
                discountType = cLRepaymentPlanData.getDiscountType();
            } else {
                CLBorrowCouponData coupon2 = cLRepaymentPlanData.getCoupon();
                discountType = coupon2 != null ? coupon2.getDiscountType() : null;
            }
            Integer reductionWay2 = cLRepaymentPlanData.getReductionWay();
            if (reductionWay2 != null && reductionWay2.intValue() == 2) {
                couponDiscountInfo = Integer.valueOf(r0.w1(String.valueOf(cLRepaymentPlanData.getDiscountRatio()), "100").intValueExact());
            } else {
                CLBorrowCouponData coupon3 = cLRepaymentPlanData.getCoupon();
                couponDiscountInfo = coupon3 != null ? coupon3.getCouponDiscountInfo() : null;
            }
            OrderExtendData orderExtendData = new OrderExtendData(cLRepaymentPlanData.getRepaymentPlanList(), null, cLRepaymentPlanData.getTerm(), cLRepaymentPlanData.getProductSubId(), Boolean.valueOf(this.f39298a));
            Integer reductionWay3 = cLRepaymentPlanData.getReductionWay();
            Integer numValueOf = Integer.valueOf(reductionWay3 != null ? reductionWay3.intValue() : 0);
            CLBorrowCouponData coupon4 = cLRepaymentPlanData.getCoupon();
            CLWithdrawReq cLWithdrawReq = new CLWithdrawReq(loanAmount, repaymentDate, string, lValueOf, discountType, couponDiscountInfo, orderExtendData, numValueOf, coupon4 != null ? coupon4.getNominaValue() : null, 23, null, 1024, null);
            p221ob.c.f40268a.getInstance().getClass();
            p221ob.c.a().clCreateBorrowOrder(cLWithdrawReq).k(f.f42629b).i(b.a()).subscribe(new b(this, 0));
        }
    }

    public final void d(int i7, int i10, CLMainFragment cLMainFragment, OneTouchBorrowManager$OneTouchBorrowListener oneTouchBorrowManager$OneTouchBorrowListener) {
        this.f39301d = cLMainFragment;
        this.f39302e = oneTouchBorrowManager$OneTouchBorrowListener;
        G.h(p221ob.c.f40268a).queryFirstLoanRx(Integer.valueOf(i7), Integer.valueOf(i10)).k(f.f42629b).i(b.a()).subscribe(new b(this, 4));
    }
}

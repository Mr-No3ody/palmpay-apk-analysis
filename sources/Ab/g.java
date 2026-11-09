package Ab;

import Pa.r0;
import android.content.Context;
import android.text.SpannableStringBuilder;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.credit.bean.BorrowAllDiscountConfig;
import com.transsnet.palmpay.credit.bean.resp.CLBorrowCouponData;
import com.transsnet.palmpay.credit.bean.resp.CLBorrowCouponResp;
import com.transsnet.palmpay.credit.bean.resp.CLRepaymentPlanData;
import com.transsnet.palmpay.credit.bean.resp.CLRepaymentPlanResp;
import com.transsnet.palmpay.credit.bean.rsp.CLCanBorrowData;
import com.transsnet.palmpay.credit.bean.rsp.CLCanBorrowResp;
import com.transsnet.palmpay.credit.ui.dialog.CLCouponDialog;
import com.transsnet.palmpay.credit.ui.fragment.cashloan.CLBorrowBaseFragment;
import com.transsnet.palmpay.custom_view.AmountEditText;
import com.transsnet.palmpay.util.SpanUtils;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f124f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ CLBorrowBaseFragment f125g;

    public /* synthetic */ g(CLBorrowBaseFragment cLBorrowBaseFragment, int i7) {
        this.f124f = i7;
        this.f125g = cLBorrowBaseFragment;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        switch (this.f124f) {
            case 0:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f125g.f(d2);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f125g.f(d2);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f125g.f(d2);
                break;
            default:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f125g.f(d2);
                break;
        }
    }

    @Override // Z4.e
    public final void w(String message) {
        switch (this.f124f) {
            case 0:
                Intrinsics.checkNotNullParameter(message, "message");
                this.f125g.showLoadingDialog(false);
                ToastUtils.showShort(message, new Object[0]);
                break;
            case 1:
                this.f125g.f30515E1 = false;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(message, "message");
                this.f125g.showLoadingDialog(false);
                ToastUtils.showShort(message, new Object[0]);
                break;
            default:
                Intrinsics.checkNotNullParameter(message, "message");
                this.f125g.showLoadingDialog(false);
                ToastUtils.showShort(message, new Object[0]);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0110  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Z4.e
    public final void y(Object obj) {
        CLCanBorrowData cLCanBorrowData;
        Long maxLoanAmt;
        Long maxLoanAmt2;
        Context context;
        CLBorrowCouponData coupon;
        switch (this.f124f) {
            case 0:
                CLCanBorrowResp cLCanBorrowResp = (CLCanBorrowResp) obj;
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f125g;
                cLBorrowBaseFragment.showLoadingDialog(false);
                if (cLCanBorrowResp == null || !cLCanBorrowResp.isSuccess() || (cLCanBorrowData = cLCanBorrowResp.data) == null) {
                    ToastUtils.showShort(cLCanBorrowResp != null ? cLCanBorrowResp.getRespMsg() : null, new Object[0]);
                } else {
                    cLBorrowBaseFragment.f30555l1 = cLCanBorrowData;
                    if (Intrinsics.c(cLCanBorrowData.can, Boolean.FALSE)) {
                        cLBorrowBaseFragment.showLoadingDialog(false);
                        CLCanBorrowData cLCanBorrowData2 = cLBorrowBaseFragment.f30555l1;
                        ToastUtils.showLong(cLCanBorrowData2 != null ? cLCanBorrowData2.msg : null, new Object[0]);
                        cLBorrowBaseFragment.a0(false);
                    }
                    AmountEditText amountEditTextX = cLBorrowBaseFragment.x();
                    SpanUtils spanUtils = new SpanUtils();
                    int i7 = Ya.g.cs_cl_borrow_hint;
                    CLCanBorrowData cLCanBorrowData3 = cLBorrowBaseFragment.f30555l1;
                    long jLongValue = 0;
                    amountEditTextX.setHint(spanUtils.append(cLBorrowBaseFragment.getString(i7, r0.B((cLCanBorrowData3 == null || (maxLoanAmt2 = cLCanBorrowData3.getMaxLoanAmt()) == null) ? 0L : maxLoanAmt2.longValue(), false))).setFontSize(20, true).create());
                    AmountEditText amountEditTextX2 = cLBorrowBaseFragment.x();
                    CLCanBorrowData cLCanBorrowData4 = cLBorrowBaseFragment.f30555l1;
                    if (cLCanBorrowData4 != null && (maxLoanAmt = cLCanBorrowData4.getMaxLoanAmt()) != null) {
                        jLongValue = maxLoanAmt.longValue();
                    }
                    amountEditTextX2.setText(new SpannableStringBuilder(r0.n0(jLongValue)));
                    cLBorrowBaseFragment.d0(false);
                    cLBorrowBaseFragment.t();
                }
                break;
            case 1:
                CommonBeanResult commonBeanResult = (CommonBeanResult) obj;
                CLBorrowBaseFragment cLBorrowBaseFragment2 = this.f125g;
                cLBorrowBaseFragment2.f30515E1 = false;
                cLBorrowBaseFragment2.f30579x1 = commonBeanResult != null ? (BorrowAllDiscountConfig) commonBeanResult.data : null;
                cLBorrowBaseFragment2.e0();
                break;
            case 2:
                CLBorrowCouponResp cLBorrowCouponResp = (CLBorrowCouponResp) obj;
                CLBorrowBaseFragment cLBorrowBaseFragment3 = this.f125g;
                int i10 = 0;
                cLBorrowBaseFragment3.showLoadingDialog(false);
                if (cLBorrowCouponResp == null || !cLBorrowCouponResp.isSuccess()) {
                    ToastUtils.showShort(cLBorrowCouponResp != null ? cLBorrowCouponResp.getRespMsg() : null, new Object[0]);
                    break;
                } else {
                    List<CLBorrowCouponData> data = cLBorrowCouponResp.getData();
                    if (data != null && !data.isEmpty()) {
                        ArrayList arrayList = cLBorrowBaseFragment3.f30557n1;
                        arrayList.clear();
                        List<CLBorrowCouponData> data2 = cLBorrowCouponResp.getData();
                        Intrinsics.e(data2);
                        arrayList.addAll(data2);
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            int i11 = i10 + 1;
                            Long couponId = ((CLBorrowCouponData) it.next()).getCouponId();
                            CLRepaymentPlanData cLRepaymentPlanDataX = cLBorrowBaseFragment3.X();
                            if (Intrinsics.c(couponId, (cLRepaymentPlanDataX == null || (coupon = cLRepaymentPlanDataX.getCoupon()) == null) ? null : coupon.getCouponId())) {
                                cLBorrowBaseFragment3.f30556m1 = i10;
                                context = cLBorrowBaseFragment3.getContext();
                                if (context != null) {
                                    CLCouponDialog cLCouponDialog = new CLCouponDialog(context, arrayList, cLBorrowBaseFragment3.f30556m1);
                                    cLCouponDialog.setConfirmListener(new A8.c(1, cLBorrowBaseFragment3, cLCouponDialog));
                                    cLCouponDialog.show();
                                }
                            } else {
                                i10 = i11;
                            }
                            break;
                        }
                        context = cLBorrowBaseFragment3.getContext();
                        if (context != null) {
                            CLCouponDialog cLCouponDialog2 = new CLCouponDialog(context, arrayList, cLBorrowBaseFragment3.f30556m1);
                            cLCouponDialog2.setConfirmListener(new A8.c(1, cLBorrowBaseFragment3, cLCouponDialog2));
                            cLCouponDialog2.show();
                        }
                        break;
                    }
                }
                break;
            default:
                CLRepaymentPlanResp cLRepaymentPlanResp = (CLRepaymentPlanResp) obj;
                CLBorrowBaseFragment cLBorrowBaseFragment4 = this.f125g;
                cLBorrowBaseFragment4.showLoadingDialog(false);
                CLRepaymentPlanData cLRepaymentPlanData = null;
                CLRepaymentPlanData cLRepaymentPlanData2 = null;
                CLRepaymentPlanData cLRepaymentPlanData3 = null;
                if (cLRepaymentPlanResp == null || !cLRepaymentPlanResp.isSuccess() || cLRepaymentPlanResp.getData() == null) {
                    ToastUtils.showShort(cLRepaymentPlanResp != null ? cLRepaymentPlanResp.getRespMsg() : null, new Object[0]);
                } else {
                    CLRepaymentPlanData cLRepaymentPlanDataX2 = cLBorrowBaseFragment4.X();
                    String termSpanUnit = cLRepaymentPlanDataX2 != null ? cLRepaymentPlanDataX2.getTermSpanUnit() : null;
                    CLRepaymentPlanData cLRepaymentPlanDataX3 = cLBorrowBaseFragment4.X();
                    Integer termSpan = cLRepaymentPlanDataX3 != null ? cLRepaymentPlanDataX3.getTermSpan() : null;
                    int i12 = cLBorrowBaseFragment4.f30506A1;
                    ArrayList arrayList2 = cLBorrowBaseFragment4.f30566r1;
                    if (i12 != -1) {
                        CLRepaymentPlanData data3 = cLRepaymentPlanResp.getData();
                        if (data3 != null) {
                            data3.setTermSpanUnit(termSpanUnit);
                            data3.setTermSpan(termSpan);
                            cLRepaymentPlanData3 = data3;
                        }
                        cLBorrowBaseFragment4.f30562p1 = cLRepaymentPlanData3;
                        int i13 = cLBorrowBaseFragment4.f30559o1;
                        Intrinsics.e(cLRepaymentPlanData3);
                        arrayList2.set(i13, cLRepaymentPlanData3);
                    } else if (cLBorrowBaseFragment4.f30509B1 == 2) {
                        CLRepaymentPlanData data4 = cLRepaymentPlanResp.getData();
                        if (data4 != null) {
                            data4.setTermSpanUnit(termSpanUnit);
                            data4.setTermSpan(termSpan);
                            cLRepaymentPlanData = data4;
                        }
                        cLBorrowBaseFragment4.f30562p1 = cLRepaymentPlanData;
                        int iV = cLBorrowBaseFragment4.V();
                        CLRepaymentPlanData cLRepaymentPlanData4 = cLBorrowBaseFragment4.f30562p1;
                        Intrinsics.e(cLRepaymentPlanData4);
                        arrayList2.set(iV, cLRepaymentPlanData4);
                    } else {
                        CLRepaymentPlanData data5 = cLRepaymentPlanResp.getData();
                        if (data5 != null) {
                            data5.setTermSpanUnit(termSpanUnit);
                            data5.setTermSpan(termSpan);
                            cLRepaymentPlanData2 = data5;
                        }
                        cLBorrowBaseFragment4.f30564q1 = cLRepaymentPlanData2;
                        ArrayList arrayList3 = cLBorrowBaseFragment4.f30583z1;
                        int iV2 = cLBorrowBaseFragment4.V();
                        CLRepaymentPlanData cLRepaymentPlanData5 = cLBorrowBaseFragment4.f30564q1;
                        Intrinsics.e(cLRepaymentPlanData5);
                        arrayList3.set(iV2, cLRepaymentPlanData5);
                    }
                    cLBorrowBaseFragment4.e0();
                    cLBorrowBaseFragment4.c0();
                }
                break;
        }
    }
}

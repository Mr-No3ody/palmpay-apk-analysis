package p294tb;

import C0.G;
import F6.d;
import Pa.r0;
import Wd.C0751z;
import Ya.g;
import Z4.e;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.TextView;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.credit.bean.resp.CLCurrentBillData;
import com.transsnet.palmpay.credit.bean.resp.CLCurrentBillResp;
import com.transsnet.palmpay.credit.bean.resp.CLExtendPlanData;
import com.transsnet.palmpay.credit.bean.resp.CLExtendPlanResp;
import com.transsnet.palmpay.credit.bean.resp.CLRepayOrderData;
import com.transsnet.palmpay.credit.bean.resp.OcRepayExitResp;
import com.transsnet.palmpay.credit.network.IApiCreditService;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLRepaymentActivity;
import com.transsnet.palmpay.custom_view.AmountEditText;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;
import p071ef.b;
import p221ob.c;
import p298tf.f;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
public final class X extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f42439f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ CLRepaymentActivity f42440g;

    public /* synthetic */ X(CLRepaymentActivity cLRepaymentActivity, int i7) {
        this.f42439f = i7;
        this.f42440g = cLRepaymentActivity;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        switch (this.f42439f) {
            case 0:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f42440g.addSubscription(d2);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f42440g.addSubscription(d2);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f42440g.addSubscription(d2);
                break;
            default:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f42440g.addSubscription(d2);
                break;
        }
    }

    @Override // Z4.e
    public final void w(String message) {
        switch (this.f42439f) {
            case 0:
                Intrinsics.checkNotNullParameter(message, "message");
                this.f42440g.showLoadingDialog(false);
                ToastUtils.showLong(message, new Object[0]);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(message, "message");
                this.f42440g.showLoadingDialog(false);
                ToastUtils.showShort(message, new Object[0]);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(message, "message");
                ToastUtils.showLong(message, new Object[0]);
                break;
            default:
                Intrinsics.checkNotNullParameter(message, "message");
                ToastUtils.showShort(message, new Object[0]);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:71:0x014a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0154  */
    /* JADX WARN: Code duplicated, block: B:75:0x0176  */
    /* JADX WARN: Code duplicated, block: B:78:0x017f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0188  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Z4.e
    public final void y(Object obj) {
        Integer extensionTag;
        AmountEditText amountEditTextQ;
        AmountEditText amountEditTextQ2;
        AmountEditText amountEditTextQ3;
        Long unpaidAmount;
        Long unpaidAmount2;
        Long unpaidAmount3;
        Integer extensionTag2;
        Long extensionRepaymentDate;
        Long totalAmount;
        int i7 = 3;
        long jLongValue = 0;
        CLRepaymentActivity cLRepaymentActivity = this.f42440g;
        switch (this.f42439f) {
            case 0:
                CommonBeanResult response = (CommonBeanResult) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                cLRepaymentActivity.showLoadingDialog(false);
                if (response.isSuccess()) {
                    CLRepayOrderData cLRepayOrderData = (CLRepayOrderData) response.data;
                    if (!TextUtils.isEmpty(cLRepayOrderData != null ? cLRepayOrderData.getOrderId() : null)) {
                        CLRepayOrderData cLRepayOrderData2 = (CLRepayOrderData) response.data;
                        int i10 = CLRepaymentActivity.f29036w0;
                        d.h(cLRepaymentActivity.TAG, 3, "callOldCashier >>>");
                        C0751z c0751z = new C0751z(cLRepaymentActivity, 13);
                        c0751z.f4971b = cLRepayOrderData2 != null ? cLRepayOrderData2.getOrderId() : null;
                        AmountEditText amountEditTextQ4 = cLRepaymentActivity.q();
                        c0751z.c(Long.valueOf(amountEditTextQ4 != null ? amountEditTextQ4.getLong() : 0L));
                        c0751z.f4978i = cLRepayOrderData2 != null ? cLRepayOrderData2.getCalculationExtInfo() : null;
                        c0751z.d();
                    }
                }
                ToastUtils.showLong(response.getRespMsg(), new Object[0]);
                break;
            case 1:
                CLCurrentBillResp cLCurrentBillResp = (CLCurrentBillResp) obj;
                cLRepaymentActivity.showLoadingDialog(false);
                if (cLCurrentBillResp != null && cLCurrentBillResp.isSuccess() && cLCurrentBillResp.getData() != null) {
                    cLRepaymentActivity.f29053k0 = cLCurrentBillResp.getData();
                    TextView textViewR = cLRepaymentActivity.r();
                    int i11 = g.cs_cl_min_repayment_amount;
                    long j6 = cLRepaymentActivity.f29057q0;
                    textViewR.setText(cLRepaymentActivity.getString(i11, r0.B(j6, false)));
                    AmountEditText amountEditTextQ5 = cLRepaymentActivity.q();
                    if (amountEditTextQ5 != null) {
                        CLCurrentBillData cLCurrentBillData = cLRepaymentActivity.f29053k0;
                        amountEditTextQ5.setText(new SpannableStringBuilder(r0.A((cLCurrentBillData == null || (unpaidAmount3 = cLCurrentBillData.getUnpaidAmount()) == null) ? 0L : unpaidAmount3.longValue())));
                    }
                    CLCurrentBillData cLCurrentBillData2 = cLRepaymentActivity.f29053k0;
                    if (((cLCurrentBillData2 == null || (unpaidAmount2 = cLCurrentBillData2.getUnpaidAmount()) == null) ? 0L : unpaidAmount2.longValue()) <= j6) {
                        CLCurrentBillData cLCurrentBillData3 = cLRepaymentActivity.f29053k0;
                        if (((cLCurrentBillData3 == null || (unpaidAmount = cLCurrentBillData3.getUnpaidAmount()) == null) ? 0L : unpaidAmount.longValue()) > 0) {
                            Object value = cLRepaymentActivity.f29039C.getValue();
                            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                            ((TextView) value).setVisibility(8);
                            cLRepaymentActivity.s().setVisibility(8);
                            cLRepaymentActivity.p().setVisibility(8);
                            amountEditTextQ = cLRepaymentActivity.q();
                            if (amountEditTextQ != null) {
                                amountEditTextQ.setEnabled(false);
                            }
                            amountEditTextQ2 = cLRepaymentActivity.q();
                            if (amountEditTextQ2 != null) {
                                amountEditTextQ2.setFocusable(false);
                            }
                            amountEditTextQ3 = cLRepaymentActivity.q();
                            if (amountEditTextQ3 != null) {
                                amountEditTextQ3.setFocusableInTouchMode(false);
                            }
                            cLRepaymentActivity.m();
                        } else if (Intrinsics.c(cLRepaymentActivity.f29058r0, "cl_repay_all_loan")) {
                            Object value2 = cLRepaymentActivity.f29039C.getValue();
                            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                            ((TextView) value2).setVisibility(8);
                            cLRepaymentActivity.s().setVisibility(8);
                            cLRepaymentActivity.p().setVisibility(8);
                            amountEditTextQ = cLRepaymentActivity.q();
                            if (amountEditTextQ != null) {
                                amountEditTextQ.setEnabled(false);
                            }
                            amountEditTextQ2 = cLRepaymentActivity.q();
                            if (amountEditTextQ2 != null) {
                                amountEditTextQ2.setFocusable(false);
                            }
                            amountEditTextQ3 = cLRepaymentActivity.q();
                            if (amountEditTextQ3 != null) {
                                amountEditTextQ3.setFocusableInTouchMode(false);
                            }
                            cLRepaymentActivity.m();
                        }
                    } else if (Intrinsics.c(cLRepaymentActivity.f29058r0, "cl_repay_all_loan")) {
                        Object value3 = cLRepaymentActivity.f29039C.getValue();
                        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                        ((TextView) value3).setVisibility(8);
                        cLRepaymentActivity.s().setVisibility(8);
                        cLRepaymentActivity.p().setVisibility(8);
                        amountEditTextQ = cLRepaymentActivity.q();
                        if (amountEditTextQ != null) {
                            amountEditTextQ.setEnabled(false);
                        }
                        amountEditTextQ2 = cLRepaymentActivity.q();
                        if (amountEditTextQ2 != null) {
                            amountEditTextQ2.setFocusable(false);
                        }
                        amountEditTextQ3 = cLRepaymentActivity.q();
                        if (amountEditTextQ3 != null) {
                            amountEditTextQ3.setFocusableInTouchMode(false);
                        }
                        cLRepaymentActivity.m();
                    }
                    CLCurrentBillData cLCurrentBillData4 = cLRepaymentActivity.f29053k0;
                    if (cLCurrentBillData4 != null && (extensionTag = cLCurrentBillData4.getExtensionTag()) != null && 1 == extensionTag.intValue()) {
                        CLCurrentBillData cLCurrentBillData5 = cLRepaymentActivity.f29053k0;
                        if (!TextUtils.isEmpty(cLCurrentBillData5 != null ? cLCurrentBillData5.getLoanNo() : null)) {
                            IApiCreditService iApiCreditServiceH = G.h(c.f40268a);
                            CLCurrentBillData cLCurrentBillData6 = cLRepaymentActivity.f29053k0;
                            iApiCreditServiceH.clGetExtendPlan(cLCurrentBillData6 != null ? cLCurrentBillData6.getLoanNo() : null).k(f.f42629b).i(b.a()).subscribe(new X(cLRepaymentActivity, i7));
                        }
                        break;
                    }
                }
                break;
            case 2:
                OcRepayExitResp ocRepayExitResp = (OcRepayExitResp) obj;
                if (ocRepayExitResp != null && ocRepayExitResp.isSuccess()) {
                    cLRepaymentActivity.f29061u0 = ocRepayExitResp.getData();
                    break;
                }
                break;
            default:
                CLExtendPlanResp cLExtendPlanResp = (CLExtendPlanResp) obj;
                if (cLExtendPlanResp == null || !cLExtendPlanResp.isSuccess() || cLExtendPlanResp.getData() == null) {
                    ToastUtils.showShort(cLExtendPlanResp != null ? cLExtendPlanResp.getRespMsg() : null, new Object[0]);
                } else {
                    CLExtendPlanData data = cLExtendPlanResp.getData();
                    cLRepaymentActivity.f29056p0 = data;
                    t tVar = cLRepaymentActivity.f29048e;
                    if (data == null || (extensionTag2 = data.getExtensionTag()) == null || extensionTag2.intValue() != 1) {
                        cLRepaymentActivity.n().setVisibility(8);
                        Object value4 = tVar.getValue();
                        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                        ((TextView) value4).setVisibility(8);
                    } else {
                        Button buttonN = cLRepaymentActivity.n();
                        int i12 = g.cs_cl_extension_repay_amount;
                        CLExtendPlanData cLExtendPlanData = cLRepaymentActivity.f29056p0;
                        buttonN.setText(cLRepaymentActivity.getString(i12, r0.B((cLExtendPlanData == null || (totalAmount = cLExtendPlanData.getTotalAmount()) == null) ? 0L : totalAmount.longValue(), false)));
                        Object value5 = tVar.getValue();
                        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                        TextView textView = (TextView) value5;
                        int i13 = g.cs_cl_repayment_date_extended_date;
                        CLExtendPlanData cLExtendPlanData2 = cLRepaymentActivity.f29056p0;
                        if (cLExtendPlanData2 != null && (extensionRepaymentDate = cLExtendPlanData2.getExtensionRepaymentDate()) != null) {
                            jLongValue = extensionRepaymentDate.longValue();
                        }
                        textView.setText(cLRepaymentActivity.getString(i13, r0.X1(Long.valueOf(jLongValue), "MMM dd, yyyy")));
                        cLRepaymentActivity.n().setVisibility(0);
                        Object value6 = tVar.getValue();
                        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                        ((TextView) value6).setVisibility(0);
                    }
                }
                break;
        }
    }
}

package p310ub;

import Pa.i0;
import Pa.r0;
import Ya.d;
import Ya.g;
import Z4.e;
import android.text.TextUtils;
import com.adjust.sdk.network.ErrorCodes;
import com.transsnet.palmpay.credit.bean.resp.OcAutoDeductOrderDetailRsp;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRepayOrderDetailInPalmPayActivity;
import com.transsnet.palmpay.custom_view.model.OrderResultHeaderModel;
import com.transsnet.palmpay.custom_view.model.OrderResultItemModel;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;
import p220oa.h;
import p285sc.x;
import p294tb.W;

/* JADX INFO: loaded from: classes4.dex */
public final class l1 extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ OcRepayOrderDetailInPalmPayActivity f42886f;

    public l1(OcRepayOrderDetailInPalmPayActivity ocRepayOrderDetailInPalmPayActivity) {
        this.f42886f = ocRepayOrderDetailInPalmPayActivity;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        this.f42886f.addSubscription(d2);
    }

    @Override // Z4.e
    public final void w(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f42886f.showLoadingDialog(false);
        ToastUtils.showShort(message, new Object[0]);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00e6  */
    @Override // Z4.e
    public final void y(Object obj) {
        String string;
        OcAutoDeductOrderDetailRsp ocAutoDeductOrderDetailRsp = (OcAutoDeductOrderDetailRsp) obj;
        OcRepayOrderDetailInPalmPayActivity ocRepayOrderDetailInPalmPayActivity = this.f42886f;
        ocRepayOrderDetailInPalmPayActivity.showLoadingDialog(false);
        if (ocAutoDeductOrderDetailRsp == null || !ocAutoDeductOrderDetailRsp.isSuccess()) {
            ToastUtils.showShort(ocAutoDeductOrderDetailRsp != null ? ocAutoDeductOrderDetailRsp.getRespMsg() : null, new Object[0]);
            return;
        }
        OcAutoDeductOrderDetailRsp.DataBean dataBean = ocAutoDeductOrderDetailRsp.data;
        int i7 = OcRepayOrderDetailInPalmPayActivity.f29822o;
        if (dataBean != null) {
            ocRepayOrderDetailInPalmPayActivity.r().removeAllViews();
            ocRepayOrderDetailInPalmPayActivity.s().removeAllViews();
            ocRepayOrderDetailInPalmPayActivity.t().l(OrderResultHeaderModel.a.getOrderStatusIconByDes$default(OrderResultHeaderModel.f31610A, ocRepayOrderDetailInPalmPayActivity, dataBean.orderStatusDesc, 0.0f, 4, null));
            ocRepayOrderDetailInPalmPayActivity.t().o("To " + dataBean.merchantName);
            ocRepayOrderDetailInPalmPayActivity.t().c(r0.B(dataBean.payAmount, false));
            ocRepayOrderDetailInPalmPayActivity.t().d(d.cv_cl_cash_loan_repay);
            ocRepayOrderDetailInPalmPayActivity.t().k(ocRepayOrderDetailInPalmPayActivity.o(dataBean.orderStatus));
            ocRepayOrderDetailInPalmPayActivity.t().getOrderStatusArrow().setVisibility(dataBean.orderStatusInfo == null ? 8 : 0);
            ocRepayOrderDetailInPalmPayActivity.t().getOrderStatusLayout().setEnabled(dataBean.orderStatusInfo != null);
            h.l(new W(6, ocRepayOrderDetailInPalmPayActivity, dataBean), ocRepayOrderDetailInPalmPayActivity.t().getOrderStatusLayout());
            OrderResultItemModel orderResultItemModelQ = ocRepayOrderDetailInPalmPayActivity.q(ocRepayOrderDetailInPalmPayActivity.getString(g.cs_auto_deduct), 1002, ocRepayOrderDetailInPalmPayActivity.getString(k.core_receipt_transaction_type));
            orderResultItemModelQ.i(d.cs_oc_interest_question_icon);
            orderResultItemModelQ.setOnClickListener(new x(ocRepayOrderDetailInPalmPayActivity, 26));
            int i10 = dataBean.payerAccountType;
            if (i10 == 1) {
                string = ocRepayOrderDetailInPalmPayActivity.getString(k.core_palmpay_payment_balance);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            } else if (i10 != 2) {
                string = "";
            } else {
                string = i0.h(dataBean.bankName, dataBean.bankCard);
                if (string == null) {
                    string = ocRepayOrderDetailInPalmPayActivity.getString(k.core_bank_card);
                    Intrinsics.checkNotNullExpressionValue(string, "run(...)");
                } else {
                    if (TextUtils.isEmpty(string)) {
                        string = null;
                    }
                    if (string == null) {
                        string = ocRepayOrderDetailInPalmPayActivity.getString(k.core_bank_card);
                        Intrinsics.checkNotNullExpressionValue(string, "run(...)");
                    }
                }
            }
            String str = TextUtils.isEmpty(string) ? null : string;
            if (str != null) {
                ocRepayOrderDetailInPalmPayActivity.q(str, 1002, ocRepayOrderDetailInPalmPayActivity.getString(k.core_payment_method));
            }
            ocRepayOrderDetailInPalmPayActivity.q(dataBean.orderNo, ErrorCodes.MALFORMED_URL_EXCEPTION, ocRepayOrderDetailInPalmPayActivity.getString(k.core_reference_no_2));
            ocRepayOrderDetailInPalmPayActivity.q(r0.R(dataBean.updateTime), 1002, ocRepayOrderDetailInPalmPayActivity.getString(k.core_completion_time));
        }
    }
}

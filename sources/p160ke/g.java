package p160ke;

import Pa.i0;
import Z4.e;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.main.export.bean.rsp.ChargeBackOrderRsp;
import com.transsnet.palmpay.main.export.bean.rsp.OrderRefundDataBean;
import com.transsnet.palmpay.main.export.bean.rsp.QueryRefundBillDetailRsp;
import com.transsnet.palmpay.ui.activity.detail.RefundStatementDetailActivity;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f38759f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ RefundStatementDetailActivity f38760g;

    public /* synthetic */ g(RefundStatementDetailActivity refundStatementDetailActivity, int i7) {
        this.f38759f = i7;
        this.f38760g = refundStatementDetailActivity;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        switch (this.f38759f) {
            case 0:
                Intrinsics.checkNotNullParameter(disposable, "disposable");
                this.f38760g.addSubscription(disposable);
                break;
            default:
                Intrinsics.checkNotNullParameter(disposable, "disposable");
                this.f38760g.addSubscription(disposable);
                break;
        }
    }

    @Override // Z4.e
    public final void w(String message) {
        switch (this.f38759f) {
            case 0:
                Intrinsics.checkNotNullParameter(message, "message");
                ToastUtils.showLong(message, new Object[0]);
                this.f38760g.showLoadingDialog(false);
                break;
            default:
                Intrinsics.checkNotNullParameter(message, "message");
                ToastUtils.showLong(message, new Object[0]);
                this.f38760g.showLoadingDialog(false);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Z4.e
    public final void y(Object obj) {
        String respMsg;
        RefundStatementDetailActivity refundStatementDetailActivity = this.f38760g;
        switch (this.f38759f) {
            case 0:
                CommonBeanResult commonBeanResult = (CommonBeanResult) obj;
                refundStatementDetailActivity.showLoadingDialog(false);
                if (commonBeanResult != null && commonBeanResult.isSuccess()) {
                    ChargeBackOrderRsp chargeBackOrderRsp = (ChargeBackOrderRsp) commonBeanResult.data;
                    int i7 = RefundStatementDetailActivity.f34733f;
                    if (i0.W(refundStatementDetailActivity) && chargeBackOrderRsp != null) {
                        OrderRefundDataBean orderRefundDataBeanCreateDataBean = OrderRefundDataBean.createDataBean(refundStatementDetailActivity, chargeBackOrderRsp, refundStatementDetailActivity.f34735d);
                        Intrinsics.checkNotNullExpressionValue(orderRefundDataBeanCreateDataBean, "createDataBean(...)");
                        refundStatementDetailActivity.o(orderRefundDataBeanCreateDataBean);
                        OrderRefundDataBean orderRefundDataBeanCreateDataBean2 = OrderRefundDataBean.createDataBean(refundStatementDetailActivity, chargeBackOrderRsp, refundStatementDetailActivity.f34735d);
                        Intrinsics.checkNotNullExpressionValue(orderRefundDataBeanCreateDataBean2, "createDataBean(...)");
                        refundStatementDetailActivity.p(orderRefundDataBeanCreateDataBean2);
                        break;
                    }
                } else {
                    if (commonBeanResult == null || (respMsg = commonBeanResult.getRespMsg()) == null) {
                        respMsg = "";
                    }
                    RefundStatementDetailActivity.m(refundStatementDetailActivity, respMsg);
                    break;
                }
                break;
            default:
                CommonBeanResult response = (CommonBeanResult) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                refundStatementDetailActivity.showLoadingDialog(false);
                if (!response.isSuccess()) {
                    String respMsg2 = response.getRespMsg();
                    Intrinsics.checkNotNullExpressionValue(respMsg2, "getRespMsg(...)");
                    RefundStatementDetailActivity.m(refundStatementDetailActivity, respMsg2);
                    break;
                } else {
                    QueryRefundBillDetailRsp queryRefundBillDetailRsp = (QueryRefundBillDetailRsp) response.data;
                    int i10 = RefundStatementDetailActivity.f34733f;
                    if (i0.W(refundStatementDetailActivity) && queryRefundBillDetailRsp != null) {
                        OrderRefundDataBean orderRefundDataBeanCreateDataBean3 = OrderRefundDataBean.createDataBean(queryRefundBillDetailRsp);
                        Intrinsics.checkNotNullExpressionValue(orderRefundDataBeanCreateDataBean3, "createDataBean(...)");
                        refundStatementDetailActivity.o(orderRefundDataBeanCreateDataBean3);
                        OrderRefundDataBean orderRefundDataBeanCreateDataBean4 = OrderRefundDataBean.createDataBean(queryRefundBillDetailRsp);
                        Intrinsics.checkNotNullExpressionValue(orderRefundDataBeanCreateDataBean4, "createDataBean(...)");
                        refundStatementDetailActivity.p(orderRefundDataBeanCreateDataBean4);
                        break;
                    }
                }
                break;
        }
    }
}

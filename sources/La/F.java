package La;

import Ad.C0058e;
import Fe.h0;
import android.app.Activity;
import android.text.TextUtils;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.PaymentMethod;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.req.PaymentMethodReq;
import com.transsnet.palmpay.core.bean.req.PreviewPayInfoV2Req;
import com.transsnet.palmpay.core.bean.req.QueryCouponByConditionReq;
import com.transsnet.palmpay.core.bean.req.QueryLimitAmountV2Req;
import com.transsnet.palmpay.core.bean.rsp.OkCardPreCreditInfoRsp;
import com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IPresenter;
import com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IView;
import com.transsnet.palmpay.core.util.statistic.core.AutoTrackUtil;
import com.transsnet.palmpay.core.util.statistic.core.LogConstants;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class F extends r implements SelectPaymentContract$IPresenter {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public OkCardPreCreditInfoRsp f5572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PreviewPayInfoV2Req f5573e;

    public final void c(int i7, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            J3.a.B(this, this.f27351a, new i(3), new C(this, 0), new C(this, 1), false, false);
            return;
        }
        PaymentMethodReq paymentMethodReq = new PaymentMethodReq();
        SelectPaymentContract$IView selectPaymentContract$IView = (SelectPaymentContract$IView) this.f27351a;
        paymentMethodReq.orderAmount = selectPaymentContract$IView != null ? selectPaymentContract$IView.getF29800t0() : 0L;
        paymentMethodReq.transType = str;
        paymentMethodReq.senderAccountType = i7;
        paymentMethodReq.payeeAccountType = str2;
        if (!TextUtils.isEmpty(str3)) {
            if (TransType.TRANS_TYPE_CL_BORROW.equals(str == null ? "" : str)) {
                paymentMethodReq.orderNo = str3;
            }
        }
        J3.a.B(this, (SelectPaymentContract$IView) this.f27351a, new Ae.j(paymentMethodReq, 29), new C(this, 11), new C(this, 12), false, false);
    }

    public final void e(PaymentMethod paymentMethod) {
        if (paymentMethod != null) {
            HashMap map = new HashMap();
            map.put(LogConstants.Autotrack.ELEMENT_PAY_METHOD, Integer.valueOf(paymentMethod.senderAccountType));
            Object obj = this.f27351a;
            Intrinsics.f(obj, "null cannot be cast to non-null type android.app.Activity");
            AutoTrackUtil.trackActivityProperties((Activity) obj, map);
        }
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IPresenter
    public final PreviewPayInfoV2Req getPreviewPayInfoReq() {
        return this.f5573e;
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IPresenter
    public final void queryCoupons(QueryCouponByConditionReq req) {
        Intrinsics.checkNotNullParameter(req, "req");
        J3.a.B(this, (SelectPaymentContract$IView) this.f27351a, new Ae.j(req, 27), new C(this, 3), new C(this, 4), false, false);
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IPresenter
    public final void queryLimitAmount(String transType, String payeeAccountType, String payerAccountType) {
        Intrinsics.checkNotNullParameter(transType, "transType");
        Intrinsics.checkNotNullParameter(payeeAccountType, "payeeAccountType");
        Intrinsics.checkNotNullParameter(payerAccountType, "payerAccountType");
        QueryLimitAmountV2Req queryLimitAmountV2Req = new QueryLimitAmountV2Req();
        queryLimitAmountV2Req.countryCode = BaseApplication.getCountryLocale();
        queryLimitAmountV2Req.currency = BaseApplication.getCurrency();
        queryLimitAmountV2Req.transType = transType;
        queryLimitAmountV2Req.payeeAccountType = payeeAccountType;
        queryLimitAmountV2Req.payerAccountType = payerAccountType;
        J3.a.B(this, (SelectPaymentContract$IView) this.f27351a, new Ae.j(queryLimitAmountV2Req, 28), new C(this, 7), new h0(9), false, true);
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IPresenter
    public final void queryOkCardPreCreditInfo(boolean z3) {
        J3.a.C(this, this.f27351a, new i(2), new D(this, z3, 0), null, false, false, 8);
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IPresenter
    public final void queryPaymentMethod(PreviewPayInfoV2Req req) {
        Intrinsics.checkNotNullParameter(req, "req");
        IBaseView iBaseView = this.f27351a;
        if (iBaseView != null) {
            ((SelectPaymentContract$IView) iBaseView).showLoadingView(true);
        }
        if (req == null) {
            c(0, null, "", "");
            return;
        }
        if (TextUtils.isEmpty(req.transType)) {
            SelectPaymentContract$IView selectPaymentContract$IView = (SelectPaymentContract$IView) this.f27351a;
            req.transType = selectPaymentContract$IView != null ? selectPaymentContract$IView.getF27551B0() : null;
        }
        J3.a.B(this, this.f27351a, new w(req, 1), new C0058e(12, this, req), new C(this, 2), false, false);
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IPresenter
    public final void savePreviewPayInfoReq(PreviewPayInfoV2Req previewPayInfoV2Req) {
        this.f5573e = previewPayInfoV2Req;
    }
}

package Wd;

import Pa.i0;
import Pa.r0;
import android.view.View;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.teller.bean.CreateTellerOrderReq;
import com.transsnet.palmpay.teller.bean.PaymentItemBean;
import com.transsnet.palmpay.teller.bean.WAECOperatorBean;
import com.transsnet.palmpay.teller.ui.activity.WaecHomeActivity;
import com.transsnet.palmpay.teller.ui.dialog.PickMobileNetWorkDialog;
import com.transsnet.palmpay.teller.ui.dialog.PickPaymentItemDialog;
import com.transsnet.palmpay.teller.viewmodel.BillPaymentHomeNGViewModel;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class V implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WaecHomeActivity f10740b;

    public /* synthetic */ V(WaecHomeActivity waecHomeActivity, int i7) {
        this.f10739a = i7;
        this.f10740b = waecHomeActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WaecHomeActivity waecHomeActivity = this.f10740b;
        switch (this.f10739a) {
            case 0:
                int i7 = WaecHomeActivity.f34237Q;
                waecHomeActivity.getOnBackPressedDispatcher().d();
                return;
            case 1:
                int i10 = WaecHomeActivity.f34237Q;
                BillPaymentHomeNGViewModel billPaymentHomeNGViewModel = (BillPaymentHomeNGViewModel) waecHomeActivity.l();
                if (billPaymentHomeNGViewModel != null) {
                    billPaymentHomeNGViewModel.i(C1850q.e(TransType.TRANS_TYPE_BILLER_WAEC_PAYMENTS));
                    return;
                }
                return;
            case 2:
                if (waecHomeActivity.t.isEmpty()) {
                    ((BillPaymentHomeNGViewModel) waecHomeActivity.l()).f(true, false, waecHomeActivity.f34244i, null);
                    return;
                }
                PickPaymentItemDialog pickPaymentItemDialog = new PickPaymentItemDialog(waecHomeActivity);
                pickPaymentItemDialog.setCallBack(waecHomeActivity);
                pickPaymentItemDialog.setBFavorite(false);
                pickPaymentItemDialog.show();
                pickPaymentItemDialog.setPaymentItems(waecHomeActivity.t);
                return;
            case 3:
                if (waecHomeActivity.f34248v.isEmpty()) {
                    waecHomeActivity.s(true);
                    return;
                }
                PickMobileNetWorkDialog pickMobileNetWorkDialog = waecHomeActivity.f34242L;
                if (pickMobileNetWorkDialog != null) {
                    pickMobileNetWorkDialog.show();
                    return;
                } else {
                    Intrinsics.n("selectNetWorkDialog");
                    throw null;
                }
            default:
                int i11 = WaecHomeActivity.f34237Q;
                if (!BaseApplication.hasLogin()) {
                    i0.K(null, null);
                    return;
                }
                long jF = r0.f(waecHomeActivity.p().getDoubleAmount());
                if (jF <= 0) {
                    ToastUtils.showLong(waecHomeActivity.getString(Pd.f.qt_msg_amount_above_desc, r0.B(0L, false)), new Object[0]);
                    return;
                }
                long j6 = waecHomeActivity.f34241H;
                if (jF < j6) {
                    ToastUtils.showLong(waecHomeActivity.getString(Pd.f.qt_msg_amount_above_desc, r0.B(j6, false)), new Object[0]);
                    return;
                }
                long j10 = waecHomeActivity.f34240C;
                if (jF > j10) {
                    ToastUtils.showLong(waecHomeActivity.getString(Pd.f.qt_msg_amount_below_desc, r0.B(j10, false)), new Object[0]);
                    return;
                }
                CreateTellerOrderReq createTellerOrderReq = new CreateTellerOrderReq();
                createTellerOrderReq.businessAmount = r0.f(waecHomeActivity.p().getDoubleAmount());
                createTellerOrderReq.customerId = waecHomeActivity.q() != null ? waecHomeActivity.q().getNumber() : "";
                createTellerOrderReq.renewal = false;
                createTellerOrderReq.fullName = BaseApplication.get().getUser().getFullName();
                Object obj = p070ee.b.f36288a;
                String str = waecHomeActivity.f34244i;
                createTellerOrderReq.businessType = p070ee.b.a(str);
                PaymentItemBean paymentItemBean = waecHomeActivity.f34249w;
                createTellerOrderReq.billerName = paymentItemBean != null ? paymentItemBean.billerName : null;
                createTellerOrderReq.billerId = paymentItemBean != null ? paymentItemBean.billerId : null;
                createTellerOrderReq.categoryId = paymentItemBean != null ? paymentItemBean.categoryId : null;
                createTellerOrderReq.icon = paymentItemBean != null ? paymentItemBean.institutionLogo : null;
                createTellerOrderReq.paymentItemId = paymentItemBean != null ? paymentItemBean.paymentItemId : null;
                createTellerOrderReq.paymentItemName = paymentItemBean != null ? paymentItemBean.paymentItemName : null;
                createTellerOrderReq.transType = p070ee.b.b(str);
                WAECOperatorBean wAECOperatorBean = waecHomeActivity.f34243M;
                createTellerOrderReq.network = wAECOperatorBean != null ? wAECOperatorBean.getCode() : null;
                createTellerOrderReq.verifyNetwork = true;
                ((BillPaymentHomeNGViewModel) waecHomeActivity.l()).d(createTellerOrderReq);
                return;
        }
    }
}

package Wd;

import Pa.i0;
import Pa.r0;
import Rd.C0602s;
import android.view.View;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.custom_view.input.ModelNumberInputLayout;
import com.transsnet.palmpay.teller.bean.CreateTellerOrderReq;
import com.transsnet.palmpay.teller.bean.PaymentItemBean;
import com.transsnet.palmpay.teller.ui.activity.JambHomeActivity;
import com.transsnet.palmpay.teller.viewmodel.BillPaymentHomeNGViewModel;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.collections.C1850q;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class L implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JambHomeActivity f10724b;

    public /* synthetic */ L(JambHomeActivity jambHomeActivity, int i7) {
        this.f10723a = i7;
        this.f10724b = jambHomeActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String number;
        ModelNumberInputLayout modelNumberInputLayout;
        PpAmountEditText ppAmountEditText;
        PpAmountEditText ppAmountEditText2;
        JambHomeActivity jambHomeActivity = this.f10724b;
        switch (this.f10723a) {
            case 0:
                int i7 = JambHomeActivity.f34222B;
                ARouter.getInstance().build("/quick_teller/betting_beneficiaries").withString("KEY_CATEGORY_ID", jambHomeActivity.f34224i).navigation(jambHomeActivity, 101);
                break;
            case 1:
                jambHomeActivity.f34223A.a(Unit.f38893a);
                break;
            case 2:
                int i10 = JambHomeActivity.f34222B;
                jambHomeActivity.getClass();
                if (!BaseApplication.hasLogin()) {
                    i0.K(null, null);
                } else {
                    C0602s c0602s = (C0602s) jambHomeActivity.f27334c;
                    double doubleAmount = 0.0d;
                    long jF = r0.f((c0602s == null || (ppAmountEditText2 = c0602s.f8475d) == null) ? 0.0d : ppAmountEditText2.getDoubleAmount());
                    if (jF > 0) {
                        long j6 = jambHomeActivity.f34228v;
                        if (jF >= j6) {
                            long j10 = jambHomeActivity.t;
                            if (jF <= j10) {
                                CreateTellerOrderReq createTellerOrderReq = new CreateTellerOrderReq();
                                C0602s c0602s2 = (C0602s) jambHomeActivity.f27334c;
                                if (c0602s2 != null && (ppAmountEditText = c0602s2.f8475d) != null) {
                                    doubleAmount = ppAmountEditText.getDoubleAmount();
                                }
                                createTellerOrderReq.businessAmount = r0.f(doubleAmount);
                                C0602s c0602s3 = (C0602s) jambHomeActivity.f27334c;
                                if (c0602s3 == null || (modelNumberInputLayout = c0602s3.f8478g) == null || (number = modelNumberInputLayout.getNumber()) == null) {
                                    number = "";
                                }
                                createTellerOrderReq.customerId = number;
                                createTellerOrderReq.renewal = false;
                                createTellerOrderReq.fullName = BaseApplication.get().getUser().getFullName();
                                createTellerOrderReq.businessType = 23;
                                PaymentItemBean paymentItemBean = jambHomeActivity.f34226o;
                                createTellerOrderReq.billerName = paymentItemBean != null ? paymentItemBean.billerName : null;
                                createTellerOrderReq.billerId = paymentItemBean != null ? paymentItemBean.billerId : null;
                                createTellerOrderReq.categoryId = paymentItemBean != null ? paymentItemBean.categoryId : null;
                                createTellerOrderReq.icon = paymentItemBean != null ? paymentItemBean.institutionLogo : null;
                                createTellerOrderReq.paymentItemId = paymentItemBean != null ? paymentItemBean.paymentItemId : null;
                                createTellerOrderReq.paymentItemName = paymentItemBean != null ? paymentItemBean.paymentItemName : null;
                                createTellerOrderReq.transType = TransType.TRANS_TYPE_BILLER_JAMB_PAYMENTS;
                                createTellerOrderReq.verifyNetwork = true;
                                ((BillPaymentHomeNGViewModel) jambHomeActivity.l()).d(createTellerOrderReq);
                            } else {
                                ToastUtils.showLong(jambHomeActivity.getString(Pd.f.qt_msg_amount_below_desc, r0.B(j10, false)), new Object[0]);
                            }
                        } else {
                            ToastUtils.showLong(jambHomeActivity.getString(Pd.f.qt_msg_amount_above_desc, r0.B(j6, false)), new Object[0]);
                        }
                    } else {
                        ToastUtils.showLong(jambHomeActivity.getString(Pd.f.qt_msg_amount_above_desc, r0.B(0L, false)), new Object[0]);
                    }
                }
                break;
            case 3:
                int i11 = JambHomeActivity.f34222B;
                jambHomeActivity.getOnBackPressedDispatcher().d();
                break;
            case 4:
                int i12 = JambHomeActivity.f34222B;
                BillPaymentHomeNGViewModel billPaymentHomeNGViewModel = (BillPaymentHomeNGViewModel) jambHomeActivity.l();
                if (billPaymentHomeNGViewModel != null) {
                    billPaymentHomeNGViewModel.i(C1850q.e(TransType.TRANS_TYPE_BILLER_JAMB_PAYMENTS));
                }
                break;
            default:
                if (!jambHomeActivity.f34225j.isEmpty()) {
                    jambHomeActivity.t();
                } else {
                    ((BillPaymentHomeNGViewModel) jambHomeActivity.l()).f(true, false, jambHomeActivity.f34224i, null);
                }
                break;
        }
    }
}

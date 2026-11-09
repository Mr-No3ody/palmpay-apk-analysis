package p271re;

import Ac.e;
import Pa.r0;
import android.view.View;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.req.QueryLimitAmountV2Req;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.ui.activity.qr.PayMoneyToPalmPayBusinessPreviewActivity;
import com.transsnet.palmpay.util.ToastUtils;
import p071ef.b;
import p298tf.f;
import p324va.c;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PayMoneyToPalmPayBusinessPreviewActivity f41788a;

    public a(PayMoneyToPalmPayBusinessPreviewActivity payMoneyToPalmPayBusinessPreviewActivity) {
        this.f41788a = payMoneyToPalmPayBusinessPreviewActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id2 = view.getId();
        int i7 = e.acapbo_next_btn;
        PayMoneyToPalmPayBusinessPreviewActivity payMoneyToPalmPayBusinessPreviewActivity = this.f41788a;
        if (id2 != i7) {
            if (id2 == e.acapbo_bank_card_item) {
                int i10 = PayMoneyToPalmPayBusinessPreviewActivity.f34816C0;
                payMoneyToPalmPayBusinessPreviewActivity.L();
                return;
            } else {
                if (id2 == payMoneyToPalmPayBusinessPreviewActivity.f34829w0.getId()) {
                    payMoneyToPalmPayBusinessPreviewActivity.F(payMoneyToPalmPayBusinessPreviewActivity.f34817A0);
                    return;
                }
                return;
            }
        }
        int i11 = PayMoneyToPalmPayBusinessPreviewActivity.f34816C0;
        if (payMoneyToPalmPayBusinessPreviewActivity.f27789d == null) {
            ToastUtils.showShort("please select a payment method");
            return;
        }
        if (r0.U0()) {
            return;
        }
        String strValueOf = String.valueOf(1);
        String strValueOf2 = String.valueOf(payMoneyToPalmPayBusinessPreviewActivity.f27789d.senderAccountType);
        payMoneyToPalmPayBusinessPreviewActivity.showLoadingDialog(true, false);
        QueryLimitAmountV2Req queryLimitAmountV2Req = new QueryLimitAmountV2Req();
        queryLimitAmountV2Req.countryCode = BaseApplication.getCountryLocale();
        queryLimitAmountV2Req.currency = BaseApplication.getCurrency();
        queryLimitAmountV2Req.transType = TransType.TRANS_TYPE_PAY_MONEY_TO_PALMPAY_BUSINESS;
        queryLimitAmountV2Req.payeeAccountType = strValueOf;
        queryLimitAmountV2Req.payerAccountType = strValueOf2;
        ((PayApiService) c.f43141a.f14621b).queryLimitAmountV2(queryLimitAmountV2Req).k(f.f42629b).i(b.a()).subscribe(new c(payMoneyToPalmPayBusinessPreviewActivity));
    }
}

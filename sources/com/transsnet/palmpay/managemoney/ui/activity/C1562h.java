package com.transsnet.palmpay.managemoney.ui.activity;

import N8.q0;
import Pa.i0;
import android.text.TextUtils;
import android.view.View;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.req.GetCustomerServiceUrlReq;
import com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel;
import com.transsnet.palmpay.managemoney.bean.resp.GetCashBoxOrderDetailResp;
import com.transsnet.palmpay.util.EncodeUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsnet.palmpay.managemoney.ui.activity.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1562h implements OrderResultCustomerServiceModel.OnCustomerServiceModelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CashBoxOrderDetailActivity f32239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GetCashBoxOrderDetailResp.CashBoxOrderDetail f32240b;

    public C1562h(CashBoxOrderDetailActivity cashBoxOrderDetailActivity, GetCashBoxOrderDetailResp.CashBoxOrderDetail cashBoxOrderDetail) {
        this.f32239a = cashBoxOrderDetailActivity;
        this.f32240b = cashBoxOrderDetail;
    }

    @Override // com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel.OnCustomerServiceModelListener
    public final void onLeftClick(View v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        i0.c0(com.transsnet.palmpay.core.config.d.c(GetCustomerServiceUrlReq.ENTER_TYPE_ORDER_DETAIL));
    }

    @Override // com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel.OnCustomerServiceModelListener
    public final void onRightClick(View v3) {
        String string;
        String string2;
        Intrinsics.checkNotNullParameter(v3, "v");
        int i7 = CashBoxOrderDetailActivity.f32043w;
        CashBoxOrderDetailActivity cashBoxOrderDetailActivity = this.f32239a;
        if (TextUtils.equals(cashBoxOrderDetailActivity.o(), TransType.TRANS_TYPE_CASH_BOX_DEPOSIT)) {
            string2 = "66";
        } else {
            String str = (String) cashBoxOrderDetailActivity.t.getValue();
            String strUrlEncode = EncodeUtils.urlEncode(cashBoxOrderDetailActivity.getString(TextUtils.equals(cashBoxOrderDetailActivity.o(), TransType.TRANS_TYPE_CASH_BOX_DEPOSIT) ? Jc.f.mm_cashbox_deposit : Jc.f.mm_cashbox_withdraw));
            GetCashBoxOrderDetailResp.CashBoxOrderDetail cashBoxOrderDetail = this.f32240b;
            if (cashBoxOrderDetail.getPaymentType() == 1) {
                string = cashBoxOrderDetailActivity.getResources().getString(Jc.f.mm_plan_palmpay_balance);
            } else {
                string = cashBoxOrderDetail.getPaymentType() == 40 ? cashBoxOrderDetailActivity.getString(p025ba.k.core_cash_box) : q0.l(cashBoxOrderDetail.getPayerBank(), "(", cashBoxOrderDetail.getBankCard(), ")");
            }
            String strUrlEncode2 = EncodeUtils.urlEncode(string);
            StringBuilder sbF = androidx.camera.camera2.internal.F.f("67&orderNo=", str, "&paymentMethod=", strUrlEncode, "&paymentType=");
            sbF.append(strUrlEncode2);
            string2 = sbF.toString();
        }
        i0.a0("orderType=" + string2);
    }
}

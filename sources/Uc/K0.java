package Uc;

import android.view.View;
import com.transsnet.palmpay.core.bean.OrderInfoForCustomerService;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel;
import com.transsnet.palmpay.p2pcash.bean.rsp.QueryAppointmentDetailResp;
import com.transsnet.palmpay.p2pcash.bean.rsp.QueryBalancePaymentDetailResp;
import com.transsnet.palmpay.p2pcash.ui.atm.TransactionDetailPage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class K0 implements OrderResultCustomerServiceModel.OnCustomerServiceModelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TransactionDetailPage f9575a;

    public K0(TransactionDetailPage transactionDetailPage) {
        this.f9575a = transactionDetailPage;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0038  */
    @Override // com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel.OnCustomerServiceModelListener
    public final void onLeftClick(View v3) {
        QueryBalancePaymentDetailResp.DataBean dataBeanA;
        long j6;
        QueryBalancePaymentDetailResp.DataBean dataBeanA2;
        Intrinsics.checkNotNullParameter(v3, "v");
        int i7 = TransactionDetailPage.f32922v;
        TransactionDetailPage transactionDetailPage = this.f9575a;
        H0 h0O = transactionDetailPage.o();
        h0O.getClass();
        OrderInfoForCustomerService orderInfoForCustomerService = new OrderInfoForCustomerService();
        orderInfoForCustomerService.paymentType = "Get Naira";
        TransactionDetailPage transactionDetailPage2 = h0O.f9556c;
        String strQ = transactionDetailPage2.q();
        long j10 = 0;
        if (Intrinsics.c(strQ, TransType.TRANS_TYPE_EXCHANGE_CASH_DEPOSIT)) {
            QueryAppointmentDetailResp.DataBean dataBeanB = transactionDetailPage2.o().b();
            if (dataBeanB != null) {
                j6 = dataBeanB.finishTime;
            } else {
                j6 = 0;
            }
        } else if (!Intrinsics.c(strQ, TransType.TRANS_TYPE_EXCHANGE_CASH_BALANCE_PAYMENT) || (dataBeanA = transactionDetailPage2.o().a()) == null) {
            j6 = 0;
        } else {
            j6 = dataBeanA.finishTime;
        }
        orderInfoForCustomerService.time = j6;
        String strQ2 = transactionDetailPage2.q();
        if (Intrinsics.c(strQ2, TransType.TRANS_TYPE_EXCHANGE_CASH_DEPOSIT)) {
            QueryAppointmentDetailResp.DataBean dataBeanB2 = transactionDetailPage2.o().b();
            if (dataBeanB2 != null) {
                j10 = dataBeanB2.depositMoney;
            }
        } else if (Intrinsics.c(strQ2, TransType.TRANS_TYPE_EXCHANGE_CASH_BALANCE_PAYMENT) && (dataBeanA2 = transactionDetailPage2.o().a()) != null) {
            j10 = dataBeanA2.amount;
        }
        orderInfoForCustomerService.amount = j10;
        orderInfoForCustomerService.orderNumber = (String) transactionDetailPage2.f32930i.getValue();
        orderInfoForCustomerService.transType = transactionDetailPage2.q();
        Pa.i0.M(transactionDetailPage, orderInfoForCustomerService);
    }

    @Override // com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel.OnCustomerServiceModelListener
    public final void onRightClick(View v3) {
        Object obj;
        Intrinsics.checkNotNullParameter(v3, "v");
        int i7 = TransactionDetailPage.f32922v;
        TransactionDetailPage transactionDetailPage = this.f9575a;
        String strQ = transactionDetailPage.q();
        if (Intrinsics.c(strQ, TransType.TRANS_TYPE_EXCHANGE_CASH_DEPOSIT)) {
            obj = "62";
        } else {
            obj = Intrinsics.c(strQ, TransType.TRANS_TYPE_EXCHANGE_CASH_BALANCE_PAYMENT) ? TransType.TRANS_TYPE_AUTO_TRANSFER_BANK_ACCOUNT : 0;
        }
        Pa.i0.J(obj.toString(), (String) transactionDetailPage.f32930i.getValue(), Pa.r0.q0(1, "Balance", ""), "Book Cash");
    }
}

package Uc;

import android.view.ViewGroup;
import android.widget.TextView;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel;
import com.transsnet.palmpay.p2pcash.bean.rsp.QueryAppointmentDetailResp;
import com.transsnet.palmpay.p2pcash.bean.rsp.QueryBalancePaymentDetailResp;
import com.transsnet.palmpay.p2pcash.ui.atm.TransactionDetailPage;
import com.transsnet.palmpay.p2pcash.ui.atm.view.P2PItemView;
import com.transsnet.palmpay.util.ClipboardUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class L0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TransactionDetailPage f9577a;

    public L0(TransactionDetailPage transactionDetailPage) {
        this.f9577a = transactionDetailPage;
    }

    public final void a() {
        String str;
        String str2;
        String str3;
        final TransactionDetailPage transactionDetailPage = this.f9577a;
        TransactionDetailPage.l(transactionDetailPage).removeAllViews();
        Pa.b0 b0Var = new Pa.b0(13);
        String strQ = transactionDetailPage.q();
        String str4 = "";
        if (Intrinsics.c(strQ, TransType.TRANS_TYPE_EXCHANGE_CASH_DEPOSIT)) {
            Intrinsics.checkNotNullParameter(transactionDetailPage, "<this>");
            P2PItemView p2PItemView = new P2PItemView(transactionDetailPage);
            p2PItemView.setName("Payment Method");
            p2PItemView.setValue("Balance");
            TransactionDetailPage.l(transactionDetailPage).addView(p2PItemView, (ViewGroup.LayoutParams) b0Var.invoke());
            Intrinsics.checkNotNullParameter(transactionDetailPage, "<this>");
            P2PItemView p2PItemView2 = new P2PItemView(transactionDetailPage);
            p2PItemView2.setName("Transaction Type");
            p2PItemView2.setValue("Book Cash");
            TransactionDetailPage.l(transactionDetailPage).addView(p2PItemView2, (ViewGroup.LayoutParams) b0Var.invoke());
            Intrinsics.checkNotNullParameter(transactionDetailPage, "<this>");
            P2PItemView p2PItemView3 = new P2PItemView(transactionDetailPage);
            p2PItemView3.setName("Transaction ID");
            QueryAppointmentDetailResp.DataBean dataBeanB = transactionDetailPage.o().b();
            if (dataBeanB != null && (str3 = dataBeanB.orderNo) != null) {
                str4 = str3;
            }
            p2PItemView3.setValue(str4);
            final int i7 = 0;
            p2PItemView3.setCopy(new Runnable() { // from class: Uc.J0
                @Override // java.lang.Runnable
                public final void run() {
                    String str5;
                    String str6;
                    TransactionDetailPage transactionDetailPage2 = transactionDetailPage;
                    switch (i7) {
                        case 0:
                            int i10 = TransactionDetailPage.f32922v;
                            QueryAppointmentDetailResp.DataBean dataBeanB2 = transactionDetailPage2.o().b();
                            if (dataBeanB2 != null && (str5 = dataBeanB2.orderNo) != null) {
                                ClipboardUtils.copyText(str5);
                                ToastUtils.showLong(Sc.e.p2p_str_copied);
                                break;
                            }
                            break;
                        default:
                            int i11 = TransactionDetailPage.f32922v;
                            QueryBalancePaymentDetailResp.DataBean dataBeanA = transactionDetailPage2.o().a();
                            if (dataBeanA != null && (str6 = dataBeanA.orderNo) != null) {
                                ClipboardUtils.copyText(str6);
                                ToastUtils.showLong(Sc.e.p2p_str_copied);
                                break;
                            }
                            break;
                    }
                }
            });
            TransactionDetailPage.l(transactionDetailPage).addView(p2PItemView3, (ViewGroup.LayoutParams) b0Var.invoke());
            Intrinsics.checkNotNullParameter(transactionDetailPage, "<this>");
            P2PItemView p2PItemView4 = new P2PItemView(transactionDetailPage);
            p2PItemView4.setName("Completion Time");
            QueryAppointmentDetailResp.DataBean dataBeanB2 = transactionDetailPage.o().b();
            long j6 = dataBeanB2 != null ? dataBeanB2.finishTime : 0L;
            if (j6 == 0) {
                p220oa.h.c(p2PItemView4);
            } else {
                p2PItemView4.setValue(new SimpleDateFormat("MMM d, yyyy HH:mm").format(new Date(j6)));
            }
            TransactionDetailPage.l(transactionDetailPage).addView(p2PItemView4, (ViewGroup.LayoutParams) b0Var.invoke());
            return;
        }
        if (Intrinsics.c(strQ, TransType.TRANS_TYPE_EXCHANGE_CASH_BALANCE_PAYMENT)) {
            Intrinsics.checkNotNullParameter(transactionDetailPage, "<this>");
            P2PItemView p2PItemView5 = new P2PItemView(transactionDetailPage);
            p2PItemView5.setName("Recipient Name");
            QueryBalancePaymentDetailResp.DataBean dataBeanA = transactionDetailPage.o().a();
            if (dataBeanA == null || (str = dataBeanA.networkName) == null) {
                str = "";
            }
            p2PItemView5.setValue(str);
            TransactionDetailPage.l(transactionDetailPage).addView(p2PItemView5, (ViewGroup.LayoutParams) b0Var.invoke());
            Intrinsics.checkNotNullParameter(transactionDetailPage, "<this>");
            P2PItemView p2PItemView6 = new P2PItemView(transactionDetailPage);
            p2PItemView6.setName("Payment Method");
            p2PItemView6.setValue("Balance");
            TransactionDetailPage.l(transactionDetailPage).addView(p2PItemView6, (ViewGroup.LayoutParams) b0Var.invoke());
            Intrinsics.checkNotNullParameter(transactionDetailPage, "<this>");
            P2PItemView p2PItemView7 = new P2PItemView(transactionDetailPage);
            p2PItemView7.setName("Transaction Type");
            p2PItemView7.setValue("Book Cash");
            TransactionDetailPage.l(transactionDetailPage).addView(p2PItemView7, (ViewGroup.LayoutParams) b0Var.invoke());
            Intrinsics.checkNotNullParameter(transactionDetailPage, "<this>");
            P2PItemView p2PItemView8 = new P2PItemView(transactionDetailPage);
            p2PItemView8.setName("Transaction ID");
            QueryBalancePaymentDetailResp.DataBean dataBeanA2 = transactionDetailPage.o().a();
            if (dataBeanA2 != null && (str2 = dataBeanA2.orderNo) != null) {
                str4 = str2;
            }
            p2PItemView8.setValue(str4);
            final int i10 = 1;
            p2PItemView8.setCopy(new Runnable() { // from class: Uc.J0
                @Override // java.lang.Runnable
                public final void run() {
                    String str5;
                    String str6;
                    TransactionDetailPage transactionDetailPage2 = transactionDetailPage;
                    switch (i10) {
                        case 0:
                            int i11 = TransactionDetailPage.f32922v;
                            QueryAppointmentDetailResp.DataBean dataBeanB3 = transactionDetailPage2.o().b();
                            if (dataBeanB3 != null && (str5 = dataBeanB3.orderNo) != null) {
                                ClipboardUtils.copyText(str5);
                                ToastUtils.showLong(Sc.e.p2p_str_copied);
                                break;
                            }
                            break;
                        default:
                            int i12 = TransactionDetailPage.f32922v;
                            QueryBalancePaymentDetailResp.DataBean dataBeanA3 = transactionDetailPage2.o().a();
                            if (dataBeanA3 != null && (str6 = dataBeanA3.orderNo) != null) {
                                ClipboardUtils.copyText(str6);
                                ToastUtils.showLong(Sc.e.p2p_str_copied);
                                break;
                            }
                            break;
                    }
                }
            });
            TransactionDetailPage.l(transactionDetailPage).addView(p2PItemView8, (ViewGroup.LayoutParams) b0Var.invoke());
            Intrinsics.checkNotNullParameter(transactionDetailPage, "<this>");
            P2PItemView p2PItemView9 = new P2PItemView(transactionDetailPage);
            p2PItemView9.setName("Completion Time");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM d, yyyy HH:mm");
            QueryBalancePaymentDetailResp.DataBean dataBeanA3 = transactionDetailPage.o().a();
            p2PItemView9.setValue(simpleDateFormat.format(Long.valueOf(dataBeanA3 != null ? dataBeanA3.finishTime : 0L)));
            TransactionDetailPage.l(transactionDetailPage).addView(p2PItemView9, (ViewGroup.LayoutParams) b0Var.invoke());
        }
    }

    public final void b() {
        String strB;
        String strB2;
        int i7 = TransactionDetailPage.f32922v;
        TransactionDetailPage transactionDetailPage = this.f9577a;
        String strQ = transactionDetailPage.q();
        boolean zC = Intrinsics.c(strQ, TransType.TRANS_TYPE_EXCHANGE_CASH_DEPOSIT);
        p355xf.t tVar = transactionDetailPage.f32927e;
        p355xf.t tVar2 = transactionDetailPage.f32928f;
        String str = "";
        if (!zC) {
            if (Intrinsics.c(strQ, TransType.TRANS_TYPE_EXCHANGE_CASH_BALANCE_PAYMENT)) {
                Object value = tVar2.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                ((TextView) value).setText("Booking Payment");
                Object value2 = tVar.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                TextView textView = (TextView) value2;
                QueryBalancePaymentDetailResp.DataBean dataBeanA = transactionDetailPage.o().a();
                if (dataBeanA != null && (strB = Pa.r0.B(dataBeanA.amount, false)) != null) {
                    str = strB;
                }
                textView.setText(str);
                QueryBalancePaymentDetailResp.DataBean dataBeanA2 = transactionDetailPage.o().a();
                if (dataBeanA2 != null) {
                    if (dataBeanA2.payStatus == 1) {
                        TransactionDetailPage.m(transactionDetailPage).setImageResource(com.transsnet.palmpay.custom_view.r.cv_operation_success);
                        TransactionDetailPage.n(transactionDetailPage).setText("Successful");
                        return;
                    } else {
                        TransactionDetailPage.m(transactionDetailPage).setImageResource(com.transsnet.palmpay.custom_view.r.cv_operation_fail);
                        TransactionDetailPage.n(transactionDetailPage).setText("Failed");
                        return;
                    }
                }
                return;
            }
            return;
        }
        Object value3 = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        ((TextView) value3).setText("Book Cash Deposit");
        Object value4 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        TextView textView2 = (TextView) value4;
        QueryAppointmentDetailResp.DataBean dataBeanB = transactionDetailPage.o().b();
        if (dataBeanB != null && (strB2 = Pa.r0.B(dataBeanB.depositMoney, false)) != null) {
            str = strB2;
        }
        textView2.setText(str);
        QueryAppointmentDetailResp.DataBean dataBeanB2 = transactionDetailPage.o().b();
        if (dataBeanB2 != null) {
            int i10 = dataBeanB2.payStatus;
            if (i10 == 1) {
                TransactionDetailPage.m(transactionDetailPage).setImageResource(com.transsnet.palmpay.custom_view.r.cv_operation_success);
                TransactionDetailPage.n(transactionDetailPage).setText("Successful");
                return;
            }
            switch (i10) {
                case 20:
                    TransactionDetailPage.m(transactionDetailPage).setImageResource(com.transsnet.palmpay.custom_view.r.cv_operation_success);
                    TransactionDetailPage.n(transactionDetailPage).setText("Refunding");
                    break;
                case 21:
                    TransactionDetailPage.m(transactionDetailPage).setImageResource(com.transsnet.palmpay.custom_view.r.cv_operation_success);
                    TransactionDetailPage.n(transactionDetailPage).setText("Refunded");
                    break;
                case 22:
                    TransactionDetailPage.m(transactionDetailPage).setImageResource(com.transsnet.palmpay.custom_view.r.cv_operation_fail);
                    TransactionDetailPage.n(transactionDetailPage).setText("Refund Failed");
                    break;
                default:
                    TransactionDetailPage.m(transactionDetailPage).setImageResource(com.transsnet.palmpay.custom_view.r.cv_operation_fail);
                    TransactionDetailPage.n(transactionDetailPage).setText("Failed");
                    break;
            }
        }
    }

    public final void c() {
        TransactionDetailPage transactionDetailPage = this.f9577a;
        p355xf.t tVar = transactionDetailPage.f32923a;
        Object value = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((OrderResultCustomerServiceModel) value).c();
        Object value2 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((OrderResultCustomerServiceModel) value2).d(Boolean.FALSE);
        Object value3 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        ((OrderResultCustomerServiceModel) value3).setOnCustomerServiceModelListener(new K0(transactionDetailPage));
    }
}

package Uc;

import android.content.Intent;
import com.transsnet.palmpay.p2pcash.ui.atm.BookingDetailPage;
import com.transsnet.palmpay.p2pcash.ui.atm.CashierDeskPage;
import com.transsnet.palmpay.p2pcash.ui.atm.dialog.PayBalancePaymentDialog;
import com.transsnet.palmpay.p2pcash.ui.atm.dialog.PayByNoticeDialog;
import com.transsnet.palmpay.p2pcash.ui.atm.dialog.PayDepositDialog;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class M implements PayByNoticeDialog.Listener, PayByNoticeDialog.CloseListener, PayDepositDialog.Listener, PayBalancePaymentDialog.Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CashierDeskPage f9579b;

    public /* synthetic */ M(CashierDeskPage cashierDeskPage, int i7) {
        this.f9578a = i7;
        this.f9579b = cashierDeskPage;
    }

    @Override // com.transsnet.palmpay.p2pcash.ui.atm.dialog.PayDepositDialog.Listener, com.transsnet.palmpay.p2pcash.ui.atm.dialog.PayBalancePaymentDialog.Listener
    public void onClick() {
        switch (this.f9578a) {
            case 3:
                ((L) this.f9579b.f32845A.getValue()).a();
                break;
            default:
                ((L) this.f9579b.f32845A.getValue()).a();
                break;
        }
    }

    @Override // com.transsnet.palmpay.p2pcash.ui.atm.dialog.PayByNoticeDialog.CloseListener
    public void onClose() {
        switch (this.f9578a) {
            case 2:
                this.f9579b.finish();
                break;
            case 3:
            default:
                this.f9579b.finish();
                break;
            case 4:
                this.f9579b.finish();
                break;
        }
    }

    @Override // com.transsnet.palmpay.p2pcash.ui.atm.dialog.PayByNoticeDialog.Listener
    public void onHandle(String orderId) {
        CashierDeskPage cashierDeskPage = this.f9579b;
        switch (this.f9578a) {
            case 0:
                int i7 = CashierDeskPage.f32844B;
                K kL = cashierDeskPage.l();
                Intrinsics.e(orderId);
                kL.a(orderId);
                break;
            default:
                P p3 = (P) cashierDeskPage.f32858w.getValue();
                Intrinsics.e(orderId);
                p3.getClass();
                Intrinsics.checkNotNullParameter(orderId, "orderId");
                CashierDeskPage cashierDeskPage2 = p3.f9583a;
                Intrinsics.checkNotNullParameter(cashierDeskPage2, "<this>");
                Intent intent = new Intent(cashierDeskPage2, (Class<?>) BookingDetailPage.class);
                intent.putExtra("APPOINTMENT_ORDER_ID", orderId);
                cashierDeskPage2.startActivity(intent);
                break;
        }
    }
}

package Uc;

import android.content.Intent;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.transsnet.palmpay.p2pcash.ui.atm.BookingDetailPage;
import com.transsnet.palmpay.p2pcash.ui.atm.CashierDeskPage;
import com.transsnet.palmpay.p2pcash.ui.atm.view.P2PButton;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Uc.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0655f implements SwipeRefreshLayout.OnRefreshListener, P2PButton.OnP2PButtonClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BookingDetailPage f9642b;

    public /* synthetic */ C0655f(BookingDetailPage bookingDetailPage, int i7) {
        this.f9641a = i7;
        this.f9642b = bookingDetailPage;
    }

    @Override // com.transsnet.palmpay.p2pcash.ui.atm.view.P2PButton.OnP2PButtonClickListener
    public void onClick() {
        int i7 = 1;
        BookingDetailPage bookingDetailPage = this.f9642b;
        switch (this.f9641a) {
            case 1:
                int i10 = BookingDetailPage.f32801H;
                bookingDetailPage.q().b();
                C0659h c0659hR = bookingDetailPage.r();
                c0659hR.getClass();
                BookingDetailPage bookingDetailPage2 = c0659hR.f9648a;
                int iQ = bookingDetailPage2.q().b().q();
                String str = "You already booked an appointment and you are just few steps away from getting your notes";
                if (iQ != 1) {
                    if (iQ != 2) {
                        str = iQ != 3 ? "" : "This is the last step to getting your notes cash. If you cancel now, the N100 booking deposit will not be refunded";
                    } else if (bookingDetailPage2.q().b().j() >= bookingDetailPage2.q().b().p()) {
                        str = "This is the last step to getting your notes. If you cancel now, the N100 booking deposit will not be refunded";
                    }
                }
                Intrinsics.checkNotNullParameter(bookingDetailPage2, "<this>");
                O6.c cVar = new O6.c(bookingDetailPage2);
                cVar.f6596b = O6.d.f("Cancel Booking Request?");
                cVar.f6598d = str;
                String string = bookingDetailPage2.getString(Sc.e.p2p_cancel_order_text);
                ViewOnClickListenerC0653e viewOnClickListenerC0653e = new ViewOnClickListenerC0653e(bookingDetailPage2, i7);
                cVar.f6600f = string;
                cVar.f6602h = viewOnClickListenerC0653e;
                cVar.f6601g = bookingDetailPage2.getString(p025ba.k.core_later);
                cVar.f6603i = null;
                cVar.a().show();
                break;
            default:
                int i11 = BookingDetailPage.f32801H;
                Vc.c cVarB = bookingDetailPage.q().b();
                C0661i c0661i = (C0661i) bookingDetailPage.f32804C.getValue();
                String bookingId = cVarB.r();
                c0661i.getClass();
                Intrinsics.checkNotNullParameter(bookingId, "bookingId");
                BookingDetailPage bookingDetailPage3 = c0661i.f9652a;
                Intrinsics.checkNotNullParameter(bookingDetailPage3, "<this>");
                Intent intent = new Intent(bookingDetailPage3, (Class<?>) CashierDeskPage.class);
                intent.putExtra("TYPE", 2);
                intent.putExtra("BOOKING_ID", bookingId);
                bookingDetailPage3.startActivity(intent);
                break;
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        int i7 = BookingDetailPage.f32801H;
        this.f9642b.q().d();
    }
}

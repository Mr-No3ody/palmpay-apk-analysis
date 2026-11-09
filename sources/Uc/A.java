package Uc;

import com.transsnet.palmpay.p2pcash.business.IApiP2PCashService;
import com.transsnet.palmpay.p2pcash.ui.atm.BookingNotesPage;
import com.transsnet.palmpay.p2pcash.ui.atm.view.P2PButton;
import com.transsnet.palmpay.p2pcash.ui.atm.view.P2PInputAmountView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class A implements P2PButton.OnP2PButtonClickListener, P2PInputAmountView.Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BookingNotesPage f9524a;

    public /* synthetic */ A(BookingNotesPage bookingNotesPage) {
        this.f9524a = bookingNotesPage;
    }

    @Override // com.transsnet.palmpay.p2pcash.ui.atm.view.P2PButton.OnP2PButtonClickListener
    public void onClick() {
        BookingNotesPage bookingNotesPage = this.f9524a;
        P2PInputAmountView p2PInputAmountViewM = BookingNotesPage.m(bookingNotesPage);
        C0681z c0681zN = bookingNotesPage.n();
        if (((Number) c0681zN.f9745c.getValue(c0681zN, C0681z.f9742f[1])).longValue() >= p2PInputAmountViewM.f33014o) {
            BookingNotesPage bookingNotesPage2 = bookingNotesPage.n().f9747e;
            bookingNotesPage2.showLoadingDialog(true);
            ((IApiP2PCashService) Tc.a.f9070a.f41176b).queryAppointmentTime().k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C0678w(bookingNotesPage2));
        } else {
            p2PInputAmountViewM.f33009e.setVisibility(0);
            p2PInputAmountViewM.f33008d.setBackgroundColor(p2PInputAmountViewM.f33005a.getColor(L6.b.ppColorError));
        }
    }

    @Override // com.transsnet.palmpay.p2pcash.ui.atm.view.P2PInputAmountView.Listener
    public void onNumChanged(long j6) {
        int i7 = BookingNotesPage.f32830A;
        C0681z c0681zN = this.f9524a.n();
        c0681zN.f9745c.setValue(c0681zN, C0681z.f9742f[1], Long.valueOf(j6));
    }
}

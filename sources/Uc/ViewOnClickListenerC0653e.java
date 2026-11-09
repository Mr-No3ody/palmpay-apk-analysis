package Uc;

import android.view.View;
import com.transsnet.palmpay.p2pcash.business.IApiP2PCashService;
import com.transsnet.palmpay.p2pcash.ui.atm.BookingDetailPage;

/* JADX INFO: renamed from: Uc.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC0653e implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BookingDetailPage f9633b;

    public /* synthetic */ ViewOnClickListenerC0653e(BookingDetailPage bookingDetailPage, int i7) {
        this.f9632a = i7;
        this.f9633b = bookingDetailPage;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        BookingDetailPage bookingDetailPage = this.f9633b;
        switch (this.f9632a) {
            case 0:
                bookingDetailPage.onBackPressed();
                break;
            default:
                int i7 = BookingDetailPage.f32801H;
                C0651d c0651dQ = bookingDetailPage.q();
                BookingDetailPage bookingDetailPage2 = c0651dQ.f9628d;
                bookingDetailPage2.showLoadingDialog(true);
                ((IApiP2PCashService) Tc.a.f9070a.f41176b).cancelOrder(c0651dQ.b().r()).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new N8.r(3, bookingDetailPage2, c0651dQ));
                break;
        }
    }
}

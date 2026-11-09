package Uc;

import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.p2pcash.ui.atm.BookingHistoryPage;

/* JADX INFO: renamed from: Uc.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0674s implements SwipeRecyclerView.OnLoadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BookingHistoryPage f9720a;

    public C0674s(BookingHistoryPage bookingHistoryPage) {
        this.f9720a = bookingHistoryPage;
    }

    @Override // com.transsnet.palmpay.custom_view.SwipeRecyclerView.OnLoadListener
    public final void onLoadMore() {
        int i7 = BookingHistoryPage.f32818v;
        BookingHistoryPage bookingHistoryPage = this.f9720a;
        if (bookingHistoryPage.m().f9707b) {
            BookingHistoryPage.l(bookingHistoryPage).c();
        } else {
            BookingHistoryPage.l(bookingHistoryPage).a();
            bookingHistoryPage.m().a(bookingHistoryPage.m().f9706a + 1);
        }
    }

    @Override // com.transsnet.palmpay.custom_view.SwipeRecyclerView.OnLoadListener
    public final void onRefresh() {
        int i7 = BookingHistoryPage.f32818v;
        this.f9720a.m().a(1);
    }
}

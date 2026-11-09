package Uc;

import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.p2pcash.bean.rsp.QueryAppointmentHistoryResp;
import com.transsnet.palmpay.p2pcash.ui.atm.BookingHistoryPage;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: renamed from: Uc.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0671o extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ BookingHistoryPage f9692f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9693g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0672p f9694i;

    public C0671o(BookingHistoryPage bookingHistoryPage, int i7, C0672p c0672p) {
        this.f9692f = bookingHistoryPage;
        this.f9693g = i7;
        this.f9694i = c0672p;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        this.f9692f.addSubscription(d2);
    }

    @Override // Z4.e
    public final void w(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        ToastUtils.showLong(msg, new Object[0]);
        int i7 = BookingHistoryPage.f32818v;
        SwipeRecyclerView swipeRecyclerViewL = BookingHistoryPage.l(this.f9692f.n().f9723a);
        swipeRecyclerViewL.f31142d.setRefreshing(false);
        swipeRecyclerViewL.c();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a5  */
    @Override // Z4.e
    public final void y(Object obj) {
        List<QueryAppointmentHistoryResp.ListBean> list;
        List<QueryAppointmentHistoryResp.ListBean> list2;
        List<QueryAppointmentHistoryResp.ListBean> list3;
        QueryAppointmentHistoryResp resp = (QueryAppointmentHistoryResp) obj;
        Intrinsics.checkNotNullParameter(resp, "resp");
        int i7 = BookingHistoryPage.f32818v;
        BookingHistoryPage bookingHistoryPage = this.f9692f;
        SwipeRecyclerView swipeRecyclerViewL = BookingHistoryPage.l(bookingHistoryPage.n().f9723a);
        swipeRecyclerViewL.f31142d.setRefreshing(false);
        swipeRecyclerViewL.c();
        QueryAppointmentHistoryResp queryAppointmentHistoryResp = resp.isSuccess() ? resp : null;
        if (queryAppointmentHistoryResp != null) {
            int i10 = this.f9693g;
            C0672p c0672p = this.f9694i;
            if (i10 == 1) {
                QueryAppointmentHistoryResp.DataBean dataBean = queryAppointmentHistoryResp.data;
                ArrayList arrayList = new ArrayList((dataBean == null || (list3 = dataBean.list) == null) ? kotlin.collections.z.f38935a : list3);
                c0672p.getClass();
                Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
                c0672p.f9708c.setValue(c0672p, C0672p.f9705e[0], arrayList);
                c0672p.f9707b = false;
                c0672p.f9706a = 1;
            } else {
                QueryAppointmentHistoryResp.DataBean dataBean2 = queryAppointmentHistoryResp.data;
                if (dataBean2 == null || (list = dataBean2.list) == null) {
                    c0672p.f9707b = true;
                    BookingHistoryPage bookingHistoryPage2 = bookingHistoryPage.n().f9723a;
                    BookingHistoryPage.l(bookingHistoryPage2).b(bookingHistoryPage2.getString(Sc.e.p2p_str_end));
                } else {
                    if (list.isEmpty()) {
                        list = null;
                    }
                    if (list != null) {
                        c0672p.getClass();
                        KProperty<?>[] kPropertyArr = C0672p.f9705e;
                        KProperty<?> kProperty = kPropertyArr[0];
                        C0649c c0649c = c0672p.f9708c;
                        ArrayList arrayList2 = (ArrayList) c0649c.getValue(c0672p, kProperty);
                        QueryAppointmentHistoryResp.DataBean dataBean3 = queryAppointmentHistoryResp.data;
                        arrayList2.addAll(new ArrayList((dataBean3 == null || (list2 = dataBean3.list) == null) ? kotlin.collections.z.f38935a : list2));
                        ArrayList arrayList3 = (ArrayList) c0649c.getValue(c0672p, kPropertyArr[0]);
                        Intrinsics.checkNotNullParameter(arrayList3, "<set-?>");
                        c0649c.setValue(c0672p, kPropertyArr[0], arrayList3);
                        c0672p.f9706a = i10;
                    } else {
                        c0672p.f9707b = true;
                        BookingHistoryPage bookingHistoryPage3 = bookingHistoryPage.n().f9723a;
                        BookingHistoryPage.l(bookingHistoryPage3).b(bookingHistoryPage3.getString(Sc.e.p2p_str_end));
                    }
                }
            }
        }
        if ((resp.isSuccess() ? resp : null) == null) {
            ToastUtils.showLong(resp.getRespMsg(), new Object[0]);
            Unit unit = Unit.f38893a;
        }
    }
}

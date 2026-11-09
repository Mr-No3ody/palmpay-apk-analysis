package Uc;

import com.transsnet.palmpay.p2pcash.bean.rsp.QueryAppointmentTimeResp;
import com.transsnet.palmpay.p2pcash.ui.atm.BookingNotesPage;
import com.transsnet.palmpay.p2pcash.ui.atm.dialog.ReservationTimeDialog;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Uc.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0678w extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ BookingNotesPage f9732f;

    public C0678w(BookingNotesPage bookingNotesPage) {
        this.f9732f = bookingNotesPage;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        this.f9732f.addSubscription(d2);
    }

    @Override // Z4.e
    public final void w(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.f9732f.showLoadingDialog(false);
        ToastUtils.showLong(msg, new Object[0]);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        List<QueryAppointmentTimeResp.TimeRangeListBean> list;
        QueryAppointmentTimeResp resp = (QueryAppointmentTimeResp) obj;
        Intrinsics.checkNotNullParameter(resp, "resp");
        BookingNotesPage bookingNotesPage = this.f9732f;
        bookingNotesPage.showLoadingDialog(false);
        QueryAppointmentTimeResp queryAppointmentTimeResp = resp.isSuccess() ? resp : null;
        if (queryAppointmentTimeResp != null) {
            int i7 = BookingNotesPage.f32830A;
            C cO = bookingNotesPage.o();
            long j6 = queryAppointmentTimeResp.data.currentTime;
            QueryAppointmentTimeResp.DataBean dataBean = queryAppointmentTimeResp.data;
            ArrayList<QueryAppointmentTimeResp.TimeRangeListBean> timeRangeData = new ArrayList<>((Collection<? extends QueryAppointmentTimeResp.TimeRangeListBean>) ((dataBean == null || (list = dataBean.timeRangeList) == null) ? kotlin.collections.z.f38935a : list));
            cO.getClass();
            Intrinsics.checkNotNullParameter(timeRangeData, "timeRangeData");
            BookingNotesPage bookingNotesPage2 = cO.f9534a;
            Intrinsics.checkNotNullParameter(bookingNotesPage2, "<this>");
            ReservationTimeDialog reservationTimeDialog = new ReservationTimeDialog(bookingNotesPage2);
            reservationTimeDialog.show();
            reservationTimeDialog.setData(j6, timeRangeData);
            reservationTimeDialog.setListener(new B(0, bookingNotesPage2, reservationTimeDialog));
        }
        if ((resp.isSuccess() ? resp : null) == null) {
            ToastUtils.showLong(resp.getRespMsg(), new Object[0]);
            Unit unit = Unit.f38893a;
        }
    }
}

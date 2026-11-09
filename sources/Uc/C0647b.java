package Uc;

import com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout;
import com.transsnet.palmpay.p2pcash.bean.rsp.QueryAppointmentDetailResp;
import com.transsnet.palmpay.p2pcash.ui.atm.BookingDetailPage;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Uc.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0647b extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ BookingDetailPage f9616f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0651d f9617g;

    public C0647b(C0651d c0651d, BookingDetailPage bookingDetailPage) {
        this.f9616f = bookingDetailPage;
        this.f9617g = c0651d;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        this.f9616f.addSubscription(d2);
    }

    @Override // Z4.e
    public final void w(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        BookingDetailPage bookingDetailPage = this.f9616f;
        bookingDetailPage.showLoadingDialog(false);
        int i7 = BookingDetailPage.f32801H;
        Object value = bookingDetailPage.r().f9648a.t.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((VerticalSwipeRefreshLayout) value).setRefreshing(false);
        ToastUtils.showLong(msg, new Object[0]);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        QueryAppointmentDetailResp resp = (QueryAppointmentDetailResp) obj;
        Intrinsics.checkNotNullParameter(resp, "resp");
        BookingDetailPage bookingDetailPage = this.f9616f;
        bookingDetailPage.showLoadingDialog(false);
        int i7 = BookingDetailPage.f32801H;
        Object value = bookingDetailPage.r().f9648a.t.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((VerticalSwipeRefreshLayout) value).setRefreshing(false);
        QueryAppointmentDetailResp queryAppointmentDetailResp = resp.isSuccess() ? resp : null;
        if (queryAppointmentDetailResp != null) {
            QueryAppointmentDetailResp.DataBean dataBean = queryAppointmentDetailResp.data;
            if (dataBean == null) {
                return;
            }
            C0651d c0651d = this.f9617g;
            c0651d.f9625a.setValue(c0651d, C0651d.f9624e[0], dataBean);
        }
        if ((resp.isSuccess() ? resp : null) == null) {
            ToastUtils.showLong(resp.getRespMsg(), new Object[0]);
            Unit unit = Unit.f38893a;
        }
    }
}

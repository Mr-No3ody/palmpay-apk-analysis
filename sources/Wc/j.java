package Wc;

import com.transsnet.palmpay.p2pcash.bean.rsp.QueryAppointmentTimeBusinessCountResp;
import com.transsnet.palmpay.p2pcash.ui.atm.dialog.ReservationTimeDialog;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ReservationTimeDialog f10681f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m f10682g;

    public j(ReservationTimeDialog reservationTimeDialog, m mVar) {
        this.f10681f = reservationTimeDialog;
        this.f10682g = mVar;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        this.f10681f.addSubscription(d2);
    }

    @Override // Z4.e
    public final void w(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        ToastUtils.showLong(msg, new Object[0]);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        QueryAppointmentTimeBusinessCountResp resp = (QueryAppointmentTimeBusinessCountResp) obj;
        Intrinsics.checkNotNullParameter(resp, "resp");
        QueryAppointmentTimeBusinessCountResp queryAppointmentTimeBusinessCountResp = resp.isSuccess() ? resp : null;
        if (queryAppointmentTimeBusinessCountResp != null) {
            List<QueryAppointmentTimeBusinessCountResp.DataBean> list = queryAppointmentTimeBusinessCountResp.data;
            ArrayList arrayList = new ArrayList(list != null ? list : z.f38935a);
            m mVar = this.f10682g;
            mVar.getClass();
            Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
            mVar.f10692e.setValue(mVar, m.f10687j[4], arrayList);
        }
        if ((resp.isSuccess() ? resp : null) == null) {
            ToastUtils.showLong(resp.getRespMsg(), new Object[0]);
            Unit unit = Unit.f38893a;
        }
    }
}

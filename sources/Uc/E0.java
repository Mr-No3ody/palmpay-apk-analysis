package Uc;

import com.transsnet.palmpay.p2pcash.bean.rsp.QueryAppointmentDetailResp;
import com.transsnet.palmpay.p2pcash.ui.atm.TransactionDetailPage;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class E0 extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TransactionDetailPage f9541f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ H0 f9542g;

    public E0(TransactionDetailPage transactionDetailPage, H0 h7) {
        this.f9541f = transactionDetailPage;
        this.f9542g = h7;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        this.f9541f.addSubscription(d2);
    }

    @Override // Z4.e
    public final void w(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        ToastUtils.showLong(msg, new Object[0]);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        QueryAppointmentDetailResp resp = (QueryAppointmentDetailResp) obj;
        Intrinsics.checkNotNullParameter(resp, "resp");
        QueryAppointmentDetailResp queryAppointmentDetailResp = resp.isSuccess() ? resp : null;
        if (queryAppointmentDetailResp != null) {
            QueryAppointmentDetailResp.DataBean dataBean = queryAppointmentDetailResp.data;
            H0 h7 = this.f9542g;
            h7.f9554a.setValue(h7, H0.f9553d[0], dataBean);
        }
        if ((resp.isSuccess() ? resp : null) == null) {
            ToastUtils.showLong(resp.getRespMsg(), new Object[0]);
            Unit unit = Unit.f38893a;
        }
    }
}

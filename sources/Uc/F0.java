package Uc;

import com.transsnet.palmpay.p2pcash.bean.rsp.QueryBalancePaymentDetailResp;
import com.transsnet.palmpay.p2pcash.ui.atm.TransactionDetailPage;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class F0 extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TransactionDetailPage f9545f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ H0 f9546g;

    public F0(TransactionDetailPage transactionDetailPage, H0 h7) {
        this.f9545f = transactionDetailPage;
        this.f9546g = h7;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        this.f9545f.addSubscription(d2);
    }

    @Override // Z4.e
    public final void w(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        ToastUtils.showLong(msg, new Object[0]);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        QueryBalancePaymentDetailResp resp = (QueryBalancePaymentDetailResp) obj;
        Intrinsics.checkNotNullParameter(resp, "resp");
        QueryBalancePaymentDetailResp queryBalancePaymentDetailResp = resp.isSuccess() ? resp : null;
        if (queryBalancePaymentDetailResp != null) {
            QueryBalancePaymentDetailResp.DataBean dataBean = queryBalancePaymentDetailResp.data;
            H0 h7 = this.f9546g;
            h7.f9555b.setValue(h7, H0.f9553d[1], dataBean);
        }
        if ((resp.isSuccess() ? resp : null) == null) {
            ToastUtils.showLong(resp.getRespMsg(), new Object[0]);
            Unit unit = Unit.f38893a;
        }
    }
}

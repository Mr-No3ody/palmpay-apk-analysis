package Uc;

import com.transsnet.palmpay.p2pcash.bean.rsp.CreateBalancePaymentOrderResp;
import com.transsnet.palmpay.p2pcash.ui.atm.CashierDeskPage;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class F extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ CashierDeskPage f9543f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ K f9544g;

    public F(CashierDeskPage cashierDeskPage, K k2) {
        this.f9543f = cashierDeskPage;
        this.f9544g = k2;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        this.f9543f.addSubscription(d2);
    }

    @Override // Z4.e
    public final void w(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        CashierDeskPage cashierDeskPage = this.f9543f;
        cashierDeskPage.showLoadingDialog(false);
        ToastUtils.showLong(msg, new Object[0]);
        cashierDeskPage.finish();
    }

    @Override // Z4.e
    public final void y(Object obj) {
        CreateBalancePaymentOrderResp resp = (CreateBalancePaymentOrderResp) obj;
        Intrinsics.checkNotNullParameter(resp, "resp");
        CashierDeskPage cashierDeskPage = this.f9543f;
        cashierDeskPage.showLoadingDialog(false);
        CreateBalancePaymentOrderResp createBalancePaymentOrderResp = resp.isSuccess() ? resp : null;
        if (createBalancePaymentOrderResp != null) {
            CreateBalancePaymentOrderResp.DataBean dataBean = createBalancePaymentOrderResp.data;
            K k2 = this.f9544g;
            k2.f9568b.setValue(k2, K.f9566i[1], dataBean);
        }
        if ((resp.isSuccess() ? resp : null) == null) {
            ToastUtils.showLong(resp.getRespMsg(), new Object[0]);
            cashierDeskPage.finish();
            Unit unit = Unit.f38893a;
        }
    }
}

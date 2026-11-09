package C9;

import com.transsnet.palmpay.cash_in.bean.response.CreateCashInOutOrderRsp;
import com.transsnet.palmpay.cash_in.ui.activity.ConfirmAndPayWithdrawOrderActivity;
import com.transsnet.palmpay.core.bean.OrderStatusData;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;

/* JADX INFO: renamed from: C9.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0148o extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ConfirmAndPayWithdrawOrderActivity f1320f;

    public C0148o(ConfirmAndPayWithdrawOrderActivity confirmAndPayWithdrawOrderActivity) {
        this.f1320f = confirmAndPayWithdrawOrderActivity;
    }

    @Override // Z4.e
    public final void w(String str) {
        ConfirmAndPayWithdrawOrderActivity confirmAndPayWithdrawOrderActivity = this.f1320f;
        F6.d.c(confirmAndPayWithdrawOrderActivity.TAG, C0.G.o("onFailure:", str));
        ToastUtils.showLong(str);
        confirmAndPayWithdrawOrderActivity.showLoadingDialog(false);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        CreateCashInOutOrderRsp createCashInOutOrderRsp = (CreateCashInOutOrderRsp) obj;
        ConfirmAndPayWithdrawOrderActivity confirmAndPayWithdrawOrderActivity = this.f1320f;
        if (createCashInOutOrderRsp == null) {
            confirmAndPayWithdrawOrderActivity.showLoadingDialog(false);
            return;
        }
        OrderStatusData orderStatusData = createCashInOutOrderRsp.data;
        if (orderStatusData == null) {
            confirmAndPayWithdrawOrderActivity.showLoadingDialog(false);
            F6.d.c(confirmAndPayWithdrawOrderActivity.TAG, "createCashInOrder() , OrderStatusData == null, no orderNo returned");
            ToastUtils.showShort("create cash-in order fail,no orderId returned");
        } else {
            String orderNo = orderStatusData.getOrderNo();
            int i7 = ConfirmAndPayWithdrawOrderActivity.f26830Y;
            confirmAndPayWithdrawOrderActivity.f574e = orderNo;
            confirmAndPayWithdrawOrderActivity.f573d = confirmAndPayWithdrawOrderActivity.f26836M.payAmount;
            confirmAndPayWithdrawOrderActivity.m();
        }
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
    }
}

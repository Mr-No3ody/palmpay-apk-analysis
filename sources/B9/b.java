package B9;

import Pa.C0525w;
import Z4.e;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.cash_in.ui.activity.ConfirmAndPayWithdrawOrderActivity;
import com.transsnet.palmpay.core.bean.BankCardInfo;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.payment.CheckPayReq;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;
import com.transsnet.palmpay.core.ui.activity.d0;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ConfirmAndPayWithdrawOrderActivity f569f;

    public b(ConfirmAndPayWithdrawOrderActivity confirmAndPayWithdrawOrderActivity) {
        this.f569f = confirmAndPayWithdrawOrderActivity;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        this.f569f.addSubscription(disposable);
    }

    @Override // Z4.e
    public final void w(String str) {
        ConfirmAndPayWithdrawOrderActivity confirmAndPayWithdrawOrderActivity = this.f569f;
        confirmAndPayWithdrawOrderActivity.showLoadingDialog(false);
        c.l(confirmAndPayWithdrawOrderActivity, str);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        PayByOrderResp payByOrderResp = (PayByOrderResp) obj;
        boolean zIsSuccess = payByOrderResp.isSuccess();
        ConfirmAndPayWithdrawOrderActivity confirmAndPayWithdrawOrderActivity = this.f569f;
        if (!zIsSuccess) {
            c.l(confirmAndPayWithdrawOrderActivity, payByOrderResp.getRespMsg());
        } else {
            if (payByOrderResp.getData() == null) {
                ToastUtils.showShort("Server return null");
                return;
            }
            int i7 = 8;
            if (payByOrderResp.getData().flag) {
                CheckPayReq checkPayReq = new CheckPayReq();
                checkPayReq.orderNo = confirmAndPayWithdrawOrderActivity.f574e;
                checkPayReq.orderType = "3";
                checkPayReq.transType = "02";
                checkPayReq.payId = payByOrderResp.getData().payId;
                checkPayReq.subPayId = payByOrderResp.getData().subPayId;
                checkPayReq.url = payByOrderResp.getData().url;
                checkPayReq.verifyMethod = payByOrderResp.getData().verifyMethod;
                checkPayReq.payRouteId = payByOrderResp.getData().payRouteId;
                checkPayReq.payAmount = confirmAndPayWithdrawOrderActivity.f573d;
                checkPayReq.transType = "02";
                try {
                    checkPayReq.feeAmount = C0525w.i(payByOrderResp.getData().orderData, "payFee").longValue();
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                d0 d0Var = new d0(confirmAndPayWithdrawOrderActivity);
                d0Var.f27748b = checkPayReq;
                d0Var.f27757k = false;
                BankCardInfo bankCardInfo = confirmAndPayWithdrawOrderActivity.f571b;
                if (bankCardInfo == null) {
                    i7 = 0;
                } else if (!"MobileWallet".equals(bankCardInfo.accountType)) {
                    i7 = 5;
                }
                d0Var.f27750d = Integer.valueOf(i7);
                d0Var.a();
                confirmAndPayWithdrawOrderActivity.finish();
            } else {
                confirmAndPayWithdrawOrderActivity.getClass();
                ARouter.getInstance().build("/cashin_out/withdraw_result").withParcelable("extra_data", payByOrderResp.getData()).navigation();
                org.greenrobot.eventbus.c.b().f(new MessageEvent(8, ""));
            }
        }
        confirmAndPayWithdrawOrderActivity.showLoadingDialog(false);
    }
}

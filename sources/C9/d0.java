package C9;

import com.transsnet.palmpay.cash_in.ui.activity.WithdrawResultActivity;
import com.transsnet.palmpay.core.bean.payment.CheckPayResp;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ WithdrawResultActivity f1299f;

    public d0(WithdrawResultActivity withdrawResultActivity) {
        this.f1299f = withdrawResultActivity;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        this.f1299f.addSubscription(disposable);
    }

    @Override // Z4.e
    public final void w(String str) {
        ToastUtils.showShort(str);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        CheckPayResp checkPayResp = (CheckPayResp) obj;
        if (checkPayResp == null || !checkPayResp.isSuccess()) {
            return;
        }
        PayByOrderResp.DataBean data = checkPayResp.getData();
        WithdrawResultActivity withdrawResultActivity = this.f1299f;
        withdrawResultActivity.f26969o = data;
        withdrawResultActivity.initData();
    }
}

package Fe;

import com.transsnet.palmpay.core.bean.BalanceAccountInfo;
import com.transsnet.palmpay.ui.mvp.contract.PalmPayStatementContract;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes4.dex */
public final class P extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Q f2744f;

    public P(Q q10) {
        this.f2744f = q10;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        this.f2744f.addSubscription(disposable);
    }

    @Override // Z4.e
    public final void w(String str) {
        ToastUtils.showLong(str);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        BalanceAccountInfo balanceAccountInfo = (BalanceAccountInfo) obj;
        if (balanceAccountInfo.isSuccess()) {
            ((PalmPayStatementContract.View) this.f2744f.f27351a).handleBalanceAccountInfo(balanceAccountInfo);
        } else {
            ToastUtils.showLong(balanceAccountInfo.getRespMsg());
        }
    }
}

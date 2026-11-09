package Fe;

import com.transsnet.palmpay.core.bean.rsp.QueryOrderNoRsp;
import com.transsnet.palmpay.ui.mvp.contract.PalmPayStatementContract;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes4.dex */
public final class O extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f2742f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Q f2743g;

    public O(Q q10, String str) {
        this.f2743g = q10;
        this.f2742f = str;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        this.f2743g.addSubscription(disposable);
    }

    @Override // Z4.e
    public final void w(String str) {
        ToastUtils.showLong(str);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        QueryOrderNoRsp queryOrderNoRsp = (QueryOrderNoRsp) obj;
        if (queryOrderNoRsp.isSuccess()) {
            ((PalmPayStatementContract.View) this.f2743g.f27351a).onOrderNoReceived(this.f2742f, queryOrderNoRsp);
        } else if ("CFRONT_400007".equals(queryOrderNoRsp.getRespCode())) {
            ToastUtils.showShort("No detail");
        }
    }
}

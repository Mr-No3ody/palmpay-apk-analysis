package La;

import com.transsnet.palmpay.core.bean.req.CheckBankCardInfoReq;
import com.transsnet.palmpay.core.bean.rsp.CheckBankCardInfoRsp;
import com.transsnet.palmpay.core.ui.mvp.contract.AddBankAccountContract;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ CheckBankCardInfoReq f5580f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h f5581g;

    public g(h hVar, CheckBankCardInfoReq checkBankCardInfoReq) {
        this.f5581g = hVar;
        this.f5580f = checkBankCardInfoReq;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        this.f5581g.addSubscription(disposable);
    }

    @Override // Z4.e
    public final void w(String str) {
        ((AddBankAccountContract.IView) this.f5581g.f27351a).showLoadingView(false);
        ToastUtils.showLong(str);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        h hVar = this.f5581g;
        ((AddBankAccountContract.IView) hVar.f27351a).showLoadingView(false);
        ((AddBankAccountContract.IView) hVar.f27351a).handleCheckInputBankAccountInfoRsp(this.f5580f, (CheckBankCardInfoRsp) obj);
    }
}

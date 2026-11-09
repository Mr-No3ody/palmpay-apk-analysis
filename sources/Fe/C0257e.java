package Fe;

import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.ui.mvp.contract.BankCardDetailContract;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;

/* JADX INFO: renamed from: Fe.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0257e extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0258f f2768f;

    public C0257e(C0258f c0258f) {
        this.f2768f = c0258f;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        this.f2768f.addSubscription(disposable);
    }

    @Override // Z4.e
    public final void w(String str) {
        ToastUtils.showLong(str);
        ((BankCardDetailContract.View) this.f2768f.f27351a).showLoadingView(false);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        C0258f c0258f = this.f2768f;
        ((BankCardDetailContract.View) c0258f.f27351a).showLoadingView(false);
        ((BankCardDetailContract.View) c0258f.f27351a).handleSetDefaultCardResult((CommonResult) obj);
    }
}

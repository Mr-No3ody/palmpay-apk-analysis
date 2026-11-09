package Fe;

import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.ui.mvp.contract.BankCardDetailContract;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;

/* JADX INFO: renamed from: Fe.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0255c extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0258f f2762f;

    public C0255c(C0258f c0258f) {
        this.f2762f = c0258f;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        this.f2762f.addSubscription(disposable);
    }

    @Override // Z4.e
    public final void w(String str) {
        ((BankCardDetailContract.View) this.f2762f.f27351a).showLoadingView(false);
        ToastUtils.showLong(str);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        C0258f c0258f = this.f2762f;
        ((BankCardDetailContract.View) c0258f.f27351a).showLoadingView(false);
        ((BankCardDetailContract.View) c0258f.f27351a).showDeleteResult((CommonResult) obj);
    }
}

package La;

import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.ui.mvp.contract.AddBankAccountContract;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;

/* JADX INFO: renamed from: La.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0440f extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h f5579f;

    public C0440f(h hVar) {
        this.f5579f = hVar;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        this.f5579f.addSubscription(disposable);
    }

    @Override // Z4.e
    public final void w(String str) {
        ((AddBankAccountContract.IView) this.f5579f.f27351a).showLoadingView(false);
        ToastUtils.showLong(str);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        h hVar = this.f5579f;
        ((AddBankAccountContract.IView) hVar.f27351a).showLoadingView(false);
        ((AddBankAccountContract.IView) hVar.f27351a).handleAddTzBankAccountResult((CommonResult) obj);
    }
}

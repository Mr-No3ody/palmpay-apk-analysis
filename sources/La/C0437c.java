package La;

import com.transsnet.palmpay.core.bean.rsp.AddPayBankAccRsp;
import com.transsnet.palmpay.core.ui.mvp.contract.AddBankAccountContract;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;

/* JADX INFO: renamed from: La.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0437c extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h f5576f;

    public C0437c(h hVar) {
        this.f5576f = hVar;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        this.f5576f.addSubscription(disposable);
    }

    @Override // Z4.e
    public final void w(String str) {
        ToastUtils.showLong(str);
        ((AddBankAccountContract.IView) this.f5576f.f27351a).showLoadingView(false);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        h hVar = this.f5576f;
        ((AddBankAccountContract.IView) hVar.f27351a).showLoadingView(false);
        ((AddBankAccountContract.IView) hVar.f27351a).handleAddBankAccountResult((AddPayBankAccRsp) obj);
    }
}

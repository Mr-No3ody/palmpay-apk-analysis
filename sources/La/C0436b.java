package La;

import com.transsnet.palmpay.core.bean.rsp.BindActionRsp;
import com.transsnet.palmpay.core.ui.mvp.contract.AddBankAccountContract;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;

/* JADX INFO: renamed from: La.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0436b extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h f5575f;

    public C0436b(h hVar) {
        this.f5575f = hVar;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        this.f5575f.addSubscription(disposable);
    }

    @Override // Z4.e
    public final void w(String str) {
        ToastUtils.showLong(str);
        ((AddBankAccountContract.IView) this.f5575f.f27351a).showLoadingView(false);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        h hVar = this.f5575f;
        ((AddBankAccountContract.IView) hVar.f27351a).showLoadingView(false);
        ((AddBankAccountContract.IView) hVar.f27351a).handleBindResult((BindActionRsp) obj);
    }
}

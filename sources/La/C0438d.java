package La;

import com.transsnet.palmpay.core.bean.rsp.AddBankAccSendOtpRsp;
import com.transsnet.palmpay.core.ui.mvp.contract.AddBankAccountContract;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;

/* JADX INFO: renamed from: La.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0438d extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h f5577f;

    public C0438d(h hVar) {
        this.f5577f = hVar;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        this.f5577f.addSubscription(disposable);
    }

    @Override // Z4.e
    public final void w(String str) {
        ToastUtils.showLong(str);
        ((AddBankAccountContract.IView) this.f5577f.f27351a).showLoadingView(false);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        h hVar = this.f5577f;
        ((AddBankAccountContract.IView) hVar.f27351a).showLoadingView(false);
        ((AddBankAccountContract.IView) hVar.f27351a).handleOtpResult((AddBankAccSendOtpRsp) obj);
    }
}

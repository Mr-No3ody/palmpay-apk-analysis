package La;

import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.ui.mvp.contract.AddBankAccountContract;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;

/* JADX INFO: renamed from: La.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0435a extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h f5574f;

    public C0435a(h hVar) {
        this.f5574f = hVar;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        this.f5574f.addSubscription(disposable);
    }

    @Override // Z4.e
    public final void w(String str) {
        IBaseView iBaseView = this.f5574f.f27351a;
        if (iBaseView != null) {
            ((AddBankAccountContract.IView) iBaseView).showLoadingView(false);
        }
        ToastUtils.showLong(str);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        CommonResult commonResult = (CommonResult) obj;
        h hVar = this.f5574f;
        IBaseView iBaseView = hVar.f27351a;
        if (iBaseView != null) {
            ((AddBankAccountContract.IView) iBaseView).showLoadingView(false);
            ((AddBankAccountContract.IView) hVar.f27351a).handleCheckCardBindNum(commonResult);
        }
    }
}

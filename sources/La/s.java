package La;

import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.payment.CheckPayReq;
import com.transsnet.palmpay.core.bean.payment.CheckPayResp;
import com.transsnet.palmpay.core.ui.mvp.contract.CheckPayContract$IView;
import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5598f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ CheckPayReq f5599g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ v f5600i;

    public /* synthetic */ s(v vVar, CheckPayReq checkPayReq, int i7) {
        this.f5598f = i7;
        this.f5600i = vVar;
        this.f5599g = checkPayReq;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        switch (this.f5598f) {
            case 0:
                this.f5600i.addSubscription(disposable);
                break;
            case 1:
                this.f5600i.addSubscription(disposable);
                break;
            case 2:
                this.f5600i.addSubscription(disposable);
                break;
            default:
                this.f5600i.addSubscription(disposable);
                break;
        }
    }

    @Override // Z4.e
    public final void w(String str) {
        switch (this.f5598f) {
            case 0:
                IBaseView iBaseView = this.f5600i.f27351a;
                if (iBaseView != null) {
                    ((CheckPayContract$IView) iBaseView).checkPayFail(str);
                }
                break;
            case 1:
                IBaseView iBaseView2 = this.f5600i.f27351a;
                if (iBaseView2 != null) {
                    ((CheckPayContract$IView) iBaseView2).checkPayFail(str);
                }
                break;
            case 2:
                IBaseView iBaseView3 = this.f5600i.f27351a;
                if (iBaseView3 != null) {
                    ((CheckPayContract$IView) iBaseView3).checkPayFail(str);
                }
                break;
            default:
                IBaseView iBaseView4 = this.f5600i.f27351a;
                if (iBaseView4 != null) {
                    ((CheckPayContract$IView) iBaseView4).checkPayFail(str);
                }
                break;
        }
    }

    @Override // Z4.e
    public final void y(Object obj) {
        switch (this.f5598f) {
            case 0:
                CheckPayResp checkPayResp = (CheckPayResp) obj;
                IBaseView iBaseView = this.f5600i.f27351a;
                if (iBaseView != null) {
                    ((CheckPayContract$IView) iBaseView).showCheckPayResult(this.f5599g.verifyMethod, checkPayResp);
                }
                break;
            case 1:
                CheckPayResp checkPayResp2 = (CheckPayResp) obj;
                IBaseView iBaseView2 = this.f5600i.f27351a;
                if (iBaseView2 != null) {
                    ((CheckPayContract$IView) iBaseView2).showCheckPayResult(this.f5599g.verifyMethod, checkPayResp2);
                }
                break;
            case 2:
                CheckPayResp checkPayResp3 = (CheckPayResp) obj;
                IBaseView iBaseView3 = this.f5600i.f27351a;
                if (iBaseView3 != null) {
                    ((CheckPayContract$IView) iBaseView3).showCheckPayResult(this.f5599g.verifyMethod, checkPayResp3);
                }
                break;
            default:
                CheckPayResp checkPayResp4 = (CheckPayResp) obj;
                IBaseView iBaseView4 = this.f5600i.f27351a;
                if (iBaseView4 != null) {
                    ((CheckPayContract$IView) iBaseView4).showCheckPayResult(this.f5599g.verifyMethod, checkPayResp4);
                }
                break;
        }
    }
}

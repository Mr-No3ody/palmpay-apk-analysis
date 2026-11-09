package La;

import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.payment.CheckPayResp;
import com.transsnet.palmpay.core.bean.rsp.QueryPaymentRewardRsp;
import com.transsnet.palmpay.core.ui.mvp.contract.CheckPayContract$IView;
import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5601f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v f5602g;

    public /* synthetic */ t(v vVar, int i7) {
        this.f5601f = i7;
        this.f5602g = vVar;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        switch (this.f5601f) {
            case 0:
                this.f5602g.addSubscription(disposable);
                break;
            case 1:
                this.f5602g.addSubscription(disposable);
                break;
            default:
                this.f5602g.addSubscription(disposable);
                break;
        }
    }

    @Override // Z4.e
    public final void w(String str) {
        switch (this.f5601f) {
            case 0:
                IBaseView iBaseView = this.f5602g.f27351a;
                if (iBaseView != null) {
                    ((CheckPayContract$IView) iBaseView).checkPayFail(str);
                }
                break;
            case 1:
                IBaseView iBaseView2 = this.f5602g.f27351a;
                if (iBaseView2 != null) {
                    ((CheckPayContract$IView) iBaseView2).checkPayFail(str);
                }
                break;
        }
    }

    @Override // Z4.e
    public final void y(Object obj) {
        switch (this.f5601f) {
            case 0:
                CheckPayResp checkPayResp = (CheckPayResp) obj;
                IBaseView iBaseView = this.f5602g.f27351a;
                if (iBaseView != null) {
                    ((CheckPayContract$IView) iBaseView).showQueryPayResult(checkPayResp);
                }
                break;
            case 1:
                CheckPayResp checkPayResp2 = (CheckPayResp) obj;
                IBaseView iBaseView2 = this.f5602g.f27351a;
                if (iBaseView2 != null) {
                    ((CheckPayContract$IView) iBaseView2).showQueryPayResult(checkPayResp2);
                }
                break;
            default:
                QueryPaymentRewardRsp queryPaymentRewardRsp = (QueryPaymentRewardRsp) obj;
                IBaseView iBaseView3 = this.f5602g.f27351a;
                if (iBaseView3 != null && queryPaymentRewardRsp != null) {
                    ((CheckPayContract$IView) iBaseView3).queryPaymentRewardOk(queryPaymentRewardRsp);
                    break;
                }
                break;
        }
    }

    private final void R(String str) {
    }
}

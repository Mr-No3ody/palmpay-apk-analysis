package Fe;

import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.LinkBankAccountResp;
import com.transsnet.palmpay.core.bean.LinkBankCardResp;
import com.transsnet.palmpay.ui.mvp.contract.BankCardAndAccountContract$IView;
import io.reactivex.disposables.Disposable;

/* JADX INFO: renamed from: Fe.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0253a extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2758f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0254b f2759g;

    public /* synthetic */ C0253a(C0254b c0254b, int i7) {
        this.f2758f = i7;
        this.f2759g = c0254b;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        switch (this.f2758f) {
            case 0:
                this.f2759g.addSubscription(disposable);
                break;
            case 1:
                this.f2759g.addSubscription(disposable);
                break;
            case 2:
                this.f2759g.addSubscription(disposable);
                break;
            case 3:
                this.f2759g.addSubscription(disposable);
                break;
            default:
                this.f2759g.addSubscription(disposable);
                break;
        }
    }

    @Override // Z4.e
    public final void w(String str) {
        switch (this.f2758f) {
            case 0:
                IBaseView iBaseView = this.f2759g.f27351a;
                if (iBaseView != null) {
                    ((BankCardAndAccountContract$IView) iBaseView).showError(str);
                }
                break;
            case 1:
                IBaseView iBaseView2 = this.f2759g.f27351a;
                if (iBaseView2 != null) {
                    ((BankCardAndAccountContract$IView) iBaseView2).showError(str);
                }
                break;
            case 2:
                IBaseView iBaseView3 = this.f2759g.f27351a;
                if (iBaseView3 != null) {
                    ((BankCardAndAccountContract$IView) iBaseView3).showError(str);
                }
                break;
            case 3:
                IBaseView iBaseView4 = this.f2759g.f27351a;
                if (iBaseView4 != null) {
                    ((BankCardAndAccountContract$IView) iBaseView4).showError(str);
                }
                break;
            default:
                IBaseView iBaseView5 = this.f2759g.f27351a;
                if (iBaseView5 != null) {
                    ((BankCardAndAccountContract$IView) iBaseView5).showError(str);
                }
                break;
        }
    }

    @Override // Z4.e
    public final void y(Object obj) {
        switch (this.f2758f) {
            case 0:
                LinkBankCardResp linkBankCardResp = (LinkBankCardResp) obj;
                IBaseView iBaseView = this.f2759g.f27351a;
                if (iBaseView != null) {
                    ((BankCardAndAccountContract$IView) iBaseView).showLinkBankCardsResp(linkBankCardResp);
                }
                break;
            case 1:
                LinkBankAccountResp linkBankAccountResp = (LinkBankAccountResp) obj;
                IBaseView iBaseView2 = this.f2759g.f27351a;
                if (iBaseView2 != null) {
                    ((BankCardAndAccountContract$IView) iBaseView2).showLinkBankAccountResp(linkBankAccountResp);
                }
                break;
            case 2:
                CommonResult commonResult = (CommonResult) obj;
                IBaseView iBaseView3 = this.f2759g.f27351a;
                if (iBaseView3 != null) {
                    ((BankCardAndAccountContract$IView) iBaseView3).showDeleteResult(commonResult);
                }
                break;
            case 3:
                CommonResult commonResult2 = (CommonResult) obj;
                IBaseView iBaseView4 = this.f2759g.f27351a;
                if (iBaseView4 != null) {
                    ((BankCardAndAccountContract$IView) iBaseView4).showUnlinkResult(commonResult2);
                }
                break;
            default:
                CommonResult commonResult3 = (CommonResult) obj;
                IBaseView iBaseView5 = this.f2759g.f27351a;
                if (iBaseView5 != null) {
                    ((BankCardAndAccountContract$IView) iBaseView5).showDeleteResult(commonResult3);
                }
                break;
        }
    }
}

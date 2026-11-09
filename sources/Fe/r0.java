package Fe;

import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.main.export.bean.rsp.MerchantOrderPreviewResp;
import com.transsnet.palmpay.ui.mvp.contract.ThirdPartyMerchantPreviewContract$IView;
import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes4.dex */
public final class r0 extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2807f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s0 f2808g;

    public /* synthetic */ r0(s0 s0Var, int i7) {
        this.f2807f = i7;
        this.f2808g = s0Var;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        switch (this.f2807f) {
            case 0:
                this.f2808g.addSubscription(disposable);
                break;
            case 1:
                this.f2808g.addSubscription(disposable);
                break;
            default:
                this.f2808g.addSubscription(disposable);
                break;
        }
    }

    @Override // Z4.e
    public final void w(String str) {
        switch (this.f2807f) {
            case 0:
                IBaseView iBaseView = this.f2808g.f27351a;
                if (iBaseView != null) {
                    ((ThirdPartyMerchantPreviewContract$IView) iBaseView).showPreviewPayInfoError(str);
                }
                break;
            case 1:
                IBaseView iBaseView2 = this.f2808g.f27351a;
                if (iBaseView2 != null) {
                    ((ThirdPartyMerchantPreviewContract$IView) iBaseView2).showMerchantOrderError(str);
                }
                break;
            default:
                IBaseView iBaseView3 = this.f2808g.f27351a;
                if (iBaseView3 != null) {
                    ((ThirdPartyMerchantPreviewContract$IView) iBaseView3).showPreviewPayInfoError(str);
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Z4.e
    public final void y(Object obj) {
        switch (this.f2807f) {
            case 0:
                CommonBeanResult<MerchantOrderPreviewResp> commonBeanResult = (CommonBeanResult) obj;
                IBaseView iBaseView = this.f2808g.f27351a;
                if (iBaseView != null) {
                    ((ThirdPartyMerchantPreviewContract$IView) iBaseView).showPreviewPayInfo(commonBeanResult);
                }
                break;
            case 1:
                CommonResult commonResult = (CommonResult) obj;
                IBaseView iBaseView2 = this.f2808g.f27351a;
                if (iBaseView2 != null) {
                    ((ThirdPartyMerchantPreviewContract$IView) iBaseView2).showMerchantOrder(commonResult);
                }
                break;
            default:
                CommonBeanResult commonBeanResult2 = (CommonBeanResult) obj;
                boolean zIsSuccess = commonBeanResult2.isSuccess();
                s0 s0Var = this.f2808g;
                if (!zIsSuccess) {
                    IBaseView iBaseView3 = s0Var.f27351a;
                    if (iBaseView3 != null) {
                        ((ThirdPartyMerchantPreviewContract$IView) iBaseView3).showPreviewPayInfoError(commonBeanResult2.getRespMsg());
                    }
                } else {
                    IBaseView iBaseView4 = s0Var.f27351a;
                    if (iBaseView4 != null) {
                        ((ThirdPartyMerchantPreviewContract$IView) iBaseView4).setPayAmount(((MerchantOrderPreviewResp) commonBeanResult2.data).getPayAmount());
                        s0Var.c(0, ((ThirdPartyMerchantPreviewContract$IView) s0Var.f27351a).getF27551B0(), "", "");
                    }
                }
                break;
        }
    }
}

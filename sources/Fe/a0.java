package Fe;

import android.graphics.Bitmap;
import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.rsp.CommonStringResult;
import com.transsnet.palmpay.core.bean.rsp.InvitationCodeResp;
import com.transsnet.palmpay.ui.mvp.contract.QrcodeShareContract$IView;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes4.dex */
public final class a0 extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2760f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b0 f2761g;

    public /* synthetic */ a0(b0 b0Var, int i7) {
        this.f2760f = i7;
        this.f2761g = b0Var;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        switch (this.f2760f) {
            case 0:
                this.f2761g.addSubscription(disposable);
                break;
            case 1:
                this.f2761g.addSubscription(disposable);
                break;
            default:
                this.f2761g.addSubscription(disposable);
                break;
        }
    }

    @Override // Z4.e
    public final void w(String str) {
        switch (this.f2760f) {
            case 0:
                IBaseView iBaseView = this.f2761g.f27351a;
                if (iBaseView != null) {
                    ((QrcodeShareContract$IView) iBaseView).showError(str);
                }
                break;
            case 1:
                ToastUtils.showLong(str);
                break;
            default:
                ((QrcodeShareContract$IView) this.f2761g.f27351a).showLoadingDialog(false);
                ToastUtils.showLong(str);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Z4.e
    public final void y(Object obj) {
        switch (this.f2760f) {
            case 0:
                CommonBeanResult commonBeanResult = (CommonBeanResult) obj;
                b0 b0Var = this.f2761g;
                if (b0Var.f27351a != null) {
                    if (!commonBeanResult.isSuccess()) {
                        ((QrcodeShareContract$IView) b0Var.f27351a).showError(commonBeanResult.getRespMsg());
                    } else {
                        p367ya.a aVarD = p367ya.a.d();
                        aVarD.f44149a.i("key_invitation_code", ((InvitationCodeResp) commonBeanResult.data).invitQrCode);
                        ((QrcodeShareContract$IView) b0Var.f27351a).showInvitationCode(((InvitationCodeResp) commonBeanResult.data).invitQrCode);
                    }
                }
                break;
            case 1:
                Bitmap bitmap = (Bitmap) obj;
                IBaseView iBaseView = this.f2761g.f27351a;
                if (iBaseView != null) {
                    ((QrcodeShareContract$IView) iBaseView).showQrcodeImg(bitmap);
                }
                break;
            default:
                CommonStringResult commonStringResult = (CommonStringResult) obj;
                b0 b0Var2 = this.f2761g;
                ((QrcodeShareContract$IView) b0Var2.f27351a).showLoadingDialog(false);
                if (!commonStringResult.isSuccess()) {
                    ToastUtils.showLong(commonStringResult.getRespMsg());
                } else {
                    ((QrcodeShareContract$IView) b0Var2.f27351a).handleInviteUrl(commonStringResult.data);
                }
                break;
        }
    }
}

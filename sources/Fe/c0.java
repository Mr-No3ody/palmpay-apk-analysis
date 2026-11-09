package Fe;

import android.graphics.Bitmap;
import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.req.QrcodeGenerateReq;
import com.transsnet.palmpay.ui.mvp.contract.ReceiveMoneyContract$IView;
import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes4.dex */
public final class c0 extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f2763f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ QrcodeGenerateReq f2764g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f0 f2765i;

    public c0(f0 f0Var, boolean z3, QrcodeGenerateReq qrcodeGenerateReq) {
        this.f2765i = f0Var;
        this.f2763f = z3;
        this.f2764g = qrcodeGenerateReq;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        this.f2765i.addSubscription(disposable);
    }

    @Override // Z4.e
    public final void w(String str) {
        F6.d.c(str, new Object[0]);
        IBaseView iBaseView = this.f2765i.f27351a;
        if (iBaseView != null) {
            ((ReceiveMoneyContract$IView) iBaseView).onFail(str);
        }
    }

    @Override // Z4.e
    public final void y(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        f0 f0Var = this.f2765i;
        if (this.f2763f) {
            IBaseView iBaseView = f0Var.f27351a;
            if (iBaseView != null) {
                ((ReceiveMoneyContract$IView) iBaseView).showSetAmountQrcodeImg(bitmap, this.f2764g);
                return;
            }
            return;
        }
        IBaseView iBaseView2 = f0Var.f27351a;
        if (iBaseView2 != null) {
            ((ReceiveMoneyContract$IView) iBaseView2).showQrcodeImg(bitmap);
        }
    }
}

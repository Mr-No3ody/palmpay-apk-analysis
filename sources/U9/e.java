package U9;

import android.graphics.Bitmap;
import com.transsnet.palmpay.contacts.bean.resp.MemberQRCode;
import com.transsnet.palmpay.contacts.contract.PersonalQRCodeContract$IView;
import com.transsnet.palmpay.core.base.IBaseView;
import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f9296f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f f9297g;

    public /* synthetic */ e(f fVar, int i7) {
        this.f9296f = i7;
        this.f9297g = fVar;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        switch (this.f9296f) {
            case 0:
                this.f9297g.addSubscription(disposable);
                break;
            default:
                this.f9297g.addSubscription(disposable);
                break;
        }
    }

    @Override // Z4.e
    public final void w(String str) {
        switch (this.f9296f) {
            case 0:
                IBaseView iBaseView = this.f9297g.f27351a;
                if (iBaseView != null) {
                    ((PersonalQRCodeContract$IView) iBaseView).showError(str);
                }
                break;
            default:
                IBaseView iBaseView2 = this.f9297g.f27351a;
                if (iBaseView2 != null) {
                    ((PersonalQRCodeContract$IView) iBaseView2).showError(str);
                }
                break;
        }
    }

    @Override // Z4.e
    public final void y(Object obj) {
        switch (this.f9296f) {
            case 0:
                MemberQRCode memberQRCode = (MemberQRCode) obj;
                boolean zIsSuccess = memberQRCode.isSuccess();
                f fVar = this.f9297g;
                if (!zIsSuccess) {
                    IBaseView iBaseView = fVar.f27351a;
                    if (iBaseView != null) {
                        ((PersonalQRCodeContract$IView) iBaseView).showError(memberQRCode.getRespMsg());
                    }
                } else {
                    fVar.generateQrcodeImg(memberQRCode.data);
                }
                break;
            default:
                Bitmap bitmap = (Bitmap) obj;
                IBaseView iBaseView2 = this.f9297g.f27351a;
                if (iBaseView2 != null) {
                    ((PersonalQRCodeContract$IView) iBaseView2).showQrcodeImg(bitmap);
                }
                break;
        }
    }
}

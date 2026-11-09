package U9;

import com.transsnet.palmpay.contacts.contract.MobileContactListContract$IView;
import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.PalmPayContact;
import com.transsnet.palmpay.core.bean.rsp.MobileContactListResp;
import io.reactivex.disposables.Disposable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f9290f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d f9291g;

    public /* synthetic */ b(d dVar, int i7) {
        this.f9290f = i7;
        this.f9291g = dVar;
    }

    @Override // Z4.e, io.reactivex.Observer
    public void onComplete() {
        switch (this.f9290f) {
            case 1:
                IBaseView iBaseView = this.f9291g.f27351a;
                if (iBaseView != null) {
                    ((MobileContactListContract$IView) iBaseView).completed();
                }
                break;
            default:
                super.onComplete();
                break;
        }
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        switch (this.f9290f) {
            case 0:
                this.f9291g.addSubscription(disposable);
                break;
            default:
                this.f9291g.addSubscription(disposable);
                break;
        }
    }

    @Override // Z4.e
    public final void w(String str) {
        switch (this.f9290f) {
            case 0:
                IBaseView iBaseView = this.f9291g.f27351a;
                if (iBaseView != null) {
                    ((MobileContactListContract$IView) iBaseView).showError(str);
                }
                break;
            default:
                IBaseView iBaseView2 = this.f9291g.f27351a;
                if (iBaseView2 != null) {
                    ((MobileContactListContract$IView) iBaseView2).showError(str);
                }
                break;
        }
    }

    @Override // Z4.e
    public final void y(Object obj) {
        switch (this.f9290f) {
            case 0:
                List<PalmPayContact> list = (List) obj;
                IBaseView iBaseView = this.f9291g.f27351a;
                if (iBaseView != null) {
                    ((MobileContactListContract$IView) iBaseView).showPhoneContact(list);
                }
                break;
            default:
                MobileContactListResp mobileContactListResp = (MobileContactListResp) obj;
                if (!mobileContactListResp.isSuccess()) {
                    w(mobileContactListResp.getRespMsg());
                    break;
                } else {
                    d dVar = this.f9291g;
                    if (dVar.f27351a != null && mobileContactListResp.getData() != null) {
                        ((MobileContactListContract$IView) dVar.f27351a).showPhoneContact(mobileContactListResp.getData());
                        break;
                    }
                }
                break;
        }
    }
}

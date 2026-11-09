package p235pb;

import Z4.e;
import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.credit.bean.resp.RecipientListResp;
import com.transsnet.palmpay.credit.contract.ContactListContract$IView;
import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f41279f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g f41280g;

    public /* synthetic */ d(g gVar, int i7) {
        this.f41279f = i7;
        this.f41280g = gVar;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        switch (this.f41279f) {
            case 0:
                this.f41280g.addSubscription(disposable);
                break;
            default:
                this.f41280g.addSubscription(disposable);
                break;
        }
    }

    @Override // Z4.e
    public final void w(String str) {
        switch (this.f41279f) {
            case 0:
                IBaseView iBaseView = this.f41280g.f27351a;
                if (iBaseView != null) {
                    ((ContactListContract$IView) iBaseView).showRecipientListRespError(str);
                }
                break;
            default:
                IBaseView iBaseView2 = this.f41280g.f27351a;
                if (iBaseView2 != null) {
                    ((ContactListContract$IView) iBaseView2).showDeleteRecipientResult(false, str);
                }
                break;
        }
    }

    @Override // Z4.e
    public final void y(Object obj) {
        switch (this.f41279f) {
            case 0:
                RecipientListResp recipientListResp = (RecipientListResp) obj;
                IBaseView iBaseView = this.f41280g.f27351a;
                if (iBaseView != null) {
                    ((ContactListContract$IView) iBaseView).showRecipientListResp(recipientListResp);
                }
                break;
            default:
                CommonResult commonResult = (CommonResult) obj;
                IBaseView iBaseView2 = this.f41280g.f27351a;
                if (iBaseView2 != null) {
                    ((ContactListContract$IView) iBaseView2).showDeleteRecipientResult(commonResult.isSuccess(), commonResult.getRespMsg());
                }
                break;
        }
    }
}

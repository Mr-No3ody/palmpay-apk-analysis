package p235pb;

import F6.d;
import Z4.e;
import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.credit.bean.resp.QueryMemberByKeywordResp;
import com.transsnet.palmpay.credit.bean.resp.QueryMemberDetailResp;
import com.transsnet.palmpay.credit.contract.ContactListContract$IView;
import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f41276f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f41277g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g f41278i;

    public /* synthetic */ c(g gVar, String str, int i7) {
        this.f41276f = i7;
        this.f41278i = gVar;
        this.f41277g = str;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        switch (this.f41276f) {
            case 0:
                this.f41278i.addSubscription(disposable);
                break;
            default:
                this.f41278i.addSubscription(disposable);
                break;
        }
    }

    @Override // Z4.e
    public final void w(String str) {
        switch (this.f41276f) {
            case 0:
                d.c(str, new Object[0]);
                IBaseView iBaseView = this.f41278i.f27351a;
                if (iBaseView != null) {
                    ((ContactListContract$IView) iBaseView).showQueryMemberDetailError(str);
                }
                break;
            default:
                d.c(str, new Object[0]);
                IBaseView iBaseView2 = this.f41278i.f27351a;
                if (iBaseView2 != null) {
                    ((ContactListContract$IView) iBaseView2).showQueryMemberDetailError(str);
                }
                break;
        }
    }

    @Override // Z4.e
    public final void y(Object obj) {
        switch (this.f41276f) {
            case 0:
                QueryMemberDetailResp queryMemberDetailResp = (QueryMemberDetailResp) obj;
                IBaseView iBaseView = this.f41278i.f27351a;
                if (iBaseView != null) {
                    ((ContactListContract$IView) iBaseView).showQueryMemberDetail(queryMemberDetailResp, this.f41277g);
                }
                break;
            default:
                QueryMemberByKeywordResp queryMemberByKeywordResp = (QueryMemberByKeywordResp) obj;
                IBaseView iBaseView2 = this.f41278i.f27351a;
                if (iBaseView2 != null) {
                    ((ContactListContract$IView) iBaseView2).showQueryMemberByKeyword(queryMemberByKeywordResp, this.f41277g);
                }
                break;
        }
    }
}

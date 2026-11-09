package p255qd;

import F6.d;
import Z4.e;
import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.send_money.bean.QueryMemberByKeywordResp;
import com.transsnet.palmpay.send_money.bean.QueryMemberDetailResp;
import com.transsnet.palmpay.send_money.contract.TransferToMobileContract$IView;
import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes4.dex */
public final class t extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f41516f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f41517g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ v f41518i;

    public /* synthetic */ t(v vVar, String str, int i7) {
        this.f41516f = i7;
        this.f41518i = vVar;
        this.f41517g = str;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        switch (this.f41516f) {
            case 0:
                this.f41518i.addSubscription(disposable);
                break;
            default:
                this.f41518i.addSubscription(disposable);
                break;
        }
    }

    @Override // Z4.e
    public final void w(String str) {
        switch (this.f41516f) {
            case 0:
                d.c(str, new Object[0]);
                IBaseView iBaseView = this.f41518i.f27351a;
                if (iBaseView != null) {
                    ((TransferToMobileContract$IView) iBaseView).showQueryMemberDetailError(str);
                }
                break;
            default:
                d.c(str, new Object[0]);
                IBaseView iBaseView2 = this.f41518i.f27351a;
                if (iBaseView2 != null) {
                    ((TransferToMobileContract$IView) iBaseView2).showQueryMemberDetailError(str);
                }
                break;
        }
    }

    @Override // Z4.e
    public final void y(Object obj) {
        switch (this.f41516f) {
            case 0:
                QueryMemberDetailResp queryMemberDetailResp = (QueryMemberDetailResp) obj;
                IBaseView iBaseView = this.f41518i.f27351a;
                if (iBaseView != null) {
                    ((TransferToMobileContract$IView) iBaseView).showQueryMemberDetail(queryMemberDetailResp, this.f41517g);
                }
                break;
            default:
                QueryMemberByKeywordResp queryMemberByKeywordResp = (QueryMemberByKeywordResp) obj;
                IBaseView iBaseView2 = this.f41518i.f27351a;
                if (iBaseView2 != null) {
                    ((TransferToMobileContract$IView) iBaseView2).showQueryMemberByKeyword(queryMemberByKeywordResp, this.f41517g);
                }
                break;
        }
    }
}

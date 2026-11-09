package Xc;

import android.content.Context;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.p2pcash.bean.rsp.QueryAreaByCountryResp;
import com.transsnet.palmpay.p2pcash.bean.rsp.QueryAreaByParentResp;
import com.transsnet.palmpay.p2pcash.ui.atm.view.P2PPositionSelectorView;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f11130f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ P2PPositionSelectorView f11131g;

    public /* synthetic */ j(P2PPositionSelectorView p2PPositionSelectorView, int i7) {
        this.f11130f = i7;
        this.f11131g = p2PPositionSelectorView;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        switch (this.f11130f) {
            case 0:
                Context context = this.f11131g.f33030a;
                if (context instanceof BaseActivity) {
                    ((BaseActivity) context).addSubscription(disposable);
                }
                break;
            default:
                Context context2 = this.f11131g.f33030a;
                if (context2 instanceof BaseActivity) {
                    ((BaseActivity) context2).addSubscription(disposable);
                }
                break;
        }
    }

    @Override // Z4.e
    public final void w(String str) {
        switch (this.f11130f) {
            case 0:
                ToastUtils.showLong(str);
                break;
            default:
                ToastUtils.showLong(str);
                break;
        }
    }

    @Override // Z4.e
    public final void y(Object obj) {
        switch (this.f11130f) {
            case 0:
                QueryAreaByCountryResp queryAreaByCountryResp = (QueryAreaByCountryResp) obj;
                if (!queryAreaByCountryResp.isSuccess()) {
                    ToastUtils.showLong(queryAreaByCountryResp.getRespMsg());
                } else {
                    P2PPositionSelectorView p2PPositionSelectorView = this.f11131g;
                    p2PPositionSelectorView.f33040p.clear();
                    p2PPositionSelectorView.f33040p.addAll(queryAreaByCountryResp.data);
                }
                break;
            default:
                QueryAreaByParentResp queryAreaByParentResp = (QueryAreaByParentResp) obj;
                if (!queryAreaByParentResp.isSuccess()) {
                    ToastUtils.showLong(queryAreaByParentResp.getRespMsg());
                } else {
                    P2PPositionSelectorView p2PPositionSelectorView2 = this.f11131g;
                    p2PPositionSelectorView2.t.clear();
                    p2PPositionSelectorView2.t.addAll(queryAreaByParentResp.data);
                }
                break;
        }
    }
}

package p284sb;

import Z4.e;
import com.transsnet.palmpay.core.bean.rsp.GetRecentMerchantsResp;
import com.transsnet.palmpay.credit.ui.activity.SearchMIDActivity;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
public final class Q extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ SearchMIDActivity f42137f;

    public Q(SearchMIDActivity searchMIDActivity) {
        this.f42137f = searchMIDActivity;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        this.f42137f.addSubscription(d2);
    }

    @Override // Z4.e
    public final void w(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        ToastUtils.showLong(message, new Object[0]);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        GetRecentMerchantsResp.DataBean dataBean;
        List<GetRecentMerchantsResp.ListDataBean> list;
        GetRecentMerchantsResp response = (GetRecentMerchantsResp) obj;
        Intrinsics.checkNotNullParameter(response, "response");
        GetRecentMerchantsResp getRecentMerchantsResp = response.isSuccess() ? response : null;
        if (getRecentMerchantsResp != null && (dataBean = getRecentMerchantsResp.data) != null && (list = dataBean.list) != null) {
            SearchMIDActivity searchMIDActivity = this.f42137f;
            t tVar = searchMIDActivity.f28786H;
            ((ArrayList) tVar.getValue()).clear();
            ((ArrayList) tVar.getValue()).addAll(list);
            searchMIDActivity.p().b((ArrayList) tVar.getValue());
        }
        if ((response.isSuccess() ? null : response) != null) {
            ToastUtils.showLong(response.getRespMsg(), new Object[0]);
        }
    }
}

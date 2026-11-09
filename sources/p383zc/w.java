package p383zc;

import F6.d;
import Z4.e;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.jara_packet.bean.resp.ReferEarnResolveResp;
import com.transsnet.palmpay.jara_packet.ui.mvp.contract.ReferEarnResolveContract;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class w extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y f44666f;

    public w(y yVar) {
        this.f44666f = yVar;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        this.f44666f.addSubscription(d2);
    }

    @Override // Z4.e
    public final void w(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        y yVar = this.f44666f;
        ((ReferEarnResolveContract.View) yVar.f27351a).showLoadingView(false);
        d.c(String.valueOf(message), new Object[0]);
        ((ReferEarnResolveContract.View) yVar.f27351a).showToastDialog(message);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        CommonBeanResult<ReferEarnResolveResp> response = (CommonBeanResult) obj;
        Intrinsics.checkNotNullParameter(response, "response");
        boolean zIsSuccess = response.isSuccess();
        y yVar = this.f44666f;
        if (zIsSuccess) {
            ((ReferEarnResolveContract.View) yVar.f27351a).referEarnResolveConfig(response);
        } else {
            ((ReferEarnResolveContract.View) yVar.f27351a).showToastDialog(response.getRespMsg());
        }
    }
}

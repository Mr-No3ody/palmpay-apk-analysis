package p383zc;

import F6.d;
import Z4.e;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.jara_packet.bean.resp.RankListResp;
import com.transsnet.palmpay.jara_packet.ui.mvp.contract.ReferEarnRankContract;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r f44657f;

    public q(r rVar) {
        this.f44657f = rVar;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        this.f44657f.addSubscription(d2);
    }

    @Override // Z4.e
    public final void w(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        d.c(String.valueOf(message), new Object[0]);
        ((ReferEarnRankContract.View) this.f44657f.f27351a).showToastDialog(message);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        CommonBeanResult<RankListResp> response = (CommonBeanResult) obj;
        Intrinsics.checkNotNullParameter(response, "response");
        boolean zIsSuccess = response.isSuccess();
        r rVar = this.f44657f;
        if (zIsSuccess) {
            ((ReferEarnRankContract.View) rVar.f27351a).rankListResult(response);
            return;
        }
        ReferEarnRankContract.View view = (ReferEarnRankContract.View) rVar.f27351a;
        String respMsg = response.getRespMsg();
        Intrinsics.checkNotNullExpressionValue(respMsg, "getRespMsg(...)");
        view.showToastDialog(respMsg);
    }
}

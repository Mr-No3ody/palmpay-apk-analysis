package p235pb;

import F6.d;
import Z4.e;
import com.transsnet.palmpay.credit.bean.resp.ReferEarnHomeResp;
import com.transsnet.palmpay.credit.contract.OcReferEarnHomeContract;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f41290f;

    public m(p pVar) {
        this.f41290f = pVar;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        this.f41290f.addSubscription(d2);
    }

    @Override // Z4.e
    public final void w(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        ((OcReferEarnHomeContract.View) this.f41290f.f27351a).showLoadingView(false);
        d.c(String.valueOf(message), new Object[0]);
        ToastUtils.showLong(message, new Object[0]);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        ReferEarnHomeResp response = (ReferEarnHomeResp) obj;
        Intrinsics.checkNotNullParameter(response, "response");
        p pVar = this.f41290f;
        ((OcReferEarnHomeContract.View) pVar.f27351a).showLoadingView(false);
        if (response.isSuccess()) {
            ((OcReferEarnHomeContract.View) pVar.f27351a).queryReferEarnHomeResult(response);
        } else {
            ToastUtils.showLong(response.getRespMsg(), new Object[0]);
        }
    }
}

package p235pb;

import Z4.e;
import com.transsnet.palmpay.credit.bean.resp.OcSumRewardResp;
import com.transsnet.palmpay.credit.contract.OcReferEarnHomeContract;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f41291f;

    public n(p pVar) {
        this.f41291f = pVar;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        this.f41291f.addSubscription(d2);
    }

    @Override // Z4.e
    public final void w(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        ((OcReferEarnHomeContract.View) this.f41291f.f27351a).showLoadingView(false);
        ToastUtils.showShort(message, new Object[0]);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        OcSumRewardResp response = (OcSumRewardResp) obj;
        Intrinsics.checkNotNullParameter(response, "response");
        p pVar = this.f41291f;
        ((OcReferEarnHomeContract.View) pVar.f27351a).showLoadingView(false);
        if (response.isSuccess()) {
            ((OcReferEarnHomeContract.View) pVar.f27351a).sumRewardResult(response);
        } else {
            ToastUtils.showShort(response.getRespMsg(), new Object[0]);
        }
    }
}

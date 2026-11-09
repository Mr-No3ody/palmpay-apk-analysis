package p235pb;

import Z4.e;
import com.transsnet.palmpay.credit.bean.resp.OcMarqueeResp;
import com.transsnet.palmpay.credit.contract.OcReferEarnHomeContract;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f41289f;

    public l(p pVar) {
        this.f41289f = pVar;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        this.f41289f.addSubscription(d2);
    }

    @Override // Z4.e
    public final void w(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        ToastUtils.showShort(message, new Object[0]);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        OcMarqueeResp response = (OcMarqueeResp) obj;
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.isSuccess()) {
            ((OcReferEarnHomeContract.View) this.f41289f.f27351a).queryMarqueeResult(response);
        } else {
            ToastUtils.showShort(response.getRespMsg(), new Object[0]);
        }
    }
}

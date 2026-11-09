package p235pb;

import Z4.e;
import com.transsnet.palmpay.credit.bean.resp.OcHasUnFreezeResp;
import com.transsnet.palmpay.credit.contract.OcReferEarnHomeContract;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f41288f;

    public k(p pVar) {
        this.f41288f = pVar;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        this.f41288f.addSubscription(d2);
    }

    @Override // Z4.e
    public final void w(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        ToastUtils.showShort(message, new Object[0]);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        OcHasUnFreezeResp ocHasUnFreezeResp = (OcHasUnFreezeResp) obj;
        if (ocHasUnFreezeResp != null && ocHasUnFreezeResp.isSuccess() && ocHasUnFreezeResp.getData()) {
            ((OcReferEarnHomeContract.View) this.f41288f.f27351a).hasUnfreeze();
        } else {
            ToastUtils.showShort(ocHasUnFreezeResp != null ? ocHasUnFreezeResp.getRespMsg() : null, new Object[0]);
        }
    }
}

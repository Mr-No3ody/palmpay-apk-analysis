package p235pb;

import F6.d;
import Z4.e;
import com.transsnet.palmpay.core.bean.CommonLongResult;
import com.transsnet.palmpay.credit.contract.OcReferEarnHomeContract;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f41287f;

    public j(p pVar) {
        this.f41287f = pVar;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        this.f41287f.addSubscription(d2);
    }

    @Override // Z4.e
    public final void w(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        ((OcReferEarnHomeContract.View) this.f41287f.f27351a).showLoadingView(false);
        d.c(String.valueOf(message), new Object[0]);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        CommonLongResult response = (CommonLongResult) obj;
        Intrinsics.checkNotNullParameter(response, "response");
        p pVar = this.f41287f;
        ((OcReferEarnHomeContract.View) pVar.f27351a).showLoadingView(false);
        if (response.isSuccess()) {
            ((OcReferEarnHomeContract.View) pVar.f27351a).okCardBaseAmountResult(response);
        }
    }
}

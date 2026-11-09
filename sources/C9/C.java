package C9;

import com.transsnet.palmpay.cash_in.ui.activity.RechargeUSSDResultActivity;
import com.transsnet.palmpay.core.bean.rsp.QueryPaymentRewardRsp;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class C extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ RechargeUSSDResultActivity f1251f;

    public C(RechargeUSSDResultActivity rechargeUSSDResultActivity) {
        this.f1251f = rechargeUSSDResultActivity;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        this.f1251f.addSubscription(d2);
    }

    @Override // Z4.e
    public final void w(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
    }

    @Override // Z4.e
    public final void y(Object obj) {
        QueryPaymentRewardRsp rsp = (QueryPaymentRewardRsp) obj;
        Intrinsics.checkNotNullParameter(rsp, "rsp");
        if (rsp.data == null || !rsp.isSuccess()) {
            return;
        }
        this.f1251f.f26893i = rsp.data;
    }
}

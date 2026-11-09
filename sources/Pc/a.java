package Pc;

import Z4.e;
import com.transsnet.palmpay.core.bean.payment.PreviewPayInfoResp;
import com.transsnet.palmpay.managemoney.ui.mvp.contract.FixedSavingContract;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b f7169f;

    public a(b bVar) {
        this.f7169f = bVar;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        this.f7169f.addSubscription(d2);
    }

    @Override // Z4.e
    public final void w(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        FixedSavingContract.View view = (FixedSavingContract.View) this.f7169f.f27351a;
        if (view != null) {
            view.showPreviewInfoRespError(message);
        }
    }

    @Override // Z4.e
    public final void y(Object obj) {
        PreviewPayInfoResp response = (PreviewPayInfoResp) obj;
        Intrinsics.checkNotNullParameter(response, "response");
        FixedSavingContract.View view = (FixedSavingContract.View) this.f7169f.f27351a;
        if (view != null) {
            view.showPreviewInfoResp(response);
        }
    }
}

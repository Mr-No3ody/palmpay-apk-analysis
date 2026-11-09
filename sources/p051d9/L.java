package p051d9;

import C0.G;
import Pa.n0;
import Pa.r0;
import Z4.e;
import com.transsnet.palmpay.account.ui.mvp.contract.SetNewPinContract;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.db.entity.User;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.c;

/* JADX INFO: loaded from: classes3.dex */
public final class L extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ M f35566f;

    public L(M m7) {
        this.f35566f = m7;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        this.f35566f.addSubscription(d2);
    }

    @Override // Z4.e
    public final void w(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        M m7 = this.f35566f;
        SetNewPinContract.View view = (SetNewPinContract.View) m7.f27351a;
        if (view != null) {
            view.showLoadingView(false);
        }
        SetNewPinContract.View view2 = (SetNewPinContract.View) m7.f27351a;
        if (view2 != null) {
            view2.loginFailShowDialog(message);
        }
    }

    @Override // Z4.e
    public final void y(Object obj) {
        User response = (User) obj;
        Intrinsics.checkNotNullParameter(response, "response");
        M m7 = this.f35566f;
        SetNewPinContract.View view = (SetNewPinContract.View) m7.f27351a;
        if (view != null) {
            view.showLoadingView(false);
        }
        r0.C1(BaseApplication.getContext());
        n0.g().D(response.getMemberId());
        G.u(MessageEvent.EVENT_LOG_IN_SUCCESS, c.b());
        SetNewPinContract.View view2 = (SetNewPinContract.View) m7.f27351a;
        if (view2 != null) {
            view2.showSuccessDialog();
        }
    }
}

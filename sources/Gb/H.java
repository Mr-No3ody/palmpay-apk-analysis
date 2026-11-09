package Gb;

import com.transsnet.palmpay.credit.bean.resp.CLTaskResp;
import com.transsnet.palmpay.credit.view.OpenResultTaskView;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class H extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ OpenResultTaskView f3233f;

    public H(OpenResultTaskView openResultTaskView) {
        this.f3233f = openResultTaskView;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        OpenResultTaskView openResultTaskView = this.f3233f;
        if (openResultTaskView.f31418b == null) {
            openResultTaskView.f31418b = new p103gf.a();
        }
        openResultTaskView.f31418b.add(d2);
    }

    @Override // Z4.e
    public final void w(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        androidx.camera.core.impl.utils.n.u(msg);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        CLTaskResp cLTaskResp = (CLTaskResp) obj;
        if (cLTaskResp == null || !cLTaskResp.isSuccess() || cLTaskResp.getData() == null) {
            return;
        }
        CLTaskResp.CLTaskData data = cLTaskResp.getData();
        Intrinsics.e(data);
        OpenResultTaskView.d(this.f3233f, data);
    }
}

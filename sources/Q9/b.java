package Q9;

import com.transsnet.palmpay.common.export.view.NetworkNotConnectView;
import com.transsnet.palmpay.core.callback.CompleteCallback;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f7646b;

    public /* synthetic */ b(c cVar, int i7) {
        this.f7645a = i7;
        this.f7646b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7645a) {
            case 0:
                NetworkNotConnectView networkNotConnectView = (NetworkNotConnectView) this.f7646b.f7647a.get();
                if (networkNotConnectView != null) {
                    CompleteCallback completeCallback = networkNotConnectView.f27124d;
                    if (completeCallback != null) {
                        completeCallback.onComplete(Boolean.TRUE);
                    }
                    if (networkNotConnectView.f27122b) {
                        h.s(networkNotConnectView, false);
                    }
                }
                break;
            default:
                NetworkNotConnectView networkNotConnectView2 = (NetworkNotConnectView) this.f7646b.f7647a.get();
                if (networkNotConnectView2 != null && networkNotConnectView2.f27122b) {
                    h.s(networkNotConnectView2, true);
                    break;
                }
                break;
        }
    }
}

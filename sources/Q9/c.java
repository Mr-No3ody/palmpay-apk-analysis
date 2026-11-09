package Q9;

import android.net.ConnectivityManager;
import android.net.Network;
import com.transsnet.palmpay.common.export.view.NetworkNotConnectView;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference f7647a;

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        NetworkNotConnectView networkNotConnectView = (NetworkNotConnectView) this.f7647a.get();
        if (networkNotConnectView != null) {
            networkNotConnectView.postDelayed(new b(this, 0), 500L);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        NetworkNotConnectView networkNotConnectView = (NetworkNotConnectView) this.f7647a.get();
        if (networkNotConnectView != null) {
            networkNotConnectView.postDelayed(new b(this, 1), 500L);
        }
    }
}

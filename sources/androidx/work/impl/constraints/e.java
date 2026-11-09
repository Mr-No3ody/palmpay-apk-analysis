package androidx.work.impl.constraints;

import V0.C;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f18482b = new d(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f18483a;

    public e(Function1 function1) {
        this.f18483a = function1;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(networkCapabilities, "networkCapabilities");
        C c6 = C.c();
        int i7 = m.f18506a;
        c6.getClass();
        this.f18483a.invoke(a.f18470a);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        C c6 = C.c();
        int i7 = m.f18506a;
        c6.getClass();
        this.f18483a.invoke(new b(7));
    }
}

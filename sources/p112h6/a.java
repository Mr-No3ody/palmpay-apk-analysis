package p112h6;

import android.net.ConnectivityManager;
import android.net.Network;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f37347a = new a(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new ConnectivityManager.NetworkCallback() { // from class: com.palmpay.lib.apm.network.NQEManager$networkCallback$2$1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(@NotNull Network network) {
                Intrinsics.checkNotNullParameter(network, "network");
                super.onAvailable(network);
                NQEManager.INSTANCE.refreshNetworkConnect();
                int unused = NQEManager.networkState;
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(@NotNull Network network) {
                Intrinsics.checkNotNullParameter(network, "network");
                super.onLost(network);
                NQEManager.INSTANCE.refreshNetworkConnect();
                int unused = NQEManager.networkState;
            }
        };
    }
}

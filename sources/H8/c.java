package H8;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ConnectivityManager f3746a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ConnectivityManager connectivityManager, Continuation continuation) {
        super(2, continuation);
        this.f3746a = connectivityManager;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f3746a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        ConnectivityManager connectivityManager = this.f3746a;
        Network[] allNetworks = connectivityManager.getAllNetworks();
        Intrinsics.checkNotNullExpressionValue(allNetworks, "getAllNetworks(...)");
        for (Network network : allNetworks) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null) {
                boolean zHasTransport = networkCapabilities.hasTransport(0);
                boolean zHasCapability = networkCapabilities.hasCapability(12);
                if (zHasTransport && zHasCapability) {
                    F6.d.h("MTNApi", 3, "getMobileNetwork: " + network);
                    return network;
                }
            }
        }
        F6.d.h("MTNApi", 3, "getMobileNetwork: not found");
        return null;
    }
}

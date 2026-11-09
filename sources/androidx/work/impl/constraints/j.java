package androidx.work.impl.constraints;

import V0.C;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class j extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f18496a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f18497b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f18498c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static NetworkCapabilities f18499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f18500e;

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(networkCapabilities, "networkCapabilities");
        C c6 = C.c();
        int i7 = m.f18506a;
        c6.getClass();
        synchronized (f18497b) {
            try {
                f18499d = networkCapabilities;
                for (Map.Entry entry : f18498c.entrySet()) {
                    ((Function1) entry.getKey()).invoke(((NetworkRequest) entry.getValue()).canBeSatisfiedBy(networkCapabilities) ? a.f18470a : new b(7));
                }
                Unit unit = Unit.f38893a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        C c6 = C.c();
        int i7 = m.f18506a;
        c6.getClass();
        synchronized (f18497b) {
            try {
                f18499d = null;
                Iterator it = f18498c.keySet().iterator();
                while (it.hasNext()) {
                    ((Function1) it.next()).invoke(new b(7));
                }
                Unit unit = Unit.f38893a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

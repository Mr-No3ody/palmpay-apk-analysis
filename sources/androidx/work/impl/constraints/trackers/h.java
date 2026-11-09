package androidx.work.impl.constraints.trackers;

import V0.C;
import android.content.Context;
import android.net.ConnectivityManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class h extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConnectivityManager f18520f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g f18521g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, androidx.work.impl.utils.taskexecutor.a taskExecutor) {
        super(context, taskExecutor);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        Object systemService = this.f18513b.getSystemService("connectivity");
        Intrinsics.f(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f18520f = (ConnectivityManager) systemService;
        this.f18521g = new g(this, 0);
    }

    @Override // androidx.work.impl.constraints.trackers.e
    public final Object a() {
        return i.a(this.f18520f);
    }

    @Override // androidx.work.impl.constraints.trackers.e
    public final void c() {
        try {
            C c6 = C.c();
            String str = i.f18522a;
            c6.getClass();
            ConnectivityManager connectivityManager = this.f18520f;
            g networkCallback = this.f18521g;
            Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
            Intrinsics.checkNotNullParameter(networkCallback, "networkCallback");
            connectivityManager.registerDefaultNetworkCallback(networkCallback);
        } catch (IllegalArgumentException e10) {
            C.c().b(i.f18522a, "Received exception while registering network callback", e10);
        } catch (SecurityException e11) {
            C.c().b(i.f18522a, "Received exception while registering network callback", e11);
        }
    }

    @Override // androidx.work.impl.constraints.trackers.e
    public final void d() {
        try {
            C c6 = C.c();
            String str = i.f18522a;
            c6.getClass();
            ConnectivityManager connectivityManager = this.f18520f;
            g networkCallback = this.f18521g;
            Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
            Intrinsics.checkNotNullParameter(networkCallback, "networkCallback");
            connectivityManager.unregisterNetworkCallback(networkCallback);
        } catch (IllegalArgumentException e10) {
            C.c().b(i.f18522a, "Received exception while unregistering network callback", e10);
        } catch (SecurityException e11) {
            C.c().b(i.f18522a, "Received exception while unregistering network callback", e11);
        }
    }
}

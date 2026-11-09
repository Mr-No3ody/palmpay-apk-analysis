package androidx.work.impl.constraints.trackers;

import V0.C;
import Wf.AbstractC0780y;
import Wf.I;
import Wf.V;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p337w8.l;

/* JADX INFO: loaded from: classes.dex */
public final class g extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18519b;

    public /* synthetic */ g(Object obj, int i7) {
        this.f18518a = i7;
        this.f18519b = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.f18518a) {
            case 1:
                Intrinsics.checkNotNullParameter(network, "network");
                Objects.toString(network);
                l lVar = (l) this.f18519b;
                lVar.getClass();
                V v3 = V.f10828a;
                p042cg.f fVar = I.f10809a;
                AbstractC0780y.m(v3, p042cg.e.f19009c, null, new p337w8.i(lVar, null), 2);
                lVar.e();
                break;
            default:
                super.onAvailable(network);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities capabilities) {
        androidx.work.impl.constraints.i iVarA;
        switch (this.f18518a) {
            case 0:
                Intrinsics.checkNotNullParameter(network, "network");
                Intrinsics.checkNotNullParameter(capabilities, "capabilities");
                C c6 = C.c();
                String str = i.f18522a;
                Objects.toString(capabilities);
                c6.getClass();
                int i7 = Build.VERSION.SDK_INT;
                h hVar = (h) this.f18519b;
                if (i7 >= 28) {
                    Intrinsics.checkNotNullParameter(capabilities, "<this>");
                    iVarA = new androidx.work.impl.constraints.i(capabilities.hasCapability(12), capabilities.hasCapability(16), !capabilities.hasCapability(11), capabilities.hasCapability(18));
                } else {
                    iVarA = i.a(hVar.f18520f);
                }
                hVar.b(iVarA);
                break;
            default:
                super.onCapabilitiesChanged(network, capabilities);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        Object obj = this.f18519b;
        int i7 = this.f18518a;
        Intrinsics.checkNotNullParameter(network, "network");
        switch (i7) {
            case 0:
                C c6 = C.c();
                String str = i.f18522a;
                c6.getClass();
                h hVar = (h) obj;
                hVar.b(i.a(hVar.f18520f));
                break;
            default:
                Objects.toString(network);
                ((Fg.b) ((l) obj).f43337l.getValue()).a();
                break;
        }
    }
}

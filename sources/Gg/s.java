package Gg;

import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C1849p;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.AbstractC1956y;
import okhttp3.C1921a;
import okhttp3.Call;
import okhttp3.J;
import p310ub.C2085k0;

/* JADX INFO: loaded from: classes4.dex */
public final class s {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final r f3485i = new r(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1921a f3486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2085k0 f3487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Call f3488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC1956y f3489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f3490e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3491f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f3492g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f3493h;

    public s(C1921a address, C2085k0 routeDatabase, Call call, AbstractC1956y eventListener) {
        List<Proxy> listL;
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(routeDatabase, "routeDatabase");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.f3486a = address;
        this.f3487b = routeDatabase;
        this.f3488c = call;
        this.f3489d = eventListener;
        z zVar = z.f38935a;
        this.f3490e = zVar;
        this.f3492g = zVar;
        this.f3493h = new ArrayList();
        J j6 = address.f40702i;
        eventListener.proxySelectStart(call, j6);
        Proxy proxy = address.f40700g;
        if (proxy != null) {
            listL = C1849p.c(proxy);
        } else {
            URI uriK = j6.k();
            if (uriK.getHost() == null) {
                listL = Dg.c.l(Proxy.NO_PROXY);
            } else {
                List<Proxy> proxiesOrNull = address.f40701h.select(uriK);
                List<Proxy> list = proxiesOrNull;
                if (list == null || list.isEmpty()) {
                    listL = Dg.c.l(Proxy.NO_PROXY);
                } else {
                    Intrinsics.checkNotNullExpressionValue(proxiesOrNull, "proxiesOrNull");
                    listL = Dg.c.y(proxiesOrNull);
                }
            }
        }
        this.f3490e = listL;
        this.f3491f = 0;
        eventListener.proxySelectEnd(call, j6, listL);
    }

    public final boolean a() {
        return this.f3491f < this.f3490e.size() || !this.f3493h.isEmpty();
    }
}

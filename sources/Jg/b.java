package Jg;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.C1847n;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.platform.android.SocketAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f4839e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f4840f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f4841d;

    static {
        f4840f = t.f4869a.isAndroid() && Build.VERSION.SDK_INT >= 29;
    }

    public b() {
        SocketAdapter[] elements = {Kg.b.f5487a.buildIfSupported(), new Kg.r(Kg.i.f5495f.getPlayProviderFactory()), new Kg.r(Kg.q.f5508a.getFactory()), new Kg.r(Kg.l.f5502a.getFactory())};
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList arrayListR = C1847n.r(elements);
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListR) {
            if (((SocketAdapter) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.f4841d = arrayList;
    }

    @Override // Jg.t
    public final Mg.e b(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        Kg.d dVarBuildIfSupported = Kg.d.f5488d.buildIfSupported(trustManager);
        return dVarBuildIfSupported != null ? dVarBuildIfSupported : super.b(trustManager);
    }

    @Override // Jg.t
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Iterator it = this.f4841d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((SocketAdapter) next).matchesSocket(sslSocket));
        SocketAdapter socketAdapter = (SocketAdapter) next;
        if (socketAdapter != null) {
            socketAdapter.configureTlsExtensions(sslSocket, str, protocols);
        }
    }

    @Override // Jg.t
    public final String f(SSLSocket sslSocket) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Iterator it = this.f4841d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((SocketAdapter) next).matchesSocket(sslSocket));
        SocketAdapter socketAdapter = (SocketAdapter) next;
        if (socketAdapter != null) {
            return socketAdapter.getSelectedProtocol(sslSocket);
        }
        return null;
    }

    @Override // Jg.t
    public final boolean h(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }
}

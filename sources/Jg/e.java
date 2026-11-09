package Jg;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.C1847n;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.platform.android.SocketAdapter;
import okhttp3.internal.tls.TrustRootIndex;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends t {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f4844f = new c(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f4845g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f4846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Kg.n f4847e;

    static {
        boolean z3 = false;
        if (t.f4869a.isAndroid() && Build.VERSION.SDK_INT < 30) {
            z3 = true;
        }
        f4845g = z3;
    }

    public e() {
        SocketAdapter[] elements = {Kg.s.buildIfSupported$default(Kg.t.f5512j, null, 1, null), new Kg.r(Kg.i.f5495f.getPlayProviderFactory()), new Kg.r(Kg.q.f5508a.getFactory()), new Kg.r(Kg.l.f5502a.getFactory())};
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList arrayListR = C1847n.r(elements);
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListR) {
            if (((SocketAdapter) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.f4846d = arrayList;
        this.f4847e = Kg.n.f5504d.get();
    }

    @Override // Jg.t
    public final Mg.e b(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        Kg.d dVarBuildIfSupported = Kg.d.f5488d.buildIfSupported(trustManager);
        return dVarBuildIfSupported != null ? dVarBuildIfSupported : super.b(trustManager);
    }

    @Override // Jg.t
    public final TrustRootIndex c(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            Method method = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            method.setAccessible(true);
            Intrinsics.checkNotNullExpressionValue(method, "method");
            return new d(trustManager, method);
        } catch (NoSuchMethodException unused) {
            return super.c(trustManager);
        }
    }

    @Override // Jg.t
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Iterator it = this.f4846d.iterator();
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
    public final void e(Socket socket, InetSocketAddress address, int i7) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(address, "address");
        try {
            socket.connect(address, i7);
        } catch (ClassCastException e10) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e10;
            }
            throw new IOException("Exception in connect", e10);
        }
    }

    @Override // Jg.t
    public final String f(SSLSocket sslSocket) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Iterator it = this.f4846d.iterator();
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
    public final Object g() {
        Intrinsics.checkNotNullParameter("response.body().close()", "closer");
        Kg.n nVar = this.f4847e;
        nVar.getClass();
        Intrinsics.checkNotNullParameter("response.body().close()", "closer");
        Method method = nVar.f5505a;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, new Object[0]);
                Method method2 = nVar.f5506b;
                Intrinsics.e(method2);
                method2.invoke(objInvoke, "response.body().close()");
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // Jg.t
    public final boolean h(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // Jg.t
    public final void k(Object obj, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Kg.n nVar = this.f4847e;
        nVar.getClass();
        if (obj != null) {
            try {
                Method method = nVar.f5507c;
                Intrinsics.e(method);
                method.invoke(obj, new Object[0]);
                return;
            } catch (Exception unused) {
            }
        }
        t.j(this, message, 4);
    }
}

package Jg;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends t {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final l f4858i = new l(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f4859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Method f4860e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Method f4861f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Class f4862g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Class f4863h;

    public m(Method putMethod, Method getMethod, Method removeMethod, Class clientProviderClass, Class serverProviderClass) {
        Intrinsics.checkNotNullParameter(putMethod, "putMethod");
        Intrinsics.checkNotNullParameter(getMethod, "getMethod");
        Intrinsics.checkNotNullParameter(removeMethod, "removeMethod");
        Intrinsics.checkNotNullParameter(clientProviderClass, "clientProviderClass");
        Intrinsics.checkNotNullParameter(serverProviderClass, "serverProviderClass");
        this.f4859d = putMethod;
        this.f4860e = getMethod;
        this.f4861f = removeMethod;
        this.f4862g = clientProviderClass;
        this.f4863h = serverProviderClass;
    }

    @Override // Jg.t
    public final void a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        try {
            this.f4861f.invoke(null, sslSocket);
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to remove ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to remove ALPN", e11);
        }
    }

    @Override // Jg.t
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        try {
            this.f4859d.invoke(null, sslSocket, Proxy.newProxyInstance(t.class.getClassLoader(), new Class[]{this.f4862g, this.f4863h}, new k(t.f4869a.alpnProtocolNames(protocols))));
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to set ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to set ALPN", e11);
        }
    }

    @Override // Jg.t
    public final String f(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f4860e.invoke(null, sslSocket));
            Intrinsics.f(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            k kVar = (k) invocationHandler;
            boolean z3 = kVar.f4856b;
            if (!z3 && kVar.f4857c == null) {
                t.j(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 6);
                return null;
            }
            if (z3) {
                return null;
            }
            return kVar.f4857c;
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to get ALPN selected protocol", e11);
        }
    }
}

package Kg;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okhttp3.internal.platform.android.DeferredSocketAdapter$Factory;
import okhttp3.internal.platform.android.SocketAdapter;

/* JADX INFO: loaded from: classes4.dex */
public class i implements SocketAdapter {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h f5495f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final DeferredSocketAdapter$Factory f5496g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f5497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f5498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f5499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f5500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Method f5501e;

    static {
        h hVar = new h(null);
        f5495f = hVar;
        f5496g = hVar.factory("com.google.android.gms.org.conscrypt");
    }

    public i(Class sslSocketClass) throws NoSuchMethodException {
        Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        this.f5497a = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        Intrinsics.checkNotNullExpressionValue(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f5498b = declaredMethod;
        this.f5499c = sslSocketClass.getMethod("setHostname", String.class);
        this.f5500d = sslSocketClass.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f5501e = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final void configureTlsExtensions(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (matchesSocket(sslSocket)) {
            try {
                this.f5498b.invoke(sslSocket, Boolean.TRUE);
                if (str != null) {
                    this.f5499c.invoke(sslSocket, str);
                }
                this.f5501e.invoke(sslSocket, Jg.t.f4869a.concatLengthPrefixed(protocols));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final String getSelectedProtocol(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (!matchesSocket(sslSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f5500d.invoke(sslSocket, new Object[0]);
            if (bArr != null) {
                return new String(bArr, Charsets.UTF_8);
            }
            return null;
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if ((cause instanceof NullPointerException) && Intrinsics.c(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e11);
        }
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean isSupported() {
        return Jg.e.f4844f.isSupported();
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean matchesSocket(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f5497a.isInstance(sslSocket);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean matchesSocketFactory(SSLSocketFactory sslSocketFactory) {
        Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
        return false;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public X509TrustManager trustManager(SSLSocketFactory sslSocketFactory) {
        Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
        return null;
    }
}

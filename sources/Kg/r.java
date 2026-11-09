package Kg;

import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.platform.android.DeferredSocketAdapter$Factory;
import okhttp3.internal.platform.android.SocketAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements SocketAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeferredSocketAdapter$Factory f5510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SocketAdapter f5511b;

    public r(DeferredSocketAdapter$Factory socketAdapterFactory) {
        Intrinsics.checkNotNullParameter(socketAdapterFactory, "socketAdapterFactory");
        this.f5510a = socketAdapterFactory;
    }

    public final synchronized SocketAdapter a(SSLSocket sSLSocket) {
        try {
            if (this.f5511b == null && this.f5510a.matchesSocket(sSLSocket)) {
                this.f5511b = this.f5510a.create(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f5511b;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final void configureTlsExtensions(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        SocketAdapter socketAdapterA = a(sslSocket);
        if (socketAdapterA != null) {
            socketAdapterA.configureTlsExtensions(sslSocket, str, protocols);
        }
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final String getSelectedProtocol(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        SocketAdapter socketAdapterA = a(sslSocket);
        if (socketAdapterA != null) {
            return socketAdapterA.getSelectedProtocol(sslSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean isSupported() {
        return true;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean matchesSocket(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f5510a.matchesSocket(sslSocket);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean matchesSocketFactory(SSLSocketFactory sslSocketFactory) {
        Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
        return false;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final X509TrustManager trustManager(SSLSocketFactory sslSocketFactory) {
        Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
        return null;
    }
}

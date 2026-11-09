package Jg;

import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.Conscrypt;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h f4852e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f4853f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Provider f4854d;

    static {
        h hVar = new h(null);
        f4852e = hVar;
        boolean z3 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, hVar.getClass().getClassLoader());
            if (Conscrypt.isAvailable() && hVar.atLeastVersion(2, 1, 0)) {
                z3 = true;
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f4853f = z3;
    }

    public j() {
        Provider providerNewProvider = Conscrypt.newProvider();
        Intrinsics.checkNotNullExpressionValue(providerNewProvider, "newProvider()");
        this.f4854d = providerNewProvider;
    }

    @Override // Jg.t
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (!Conscrypt.isConscrypt(sslSocket)) {
            super.d(sslSocket, str, protocols);
        } else {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            Conscrypt.setApplicationProtocols(sslSocket, (String[]) t.f4869a.alpnProtocolNames(protocols).toArray(new String[0]));
        }
    }

    @Override // Jg.t
    public final String f(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (Conscrypt.isConscrypt(sslSocket)) {
            return Conscrypt.getApplicationProtocol(sslSocket);
        }
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return null;
    }

    @Override // Jg.t
    public final SSLContext l() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f4854d);
        Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // Jg.t
    public final SSLSocketFactory m(X509TrustManager trustManager) throws NoSuchAlgorithmException, KeyManagementException {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        SSLContext sSLContextL = l();
        sSLContextL.init(null, new TrustManager[]{trustManager}, null);
        SSLSocketFactory socketFactory = sSLContextL.getSocketFactory();
        Intrinsics.checkNotNullExpressionValue(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // Jg.t
    public final X509TrustManager n() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        Intrinsics.e(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                Intrinsics.f(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager, i.f4851a);
                return x509TrustManager;
            }
        }
        StringBuilder sb2 = new StringBuilder("Unexpected default trust managers: ");
        String string = Arrays.toString(trustManagers);
        Intrinsics.checkNotNullExpressionValue(string, "toString(this)");
        sb2.append(string);
        throw new IllegalStateException(sb2.toString().toString());
    }
}

package Jg;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import org.openjsse.net.ssl.OpenJSSE;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final q f4866e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f4867f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Provider f4868d = new OpenJSSE();

    static {
        q qVar = new q(null);
        f4866e = qVar;
        boolean z3 = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, qVar.getClass().getClassLoader());
            z3 = true;
        } catch (ClassNotFoundException unused) {
        }
        f4867f = z3;
    }

    @Override // Jg.t
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        super.d(sslSocket, str, protocols);
    }

    @Override // Jg.t
    public final String f(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return null;
    }

    @Override // Jg.t
    public final SSLContext l() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.3", this.f4868d);
        Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(\"TLSv1.3\", provider)");
        return sSLContext;
    }

    @Override // Jg.t
    public final X509TrustManager n() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f4868d);
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        Intrinsics.e(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                Intrinsics.f(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        StringBuilder sb2 = new StringBuilder("Unexpected default trust managers: ");
        String string = Arrays.toString(trustManagers);
        Intrinsics.checkNotNullExpressionValue(string, "toString(this)");
        sb2.append(string);
        throw new IllegalStateException(sb2.toString().toString());
    }
}

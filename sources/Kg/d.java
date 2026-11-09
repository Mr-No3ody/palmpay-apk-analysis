package Kg;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends Mg.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f5488d = new c(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X509TrustManager f5489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X509TrustManagerExtensions f5490c;

    public d(X509TrustManager trustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        Intrinsics.checkNotNullParameter(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f5489b = trustManager;
        this.f5490c = x509TrustManagerExtensions;
    }

    @Override // Mg.e
    public final List a(String hostname, List chain) throws SSLPeerUnverifiedException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        try {
            List<X509Certificate> listCheckServerTrusted = this.f5490c.checkServerTrusted((X509Certificate[]) chain.toArray(new X509Certificate[0]), "RSA", hostname);
            Intrinsics.checkNotNullExpressionValue(listCheckServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return listCheckServerTrusted;
        } catch (CertificateException e10) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e10.getMessage());
            sSLPeerUnverifiedException.initCause(e10);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d) && ((d) obj).f5489b == this.f5489b;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f5489b);
    }
}

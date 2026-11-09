package Jg;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.tls.TrustRootIndex;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements TrustRootIndex {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X509TrustManager f4842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f4843b;

    public d(X509TrustManager trustManager, Method findByIssuerAndSignatureMethod) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        Intrinsics.checkNotNullParameter(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
        this.f4842a = trustManager;
        this.f4843b = findByIssuerAndSignatureMethod;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.c(this.f4842a, dVar.f4842a) && Intrinsics.c(this.f4843b, dVar.f4843b);
    }

    @Override // okhttp3.internal.tls.TrustRootIndex
    public final X509Certificate findByIssuerAndSignature(X509Certificate cert) {
        Intrinsics.checkNotNullParameter(cert, "cert");
        try {
            Object objInvoke = this.f4843b.invoke(this.f4842a, cert);
            Intrinsics.f(objInvoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
            return ((TrustAnchor) objInvoke).getTrustedCert();
        } catch (IllegalAccessException e10) {
            throw new AssertionError("unable to get issues and signature", e10);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final int hashCode() {
        return this.f4843b.hashCode() + (this.f4842a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f4842a + ", findByIssuerAndSignatureMethod=" + this.f4843b + ')';
    }
}

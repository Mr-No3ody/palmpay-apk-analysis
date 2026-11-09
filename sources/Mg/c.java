package Mg;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.tls.TrustRootIndex;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements TrustRootIndex {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f6022a;

    public c(X509Certificate... caCerts) {
        Intrinsics.checkNotNullParameter(caCerts, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : caCerts) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Intrinsics.checkNotNullExpressionValue(subjectX500Principal, "caCert.subjectX500Principal");
            Object linkedHashSet = linkedHashMap.get(subjectX500Principal);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, linkedHashSet);
            }
            ((Set) linkedHashSet).add(x509Certificate);
        }
        this.f6022a = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof c) && Intrinsics.c(((c) obj).f6022a, this.f6022a);
        }
        return true;
    }

    @Override // okhttp3.internal.tls.TrustRootIndex
    public final X509Certificate findByIssuerAndSignature(X509Certificate cert) {
        Intrinsics.checkNotNullParameter(cert, "cert");
        Set set = (Set) this.f6022a.get(cert.getIssuerX500Principal());
        Object obj = null;
        if (set == null) {
            return null;
        }
        for (Object obj2 : set) {
            try {
                cert.verify(((X509Certificate) obj2).getPublicKey());
                obj = obj2;
                break;
            } catch (Exception unused) {
            }
        }
        return (X509Certificate) obj;
    }

    public final int hashCode() {
        return this.f6022a.hashCode();
    }
}

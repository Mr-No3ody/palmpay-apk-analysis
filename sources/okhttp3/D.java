package okhttp3;

import C0.C0127t;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
public final class D {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C f40560e = new C(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f40561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1947o f40562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f40563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p355xf.t f40564d;

    public D(k0 tlsVersion, C1947o cipherSuite, List localCertificates, Function0 peerCertificatesFn) {
        Intrinsics.checkNotNullParameter(tlsVersion, "tlsVersion");
        Intrinsics.checkNotNullParameter(cipherSuite, "cipherSuite");
        Intrinsics.checkNotNullParameter(localCertificates, "localCertificates");
        Intrinsics.checkNotNullParameter(peerCertificatesFn, "peerCertificatesFn");
        this.f40561a = tlsVersion;
        this.f40562b = cipherSuite;
        this.f40563c = localCertificates;
        this.f40564d = C2131j.b(new C0127t(peerCertificatesFn));
    }

    public final List a() {
        return (List) this.f40564d.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof D)) {
            return false;
        }
        D d2 = (D) obj;
        return d2.f40561a == this.f40561a && Intrinsics.c(d2.f40562b, this.f40562b) && Intrinsics.c(d2.a(), a()) && Intrinsics.c(d2.f40563c, this.f40563c);
    }

    public final int hashCode() {
        return this.f40563c.hashCode() + ((a().hashCode() + ((this.f40562b.hashCode() + ((this.f40561a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> listA = a();
        ArrayList arrayList = new ArrayList(kotlin.collections.r.l(listA, 10));
        for (Certificate certificate : listA) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                Intrinsics.checkNotNullExpressionValue(type2, "type");
            }
            arrayList.add(type2);
        }
        String string = arrayList.toString();
        StringBuilder sb2 = new StringBuilder("Handshake{tlsVersion=");
        sb2.append(this.f40561a);
        sb2.append(" cipherSuite=");
        sb2.append(this.f40562b);
        sb2.append(" peerCertificates=");
        sb2.append(string);
        sb2.append(" localCertificates=");
        List<Certificate> list = this.f40563c;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.r.l(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                Intrinsics.checkNotNullExpressionValue(type, "type");
            }
            arrayList2.add(type);
        }
        sb2.append(arrayList2);
        sb2.append('}');
        return sb2.toString();
    }
}

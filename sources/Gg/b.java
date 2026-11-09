package Gg;

import M7.C0442b;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.C1947o;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f3407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3410d;

    public b(List connectionSpecs) {
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        this.f3407a = connectionSpecs;
    }

    public final okhttp3.r a(SSLSocket sslSocket) throws UnknownServiceException {
        okhttp3.r connectionSpec;
        int i7;
        boolean z3;
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        int i10 = this.f3408b;
        List list = this.f3407a;
        int size = list.size();
        while (true) {
            if (i10 >= size) {
                connectionSpec = null;
                break;
            }
            connectionSpec = (okhttp3.r) list.get(i10);
            if (connectionSpec.b(sslSocket)) {
                this.f3408b = i10 + 1;
                break;
            }
            i10++;
        }
        if (connectionSpec == null) {
            StringBuilder sb2 = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb2.append(this.f3410d);
            sb2.append(", modes=");
            sb2.append(list);
            sb2.append(", supported protocols=");
            String[] enabledProtocols = sslSocket.getEnabledProtocols();
            Intrinsics.e(enabledProtocols);
            String string = Arrays.toString(enabledProtocols);
            Intrinsics.checkNotNullExpressionValue(string, "toString(this)");
            sb2.append(string);
            throw new UnknownServiceException(sb2.toString());
        }
        int i11 = this.f3408b;
        int size2 = list.size();
        while (true) {
            i7 = 0;
            if (i11 >= size2) {
                z3 = false;
                break;
            }
            if (((okhttp3.r) list.get(i11)).b(sslSocket)) {
                z3 = true;
                break;
            }
            i11++;
        }
        this.f3409c = z3;
        boolean z8 = this.f3410d;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        String[] strArr = connectionSpec.f40975c;
        if (strArr != null) {
            String[] enabledCipherSuites = sslSocket.getEnabledCipherSuites();
            Intrinsics.checkNotNullExpressionValue(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            cipherSuitesIntersection = Dg.c.p(enabledCipherSuites, strArr, C1947o.f40951b.getORDER_BY_NAME$okhttp());
        } else {
            cipherSuitesIntersection = sslSocket.getEnabledCipherSuites();
        }
        String[] strArr2 = connectionSpec.f40976d;
        if (strArr2 != null) {
            String[] enabledProtocols2 = sslSocket.getEnabledProtocols();
            Intrinsics.checkNotNullExpressionValue(enabledProtocols2, "sslSocket.enabledProtocols");
            Bf.b bVar = Bf.b.f906a;
            Intrinsics.f(bVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>");
            tlsVersionsIntersection = Dg.c.p(enabledProtocols2, strArr2, bVar);
        } else {
            tlsVersionsIntersection = sslSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sslSocket.getSupportedCipherSuites();
        Intrinsics.checkNotNullExpressionValue(supportedCipherSuites, "supportedCipherSuites");
        Comparator<String> comparator = C1947o.f40951b.getORDER_BY_NAME$okhttp();
        byte[] bArr = Dg.c.f1879a;
        Intrinsics.checkNotNullParameter(supportedCipherSuites, "<this>");
        Intrinsics.checkNotNullParameter("TLS_FALLBACK_SCSV", "value");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        int length = supportedCipherSuites.length;
        while (true) {
            if (i7 >= length) {
                i7 = -1;
                break;
            }
            if (comparator.compare(supportedCipherSuites[i7], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i7++;
        }
        if (z8 && i7 != -1) {
            Intrinsics.checkNotNullExpressionValue(cipherSuitesIntersection, "cipherSuitesIntersection");
            String value = supportedCipherSuites[i7];
            Intrinsics.checkNotNullExpressionValue(value, "supportedCipherSuites[indexOfFallbackScsv]");
            Intrinsics.checkNotNullParameter(cipherSuitesIntersection, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            Object[] objArrCopyOf = Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length + 1);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            cipherSuitesIntersection = (String[]) objArrCopyOf;
            Intrinsics.checkNotNullParameter(cipherSuitesIntersection, "<this>");
            cipherSuitesIntersection[cipherSuitesIntersection.length - 1] = value;
        }
        Intrinsics.checkNotNullParameter(connectionSpec, "connectionSpec");
        C0442b c0442b = new C0442b();
        c0442b.f5805a = connectionSpec.f40973a;
        c0442b.f5807c = strArr;
        c0442b.f5808d = strArr2;
        c0442b.f5806b = connectionSpec.f40974b;
        Intrinsics.checkNotNullExpressionValue(cipherSuitesIntersection, "cipherSuitesIntersection");
        c0442b.b((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        Intrinsics.checkNotNullExpressionValue(tlsVersionsIntersection, "tlsVersionsIntersection");
        c0442b.e((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length));
        okhttp3.r rVarA = c0442b.a();
        if (rVarA.c() != null) {
            sslSocket.setEnabledProtocols(rVarA.f40976d);
        }
        if (rVarA.a() != null) {
            sslSocket.setEnabledCipherSuites(rVarA.f40975c);
        }
        return connectionSpec;
    }
}

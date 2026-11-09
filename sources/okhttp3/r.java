package okhttp3;

import M7.C0442b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r f40971e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r f40972f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f40973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f40974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f40975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f40976d;

    static {
        new C1949q(null);
        C1947o c1947o = C1947o.f40967r;
        C1947o c1947o2 = C1947o.f40968s;
        C1947o c1947o3 = C1947o.t;
        C1947o c1947o4 = C1947o.f40961l;
        C1947o c1947o5 = C1947o.f40963n;
        C1947o c1947o6 = C1947o.f40962m;
        C1947o c1947o7 = C1947o.f40964o;
        C1947o c1947o8 = C1947o.f40966q;
        C1947o c1947o9 = C1947o.f40965p;
        C1947o[] c1947oArr = {c1947o, c1947o2, c1947o3, c1947o4, c1947o5, c1947o6, c1947o7, c1947o8, c1947o9};
        C1947o[] c1947oArr2 = {c1947o, c1947o2, c1947o3, c1947o4, c1947o5, c1947o6, c1947o7, c1947o8, c1947o9, C1947o.f40959j, C1947o.f40960k, C1947o.f40957h, C1947o.f40958i, C1947o.f40955f, C1947o.f40956g, C1947o.f40954e};
        C0442b c0442b = new C0442b();
        c0442b.c((C1947o[]) Arrays.copyOf(c1947oArr, 9));
        k0 k0Var = k0.TLS_1_3;
        k0 k0Var2 = k0.TLS_1_2;
        c0442b.f(k0Var, k0Var2);
        if (!c0442b.f5805a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        c0442b.f5806b = true;
        c0442b.a();
        C0442b c0442b2 = new C0442b();
        c0442b2.c((C1947o[]) Arrays.copyOf(c1947oArr2, 16));
        c0442b2.f(k0Var, k0Var2);
        if (!c0442b2.f5805a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        c0442b2.f5806b = true;
        f40971e = c0442b2.a();
        C0442b c0442b3 = new C0442b();
        c0442b3.c((C1947o[]) Arrays.copyOf(c1947oArr2, 16));
        c0442b3.f(k0Var, k0Var2, k0.TLS_1_1, k0.TLS_1_0);
        if (!c0442b3.f5805a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        c0442b3.f5806b = true;
        c0442b3.a();
        f40972f = new r(false, false, null, null);
    }

    public r(boolean z3, boolean z8, String[] strArr, String[] strArr2) {
        this.f40973a = z3;
        this.f40974b = z8;
        this.f40975c = strArr;
        this.f40976d = strArr2;
    }

    public final List a() {
        String[] strArr = this.f40975c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C1947o.f40951b.forJavaName(str));
        }
        return CollectionsKt.Y(arrayList);
    }

    public final boolean b(SSLSocket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        if (!this.f40973a) {
            return false;
        }
        String[] strArr = this.f40976d;
        if (strArr != null) {
            String[] enabledProtocols = socket.getEnabledProtocols();
            Bf.b bVar = Bf.b.f906a;
            Intrinsics.f(bVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>");
            if (!Dg.c.j(strArr, enabledProtocols, bVar)) {
                return false;
            }
        }
        String[] strArr2 = this.f40975c;
        return strArr2 == null || Dg.c.j(strArr2, socket.getEnabledCipherSuites(), C1947o.f40951b.getORDER_BY_NAME$okhttp());
    }

    public final List c() {
        String[] strArr = this.f40976d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(k0.f40939b.forJavaName(str));
        }
        return CollectionsKt.Y(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        r rVar = (r) obj;
        boolean z3 = rVar.f40973a;
        boolean z8 = this.f40973a;
        if (z8 != z3) {
            return false;
        }
        if (z8) {
            return Arrays.equals(this.f40975c, rVar.f40975c) && Arrays.equals(this.f40976d, rVar.f40976d) && this.f40974b == rVar.f40974b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.f40973a) {
            return 17;
        }
        String[] strArr = this.f40975c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f40976d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f40974b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f40973a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f40974b + ')';
    }
}

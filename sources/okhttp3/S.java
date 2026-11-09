package okhttp3;

import com.luck.picture.lib.config.FileSizeUnit;
import face.security.device.api.FaceSecCode;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p310ub.C2085k0;

/* JADX INFO: loaded from: classes4.dex */
public final class S {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f40612A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f40613B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public C2085k0 f40614C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.transsnet.palmpay.custom_view.dialog.y f40615a = new com.transsnet.palmpay.custom_view.dialog.y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1948p f40616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f40617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f40618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Dg.a f40619e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f40620f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C1922b f40621g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f40622h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f40623i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CookieJar f40624j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C1929i f40625k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Dns f40626l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Proxy f40627m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ProxySelector f40628n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C1922b f40629o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SocketFactory f40630p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public SSLSocketFactory f40631q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public X509TrustManager f40632r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public List f40633s;
    public List t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Mg.f f40634u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C1945m f40635v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Mg.e f40636w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f40637x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f40638y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f40639z;

    public S() {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        this.f40616b = new C1948p(5, 5L);
        this.f40617c = new ArrayList();
        this.f40618d = new ArrayList();
        AbstractC1956y abstractC1956y = AbstractC1956y.NONE;
        Intrinsics.checkNotNullParameter(abstractC1956y, "<this>");
        this.f40619e = new Dg.a(abstractC1956y, 0);
        this.f40620f = true;
        C1922b c1922b = Authenticator.f40556a;
        this.f40621g = c1922b;
        this.f40622h = true;
        this.f40623i = true;
        this.f40624j = CookieJar.f40559o0;
        this.f40626l = Dns.f40565a;
        this.f40629o = c1922b;
        SocketFactory socketFactory = SocketFactory.getDefault();
        Intrinsics.checkNotNullExpressionValue(socketFactory, "getDefault()");
        this.f40630p = socketFactory;
        T t = U.f40640t0;
        this.f40633s = t.getDEFAULT_CONNECTION_SPECS$okhttp();
        this.t = t.getDEFAULT_PROTOCOLS$okhttp();
        this.f40634u = Mg.f.f6024a;
        this.f40635v = C1945m.f40948d;
        this.f40638y = FaceSecCode.SC_SUCCESS;
        this.f40639z = FaceSecCode.SC_SUCCESS;
        this.f40612A = FaceSecCode.SC_SUCCESS;
        this.f40613B = FileSizeUnit.KB;
    }

    public final void a(Interceptor interceptor) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        this.f40617c.add(interceptor);
    }

    public final void b(long j6, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.f40638y = Dg.c.b("timeout", j6, unit);
    }

    public final void c(Dns dns) {
        Intrinsics.checkNotNullParameter(dns, "dns");
        if (!Intrinsics.c(dns, this.f40626l)) {
            this.f40614C = null;
        }
        this.f40626l = dns;
    }

    public final void d(List protocols) {
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        ArrayList arrayListZ = CollectionsKt.Z(protocols);
        W w3 = W.H2_PRIOR_KNOWLEDGE;
        if (!arrayListZ.contains(w3) && !arrayListZ.contains(W.HTTP_1_1)) {
            throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + arrayListZ).toString());
        }
        if (arrayListZ.contains(w3) && arrayListZ.size() > 1) {
            throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + arrayListZ).toString());
        }
        if (arrayListZ.contains(W.HTTP_1_0)) {
            throw new IllegalArgumentException(("protocols must not contain http/1.0: " + arrayListZ).toString());
        }
        if (arrayListZ.contains(null)) {
            throw new IllegalArgumentException("protocols must not contain null");
        }
        arrayListZ.remove(W.SPDY_3);
        if (!arrayListZ.equals(this.t)) {
            this.f40614C = null;
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayListZ);
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(protocolsCopy)");
        this.t = listUnmodifiableList;
    }

    public final void e(long j6, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.f40639z = Dg.c.b("timeout", j6, unit);
    }

    public final void f(long j6, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.f40612A = Dg.c.b("timeout", j6, unit);
    }
}

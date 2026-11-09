package okhttp3;

import com.google.common.net.HttpHeaders;
import com.transsnet.palmpay.core.bean.bill.TransType;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import p310ub.C2085k0;

/* JADX INFO: loaded from: classes4.dex */
public final class U implements Cloneable, Call.Factory, WebSocket.Factory {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final T f40640t0 = new T(null);

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final List f40641u0 = Dg.c.l(W.HTTP_2, W.HTTP_1_1);

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final List f40642v0 = Dg.c.l(r.f40971e, r.f40972f);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C1922b f40643A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final SocketFactory f40644B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final SSLSocketFactory f40645C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final X509TrustManager f40646H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final List f40647L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final List f40648M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final Mg.f f40649Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final C1945m f40650X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Mg.e f40651Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final int f40652Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.transsnet.palmpay.custom_view.dialog.y f40653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1948p f40654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f40655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f40656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Dg.a f40657e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f40658f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1922b f40659g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f40660i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f40661j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final int f40662k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CookieJar f40663o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C1929i f40664p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f40665p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f40666q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final long f40667r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final C2085k0 f40668s0;
    public final Dns t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Proxy f40669v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ProxySelector f40670w;

    public U(S builder) {
        ProxySelector proxySelector;
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f40653a = builder.f40615a;
        this.f40654b = builder.f40616b;
        this.f40655c = Dg.c.y(builder.f40617c);
        this.f40656d = Dg.c.y(builder.f40618d);
        this.f40657e = builder.f40619e;
        this.f40658f = builder.f40620f;
        this.f40659g = builder.f40621g;
        this.f40660i = builder.f40622h;
        this.f40661j = builder.f40623i;
        this.f40663o = builder.f40624j;
        this.f40664p = builder.f40625k;
        this.t = builder.f40626l;
        Proxy proxy = builder.f40627m;
        this.f40669v = proxy;
        if (proxy != null) {
            proxySelector = Lg.a.f5662a;
        } else {
            proxySelector = builder.f40628n;
            proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
            if (proxySelector == null) {
                proxySelector = Lg.a.f5662a;
            }
        }
        this.f40670w = proxySelector;
        this.f40643A = builder.f40629o;
        this.f40644B = builder.f40630p;
        List list = builder.f40633s;
        this.f40647L = list;
        this.f40648M = builder.t;
        this.f40649Q = builder.f40634u;
        this.f40652Z = builder.f40637x;
        this.f40662k0 = builder.f40638y;
        this.f40665p0 = builder.f40639z;
        this.f40666q0 = builder.f40612A;
        this.f40667r0 = builder.f40613B;
        C2085k0 c2085k0 = builder.f40614C;
        this.f40668s0 = c2085k0 == null ? new C2085k0(4) : c2085k0;
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    this.f40645C = null;
                    this.f40651Y = null;
                    this.f40646H = null;
                    this.f40650X = C1945m.f40948d;
                    break;
                }
                if (((r) it.next()).f40973a) {
                    C1945m c1945m = builder.f40635v;
                    SSLSocketFactory sSLSocketFactory = builder.f40631q;
                    if (sSLSocketFactory == null) {
                        Jg.s sVar = Jg.t.f4869a;
                        X509TrustManager x509TrustManagerN = sVar.get().n();
                        this.f40646H = x509TrustManagerN;
                        this.f40645C = sVar.get().m(x509TrustManagerN);
                        Mg.e certificateChainCleaner = Mg.e.f6023a.get(x509TrustManagerN);
                        this.f40651Y = certificateChainCleaner;
                        Intrinsics.e(certificateChainCleaner);
                        c1945m.getClass();
                        Intrinsics.checkNotNullParameter(certificateChainCleaner, "certificateChainCleaner");
                        this.f40650X = Intrinsics.c(c1945m.f40950b, certificateChainCleaner) ? c1945m : new C1945m(c1945m.f40949a, certificateChainCleaner);
                        break;
                    }
                    this.f40645C = sSLSocketFactory;
                    Mg.e certificateChainCleaner2 = builder.f40636w;
                    Intrinsics.e(certificateChainCleaner2);
                    this.f40651Y = certificateChainCleaner2;
                    X509TrustManager x509TrustManager = builder.f40632r;
                    Intrinsics.e(x509TrustManager);
                    this.f40646H = x509TrustManager;
                    c1945m.getClass();
                    Intrinsics.checkNotNullParameter(certificateChainCleaner2, "certificateChainCleaner");
                    this.f40650X = Intrinsics.c(c1945m.f40950b, certificateChainCleaner2) ? c1945m : new C1945m(c1945m.f40949a, certificateChainCleaner2);
                    break;
                }
            }
        } else {
            this.f40645C = null;
            this.f40651Y = null;
            this.f40646H = null;
            this.f40650X = C1945m.f40948d;
            break;
        }
        List list3 = this.f40655c;
        Intrinsics.f(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list3.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + list3).toString());
        }
        List list4 = this.f40656d;
        Intrinsics.f(list4, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list4.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + list4).toString());
        }
        List list5 = this.f40647L;
        boolean z3 = list5 instanceof Collection;
        X509TrustManager x509TrustManager2 = this.f40646H;
        Mg.e eVar = this.f40651Y;
        SSLSocketFactory sSLSocketFactory2 = this.f40645C;
        if (!z3 || !list5.isEmpty()) {
            Iterator it2 = list5.iterator();
            while (it2.hasNext()) {
                if (((r) it2.next()).f40973a) {
                    if (sSLSocketFactory2 == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (eVar == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (x509TrustManager2 == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (sSLSocketFactory2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (eVar != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (x509TrustManager2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!Intrinsics.c(this.f40650X, C1945m.f40948d)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final S a() {
        Intrinsics.checkNotNullParameter(this, "okHttpClient");
        S s3 = new S();
        s3.f40615a = this.f40653a;
        s3.f40616b = this.f40654b;
        kotlin.collections.v.n(s3.f40617c, this.f40655c);
        kotlin.collections.v.n(s3.f40618d, this.f40656d);
        s3.f40619e = this.f40657e;
        s3.f40620f = this.f40658f;
        s3.f40621g = this.f40659g;
        s3.f40622h = this.f40660i;
        s3.f40623i = this.f40661j;
        s3.f40624j = this.f40663o;
        s3.f40625k = this.f40664p;
        s3.f40626l = this.t;
        s3.f40627m = this.f40669v;
        s3.f40628n = this.f40670w;
        s3.f40629o = this.f40643A;
        s3.f40630p = this.f40644B;
        s3.f40631q = this.f40645C;
        s3.f40632r = this.f40646H;
        s3.f40633s = this.f40647L;
        s3.t = this.f40648M;
        s3.f40634u = this.f40649Q;
        s3.f40635v = this.f40650X;
        s3.f40636w = this.f40651Y;
        s3.f40637x = this.f40652Z;
        s3.f40638y = this.f40662k0;
        s3.f40639z = this.f40665p0;
        s3.f40612A = this.f40666q0;
        s3.f40613B = this.f40667r0;
        s3.f40614C = this.f40668s0;
        return s3;
    }

    public final Object clone() {
        return super.clone();
    }

    @Override // okhttp3.Call.Factory
    public final Call newCall(Y request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new Gg.i(this, request, false);
    }

    @Override // okhttp3.WebSocket.Factory
    public final WebSocket newWebSocket(Y request, l0 listener) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(listener, "listener");
        int i7 = 0;
        Ng.h hVar = new Ng.h(Fg.d.f2846i, request, listener, new Random(), 0, this.f40667r0);
        Intrinsics.checkNotNullParameter(this, "client");
        if (request.a(HttpHeaders.SEC_WEBSOCKET_EXTENSIONS) != null) {
            hVar.b(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
            return hVar;
        }
        S sA = a();
        AbstractC1956y eventListener = AbstractC1956y.NONE;
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        byte[] bArr = Dg.c.f1879a;
        Intrinsics.checkNotNullParameter(eventListener, "<this>");
        sA.f40619e = new Dg.a(eventListener, i7);
        sA.d(Ng.h.f6406x);
        U u6 = new U(sA);
        X xB = request.b();
        xB.e(HttpHeaders.UPGRADE, "websocket");
        xB.e("Connection", HttpHeaders.UPGRADE);
        xB.e(HttpHeaders.SEC_WEBSOCKET_KEY, hVar.f6413g);
        xB.e(HttpHeaders.SEC_WEBSOCKET_VERSION, TransType.TRANS_TYPE_AIRTIME_LOAN);
        xB.e(HttpHeaders.SEC_WEBSOCKET_EXTENSIONS, "permessage-deflate");
        Y yB = xB.b();
        Gg.i iVar = new Gg.i(u6, yB, true);
        hVar.f6414h = iVar;
        iVar.enqueue(new p1.d(9, hVar, yB));
        return hVar;
    }

    public U() {
        this(new S());
    }
}

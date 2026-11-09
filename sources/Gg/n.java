package Gg;

import C0.C0127t;
import C0.G;
import Jg.t;
import N8.q0;
import Pg.AbstractC0555b;
import Pg.w;
import Pg.x;
import androidx.appcompat.widget.m1;
import com.facebook.react.uimanager.ViewProps;
import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.FirebasePerformance;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.AbstractC1956y;
import okhttp3.C;
import okhttp3.C1921a;
import okhttp3.C1945m;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.D;
import okhttp3.F;
import okhttp3.J;
import okhttp3.U;
import okhttp3.W;
import okhttp3.X;
import okhttp3.Y;
import okhttp3.d0;
import okhttp3.e0;
import okhttp3.h0;
import okhttp3.i0;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http2.AbstractC1938i;
import okhttp3.internal.http2.E;
import okhttp3.internal.http2.EnumC1932c;
import okhttp3.internal.http2.K;
import okhttp3.internal.http2.PushObserver;
import okhttp3.internal.http2.u;
import p310ub.C2085k0;
import p355xf.C2126e;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends okhttp3.internal.http2.m implements Connection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f3462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Socket f3463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Socket f3464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public D f3465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public W f3466f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public u f3467g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public x f3468h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public w f3469i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f3470j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f3471k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3472l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f3473m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f3474n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3475o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f3476p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f3477q;

    static {
        new j(null);
    }

    public n(p connectionPool, i0 route) {
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(route, "route");
        this.f3462b = route;
        this.f3475o = 1;
        this.f3476p = new ArrayList();
        this.f3477q = Long.MAX_VALUE;
    }

    public static void d(U client, i0 failedRoute, IOException failure) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
        Intrinsics.checkNotNullParameter(failure, "failure");
        if (failedRoute.f40762b.type() != Proxy.Type.DIRECT) {
            C1921a c1921a = failedRoute.f40761a;
            c1921a.f40701h.connectFailed(c1921a.f40702i.k(), failedRoute.f40762b.address(), failure);
        }
        C2085k0 c2085k0 = client.f40668s0;
        synchronized (c2085k0) {
            Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
            ((LinkedHashSet) c2085k0.f42878b).add(failedRoute);
        }
    }

    @Override // okhttp3.internal.http2.m
    public final synchronized void a(u connection, K settings) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f3475o = (settings.f40799a & 16) != 0 ? settings.f40800b[4] : Integer.MAX_VALUE;
    }

    @Override // okhttp3.internal.http2.m
    public final void b(E stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        stream.c(EnumC1932c.REFUSED_STREAM, null);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0147 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:0x0147 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x0147 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x0147 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:65:0x0108  */
    /* JADX WARN: Code duplicated, block: B:66:0x010e  */
    /* JADX WARN: Code duplicated, block: B:68:0x011a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0123  */
    /* JADX WARN: Code duplicated, block: B:72:0x0127  */
    /* JADX WARN: Code duplicated, block: B:74:0x012b  */
    /* JADX WARN: Code duplicated, block: B:80:0x013b  */
    /* JADX WARN: Code duplicated, block: B:82:0x013f A[LOOP:0: B:18:0x006c->B:82:0x013f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:98:0x0147 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0147 A[SYNTHETIC] */
    public final void c(int i7, int i10, int i11, boolean z3, Call call, AbstractC1956y abstractC1956y) throws Throwable {
        n nVar;
        Socket socket;
        Socket socket2;
        Proxy proxy;
        IOException e10;
        n nVar2 = this;
        Call call2 = call;
        AbstractC1956y eventListener = abstractC1956y;
        Intrinsics.checkNotNullParameter(call2, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        if (nVar2.f3466f != null) {
            throw new IllegalStateException("already connected");
        }
        i0 i0Var = nVar2.f3462b;
        C1921a c1921a = i0Var.f40761a;
        Proxy proxy2 = i0Var.f40762b;
        List list = c1921a.f40704k;
        b bVar = new b(list);
        C1921a c1921a2 = i0Var.f40761a;
        if (c1921a2.f40696c != null) {
            if (c1921a2.f40703j.contains(W.H2_PRIOR_KNOWLEDGE)) {
                throw new q(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
            }
        } else {
            if (!list.contains(okhttp3.r.f40972f)) {
                throw new q(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = c1921a2.f40702i.f40582d;
            if (!t.f4869a.get().h(str)) {
                throw new q(new UnknownServiceException(q0.k("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        }
        q qVar = null;
        while (true) {
            try {
                if (c1921a2.f40696c != null && proxy2.type() == Proxy.Type.HTTP) {
                    Call call3 = call2;
                    try {
                        nVar2.f(i7, i10, i11, call3, eventListener);
                        nVar = nVar2;
                        call2 = call3;
                        try {
                            if (nVar.f3463c == null) {
                                break;
                            }
                        } catch (IOException e11) {
                            e = e11;
                            socket = nVar.f3464d;
                            if (socket != null) {
                                Dg.c.d(socket);
                            }
                            socket2 = nVar.f3463c;
                            if (socket2 != null) {
                                Dg.c.d(socket2);
                            }
                            nVar.f3464d = null;
                            nVar.f3463c = null;
                            nVar.f3468h = null;
                            nVar.f3469i = null;
                            nVar.f3465e = null;
                            nVar.f3466f = null;
                            nVar.f3467g = null;
                            nVar.f3475o = 1;
                            AbstractC1956y abstractC1956y2 = eventListener;
                            proxy = proxy2;
                            e10 = e;
                            abstractC1956y2.connectFailed(call2, i0Var.f40763c, proxy, null, e10);
                            if (qVar == null) {
                                qVar = new q(e10);
                            } else {
                                Intrinsics.checkNotNullParameter(e10, "e");
                                C2126e.a(qVar.f3483a, e10);
                                qVar.f3484b = e10;
                            }
                            if (z3) {
                                throw qVar;
                            }
                            Intrinsics.checkNotNullParameter(e10, "e");
                            bVar.f3410d = true;
                            if (bVar.f3409c) {
                                throw qVar;
                            }
                            if (!(e10 instanceof ProtocolException)) {
                                throw qVar;
                            }
                            if (!(e10 instanceof InterruptedIOException)) {
                                throw qVar;
                            }
                            if (!(e10 instanceof SSLHandshakeException)) {
                            }
                            if (!(e10 instanceof SSLPeerUnverifiedException)) {
                                throw qVar;
                            }
                            if (e10 instanceof SSLException) {
                                throw qVar;
                            }
                            call2 = call;
                            eventListener = abstractC1956y;
                            proxy2 = proxy;
                            nVar2 = nVar;
                        }
                    } catch (IOException e12) {
                        e = e12;
                        nVar = nVar2;
                        call2 = call3;
                    }
                } else {
                    nVar = nVar2;
                    try {
                        nVar.e(i7, i10, call2, eventListener);
                    } catch (IOException e13) {
                        e = e13;
                        socket = nVar.f3464d;
                        if (socket != null) {
                            Dg.c.d(socket);
                        }
                        socket2 = nVar.f3463c;
                        if (socket2 != null) {
                            Dg.c.d(socket2);
                        }
                        nVar.f3464d = null;
                        nVar.f3463c = null;
                        nVar.f3468h = null;
                        nVar.f3469i = null;
                        nVar.f3465e = null;
                        nVar.f3466f = null;
                        nVar.f3467g = null;
                        nVar.f3475o = 1;
                        AbstractC1956y abstractC1956y3 = eventListener;
                        proxy = proxy2;
                        e10 = e;
                        abstractC1956y3.connectFailed(call2, i0Var.f40763c, proxy, null, e10);
                        if (qVar == null) {
                            qVar = new q(e10);
                        } else {
                            Intrinsics.checkNotNullParameter(e10, "e");
                            C2126e.a(qVar.f3483a, e10);
                            qVar.f3484b = e10;
                        }
                        if (z3) {
                            throw qVar;
                        }
                        Intrinsics.checkNotNullParameter(e10, "e");
                        bVar.f3410d = true;
                        if (bVar.f3409c) {
                            throw qVar;
                        }
                        if (!(e10 instanceof ProtocolException)) {
                            throw qVar;
                        }
                        if (!(e10 instanceof InterruptedIOException)) {
                            throw qVar;
                        }
                        if (!(e10 instanceof SSLHandshakeException) && (e10.getCause() instanceof CertificateException)) {
                            throw qVar;
                        }
                        if (!(e10 instanceof SSLPeerUnverifiedException)) {
                            throw qVar;
                        }
                        if (e10 instanceof SSLException) {
                            throw qVar;
                        }
                        call2 = call;
                        eventListener = abstractC1956y;
                        proxy2 = proxy;
                        nVar2 = nVar;
                    }
                }
                nVar.g(bVar, call2, eventListener);
                eventListener.connectEnd(call2, i0Var.f40763c, proxy2, nVar.f3466f);
                break;
            } catch (IOException e14) {
                e = e14;
                nVar = nVar2;
            }
            call2 = call;
            eventListener = abstractC1956y;
            proxy2 = proxy;
            nVar2 = nVar;
        }
        if (c1921a2.f40696c != null && proxy2.type() == Proxy.Type.HTTP && nVar.f3463c == null) {
            throw new q(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        nVar.f3477q = System.nanoTime();
    }

    public final void e(int i7, int i10, Call call, AbstractC1956y abstractC1956y) throws IOException {
        Socket socketCreateSocket;
        i0 i0Var = this.f3462b;
        Proxy proxy = i0Var.f40762b;
        C1921a c1921a = i0Var.f40761a;
        Proxy.Type type = proxy.type();
        int i11 = type == null ? -1 : k.f3454a[type.ordinal()];
        if (i11 == 1 || i11 == 2) {
            socketCreateSocket = c1921a.f40695b.createSocket();
            Intrinsics.e(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(proxy);
        }
        this.f3463c = socketCreateSocket;
        InetSocketAddress inetSocketAddress = i0Var.f40763c;
        abstractC1956y.connectStart(call, inetSocketAddress, proxy);
        socketCreateSocket.setSoTimeout(i10);
        try {
            t.f4869a.get().e(socketCreateSocket, inetSocketAddress, i7);
            try {
                this.f3468h = AbstractC0555b.c(AbstractC0555b.m(socketCreateSocket));
                this.f3469i = AbstractC0555b.b(AbstractC0555b.i(socketCreateSocket));
            } catch (NullPointerException e10) {
                if (Intrinsics.c(e10.getMessage(), "throw with null exception")) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException("Failed to connect to " + inetSocketAddress);
            connectException.initCause(e11);
            throw connectException;
        }
    }

    public final void f(int i7, int i10, int i11, Call call, AbstractC1956y abstractC1956y) throws IOException {
        X x3 = new X();
        i0 i0Var = this.f3462b;
        J url = i0Var.f40761a.f40702i;
        Intrinsics.checkNotNullParameter(url, "url");
        x3.f40680a = url;
        x3.g(FirebasePerformance.HttpMethod.CONNECT, null);
        C1921a c1921a = i0Var.f40761a;
        x3.e(HttpHeaders.HOST, Dg.c.x(c1921a.f40702i, true));
        x3.e("Proxy-Connection", HttpHeaders.KEEP_ALIVE);
        x3.e("User-Agent", "okhttp/4.12.0");
        Y request = x3.b();
        F1.b bVar = new F1.b(3);
        Intrinsics.checkNotNullParameter(request, "request");
        W protocol = W.HTTP_1_1;
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter("Preemptive Authenticate", "message");
        h0 h0Var = Dg.c.f1881c;
        Intrinsics.checkNotNullParameter(HttpHeaders.PROXY_AUTHENTICATE, "name");
        Intrinsics.checkNotNullParameter("OkHttp-Preemptive", "value");
        Intrinsics.checkNotNullParameter(HttpHeaders.PROXY_AUTHENTICATE, "name");
        Intrinsics.checkNotNullParameter("OkHttp-Preemptive", "value");
        okhttp3.E e10 = F.f40566b;
        e10.checkName(HttpHeaders.PROXY_AUTHENTICATE);
        e10.checkValue("OkHttp-Preemptive", HttpHeaders.PROXY_AUTHENTICATE);
        bVar.j(HttpHeaders.PROXY_AUTHENTICATE);
        bVar.d(HttpHeaders.PROXY_AUTHENTICATE, "OkHttp-Preemptive");
        e0 response = new e0(request, protocol, "Preemptive Authenticate", 407, null, bVar.h(), h0Var, null, null, null, -1L, -1L, null);
        c1921a.f40699f.getClass();
        Intrinsics.checkNotNullParameter(response, "response");
        e(i7, i10, call, abstractC1956y);
        String str = "CONNECT " + Dg.c.x(request.f40685a, true) + " HTTP/1.1";
        x xVar = this.f3468h;
        Intrinsics.e(xVar);
        w wVar = this.f3469i;
        Intrinsics.e(wVar);
        Ig.j jVar = new Ig.j(null, this, xVar, wVar);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        xVar.f7388a.timeout().timeout(i10, timeUnit);
        wVar.f7385a.timeout().timeout(i11, timeUnit);
        jVar.c(request.f40687c, str);
        jVar.finishRequest();
        d0 responseHeaders = jVar.readResponseHeaders(false);
        Intrinsics.e(responseHeaders);
        Intrinsics.checkNotNullParameter(request, "request");
        responseHeaders.f40715a = request;
        e0 response2 = responseHeaders.a();
        Intrinsics.checkNotNullParameter(response2, "response");
        long jK = Dg.c.k(response2);
        if (jK != -1) {
            Ig.g gVarB = jVar.b(jK);
            Dg.c.v(gVarB, Integer.MAX_VALUE);
            gVarB.close();
        }
        int i12 = response2.f40731d;
        if (i12 == 200) {
            if (!xVar.f7389b.exhausted() || !wVar.f7386b.exhausted()) {
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        } else {
            if (i12 != 407) {
                throw new IOException(G.m(i12, "Unexpected response code for CONNECT: "));
            }
            c1921a.f40699f.getClass();
            Intrinsics.checkNotNullParameter(response2, "response");
            throw new IOException("Failed to authenticate with proxy");
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void g(b bVar, Call call, AbstractC1956y abstractC1956y) throws Throwable {
        i0 i0Var = this.f3462b;
        C1921a c1921a = i0Var.f40761a;
        if (c1921a.f40696c == null) {
            W w3 = W.H2_PRIOR_KNOWLEDGE;
            if (!c1921a.f40703j.contains(w3)) {
                this.f3464d = this.f3463c;
                this.f3466f = W.HTTP_1_1;
                return;
            } else {
                this.f3464d = this.f3463c;
                this.f3466f = w3;
                l();
                return;
            }
        }
        abstractC1956y.secureConnectStart(call);
        C1921a c1921a2 = i0Var.f40761a;
        SSLSocketFactory sSLSocketFactory = c1921a2.f40696c;
        J j6 = c1921a2.f40702i;
        SSLSocket sSLSocket = null;
        try {
            Intrinsics.e(sSLSocketFactory);
            Socket socketCreateSocket = sSLSocketFactory.createSocket(this.f3463c, j6.f40582d, j6.f40583e, true);
            Intrinsics.f(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                okhttp3.r rVarA = bVar.a(sSLSocket2);
                String str = j6.f40582d;
                boolean z3 = rVarA.f40974b;
                if (z3) {
                    t.f4869a.get().d(sSLSocket2, str, c1921a2.f40703j);
                }
                sSLSocket2.startHandshake();
                SSLSession sslSocketSession = sSLSocket2.getSession();
                C c6 = D.f40560e;
                Intrinsics.checkNotNullExpressionValue(sslSocketSession, "sslSocketSession");
                D d2 = c6.get(sslSocketSession);
                HostnameVerifier hostnameVerifier = c1921a2.f40697d;
                Intrinsics.e(hostnameVerifier);
                if (hostnameVerifier.verify(str, sslSocketSession)) {
                    C1945m c1945m = c1921a2.f40698e;
                    Intrinsics.e(c1945m);
                    this.f3465e = new D(d2.f40561a, d2.f40562b, d2.f40563c, new l(c1945m, 0, d2, c1921a2));
                    c1945m.a(str, new C0127t(this, 2));
                    String strF = z3 ? t.f4869a.get().f(sSLSocket2) : null;
                    this.f3464d = sSLSocket2;
                    this.f3468h = AbstractC0555b.c(AbstractC0555b.m(sSLSocket2));
                    this.f3469i = AbstractC0555b.b(AbstractC0555b.i(sSLSocket2));
                    this.f3466f = strF != null ? W.f40671b.get(strF) : W.HTTP_1_1;
                    t.f4869a.get().a(sSLSocket2);
                    abstractC1956y.secureConnectEnd(call, this.f3465e);
                    if (this.f3466f == W.HTTP_2) {
                        l();
                        return;
                    }
                    return;
                }
                List listA = d2.a();
                if (listA.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + str + " not verified (no certificates)");
                }
                Object obj = listA.get(0);
                Intrinsics.f(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate certificate = (X509Certificate) obj;
                StringBuilder sb2 = new StringBuilder("\n              |Hostname ");
                sb2.append(str);
                sb2.append(" not verified:\n              |    certificate: ");
                sb2.append(C1945m.f40947c.pin(certificate));
                sb2.append("\n              |    DN: ");
                sb2.append(certificate.getSubjectDN().getName());
                sb2.append("\n              |    subjectAltNames: ");
                Intrinsics.checkNotNullParameter(certificate, "certificate");
                sb2.append(CollectionsKt.P(Mg.f.a(certificate, 7), Mg.f.a(certificate, 2)));
                sb2.append("\n              ");
                throw new SSLPeerUnverifiedException(kotlin.text.s.c(sb2.toString()));
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    t.f4869a.get().a(sSLSocket);
                }
                if (sSLSocket != null) {
                    Dg.c.d(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final boolean h(C1921a address, ArrayList arrayList) {
        D d2;
        Intrinsics.checkNotNullParameter(address, "address");
        byte[] bArr = Dg.c.f1879a;
        if (this.f3476p.size() < this.f3475o && !this.f3470j) {
            i0 i0Var = this.f3462b;
            if (i0Var.f40761a.a(address)) {
                J j6 = address.f40702i;
                String str = j6.f40582d;
                C1921a c1921a = i0Var.f40761a;
                if (Intrinsics.c(str, c1921a.f40702i.f40582d)) {
                    return true;
                }
                if (this.f3467g != null && arrayList != null && !arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        i0 i0Var2 = (i0) it.next();
                        Proxy.Type type = i0Var2.f40762b.type();
                        Proxy.Type type2 = Proxy.Type.DIRECT;
                        if (type == type2 && i0Var.f40762b.type() == type2) {
                            if (Intrinsics.c(i0Var.f40763c, i0Var2.f40763c)) {
                                if (address.f40697d != Mg.f.f6024a) {
                                    break;
                                }
                                byte[] bArr2 = Dg.c.f1879a;
                                J j10 = c1921a.f40702i;
                                if (j6.f40583e != j10.f40583e) {
                                    break;
                                }
                                String str2 = j10.f40582d;
                                String hostname = j6.f40582d;
                                if (!Intrinsics.c(hostname, str2)) {
                                    if (!this.f3471k && (d2 = this.f3465e) != null) {
                                        List listA = d2.a();
                                        if (!listA.isEmpty()) {
                                            Object obj = listA.get(0);
                                            Intrinsics.f(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                            if (!Mg.f.b(hostname, (X509Certificate) obj)) {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    } else {
                                        break;
                                        break;
                                    }
                                }
                                try {
                                    C1945m c1945m = address.f40698e;
                                    Intrinsics.e(c1945m);
                                    D d10 = this.f3465e;
                                    Intrinsics.e(d10);
                                    List peerCertificates = d10.a();
                                    Intrinsics.checkNotNullParameter(hostname, "hostname");
                                    Intrinsics.checkNotNullParameter(peerCertificates, "peerCertificates");
                                    c1945m.a(hostname, new l(c1945m, 3, peerCertificates, hostname));
                                    return true;
                                } catch (SSLPeerUnverifiedException unused) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // okhttp3.Connection
    public final D handshake() {
        return this.f3465e;
    }

    public final boolean i(boolean z3) {
        long j6;
        byte[] bArr = Dg.c.f1879a;
        long jNanoTime = System.nanoTime();
        Socket socket = this.f3463c;
        Intrinsics.e(socket);
        Socket socket2 = this.f3464d;
        Intrinsics.e(socket2);
        x source = this.f3468h;
        Intrinsics.e(source);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        u uVar = this.f3467g;
        if (uVar != null) {
            synchronized (uVar) {
                if (uVar.f40885f) {
                    return false;
                }
                return uVar.f40893w >= uVar.f40892v || jNanoTime < uVar.f40870A;
            }
        }
        synchronized (this) {
            j6 = jNanoTime - this.f3477q;
        }
        if (j6 < 10000000000L || !z3) {
            return true;
        }
        Intrinsics.checkNotNullParameter(socket2, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                return !source.exhausted();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final ExchangeCodec j(U client, Hg.f chain) throws SocketException {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Socket socket = this.f3464d;
        Intrinsics.e(socket);
        x xVar = this.f3468h;
        Intrinsics.e(xVar);
        w wVar = this.f3469i;
        Intrinsics.e(wVar);
        u uVar = this.f3467g;
        if (uVar != null) {
            return new okhttp3.internal.http2.w(client, this, chain, uVar);
        }
        socket.setSoTimeout(chain.f3940g);
        Pg.F fTimeout = xVar.f7388a.timeout();
        long j6 = chain.f3940g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        fTimeout.timeout(j6, timeUnit);
        wVar.f7385a.timeout().timeout(chain.f3941h, timeUnit);
        return new Ig.j(client, this, xVar, wVar);
    }

    public final synchronized void k() {
        this.f3470j = true;
    }

    public final void l() throws SocketException {
        int i7;
        Socket socket = this.f3464d;
        Intrinsics.e(socket);
        x source = this.f3468h;
        Intrinsics.e(source);
        w sink = this.f3469i;
        Intrinsics.e(sink);
        socket.setSoTimeout(0);
        Fg.d taskRunner = Fg.d.f2846i;
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        m1 m1Var = new m1();
        m1Var.f12971a = taskRunner;
        m1Var.f12976f = okhttp3.internal.http2.m.f40842a;
        m1Var.f12977g = PushObserver.f40802a;
        String peerName = this.f3462b.f40761a.f40702i.f40582d;
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(peerName, "peerName");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(socket, "<set-?>");
        m1Var.f12972b = socket;
        String str = Dg.c.f1885g + ' ' + peerName;
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        m1Var.f12973c = str;
        Intrinsics.checkNotNullParameter(source, "<set-?>");
        m1Var.f12974d = source;
        Intrinsics.checkNotNullParameter(sink, "<set-?>");
        m1Var.f12975e = sink;
        Intrinsics.checkNotNullParameter(this, "listener");
        m1Var.f12976f = this;
        u uVar = new u(m1Var);
        this.f3467g = uVar;
        K default_settings = u.f40868p0.getDEFAULT_SETTINGS();
        this.f3475o = (default_settings.f40799a & 16) != 0 ? default_settings.f40800b[4] : Integer.MAX_VALUE;
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        okhttp3.internal.http2.G g7 = uVar.f40878Y;
        synchronized (g7) {
            try {
                if (g7.f40794d) {
                    throw new IOException("closed");
                }
                Logger logger = okhttp3.internal.http2.G.f40790f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(Dg.c.i(">> CONNECTION " + AbstractC1938i.f40838a.e(), new Object[0]));
                }
                g7.f40791a.write(AbstractC1938i.f40838a);
                g7.f40791a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
        okhttp3.internal.http2.G g10 = uVar.f40878Y;
        K settings = uVar.f40871B;
        synchronized (g10) {
            try {
                Intrinsics.checkNotNullParameter(settings, "settings");
                if (g10.f40794d) {
                    throw new IOException("closed");
                }
                g10.c(0, Integer.bitCount(settings.f40799a) * 6, 4, 0);
                int i10 = 0;
                while (i10 < 10) {
                    boolean z3 = true;
                    if (((1 << i10) & settings.f40799a) == 0) {
                        z3 = false;
                    }
                    if (z3) {
                        if (i10 != 4) {
                            i7 = i10 != 7 ? i10 : 4;
                        } else {
                            i7 = 3;
                        }
                        g10.f40791a.writeShort(i7);
                        g10.f40791a.writeInt(settings.f40800b[i10]);
                    }
                    i10++;
                }
                g10.f40791a.flush();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int iA = uVar.f40871B.a();
        if (iA != 65535) {
            uVar.f40878Y.h(0, iA - 65535);
        }
        taskRunner.e().c(new Eg.k(uVar.f40882c, uVar.f40879Z, 1), 0L);
    }

    @Override // okhttp3.Connection
    public final W protocol() {
        W w3 = this.f3466f;
        Intrinsics.e(w3);
        return w3;
    }

    @Override // okhttp3.Connection
    public final i0 route() {
        return this.f3462b;
    }

    @Override // okhttp3.Connection
    public final Socket socket() {
        Socket socket = this.f3464d;
        Intrinsics.e(socket);
        return socket;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder("Connection{");
        i0 i0Var = this.f3462b;
        sb2.append(i0Var.f40761a.f40702i.f40582d);
        sb2.append(':');
        sb2.append(i0Var.f40761a.f40702i.f40583e);
        sb2.append(", proxy=");
        sb2.append(i0Var.f40762b);
        sb2.append(" hostAddress=");
        sb2.append(i0Var.f40763c);
        sb2.append(" cipherSuite=");
        D d2 = this.f3465e;
        if (d2 == null || (obj = d2.f40562b) == null) {
            obj = ViewProps.NONE;
        }
        sb2.append(obj);
        sb2.append(" protocol=");
        sb2.append(this.f3466f);
        sb2.append('}');
        return sb2.toString();
    }
}

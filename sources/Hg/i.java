package Hg;

import Gg.n;
import Gg.p;
import Gg.q;
import Gg.s;
import com.google.common.net.HttpHeaders;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import okhttp3.C1921a;
import okhttp3.C1945m;
import okhttp3.Interceptor;
import okhttp3.J;
import okhttp3.U;
import okhttp3.X;
import okhttp3.Y;
import okhttp3.c0;
import okhttp3.d0;
import okhttp3.e0;
import okhttp3.h0;
import okhttp3.i0;
import okhttp3.internal.http2.C1930a;
import p355xf.C2126e;
import p377z5.l;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U f3947a;

    static {
        new h(null);
    }

    public i(U client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.f3947a = client;
    }

    public static int c(e0 e0Var, int i7) {
        String strB = e0Var.b(HttpHeaders.RETRY_AFTER, null);
        if (strB == null) {
            return i7;
        }
        if (!new Regex("\\d+").b(strB)) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strB);
        Intrinsics.checkNotNullExpressionValue(numValueOf, "valueOf(header)");
        return numValueOf.intValue();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0139 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x013b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0142  */
    /* JADX WARN: Code duplicated, block: B:109:0x0159  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:92:0x0112  */
    /* JADX WARN: Code duplicated, block: B:96:0x0125  */
    public final Y a(e0 response, D.d dVar) throws ProtocolException {
        U u6;
        String strB;
        Y y8;
        J url;
        X xB;
        boolean z3;
        c0 c0Var;
        e0 e0Var;
        n nVar;
        i0 i0Var = (dVar == null || (nVar = (n) dVar.f1583g) == null) ? null : nVar.f3462b;
        int i7 = response.f40731d;
        Y y10 = response.f40728a;
        String method = y10.f40686b;
        if (i7 == 307 || i7 == 308) {
            u6 = this.f3947a;
            if (u6.f40660i && (strB = response.b(HttpHeaders.LOCATION, null)) != null) {
                y8 = response.f40728a;
                url = y8.f40685a.j(strB);
                if (url != null) {
                    if (!Intrinsics.c(url.f40579a, y8.f40685a.f40579a) || u6.f40661j) {
                        xB = y8.b();
                        if (l.A(method)) {
                            Intrinsics.checkNotNullParameter(method, "method");
                            boolean zEquals = method.equals("PROPFIND");
                            int i10 = response.f40731d;
                            z3 = !zEquals || i10 == 308 || i10 == 307;
                            Intrinsics.checkNotNullParameter(method, "method");
                            if (!method.equals("PROPFIND") || i10 == 308 || i10 == 307) {
                                xB.g(method, z3 ? y8.f40688d : null);
                            } else {
                                xB.g("GET", null);
                            }
                            if (!z3) {
                                xB.i(HttpHeaders.TRANSFER_ENCODING);
                                xB.i(HttpHeaders.CONTENT_LENGTH);
                                xB.i(HttpHeaders.CONTENT_TYPE);
                            }
                        }
                        if (!Dg.c.a(y8.f40685a, url)) {
                            xB.i(HttpHeaders.AUTHORIZATION);
                        }
                        Intrinsics.checkNotNullParameter(url, "url");
                        xB.f40680a = url;
                        return xB.b();
                    }
                }
            }
        } else {
            if (i7 == 401) {
                this.f3947a.f40659g.getClass();
                Intrinsics.checkNotNullParameter(response, "response");
                return null;
            }
            if (i7 == 421) {
                c0 c0Var2 = y10.f40688d;
                if ((c0Var2 == null || !c0Var2.isOneShot()) && dVar != null && !Intrinsics.c(((Gg.e) dVar.f1581e).f3423b.f40702i.f40582d, ((n) dVar.f1583g).f3462b.f40761a.f40702i.f40582d)) {
                    n nVar2 = (n) dVar.f1583g;
                    synchronized (nVar2) {
                        nVar2.f3471k = true;
                    }
                    return response.f40728a;
                }
            } else if (i7 == 503) {
                e0 e0Var2 = response.f40737o;
                if ((e0Var2 == null || e0Var2.f40731d != 503) && c(response, Integer.MAX_VALUE) == 0) {
                    return response.f40728a;
                }
            } else {
                if (i7 == 407) {
                    Intrinsics.e(i0Var);
                    if (i0Var.f40762b.type() != Proxy.Type.HTTP) {
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    }
                    this.f3947a.f40643A.getClass();
                    Intrinsics.checkNotNullParameter(response, "response");
                    return null;
                }
                if (i7 != 408) {
                    switch (i7) {
                        case 300:
                        case 301:
                        case 302:
                        case 303:
                            u6 = this.f3947a;
                            if (u6.f40660i) {
                                y8 = response.f40728a;
                                url = y8.f40685a.j(strB);
                                if (url != null) {
                                    if (!Intrinsics.c(url.f40579a, y8.f40685a.f40579a)) {
                                        break;
                                    }
                                    xB = y8.b();
                                    if (l.A(method)) {
                                        Intrinsics.checkNotNullParameter(method, "method");
                                        boolean zEquals2 = method.equals("PROPFIND");
                                        int i11 = response.f40731d;
                                        if (zEquals2) {
                                        }
                                        Intrinsics.checkNotNullParameter(method, "method");
                                        if (method.equals("PROPFIND")) {
                                            xB.g(method, z3 ? y8.f40688d : null);
                                        } else {
                                            xB.g(method, z3 ? y8.f40688d : null);
                                        }
                                        if (!z3) {
                                            xB.i(HttpHeaders.TRANSFER_ENCODING);
                                            xB.i(HttpHeaders.CONTENT_LENGTH);
                                            xB.i(HttpHeaders.CONTENT_TYPE);
                                        }
                                    }
                                    if (!Dg.c.a(y8.f40685a, url)) {
                                        xB.i(HttpHeaders.AUTHORIZATION);
                                    }
                                    Intrinsics.checkNotNullParameter(url, "url");
                                    xB.f40680a = url;
                                    return xB.b();
                                }
                            }
                        default:
                            return null;
                    }
                } else if (this.f3947a.f40658f && (((c0Var = y10.f40688d) == null || !c0Var.isOneShot()) && (((e0Var = response.f40737o) == null || e0Var.f40731d != 408) && c(response, 0) <= 0))) {
                    return response.f40728a;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0051  */
    /* JADX WARN: Code duplicated, block: B:40:0x0056  */
    /* JADX WARN: Code duplicated, block: B:42:0x0059  */
    /* JADX WARN: Code duplicated, block: B:53:0x006e A[ADDED_TO_REGION, DONT_GENERATE, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:55:0x0070 A[Catch: all -> 0x0086, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:51:0x006a, B:55:0x0070, B:59:0x0082), top: B:80:0x006a }] */
    /* JADX WARN: Code duplicated, block: B:66:0x008b  */
    /* JADX WARN: Code duplicated, block: B:67:0x008d  */
    /* JADX WARN: Code duplicated, block: B:68:0x008f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0093  */
    /* JADX WARN: Code duplicated, block: B:73:0x009a  */
    /* JADX WARN: Code duplicated, block: B:79:0x00a6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:80:0x006a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final boolean b(IOException iOException, Gg.i iVar, Y y8, boolean z3) {
        Gg.e eVar;
        int i7;
        boolean zA;
        i0 i0Var;
        C4.a aVar;
        s sVar;
        n nVar;
        c0 c0Var;
        if (!this.f3947a.f40658f || ((z3 && (((c0Var = y8.f40688d) != null && c0Var.isOneShot()) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException))) {
            return false;
        }
        if (!(iOException instanceof InterruptedIOException)) {
            if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
                return false;
            }
            eVar = iVar.f3449j;
            Intrinsics.e(eVar);
            i7 = eVar.f3428g;
            if (i7 != 0) {
                if (eVar.f3431j != null) {
                    zA = true;
                } else {
                    i0Var = null;
                    if (i7 <= 1) {
                        synchronized (nVar) {
                            if (nVar.f3472l != 0) {
                                i0Var = nVar.f3462b;
                            }
                        }
                    }
                    if (i0Var != null) {
                        eVar.f3431j = i0Var;
                    } else {
                        aVar = eVar.f3426e;
                        zA = aVar != null ? sVar.a() : sVar.a();
                    }
                    zA = true;
                }
            } else if (eVar.f3431j != null) {
                zA = true;
            } else {
                i0Var = null;
                if (i7 <= 1) {
                    synchronized (nVar) {
                        if (nVar.f3472l != 0) {
                            i0Var = nVar.f3462b;
                        }
                    }
                }
                if (i0Var != null) {
                    eVar.f3431j = i0Var;
                } else {
                    aVar = eVar.f3426e;
                    if (aVar != null) {
                    }
                }
                zA = true;
            }
            if (!zA) {
                return true;
            }
        } else if ((iOException instanceof SocketTimeoutException) && !z3) {
            eVar = iVar.f3449j;
            Intrinsics.e(eVar);
            i7 = eVar.f3428g;
            if (i7 != 0 && eVar.f3429h == 0 && eVar.f3430i == 0) {
                zA = false;
            } else if (eVar.f3431j != null) {
                zA = true;
            } else {
                i0Var = null;
                if (i7 <= 1 && eVar.f3429h <= 1 && eVar.f3430i <= 0 && (nVar = eVar.f3424c.f3450o) != null) {
                    synchronized (nVar) {
                        if (nVar.f3472l != 0 && Dg.c.a(nVar.f3462b.f40761a.f40702i, eVar.f3423b.f40702i)) {
                            i0Var = nVar.f3462b;
                        }
                    }
                }
                if (i0Var != null) {
                    eVar.f3431j = i0Var;
                } else {
                    aVar = eVar.f3426e;
                    if ((aVar != null || !aVar.c()) && (sVar = eVar.f3427f) != null) {
                    }
                }
                zA = true;
            }
            if (!zA) {
                return true;
            }
        }
        return false;
    }

    @Override // okhttp3.Interceptor
    public final e0 intercept(Interceptor.Chain chain) {
        e0 e0VarProceed;
        SSLSocketFactory sSLSocketFactory;
        Mg.f fVar;
        C1945m c1945m;
        Intrinsics.checkNotNullParameter(chain, "chain");
        f fVar2 = (f) chain;
        Y y8 = fVar2.f3938e;
        Gg.i iVar = fVar2.f3934a;
        List suppressed = z.f38935a;
        e0 e0Var = null;
        int i7 = 0;
        Y request = y8;
        while (true) {
            boolean z3 = true;
            while (true) {
                iVar.getClass();
                Intrinsics.checkNotNullParameter(request, "request");
                if (iVar.t != null) {
                    throw new IllegalStateException("Check failed.");
                }
                synchronized (iVar) {
                    if (iVar.f3453w) {
                        throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                    }
                    if (iVar.f3452v) {
                        throw new IllegalStateException("Check failed.");
                    }
                    Unit unit = Unit.f38893a;
                }
                if (z3) {
                    p pVar = iVar.f3444d;
                    J j6 = request.f40685a;
                    boolean z8 = j6.f40588j;
                    U u6 = iVar.f3441a;
                    if (z8) {
                        SSLSocketFactory sSLSocketFactory2 = u6.f40645C;
                        if (sSLSocketFactory2 == null) {
                            throw new IllegalStateException("CLEARTEXT-only client");
                        }
                        Mg.f fVar3 = u6.f40649Q;
                        c1945m = u6.f40650X;
                        sSLSocketFactory = sSLSocketFactory2;
                        fVar = fVar3;
                    } else {
                        sSLSocketFactory = null;
                        fVar = null;
                        c1945m = null;
                    }
                    iVar.f3449j = new Gg.e(pVar, new C1921a(j6.f40582d, j6.f40583e, u6.t, u6.f40644B, sSLSocketFactory, fVar, c1945m, u6.f40643A, u6.f40669v, u6.f40648M, u6.f40647L, u6.f40670w), iVar, iVar.f3445e);
                }
                try {
                    if (iVar.f3438B) {
                        throw new IOException("Canceled");
                    }
                    try {
                        e0VarProceed = fVar2.proceed(request);
                    } catch (q e10) {
                        if (!b(e10.f3484b, iVar, request, false)) {
                            IOException iOException = e10.f3483a;
                            Intrinsics.checkNotNullParameter(iOException, "<this>");
                            Intrinsics.checkNotNullParameter(suppressed, "suppressed");
                            Iterator it = suppressed.iterator();
                            while (it.hasNext()) {
                                C2126e.a(iOException, (Exception) it.next());
                            }
                            throw iOException;
                        }
                        suppressed = CollectionsKt.Q(suppressed, e10.f3483a);
                        iVar.d(true);
                        z3 = false;
                    } catch (IOException e11) {
                        if (!b(e11, iVar, request, !(e11 instanceof C1930a))) {
                            Intrinsics.checkNotNullParameter(e11, "<this>");
                            Intrinsics.checkNotNullParameter(suppressed, "suppressed");
                            Iterator it2 = suppressed.iterator();
                            while (it2.hasNext()) {
                                C2126e.a(e11, (Exception) it2.next());
                            }
                            throw e11;
                        }
                        suppressed = CollectionsKt.Q(suppressed, e11);
                        iVar.d(true);
                        z3 = false;
                    }
                } catch (Throwable th) {
                    iVar.d(true);
                    throw th;
                }
            }
            if (e0Var != null) {
                d0 d0VarC = e0VarProceed.c();
                d0 d0VarC2 = e0Var.c();
                d0VarC2.f40721g = null;
                e0 e0VarA = d0VarC2.a();
                if (e0VarA.f40734g != null) {
                    throw new IllegalArgumentException("priorResponse.body != null");
                }
                d0VarC.f40724j = e0VarA;
                e0VarProceed = d0VarC.a();
            }
            e0Var = e0VarProceed;
            D.d dVar = iVar.t;
            request = a(e0Var, dVar);
            if (request == null) {
                if (dVar != null && dVar.f1577a) {
                    if (iVar.f3451p) {
                        throw new IllegalStateException("Check failed.");
                    }
                    iVar.f3451p = true;
                    iVar.f3446f.exit();
                }
                iVar.d(false);
                return e0Var;
            }
            c0 c0Var = request.f40688d;
            if (c0Var != null && c0Var.isOneShot()) {
                iVar.d(false);
                return e0Var;
            }
            h0 h0Var = e0Var.f40734g;
            if (h0Var != null) {
                Dg.c.c(h0Var);
            }
            i7++;
            if (i7 > 20) {
                throw new ProtocolException("Too many follow-up requests: " + i7);
            }
            iVar.d(true);
        }
    }
}

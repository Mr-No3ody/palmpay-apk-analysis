package Hg;

import Gg.n;
import Pg.AbstractC0555b;
import Pg.w;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.AbstractC1956y;
import okhttp3.Interceptor;
import okhttp3.Y;
import okhttp3.c0;
import okhttp3.d0;
import okhttp3.e0;
import okhttp3.h0;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http2.C1930a;
import p355xf.C2126e;
import p377z5.l;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3928a;

    public b(boolean z3) {
        this.f3928a = z3;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0176  */
    /* JADX WARN: Code duplicated, block: B:105:0x018a A[Catch: IOException -> 0x0187, TryCatch #7 {IOException -> 0x0187, blocks: (B:98:0x0172, B:102:0x017a, B:106:0x0198, B:108:0x01a4, B:112:0x01b1, B:117:0x01c0, B:119:0x01c4, B:123:0x01d1, B:125:0x01e4, B:127:0x01ee, B:128:0x01f8, B:105:0x018a), top: B:149:0x0172 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x01a4 A[Catch: IOException -> 0x0187, TryCatch #7 {IOException -> 0x0187, blocks: (B:98:0x0172, B:102:0x017a, B:106:0x0198, B:108:0x01a4, B:112:0x01b1, B:117:0x01c0, B:119:0x01c4, B:123:0x01d1, B:125:0x01e4, B:127:0x01ee, B:128:0x01f8, B:105:0x018a), top: B:149:0x0172 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x01af  */
    /* JADX WARN: Code duplicated, block: B:111:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:115:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:117:0x01c0 A[Catch: IOException -> 0x0187, TryCatch #7 {IOException -> 0x0187, blocks: (B:98:0x0172, B:102:0x017a, B:106:0x0198, B:108:0x01a4, B:112:0x01b1, B:117:0x01c0, B:119:0x01c4, B:123:0x01d1, B:125:0x01e4, B:127:0x01ee, B:128:0x01f8, B:105:0x018a), top: B:149:0x0172 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x01c4 A[Catch: IOException -> 0x0187, TryCatch #7 {IOException -> 0x0187, blocks: (B:98:0x0172, B:102:0x017a, B:106:0x0198, B:108:0x01a4, B:112:0x01b1, B:117:0x01c0, B:119:0x01c4, B:123:0x01d1, B:125:0x01e4, B:127:0x01ee, B:128:0x01f8, B:105:0x018a), top: B:149:0x0172 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:123:0x01d1 A[Catch: IOException -> 0x0187, TryCatch #7 {IOException -> 0x0187, blocks: (B:98:0x0172, B:102:0x017a, B:106:0x0198, B:108:0x01a4, B:112:0x01b1, B:117:0x01c0, B:119:0x01c4, B:123:0x01d1, B:125:0x01e4, B:127:0x01ee, B:128:0x01f8, B:105:0x018a), top: B:149:0x0172 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x01e4 A[Catch: IOException -> 0x0187, TryCatch #7 {IOException -> 0x0187, blocks: (B:98:0x0172, B:102:0x017a, B:106:0x0198, B:108:0x01a4, B:112:0x01b1, B:117:0x01c0, B:119:0x01c4, B:123:0x01d1, B:125:0x01e4, B:127:0x01ee, B:128:0x01f8, B:105:0x018a), top: B:149:0x0172 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:131:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:133:0x0200  */
    /* JADX WARN: Code duplicated, block: B:134:0x0201  */
    /* JADX WARN: Code duplicated, block: B:136:0x0204  */
    /* JADX WARN: Code duplicated, block: B:145:0x00e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0102  */
    /* JADX WARN: Code duplicated, block: B:75:0x0106  */
    /* JADX WARN: Code duplicated, block: B:77:0x0109  */
    /* JADX WARN: Code duplicated, block: B:80:0x0113 A[Catch: IOException -> 0x011c, TryCatch #12 {IOException -> 0x011c, blocks: (B:78:0x010a, B:80:0x0113, B:84:0x011e, B:92:0x0145, B:94:0x014e, B:95:0x0151, B:96:0x0168), top: B:158:0x010a }] */
    /* JADX WARN: Code duplicated, block: B:86:0x013a  */
    /* JADX WARN: Code duplicated, block: B:87:0x013c  */
    /* JADX WARN: Code duplicated, block: B:94:0x014e A[Catch: IOException -> 0x011c, TryCatch #12 {IOException -> 0x011c, blocks: (B:78:0x010a, B:80:0x0113, B:84:0x011e, B:92:0x0145, B:94:0x014e, B:95:0x0151, B:96:0x0168), top: B:158:0x010a }] */
    @Override // okhttp3.Interceptor
    public final e0 intercept(Interceptor.Chain chain) throws IOException {
        d0 d0VarE;
        ExchangeCodec exchangeCodec;
        IOException iOException;
        boolean z3;
        e0 response;
        int i7;
        e0 e0VarA;
        Long l5;
        h0 h0Var;
        long jContentLength;
        h0 h0Var2;
        Long lValueOf;
        boolean z8;
        d0 d0Var;
        Intrinsics.checkNotNullParameter(chain, "chain");
        f fVar = (f) chain;
        D.d dVar = fVar.f3937d;
        Intrinsics.e(dVar);
        AbstractC1956y abstractC1956y = (AbstractC1956y) dVar.f1580d;
        Gg.i iVar = (Gg.i) dVar.f1579c;
        ExchangeCodec exchangeCodec2 = (ExchangeCodec) dVar.f1582f;
        n nVar = (n) dVar.f1583g;
        Y request = fVar.f3938e;
        c0 c0Var = request.f40688d;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z10 = true;
        try {
            Intrinsics.checkNotNullParameter(request, "request");
            try {
                try {
                    abstractC1956y.requestHeadersStart(iVar);
                    exchangeCodec2.writeRequestHeaders(request);
                    abstractC1956y.requestHeadersEnd(iVar, request);
                    try {
                        try {
                            if (l.A(request.f40686b) && c0Var != null) {
                                if ("100-continue".equalsIgnoreCase(request.a(HttpHeaders.EXPECT))) {
                                    try {
                                        exchangeCodec2.flushRequest();
                                        d0VarE = dVar.e(true);
                                        try {
                                            abstractC1956y.responseHeadersStart(iVar);
                                            z8 = false;
                                        } catch (IOException e10) {
                                            e = e10;
                                            exchangeCodec = exchangeCodec2;
                                            if (!(e instanceof C1930a)) {
                                                throw e;
                                            }
                                            if (dVar.f1578b) {
                                                throw e;
                                            }
                                            iOException = e;
                                            if (d0VarE == null) {
                                                try {
                                                    d0VarE = dVar.e(false);
                                                    Intrinsics.e(d0VarE);
                                                    if (z10) {
                                                        abstractC1956y.responseHeadersStart(iVar);
                                                        z10 = false;
                                                    }
                                                } catch (IOException e11) {
                                                    e = e11;
                                                    if (iOException != null) {
                                                        throw e;
                                                    }
                                                    C2126e.a(iOException, e);
                                                    throw iOException;
                                                }
                                            }
                                            Intrinsics.checkNotNullParameter(request, "request");
                                            d0VarE.f40715a = request;
                                            d0VarE.f40719e = nVar.f3465e;
                                            d0VarE.f40725k = jCurrentTimeMillis;
                                            z3 = z10;
                                            d0VarE.f40726l = System.currentTimeMillis();
                                            response = d0VarE.a();
                                            i7 = response.f40731d;
                                            if (i7 != 100) {
                                                d0 d0VarE2 = dVar.e(false);
                                                Intrinsics.e(d0VarE2);
                                                if (z3) {
                                                    abstractC1956y.responseHeadersStart(iVar);
                                                }
                                                Intrinsics.checkNotNullParameter(request, "request");
                                                d0VarE2.f40715a = request;
                                                d0VarE2.f40719e = nVar.f3465e;
                                                d0VarE2.f40725k = jCurrentTimeMillis;
                                                d0VarE2.f40726l = System.currentTimeMillis();
                                                response = d0VarE2.a();
                                                i7 = response.f40731d;
                                            } else {
                                                d0 d0VarE3 = dVar.e(false);
                                                Intrinsics.e(d0VarE3);
                                                if (z3) {
                                                    abstractC1956y.responseHeadersStart(iVar);
                                                }
                                                Intrinsics.checkNotNullParameter(request, "request");
                                                d0VarE3.f40715a = request;
                                                d0VarE3.f40719e = nVar.f3465e;
                                                d0VarE3.f40725k = jCurrentTimeMillis;
                                                d0VarE3.f40726l = System.currentTimeMillis();
                                                response = d0VarE3.a();
                                                i7 = response.f40731d;
                                            }
                                            Intrinsics.checkNotNullParameter(response, "response");
                                            abstractC1956y.responseHeadersEnd(iVar, response);
                                            if (this.f3928a) {
                                                d0 d0VarC = response.c();
                                                d0VarC.f40721g = dVar.d(response);
                                                e0VarA = d0VarC.a();
                                            } else {
                                                d0 d0VarC2 = response.c();
                                                d0VarC2.f40721g = dVar.d(response);
                                                e0VarA = d0VarC2.a();
                                            }
                                            if (!"close".equalsIgnoreCase(e0VarA.f40728a.a("Connection"))) {
                                                l5 = null;
                                                if ("close".equalsIgnoreCase(e0VarA.b("Connection", null))) {
                                                }
                                                if (i7 != 204) {
                                                    h0Var = e0VarA.f40734g;
                                                    if (h0Var != null) {
                                                        jContentLength = h0Var.contentLength();
                                                    } else {
                                                        jContentLength = -1;
                                                    }
                                                    if (jContentLength > 0) {
                                                        StringBuilder sb2 = new StringBuilder("HTTP ");
                                                        sb2.append(i7);
                                                        sb2.append(" had non-zero Content-Length: ");
                                                        h0Var2 = e0VarA.f40734g;
                                                        if (h0Var2 != null) {
                                                            lValueOf = Long.valueOf(h0Var2.contentLength());
                                                        } else {
                                                            lValueOf = l5;
                                                        }
                                                        sb2.append(lValueOf);
                                                        throw new ProtocolException(sb2.toString());
                                                    }
                                                } else {
                                                    h0Var = e0VarA.f40734g;
                                                    if (h0Var != null) {
                                                        jContentLength = h0Var.contentLength();
                                                    } else {
                                                        jContentLength = -1;
                                                    }
                                                    if (jContentLength > 0) {
                                                        StringBuilder sb3 = new StringBuilder("HTTP ");
                                                        sb3.append(i7);
                                                        sb3.append(" had non-zero Content-Length: ");
                                                        h0Var2 = e0VarA.f40734g;
                                                        if (h0Var2 != null) {
                                                            lValueOf = Long.valueOf(h0Var2.contentLength());
                                                        } else {
                                                            lValueOf = l5;
                                                        }
                                                        sb3.append(lValueOf);
                                                        throw new ProtocolException(sb3.toString());
                                                    }
                                                }
                                                return e0VarA;
                                            }
                                            l5 = null;
                                            exchangeCodec.getConnection().k();
                                            if (i7 != 204) {
                                                h0Var = e0VarA.f40734g;
                                                if (h0Var != null) {
                                                    jContentLength = h0Var.contentLength();
                                                } else {
                                                    jContentLength = -1;
                                                }
                                                if (jContentLength > 0) {
                                                    StringBuilder sb4 = new StringBuilder("HTTP ");
                                                    sb4.append(i7);
                                                    sb4.append(" had non-zero Content-Length: ");
                                                    h0Var2 = e0VarA.f40734g;
                                                    if (h0Var2 != null) {
                                                        lValueOf = Long.valueOf(h0Var2.contentLength());
                                                    } else {
                                                        lValueOf = l5;
                                                    }
                                                    sb4.append(lValueOf);
                                                    throw new ProtocolException(sb4.toString());
                                                }
                                            } else {
                                                h0Var = e0VarA.f40734g;
                                                if (h0Var != null) {
                                                    jContentLength = h0Var.contentLength();
                                                } else {
                                                    jContentLength = -1;
                                                }
                                                if (jContentLength > 0) {
                                                    StringBuilder sb5 = new StringBuilder("HTTP ");
                                                    sb5.append(i7);
                                                    sb5.append(" had non-zero Content-Length: ");
                                                    h0Var2 = e0VarA.f40734g;
                                                    if (h0Var2 != null) {
                                                        lValueOf = Long.valueOf(h0Var2.contentLength());
                                                    } else {
                                                        lValueOf = l5;
                                                    }
                                                    sb5.append(lValueOf);
                                                    throw new ProtocolException(sb5.toString());
                                                }
                                            }
                                            return e0VarA;
                                        }
                                    } catch (IOException e12) {
                                        abstractC1956y.requestFailed(iVar, e12);
                                        dVar.f(e12);
                                        throw e12;
                                    }
                                } else {
                                    z8 = true;
                                    d0VarE = null;
                                }
                                if (d0VarE == null) {
                                    try {
                                        if (c0Var.isDuplex()) {
                                            try {
                                                exchangeCodec2.flushRequest();
                                                c0Var.writeTo(AbstractC0555b.b(dVar.b(request, true)));
                                            } catch (IOException e13) {
                                                abstractC1956y.requestFailed(iVar, e13);
                                                dVar.f(e13);
                                                throw e13;
                                            }
                                        } else {
                                            w wVarB = AbstractC0555b.b(dVar.b(request, false));
                                            c0Var.writeTo(wVarB);
                                            wVarB.close();
                                        }
                                        exchangeCodec = exchangeCodec2;
                                        d0Var = d0VarE;
                                        z10 = z8;
                                        d0VarE = d0Var;
                                    } catch (IOException e14) {
                                        e = e14;
                                        exchangeCodec = exchangeCodec2;
                                        z10 = z8;
                                        if (!(e instanceof C1930a)) {
                                            throw e;
                                        }
                                        if (dVar.f1578b) {
                                            throw e;
                                        }
                                        iOException = e;
                                        if (d0VarE == null) {
                                            d0VarE = dVar.e(false);
                                            Intrinsics.e(d0VarE);
                                            if (z10) {
                                                abstractC1956y.responseHeadersStart(iVar);
                                                z10 = false;
                                            }
                                        }
                                        Intrinsics.checkNotNullParameter(request, "request");
                                        d0VarE.f40715a = request;
                                        d0VarE.f40719e = nVar.f3465e;
                                        d0VarE.f40725k = jCurrentTimeMillis;
                                        z3 = z10;
                                        d0VarE.f40726l = System.currentTimeMillis();
                                        response = d0VarE.a();
                                        i7 = response.f40731d;
                                        if (i7 != 100) {
                                            d0 d0VarE4 = dVar.e(false);
                                            Intrinsics.e(d0VarE4);
                                            if (z3) {
                                                abstractC1956y.responseHeadersStart(iVar);
                                            }
                                            Intrinsics.checkNotNullParameter(request, "request");
                                            d0VarE4.f40715a = request;
                                            d0VarE4.f40719e = nVar.f3465e;
                                            d0VarE4.f40725k = jCurrentTimeMillis;
                                            d0VarE4.f40726l = System.currentTimeMillis();
                                            response = d0VarE4.a();
                                            i7 = response.f40731d;
                                        } else {
                                            d0 d0VarE5 = dVar.e(false);
                                            Intrinsics.e(d0VarE5);
                                            if (z3) {
                                                abstractC1956y.responseHeadersStart(iVar);
                                            }
                                            Intrinsics.checkNotNullParameter(request, "request");
                                            d0VarE5.f40715a = request;
                                            d0VarE5.f40719e = nVar.f3465e;
                                            d0VarE5.f40725k = jCurrentTimeMillis;
                                            d0VarE5.f40726l = System.currentTimeMillis();
                                            response = d0VarE5.a();
                                            i7 = response.f40731d;
                                        }
                                        Intrinsics.checkNotNullParameter(response, "response");
                                        abstractC1956y.responseHeadersEnd(iVar, response);
                                        if (this.f3928a) {
                                            d0 d0VarC3 = response.c();
                                            d0VarC3.f40721g = dVar.d(response);
                                            e0VarA = d0VarC3.a();
                                        } else {
                                            d0 d0VarC4 = response.c();
                                            d0VarC4.f40721g = dVar.d(response);
                                            e0VarA = d0VarC4.a();
                                        }
                                        if (!"close".equalsIgnoreCase(e0VarA.f40728a.a("Connection"))) {
                                            l5 = null;
                                            if ("close".equalsIgnoreCase(e0VarA.b("Connection", null))) {
                                            }
                                            if (i7 != 204) {
                                                h0Var = e0VarA.f40734g;
                                                if (h0Var != null) {
                                                    jContentLength = h0Var.contentLength();
                                                } else {
                                                    jContentLength = -1;
                                                }
                                                if (jContentLength > 0) {
                                                    StringBuilder sb6 = new StringBuilder("HTTP ");
                                                    sb6.append(i7);
                                                    sb6.append(" had non-zero Content-Length: ");
                                                    h0Var2 = e0VarA.f40734g;
                                                    if (h0Var2 != null) {
                                                        lValueOf = Long.valueOf(h0Var2.contentLength());
                                                    } else {
                                                        lValueOf = l5;
                                                    }
                                                    sb6.append(lValueOf);
                                                    throw new ProtocolException(sb6.toString());
                                                }
                                            } else {
                                                h0Var = e0VarA.f40734g;
                                                if (h0Var != null) {
                                                    jContentLength = h0Var.contentLength();
                                                } else {
                                                    jContentLength = -1;
                                                }
                                                if (jContentLength > 0) {
                                                    StringBuilder sb7 = new StringBuilder("HTTP ");
                                                    sb7.append(i7);
                                                    sb7.append(" had non-zero Content-Length: ");
                                                    h0Var2 = e0VarA.f40734g;
                                                    if (h0Var2 != null) {
                                                        lValueOf = Long.valueOf(h0Var2.contentLength());
                                                    } else {
                                                        lValueOf = l5;
                                                    }
                                                    sb7.append(lValueOf);
                                                    throw new ProtocolException(sb7.toString());
                                                }
                                            }
                                            return e0VarA;
                                        }
                                        l5 = null;
                                        exchangeCodec.getConnection().k();
                                        if (i7 != 204) {
                                            h0Var = e0VarA.f40734g;
                                            if (h0Var != null) {
                                                jContentLength = h0Var.contentLength();
                                            } else {
                                                jContentLength = -1;
                                            }
                                            if (jContentLength > 0) {
                                                StringBuilder sb8 = new StringBuilder("HTTP ");
                                                sb8.append(i7);
                                                sb8.append(" had non-zero Content-Length: ");
                                                h0Var2 = e0VarA.f40734g;
                                                if (h0Var2 != null) {
                                                    lValueOf = Long.valueOf(h0Var2.contentLength());
                                                } else {
                                                    lValueOf = l5;
                                                }
                                                sb8.append(lValueOf);
                                                throw new ProtocolException(sb8.toString());
                                            }
                                        } else {
                                            h0Var = e0VarA.f40734g;
                                            if (h0Var != null) {
                                                jContentLength = h0Var.contentLength();
                                            } else {
                                                jContentLength = -1;
                                            }
                                            if (jContentLength > 0) {
                                                StringBuilder sb9 = new StringBuilder("HTTP ");
                                                sb9.append(i7);
                                                sb9.append(" had non-zero Content-Length: ");
                                                h0Var2 = e0VarA.f40734g;
                                                if (h0Var2 != null) {
                                                    lValueOf = Long.valueOf(h0Var2.contentLength());
                                                } else {
                                                    lValueOf = l5;
                                                }
                                                sb9.append(lValueOf);
                                                throw new ProtocolException(sb9.toString());
                                            }
                                        }
                                        return e0VarA;
                                    }
                                } else {
                                    exchangeCodec = exchangeCodec2;
                                    d0Var = d0VarE;
                                    try {
                                        iVar.f(dVar, true, false, null);
                                        if (nVar.f3467g == null) {
                                            z10 = false;
                                        }
                                        if (!z10) {
                                            exchangeCodec.getConnection().k();
                                        }
                                        z10 = z8;
                                        d0VarE = d0Var;
                                    } catch (IOException e15) {
                                        e = e15;
                                        z10 = z8;
                                        d0VarE = d0Var;
                                        if (!(e instanceof C1930a)) {
                                            throw e;
                                        }
                                        if (dVar.f1578b) {
                                            throw e;
                                        }
                                        iOException = e;
                                        if (d0VarE == null) {
                                            d0VarE = dVar.e(false);
                                            Intrinsics.e(d0VarE);
                                            if (z10) {
                                                abstractC1956y.responseHeadersStart(iVar);
                                                z10 = false;
                                            }
                                        }
                                        Intrinsics.checkNotNullParameter(request, "request");
                                        d0VarE.f40715a = request;
                                        d0VarE.f40719e = nVar.f3465e;
                                        d0VarE.f40725k = jCurrentTimeMillis;
                                        z3 = z10;
                                        d0VarE.f40726l = System.currentTimeMillis();
                                        response = d0VarE.a();
                                        i7 = response.f40731d;
                                        if (i7 != 100) {
                                            d0 d0VarE6 = dVar.e(false);
                                            Intrinsics.e(d0VarE6);
                                            if (z3) {
                                                abstractC1956y.responseHeadersStart(iVar);
                                            }
                                            Intrinsics.checkNotNullParameter(request, "request");
                                            d0VarE6.f40715a = request;
                                            d0VarE6.f40719e = nVar.f3465e;
                                            d0VarE6.f40725k = jCurrentTimeMillis;
                                            d0VarE6.f40726l = System.currentTimeMillis();
                                            response = d0VarE6.a();
                                            i7 = response.f40731d;
                                        } else {
                                            d0 d0VarE7 = dVar.e(false);
                                            Intrinsics.e(d0VarE7);
                                            if (z3) {
                                                abstractC1956y.responseHeadersStart(iVar);
                                            }
                                            Intrinsics.checkNotNullParameter(request, "request");
                                            d0VarE7.f40715a = request;
                                            d0VarE7.f40719e = nVar.f3465e;
                                            d0VarE7.f40725k = jCurrentTimeMillis;
                                            d0VarE7.f40726l = System.currentTimeMillis();
                                            response = d0VarE7.a();
                                            i7 = response.f40731d;
                                        }
                                        Intrinsics.checkNotNullParameter(response, "response");
                                        abstractC1956y.responseHeadersEnd(iVar, response);
                                        if (this.f3928a) {
                                            d0 d0VarC5 = response.c();
                                            d0VarC5.f40721g = dVar.d(response);
                                            e0VarA = d0VarC5.a();
                                        } else {
                                            d0 d0VarC6 = response.c();
                                            d0VarC6.f40721g = dVar.d(response);
                                            e0VarA = d0VarC6.a();
                                        }
                                        if (!"close".equalsIgnoreCase(e0VarA.f40728a.a("Connection"))) {
                                            l5 = null;
                                            if ("close".equalsIgnoreCase(e0VarA.b("Connection", null))) {
                                            }
                                            if (i7 != 204) {
                                                h0Var = e0VarA.f40734g;
                                                if (h0Var != null) {
                                                    jContentLength = h0Var.contentLength();
                                                } else {
                                                    jContentLength = -1;
                                                }
                                                if (jContentLength > 0) {
                                                    StringBuilder sb10 = new StringBuilder("HTTP ");
                                                    sb10.append(i7);
                                                    sb10.append(" had non-zero Content-Length: ");
                                                    h0Var2 = e0VarA.f40734g;
                                                    if (h0Var2 != null) {
                                                        lValueOf = Long.valueOf(h0Var2.contentLength());
                                                    } else {
                                                        lValueOf = l5;
                                                    }
                                                    sb10.append(lValueOf);
                                                    throw new ProtocolException(sb10.toString());
                                                }
                                            } else {
                                                h0Var = e0VarA.f40734g;
                                                if (h0Var != null) {
                                                    jContentLength = h0Var.contentLength();
                                                } else {
                                                    jContentLength = -1;
                                                }
                                                if (jContentLength > 0) {
                                                    StringBuilder sb11 = new StringBuilder("HTTP ");
                                                    sb11.append(i7);
                                                    sb11.append(" had non-zero Content-Length: ");
                                                    h0Var2 = e0VarA.f40734g;
                                                    if (h0Var2 != null) {
                                                        lValueOf = Long.valueOf(h0Var2.contentLength());
                                                    } else {
                                                        lValueOf = l5;
                                                    }
                                                    sb11.append(lValueOf);
                                                    throw new ProtocolException(sb11.toString());
                                                }
                                            }
                                            return e0VarA;
                                        }
                                        l5 = null;
                                        exchangeCodec.getConnection().k();
                                        if (i7 != 204) {
                                            h0Var = e0VarA.f40734g;
                                            if (h0Var != null) {
                                                jContentLength = h0Var.contentLength();
                                            } else {
                                                jContentLength = -1;
                                            }
                                            if (jContentLength > 0) {
                                                StringBuilder sb12 = new StringBuilder("HTTP ");
                                                sb12.append(i7);
                                                sb12.append(" had non-zero Content-Length: ");
                                                h0Var2 = e0VarA.f40734g;
                                                if (h0Var2 != null) {
                                                    lValueOf = Long.valueOf(h0Var2.contentLength());
                                                } else {
                                                    lValueOf = l5;
                                                }
                                                sb12.append(lValueOf);
                                                throw new ProtocolException(sb12.toString());
                                            }
                                        } else {
                                            h0Var = e0VarA.f40734g;
                                            if (h0Var != null) {
                                                jContentLength = h0Var.contentLength();
                                            } else {
                                                jContentLength = -1;
                                            }
                                            if (jContentLength > 0) {
                                                StringBuilder sb13 = new StringBuilder("HTTP ");
                                                sb13.append(i7);
                                                sb13.append(" had non-zero Content-Length: ");
                                                h0Var2 = e0VarA.f40734g;
                                                if (h0Var2 != null) {
                                                    lValueOf = Long.valueOf(h0Var2.contentLength());
                                                } else {
                                                    lValueOf = l5;
                                                }
                                                sb13.append(lValueOf);
                                                throw new ProtocolException(sb13.toString());
                                            }
                                        }
                                        return e0VarA;
                                    }
                                }
                                if (d0VarE == null) {
                                    d0VarE = dVar.e(false);
                                    Intrinsics.e(d0VarE);
                                    if (z10) {
                                        abstractC1956y.responseHeadersStart(iVar);
                                        z10 = false;
                                    }
                                }
                                Intrinsics.checkNotNullParameter(request, "request");
                                d0VarE.f40715a = request;
                                d0VarE.f40719e = nVar.f3465e;
                                d0VarE.f40725k = jCurrentTimeMillis;
                                z3 = z10;
                                d0VarE.f40726l = System.currentTimeMillis();
                                response = d0VarE.a();
                                i7 = response.f40731d;
                                if (i7 != 100 || (102 <= i7 && i7 < 200)) {
                                    d0 d0VarE8 = dVar.e(false);
                                    Intrinsics.e(d0VarE8);
                                    if (z3) {
                                        abstractC1956y.responseHeadersStart(iVar);
                                    }
                                    Intrinsics.checkNotNullParameter(request, "request");
                                    d0VarE8.f40715a = request;
                                    d0VarE8.f40719e = nVar.f3465e;
                                    d0VarE8.f40725k = jCurrentTimeMillis;
                                    d0VarE8.f40726l = System.currentTimeMillis();
                                    response = d0VarE8.a();
                                    i7 = response.f40731d;
                                }
                                Intrinsics.checkNotNullParameter(response, "response");
                                abstractC1956y.responseHeadersEnd(iVar, response);
                                if (this.f3928a || i7 != 101) {
                                    d0 d0VarC7 = response.c();
                                    d0VarC7.f40721g = dVar.d(response);
                                    e0VarA = d0VarC7.a();
                                } else {
                                    d0 d0VarC8 = response.c();
                                    d0VarC8.f40721g = Dg.c.f1881c;
                                    e0VarA = d0VarC8.a();
                                }
                                if (!"close".equalsIgnoreCase(e0VarA.f40728a.a("Connection"))) {
                                    l5 = null;
                                    if ("close".equalsIgnoreCase(e0VarA.b("Connection", null))) {
                                    }
                                    if (i7 != 204 || i7 == 205) {
                                        h0Var = e0VarA.f40734g;
                                        if (h0Var != null) {
                                            jContentLength = h0Var.contentLength();
                                        } else {
                                            jContentLength = -1;
                                        }
                                        if (jContentLength > 0) {
                                            StringBuilder sb14 = new StringBuilder("HTTP ");
                                            sb14.append(i7);
                                            sb14.append(" had non-zero Content-Length: ");
                                            h0Var2 = e0VarA.f40734g;
                                            if (h0Var2 != null) {
                                                lValueOf = Long.valueOf(h0Var2.contentLength());
                                            } else {
                                                lValueOf = l5;
                                            }
                                            sb14.append(lValueOf);
                                            throw new ProtocolException(sb14.toString());
                                        }
                                    }
                                    return e0VarA;
                                }
                                l5 = null;
                                exchangeCodec.getConnection().k();
                                if (i7 != 204) {
                                    h0Var = e0VarA.f40734g;
                                    if (h0Var != null) {
                                        jContentLength = h0Var.contentLength();
                                    } else {
                                        jContentLength = -1;
                                    }
                                    if (jContentLength > 0) {
                                        StringBuilder sb15 = new StringBuilder("HTTP ");
                                        sb15.append(i7);
                                        sb15.append(" had non-zero Content-Length: ");
                                        h0Var2 = e0VarA.f40734g;
                                        if (h0Var2 != null) {
                                            lValueOf = Long.valueOf(h0Var2.contentLength());
                                        } else {
                                            lValueOf = l5;
                                        }
                                        sb15.append(lValueOf);
                                        throw new ProtocolException(sb15.toString());
                                    }
                                } else {
                                    h0Var = e0VarA.f40734g;
                                    if (h0Var != null) {
                                        jContentLength = h0Var.contentLength();
                                    } else {
                                        jContentLength = -1;
                                    }
                                    if (jContentLength > 0) {
                                        StringBuilder sb16 = new StringBuilder("HTTP ");
                                        sb16.append(i7);
                                        sb16.append(" had non-zero Content-Length: ");
                                        h0Var2 = e0VarA.f40734g;
                                        if (h0Var2 != null) {
                                            lValueOf = Long.valueOf(h0Var2.contentLength());
                                        } else {
                                            lValueOf = l5;
                                        }
                                        sb16.append(lValueOf);
                                        throw new ProtocolException(sb16.toString());
                                    }
                                }
                                return e0VarA;
                            }
                            exchangeCodec = exchangeCodec2;
                            iVar.f(dVar, true, false, null);
                            d0VarE = null;
                            if (c0Var != null) {
                                try {
                                    if (!c0Var.isDuplex()) {
                                        try {
                                            exchangeCodec.finishRequest();
                                        } catch (IOException e16) {
                                            abstractC1956y.requestFailed(iVar, e16);
                                            dVar.f(e16);
                                            throw e16;
                                        }
                                    }
                                    iOException = null;
                                } catch (IOException e17) {
                                    e = e17;
                                    if (!(e instanceof C1930a)) {
                                        throw e;
                                    }
                                    if (dVar.f1578b) {
                                        throw e;
                                    }
                                    iOException = e;
                                }
                            } else {
                                exchangeCodec.finishRequest();
                                iOException = null;
                            }
                        } catch (IOException e18) {
                            e = e18;
                            exchangeCodec = exchangeCodec2;
                            d0VarE = null;
                            if (!(e instanceof C1930a)) {
                                throw e;
                            }
                            if (dVar.f1578b) {
                                throw e;
                            }
                            iOException = e;
                            if (d0VarE == null) {
                                d0VarE = dVar.e(false);
                                Intrinsics.e(d0VarE);
                                if (z10) {
                                    abstractC1956y.responseHeadersStart(iVar);
                                    z10 = false;
                                }
                            }
                            Intrinsics.checkNotNullParameter(request, "request");
                            d0VarE.f40715a = request;
                            d0VarE.f40719e = nVar.f3465e;
                            d0VarE.f40725k = jCurrentTimeMillis;
                            z3 = z10;
                            d0VarE.f40726l = System.currentTimeMillis();
                            response = d0VarE.a();
                            i7 = response.f40731d;
                            if (i7 != 100) {
                                d0 d0VarE9 = dVar.e(false);
                                Intrinsics.e(d0VarE9);
                                if (z3) {
                                    abstractC1956y.responseHeadersStart(iVar);
                                }
                                Intrinsics.checkNotNullParameter(request, "request");
                                d0VarE9.f40715a = request;
                                d0VarE9.f40719e = nVar.f3465e;
                                d0VarE9.f40725k = jCurrentTimeMillis;
                                d0VarE9.f40726l = System.currentTimeMillis();
                                response = d0VarE9.a();
                                i7 = response.f40731d;
                            } else {
                                d0 d0VarE10 = dVar.e(false);
                                Intrinsics.e(d0VarE10);
                                if (z3) {
                                    abstractC1956y.responseHeadersStart(iVar);
                                }
                                Intrinsics.checkNotNullParameter(request, "request");
                                d0VarE10.f40715a = request;
                                d0VarE10.f40719e = nVar.f3465e;
                                d0VarE10.f40725k = jCurrentTimeMillis;
                                d0VarE10.f40726l = System.currentTimeMillis();
                                response = d0VarE10.a();
                                i7 = response.f40731d;
                            }
                            Intrinsics.checkNotNullParameter(response, "response");
                            abstractC1956y.responseHeadersEnd(iVar, response);
                            if (this.f3928a) {
                                d0 d0VarC9 = response.c();
                                d0VarC9.f40721g = dVar.d(response);
                                e0VarA = d0VarC9.a();
                            } else {
                                d0 d0VarC10 = response.c();
                                d0VarC10.f40721g = dVar.d(response);
                                e0VarA = d0VarC10.a();
                            }
                            if (!"close".equalsIgnoreCase(e0VarA.f40728a.a("Connection"))) {
                                l5 = null;
                                if ("close".equalsIgnoreCase(e0VarA.b("Connection", null))) {
                                }
                                if (i7 != 204) {
                                    h0Var = e0VarA.f40734g;
                                    if (h0Var != null) {
                                        jContentLength = h0Var.contentLength();
                                    } else {
                                        jContentLength = -1;
                                    }
                                    if (jContentLength > 0) {
                                        StringBuilder sb17 = new StringBuilder("HTTP ");
                                        sb17.append(i7);
                                        sb17.append(" had non-zero Content-Length: ");
                                        h0Var2 = e0VarA.f40734g;
                                        if (h0Var2 != null) {
                                            lValueOf = Long.valueOf(h0Var2.contentLength());
                                        } else {
                                            lValueOf = l5;
                                        }
                                        sb17.append(lValueOf);
                                        throw new ProtocolException(sb17.toString());
                                    }
                                } else {
                                    h0Var = e0VarA.f40734g;
                                    if (h0Var != null) {
                                        jContentLength = h0Var.contentLength();
                                    } else {
                                        jContentLength = -1;
                                    }
                                    if (jContentLength > 0) {
                                        StringBuilder sb18 = new StringBuilder("HTTP ");
                                        sb18.append(i7);
                                        sb18.append(" had non-zero Content-Length: ");
                                        h0Var2 = e0VarA.f40734g;
                                        if (h0Var2 != null) {
                                            lValueOf = Long.valueOf(h0Var2.contentLength());
                                        } else {
                                            lValueOf = l5;
                                        }
                                        sb18.append(lValueOf);
                                        throw new ProtocolException(sb18.toString());
                                    }
                                }
                                return e0VarA;
                            }
                            l5 = null;
                            exchangeCodec.getConnection().k();
                            if (i7 != 204) {
                                h0Var = e0VarA.f40734g;
                                if (h0Var != null) {
                                    jContentLength = h0Var.contentLength();
                                } else {
                                    jContentLength = -1;
                                }
                                if (jContentLength > 0) {
                                    StringBuilder sb19 = new StringBuilder("HTTP ");
                                    sb19.append(i7);
                                    sb19.append(" had non-zero Content-Length: ");
                                    h0Var2 = e0VarA.f40734g;
                                    if (h0Var2 != null) {
                                        lValueOf = Long.valueOf(h0Var2.contentLength());
                                    } else {
                                        lValueOf = l5;
                                    }
                                    sb19.append(lValueOf);
                                    throw new ProtocolException(sb19.toString());
                                }
                            } else {
                                h0Var = e0VarA.f40734g;
                                if (h0Var != null) {
                                    jContentLength = h0Var.contentLength();
                                } else {
                                    jContentLength = -1;
                                }
                                if (jContentLength > 0) {
                                    StringBuilder sb110 = new StringBuilder("HTTP ");
                                    sb110.append(i7);
                                    sb110.append(" had non-zero Content-Length: ");
                                    h0Var2 = e0VarA.f40734g;
                                    if (h0Var2 != null) {
                                        lValueOf = Long.valueOf(h0Var2.contentLength());
                                    } else {
                                        lValueOf = l5;
                                    }
                                    sb110.append(lValueOf);
                                    throw new ProtocolException(sb110.toString());
                                }
                            }
                            return e0VarA;
                        }
                        if (this.f3928a) {
                            d0 d0VarC11 = response.c();
                            d0VarC11.f40721g = dVar.d(response);
                            e0VarA = d0VarC11.a();
                        } else {
                            d0 d0VarC12 = response.c();
                            d0VarC12.f40721g = dVar.d(response);
                            e0VarA = d0VarC12.a();
                        }
                        if (!"close".equalsIgnoreCase(e0VarA.f40728a.a("Connection"))) {
                            l5 = null;
                            if ("close".equalsIgnoreCase(e0VarA.b("Connection", null))) {
                            }
                            if (i7 != 204) {
                                h0Var = e0VarA.f40734g;
                                if (h0Var != null) {
                                    jContentLength = h0Var.contentLength();
                                } else {
                                    jContentLength = -1;
                                }
                                if (jContentLength > 0) {
                                    StringBuilder sb111 = new StringBuilder("HTTP ");
                                    sb111.append(i7);
                                    sb111.append(" had non-zero Content-Length: ");
                                    h0Var2 = e0VarA.f40734g;
                                    if (h0Var2 != null) {
                                        lValueOf = Long.valueOf(h0Var2.contentLength());
                                    } else {
                                        lValueOf = l5;
                                    }
                                    sb111.append(lValueOf);
                                    throw new ProtocolException(sb111.toString());
                                }
                            } else {
                                h0Var = e0VarA.f40734g;
                                if (h0Var != null) {
                                    jContentLength = h0Var.contentLength();
                                } else {
                                    jContentLength = -1;
                                }
                                if (jContentLength > 0) {
                                    StringBuilder sb112 = new StringBuilder("HTTP ");
                                    sb112.append(i7);
                                    sb112.append(" had non-zero Content-Length: ");
                                    h0Var2 = e0VarA.f40734g;
                                    if (h0Var2 != null) {
                                        lValueOf = Long.valueOf(h0Var2.contentLength());
                                    } else {
                                        lValueOf = l5;
                                    }
                                    sb112.append(lValueOf);
                                    throw new ProtocolException(sb112.toString());
                                }
                            }
                            return e0VarA;
                        }
                        l5 = null;
                        exchangeCodec.getConnection().k();
                        if (i7 != 204) {
                            h0Var = e0VarA.f40734g;
                            if (h0Var != null) {
                                jContentLength = h0Var.contentLength();
                            } else {
                                jContentLength = -1;
                            }
                            if (jContentLength > 0) {
                                StringBuilder sb113 = new StringBuilder("HTTP ");
                                sb113.append(i7);
                                sb113.append(" had non-zero Content-Length: ");
                                h0Var2 = e0VarA.f40734g;
                                if (h0Var2 != null) {
                                    lValueOf = Long.valueOf(h0Var2.contentLength());
                                } else {
                                    lValueOf = l5;
                                }
                                sb113.append(lValueOf);
                                throw new ProtocolException(sb113.toString());
                            }
                        } else {
                            h0Var = e0VarA.f40734g;
                            if (h0Var != null) {
                                jContentLength = h0Var.contentLength();
                            } else {
                                jContentLength = -1;
                            }
                            if (jContentLength > 0) {
                                StringBuilder sb114 = new StringBuilder("HTTP ");
                                sb114.append(i7);
                                sb114.append(" had non-zero Content-Length: ");
                                h0Var2 = e0VarA.f40734g;
                                if (h0Var2 != null) {
                                    lValueOf = Long.valueOf(h0Var2.contentLength());
                                } else {
                                    lValueOf = l5;
                                }
                                sb114.append(lValueOf);
                                throw new ProtocolException(sb114.toString());
                            }
                        }
                        return e0VarA;
                    } catch (IOException e19) {
                        e = e19;
                        if (iOException != null) {
                            throw e;
                        }
                        C2126e.a(iOException, e);
                        throw iOException;
                    }
                } catch (IOException e20) {
                    abstractC1956y.requestFailed(iVar, e20);
                    dVar.f(e20);
                    throw e20;
                }
            } catch (IOException e21) {
                e = e21;
                d0VarE = null;
                if (!(e instanceof C1930a)) {
                    throw e;
                }
                if (dVar.f1578b) {
                    throw e;
                }
                iOException = e;
                if (d0VarE == null) {
                    d0VarE = dVar.e(false);
                    Intrinsics.e(d0VarE);
                    if (z10) {
                        abstractC1956y.responseHeadersStart(iVar);
                        z10 = false;
                    }
                }
                Intrinsics.checkNotNullParameter(request, "request");
                d0VarE.f40715a = request;
                d0VarE.f40719e = nVar.f3465e;
                d0VarE.f40725k = jCurrentTimeMillis;
                z3 = z10;
                d0VarE.f40726l = System.currentTimeMillis();
                response = d0VarE.a();
                i7 = response.f40731d;
                if (i7 != 100) {
                    d0 d0VarE11 = dVar.e(false);
                    Intrinsics.e(d0VarE11);
                    if (z3) {
                        abstractC1956y.responseHeadersStart(iVar);
                    }
                    Intrinsics.checkNotNullParameter(request, "request");
                    d0VarE11.f40715a = request;
                    d0VarE11.f40719e = nVar.f3465e;
                    d0VarE11.f40725k = jCurrentTimeMillis;
                    d0VarE11.f40726l = System.currentTimeMillis();
                    response = d0VarE11.a();
                    i7 = response.f40731d;
                } else {
                    d0 d0VarE12 = dVar.e(false);
                    Intrinsics.e(d0VarE12);
                    if (z3) {
                        abstractC1956y.responseHeadersStart(iVar);
                    }
                    Intrinsics.checkNotNullParameter(request, "request");
                    d0VarE12.f40715a = request;
                    d0VarE12.f40719e = nVar.f3465e;
                    d0VarE12.f40725k = jCurrentTimeMillis;
                    d0VarE12.f40726l = System.currentTimeMillis();
                    response = d0VarE12.a();
                    i7 = response.f40731d;
                }
                Intrinsics.checkNotNullParameter(response, "response");
                abstractC1956y.responseHeadersEnd(iVar, response);
                if (this.f3928a) {
                    d0 d0VarC13 = response.c();
                    d0VarC13.f40721g = dVar.d(response);
                    e0VarA = d0VarC13.a();
                } else {
                    d0 d0VarC14 = response.c();
                    d0VarC14.f40721g = dVar.d(response);
                    e0VarA = d0VarC14.a();
                }
                if (!"close".equalsIgnoreCase(e0VarA.f40728a.a("Connection"))) {
                    l5 = null;
                    if ("close".equalsIgnoreCase(e0VarA.b("Connection", null))) {
                    }
                    if (i7 != 204) {
                        h0Var = e0VarA.f40734g;
                        if (h0Var != null) {
                            jContentLength = h0Var.contentLength();
                        } else {
                            jContentLength = -1;
                        }
                        if (jContentLength > 0) {
                            StringBuilder sb115 = new StringBuilder("HTTP ");
                            sb115.append(i7);
                            sb115.append(" had non-zero Content-Length: ");
                            h0Var2 = e0VarA.f40734g;
                            if (h0Var2 != null) {
                                lValueOf = Long.valueOf(h0Var2.contentLength());
                            } else {
                                lValueOf = l5;
                            }
                            sb115.append(lValueOf);
                            throw new ProtocolException(sb115.toString());
                        }
                    } else {
                        h0Var = e0VarA.f40734g;
                        if (h0Var != null) {
                            jContentLength = h0Var.contentLength();
                        } else {
                            jContentLength = -1;
                        }
                        if (jContentLength > 0) {
                            StringBuilder sb116 = new StringBuilder("HTTP ");
                            sb116.append(i7);
                            sb116.append(" had non-zero Content-Length: ");
                            h0Var2 = e0VarA.f40734g;
                            if (h0Var2 != null) {
                                lValueOf = Long.valueOf(h0Var2.contentLength());
                            } else {
                                lValueOf = l5;
                            }
                            sb116.append(lValueOf);
                            throw new ProtocolException(sb116.toString());
                        }
                    }
                    return e0VarA;
                }
                l5 = null;
                exchangeCodec.getConnection().k();
                if (i7 != 204) {
                    h0Var = e0VarA.f40734g;
                    if (h0Var != null) {
                        jContentLength = h0Var.contentLength();
                    } else {
                        jContentLength = -1;
                    }
                    if (jContentLength > 0) {
                        StringBuilder sb117 = new StringBuilder("HTTP ");
                        sb117.append(i7);
                        sb117.append(" had non-zero Content-Length: ");
                        h0Var2 = e0VarA.f40734g;
                        if (h0Var2 != null) {
                            lValueOf = Long.valueOf(h0Var2.contentLength());
                        } else {
                            lValueOf = l5;
                        }
                        sb117.append(lValueOf);
                        throw new ProtocolException(sb117.toString());
                    }
                } else {
                    h0Var = e0VarA.f40734g;
                    if (h0Var != null) {
                        jContentLength = h0Var.contentLength();
                    } else {
                        jContentLength = -1;
                    }
                    if (jContentLength > 0) {
                        StringBuilder sb118 = new StringBuilder("HTTP ");
                        sb118.append(i7);
                        sb118.append(" had non-zero Content-Length: ");
                        h0Var2 = e0VarA.f40734g;
                        if (h0Var2 != null) {
                            lValueOf = Long.valueOf(h0Var2.contentLength());
                        } else {
                            lValueOf = l5;
                        }
                        sb118.append(lValueOf);
                        throw new ProtocolException(sb118.toString());
                    }
                }
                return e0VarA;
            }
        } catch (IOException e22) {
            e = e22;
        }
        if (d0VarE == null) {
            d0VarE = dVar.e(false);
            Intrinsics.e(d0VarE);
            if (z10) {
                abstractC1956y.responseHeadersStart(iVar);
                z10 = false;
            }
        }
        Intrinsics.checkNotNullParameter(request, "request");
        d0VarE.f40715a = request;
        d0VarE.f40719e = nVar.f3465e;
        d0VarE.f40725k = jCurrentTimeMillis;
        z3 = z10;
        d0VarE.f40726l = System.currentTimeMillis();
        response = d0VarE.a();
        i7 = response.f40731d;
        if (i7 != 100) {
            d0 d0VarE13 = dVar.e(false);
            Intrinsics.e(d0VarE13);
            if (z3) {
                abstractC1956y.responseHeadersStart(iVar);
            }
            Intrinsics.checkNotNullParameter(request, "request");
            d0VarE13.f40715a = request;
            d0VarE13.f40719e = nVar.f3465e;
            d0VarE13.f40725k = jCurrentTimeMillis;
            d0VarE13.f40726l = System.currentTimeMillis();
            response = d0VarE13.a();
            i7 = response.f40731d;
        } else {
            d0 d0VarE14 = dVar.e(false);
            Intrinsics.e(d0VarE14);
            if (z3) {
                abstractC1956y.responseHeadersStart(iVar);
            }
            Intrinsics.checkNotNullParameter(request, "request");
            d0VarE14.f40715a = request;
            d0VarE14.f40719e = nVar.f3465e;
            d0VarE14.f40725k = jCurrentTimeMillis;
            d0VarE14.f40726l = System.currentTimeMillis();
            response = d0VarE14.a();
            i7 = response.f40731d;
        }
        Intrinsics.checkNotNullParameter(response, "response");
        abstractC1956y.responseHeadersEnd(iVar, response);
    }
}

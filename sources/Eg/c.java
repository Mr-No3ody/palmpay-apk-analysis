package Eg;

import Pg.AbstractC0555b;
import com.google.common.net.HttpHeaders;
import com.rnmaps.maps.M;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import okhttp3.AbstractC1956y;
import okhttp3.C1924d;
import okhttp3.C1925e;
import okhttp3.C1927g;
import okhttp3.C1928h;
import okhttp3.C1929i;
import okhttp3.C1943k;
import okhttp3.Call;
import okhttp3.F;
import okhttp3.Interceptor;
import okhttp3.J;
import okhttp3.W;
import okhttp3.X;
import okhttp3.Y;
import okhttp3.d0;
import okhttp3.e0;
import okhttp3.h0;
import okio.Source;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements Interceptor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f2435b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1929i f2436a;

    public c(C1929i c1929i) {
        this.f2436a = c1929i;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0268  */
    /* JADX WARN: Code duplicated, block: B:103:0x0270  */
    /* JADX WARN: Code duplicated, block: B:109:0x0283  */
    /* JADX WARN: Code duplicated, block: B:112:0x028a  */
    /* JADX WARN: Code duplicated, block: B:114:0x0290  */
    /* JADX WARN: Code duplicated, block: B:116:0x029a  */
    /* JADX WARN: Code duplicated, block: B:125:0x02da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:126:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:127:0x02e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:129:0x02e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:130:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:132:0x030d  */
    /* JADX WARN: Code duplicated, block: B:230:0x050e  */
    /* JADX WARN: Code duplicated, block: B:249:0x054b  */
    /* JADX WARN: Code duplicated, block: B:251:0x0583  */
    /* JADX WARN: Code duplicated, block: B:96:0x0251  */
    /* JADX WARN: Code duplicated, block: B:99:0x0259  */
    @Override // okhttp3.Interceptor
    public final e0 intercept(Interceptor.Chain chain) {
        e0 e0Var;
        int iZ;
        long j6;
        long time;
        Date dateA;
        Date dateA2;
        Date dateA3;
        String str;
        String str2;
        String str3;
        e cacheStrategy;
        long j10;
        long time2;
        String string;
        int i7;
        int i10;
        long millis;
        long millis2;
        String str4;
        String str5;
        e eVar;
        long j11;
        d0 d0VarC;
        int i11;
        AbstractC1956y abstractC1956y;
        h0 h0Var;
        M m7;
        g gVarC;
        g gVar;
        h0 h0Var2;
        h0 h0Var3;
        e0 response;
        Intrinsics.checkNotNullParameter(chain, "chain");
        Call call = chain.call();
        C1929i c1929i = this.f2436a;
        if (c1929i != null) {
            Y request = chain.request();
            Intrinsics.checkNotNullParameter(request, "request");
            J j12 = request.f40685a;
            C1925e c1925e = C1929i.f40759b;
            try {
                j snapshot = c1929i.f40760a.d(c1925e.key(j12));
                if (snapshot == null) {
                    response = null;
                } else {
                    try {
                        C1927g c1927g = new C1927g((Source) snapshot.f2460c.get(0));
                        F f10 = c1927g.f40748b;
                        String str6 = c1927g.f40749c;
                        J url = c1927g.f40747a;
                        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
                        F f11 = c1927g.f40753g;
                        String strA = f11.a(HttpHeaders.CONTENT_TYPE);
                        String strA2 = f11.a(HttpHeaders.CONTENT_LENGTH);
                        X x3 = new X();
                        Intrinsics.checkNotNullParameter(url, "url");
                        x3.f40680a = url;
                        x3.g(str6, null);
                        x3.f(f10);
                        Y request2 = x3.b();
                        d0 d0Var = new d0();
                        Intrinsics.checkNotNullParameter(request2, "request");
                        d0Var.f40715a = request2;
                        W protocol = c1927g.f40750d;
                        Intrinsics.checkNotNullParameter(protocol, "protocol");
                        d0Var.f40716b = protocol;
                        d0Var.f40717c = c1927g.f40751e;
                        String message = c1927g.f40752f;
                        Intrinsics.checkNotNullParameter(message, "message");
                        d0Var.f40718d = message;
                        d0Var.c(f11);
                        d0Var.f40721g = new C1924d(snapshot, strA, strA2);
                        d0Var.f40719e = c1927g.f40754h;
                        d0Var.f40725k = c1927g.f40755i;
                        d0Var.f40726l = c1927g.f40756j;
                        response = d0Var.a();
                        Intrinsics.checkNotNullParameter(request, "request");
                        Intrinsics.checkNotNullParameter(response, "response");
                        if (!url.equals(request.f40685a) || !str6.equals(request.f40686b) || !c1925e.varyMatches(response, f10, request)) {
                            h0 h0Var4 = response.f40734g;
                            if (h0Var4 != null) {
                                Dg.c.c(h0Var4);
                            }
                            response = null;
                        }
                    } catch (IOException unused) {
                        Dg.c.c(snapshot);
                    }
                }
            } catch (IOException unused2) {
            }
            e0Var = response;
        } else {
            e0Var = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Y request3 = chain.request();
        Intrinsics.checkNotNullParameter(request3, "request");
        if (e0Var != null) {
            j6 = e0Var.f40738p;
            time = e0Var.t;
            F f12 = e0Var.f40733f;
            int size = f12.size();
            int i12 = 0;
            iZ = -1;
            dateA = null;
            dateA2 = null;
            dateA3 = null;
            str = null;
            str2 = null;
            str3 = null;
            while (i12 < size) {
                String strB = f12.b(i12);
                long j13 = jCurrentTimeMillis;
                String strF = f12.f(i12);
                if (y.h(strB, HttpHeaders.DATE, true)) {
                    str3 = strF;
                    dateA = Hg.d.a(strF);
                } else if (y.h(strB, HttpHeaders.EXPIRES, true)) {
                    dateA3 = Hg.d.a(strF);
                } else if (y.h(strB, HttpHeaders.LAST_MODIFIED, true)) {
                    str2 = strF;
                    dateA2 = Hg.d.a(strF);
                } else if (y.h(strB, HttpHeaders.ETAG, true)) {
                    str = strF;
                } else if (y.h(strB, HttpHeaders.AGE, true)) {
                    iZ = Dg.c.z(-1, strF);
                }
                i12++;
                jCurrentTimeMillis = j13;
            }
        } else {
            iZ = -1;
            j6 = 0;
            time = 0;
            dateA = null;
            dateA2 = null;
            dateA3 = null;
            str = null;
            str2 = null;
            str3 = null;
        }
        long j14 = jCurrentTimeMillis;
        if (e0Var == null) {
            cacheStrategy = new e(request3, null);
        } else if (!(request3.f40685a.f40588j && e0Var.f40732e == null) && e.f2437c.isCacheable(e0Var, request3)) {
            C1943k c1943k = request3.f40690f;
            if (c1943k == null) {
                c1943k = C1943k.f40923n.parse(request3.f40687c);
                request3.f40690f = c1943k;
            }
            if (!c1943k.f40926a && request3.a(HttpHeaders.IF_MODIFIED_SINCE) == null && request3.a(HttpHeaders.IF_NONE_MATCH) == null) {
                C1943k c1943kA = e0Var.a();
                long jMax = dateA != null ? Math.max(0L, time - dateA.getTime()) : 0L;
                if (iZ != -1) {
                    jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(iZ));
                }
                long j15 = jMax + (time - j6) + (j14 - time);
                int i13 = e0Var.a().f40928c;
                if (i13 != -1) {
                    time2 = TimeUnit.SECONDS.toMillis(i13);
                } else {
                    if (dateA3 != null) {
                        if (dateA != null) {
                            time = dateA.getTime();
                        }
                        time2 = dateA3.getTime() - time;
                        if (time2 <= 0) {
                            time2 = 0;
                        }
                    } else if (dateA2 == null) {
                        j10 = 0;
                        time2 = j10;
                    } else {
                        ArrayList arrayList = e0Var.f40728a.f40685a.f40585g;
                        if (arrayList == null) {
                            string = null;
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            J.f40577k.toQueryString$okhttp(arrayList, sb2);
                            string = sb2.toString();
                        }
                        if (string == null) {
                            long time3 = (dateA != null ? dateA.getTime() : j6) - dateA2.getTime();
                            j10 = 0;
                            if (time3 > 0) {
                                time2 = time3 / ((long) 10);
                            }
                        } else {
                            j10 = 0;
                        }
                        time2 = j10;
                    }
                    i7 = c1943k.f40928c;
                    if (i7 != -1) {
                        time2 = Math.min(time2, TimeUnit.SECONDS.toMillis(i7));
                    }
                    i10 = c1943k.f40934i;
                    if (i10 != -1) {
                        millis = TimeUnit.SECONDS.toMillis(i10);
                    } else {
                        millis = j10;
                    }
                    if (!c1943kA.f40932g || (i11 = c1943k.f40933h) == -1) {
                        millis2 = j10;
                    } else {
                        millis2 = TimeUnit.SECONDS.toMillis(i11);
                    }
                    if (c1943kA.f40926a) {
                        if (str != null) {
                            str5 = str;
                            str4 = HttpHeaders.IF_NONE_MATCH;
                        } else if (dateA2 != null) {
                            str4 = HttpHeaders.IF_MODIFIED_SINCE;
                            str5 = str2;
                        } else if (dateA != null) {
                            str4 = r4;
                            str5 = str3;
                        } else {
                            cacheStrategy = new e(request3, null);
                        }
                        F1.b bVarD = request3.f40687c.d();
                        Intrinsics.e(str5);
                        bVarD.d(str4, str5);
                        X xB = request3.b();
                        xB.f(bVarD.h());
                        eVar = new e(xB.b(), e0Var);
                        cacheStrategy = eVar;
                    } else {
                        j11 = millis + j15;
                        if (j11 < millis2 + time2) {
                            d0VarC = e0Var.c();
                            if (j11 >= time2) {
                                Intrinsics.checkNotNullParameter(HttpHeaders.WARNING, "name");
                                Intrinsics.checkNotNullParameter("110 HttpURLConnection \"Response is stale\"", "value");
                                d0VarC.f40720f.b(HttpHeaders.WARNING, "110 HttpURLConnection \"Response is stale\"");
                            }
                            if (j15 > 86400000 && e0Var.a().f40928c == -1 && dateA3 == null) {
                                Intrinsics.checkNotNullParameter(HttpHeaders.WARNING, "name");
                                Intrinsics.checkNotNullParameter("113 HttpURLConnection \"Heuristic expiration\"", "value");
                                d0VarC.f40720f.b(HttpHeaders.WARNING, "113 HttpURLConnection \"Heuristic expiration\"");
                            }
                            eVar = new e(null, d0VarC.a());
                        } else {
                            if (str != null) {
                                str5 = str;
                                str4 = HttpHeaders.IF_NONE_MATCH;
                            } else if (dateA2 != null) {
                                str4 = HttpHeaders.IF_MODIFIED_SINCE;
                                str5 = str2;
                            } else if (dateA != null) {
                                str4 = r4;
                                str5 = str3;
                            } else {
                                cacheStrategy = new e(request3, null);
                            }
                            F1.b bVarD2 = request3.f40687c.d();
                            Intrinsics.e(str5);
                            bVarD2.d(str4, str5);
                            X xB2 = request3.b();
                            xB2.f(bVarD2.h());
                            eVar = new e(xB2.b(), e0Var);
                        }
                        cacheStrategy = eVar;
                    }
                }
                j10 = 0;
                i7 = c1943k.f40928c;
                if (i7 != -1) {
                    time2 = Math.min(time2, TimeUnit.SECONDS.toMillis(i7));
                }
                i10 = c1943k.f40934i;
                if (i10 != -1) {
                    millis = TimeUnit.SECONDS.toMillis(i10);
                } else {
                    millis = j10;
                }
                if (c1943kA.f40932g) {
                    millis2 = j10;
                } else {
                    millis2 = j10;
                }
                if (c1943kA.f40926a) {
                    j11 = millis + j15;
                    if (j11 < millis2 + time2) {
                        d0VarC = e0Var.c();
                        if (j11 >= time2) {
                            Intrinsics.checkNotNullParameter(HttpHeaders.WARNING, "name");
                            Intrinsics.checkNotNullParameter("110 HttpURLConnection \"Response is stale\"", "value");
                            d0VarC.f40720f.b(HttpHeaders.WARNING, "110 HttpURLConnection \"Response is stale\"");
                        }
                        if (j15 > 86400000) {
                            Intrinsics.checkNotNullParameter(HttpHeaders.WARNING, "name");
                            Intrinsics.checkNotNullParameter("113 HttpURLConnection \"Heuristic expiration\"", "value");
                            d0VarC.f40720f.b(HttpHeaders.WARNING, "113 HttpURLConnection \"Heuristic expiration\"");
                        }
                        eVar = new e(null, d0VarC.a());
                    } else {
                        if (str != null) {
                            str5 = str;
                            str4 = HttpHeaders.IF_NONE_MATCH;
                        } else if (dateA2 != null) {
                            str4 = HttpHeaders.IF_MODIFIED_SINCE;
                            str5 = str2;
                        } else if (dateA != null) {
                            str4 = r4;
                            str5 = str3;
                        } else {
                            cacheStrategy = new e(request3, null);
                        }
                        F1.b bVarD3 = request3.f40687c.d();
                        Intrinsics.e(str5);
                        bVarD3.d(str4, str5);
                        X xB3 = request3.b();
                        xB3.f(bVarD3.h());
                        eVar = new e(xB3.b(), e0Var);
                    }
                    cacheStrategy = eVar;
                } else {
                    if (str != null) {
                        str5 = str;
                        str4 = HttpHeaders.IF_NONE_MATCH;
                    } else if (dateA2 != null) {
                        str4 = HttpHeaders.IF_MODIFIED_SINCE;
                        str5 = str2;
                    } else if (dateA != null) {
                        str4 = r4;
                        str5 = str3;
                    } else {
                        cacheStrategy = new e(request3, null);
                    }
                    F1.b bVarD4 = request3.f40687c.d();
                    Intrinsics.e(str5);
                    bVarD4.d(str4, str5);
                    X xB4 = request3.b();
                    xB4.f(bVarD4.h());
                    eVar = new e(xB4.b(), e0Var);
                    cacheStrategy = eVar;
                }
            } else {
                cacheStrategy = new e(request3, null);
            }
        } else {
            cacheStrategy = new e(request3, null);
        }
        if (cacheStrategy.f2438a != null) {
            C1943k c1943k2 = request3.f40690f;
            if (c1943k2 == null) {
                c1943k2 = C1943k.f40923n.parse(request3.f40687c);
                request3.f40690f = c1943k2;
            }
            if (c1943k2.f40935j) {
                cacheStrategy = new e(null, null);
            }
        }
        Y y8 = cacheStrategy.f2438a;
        e0 cached = cacheStrategy.f2439b;
        C1929i c1929i2 = this.f2436a;
        if (c1929i2 != null) {
            synchronized (c1929i2) {
                Intrinsics.checkNotNullParameter(cacheStrategy, "cacheStrategy");
            }
        }
        Gg.i iVar = call instanceof Gg.i ? (Gg.i) call : null;
        if (iVar == null || (abstractC1956y = iVar.f3445e) == null) {
            abstractC1956y = AbstractC1956y.NONE;
        }
        if (e0Var != null && cached == null && (h0Var3 = e0Var.f40734g) != null) {
            Dg.c.c(h0Var3);
        }
        if (y8 == null && cached == null) {
            ArrayList arrayList2 = new ArrayList(20);
            Y request4 = chain.request();
            Intrinsics.checkNotNullParameter(request4, "request");
            W protocol2 = W.HTTP_1_1;
            Intrinsics.checkNotNullParameter(protocol2, "protocol");
            Intrinsics.checkNotNullParameter("Unsatisfiable Request (only-if-cached)", "message");
            h0 h0Var5 = Dg.c.f1881c;
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            if (request4 == null) {
                throw new IllegalStateException("request == null");
            }
            e0 e0Var2 = new e0(request4, protocol2, "Unsatisfiable Request (only-if-cached)", 504, null, new F((String[]) arrayList2.toArray(new String[0])), h0Var5, null, null, null, -1L, jCurrentTimeMillis2, null);
            abstractC1956y.satisfactionFailure(call, e0Var2);
            return e0Var2;
        }
        if (y8 == null) {
            Intrinsics.e(cached);
            d0 d0VarC2 = cached.c();
            e0 e0VarStripBody = f2435b.stripBody(cached);
            d0.b("cacheResponse", e0VarStripBody);
            d0VarC2.f40723i = e0VarStripBody;
            e0 e0VarA = d0VarC2.a();
            abstractC1956y.cacheHit(call, e0VarA);
            return e0VarA;
        }
        if (cached != null) {
            abstractC1956y.cacheConditionalHit(call, cached);
        } else if (this.f2436a != null) {
            abstractC1956y.cacheMiss(call);
        }
        try {
            e0 e0VarProceed = chain.proceed(y8);
            if (e0VarProceed == null && e0Var != null && (h0Var2 = e0Var.f40734g) != null) {
                Dg.c.c(h0Var2);
            }
            if (cached != null) {
                if (e0VarProceed != null && e0VarProceed.f40731d == 304) {
                    d0 d0VarC3 = cached.c();
                    a aVar = f2435b;
                    d0VarC3.c(aVar.combine(cached.f40733f, e0VarProceed.f40733f));
                    d0VarC3.f40725k = e0VarProceed.f40738p;
                    d0VarC3.f40726l = e0VarProceed.t;
                    e0 e0VarStripBody2 = aVar.stripBody(cached);
                    d0.b("cacheResponse", e0VarStripBody2);
                    d0VarC3.f40723i = e0VarStripBody2;
                    e0 e0VarStripBody3 = aVar.stripBody(e0VarProceed);
                    d0.b("networkResponse", e0VarStripBody3);
                    d0VarC3.f40722h = e0VarStripBody3;
                    e0 network = d0VarC3.a();
                    h0 h0Var6 = e0VarProceed.f40734g;
                    Intrinsics.e(h0Var6);
                    h0Var6.close();
                    C1929i c1929i3 = this.f2436a;
                    Intrinsics.e(c1929i3);
                    synchronized (c1929i3) {
                    }
                    this.f2436a.getClass();
                    Intrinsics.checkNotNullParameter(cached, "cached");
                    Intrinsics.checkNotNullParameter(network, "network");
                    C1927g c1927g2 = new C1927g(network);
                    h0 h0Var7 = cached.f40734g;
                    Intrinsics.f(h0Var7, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
                    j jVar = ((C1924d) h0Var7).f40711a;
                    try {
                        g gVarC2 = jVar.f2461d.c(jVar.f2459b, jVar.f2458a);
                        if (gVarC2 != null) {
                            try {
                                c1927g2.c(gVarC2);
                                gVarC2.b();
                            } catch (IOException unused3) {
                                gVar = gVarC2;
                                if (gVar != null) {
                                    try {
                                        gVar.a();
                                    } catch (IOException unused4) {
                                    }
                                }
                            }
                        }
                    } catch (IOException unused5) {
                        gVar = null;
                    }
                    abstractC1956y.cacheHit(call, network);
                    return network;
                }
                h0 h0Var8 = cached.f40734g;
                if (h0Var8 != null) {
                    Dg.c.c(h0Var8);
                }
            }
            Intrinsics.e(e0VarProceed);
            d0 d0VarC4 = e0VarProceed.c();
            a aVar2 = f2435b;
            e0 e0VarStripBody4 = aVar2.stripBody(cached);
            d0.b("cacheResponse", e0VarStripBody4);
            d0VarC4.f40723i = e0VarStripBody4;
            e0 e0VarStripBody5 = aVar2.stripBody(e0VarProceed);
            d0.b("networkResponse", e0VarStripBody5);
            d0VarC4.f40722h = e0VarStripBody5;
            e0 response2 = d0VarC4.a();
            if (this.f2436a != null) {
                if (Hg.e.a(response2) && e.f2437c.isCacheable(response2, y8)) {
                    C1929i c1929i4 = this.f2436a;
                    c1929i4.getClass();
                    Intrinsics.checkNotNullParameter(response2, "response");
                    String method = response2.f40728a.f40686b;
                    Intrinsics.checkNotNullParameter(method, "method");
                    boolean z3 = Intrinsics.c(method, "POST") || Intrinsics.c(method, "PATCH") || Intrinsics.c(method, "PUT") || Intrinsics.c(method, "DELETE") || Intrinsics.c(method, "MOVE");
                    Y y10 = response2.f40728a;
                    try {
                        if (!z3) {
                            if (Intrinsics.c(method, "GET")) {
                                C1925e c1925e2 = C1929i.f40759b;
                                if (c1925e2.hasVaryAll(response2)) {
                                    m7 = null;
                                } else {
                                    C1927g c1927g3 = new C1927g(response2);
                                    try {
                                        gVarC = c1929i4.f40760a.c(l.f2469k0, c1925e2.key(y10.f40685a));
                                        if (gVarC == null) {
                                            m7 = null;
                                        } else {
                                            try {
                                                c1927g3.c(gVarC);
                                                m7 = new M(c1929i4, gVarC);
                                            } catch (IOException unused6) {
                                                if (gVarC != null) {
                                                    gVarC.a();
                                                }
                                                m7 = null;
                                            }
                                        }
                                    } catch (IOException unused7) {
                                        gVarC = null;
                                    }
                                }
                            } else {
                                m7 = null;
                            }
                            if (m7 != null) {
                                C1928h c1928h = (C1928h) m7.f24721d;
                                h0 h0Var9 = response2.f40734g;
                                Intrinsics.e(h0Var9);
                                b bVar = new b(h0Var9.source(), m7, AbstractC0555b.b(c1928h));
                                String strB2 = response2.b(HttpHeaders.CONTENT_TYPE, null);
                                long jContentLength = response2.f40734g.contentLength();
                                d0 d0VarC5 = response2.c();
                                d0VarC5.f40721g = new Hg.g(strB2, jContentLength, AbstractC0555b.c(bVar));
                                response2 = d0VarC5.a();
                            }
                            if (cached != null) {
                                abstractC1956y.cacheMiss(call);
                            }
                            return response2;
                        }
                        c1929i4.a(y10);
                    } catch (IOException unused8) {
                    }
                    m7 = null;
                    if (m7 != null) {
                        C1928h c1928h2 = (C1928h) m7.f24721d;
                        h0 h0Var10 = response2.f40734g;
                        Intrinsics.e(h0Var10);
                        b bVar2 = new b(h0Var10.source(), m7, AbstractC0555b.b(c1928h2));
                        String strB3 = response2.b(HttpHeaders.CONTENT_TYPE, null);
                        long jContentLength2 = response2.f40734g.contentLength();
                        d0 d0VarC6 = response2.c();
                        d0VarC6.f40721g = new Hg.g(strB3, jContentLength2, AbstractC0555b.c(bVar2));
                        response2 = d0VarC6.a();
                    }
                    if (cached != null) {
                        abstractC1956y.cacheMiss(call);
                    }
                    return response2;
                }
                String method2 = y8.f40686b;
                Intrinsics.checkNotNullParameter(method2, "method");
                if (Intrinsics.c(method2, "POST") || Intrinsics.c(method2, "PATCH") || Intrinsics.c(method2, "PUT") || Intrinsics.c(method2, "DELETE") || Intrinsics.c(method2, "MOVE")) {
                    try {
                        this.f2436a.a(y8);
                    } catch (IOException unused9) {
                    }
                }
            }
            return response2;
        } catch (Throwable th) {
            if (e0Var != null && (h0Var = e0Var.f40734g) != null) {
                Dg.c.c(h0Var);
            }
            throw th;
        }
    }
}

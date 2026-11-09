package Hg;

import Pg.AbstractC0555b;
import Pg.q;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.util.List;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.C1951t;
import okhttp3.CookieJar;
import okhttp3.Interceptor;
import okhttp3.J;
import okhttp3.L;
import okhttp3.X;
import okhttp3.Y;
import okhttp3.c0;
import okhttp3.d0;
import okhttp3.e0;
import okhttp3.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CookieJar f3927a;

    public a(CookieJar cookieJar) {
        Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
        this.f3927a = cookieJar;
    }

    @Override // okhttp3.Interceptor
    public final e0 intercept(Interceptor.Chain chain) throws IOException {
        boolean z3;
        h0 h0Var;
        Intrinsics.checkNotNullParameter(chain, "chain");
        Y request = chain.request();
        X xB = request.b();
        c0 c0Var = request.f40688d;
        if (c0Var != null) {
            L lContentType = c0Var.contentType();
            if (lContentType != null) {
                xB.e(HttpHeaders.CONTENT_TYPE, lContentType.f40592a);
            }
            long jContentLength = c0Var.contentLength();
            if (jContentLength != -1) {
                xB.e(HttpHeaders.CONTENT_LENGTH, String.valueOf(jContentLength));
                xB.i(HttpHeaders.TRANSFER_ENCODING);
            } else {
                xB.e(HttpHeaders.TRANSFER_ENCODING, "chunked");
                xB.i(HttpHeaders.CONTENT_LENGTH);
            }
        }
        String strA = request.a(HttpHeaders.HOST);
        int i7 = 0;
        J j6 = request.f40685a;
        if (strA == null) {
            xB.e(HttpHeaders.HOST, Dg.c.x(j6, false));
        }
        if (request.a("Connection") == null) {
            xB.e("Connection", HttpHeaders.KEEP_ALIVE);
        }
        if (request.a(HttpHeaders.ACCEPT_ENCODING) == null && request.a(HttpHeaders.RANGE) == null) {
            xB.e(HttpHeaders.ACCEPT_ENCODING, "gzip");
            z3 = true;
        } else {
            z3 = false;
        }
        CookieJar cookieJar = this.f3927a;
        List<C1951t> listLoadForRequest = cookieJar.loadForRequest(j6);
        if (!listLoadForRequest.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            for (Object obj : listLoadForRequest) {
                int i10 = i7 + 1;
                if (i7 < 0) {
                    C1850q.k();
                    throw null;
                }
                C1951t c1951t = (C1951t) obj;
                if (i7 > 0) {
                    sb2.append("; ");
                }
                sb2.append(c1951t.f40982a);
                sb2.append('=');
                sb2.append(c1951t.f40983b);
                i7 = i10;
            }
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
            xB.e("Cookie", string);
        }
        if (request.a("User-Agent") == null) {
            xB.e("User-Agent", "okhttp/4.12.0");
        }
        e0 e0VarProceed = chain.proceed(xB.b());
        e.b(cookieJar, j6, e0VarProceed.f40733f);
        d0 d0VarC = e0VarProceed.c();
        Intrinsics.checkNotNullParameter(request, "request");
        d0VarC.f40715a = request;
        if (z3 && "gzip".equalsIgnoreCase(e0VarProceed.b("Content-Encoding", null)) && e.a(e0VarProceed) && (h0Var = e0VarProceed.f40734g) != null) {
            q qVar = new q(h0Var.source());
            F1.b bVarD = e0VarProceed.f40733f.d();
            bVarD.j("Content-Encoding");
            bVarD.j(HttpHeaders.CONTENT_LENGTH);
            d0VarC.c(bVarD.h());
            d0VarC.f40721g = new g(e0VarProceed.b(HttpHeaders.CONTENT_TYPE, null), -1L, AbstractC0555b.c(qVar));
        }
        return d0VarC.a();
    }
}

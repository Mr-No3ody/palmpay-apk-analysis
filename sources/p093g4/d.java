package p093g4;

import Hg.g;
import Pg.AbstractC0555b;
import Pg.C0558e;
import Pg.q;
import Ug.b;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.F;
import okhttp3.Interceptor;
import okhttp3.X;
import okhttp3.Y;
import okhttp3.d0;
import okhttp3.e0;
import okhttp3.h0;
import okio.BufferedSource;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Interceptor {
    static {
        new c(null);
    }

    @Override // okhttp3.Interceptor
    public final e0 intercept(Interceptor.Chain chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Y request = chain.request();
        X xB = request.b();
        if (request.a(HttpHeaders.ACCEPT_ENCODING) == null && request.a(HttpHeaders.RANGE) == null) {
            xB.e(HttpHeaders.ACCEPT_ENCODING, "br,gzip");
        }
        e0 e0VarProceed = chain.proceed(xB.b());
        d0 d0VarC = e0VarProceed.c();
        Intrinsics.checkNotNullParameter(request, "request");
        d0VarC.f40715a = request;
        h0 h0Var = e0VarProceed.f40734g;
        if (h0Var != null) {
            boolean zEqualsIgnoreCase = "br".equalsIgnoreCase(e0VarProceed.b("Content-Encoding", null));
            F f10 = e0VarProceed.f40733f;
            if (zEqualsIgnoreCase) {
                BufferedSource source = h0Var.source();
                Intrinsics.checkNotNullParameter(source, "source");
                C0558e c0558eL = AbstractC0555b.l(new b(source.inputStream()));
                F1.b bVarD = f10.d();
                bVarD.j("Content-Encoding");
                bVarD.j(HttpHeaders.CONTENT_LENGTH);
                d0VarC.c(bVarD.h());
                d0VarC.f40721g = new g(e0VarProceed.b(HttpHeaders.CONTENT_TYPE, null), -1L, AbstractC0555b.c(c0558eL));
            } else if ("gzip".equalsIgnoreCase(e0VarProceed.b("Content-Encoding", null))) {
                q qVar = new q(h0Var.source());
                F1.b bVarD2 = f10.d();
                bVarD2.j("Content-Encoding");
                bVarD2.j(HttpHeaders.CONTENT_LENGTH);
                bVarD2.j("access-control-allow-origin");
                bVarD2.j("access-control-allow-methods");
                bVarD2.j("access-control-allow-headers");
                bVarD2.j("server");
                bVarD2.j("x-application-context");
                d0VarC.c(bVarD2.h());
                d0VarC.f40721g = new g(e0VarProceed.b(HttpHeaders.CONTENT_TYPE, null), -1L, AbstractC0555b.c(qVar));
            }
        }
        return d0VarC.a();
    }
}

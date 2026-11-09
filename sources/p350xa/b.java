package p350xa;

import Hg.e;
import Hg.g;
import Pg.AbstractC0555b;
import Pg.C0558e;
import Pg.q;
import com.google.common.net.HttpHeaders;
import com.transsnet.palmpay.core.base.BaseApplication;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.F;
import okhttp3.Interceptor;
import okhttp3.X;
import okhttp3.Y;
import okhttp3.d0;
import okhttp3.e0;
import okhttp3.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Interceptor {
    @Override // okhttp3.Interceptor
    public final e0 intercept(Interceptor.Chain chain) throws IOException {
        Y request = chain.request();
        X xB = request.b();
        if (request.a(HttpHeaders.ACCEPT_ENCODING) == null && request.a(HttpHeaders.RANGE) == null) {
            BaseApplication baseApplication = BaseApplication.get();
            if (baseApplication == null || !baseApplication.isOldAndroidDevice()) {
                xB.e(HttpHeaders.ACCEPT_ENCODING, "br,gzip");
            } else {
                xB.e(HttpHeaders.ACCEPT_ENCODING, "gzip");
            }
        }
        e0 response = chain.proceed(xB.b());
        d0 d0VarC = response.c();
        Intrinsics.checkNotNullParameter(request, "request");
        d0VarC.f40715a = request;
        int i7 = e.f3933a;
        Intrinsics.checkNotNullParameter(response, "response");
        if (e.a(response)) {
            Intrinsics.checkNotNullParameter("Content-Encoding", "name");
            boolean zEqualsIgnoreCase = "br".equalsIgnoreCase(response.b("Content-Encoding", null));
            F f10 = response.f40733f;
            h0 h0Var = response.f40734g;
            if (zEqualsIgnoreCase) {
                C0558e c0558eL = AbstractC0555b.l(new Ug.b(h0Var.source().inputStream()));
                F1.b bVarD = f10.d();
                bVarD.j("Content-Encoding");
                bVarD.j(HttpHeaders.CONTENT_LENGTH);
                d0VarC.c(bVarD.h());
                Intrinsics.checkNotNullParameter(HttpHeaders.CONTENT_TYPE, "name");
                d0VarC.f40721g = new g(response.b(HttpHeaders.CONTENT_TYPE, null), -1L, AbstractC0555b.c(c0558eL));
            } else {
                Intrinsics.checkNotNullParameter("Content-Encoding", "name");
                if ("gzip".equalsIgnoreCase(response.b("Content-Encoding", null))) {
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
                    Intrinsics.checkNotNullParameter(HttpHeaders.CONTENT_TYPE, "name");
                    d0VarC.f40721g = new g(response.b(HttpHeaders.CONTENT_TYPE, null), -1L, AbstractC0555b.c(qVar));
                }
            }
        }
        return d0VarC.a();
    }
}

package Hg;

import Pg.l;
import Pg.m;
import com.google.common.net.HttpHeaders;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.C1951t;
import okhttp3.CookieJar;
import okhttp3.F;
import okhttp3.J;
import okhttp3.e0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f3933a = 0;

    static {
        l lVar = m.f7359d;
        lVar.encodeUtf8("\"\\");
        lVar.encodeUtf8("\t ,=");
    }

    public static final boolean a(e0 e0Var) {
        Intrinsics.checkNotNullParameter(e0Var, "<this>");
        if (Intrinsics.c(e0Var.f40728a.f40686b, "HEAD")) {
            return false;
        }
        int i7 = e0Var.f40731d;
        return (((i7 >= 100 && i7 < 200) || i7 == 204 || i7 == 304) && Dg.c.k(e0Var) == -1 && !"chunked".equalsIgnoreCase(e0Var.b(HttpHeaders.TRANSFER_ENCODING, null))) ? false : true;
    }

    public static final void b(CookieJar cookieJar, J url, F headers) {
        Intrinsics.checkNotNullParameter(cookieJar, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        if (cookieJar == CookieJar.f40559o0) {
            return;
        }
        List<C1951t> all = C1951t.f40977j.parseAll(url, headers);
        if (all.isEmpty()) {
            return;
        }
        cookieJar.saveFromResponse(url, all);
    }
}

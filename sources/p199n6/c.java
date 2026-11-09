package p199n6;

import O2.a;
import android.content.Context;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.gson.Gson;
import com.palmpay.lib.config.api.bean.ConfigReq;
import com.palmpay.lib.config.api.bean.ConfigRsp;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.H;
import okhttp3.J;
import okhttp3.L;
import okhttp3.U;
import okhttp3.X;
import okhttp3.b0;
import okhttp3.c0;
import okhttp3.e0;
import okhttp3.h0;
import p183m6.j;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f39852a;

    static {
        new b(null);
    }

    public c(a client, Context context) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f39852a = client;
    }

    public final ConfigRsp a(ConfigReq req) throws IOException {
        Intrinsics.checkNotNullParameter(req, "req");
        a aVar = this.f39852a;
        Intrinsics.checkNotNullParameter(req, "req");
        H hF = ((J) aVar.f6556d).f();
        Intrinsics.checkNotNullParameter("api/nebula-product/param/pull/map", "pathSegments");
        int i7 = 0;
        do {
            int iE = Dg.c.e(i7, "api/nebula-product/param/pull/map", 33, "/\\");
            hF.g("api/nebula-product/param/pull/map", i7, iE, iE < 33, false);
            i7 = iE + 1;
        } while (i7 <= 33);
        b0 b0Var = c0.Companion;
        String json = ((Gson) j.c().f39520b).toJson(req);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        c0 c0VarCreate = b0Var.create(json, L.f40589e.parse("application/json; charset=UTF-8"));
        X x3 = new X();
        J url = hF.b();
        Intrinsics.checkNotNullParameter(url, "url");
        x3.f40680a = url;
        x3.h(c0VarCreate);
        e0 e0VarExecute = FirebasePerfOkHttpClient.execute(((U) aVar.f6555c).newCall(x3.b()));
        if (!e0VarExecute.isSuccessful()) {
            throw new IOException("Unexpected response when fetching remote config: " + e0VarExecute);
        }
        h0 h0Var = e0VarExecute.f40734g;
        Intrinsics.e(h0Var);
        ConfigRsp configRsp = (ConfigRsp) j.c().b(StringsKt.V(h0Var.string()).toString(), ConfigRsp.class);
        if (configRsp != null) {
            return configRsp;
        }
        throw new IOException("Failed to parse remote config response body.");
    }
}

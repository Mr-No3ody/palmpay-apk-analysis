package p320v6;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.X;
import okhttp3.e0;
import p232p6.p;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Interceptor {
    @Override // okhttp3.Interceptor
    public final e0 intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        X xB = chain.request().b();
        p pVar = p.f41234a;
        String str = "en";
        if ("bn".equals("en")) {
            str = "bn-BD";
        } else if ("en".equals("en")) {
            str = "en-US";
        } else if ("sw".equals("en")) {
            str = "sw-TZ";
        }
        xB.a("accept-language", str);
        xB.a(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "NG");
        return chain.proceed(xB.b());
    }
}

package p077f4;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.e0;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Interceptor {
    @Override // okhttp3.Interceptor
    public final e0 intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        return chain.proceed(h.addCommonHeader$default(l.f36389b, chain.request(), null, 2, null));
    }
}

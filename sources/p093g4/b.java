package p093g4;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.L;
import okhttp3.Y;
import okhttp3.e0;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f36850a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L f36851b = L.f40589e.get("application/json");

    @Override // okhttp3.Interceptor
    public final e0 intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Y yRequest = chain.request();
        return "yes".equalsIgnoreCase(yRequest.a("No-PalmPay-Header")) ? chain.proceed(yRequest) : chain.proceed(f36850a.transformRequestBody$flexibank_sdk_release(yRequest));
    }
}

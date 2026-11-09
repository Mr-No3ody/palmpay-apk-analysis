package Ca;

import com.transsnet.palmpay.core.rnbridge.ReactNativeInitTask;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Y;
import okhttp3.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReactNativeInitTask f1344a;

    public e(ReactNativeInitTask reactNativeInitTask) {
        this.f1344a = reactNativeInitTask;
    }

    @Override // okhttp3.Interceptor
    public final e0 intercept(Interceptor.Chain chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Y yRequest = chain.request();
        e0 e0VarProceed = chain.proceed(yRequest);
        if (e0VarProceed.f40731d >= 400) {
            this.f1344a.monitorNetworkError(yRequest, e0VarProceed);
        }
        return e0VarProceed;
    }
}

package p077f4;

import android.os.SystemClock;
import android.util.Log;
import j4.n;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Y;
import okhttp3.e0;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Interceptor {
    @Override // okhttp3.Interceptor
    public final e0 intercept(Interceptor.Chain chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        SystemClock.elapsedRealtime();
        Y yRequest = chain.request();
        e0 e0VarProceed = chain.proceed(yRequest);
        SystemClock.elapsedRealtime();
        try {
            yRequest.f40685a.b();
            h hVar = l.f36389b;
            n nVarInvoke = n.f38300a.invoke();
            SystemClock.elapsedRealtime();
            int i7 = e0VarProceed.f40731d;
            synchronized (nVarInvoke) {
            }
            return e0VarProceed;
        } catch (Exception e10) {
            Log.e("FlexiBankPayHttpClient", "ProfileInterceptor intercept: ", e10);
            return e0VarProceed;
        }
    }
}

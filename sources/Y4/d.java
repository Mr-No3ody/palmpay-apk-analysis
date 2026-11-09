package Y4;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.e0;
import p198n5.h;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements Interceptor {
    @Override // okhttp3.Interceptor
    public final e0 intercept(Interceptor.Chain chain) throws IOException {
        try {
            return chain.proceed(chain.request());
        } catch (Exception e10) {
            h.c("SecurityExceptionInterceptor", "HTTP FAILED: " + e10.getMessage(), new Object[0]);
            throw new IOException("Failed due to an Exception: " + e10.getMessage());
        }
    }
}

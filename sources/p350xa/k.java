package p350xa;

import F6.d;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import okhttp3.Interceptor;
import okhttp3.Y;
import okhttp3.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements Interceptor {
    @Override // okhttp3.Interceptor
    public final e0 intercept(Interceptor.Chain chain) {
        Y yRequest = chain.request();
        String strA = yRequest.a("Custom_Read_Timeout");
        String strA2 = yRequest.a("Custom_Write_Timeout");
        String strA3 = yRequest.a("Connect-Timeout");
        if (!TextUtils.isEmpty(strA)) {
            try {
                chain = chain.withReadTimeout(Integer.parseInt(strA), TimeUnit.SECONDS);
            } catch (NumberFormatException e10) {
                d.c("TimeoutInterceptor", "intercept1: ", e10);
            }
        }
        if (!TextUtils.isEmpty(strA2)) {
            try {
                chain = chain.withWriteTimeout(Integer.parseInt(strA2), TimeUnit.SECONDS);
            } catch (NumberFormatException e11) {
                d.c("TimeoutInterceptor", "intercept2: ", e11);
            }
        }
        if (!TextUtils.isEmpty(strA3)) {
            try {
                chain = chain.withConnectTimeout(Integer.parseInt(strA3), TimeUnit.SECONDS);
            } catch (NumberFormatException e12) {
                d.c("TimeoutInterceptor", "intercept2: ", e12);
            }
        }
        return chain.proceed(yRequest);
    }
}

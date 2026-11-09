package p093g4;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Y;
import okhttp3.e0;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Interceptor {
    static {
        new f(null);
    }

    @Override // okhttp3.Interceptor
    public final e0 intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Y yRequest = chain.request();
        String strA = yRequest.a("Custom_Read_Timeout");
        String strA2 = yRequest.a("Custom_Write_Timeout");
        String strA3 = yRequest.a("Connect-Timeout");
        if (!TextUtils.isEmpty(strA)) {
            try {
                Intrinsics.e(strA);
                chain = chain.withReadTimeout(Integer.parseInt(strA), TimeUnit.SECONDS);
            } catch (NumberFormatException e10) {
                Log.e("FlexiBankTimeoutInterceptor", "intercept1: ", e10);
            }
        }
        if (!TextUtils.isEmpty(strA2)) {
            try {
                Intrinsics.e(strA2);
                chain = chain.withWriteTimeout(Integer.parseInt(strA2), TimeUnit.SECONDS);
            } catch (NumberFormatException e11) {
                Log.e("FlexiBankTimeoutInterceptor", "intercept2: ", e11);
            }
        }
        if (!TextUtils.isEmpty(strA3)) {
            try {
                Intrinsics.e(strA3);
                chain = chain.withConnectTimeout(Integer.parseInt(strA3), TimeUnit.SECONDS);
            } catch (NumberFormatException e12) {
                Log.e("FlexiBankTimeoutInterceptor", "intercept2: ", e12);
            }
        }
        return chain.proceed(yRequest);
    }
}

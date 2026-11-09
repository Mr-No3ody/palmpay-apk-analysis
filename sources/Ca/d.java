package Ca;

import Pa.C0521s;
import com.adjust.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.X;
import okhttp3.Y;
import okhttp3.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements Interceptor {
    @Override // okhttp3.Interceptor
    public final e0 intercept(Interceptor.Chain chain) throws UnsupportedEncodingException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Y yRequest = chain.request();
        String strDecode = URLDecoder.decode(yRequest.f40685a.f40587i, Constants.ENCODING);
        X xB = yRequest.b();
        xB.i("validationCheck");
        C0521s c0521s = C0521s.f7158a;
        if (!C0521s.a(strDecode)) {
            xB.a("validationCheck", "disable");
        }
        return chain.proceed(xB.b());
    }
}

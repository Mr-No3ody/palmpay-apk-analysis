package p350xa;

import F6.d;
import Pa.C0521s;
import Pa.i0;
import android.text.TextUtils;
import androidx.work.impl.model.b;
import com.google.common.net.HttpHeaders;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.LocationRecord;
import com.transsnet.palmpay.security.utils.SecurityUtils;
import com.transsnet.palmpay.util.AppUtils;
import com.transsnet.palmpay.util.DeviceUtils;
import com.transsnet.palmpay.util.StringUtils;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import okhttp3.Interceptor;
import okhttp3.X;
import okhttp3.Y;
import okhttp3.e0;
import p367ya.a;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f43739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f43740b;

    @Override // okhttp3.Interceptor
    public final e0 intercept(Interceptor.Chain chain) {
        Y yRequest = chain.request();
        String token = BaseApplication.get().getToken();
        if (!"yes".equalsIgnoreCase(yRequest.a("No-PalmPay-Header"))) {
            String strName = StandardCharsets.UTF_8.name();
            String strF = b.f();
            String strE = b.e();
            X xB = yRequest.b();
            String strValueOf = String.valueOf(System.currentTimeMillis());
            xB.i("PP_DEVICE_ID");
            xB.i("PP_DEVICE_TYPE");
            xB.i("PP_CLIENT_VER");
            xB.i("PP_TIMESTAMP");
            xB.i("PP_TOKEN");
            xB.i("PP_REQ_SIGN");
            xB.i("PP_REQ_SIGN_2");
            xB.i("PP_REQ_SIGN_V2");
            xB.i("PP_LNG");
            xB.i("PP_LAT");
            xB.i("PP_CHANNEL");
            xB.i("INSTALLER_PACKAGE");
            xB.i("validationCheck");
            xB.a("PP_DEVICE_ID", strE);
            xB.a("PP_DEVICE_TYPE", "ANDROID");
            xB.a("PP_CLIENT_VER", strF);
            xB.a("PP_TIMESTAMP", strValueOf);
            xB.a(HttpHeaders.CONTENT_TYPE, "application/json");
            if (TextUtils.isEmpty(f43739a)) {
                f43739a = AppUtils.getAppName() + "/" + b.f() + " (Android " + DeviceUtils.getSDKVersionName() + ")";
            }
            xB.a("User-Agent", f43739a);
            xB.a("appSource", "0");
            xB.a("PP_CHANNEL", BaseApplication.getChannel());
            try {
                String strDecode = URLDecoder.decode(yRequest.f40685a.f40587i, strName);
                if (strDecode.contains("/api/cfront/cashLoan/initApplyLog")) {
                    xB.a("INSTALLER_PACKAGE", i0.x(BaseApplication.getInstance()));
                }
                C0521s c0521s = C0521s.f7158a;
                if (!C0521s.a(strDecode)) {
                    xB.a("validationCheck", "disable");
                }
            } catch (Exception e10) {
                d.c("HeaderInterceptor", "applyCommonHeaders: ", e10);
            }
            LocationRecord locationRecordF = a.d().f();
            if (locationRecordF != null && !locationRecordF.isExpired()) {
                xB.a("PP_LAT", String.valueOf(locationRecordF.getLatitude()));
                xB.a("PP_LNG", String.valueOf(locationRecordF.getLongitude()));
            }
            if (f43740b == null) {
                f43740b = p059e1.a.I("key_env_tag", "");
            }
            String str = f43740b;
            if (!TextUtils.isEmpty(str)) {
                xB.a("x-mse-tag", str);
            }
            xB.a("PP_TOKEN", StringUtils.null2Length0(token));
            String strB = a.b(yRequest.f40688d);
            try {
                if ("Yes".equalsIgnoreCase(yRequest.a("Use_Sign_V2"))) {
                    xB.i("Use_Sign_V2");
                    xB.a("PP_REQ_SIGN_V2", URLEncoder.encode(SecurityUtils.f(strE, "ANDROID", strF, strValueOf, token, strB), strName));
                } else {
                    xB.a("PP_REQ_SIGN", URLEncoder.encode(SecurityUtils.g(strE, strF, strValueOf, token), strName));
                    if (!TextUtils.isEmpty(strB)) {
                        xB.a("PP_REQ_SIGN_2", URLEncoder.encode(SecurityUtils.e(strB.getBytes()), strName));
                    }
                }
            } catch (Exception e11) {
                d.c("HeaderInterceptor", "applyCommonHeaders: ", e11);
            }
            yRequest = xB.b();
        }
        return chain.proceed(yRequest);
    }
}

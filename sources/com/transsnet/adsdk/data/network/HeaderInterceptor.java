package com.transsnet.adsdk.data.network;

import android.content.Context;
import android.graphics.Point;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.google.common.net.HttpHeaders;
import com.transsnet.adsdk.AdManager;
import com.transsnet.adsdk.utils.AppUtils;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.X;
import okhttp3.Y;
import okhttp3.e0;

/* JADX INFO: loaded from: classes3.dex */
public class HeaderInterceptor implements Interceptor {
    private static final String HEADER_ADD_COMMON = "add_common_header";
    private final String mImgResolution = getScreenRatio(AdManager.get().getApp());
    private final String appVersion = AppUtils.getAppVersionName();

    private String getScreenRatio(Context context) {
        int i7;
        int i10;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            i7 = context.getResources().getDisplayMetrics().heightPixels;
            i10 = context.getResources().getDisplayMetrics().widthPixels;
        } else {
            Point point = new Point();
            windowManager.getDefaultDisplay().getRealSize(point);
            i7 = point.y;
            i10 = point.x;
        }
        return String.valueOf(i7).concat("*").concat(String.valueOf(i10));
    }

    @Override // okhttp3.Interceptor
    @NonNull
    public e0 intercept(Interceptor.Chain chain) throws IOException {
        Y yRequest = chain.request();
        X xB = yRequest.b();
        if ("yes".equals(yRequest.a(HEADER_ADD_COMMON))) {
            xB.a(HttpHeaders.ACCEPT, "application/json");
            xB.a(HttpHeaders.CONTENT_TYPE, "application/json");
            xB.a(HttpHeaders.AUTHORIZATION, "Bearer " + AdManager.get().getMerchantId());
            xB.a("CountryCode", AdManager.get().getCountryCode());
            xB.a("PP_CLIENT_VER", this.appVersion);
            xB.a("imgResolution", this.mImgResolution);
            xB.a("appChannel", AdManager.get().getAppChannel());
            xB.a("accept-language", AdManager.get().getLanguage());
            xB.i(HEADER_ADD_COMMON);
        }
        return chain.proceed(xB.b());
    }
}

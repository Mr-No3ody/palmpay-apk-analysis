package p077f4;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.flexibank.sdk.c;
import com.flexibank.sdk.k;
import com.flexibank.sdk.security.utils.FlexiBankSecurityUtils;
import com.google.common.net.HttpHeaders;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.luck.picture.lib.permissions.PermissionConfig;
import com.transsnet.palmpay.util.AppUtils;
import com.transsnet.palmpay.util.DeviceUtils;
import com.transsnet.palmpay.util.PermissionUtils;
import com.transsnet.palmpay.util.PhoneUtils;
import com.transsnet.palmpay.util.StringUtils;
import j4.u;
import java.io.File;
import java.net.URLDecoder;
import java.net.URLEncoder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.C1929i;
import okhttp3.U;
import okhttp3.X;
import okhttp3.Y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p093g4.b;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public /* synthetic */ h(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Y addCommonHeader(Y y8, String str) {
        String str2;
        String str3;
        if ("yes".equalsIgnoreCase(y8.a("No-PalmPay-Header"))) {
            return y8;
        }
        String versionName = getVersionName();
        String deviceId = getDeviceId();
        X xB = y8.b();
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
        xB.i("tntCode");
        xB.i(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE);
        xB.i("appSource");
        xB.i("PP-Request-Origin");
        if (k.k()) {
            k kVar = k.f22317a;
            k.o();
            xB.a("tntCode", "FLEXIBANK");
            xB.a(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, k.o().f21929a);
            k.o();
            xB.a("appSource", "0");
        }
        xB.a("PP_DEVICE_ID", deviceId);
        xB.a("PP_DEVICE_TYPE", "ANDROID");
        xB.a("PP_CLIENT_VER", versionName);
        xB.a("PP_TIMESTAMP", strValueOf);
        xB.a(HttpHeaders.CONTENT_TYPE, "application/json");
        String userAgent = getUserAgent();
        Intrinsics.e(userAgent);
        xB.a("User-Agent", userAgent);
        String strF = k.f();
        if (strF == null) {
            strF = "";
        }
        xB.a("PP_CHANNEL", strF);
        xB.a("PP-Request-Origin", "FLEXI_SDK");
        try {
            String strDecode = URLDecoder.decode(y8.f40685a.f40587i, Constants.ENCODING);
            Intrinsics.e(strDecode);
            if (StringsKt.A(strDecode, "/api/cfront/cashLoan/initApplyLog", false)) {
                Context context = k.g();
                Intrinsics.checkNotNullParameter(context, "context");
                if (TextUtils.isEmpty(u.f38320a)) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName("com.fleximfb.pay");
                    u.f38320a = installerPackageName;
                    if (TextUtils.isEmpty(installerPackageName)) {
                        String strF2 = k.f();
                        if (TextUtils.equals(strF2, "googleplay")) {
                            str3 = "com.android.vending";
                        } else {
                            str3 = TextUtils.equals(strF2, "palmstore") ? "com.transsnet.store" : "";
                        }
                        u.f38320a = str3;
                    }
                }
                String str4 = u.f38320a;
                if (str4 == null) {
                    str4 = "";
                }
                xB.a("INSTALLER_PACKAGE", str4);
            }
            if (!j4.h.a(strDecode)) {
                xB.a("validationCheck", "disable");
            }
            str2 = "FlexiBankPayHttpClient";
        } catch (Exception e10) {
            str2 = "FlexiBankPayHttpClient";
            Log.e(str2, "addCommonHeader: ", e10);
        }
        String strNull2Length0 = isTokenRequired(y8) ? StringUtils.null2Length0(str) : "";
        if (!TextUtils.isEmpty(strNull2Length0)) {
            Intrinsics.e(strNull2Length0);
            xB.a("PP_TOKEN", strNull2Length0);
        }
        try {
            xB.a("PP_REQ_SIGN_V2", URLEncoder.encode(FlexiBankSecurityUtils.b(deviceId, "ANDROID", versionName, strValueOf, strNull2Length0, b.f36850a.readRequestBodyUtf8(y8.f40688d)), "utf-8"));
        } catch (Exception e11) {
            Log.e(str2, "addCommonHeader3: ", e11);
        }
        return xB.b();
    }

    public static /* synthetic */ Y addCommonHeader$default(h hVar, Y y8, String str, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str = k.h();
        }
        return hVar.addCommonHeader(y8, str);
    }

    private final String getUserAgent() {
        if (TextUtils.isEmpty(l.f36396i)) {
            l.f36396i = AppUtils.getAppName() + "/" + getVersionName() + " (Android " + DeviceUtils.getSDKVersionName() + ")";
        }
        return l.f36396i;
    }

    private final String getVersionName() {
        if (TextUtils.isEmpty(l.f36395h)) {
            l.f36395h = AppUtils.getAppVersionName() + "&" + AppUtils.getAppVersionCode();
        }
        String str = l.f36395h;
        Intrinsics.e(str);
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isTokenRequired(Y y8) {
        try {
            return ("Yes".equalsIgnoreCase(y8.a("No-Token")) || TextUtils.isEmpty(URLDecoder.decode(y8.f40685a.f40587i, Constants.ENCODING))) ? false : true;
        } catch (Exception e10) {
            Log.e("FlexiBankPayHttpClient", "isTokenRequired: ", e10);
            return true;
        }
    }

    private final void outputLog(String str) {
        long id2 = Thread.currentThread().getId();
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(id2);
        sb2.append(") ");
        isLog2File();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1929i setCacheSize() {
        return PermissionUtils.isGranted(PermissionConfig.WRITE_EXTERNAL_STORAGE) ? new C1929i(new File(k.g().getExternalCacheDir(), "httpcache"), 52428800L) : new C1929i(new File(k.g().getCacheDir(), "httpcache"), 20971520L);
    }

    @NotNull
    public final String getDeviceId() {
        String deviceId;
        if (TextUtils.isEmpty(l.f36394g)) {
            String uniqueId = null;
            if (k.k()) {
                k kVar = k.f22317a;
                c cVar = k.o().f21934f;
                if (cVar != null && (deviceId = cVar.getDeviceId()) != null && !StringsKt.F(deviceId)) {
                    uniqueId = deviceId;
                }
            }
            if (uniqueId == null) {
                uniqueId = PhoneUtils.getUniqueId();
            }
            l.f36394g = uniqueId;
        }
        String str = l.f36394g;
        Intrinsics.e(str);
        return str;
    }

    @NotNull
    public final U getInstance$flexibank_sdk_release() {
        return (U) l.f36390c.getValue();
    }

    public final boolean isLog2File() {
        if (l.f36392e == null) {
            l.f36392e = Boolean.valueOf("1".equals(DeviceUtils.getStringProp("log2file")));
        }
        Boolean bool = l.f36392e;
        Intrinsics.e(bool);
        return bool.booleanValue();
    }

    public final boolean isLogOn() {
        if (l.f36393f == null) {
            l.f36393f = Boolean.valueOf("1".equals(DeviceUtils.getStringProp("logOn")));
        }
        Boolean bool = l.f36393f;
        Intrinsics.e(bool);
        return bool.booleanValue();
    }

    private h() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initLog(U u6) {
    }

    public final void logToFile(@Nullable String str) {
    }
}

package p199n6;

import android.os.Build;
import android.text.TextUtils;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.Gson;
import com.palmpay.lib.config.api.bean.ConfigReq;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.L;
import okhttp3.X;
import okhttp3.Y;
import okhttp3.b0;
import okhttp3.c0;
import okhttp3.e0;
import p183m6.j;
import p183m6.k;
import p183m6.s;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O2.a f39850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f39851b;

    public a(O2.a aVar, s sVar) {
        this.f39850a = aVar;
        this.f39851b = sVar;
    }

    @Override // okhttp3.Interceptor
    public final e0 intercept(Interceptor.Chain chain) {
        String json;
        Intrinsics.checkNotNullParameter(chain, "chain");
        Y yRequest = chain.request();
        X xB = yRequest.b();
        String strValueOf = String.valueOf(System.currentTimeMillis());
        StringBuilder sb2 = new StringBuilder("ANDROID");
        String str = Build.VERSION.RELEASE;
        sb2.append(str);
        String string = sb2.toString();
        xB.i("pp_device_id");
        xB.i("pp_device_type");
        xB.i("pp_client_ver");
        xB.i("PP_TIMESTAMP");
        xB.i("pp_channel");
        xB.i(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE);
        xB.i(RemoteConfigConstants.RequestFieldKey.APP_ID);
        xB.i("pp_req_sign");
        xB.i("tntCode");
        O2.a aVar = this.f39850a;
        String str2 = (String) aVar.f6553a;
        if (str2 != null) {
            xB.a("pp_device_id", str2);
        }
        String str3 = "ANDROID" + str;
        Intrinsics.checkNotNullExpressionValue(str3, "getDeviceType(...)");
        xB.a("pp_device_type", str3);
        String str4 = (String) aVar.f6554b;
        if (str4 != null) {
            xB.a("pp_client_ver", str4);
        }
        xB.a("PP_TIMESTAMP", strValueOf);
        s sVar = this.f39851b;
        String str5 = sVar.f39544d;
        if (str5 != null) {
            xB.a("pp_channel", str5);
        }
        String str6 = sVar.f39545e;
        if (str6 == null) {
            str6 = "NG";
        }
        xB.a(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, str6);
        xB.a(RemoteConfigConstants.RequestFieldKey.APP_ID, sVar.f39542b);
        String strA = k.a(((String) aVar.f6553a) + string + "palmpay" + ((String) aVar.f6554b) + strValueOf);
        Intrinsics.checkNotNullExpressionValue(strA, "getMD5(...)");
        xB.a("pp_req_sign", strA);
        c0 c0Var = yRequest.f40688d;
        Pg.k kVar = new Pg.k();
        try {
            c0Var.writeTo(kVar);
            json = kVar.readUtf8();
        } catch (Exception unused) {
            json = null;
        }
        if (TextUtils.isEmpty(json)) {
            json = "";
        } else {
            ConfigReq configReq = (ConfigReq) j.c().b(json, ConfigReq.class);
            if (configReq != null && configReq.nebulaClientParam != null) {
                configReq.sign = k.a(configReq.appId + configReq.nebulaClientParam.pp_device_type + "palmpay" + configReq.nebulaClientParam.pp_client_ver + strValueOf);
                configReq.setChannel(str5);
                json = ((Gson) j.c().f39520b).toJson(configReq);
            }
        }
        b0 b0Var = c0.Companion;
        Intrinsics.e(json);
        xB.h(b0Var.create(json, L.f40589e.parse("application/json")));
        return chain.proceed(xB.b());
    }
}

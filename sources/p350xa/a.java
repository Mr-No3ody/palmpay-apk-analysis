package p350xa;

import C0.G;
import F6.d;
import Pa.r0;
import Pg.k;
import android.net.Uri;
import android.text.TextUtils;
import com.transsnet.palmpay.util.CloseUtils;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.K;
import okhttp3.L;
import okhttp3.X;
import okhttp3.Y;
import okhttp3.c0;
import okhttp3.e0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final L f43717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L f43718b;

    static {
        K k2 = L.f40589e;
        f43717a = k2.parse("application/json");
        f43718b = k2.parse("application/x-www-form-urlencoded");
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Uri uri = Uri.parse("https://params/?".concat(str));
        JSONObject jSONObject = new JSONObject();
        for (String str2 : uri.getQueryParameterNames()) {
            String queryParameter = uri.getQueryParameter(str2);
            if (!TextUtils.isEmpty(queryParameter)) {
                d.h("BodyInterceptor", 3, G.o("convertFormDataToJson: ", queryParameter));
                try {
                    if ("true".equalsIgnoreCase(queryParameter)) {
                        jSONObject.put(str2, true);
                    } else if ("false".equalsIgnoreCase(queryParameter)) {
                        jSONObject.put(str2, false);
                    } else if (TextUtils.isDigitsOnly(queryParameter)) {
                        jSONObject.put(str2, Long.parseLong(queryParameter));
                    } else {
                        jSONObject.put(str2, queryParameter.substring(1, queryParameter.length() - 1));
                    }
                } catch (Exception e10) {
                    d.c("BodyInterceptor", "convertFormDataToJson: ", e10);
                }
            }
        }
        return jSONObject.toString();
    }

    public static String b(c0 c0Var) {
        if (c0Var == null) {
            return "";
        }
        try {
            if (c0Var.contentLength() <= 0) {
                return "";
            }
            k kVar = new k();
            try {
                c0Var.writeTo(kVar);
                return kVar.readUtf8();
            } catch (Exception unused) {
                CloseUtils.closeIO(kVar);
                return "";
            }
        } catch (IOException unused2) {
            return "";
        }
    }

    @Override // okhttp3.Interceptor
    public final e0 intercept(Interceptor.Chain chain) {
        Y yRequest = chain.request();
        if ("yes".equalsIgnoreCase(yRequest.a("No-PalmPay-Header"))) {
            return chain.proceed(yRequest);
        }
        X xB = yRequest.b();
        c0 c0Var = yRequest.f40688d;
        String strB = b(c0Var);
        boolean z3 = true;
        boolean z8 = false;
        if ("yes".equalsIgnoreCase(yRequest.a("Convert-Form-Data"))) {
            if (c0Var != null) {
                try {
                    if (f43718b.equals(c0Var.contentType())) {
                        try {
                            strB = a(strB);
                            z8 = true;
                        } catch (Exception e10) {
                            e = e10;
                            z8 = true;
                            d.c("BodyInterceptor", "ConvertFormDataInterceptor: ", e);
                        }
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            }
            xB.i("Convert-Form-Data");
        }
        if ("yes".equalsIgnoreCase(yRequest.a("Black-Code"))) {
            try {
                strB = r0.d(TextUtils.isEmpty(strB) ? "{}" : strB);
            } catch (Exception e12) {
                d.c("BodyInterceptor", "transformRequestBody: ", e12);
            }
            xB.i("Black-Code");
        } else {
            z3 = z8;
        }
        if (z3) {
            xB.h(c0.create(f43717a, TextUtils.isEmpty(strB) ? "{}" : strB));
        }
        return chain.proceed(xB.b());
    }
}

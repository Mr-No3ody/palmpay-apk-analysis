package p093g4;

import Pg.k;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import j4.c;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C1862a;
import kotlin.text.StringsKt;
import okhttp3.L;
import okhttp3.X;
import okhttp3.Y;
import okhttp3.b0;
import okhttp3.c0;
import org.chromium.support_lib_boundary.util.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final String convertFormDataToJson(String str) throws JSONException {
        Object obj;
        Uri uri = Uri.parse("https://params/?" + str);
        JSONObject jSONObject = new JSONObject();
        for (String str2 : uri.getQueryParameterNames()) {
            String queryParameter = uri.getQueryParameter(str2);
            if (queryParameter != null && queryParameter.length() != 0) {
                if (queryParameter.equalsIgnoreCase("true")) {
                    obj = Boolean.TRUE;
                } else if (queryParameter.equalsIgnoreCase("false")) {
                    obj = Boolean.FALSE;
                } else if (TextUtils.isDigitsOnly(queryParameter)) {
                    Long lU = StringsKt.U(queryParameter);
                    if (lU != null) {
                        obj = queryParameter;
                        obj = lU;
                    }
                } else if (queryParameter.length() >= 2 && StringsKt.N(queryParameter, '\"')) {
                    Intrinsics.checkNotNullParameter(queryParameter, "<this>");
                    if (queryParameter.length() > 0 && C1862a.a(queryParameter.charAt(StringsKt.C(queryParameter)), '\"', false)) {
                        obj = queryParameter;
                        obj = queryParameter;
                        obj = queryParameter;
                        obj = queryParameter;
                        String strSubstring = queryParameter.substring(1, queryParameter.length() - 1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                        obj = strSubstring;
                    }
                }
                obj = queryParameter;
                obj = queryParameter;
                obj = queryParameter;
                obj = queryParameter;
                obj = queryParameter;
                obj = queryParameter;
                obj = queryParameter;
                obj = queryParameter;
                obj = queryParameter;
                obj = queryParameter;
                obj = queryParameter;
                jSONObject.put(str2, obj);
            }
        }
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @JvmStatic
    @NotNull
    public final String readRequestBodyUtf8(@Nullable c0 c0Var) {
        if (c0Var != null && !c0Var.isOneShot() && !c0Var.isDuplex()) {
            try {
                k kVar = new k();
                try {
                    c0Var.writeTo(kVar);
                    return kVar.readUtf8();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        b.o(kVar, th);
                        throw th2;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return "";
    }

    /* JADX WARN: Code duplicated, block: B:48:0x008d  */
    @NotNull
    public final Y transformRequestBody$flexibank_sdk_release(@NotNull Y request) {
        String utf8;
        boolean z3;
        Intrinsics.checkNotNullParameter(request, "request");
        boolean zEqualsIgnoreCase = "yes".equalsIgnoreCase(request.a("Convert-Form-Data"));
        boolean zEqualsIgnoreCase2 = "yes".equalsIgnoreCase(request.a("Black-Code"));
        if (!zEqualsIgnoreCase && !zEqualsIgnoreCase2) {
            return request;
        }
        X xB = request.b();
        if (zEqualsIgnoreCase) {
            xB.i("Convert-Form-Data");
        }
        if (zEqualsIgnoreCase2) {
            xB.i("Black-Code");
        }
        boolean z8 = true;
        c0 c0Var = request.f40688d;
        if ((c0Var != null && c0Var.isOneShot()) || (c0Var != null && c0Var.isDuplex())) {
            return xB.b();
        }
        if (c0Var != null) {
            try {
                k kVar = new k();
                try {
                    c0Var.writeTo(kVar);
                    utf8 = kVar.readUtf8();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        b.o(kVar, th);
                        throw th2;
                    }
                }
            } catch (Exception e10) {
                Log.e("BodyInterceptor", "transformRequestBody: ", e10);
            }
        } else {
            utf8 = null;
        }
        if (utf8 == null) {
            utf8 = "";
        }
        L lContentType = c0Var != null ? c0Var.contentType() : null;
        if (zEqualsIgnoreCase) {
            if (Intrinsics.c(lContentType != null ? lContentType.f40593b : null, "application") && Intrinsics.c(lContentType.f40594c, "x-www-form-urlencoded")) {
                utf8 = convertFormDataToJson(utf8);
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            z3 = false;
        }
        String str = "{}";
        if (zEqualsIgnoreCase2) {
            int i7 = c.f38285a;
            if (utf8.length() == 0) {
                utf8 = "{}";
            }
            utf8 = c.a(utf8);
        } else {
            z8 = z3;
        }
        if (z8) {
            b0 b0Var = c0.Companion;
            if (utf8.length() != 0) {
                str = utf8;
            }
            xB.h(b0Var.create(str, b.f36851b));
        }
        return xB.b();
    }

    private a() {
    }
}

package p077f4;

import K3.d;
import W3.f;
import Wf.AbstractC0780y;
import android.app.Activity;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.camera.video.internal.c;
import com.adjust.sdk.Constants;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.util.ActivityUtils;
import j4.i;
import j4.j;
import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URLDecoder;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Interceptor;
import okhttp3.X;
import okhttp3.Y;
import okhttp3.c0;
import okhttp3.e0;
import p123i4.a;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Interceptor {
    public static void a(final String str, final String str2, final String str3) {
        a aVar;
        a aVar2;
        Condition condition;
        com.flexibank.sdk.k kVar = com.flexibank.sdk.k.f22317a;
        if (Intrinsics.c(Looper.myLooper(), Looper.getMainLooper())) {
            Log.e("FlexiBankSdk", "Token reauthorization must not run on the main thread");
            return;
        }
        final B b7 = new B();
        final B b10 = new B();
        Function0 action = new Function0() { // from class: com.flexibank.sdk.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String str4 = str3;
                if (str4 == null) {
                    str4 = "";
                }
                String strH = k.h();
                if (str4.equals(strH != null ? strH : "")) {
                    b7.f38947a = ((Boolean) AbstractC0780y.p(new i(str, str2, null))).booleanValue();
                    return Unit.f38893a;
                }
                b10.f38947a = true;
                return Unit.f38893a;
            }
        };
        c cVar = com.flexibank.sdk.k.f22320d;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(action, "action");
        ReentrantLock reentrantLock = (ReentrantLock) cVar.f14621b;
        reentrantLock.lock();
        while (true) {
            try {
                aVar = (a) cVar.f14622c;
                aVar2 = a.f37422b;
                condition = (Condition) cVar.f14623d;
                if (aVar != aVar2) {
                    break;
                }
                try {
                    condition.await();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    reentrantLock.unlock();
                }
                if (!b7.f38947a || b10.f38947a) {
                    cVar.t();
                }
                return;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        a aVar3 = a.f37423c;
        if (aVar == aVar3) {
            reentrantLock.unlock();
        } else {
            cVar.f14622c = aVar2;
            Unit unit = Unit.f38893a;
            reentrantLock.unlock();
            try {
                action.invoke();
                reentrantLock.lock();
                try {
                    cVar.f14622c = aVar3;
                    condition.signalAll();
                    reentrantLock.unlock();
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            } catch (Throwable th3) {
                reentrantLock.lock();
                try {
                    cVar.f14622c = a.f37423c;
                    condition.signalAll();
                    Unit unit2 = Unit.f38893a;
                    throw th3;
                } finally {
                    reentrantLock.unlock();
                }
            }
        }
        if (b7.f38947a) {
        }
        cVar.t();
    }

    public static f b(String str) {
        Object objFromJson;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            j jVar = j.f38294b.get();
            jVar.getClass();
            Intrinsics.checkNotNullParameter(f.class, "type");
            try {
                objFromJson = jVar.f38297a.fromJson(str, (Type) f.class);
            } catch (Exception e10) {
                e10.printStackTrace();
                objFromJson = null;
            }
            return (f) objFromJson;
        } catch (Exception e11) {
            Log.e("FlexiBankPayHttpClient", "parseCommonResult: ", e11);
            return null;
        }
    }

    public static String c(e0 e0Var) {
        if (e0Var != null && e0Var.isSuccessful()) {
            try {
                return e0Var.d().string();
            } catch (Exception e10) {
                Log.e("FlexiBankPayHttpClient", "peekBody: ", e10);
            }
        }
        return null;
    }

    @Override // okhttp3.Interceptor
    public final e0 intercept(Interceptor.Chain chain) throws IOException {
        c0 c0Var;
        Intrinsics.checkNotNullParameter(chain, "chain");
        Y yRequest = chain.request();
        String strDecode = URLDecoder.decode(yRequest.f40685a.f40587i, Constants.ENCODING);
        String strA = yRequest.a("PP_TOKEN");
        h hVar = l.f36389b;
        boolean zIsTokenRequired = hVar.isTokenRequired(yRequest);
        boolean zEqualsIgnoreCase = "yes".equalsIgnoreCase(yRequest.a("Ignore-Common-Dialog"));
        if (TextUtils.isEmpty(strA) && zIsTokenRequired) {
            URLDecoder.decode(yRequest.f40685a.f40587i, Constants.ENCODING);
            a(CommonResult.CODE_TOKEN_EXPIRED, "Token required", strA);
            throw new p046d4.a(CommonResult.CODE_TOKEN_EXPIRED, "Token required");
        }
        X xB = yRequest.b();
        xB.i("No-Token");
        xB.i("Ignore-Common-Dialog");
        e0 e0VarProceed = chain.proceed(xB.b());
        String strC = c(e0VarProceed);
        f fVarB = b(strC);
        if (zIsTokenRequired && fVarB != null && fVarB.d()) {
            a(fVarB.getRespCode(), fVarB.b(), strA);
            String strH = com.flexibank.sdk.k.h();
            if (strH == null || StringsKt.F(strH) || strH.equals(strA) || (((c0Var = yRequest.f40688d) != null && c0Var.isOneShot()) || (c0Var != null && c0Var.isDuplex()))) {
                return e0VarProceed;
            }
            Y yAddCommonHeader = hVar.addCommonHeader(e0VarProceed.f40728a, strH);
            e0VarProceed.close();
            e0VarProceed = chain.proceed(yAddCommonHeader);
            strC = c(e0VarProceed);
            fVarB = b(strC);
        }
        if (fVarB != null) {
            if (zIsTokenRequired && CommonResult.CODE_OTHER_DEVICE_ONLINE.equals(fVarB.getRespCode())) {
                a(fVarB.getRespCode(), fVarB.b(), e0VarProceed.f40728a.a("PP_TOKEN"));
                return e0VarProceed;
            }
            if (CommonResult.CODE_SHOW_COMMON_ERROR_DIALOG.equalsIgnoreCase(fVarB.getRespCode()) || CommonResult.CODE_SHOW_INVEST_ERROR_DIALOG.equalsIgnoreCase(fVarB.getRespCode())) {
                Activity topActivity = ActivityUtils.getTopActivity();
                if (topActivity instanceof d) {
                    ((d) topActivity).showCommonDialog(strDecode, j.f38294b.getJsonString(strC, "validationCheckResp"));
                }
                throw new p046d4.a(fVarB.getRespCode(), "Action required");
            }
            if (fVarB.c()) {
                if (StringsKt.A(strC == null ? "" : strC, "validationCheckResp", false)) {
                    Activity topActivity2 = ActivityUtils.getTopActivity();
                    if (topActivity2 instanceof d) {
                        i iVar = j.f38294b;
                        String jsonString = iVar.getJsonString(strC, "validationCheckResp");
                        if (TextUtils.isEmpty(jsonString) && !zEqualsIgnoreCase) {
                            jsonString = iVar.getJsonString(iVar.getJsonString(strC, com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE), "validationCheckResp");
                        }
                        ((d) topActivity2).showCommonDialog(strDecode, jsonString);
                        return e0VarProceed;
                    }
                }
            }
        }
        return e0VarProceed;
    }
}

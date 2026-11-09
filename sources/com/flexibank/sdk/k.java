package com.flexibank.sdk;

import Wf.AbstractC0777v;
import Wf.AbstractC0780y;
import Wf.I;
import Wf.v0;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.activity.AbstractActivityC0822m;
import androidx.camera.video.u;
import androidx.lifecycle.C1212w;
import androidx.lifecycle.EnumC1204n;
import com.appsflyer.AppsFlyerProperties;
import com.flexibank.sdk.api.FlexiBankApiAccountService;
import com.flexibank.sdk.callback.FlexiBankAuthorizationCallback;
import com.transsnet.palmpay.util.Utils;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.h0;
import retrofit2.K;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile a f22318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile Application f22319c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static p020b4.a f22322f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static String f22323g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static String f22324h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final p015ag.c f22326j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Handler f22327k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f22317a = new k();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final androidx.camera.video.internal.c f22320d = new androidx.camera.video.internal.c(14);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicLong f22321e = new AtomicLong();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static String f22325i = "NG";

    static {
        v0 v0VarC = AbstractC0780y.c();
        p042cg.f fVar = I.f10809a;
        f22326j = AbstractC0777v.a(kotlin.coroutines.e.c(v0VarC, p042cg.e.f19009c));
        f22327k = new Handler(Looper.getMainLooper());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public static final Object a(String str, String str2, Ff.c cVar) {
        j jVar;
        k kVar = f22317a;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i7 = jVar.f22316c;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                jVar.f22316c = i7 - Integer.MIN_VALUE;
            } else {
                jVar = new j(cVar);
            }
        } else {
            jVar = new j(cVar);
        }
        Object objOnReauthorizationRequired = jVar.f22315b;
        Ef.a aVar = Ef.a.f2423a;
        int i10 = jVar.f22316c;
        boolean z3 = true;
        try {
            if (i10 == 0) {
                androidx.camera.core.impl.utils.executor.g.M(objOnReauthorizationRequired);
                try {
                    FlexiBankReauthorizationListener flexiBankReauthorizationListener = o().f21933e;
                    jVar.f22314a = kVar;
                    jVar.f22316c = 1;
                    objOnReauthorizationRequired = flexiBankReauthorizationListener.onReauthorizationRequired(str, str2, jVar);
                    if (objOnReauthorizationRequired == aVar) {
                        return aVar;
                    }
                } catch (Exception e10) {
                    Log.e("FlexiBankSdk", "Reauthorization failed: SDK is not initialized", e10);
                    return Boolean.FALSE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kVar = jVar.f22314a;
                androidx.camera.core.impl.utils.executor.g.M(objOnReauthorizationRequired);
            }
            I3.a aVar2 = (I3.a) objOnReauthorizationRequired;
            String authCode = aVar2.getAuthCode();
            if (!aVar2.getSuccess() || authCode == null || StringsKt.F(authCode)) {
                Log.e("FlexiBankSdk", "Reauthorization authCode failed, errorCode=" + aVar2.getErrorCode());
                return Boolean.FALSE;
            }
            kVar.getClass();
            c cVarA = o().f21934f;
            if (cVarA == null) {
                Log.e("FlexiBankSdk", "Reauthorization failed: initDeviceInfo is missing");
                return Boolean.FALSE;
            }
            if (!Intrinsics.c(cVarA.getImei(), cVarA.getDeviceId())) {
                cVarA = c.a(cVarA, null, cVarA.getDeviceId(), 95);
            }
            o();
            I3.b bVar = new I3.b(authCode, cVarA);
            boolean z8 = false;
            try {
                if (J3.a.f4489a == null) {
                    synchronized (J3.a.class) {
                        try {
                            if (J3.a.f4489a == null) {
                                J3.a.f4489a = (FlexiBankApiAccountService) p077f4.n.f36398b.getInstance$flexibank_sdk_release().a(FlexiBankApiAccountService.class);
                            }
                            Unit unit = Unit.f38893a;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                FlexiBankApiAccountService flexiBankApiAccountService = J3.a.f4489a;
                Intrinsics.e(flexiBankApiAccountService);
                K<W3.c<I3.c>> kExecute = flexiBankApiAccountService.authorizeBlocking(bVar).execute();
                if (kExecute.f41873a.isSuccessful()) {
                    W3.c cVar2 = (W3.c) kExecute.f41874b;
                    if (cVar2 != null && cVar2.c()) {
                        I3.c cVar3 = (I3.c) cVar2.getData();
                        String token = cVar3 != null ? cVar3.getToken() : null;
                        if (token != null && !StringsKt.F(token)) {
                            Object data = cVar2.getData();
                            if (data == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            kVar.b(authCode, (I3.c) data, false);
                        }
                        z8 = z3;
                        return Boolean.valueOf(z8);
                    }
                    Log.e("FlexiBankSdk", "Reauthorization failed, errorCode=" + (cVar2 != null ? cVar2.getRespCode() : null));
                } else {
                    h0 h0Var = kExecute.f41875c;
                    if (h0Var != null) {
                        h0Var.close();
                    }
                    Log.e("FlexiBankSdk", "Reauthorization request failed, httpCode=" + kExecute.f41873a.f40731d);
                }
                z3 = false;
                z8 = z3;
            } catch (Exception e11) {
                Log.e("FlexiBankSdk", "Reauthorization request failed", e11);
            }
            return Boolean.valueOf(z8);
        } catch (Exception e12) {
            Log.e("FlexiBankSdk", "Reauthorization authCode request failed", e12);
            return Boolean.FALSE;
        }
    }

    public static final void c(String authCode, final FlexiBankAuthorizationCallback callback) {
        Intrinsics.checkNotNullParameter(authCode, "authCode");
        Intrinsics.checkNotNullParameter(callback, "callback");
        d();
        boolean zF = StringsKt.F(authCode);
        Handler handler = f22327k;
        if (zF) {
            final int i7 = 0;
            handler.post(new Runnable() { // from class: com.flexibank.sdk.d
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i7) {
                        case 0:
                            callback.onError("BusFail", "authCode must not be blank");
                            break;
                        default:
                            callback.onError("BusFail", "FlexiBank initDeviceInfo is required for authLogin");
                            break;
                    }
                }
            });
            return;
        }
        c cVarA = o().f21934f;
        if (cVarA == null) {
            final int i10 = 1;
            handler.post(new Runnable() { // from class: com.flexibank.sdk.d
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            callback.onError("BusFail", "authCode must not be blank");
                            break;
                        default:
                            callback.onError("BusFail", "FlexiBank initDeviceInfo is required for authLogin");
                            break;
                    }
                }
            });
            return;
        }
        if (!Intrinsics.c(cVarA.getImei(), cVarA.getDeviceId())) {
            cVarA = c.a(cVarA, null, cVarA.getDeviceId(), 95);
        }
        o();
        I3.b bVar = new I3.b(authCode, cVarA);
        p(authCode);
        AbstractC0780y.m(f22326j, null, null, new h(bVar, callback, authCode, null), 3);
    }

    public static void d() {
        o();
        if (f22319c == null) {
            throw new IllegalArgumentException("FlexiBankSdk.initialize must be called before using the SDK");
        }
    }

    public static final String f() {
        if (TextUtils.isEmpty(f22324h)) {
            String strH = Z4.e.h(g(), AppsFlyerProperties.CHANNEL);
            if (TextUtils.isEmpty(strH)) {
                strH = "googleplay";
            }
            f22324h = strH;
        }
        return f22324h;
    }

    public static final synchronized Context g() {
        Application application;
        synchronized (k.class) {
            d();
            application = f22319c;
            Intrinsics.e(application);
        }
        return applicationContext;
        Context applicationContext = application.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return applicationContext;
    }

    public static final synchronized String h() {
        try {
            if (f22323g == null) {
                String string = p110h4.b.f37294b.getInstance().f37296a.getString("_token", "");
                Intrinsics.e(string);
                f22323g = string;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f22323g;
    }

    public static final synchronized void j(Application context, a config) {
        try {
            synchronized (k.class) {
                Intrinsics.checkNotNullParameter(context, "application");
                Intrinsics.checkNotNullParameter(config, "config");
                f22318b = config;
                f22319c = context;
                f22320d.t();
                K3.g gVar = K3.g.f4925c.get();
                gVar.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                gVar.f4926a = context.getApplicationContext();
                Utils.init(context);
                String str = config.f21929a;
                synchronized (k.class) {
                    if (!StringsKt.F(str)) {
                        f22325i = str;
                    }
                }
            }
            j4.f.f38287b.getInstance().getClass();
            p110h4.b.f37294b.getInstance().f37296a.i("key_default_language", "NG");
            synchronized (k.class) {
                if (!StringsKt.F("NG")) {
                    f22325i = "NG";
                }
                G8.a.F(context);
            }
        } catch (Exception e10) {
            Log.e("FlexiBankSdk", "initCountryConfiguration: ", e10);
        }
    }

    public static final boolean k() {
        return (f22318b == null || f22319c == null) ? false : true;
    }

    public static final void l(AbstractActivityC0822m hostActivity, J3.d request, G9.i callback) {
        Intrinsics.checkNotNullParameter(hostActivity, "hostActivity");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        d();
        if (!Intrinsics.c(Looper.myLooper(), Looper.getMainLooper())) {
            throw new IllegalStateException("FlexiBankSdk.launchCashier must be called on the main thread");
        }
        if (((C1212w) hostActivity.getLifecycle()).f17478d == EnumC1204n.f17460a) {
            throw new IllegalStateException("Cannot launch cashier from a destroyed Activity");
        }
        String strI = u.i(f22321e.incrementAndGet(), "flexibank_cashier_");
        FlexiBankSdk$CashierLaunchSession flexiBankSdk$CashierLaunchSession = new FlexiBankSdk$CashierLaunchSession(hostActivity, strI, callback);
        Intrinsics.checkNotNullParameter(request, "request");
        hostActivity.getLifecycle().a(flexiBankSdk$CashierLaunchSession);
        try {
            androidx.activity.result.g gVarD = hostActivity.getActivityResultRegistry().d(strI, new J3.c(), new f(flexiBankSdk$CashierLaunchSession));
            flexiBankSdk$CashierLaunchSession.f21927c = gVarD;
            gVarD.a(request);
        } catch (Exception e10) {
            flexiBankSdk$CashierLaunchSession.a();
            throw e10;
        }
    }

    public static final void n() {
        k kVar = f22317a;
        d();
        q("");
        p("");
        kVar.e();
        f22320d.t();
    }

    public static a o() {
        a aVar = f22318b;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("FlexiBankSdk.initialize must be called before using the SDK");
    }

    public static final synchronized void p(String str) {
        p110h4.b.f37294b.getInstance().f37296a.i("_auth_code", str);
    }

    public static final synchronized void q(String str) {
        p110h4.b.f37294b.getInstance().f37296a.i("_token", str);
        f22323g = str;
    }

    public final p020b4.a b(String str, I3.c cVar, boolean z3) {
        String token = cVar.getToken();
        String str2 = null;
        if (token == null || StringsKt.F(token)) {
            token = null;
        }
        if (token == null) {
            throw new IllegalArgumentException("Invalid authorization token");
        }
        String memberId = cVar.getMemberId();
        if (memberId == null || StringsKt.F(memberId)) {
            memberId = null;
        }
        if (memberId == null) {
            throw new IllegalArgumentException("Invalid member ID");
        }
        String palmpayPhone = cVar.getPalmpayPhone();
        if (palmpayPhone != null && !StringsKt.F(palmpayPhone)) {
            str2 = palmpayPhone;
        }
        if (str2 == null) {
            throw new IllegalArgumentException("Invalid PalmPay phone number");
        }
        String strH = h();
        if (strH == null) {
            strH = "";
        }
        q(token);
        p(str);
        try {
            p020b4.a aVar = new p020b4.a(memberId, str2);
            p110h4.b aVar2 = p110h4.b.f37294b.getInstance();
            aVar2.f37296a.i("member_id", memberId);
            aVar2.f37296a.i("last_phone_number", str2);
            f22322f = aVar;
            if (z3) {
                f22320d.t();
            }
            return aVar;
        } catch (Throwable th) {
            q(strH);
            if (StringsKt.F(strH)) {
                e();
            }
            throw th;
        }
    }

    public final synchronized void e() {
        f22322f = null;
        p110h4.b.f37294b.getInstance().f37296a.i("member_id", null);
    }

    public final synchronized p020b4.a i() {
        p020b4.a aVar;
        try {
            if (f22322f == null) {
                f22322f = m();
            }
            aVar = f22322f;
            Intrinsics.e(aVar);
        } catch (Throwable th) {
            throw th;
        }
        return aVar;
    }

    public final synchronized p020b4.a m() {
        p020b4.a aVar;
        try {
            p110h4.b aVar2 = p110h4.b.f37294b.getInstance();
            aVar = new p020b4.a(aVar2.f37296a.getString("member_id", ""), aVar2.f37296a.getString("last_phone_number", ""));
        } catch (Exception e10) {
            Log.e("FlexiBankSdk", "loadUserInternal: ", e10);
            aVar = new p020b4.a(null, null);
        }
        return aVar;
    }
}

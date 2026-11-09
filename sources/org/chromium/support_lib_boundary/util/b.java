package org.chromium.support_lib_boundary.util;

import Ab.k;
import C0.G;
import Fb.i;
import N8.q0;
import Pa.i0;
import Pa.n0;
import V0.C0688g;
import V0.D;
import V0.EnumC0682a;
import V0.K;
import V0.Q;
import Wf.AbstractC0780y;
import Wf.t0;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ResolveInfo;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Range;
import android.view.Surface;
import android.view.WindowInsets;
import android.widget.TextView;
import androidx.camera.camera2.internal.F;
import androidx.camera.camera2.internal.P0;
import androidx.camera.core.impl.AbstractC0970b0;
import androidx.camera.core.impl.C0971c;
import androidx.camera.core.impl.C0993n;
import androidx.camera.core.impl.C1000q0;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.T;
import androidx.camera.core.impl.V;
import androidx.camera.core.impl.utils.executor.f;
import androidx.camera.core.impl.utils.executor.g;
import androidx.core.graphics.drawable.WrappedDrawable;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.android.gms.common.Scopes;
import com.google.gson.JsonParseException;
import com.horcrux.svg.C1415l;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.rollingtextview.strategy.CharOrderStrategy;
import com.swmansion.rnscreens.CustomToolbar;
import com.transsnet.adsdk.data.local.entity.AdEntity;
import com.transsnet.adsdk.widgets.Interstitial.InterstitialAdView;
import com.transsnet.adsdk.widgets.MarqueeTextView.MarqueeView;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.adsdk.widgets.banner.BannerAdView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.n;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.util.network.PPNetworkUtils$OnNetworkFailListener;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.credit.bean.OutstandingAccount;
import com.transsnet.palmpay.credit.ui.activity.LoanHomeActivity;
import com.transsnet.palmpay.credit.ui.dialog.RepayRemindDialog;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.AppUtils;
import com.transsnet.palmpay.util.RegexUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import javax.net.ssl.SSLHandshakeException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C1847n;
import kotlin.collections.C1850q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.y;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.C1878j;
import kotlinx.coroutines.flow.C1886s;
import kotlinx.coroutines.flow.C1888u;
import kotlinx.coroutines.flow.X;
import org.json.JSONException;
import org.sufficientlysecure.htmltextview.h;
import p118hf.c;
import p118hf.e;
import p355xf.C2126e;
import retrofit2.C1993k;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b implements CharOrderStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f41030a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static float f41031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f41032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f41033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f41034e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Path f41035f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static ArrayList f41036g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static float f41037h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static float f41038i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static float f41039j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static float f41040k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static float f41041l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static float f41042m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static boolean f41043n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static volatile com.google.firebase.crashlytics.internal.concurrency.b f41044o;

    public static void A(Context context, List list, boolean z3) {
        LoanHomeActivity loanHomeActivity;
        Intrinsics.checkNotNullParameter(context, "context");
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        if (z3) {
            Set set = Eb.b.f2269a;
            n0.g().q(new ClickEvent("Loan_Home_Repay_Click"));
        }
        if (list.size() > 1) {
            n0.g().k((ClickEvent) G.f("loan_product_repay_click", "loanProduct", "multiple"));
            Intrinsics.checkNotNullParameter(context, "context");
            Context baseContext = context;
            while (true) {
                if (baseContext == null) {
                    loanHomeActivity = null;
                    break;
                } else if (baseContext instanceof LoanHomeActivity) {
                    loanHomeActivity = (LoanHomeActivity) baseContext;
                    break;
                } else {
                    ContextWrapper contextWrapper = baseContext instanceof ContextWrapper ? (ContextWrapper) baseContext : null;
                    baseContext = contextWrapper != null ? contextWrapper.getBaseContext() : null;
                }
            }
            if (loanHomeActivity == null ? ActivityUtils.getTopActivity() instanceof LoanHomeActivity : true) {
                i.h(context);
                return;
            } else {
                d.x(null, "LoanRepayMix");
                return;
            }
        }
        OutstandingAccount outstandingAccount = (OutstandingAccount) list.get(0);
        Integer num = outstandingAccount.accountType;
        Long l5 = outstandingAccount.billOutstandingAmount;
        long jLongValue = 0;
        boolean z8 = (l5 != null ? l5.longValue() : -1L) > 0;
        F6.d.h("OutstandingRepayRouter", 3, "goToRepay >>> accountType=" + num);
        n0.g().k(new ClickEvent("loan_product_repay_click").add("loanProduct", outstandingAccount.loanProduct));
        if (num != null && num.intValue() == 6 && z8) {
            ARouter.getInstance().build("/credit_score/oc_repay_activity").withString(RepayRemindDialog.OC_REPAY_CARD_NO, outstandingAccount.cardNo).navigation(context);
            return;
        }
        Integer[] elements = {7, 9, 14};
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (CollectionsKt.A(C1847n.A(elements), num) && z8) {
            Bundle bundle = new Bundle();
            bundle.putString("cardNo", outstandingAccount.cardNo);
            Long l6 = outstandingAccount.billId;
            if (l6 != null) {
                bundle.putLong("billId", l6.longValue());
            }
            bundle.putString("loanProduct", outstandingAccount.loanProduct);
            bundle.putBoolean("repayAllFlag", false);
            d.x(bundle, "LoanRepayHome");
            return;
        }
        if (num != null && num.intValue() == 13 && z8) {
            Integer num2 = outstandingAccount.outstandingBillCount;
            if (num2 != null) {
                Long l8 = num2.intValue() > 1 ? 0L : outstandingAccount.billId;
                if (l8 != null) {
                    jLongValue = l8.longValue();
                }
            }
            F6.d.h("OutstandingRepayRouter", 3, "goToPalmPayCardRepayment >>> cardNo=" + outstandingAccount.cardNo + ", billId=" + jLongValue);
            Bundle bundle2 = new Bundle();
            bundle2.putLong("billId", jLongValue);
            bundle2.putString("cardNo", outstandingAccount.cardNo);
            bundle2.putBoolean("billedFlag", false);
            d.x(bundle2, "PalmPayCardRepaymentHome");
        }
    }

    public static final void B(l lVar, Object obj) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        lVar.i(new p(obj));
    }

    public static final void C(l lVar, Object obj) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        lVar.i(new p(obj));
    }

    public static final void D(l lVar, Throwable e10) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(e10, "e");
        if (!(e10 instanceof p203na.b)) {
            lVar.i(new n(W(e10)));
        } else {
            p252qa.a.a(null);
            lVar.i(m.f27357a);
        }
    }

    public static final void E(l lVar, Throwable e10) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(e10, "e");
        if (!(e10 instanceof p203na.b)) {
            lVar.i(new n(W(e10)));
        } else {
            p252qa.a.a(null);
            lVar.i(m.f27357a);
        }
    }

    public static final void F(l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        lVar.i(new n("No internet connection. Please check your internet and try again."));
    }

    public static O1.a H() {
        if (O1.a.f6536c != null) {
            return O1.a.f6536c;
        }
        synchronized (O1.a.class) {
            try {
                if (O1.a.f6536c == null) {
                    O1.a.f6536c = new O1.a(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return O1.a.f6536c;
    }

    public static final EnumC0682a I(int i7) {
        if (i7 == 0) {
            return EnumC0682a.f9915a;
        }
        if (i7 == 1) {
            return EnumC0682a.f9916b;
        }
        throw new IllegalArgumentException(F.c(i7, "Could not convert ", " to BackoffPolicy"));
    }

    public static final D J(int i7) {
        if (i7 == 0) {
            return D.f9863a;
        }
        if (i7 == 1) {
            return D.f9864b;
        }
        if (i7 == 2) {
            return D.f9865c;
        }
        if (i7 == 3) {
            return D.f9866d;
        }
        if (i7 == 4) {
            return D.f9867e;
        }
        if (Build.VERSION.SDK_INT < 30 || i7 != 5) {
            throw new IllegalArgumentException(F.c(i7, "Could not convert ", " to NetworkType"));
        }
        return D.f9868f;
    }

    public static final K K(int i7) {
        if (i7 == 0) {
            return K.f9880a;
        }
        if (i7 == 1) {
            return K.f9881b;
        }
        throw new IllegalArgumentException(F.c(i7, "Could not convert ", " to OutOfQuotaPolicy"));
    }

    public static final Q L(int i7) {
        if (i7 == 0) {
            return Q.f9885a;
        }
        if (i7 == 1) {
            return Q.f9886b;
        }
        if (i7 == 2) {
            return Q.f9887c;
        }
        if (i7 == 3) {
            return Q.f9888d;
        }
        if (i7 == 4) {
            return Q.f9889e;
        }
        if (i7 == 5) {
            return Q.f9890f;
        }
        throw new IllegalArgumentException(F.c(i7, "Could not convert ", " to State"));
    }

    public static f M() {
        if (f.f14167c != null) {
            return f.f14167c;
        }
        synchronized (f.class) {
            try {
                if (f.f14167c == null) {
                    f.f14167c = new f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f.f14167c;
    }

    public static boolean O(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return X.b.f(context.getSystemService(X.b.g())).isRequestPinShortcutSupported();
        }
        if (androidx.core.content.d.a(context, "com.android.launcher.permission.INSTALL_SHORTCUT") == 0) {
            Iterator<ResolveInfo> it = context.getPackageManager().queryBroadcastReceivers(new Intent("com.android.launcher.action.INSTALL_SHORTCUT"), 0).iterator();
            while (it.hasNext()) {
                String str = it.next().activityInfo.permission;
                if (TextUtils.isEmpty(str) || "com.android.launcher.permission.INSTALL_SHORTCUT".equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void P(AdEntity adEntity) {
        if (adEntity == null) {
            return;
        }
        n0.g().k(new ClickEvent("BusinessTarget_Source_Ad").add("adId", adEntity.adId));
        if (!"RATE_DIALOG".equals(adEntity.relativeUrl)) {
            Q(adEntity.jumpType, adEntity.relativeUrl, adEntity.jumpParams, adEntity.adSlotId);
        } else if (p367ya.a.d().a()) {
            d.F("/app/rate_app_activity");
        }
    }

    public static void Q(String str, String str2, String str3, String str4) {
        if ("01".equals(str)) {
            if (RegexUtils.isURL(str2)) {
                ActivityUtils.startActivity(Pa.F.a(BaseApplication.getContext(), str2));
                return;
            }
            try {
                Postcard postcardH = Pa.F.h(ARouter.getInstance().build(str2), str3);
                if (!TextUtils.isEmpty(str4)) {
                    postcardH.withString("adSlotId", str4);
                }
                postcardH.navigation();
                return;
            } catch (Exception e10) {
                F6.d.c("b", "jumpToLink: ", e10);
                return;
            }
        }
        if ("02".equals(str)) {
            String strG = com.transsnet.palmpay.core.config.d.g(str2);
            if (!TextUtils.isEmpty(str3)) {
                strG = strG.contains("?") ? q0.y(strG, "&", str3) : q0.y(strG, "?", str3);
            }
            i0.c0(strG);
            return;
        }
        if ("03".equals(str)) {
            if (TextUtils.isEmpty(str2) || !RegexUtils.isURL(str2)) {
                return;
            }
            if (TextUtils.isEmpty(str3)) {
                i0.c0(str2);
                return;
            } else {
                i0.c0(str2.contains("?") ? q0.y(str2, "&", str3) : q0.y(str2, "?", str3));
                return;
            }
        }
        if ("04".equals(str)) {
            return;
        }
        if ("06".equals(str)) {
            d.x(Pa.F.j(str3), str2);
        } else if ("05".equals(str)) {
            d.G("/coreImpl/claim_reward", str3);
        }
    }

    public static void R(float f10, float f11) {
        g0();
        f41037h = f10;
        f41039j = f10;
        f41038i = f11;
        f41040k = f11;
        Path path = f41035f;
        float f12 = f41031b;
        path.lineTo(f10 * f12, f12 * f11);
        f41036g.add(new C1415l(4, new com.abedelazizshe.lightcompressorlibrary.config.b[]{new com.abedelazizshe.lightcompressorlibrary.config.b(f10, f11)}));
    }

    public static androidx.camera.core.impl.utils.executor.d S() {
        if (g.f14170a != null) {
            return g.f14170a;
        }
        synchronized (g.class) {
            try {
                if (g.f14170a == null) {
                    g.f14170a = new androidx.camera.core.impl.utils.executor.d(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return g.f14170a;
    }

    public static void T(float f10, float f11) {
        f41037h = f10;
        f41039j = f10;
        f41041l = f10;
        f41038i = f11;
        f41040k = f11;
        f41042m = f11;
        Path path = f41035f;
        float f12 = f41031b;
        path.moveTo(f10 * f12, f12 * f11);
        f41036g.add(new C1415l(3, new com.abedelazizshe.lightcompressorlibrary.config.b[]{new com.abedelazizshe.lightcompressorlibrary.config.b(f10, f11)}));
    }

    public static final int U(D networkType) {
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        int iOrdinal = networkType.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i7 = 1;
        if (iOrdinal != 1) {
            i7 = 2;
            if (iOrdinal != 2) {
                i7 = 3;
                if (iOrdinal != 3) {
                    i7 = 4;
                    if (iOrdinal != 4) {
                        if (Build.VERSION.SDK_INT >= 30 && networkType == D.f9868f) {
                            return 5;
                        }
                        throw new IllegalArgumentException("Could not convert " + networkType + " to int");
                    }
                }
            }
        }
        return i7;
    }

    public static void V(Throwable th) {
        com.google.firebase.crashlytics.internal.concurrency.b bVar = f41044o;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!(th instanceof p118hf.d) && !(th instanceof c) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof p118hf.b)) {
            th = new e("The exception could not be delivered to the consumer because it has already canceled/disposed the flow or the exception has nowhere to go to begin with. Further reading: https://github.com/ReactiveX/RxJava/wiki/What's-different-in-2.0#error-handling | " + th, th);
        }
        if (bVar != null) {
            try {
                bVar.accept(th);
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
            }
        }
        th.printStackTrace();
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000b  */
    public static final String W(Throwable e10) {
        String code;
        PPNetworkUtils$OnNetworkFailListener pPNetworkUtils$OnNetworkFailListener;
        Intrinsics.checkNotNullParameter(e10, "e");
        if ((e10 instanceof p203na.b) || (e10 instanceof p203na.a)) {
            code = "";
        } else {
            if (e10 instanceof C1993k) {
                int i7 = ((C1993k) e10).f41932a;
                if (i7 == 404) {
                    code = Z4.e.i("404");
                } else if (i7 == 400) {
                    code = Z4.e.i("400");
                } else if (i7 == 503) {
                    code = Z4.e.i("503");
                } else {
                    code = Z4.e.j(String.valueOf(i7));
                    Intrinsics.e(code);
                    Intrinsics.checkNotNullParameter(code, "code");
                    if (AppUtils.isAppForeground()) {
                        long jCurrentTimeMillis = System.currentTimeMillis() - p118hf.a.f37383f;
                        if (jCurrentTimeMillis < 0) {
                            p118hf.a.f37383f = System.currentTimeMillis();
                        }
                        if (jCurrentTimeMillis >= 15000) {
                            p118hf.a.f37383f = System.currentTimeMillis();
                            ComponentCallbacks2 topActivity = ActivityUtils.getTopActivity();
                            pPNetworkUtils$OnNetworkFailListener = topActivity instanceof PPNetworkUtils$OnNetworkFailListener ? (PPNetworkUtils$OnNetworkFailListener) topActivity : null;
                            if (pPNetworkUtils$OnNetworkFailListener != null) {
                                pPNetworkUtils$OnNetworkFailListener.onNetworkFail(code);
                            }
                        }
                    }
                }
            } else if ((e10 instanceof JsonParseException) || (e10 instanceof JSONException) || (e10 instanceof ParseException)) {
                code = Z4.e.i(e10.getClass().getSimpleName());
            } else if (e10 instanceof CancellationException) {
                code = "";
            } else if (e10 instanceof p203na.c) {
                p203na.c cVar = (p203na.c) e10;
                if (!Intrinsics.c(cVar.f39871a, CommonResult.CODE_FAIL) || (code = cVar.f39872b) == null) {
                    code = "";
                }
            } else if (e10 instanceof IllegalArgumentException) {
                code = Z4.e.i(e10.getClass().getSimpleName());
            } else if ((e10 instanceof ConnectException) || (e10 instanceof UnknownHostException) || (e10 instanceof SSLHandshakeException)) {
                code = Z4.e.j(e10.getClass().getSimpleName());
                Intrinsics.e(code);
                Intrinsics.checkNotNullParameter(code, "code");
                if (AppUtils.isAppForeground()) {
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - p118hf.a.f37383f;
                    if (jCurrentTimeMillis2 < 0) {
                        p118hf.a.f37383f = System.currentTimeMillis();
                    }
                    if (jCurrentTimeMillis2 >= 15000) {
                        p118hf.a.f37383f = System.currentTimeMillis();
                        ComponentCallbacks2 topActivity2 = ActivityUtils.getTopActivity();
                        pPNetworkUtils$OnNetworkFailListener = topActivity2 instanceof PPNetworkUtils$OnNetworkFailListener ? (PPNetworkUtils$OnNetworkFailListener) topActivity2 : null;
                        if (pPNetworkUtils$OnNetworkFailListener != null) {
                            pPNetworkUtils$OnNetworkFailListener.onNetworkFail(code);
                        }
                    }
                }
            } else if (e10 instanceof IOException) {
                String strD = Z4.e.d(e10);
                if (TextUtils.isEmpty(strD)) {
                    strD = e10.getClass().getSimpleName();
                }
                code = Z4.e.j(strD);
                Intrinsics.e(code);
                Intrinsics.checkNotNullParameter(code, "code");
                if (AppUtils.isAppForeground()) {
                    long jCurrentTimeMillis3 = System.currentTimeMillis() - p118hf.a.f37383f;
                    if (jCurrentTimeMillis3 < 0) {
                        p118hf.a.f37383f = System.currentTimeMillis();
                    }
                    if (jCurrentTimeMillis3 >= 15000) {
                        p118hf.a.f37383f = System.currentTimeMillis();
                        ComponentCallbacks2 topActivity3 = ActivityUtils.getTopActivity();
                        pPNetworkUtils$OnNetworkFailListener = topActivity3 instanceof PPNetworkUtils$OnNetworkFailListener ? (PPNetworkUtils$OnNetworkFailListener) topActivity3 : null;
                        if (pPNetworkUtils$OnNetworkFailListener != null) {
                            pPNetworkUtils$OnNetworkFailListener.onNetworkFail(code);
                        }
                    }
                }
            } else {
                code = Z4.e.i(e10.getClass().getSimpleName());
            }
        }
        return code == null ? "" : code;
    }

    public static boolean X() {
        m0();
        char cCharAt = f41034e.charAt(f41032c);
        if (cCharAt != '0' && cCharAt != '1') {
            throw new Error(String.format("Unexpected flag '%c' (i=%d, s=%s)", Character.valueOf(cCharAt), Integer.valueOf(f41032c), f41034e));
        }
        int i7 = f41032c + 1;
        f41032c = i7;
        if (i7 < f41033d && f41034e.charAt(i7) == ',') {
            f41032c++;
        }
        m0();
        return cCharAt == '1';
    }

    public static float Y() {
        int i7;
        char cCharAt;
        if (f41032c == f41033d) {
            throw new Error(q0.k("Unexpected end (s=", f41034e, ")"));
        }
        m0();
        int i10 = f41032c;
        if (i10 == f41033d) {
            throw new Error(q0.k("Unexpected end (s=", f41034e, ")"));
        }
        char cCharAt2 = f41034e.charAt(i10);
        if (cCharAt2 == '-' || cCharAt2 == '+') {
            int i11 = f41032c + 1;
            f41032c = i11;
            cCharAt2 = f41034e.charAt(i11);
        }
        if (cCharAt2 >= '0' && cCharAt2 <= '9') {
            l0();
            int i12 = f41032c;
            if (i12 < f41033d) {
                cCharAt2 = f41034e.charAt(i12);
            }
        } else if (cCharAt2 != '.') {
            throw new IllegalArgumentException(String.format("Invalid number formating character '%c' (i=%d, s=%s)", Character.valueOf(cCharAt2), Integer.valueOf(f41032c), f41034e));
        }
        if (cCharAt2 == '.') {
            f41032c++;
            l0();
            int i13 = f41032c;
            if (i13 < f41033d) {
                cCharAt2 = f41034e.charAt(i13);
            }
        }
        if ((cCharAt2 == 'e' || cCharAt2 == 'E') && (i7 = f41032c + 1) < f41033d && (cCharAt = f41034e.charAt(i7)) != 'm' && cCharAt != 'x') {
            int i14 = f41032c + 1;
            f41032c = i14;
            char cCharAt3 = f41034e.charAt(i14);
            if (cCharAt3 == '+' || cCharAt3 == '-') {
                f41032c++;
                l0();
            } else {
                if (cCharAt3 < '0' || cCharAt3 > '9') {
                    throw new IllegalArgumentException(String.format("Invalid number formating character '%c' (i=%d, s=%s)", Character.valueOf(cCharAt3), Integer.valueOf(f41032c), f41034e));
                }
                l0();
            }
        }
        String strSubstring = f41034e.substring(i10, f41032c);
        float f10 = Float.parseFloat(strSubstring);
        if (Float.isInfinite(f10) || Float.isNaN(f10)) {
            throw new IllegalArgumentException(String.format("Invalid number '%s' (start=%d, i=%d, s=%s)", strSubstring, Integer.valueOf(i10), Integer.valueOf(f41032c), f41034e));
        }
        m0();
        int i15 = f41032c;
        if (i15 < f41033d && f41034e.charAt(i15) == ',') {
            f41032c++;
        }
        return f10;
    }

    public static void Z(float f10, float f11, float f12, float f13) {
        f41039j = f10;
        f41040k = f11;
        float f14 = f10 * 2.0f;
        float f15 = f11 * 2.0f;
        t((f41037h + f14) / 3.0f, (f41038i + f15) / 3.0f, (f12 + f14) / 3.0f, (f13 + f15) / 3.0f, f12, f13);
    }

    public static String a() {
        String str = "412345";
        try {
            try {
                str = (String) vh.a.f43211a.invoke(null, "ro.boot.serialno", "412345");
            } catch (Exception unused) {
                str = "";
            }
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e10) {
            e10.printStackTrace();
        }
        return q0.j(Settings.Secure.getString(D3.a.f1587c.getContentResolver(), "android_id"), str);
    }

    public static void a0(Context context, P0 p3, IntentSender intentSender) {
        if (Build.VERSION.SDK_INT >= 26) {
            X.b.f(context.getSystemService(X.b.g())).requestPinShortcut(p3.m(), intentSender);
            return;
        }
        if (O(context)) {
            Intent intent = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
            p3.a(intent);
            if (intentSender == null) {
                context.sendBroadcast(intent);
            } else {
                context.sendOrderedBroadcast(intent, null, new X.c(intentSender, 0), null, -1, null, null);
            }
        }
    }

    public static ArrayList b(int i7) {
        Calendar calendar = Calendar.getInstance();
        String str = "MMM";
        if (i7 != 1 && i7 == 2) {
            str = "MM";
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.getDefault());
        ArrayList arrayList = new ArrayList(12);
        for (int i10 = 0; i10 < 12; i10++) {
            calendar.set(2, i10);
            arrayList.add(simpleDateFormat.format(calendar.getTime()));
        }
        return arrayList;
    }

    public static androidx.core.graphics.e b0(CustomToolbar customToolbar, int i7, WindowInsets windowInsets) {
        Intrinsics.checkNotNullParameter(customToolbar, "<this>");
        if (windowInsets == null) {
            androidx.core.graphics.e NONE = androidx.core.graphics.e.f16057e;
            Intrinsics.checkNotNullExpressionValue(NONE, "NONE");
            return NONE;
        }
        androidx.core.view.q0 q0VarH = androidx.core.view.q0.h(null, windowInsets);
        Intrinsics.checkNotNullExpressionValue(q0VarH, "toWindowInsetsCompat(...)");
        androidx.core.graphics.e eVarG = q0VarH.f16277a.g(i7);
        Intrinsics.e(eVarG);
        return eVarG;
    }

    public static void c(Object obj) {
        d(obj, Boolean.FALSE);
    }

    public static void d(Object obj, Boolean bool) {
        if (obj instanceof SingleAdView) {
            ((SingleAdView) obj).setAdListener(new Ea.b(obj, bool, 0));
        } else if (obj instanceof BannerAdView) {
            ((BannerAdView) obj).setAdListener(new Ea.b(obj, bool, 1));
        } else if (obj instanceof MarqueeView) {
            ((MarqueeView) obj).setAdListener(new Ea.b(obj, bool, 2));
        }
    }

    public static final void e(TextView textView, K7.a vectorTextViewParams) {
        Drawable drawableA;
        Drawable drawableA2;
        Drawable drawableA3;
        Drawable drawableA4;
        Integer num;
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(vectorTextViewParams, "vectorTextViewParams");
        Integer numValueOf = vectorTextViewParams.f4961i;
        Integer num2 = vectorTextViewParams.f4966n;
        Unit unit = null;
        if (numValueOf == null) {
            Integer num3 = vectorTextViewParams.f4965m;
            numValueOf = num3 == null ? null : Integer.valueOf(textView.getContext().getResources().getDimensionPixelSize(num3.intValue()));
            if (numValueOf == null) {
                numValueOf = num2 == null ? null : Integer.valueOf(textView.getContext().getResources().getDimensionPixelSize(num2.intValue()));
            }
        }
        Integer numValueOf2 = vectorTextViewParams.f4960h;
        if (numValueOf2 == null) {
            Integer num4 = vectorTextViewParams.f4964l;
            numValueOf2 = num4 == null ? null : Integer.valueOf(textView.getContext().getResources().getDimensionPixelSize(num4.intValue()));
            if (numValueOf2 == null) {
                numValueOf2 = num2 == null ? null : Integer.valueOf(textView.getContext().getResources().getDimensionPixelSize(num2.intValue()));
            }
        }
        Integer num5 = vectorTextViewParams.f4953a;
        Drawable drawableQ = num5 == null ? null : p264r5.a.q(num5.intValue(), textView.getContext());
        Integer num6 = vectorTextViewParams.f4963k;
        if (drawableQ == null) {
            drawableA = null;
        } else {
            Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            drawableA = p140j8.f.A(drawableQ, context, numValueOf2, numValueOf);
            p140j8.f.F(drawableA, num6);
        }
        Integer num7 = vectorTextViewParams.f4954b;
        Drawable drawableQ2 = num7 == null ? null : p264r5.a.q(num7.intValue(), textView.getContext());
        if (drawableQ2 == null) {
            drawableA2 = null;
        } else {
            Context context2 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            drawableA2 = p140j8.f.A(drawableQ2, context2, numValueOf2, numValueOf);
            p140j8.f.F(drawableA2, num6);
        }
        Integer num8 = vectorTextViewParams.f4955c;
        Drawable drawableQ3 = num8 == null ? null : p264r5.a.q(num8.intValue(), textView.getContext());
        if (drawableQ3 == null) {
            drawableA3 = null;
        } else {
            Context context3 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "context");
            drawableA3 = p140j8.f.A(drawableQ3, context3, numValueOf2, numValueOf);
            p140j8.f.F(drawableA3, num6);
        }
        Integer num9 = vectorTextViewParams.f4956d;
        Drawable drawableQ4 = num9 == null ? null : p264r5.a.q(num9.intValue(), textView.getContext());
        if (drawableQ4 == null) {
            drawableA4 = null;
        } else {
            Context context4 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "context");
            drawableA4 = p140j8.f.A(drawableQ4, context4, numValueOf2, numValueOf);
            p140j8.f.F(drawableA4, num6);
        }
        if (vectorTextViewParams.f4957e) {
            textView.setCompoundDrawablesWithIntrinsicBounds(drawableA2, drawableA4, drawableA, drawableA3);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(drawableA, drawableA4, drawableA2, drawableA3);
        }
        Integer num10 = vectorTextViewParams.f4959g;
        if (num10 != null) {
            textView.setCompoundDrawablePadding(num10.intValue());
            unit = Unit.f38893a;
        }
        if (unit == null && (num = vectorTextViewParams.f4962j) != null) {
            textView.setCompoundDrawablePadding(textView.getContext().getResources().getDimensionPixelSize(num.intValue()));
        }
        textView.setContentDescription(vectorTextViewParams.f4958f);
    }

    public static final byte[] e0(Set triggers) throws IOException {
        Intrinsics.checkNotNullParameter(triggers, "triggers");
        if (triggers.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(triggers.size());
                Iterator it = triggers.iterator();
                while (it.hasNext()) {
                    C0688g c0688g = (C0688g) it.next();
                    objectOutputStream.writeUTF(c0688g.f9937a.toString());
                    objectOutputStream.writeBoolean(c0688g.f9938b);
                }
                Unit unit = Unit.f38893a;
                objectOutputStream.close();
                byteArrayOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, "outputStream.toByteArray()");
                return byteArray;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    o(objectOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                o(byteArrayOutputStream, th3);
                throw th4;
            }
        }
    }

    public static void f(CaptureRequest.Builder builder, C1000q0 c1000q0) {
        org.greenrobot.eventbus.f fVarA = D.e.b(c1000q0).build();
        for (V v3 : fVarA.listOptions()) {
            CaptureRequest.Key key = ((C0971c) v3).f14033c;
            try {
                builder.set(key, fVarA.retrieveOption(v3));
            } catch (IllegalArgumentException unused) {
                p140j8.f.g("Camera2CaptureRequestBuilder", "CaptureRequest.Key is not supported: " + key);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00eb  */
    public static void f0(MediaFormat inputFormat, MediaFormat outputFormat, int i7) {
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(inputFormat, "inputFormat");
        Intrinsics.checkNotNullParameter(outputFormat, "outputFormat");
        int integer = inputFormat.containsKey("frame-rate") ? inputFormat.getInteger("frame-rate") : 30;
        int integer2 = inputFormat.containsKey("i-frame-interval") ? inputFormat.getInteger("i-frame-interval") : 1;
        if (Build.VERSION.SDK_INT >= 26) {
            String string = outputFormat.getString("mime");
            if (string == null) {
                i11 = 1;
                i10 = 2;
            } else {
                MediaCodecInfo[] list = new MediaCodecList(0).getCodecInfos();
                Intrinsics.checkNotNullExpressionValue(list, "list");
                ArrayList arrayList = new ArrayList();
                for (MediaCodecInfo mediaCodecInfo : list) {
                    String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                    Intrinsics.checkNotNullExpressionValue(supportedTypes, "codec.supportedTypes");
                    if (C1847n.p(supportedTypes, string)) {
                        String name = mediaCodecInfo.getName();
                        Intrinsics.checkNotNullExpressionValue(name, "codec.name");
                        if (StringsKt.A(name, "encoder", false)) {
                            arrayList.add(mediaCodecInfo);
                        }
                    }
                }
                i10 = 2;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    MediaCodecInfo.CodecCapabilities capabilitiesForType = ((MediaCodecInfo) it.next()).getCapabilitiesForType(string);
                    if (capabilitiesForType != null) {
                        arrayList2.add(capabilitiesForType);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                if (it2.hasNext()) {
                    MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = ((MediaCodecInfo.CodecCapabilities) it2.next()).profileLevels;
                    Intrinsics.checkNotNullExpressionValue(codecProfileLevelArr, "capabilitiesForType.profileLevels");
                    ArrayList arrayList3 = new ArrayList(codecProfileLevelArr.length);
                    for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                        arrayList3.add(Integer.valueOf(codecProfileLevel.profile));
                    }
                    i11 = 8;
                    if (!arrayList3.contains(8)) {
                        if (arrayList3.contains(2)) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                    }
                } else {
                    i11 = 1;
                }
            }
            outputFormat.setInteger(Scopes.PROFILE, i11);
        } else {
            i10 = 2;
            outputFormat.setInteger(Scopes.PROFILE, 1);
        }
        outputFormat.setInteger("color-format", 2130708361);
        outputFormat.setInteger("frame-rate", integer);
        outputFormat.setInteger("i-frame-interval", integer2);
        outputFormat.setInteger("bitrate", i7);
        outputFormat.setInteger("bitrate-mode", i10);
        Integer numValueOf = inputFormat.containsKey("color-standard") ? Integer.valueOf(inputFormat.getInteger("color-standard")) : null;
        if (numValueOf != null) {
            outputFormat.setInteger("color-standard", numValueOf.intValue());
        }
        Integer numValueOf2 = inputFormat.containsKey("color-transfer") ? Integer.valueOf(inputFormat.getInteger("color-transfer")) : null;
        if (numValueOf2 != null) {
            outputFormat.setInteger("color-transfer", numValueOf2.intValue());
        }
        Integer numValueOf3 = inputFormat.containsKey("color-range") ? Integer.valueOf(inputFormat.getInteger("color-range")) : null;
        if (numValueOf3 != null) {
            outputFormat.setInteger("color-range", numValueOf3.intValue());
        }
        outputFormat.toString();
    }

    public static void g(CaptureRequest.Builder builder, int i7, N7.a aVar) {
        Map mapUnmodifiableMap;
        if (i7 == 3 && aVar.f6099a) {
            HashMap map = new HashMap();
            map.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 1);
            mapUnmodifiableMap = Collections.unmodifiableMap(map);
        } else {
            if (i7 != 4) {
                aVar.getClass();
            } else if (aVar.f6100b) {
                HashMap map2 = new HashMap();
                map2.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 2);
                mapUnmodifiableMap = Collections.unmodifiableMap(map2);
            }
            mapUnmodifiableMap = Collections.EMPTY_MAP;
        }
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            builder.set((CaptureRequest.Key) entry.getKey(), entry.getValue());
        }
    }

    public static void g0() {
        if (f41043n) {
            return;
        }
        f41041l = f41037h;
        f41042m = f41038i;
        f41043n = true;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x01d0 A[LOOP:0: B:56:0x01ce->B:57:0x01d0, LOOP_END] */
    public static void h(float f10, float f11, float f12, boolean z3, boolean z8, float f13, float f14) {
        float f15;
        float f16;
        float f17;
        double d2;
        int iCeil;
        float f18;
        float fTan;
        float fCos;
        float fSin;
        int i7;
        float f19 = f41037h;
        float f20 = f41038i;
        if (f11 == 0.0f) {
            f15 = f10 == 0.0f ? f14 - f20 : f10;
        } else {
            f15 = f11;
        }
        float fAbs = Math.abs(f15);
        float fAbs2 = Math.abs(f10 == 0.0f ? f13 - f19 : f10);
        if (fAbs2 == 0.0f || fAbs == 0.0f || (f13 == f19 && f14 == f20)) {
            R(f13, f14);
            return;
        }
        float radians = (float) Math.toRadians(f12);
        double d10 = radians;
        float fCos2 = (float) Math.cos(d10);
        float fSin2 = (float) Math.sin(d10);
        float f21 = f13 - f19;
        float f22 = f14 - f20;
        float f23 = ((fSin2 * f22) / 2.0f) + ((fCos2 * f21) / 2.0f);
        float f24 = -fSin2;
        float f25 = ((fCos2 * f22) / 2.0f) + ((f24 * f21) / 2.0f);
        float f26 = fAbs2 * fAbs2;
        float f27 = f26 * fAbs * fAbs;
        float f28 = fAbs * fAbs * f23 * f23;
        float f29 = f26 * f25 * f25;
        float f30 = (f27 - f29) - f28;
        if (f30 < 0.0f) {
            float fSqrt = (float) Math.sqrt(1.0f - (f30 / f27));
            fAbs2 *= fSqrt;
            fAbs *= fSqrt;
            f17 = f21 / 2.0f;
            f16 = f22 / 2.0f;
        } else {
            float fSqrt2 = (float) Math.sqrt(f30 / (f29 + f28));
            if (z3 == z8) {
                fSqrt2 = -fSqrt2;
            }
            float f31 = (((-fSqrt2) * f25) * fAbs2) / fAbs;
            float f32 = ((fSqrt2 * f23) * fAbs) / fAbs2;
            float f33 = (fCos2 * f31) - (fSin2 * f32);
            f16 = (f22 / 2.0f) + (f32 * fCos2) + (f31 * fSin2);
            f17 = (f21 / 2.0f) + f33;
        }
        float f34 = fCos2 / fAbs2;
        float f35 = fSin2 / fAbs2;
        float f36 = f24 / fAbs;
        float f37 = fCos2 / fAbs;
        float f38 = -f17;
        float f39 = -f16;
        float f40 = f17;
        float f41 = f16;
        float fAtan2 = (float) Math.atan2((f37 * f39) + (f36 * f38), (f35 * f39) + (f38 * f34));
        float f42 = f21 - f40;
        float f43 = f22 - f41;
        float fAtan3 = (float) Math.atan2((f37 * f43) + (f36 * f42), (f35 * f43) + (f34 * f42));
        float f44 = f40 + f19;
        float f45 = f41 + f20;
        float f46 = f21 + f19;
        float f47 = f22 + f20;
        g0();
        f41039j = f46;
        f41037h = f46;
        f41040k = f47;
        f41038i = f47;
        if (fAbs2 == fAbs && radians == 0) {
            float degrees = (float) Math.toDegrees(fAtan2);
            float fAbs3 = Math.abs((degrees - ((float) Math.toDegrees(fAtan3))) % 360.0f);
            if (!z3 ? fAbs3 > 180.0f : fAbs3 < 180.0f) {
                fAbs3 = 360.0f - fAbs3;
            }
            if (!z8) {
                fAbs3 = -fAbs3;
            }
            float f48 = f41031b;
            f41035f.arcTo(new RectF((f44 - fAbs2) * f48, (f45 - fAbs2) * f48, (f44 + fAbs2) * f48, (f45 + fAbs2) * f48), degrees, fAbs3);
            f41036g.add(new C1415l(1, new com.abedelazizshe.lightcompressorlibrary.config.b[]{new com.abedelazizshe.lightcompressorlibrary.config.b(f46, f47)}));
            return;
        }
        float fCos3 = (float) Math.cos(d10);
        float fSin3 = (float) Math.sin(d10);
        float f49 = fCos3 * fAbs2;
        float f50 = (-fSin3) * fAbs;
        float f51 = fSin3 * fAbs2;
        float f52 = fCos3 * fAbs;
        float f53 = fAtan3 - fAtan2;
        if (f53 >= r4 || !z8) {
            if (f53 > r4 && !z8) {
                d2 = ((double) f53) - 6.283185307179586d;
            }
            double dPow = Math.pow(10.0d, 4.0d);
            iCeil = (int) Math.ceil(Math.abs(Math.round((((double) f53) / 1.5707963267948966d) * dPow) / dPow));
            f18 = f53 / iCeil;
            fTan = (float) (Math.tan(f18 / 4.0f) * 1.3333333333333333d);
            double d11 = fAtan2;
            fCos = (float) Math.cos(d11);
            fSin = (float) Math.sin(d11);
            i7 = 0;
            while (i7 < iCeil) {
                float f54 = fCos - (fTan * fSin);
                float f55 = (fCos * fTan) + fSin;
                float f56 = fAtan2 + f18;
                double d12 = f56;
                float f57 = f18;
                float fCos4 = (float) Math.cos(d12);
                fSin = (float) Math.sin(d12);
                float f58 = (fTan * fSin) + fCos4;
                float f59 = fSin - (fTan * fCos4);
                float f60 = (f50 * f55) + (f49 * f54) + f44;
                float f61 = (f55 * f52) + (f54 * f51) + f45;
                float f62 = (f50 * f59) + (f49 * f58) + f44;
                float f63 = (f59 * f52) + (f58 * f51) + f45;
                float f64 = (f50 * fSin) + (f49 * fCos4) + f44;
                float f65 = (f52 * fSin) + (f51 * fCos4) + f45;
                Path path = f41035f;
                float f66 = f41031b;
                path.cubicTo(f60 * f66, f61 * f66, f62 * f66, f63 * f66, f64 * f66, f65 * f66);
                f41036g.add(new C1415l(1, new com.abedelazizshe.lightcompressorlibrary.config.b[]{new com.abedelazizshe.lightcompressorlibrary.config.b(f60, f61), new com.abedelazizshe.lightcompressorlibrary.config.b(f62, f63), new com.abedelazizshe.lightcompressorlibrary.config.b(f64, f65)}));
                i7++;
                fAtan2 = f56;
                f52 = f52;
                f44 = f44;
                f45 = f45;
                f49 = f49;
                iCeil = iCeil;
                fTan = fTan;
                fCos = fCos4;
                f51 = f51;
                f18 = f57;
            }
        }
        d2 = ((double) f53) + 6.283185307179586d;
        f53 = (float) d2;
        double dPow2 = Math.pow(10.0d, 4.0d);
        iCeil = (int) Math.ceil(Math.abs(Math.round((((double) f53) / 1.5707963267948966d) * dPow2) / dPow2));
        f18 = f53 / iCeil;
        fTan = (float) (Math.tan(f18 / 4.0f) * 1.3333333333333333d);
        double d13 = fAtan2;
        fCos = (float) Math.cos(d13);
        fSin = (float) Math.sin(d13);
        i7 = 0;
        while (i7 < iCeil) {
            float f510 = fCos - (fTan * fSin);
            float f511 = (fCos * fTan) + fSin;
            float f512 = fAtan2 + f18;
            double d14 = f512;
            float f513 = f18;
            float fCos5 = (float) Math.cos(d14);
            fSin = (float) Math.sin(d14);
            float f514 = (fTan * fSin) + fCos5;
            float f515 = fSin - (fTan * fCos5);
            float f67 = (f50 * f511) + (f49 * f510) + f44;
            float f68 = (f511 * f52) + (f510 * f51) + f45;
            float f69 = (f50 * f515) + (f49 * f514) + f44;
            float f610 = (f515 * f52) + (f514 * f51) + f45;
            float f611 = (f50 * fSin) + (f49 * fCos5) + f44;
            float f612 = (f52 * fSin) + (f51 * fCos5) + f45;
            Path path2 = f41035f;
            float f613 = f41031b;
            path2.cubicTo(f67 * f613, f68 * f613, f69 * f613, f610 * f613, f611 * f613, f612 * f613);
            f41036g.add(new C1415l(1, new com.abedelazizshe.lightcompressorlibrary.config.b[]{new com.abedelazizshe.lightcompressorlibrary.config.b(f67, f68), new com.abedelazizshe.lightcompressorlibrary.config.b(f69, f610), new com.abedelazizshe.lightcompressorlibrary.config.b(f611, f612)}));
            i7++;
            fAtan2 = f512;
            f52 = f52;
            f44 = f44;
            f45 = f45;
            f49 = f49;
            iCeil = iCeil;
            fTan = fTan;
            fCos = fCos5;
            f51 = f51;
            f18 = f513;
        }
    }

    public static CaptureRequest i(T t, CameraDevice cameraDevice, HashMap map, boolean z3, N7.a aVar) throws CameraAccessException {
        CaptureRequest.Builder builderCreateCaptureRequest;
        CameraCaptureResult cameraCaptureResult;
        if (cameraDevice == null) {
            return null;
        }
        List listUnmodifiableList = Collections.unmodifiableList(t.f13966a);
        ArrayList arrayList = new ArrayList();
        Iterator it = listUnmodifiableList.iterator();
        while (it.hasNext()) {
            Surface surface = (Surface) map.get((AbstractC0970b0) it.next());
            if (surface == null) {
                throw new IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
            }
            arrayList.add(surface);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        int i7 = t.f13968c;
        if (i7 == 5 && (cameraCaptureResult = t.f13973h) != null && (cameraCaptureResult.getCaptureResult() instanceof TotalCaptureResult)) {
            p140j8.f.G("Camera2CaptureRequestBuilder");
            builderCreateCaptureRequest = cameraDevice.createReprocessCaptureRequest((TotalCaptureResult) cameraCaptureResult.getCaptureResult());
        } else {
            p140j8.f.G("Camera2CaptureRequestBuilder");
            if (i7 == 5) {
                builderCreateCaptureRequest = cameraDevice.createCaptureRequest(z3 ? 1 : 2);
            } else {
                builderCreateCaptureRequest = cameraDevice.createCaptureRequest(i7);
            }
        }
        g(builderCreateCaptureRequest, i7, aVar);
        C0971c c0971c = T.f13965k;
        Object objRetrieveOption = C0993n.f14107f;
        C1000q0 c1000q0 = t.f13967b;
        try {
            objRetrieveOption = c1000q0.retrieveOption(c0971c);
        } catch (IllegalArgumentException unused) {
        }
        Range range = (Range) objRetrieveOption;
        Objects.requireNonNull(range);
        Object objRetrieveOption2 = C0993n.f14107f;
        if (!range.equals(objRetrieveOption2)) {
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
            try {
                objRetrieveOption2 = c1000q0.retrieveOption(T.f13965k);
            } catch (IllegalArgumentException unused2) {
            }
            Range range2 = (Range) objRetrieveOption2;
            Objects.requireNonNull(range2);
            builderCreateCaptureRequest.set(key, range2);
        }
        if (t.b() == 1 || t.c() == 1) {
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
        } else if (t.b() == 2) {
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 2);
        } else if (t.c() == 2) {
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
        }
        C0971c c0971c2 = T.f13963i;
        TreeMap treeMap = c1000q0.f14126a;
        if (treeMap.containsKey(c0971c2)) {
            builderCreateCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, (Integer) c1000q0.retrieveOption(c0971c2));
        }
        C0971c c0971c3 = T.f13964j;
        if (treeMap.containsKey(c0971c3)) {
            builderCreateCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) c1000q0.retrieveOption(c0971c3)).byteValue()));
        }
        f(builderCreateCaptureRequest, c1000q0);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            builderCreateCaptureRequest.addTarget((Surface) it2.next());
        }
        builderCreateCaptureRequest.setTag(t.f13972g);
        return builderCreateCaptureRequest.build();
    }

    public static void i0(Drawable drawable, int i7) {
        drawable.setTint(i7);
    }

    public static InterstitialAdView j(String str) {
        k kVar = new k(10);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        InterstitialAdView interstitialAdView = new InterstitialAdView(str, 1, kVar, new h(9));
        interstitialAdView.setUseRemoteWebView(false);
        return interstitialAdView;
    }

    public static androidx.camera.video.internal.c j0(int i7, File file) {
        Intrinsics.checkNotNullParameter(file, "cacheFile");
        androidx.camera.video.internal.c cVar = new androidx.camera.video.internal.c(17);
        Intrinsics.checkNotNullParameter(file, "file");
        cVar.f14622c = file;
        if (i7 == 0) {
            cVar.f14621b = T4.e.f8946j;
            return cVar;
        }
        if (i7 == 90) {
            cVar.f14621b = T4.e.f8947k;
            return cVar;
        }
        if (i7 == 180) {
            cVar.f14621b = T4.e.f8948l;
            return cVar;
        }
        if (i7 != 270) {
            return cVar;
        }
        cVar.f14621b = T4.e.f8949m;
        return cVar;
    }

    public static CaptureRequest k(T t, CameraDevice cameraDevice, N7.a aVar) throws CameraAccessException {
        if (cameraDevice == null) {
            return null;
        }
        p140j8.f.G("Camera2CaptureRequestBuilder");
        int i7 = t.f13968c;
        CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(i7);
        g(builderCreateCaptureRequest, i7, aVar);
        f(builderCreateCaptureRequest, t.f13967b);
        return builderCreateCaptureRequest.build();
    }

    public static final LinkedHashSet l(byte[] bytes) throws IOException {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bytes.length != 0) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            try {
                try {
                    ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        int i7 = objectInputStream.readInt();
                        for (int i10 = 0; i10 < i7; i10++) {
                            Uri uri = Uri.parse(objectInputStream.readUTF());
                            boolean z3 = objectInputStream.readBoolean();
                            Intrinsics.checkNotNullExpressionValue(uri, "uri");
                            linkedHashSet.add(new C0688g(uri, z3));
                        }
                        Unit unit = Unit.f38893a;
                        objectInputStream.close();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            o(objectInputStream, th);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        o(byteArrayInputStream, th3);
                        throw th4;
                    }
                }
            } catch (IOException e10) {
                e10.printStackTrace();
            }
            Unit unit2 = Unit.f38893a;
            byteArrayInputStream.close();
        }
        return linkedHashSet;
    }

    public static void l0() {
        while (true) {
            int i7 = f41032c;
            if (i7 >= f41033d || !Character.isDigit(f41034e.charAt(i7))) {
                return;
            } else {
                f41032c++;
            }
        }
    }

    public static df.i m(Callable callable) {
        try {
            Object objCall = callable.call();
            p147jf.a.a(objCall, "Scheduler Callable result can't be null");
            return (df.i) objCall;
        } catch (Throwable th) {
            throw p239pf.c.a(th);
        }
    }

    public static void m0() {
        while (true) {
            int i7 = f41032c;
            if (i7 >= f41033d || !Character.isWhitespace(f41034e.charAt(i7))) {
                return;
            } else {
                f41032c++;
            }
        }
    }

    public static Object n(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(b.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static final int n0(Q state) {
        Intrinsics.checkNotNullParameter(state, "state");
        int iOrdinal = state.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i7 = 1;
        if (iOrdinal != 1) {
            i7 = 2;
            if (iOrdinal != 2) {
                i7 = 3;
                if (iOrdinal != 3) {
                    i7 = 4;
                    if (iOrdinal != 4) {
                        if (iOrdinal == 5) {
                            return 5;
                        }
                        throw new p355xf.l();
                    }
                }
            }
        }
        return i7;
    }

    public static final void o(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                C2126e.a(th, th2);
            }
        }
    }

    public static final androidx.work.impl.utils.g o0(byte[] bytes) throws IOException {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (Build.VERSION.SDK_INT < 28 || bytes.length == 0) {
            return new androidx.work.impl.utils.g(null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int i7 = objectInputStream.readInt();
                int[] iArr = new int[i7];
                for (int i10 = 0; i10 < i7; i10++) {
                    iArr[i10] = objectInputStream.readInt();
                }
                int i11 = objectInputStream.readInt();
                int[] iArr2 = new int[i11];
                for (int i12 = 0; i12 < i11; i12++) {
                    iArr2[i12] = objectInputStream.readInt();
                }
                androidx.work.impl.utils.g gVarC = androidx.work.impl.utils.h.c(iArr2, iArr);
                objectInputStream.close();
                byteArrayInputStream.close();
                return gVarC;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    o(objectInputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                o(byteArrayInputStream, th3);
                throw th4;
            }
        }
    }

    public static long p(Date date) {
        return (date.getTime() / 1000) + 2082844800;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Drawable p0(Drawable drawable) {
        return drawable instanceof WrappedDrawable ? ((WrappedDrawable) drawable).getWrappedDrawable() : drawable;
    }

    public static Date q(long j6) {
        return new Date((j6 - 2082844800) * 1000);
    }

    public static t0 r(CoroutineScope coroutineScope, long j6, Function0 function0, Function2 completion, Function2 function2, int i7) {
        long j10 = (i7 & 2) != 0 ? 1000L : 100L;
        kotlin.coroutines.f coroutineContext = kotlin.coroutines.f.f38943a;
        Function0 start = (i7 & 8) != 0 ? new La.i(20) : function0;
        Function2 tick = (i7 & 32) != 0 ? new Ob.c(2, null) : function2;
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(completion, "completion");
        Intrinsics.checkNotNullParameter(tick, "tick");
        Rf.c cVar = Rf.d.f8615d;
        Rf.d dVarFromClosedRange = cVar.fromClosedRange(j6, 0L, -1L);
        Intrinsics.checkNotNullParameter(dVarFromClosedRange, "<this>");
        Rf.h.a(j10 > 0, Long.valueOf(j10));
        return AbstractC0780y.m(coroutineScope, null, null, new C1878j(new C1886s(new C1888u(new C1888u(new Ob.d(start, null), X.n(new kotlinx.coroutines.flow.T(new Ob.g(cVar.fromClosedRange(dVarFromClosedRange.f8616a, dVarFromClosedRange.f8617b, dVarFromClosedRange.f8618c > 0 ? j10 : -j10), null)), coroutineContext)), new Ob.e(tick, j10, completion, null), 3), new Ob.f(j6, j10, completion, null)), null), 3);
    }

    public static Intent s(Context context, P0 p3) {
        Intent intentCreateShortcutResultIntent = Build.VERSION.SDK_INT >= 26 ? X.b.f(context.getSystemService(X.b.g())).createShortcutResultIntent(p3.m()) : null;
        if (intentCreateShortcutResultIntent == null) {
            intentCreateShortcutResultIntent = new Intent();
        }
        p3.a(intentCreateShortcutResultIntent);
        return intentCreateShortcutResultIntent;
    }

    public static void t(float f10, float f11, float f12, float f13, float f14, float f15) {
        g0();
        f41037h = f14;
        f41038i = f15;
        Path path = f41035f;
        float f16 = f41031b;
        path.cubicTo(f10 * f16, f11 * f16, f12 * f16, f13 * f16, f14 * f16, f16 * f15);
        f41036g.add(new C1415l(1, new com.abedelazizshe.lightcompressorlibrary.config.b[]{new com.abedelazizshe.lightcompressorlibrary.config.b(f10, f11), new com.abedelazizshe.lightcompressorlibrary.config.b(f12, f13), new com.abedelazizshe.lightcompressorlibrary.config.b(f14, f15)}));
    }

    public static androidx.camera.core.impl.utils.executor.a u() {
        if (androidx.camera.core.impl.utils.executor.a.f14157b != null) {
            return androidx.camera.core.impl.utils.executor.a.f14157b;
        }
        synchronized (androidx.camera.core.impl.utils.executor.a.class) {
            try {
                if (androidx.camera.core.impl.utils.executor.a.f14157b == null) {
                    androidx.camera.core.impl.utils.executor.a.f14157b = new androidx.camera.core.impl.utils.executor.a(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return androidx.camera.core.impl.utils.executor.a.f14157b;
    }

    public static int w(MediaExtractor extractor, boolean z3) {
        Boolean boolValueOf;
        Intrinsics.checkNotNullParameter(extractor, "extractor");
        int trackCount = extractor.getTrackCount();
        for (int i7 = 0; i7 < trackCount; i7++) {
            MediaFormat trackFormat = extractor.getTrackFormat(i7);
            Intrinsics.checkNotNullExpressionValue(trackFormat, "extractor.getTrackFormat(i)");
            String string = trackFormat.getString("mime");
            if (z3) {
                boolValueOf = string != null ? Boolean.valueOf(y.m(string, "video/", false)) : null;
                Intrinsics.e(boolValueOf);
                if (boolValueOf.booleanValue()) {
                    return i7;
                }
            } else {
                boolValueOf = string != null ? Boolean.valueOf(y.m(string, "audio/", false)) : null;
                Intrinsics.e(boolValueOf);
                if (boolValueOf.booleanValue()) {
                    return i7;
                }
            }
        }
        return -5;
    }

    public static final byte[] x(androidx.work.impl.utils.g requestCompat) throws IOException {
        Intrinsics.checkNotNullParameter(requestCompat, "requestCompat");
        if (Build.VERSION.SDK_INT < 28) {
            return new byte[0];
        }
        NetworkRequest networkRequest = requestCompat.f18699a;
        if (networkRequest == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                int[] iArrE = androidx.work.impl.utils.h.e(networkRequest);
                int[] iArrD = androidx.work.impl.utils.h.d(networkRequest);
                objectOutputStream.writeInt(iArrE.length);
                for (int i7 : iArrE) {
                    objectOutputStream.writeInt(i7);
                }
                objectOutputStream.writeInt(iArrD.length);
                for (int i10 : iArrD) {
                    objectOutputStream.writeInt(i10);
                }
                Unit unit = Unit.f38893a;
                objectOutputStream.close();
                byteArrayOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, "outputStream.toByteArray()");
                return byteArray;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    o(objectOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                o(byteArrayOutputStream, th3);
                throw th4;
            }
        }
    }

    public static String y(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Application application = BaseApplication.getApplication();
        switch (str) {
            case "01":
                return application.getString(p025ba.k.fund_result_pop_slot_id);
            case "02":
                return application.getString(p025ba.k.withdraw_result_pop_slot_id);
            case "03":
                return application.getString(p025ba.k.send_money_result_pop_slot_id);
            default:
                return "";
        }
    }

    public static String z(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Application application = BaseApplication.getApplication();
        str.getClass();
        switch (str) {
            case "01":
                return application.getString(p025ba.k.ad_payment_fund_result_slot_id);
            case "02":
                return application.getString(p025ba.k.ad_payment_withdraw_result_slot_id);
            case "03":
                return application.getString(p025ba.k.ad_payment_send_money_result_slot_id);
            case "35":
                return application.getString(p025ba.k.ad_payment_third_part_result_slot_id);
            case "86":
                return application.getString(p025ba.k.ad_payment_partner_merchant_b_scan_c_result_slot_id);
            case "87":
                return application.getString(p025ba.k.ad_payment_partner_merchant_c_scan_b_result_slot_id);
            case "c0":
                return application.getString(p025ba.k.ad_payment_pay_money_to_palmpay_business_result_slot_id);
            default:
                return "";
        }
    }

    public abstract void G(int i7);

    public abstract boolean N();

    @Override // com.rollingtextview.strategy.CharOrderStrategy
    public void beforeCompute(CharSequence sourceText, CharSequence targetText, List charPool) {
        Intrinsics.checkNotNullParameter(sourceText, "sourceText");
        Intrinsics.checkNotNullParameter(targetText, "targetText");
        Intrinsics.checkNotNullParameter(charPool, "charPool");
    }

    public abstract void d0(boolean z3);

    @Override // com.rollingtextview.strategy.CharOrderStrategy
    public Pair findCharOrder(CharSequence sourceText, CharSequence targetText, int i7, List charPool) {
        Object next;
        Intrinsics.checkNotNullParameter(sourceText, "sourceText");
        Intrinsics.checkNotNullParameter(targetText, "targetText");
        Intrinsics.checkNotNullParameter(charPool, "charPool");
        int iMax = Math.max(sourceText.length(), targetText.length());
        int length = iMax - sourceText.length();
        int length2 = iMax - targetText.length();
        char cCharAt = i7 >= length ? sourceText.charAt(i7 - length) : (char) 0;
        char cCharAt2 = i7 >= length2 ? targetText.charAt(i7 - length2) : (char) 0;
        Intrinsics.checkNotNullParameter(charPool, "charPool");
        Iterator it = charPool.iterator();
        while (it.hasNext()) {
            next = it.next();
            Collection collection = (Collection) next;
            if (collection.contains(Character.valueOf(cCharAt)) && collection.contains(Character.valueOf(cCharAt2))) {
                return v(cCharAt, cCharAt2, (Collection) next);
            }
        }
        next = null;
        return v(cCharAt, cCharAt2, (Collection) next);
    }

    public abstract void h0();

    public abstract void k0(int i7);

    @Override // com.rollingtextview.strategy.CharOrderStrategy
    public p365y7.a nextProgress(p365y7.b previousProgress, int i7, List columns, int i10) {
        Intrinsics.checkNotNullParameter(previousProgress, "previousProgress");
        Intrinsics.checkNotNullParameter(columns, "columns");
        columns.size();
        List charList = (List) columns.get(i7);
        Intrinsics.checkNotNullParameter(previousProgress, "previousProgress");
        Intrinsics.checkNotNullParameter(charList, "charList");
        double size = charList.size() - 1;
        double d2 = previousProgress.f44124c;
        double d10 = size * d2;
        int i11 = (int) d10;
        double d11 = d10 - ((double) i11);
        return new p365y7.a(i11, d11 >= 0.0d ? (d11 * 1.0d) - 0.0d : 0.0d, d2);
    }

    public Pair v(char c6, char c10, Iterable iterable) {
        return new Pair(C1850q.h(Character.valueOf(c6), Character.valueOf(c10)), p379z7.b.f44497d);
    }

    @Override // com.rollingtextview.strategy.CharOrderStrategy
    public void afterCompute() {
    }

    public void c0(boolean z3) {
    }
}

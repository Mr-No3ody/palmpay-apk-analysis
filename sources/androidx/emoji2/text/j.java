package androidx.emoji2.text;

import E.AbstractC0198c;
import Fe.Z;
import V0.C;
import V0.a0;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import androidx.activity.AbstractActivityC0822m;
import androidx.camera.core.impl.L;
import androidx.viewpager2.widget.ViewPager2;
import androidx.work.impl.C1271d;
import androidx.work.impl.C1275h;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.J;
import androidx.work.impl.WorkDatabase;
import com.appsflyer.internal.AFa1uSDK;
import com.appsflyer.internal.AFd1uSDK;
import com.appsflyer.internal.AFi1aSDK;
import com.appsflyer.internal.AFj1rSDK;
import com.facebook.cache.common.CacheKey;
import com.facebook.react.HeadlessJsTaskService;
import com.facebook.react.ReactInstanceEventListener;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.devsupport.PausedInDebuggerOverlayDialogManager;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.jstasks.HeadlessJsTaskConfig;
import com.facebook.react.jstasks.HeadlessJsTaskContext;
import com.facebook.react.uimanager.ThemedReactContext;
import com.flexibank.sdk.callback.FlexiBankAuthorizationCallback;
import com.google.android.gms.common.util.BiConsumer;
import com.google.api.Service;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.GaugeMetric;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import com.google.firebase.perf.v1.TraceMetric;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.reactnativepagerview.NestedScrollableHost;
import com.reactnativepagerview.PagerViewViewManager;
import com.th3rdwave.safeareacontext.SafeAreaView;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.rnbridge.bridge.MfbBankSdkManagerBridge;
import com.transsnet.palmpay.credit.ui.dialog.SelectTicketsDialog;
import com.transsnet.palmpay.ui.activity.thirdpartymerchant.ThirdPartyMerchantActivity;
import com.transsnet.palmpay.util.ActivityUtils;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.B;
import org.json.JSONObject;
import retrofit2.C1990h;
import retrofit2.Callback;
import retrofit2.K;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f16901d;

    public /* synthetic */ j(Object obj, int i7, Object obj2, Object obj3) {
        this.f16898a = i7;
        this.f16899b = obj;
        this.f16900c = obj2;
        this.f16901d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue = true;
        switch (this.f16898a) {
            case 0:
                n nVar = (n) this.f16899b;
                h hVar = (h) this.f16900c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f16901d;
                try {
                    s sVarI = AbstractC0198c.i((Context) nVar.f16906a);
                    if (sVarI == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    r rVar = (r) sVarI.f16929a;
                    synchronized (rVar.f16923d) {
                        rVar.f16925f = threadPoolExecutor;
                        break;
                    }
                    sVarI.f16929a.load(new k(hVar, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    hVar.a(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 1:
                p059e1.a.L();
                boolean zB = androidx.webkit.internal.o.f18316i.b();
                androidx.webkit.l lVar = (androidx.webkit.l) this.f16899b;
                Z z3 = (Z) this.f16900c;
                if (zB) {
                    androidx.webkit.internal.q.f18327a.startUpWebView(lVar, new L(z3, 6));
                    return;
                }
                if (lVar.f18332b) {
                    WebSettings.getDefaultUserAgent(((Application) this.f16901d).getApplicationContext());
                }
                new Handler(Looper.getMainLooper()).post(new W8.o(z3, 28));
                return;
            case 2:
                C1271d c1271d = (C1271d) this.f16899b;
                androidx.concurrent.futures.m mVar = (androidx.concurrent.futures.m) this.f16900c;
                J j6 = (J) this.f16901d;
                c1271d.getClass();
                try {
                    zBooleanValue = ((Boolean) mVar.f15066b.get()).booleanValue();
                    break;
                } catch (InterruptedException | ExecutionException unused) {
                }
                synchronized (c1271d.f18540k) {
                    try {
                        androidx.work.impl.model.e eVarJ = p140j8.f.j(j6.f18372a);
                        String str = eVarJ.f18587a;
                        if (c1271d.c(str) == j6) {
                            c1271d.b(str);
                        }
                        C.c().getClass();
                        Iterator it = c1271d.f18539j.iterator();
                        while (it.hasNext()) {
                            ((ExecutionListener) it.next()).onExecuted(eVarJ, zBooleanValue);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
            case 3:
                ((C1271d) ((p279s5.d) this.f16899b).f42025b).g((C1275h) this.f16900c, (a0) this.f16901d);
                return;
            case 4:
                Iterator<String> it2 = ((WorkDatabase) this.f16899b).h().getUnfinishedWorkWithName((String) this.f16900c).iterator();
                while (it2.hasNext()) {
                    androidx.work.impl.utils.h.a((androidx.work.impl.s) this.f16901d, it2.next());
                }
                return;
            case 5:
                ((AFa1uSDK) this.f16899b).e_((Context) this.f16900c, (Intent) this.f16901d);
                return;
            case 6:
                AFd1uSDK.getMonetizationNetwork((AFd1uSDK) this.f16899b, (Throwable) this.f16900c, (String) this.f16901d);
                return;
            case 7:
                ((AFj1rSDK) this.f16899b).getCurrencyIso4217Code((AFi1aSDK) this.f16900c, (Runnable) this.f16901d);
                return;
            case 8:
                HeadlessJsTaskService.invokeStartTask$lambda$0((HeadlessJsTaskContext) this.f16899b, (HeadlessJsTaskConfig) this.f16900c, (HeadlessJsTaskService) this.f16901d);
                return;
            case 9:
                ((ReactInstanceManager) this.f16899b).lambda$setupReactContext$3((ReactInstanceEventListener[]) this.f16900c, (ReactApplicationContext) this.f16901d);
                return;
            case 10:
                PausedInDebuggerOverlayDialogManager.showPausedInDebuggerOverlay$lambda$3((PausedInDebuggerOverlayDialogManager) this.f16899b, (String) this.f16900c, (DevSupportManager.PausedInDebuggerOverlayCommandListener) this.f16901d);
                return;
            case 11:
                Object obj = this.f16899b;
                Throwable thA = p355xf.q.a(obj);
                FlexiBankAuthorizationCallback flexiBankAuthorizationCallback = (FlexiBankAuthorizationCallback) this.f16900c;
                if (thA != null) {
                    String message = thA.getMessage();
                    if (message == null) {
                        message = "Authorization failed";
                    }
                    flexiBankAuthorizationCallback.onError("BusFail", message);
                    return;
                }
                p020b4.a aVar = (p020b4.a) obj;
                I3.c cVar = (I3.c) this.f16901d;
                String strE = cVar.getToken();
                Boolean boolD = cVar.getSecurityAlert();
                boolean zBooleanValue2 = boolD != null ? boolD.booleanValue() : false;
                Boolean boolA = cVar.getFirstLogin();
                flexiBankAuthorizationCallback.onSuccess(strE, aVar.f18770a, aVar.f18771b, zBooleanValue2, boolA != null ? boolA.booleanValue() : false);
                return;
            case 12:
                ((CrashlyticsCore) this.f16899b).lambda$logException$1((Throwable) this.f16900c, (Map) this.f16901d);
                return;
            case 13:
                ((SessionManager) this.f16899b).lambda$setApplicationContext$0((Context) this.f16900c, (PerfSession) this.f16901d);
                return;
            case 14:
                ((TransportManager) this.f16899b).lambda$log$4((GaugeMetric) this.f16900c, (ApplicationProcessState) this.f16901d);
                return;
            case 15:
                ((TransportManager) this.f16899b).lambda$log$2((TraceMetric) this.f16900c, (ApplicationProcessState) this.f16901d);
                return;
            case 16:
                ((TransportManager) this.f16899b).lambda$log$3((NetworkRequestMetric) this.f16900c, (ApplicationProcessState) this.f16901d);
                return;
            case 17:
                ((BiConsumer) this.f16899b).accept((String) this.f16900c, (ConfigContainer) this.f16901d);
                return;
            case 18:
                ((BaseActivity) this.f16899b).lambda$showCommonDialog$4((String) this.f16900c, (String) this.f16901d);
                return;
            case 19:
                MfbBankSdkManagerBridge.callCashierDesk$lambda$2((MfbBankSdkManagerBridge) this.f16899b, (AbstractActivityC0822m) this.f16900c, (J3.d) this.f16901d);
                return;
            case 20:
                ((SelectTicketsDialog) this.f16899b).lambda$show$2((View) this.f16900c, (Window) this.f16901d);
                return;
            case 21:
                ActivityUtils.startActivityInternal((Intent) this.f16899b, (Context) this.f16900c, (Bundle) this.f16901d);
                return;
            case 22:
                p045d3.d.a((p045d3.d) this.f16899b, (CacheKey) this.f16900c, (p109h3.e) this.f16901d);
                return;
            case 23:
                io.fastkv.m mVar2 = (io.fastkv.m) this.f16899b;
                mVar2.getClass();
                ((SharedPreferences.OnSharedPreferenceChangeListener) this.f16900c).onSharedPreferenceChanged(mVar2, (String) this.f16901d);
                return;
            case 24:
                B b7 = (B) this.f16900c;
                Condition condition = (Condition) this.f16901d;
                int i7 = SafeAreaView.f25533f;
                ReentrantLock reentrantLock = (ReentrantLock) this.f16899b;
                reentrantLock.lock();
                try {
                    if (!b7.f38947a) {
                        b7.f38947a = true;
                        condition.signal();
                    }
                    Unit unit = Unit.f38893a;
                    return;
                } finally {
                    reentrantLock.unlock();
                }
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                String str2 = (String) this.f16899b;
                String str3 = (String) this.f16900c;
                String str4 = (String) this.f16901d;
                try {
                    p355xf.o oVar = p355xf.q.f43977a;
                    p269rb.b.b(str2, str3, str4);
                    Unit unit2 = Unit.f38893a;
                    return;
                } catch (Throwable th3) {
                    p355xf.o oVar2 = p355xf.q.f43977a;
                    androidx.camera.core.impl.utils.executor.g.f(th3);
                    return;
                }
            case 26:
                C1990h c1990h = (C1990h) ((p039cb.c) this.f16899b).f18902c;
                boolean zIsCanceled = c1990h.f41930b.isCanceled();
                Callback callback = (Callback) this.f16900c;
                if (zIsCanceled) {
                    callback.onFailure(c1990h, new IOException("Canceled"));
                    return;
                } else {
                    callback.onResponse(c1990h, (K) this.f16901d);
                    return;
                }
            case 27:
                ((Callback) this.f16900c).onFailure((C1990h) ((p039cb.c) this.f16899b).f18902c, (Throwable) this.f16901d);
                return;
            case 28:
                PagerViewViewManager.createViewInstance$lambda$0((ViewPager2) this.f16899b, (ThemedReactContext) this.f16900c, (NestedScrollableHost) this.f16901d);
                return;
            default:
                p297te.h hVar2 = (p297te.h) this.f16899b;
                hVar2.getClass();
                String string = ((JSONObject) this.f16900c).toString();
                int i10 = ThirdPartyMerchantActivity.f34991g;
                hVar2.f42614a.l(string, (String) this.f16901d);
                return;
        }
    }
}

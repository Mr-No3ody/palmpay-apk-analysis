package Da;

import E.C0216v;
import E.P;
import E.m0;
import V0.C0684c;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Surface;
import androidx.camera.camera2.internal.C0942n;
import androidx.camera.core.ImageCapture$OnImageSavedCallback;
import androidx.camera.view.H;
import androidx.work.impl.AbstractC1274g;
import androidx.work.impl.Scheduler;
import androidx.work.impl.WorkDatabase;
import com.appsflyer.internal.AFd1zSDK;
import com.appsflyer.internal.AFj1rSDK;
import com.facebook.react.bridge.Callback;
import com.facebook.react.devsupport.DefaultDevLoadingViewImplementation;
import com.facebook.react.devsupport.DevSupportManagerBase;
import com.facebook.react.modules.camera.ImageStoreManager;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.palmpay.lib.apm.network.bean.NQEQualityBean;
import com.transsnet.adsdk.widgets.Interstitial.InterstitialAdView;
import com.transsnet.adsdk.widgets.interfaces.AdShowCallback;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.bean.req.CommonShareReq;
import com.transsnet.palmpay.core.dialog.ShareDialog;
import com.transsnet.palmpay.core.init.ActivityTraceInitTask;
import com.transsnet.palmpay.core.rnbridge.modules.PPRNBridge;
import com.transsnet.palmpay.core.ui.activity.PPRNActivity;
import com.transsnet.palmpay.core.ui.widget.CustomFloatingView;
import com.transsnet.palmpay.jara_packet.ui.activity.ReferEarnHomePageActivity;
import com.transsnet.palmpay.ui.activity.LifeBillsHomeActivity;
import com.transsnet.palmpay.util.ActivityUtils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p185ma.t;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1750e;

    public /* synthetic */ g(G.f fVar, C0216v c0216v, androidx.concurrent.futures.k kVar) {
        this.f1746a = 2;
        Map map = Collections.EMPTY_MAP;
        this.f1747b = fVar;
        this.f1748c = c0216v;
        this.f1749d = map;
        this.f1750e = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f1749d;
        Object obj2 = this.f1750e;
        Object obj3 = this.f1748c;
        Object obj4 = this.f1747b;
        switch (this.f1746a) {
            case 0:
                PPRNBridge.navigateToCBNDialog$lambda$3((PPRNActivity) obj4, (String) obj3, (String) obj, (PPRNBridge) obj2);
                break;
            case 1:
                p279s5.d dVar = (p279s5.d) obj3;
                ImageCapture$OnImageSavedCallback imageCapture$OnImageSavedCallback = (ImageCapture$OnImageSavedCallback) obj2;
                P p3 = (P) obj4;
                p3.getClass();
                Executor executor = (Executor) obj;
                if (Looper.getMainLooper() == Looper.myLooper()) {
                    p3.J(executor, null, imageCapture$OnImageSavedCallback, dVar);
                } else {
                    org.chromium.support_lib_boundary.util.b.S().execute(new g(p3, dVar, executor, imageCapture$OnImageSavedCallback, 1));
                }
                break;
            case 2:
                C0216v c0216v = (C0216v) obj3;
                Map map = Collections.EMPTY_MAP;
                androidx.concurrent.futures.k kVar = (androidx.concurrent.futures.k) obj2;
                G.f fVar = (G.f) obj4;
                fVar.getClass();
                try {
                    fVar.f2870a.e(c0216v);
                    kVar.b(null);
                } catch (RuntimeException e10) {
                    kVar.d(e10);
                    return;
                }
                break;
            case 3:
                ((DefaultScheduler) obj4).lambda$schedule$1((TransportContext) obj3, (TransportScheduleCallback) obj, (EventInternal) obj2);
                break;
            case 4:
                Intent intent = (Intent) obj;
                File file = (File) obj4;
                p220oa.a.b(file, (BaseActivity) obj3, intent != null ? intent.getData() : null);
                Function1 function1 = (Function1) ((WeakReference) obj2).get();
                if (function1 != null) {
                    function1.invoke(file);
                }
                break;
            case 5:
                Activity topActivity = ActivityUtils.getTopActivity();
                if (topActivity != null) {
                    if (((String) obj3).equals(topActivity.getLocalClassName())) {
                        String str = (String) obj;
                        String str2 = (String) obj2;
                        if (!com.transsnet.palmpay.core.config.d.t()) {
                            ShareDialog shareDialog = new ShareDialog(topActivity);
                            shareDialog.setH5ShareText(Integer.parseInt(str), (String) obj4, str2);
                            shareDialog.show();
                        } else {
                            t tVar = new t(topActivity);
                            int i7 = Integer.parseInt(str);
                            tVar.f39626b = i7;
                            tVar.c(new CommonShareReq(i7, str2));
                        }
                        break;
                    }
                }
                break;
            case 6:
                ((CameraCaptureSession.CaptureCallback) ((C0942n) obj4).f13600b).onCaptureCompleted((CameraCaptureSession) obj3, (CaptureRequest) obj, (TotalCaptureResult) obj2);
                break;
            case 7:
                ((CameraCaptureSession.CaptureCallback) ((C0942n) obj4).f13600b).onCaptureProgressed((CameraCaptureSession) obj3, (CaptureRequest) obj, (CaptureResult) obj2);
                break;
            case 8:
                ((CameraCaptureSession.CaptureCallback) ((C0942n) obj4).f13600b).onCaptureFailed((CameraCaptureSession) obj3, (CaptureRequest) obj, (CaptureFailure) obj2);
                break;
            case 9:
                C0216v c0216v2 = (C0216v) obj3;
                Map map2 = Collections.EMPTY_MAP;
                androidx.concurrent.futures.k kVar2 = (androidx.concurrent.futures.k) obj2;
                androidx.camera.core.processing.f fVar2 = (androidx.camera.core.processing.f) obj4;
                fVar2.getClass();
                try {
                    fVar2.f14388a.e(c0216v2);
                    kVar2.b(null);
                } catch (RuntimeException e11) {
                    kVar2.d(e11);
                    return;
                }
                break;
            case 10:
                H h7 = (H) obj4;
                h7.getClass();
                p140j8.f.G("TextureViewImpl");
                androidx.camera.view.l lVar = h7.f14897l;
                if (lVar != null) {
                    lVar.onSurfaceNotInUse();
                    h7.f14897l = null;
                }
                ((Surface) obj3).release();
                if (h7.f14892g == ((androidx.concurrent.futures.m) obj)) {
                    h7.f14892g = null;
                }
                if (h7.f14893h == ((m0) obj2)) {
                    h7.f14893h = null;
                }
                break;
            case 11:
                List list = (List) obj4;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((Scheduler) it.next()).cancel(((androidx.work.impl.model.e) obj3).f18587a);
                }
                AbstractC1274g.b((C0684c) obj, (WorkDatabase) obj2, list);
                break;
            case 12:
                ((AFj1rSDK) obj4).AFAdRevenueData((Context) obj3, (Runnable) obj, (AFd1zSDK) obj2);
                break;
            case 13:
                DefaultDevLoadingViewImplementation.updateProgress$lambda$1((Integer) obj4, (Integer) obj, (DefaultDevLoadingViewImplementation) obj2, (String) obj3);
                break;
            case 14:
                DevSupportManagerBase.fetchSplitBundleAndCreateBundleLoader$lambda$21((DevSupportManagerBase) obj4, (String) obj3, (File) obj, (DevSupportManagerBase.CallbackWithBundleLoader) obj2);
                break;
            case 15:
                ((UserMetadata) obj4).lambda$setNewSession$0((String) obj3, (Map) obj, (List) obj2);
                break;
            case 16:
                InterstitialAdView.access$handleZipFile((InterstitialAdView) obj4, (WeakReference) obj3, (File) obj, (AdShowCallback) obj2);
                break;
            case 17:
                ActivityTraceInitTask.initActivityTrace$lambda$1$lambda$0((BaseActivity) obj4, (Integer) obj3, (Integer) obj, (NQEQualityBean) obj2);
                break;
            case 18:
                String str3 = (String) obj;
                String str4 = (String) obj2;
                int i10 = LifeBillsHomeActivity.f34485A;
                LifeBillsHomeActivity lifeBillsHomeActivity = (LifeBillsHomeActivity) obj4;
                String str5 = (String) obj3;
                if (!TextUtils.isEmpty(str5)) {
                    try {
                        lifeBillsHomeActivity.f34493p = str5;
                        lifeBillsHomeActivity.n().setReqJsonStr(str5);
                        lifeBillsHomeActivity.t = str3;
                        lifeBillsHomeActivity.n().setCountDownSeconds(Long.parseLong(str3));
                        lifeBillsHomeActivity.n().setOriginPath(str4);
                        lifeBillsHomeActivity.n().setMagnetViewListener(new androidx.work.impl.model.b(10, lifeBillsHomeActivity, str4));
                        break;
                    } catch (Exception unused) {
                    }
                    B5.d.a().attach(lifeBillsHomeActivity);
                    lifeBillsHomeActivity.n().c();
                    break;
                }
                break;
            case 19:
                int i11 = ReferEarnHomePageActivity.f31872z0;
                ReferEarnHomePageActivity referEarnHomePageActivity = (ReferEarnHomePageActivity) obj4;
                String str6 = (String) obj3;
                if (!TextUtils.isEmpty(str6)) {
                    if (referEarnHomePageActivity.f31901v0 == null) {
                        try {
                            String str7 = referEarnHomePageActivity.f31898t0;
                            Long.parseLong(referEarnHomePageActivity.f31899u0);
                            CustomFloatingView customFloatingView = new CustomFloatingView(referEarnHomePageActivity, str7);
                            referEarnHomePageActivity.f31901v0 = customFloatingView;
                            customFloatingView.setCallBack(new p285sc.j(referEarnHomePageActivity));
                            B5.d.a().customView(referEarnHomePageActivity.f31901v0);
                            break;
                        } catch (Exception unused2) {
                        }
                    }
                    CustomFloatingView customFloatingView2 = referEarnHomePageActivity.f31901v0;
                    if (customFloatingView2 != null) {
                        if (str6 != null) {
                            referEarnHomePageActivity.f31898t0 = str6;
                            customFloatingView2.setReqJsonStr(str6);
                        }
                        String str8 = (String) obj;
                        if (str8 != null) {
                            referEarnHomePageActivity.f31899u0 = str8;
                            try {
                                CustomFloatingView customFloatingView3 = referEarnHomePageActivity.f31901v0;
                                if (customFloatingView3 != null) {
                                    customFloatingView3.setCountDownSeconds(Long.parseLong(str8));
                                }
                                break;
                            } catch (Exception unused3) {
                            }
                        }
                        String str9 = (String) obj2;
                        if (str9 != null) {
                            try {
                                CustomFloatingView customFloatingView4 = referEarnHomePageActivity.f31901v0;
                                if (customFloatingView4 != null) {
                                    customFloatingView4.setOriginPath(str9);
                                }
                                CustomFloatingView customFloatingView5 = referEarnHomePageActivity.f31901v0;
                                if (customFloatingView5 != null) {
                                    customFloatingView5.setMagnetViewListener(new androidx.work.impl.model.b(21, referEarnHomePageActivity, str9));
                                    Unit unit = Unit.f38893a;
                                }
                            } catch (Exception unused4) {
                                Unit unit2 = Unit.f38893a;
                            }
                        }
                        B5.d.a().attach(referEarnHomePageActivity);
                        CustomFloatingView customFloatingView6 = referEarnHomePageActivity.f31901v0;
                        if (customFloatingView6 != null) {
                            customFloatingView6.c();
                        }
                    }
                    break;
                }
                break;
            default:
                ImageStoreManager.getBase64ForTag$lambda$0((ImageStoreManager) obj4, (String) obj3, (Callback) obj, (Callback) obj2);
                break;
        }
    }

    public /* synthetic */ g(androidx.camera.core.processing.f fVar, C0216v c0216v, androidx.concurrent.futures.k kVar) {
        this.f1746a = 9;
        Map map = Collections.EMPTY_MAP;
        this.f1747b = fVar;
        this.f1748c = c0216v;
        this.f1749d = map;
        this.f1750e = kVar;
    }

    public /* synthetic */ g(Integer num, Integer num2, DefaultDevLoadingViewImplementation defaultDevLoadingViewImplementation, String str) {
        this.f1746a = 13;
        this.f1747b = num;
        this.f1749d = num2;
        this.f1750e = defaultDevLoadingViewImplementation;
        this.f1748c = str;
    }

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f1746a = i7;
        this.f1747b = obj;
        this.f1748c = obj2;
        this.f1749d = obj3;
        this.f1750e = obj4;
    }

    public /* synthetic */ g(String str, String str2, String str3, String str4) {
        this.f1746a = 5;
        this.f1748c = str;
        this.f1749d = str2;
        this.f1747b = str3;
        this.f1750e = str4;
    }
}

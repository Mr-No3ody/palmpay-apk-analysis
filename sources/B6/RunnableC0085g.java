package B6;

import E.C0197b;
import E.C0211p;
import E.ExecutorC0209n;
import E.m0;
import Pa.C0521s;
import Pa.n0;
import Pa.r0;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.ActivityManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.util.Size;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.camera.core.Preview$SurfaceProvider;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.view.C1027h;
import androidx.camera.view.PreviewView;
import androidx.core.util.Consumer;
import androidx.viewpager2.widget.ViewPager2;
import androidx.work.impl.C1275h;
import com.appsflyer.AppsFlyerLib;
import com.google.api.Service;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.palmpay.lib.liveness.v2.LivenessActivityV2;
import com.palmpay.lib.scanplus.bean.CodeBean;
import com.swmansion.rnscreens.gamma.tabs.TabScreen;
import com.transsnet.palmpay.account.ui.activity.PalmPayTier3ApplicationDetailActivity;
import com.transsnet.palmpay.bean.HomeDialogState;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.rsp.HomeMenuBean;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.core.rnbridge.modules.PPRNBridge;
import com.transsnet.palmpay.core.util.statistic.BaseTrackEvent;
import com.transsnet.palmpay.core.web.WebJsCallback;
import com.transsnet.palmpay.custom_view.image.RoundImageView;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.main.export.bean.rsp.GetHomeCommonRsp;
import com.transsnet.palmpay.main.export.bean.rsp.QueryHomeAccountInfoRsp;
import com.transsnet.palmpay.send_money.ui.fragment.QrcodeScanFragment;
import com.transsnet.palmpay.ui.activity.HomeActivity;
import com.transsnet.palmpay.ui.fragment.HomeFragment;
import com.transsnet.palmpay.ui.fragment.HomeFragmentHomeTab;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: B6.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC0085g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f486c;

    public /* synthetic */ RunnableC0085g(int i7, Object obj, Object obj2) {
        this.f484a = i7;
        this.f485b = obj;
        this.f486c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Ie.j jVar;
        List list;
        HomeActivity homeActivity;
        boolean zBooleanValue = true;
        boolean zBooleanValue2 = false;
        Object[] objArr = 0;
        switch (this.f484a) {
            case 0:
                LivenessActivityV2 livenessActivityV2 = (LivenessActivityV2) this.f485b;
                ListenableFuture listenableFuture = (ListenableFuture) this.f486c;
                int i7 = LivenessActivityV2.f23926Z;
                try {
                    if (!livenessActivityV2.isDestroyed() && !livenessActivityV2.isFinishing()) {
                        androidx.camera.lifecycle.h hVar = (androidx.camera.lifecycle.h) listenableFuture.get();
                        C0211p DEFAULT_FRONT_CAMERA = C0211p.f2091b;
                        Intrinsics.checkNotNullExpressionValue(DEFAULT_FRONT_CAMERA, "DEFAULT_FRONT_CAMERA");
                        if (!hVar.hasCamera(DEFAULT_FRONT_CAMERA)) {
                            livenessActivityV2.f();
                            return;
                        }
                        C1027h c1027h = new C1027h(livenessActivityV2);
                        c1027h.j(DEFAULT_FRONT_CAMERA);
                        ExecutorService executorService = livenessActivityV2.f23938c;
                        Intrinsics.e(executorService);
                        c1027h.k(executorService, new A8.a(livenessActivityV2.g(), 13));
                        p140j8.f.b();
                        c1027h.f14951D = livenessActivityV2;
                        c1027h.n(null);
                        livenessActivityV2.f23936a = c1027h;
                        PreviewView previewView = livenessActivityV2.f23937b;
                        if (previewView != null) {
                            previewView.setController(c1027h);
                            return;
                        } else {
                            Intrinsics.n("cameraPreview");
                            throw null;
                        }
                    }
                    return;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    livenessActivityV2.f();
                    return;
                }
            case 1:
                C6.o oVar = (C6.o) this.f485b;
                Bitmap bitmap = (Bitmap) this.f486c;
                try {
                    Surface surface = oVar.f1194g;
                    if (surface == null) {
                        Intrinsics.n("inputSurface");
                        throw null;
                    }
                    if (surface.isValid()) {
                        Surface surface2 = oVar.f1194g;
                        if (surface2 == null) {
                            Intrinsics.n("inputSurface");
                            throw null;
                        }
                        Canvas canvasLockCanvas = surface2.lockCanvas(null);
                        canvasLockCanvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                        Surface surface3 = oVar.f1194g;
                        if (surface3 != null) {
                            surface3.unlockCanvasAndPost(canvasLockCanvas);
                            return;
                        } else {
                            Intrinsics.n("inputSurface");
                            throw null;
                        }
                    }
                    return;
                } catch (Exception e11) {
                    C6.p pVar = oVar.f1188a;
                    if (pVar != null) {
                        pVar.invoke(e11);
                        return;
                    }
                    return;
                }
            case 2:
                QrcodeScanFragment qrcodeScanFragment = (QrcodeScanFragment) this.f485b;
                qrcodeScanFragment.getClass();
                qrcodeScanFragment.v(((CodeBean) ((List) this.f486c).get(0)).getCodeString());
                return;
            case 3:
                int i10 = HomeFragmentHomeTab.f35093A0;
                List<HomeMenuBean> list2 = ((GetHomeCommonRsp.DataBean) this.f486c).bottomTabMenu;
                HomeFragment homeFragment = (HomeFragment) ((HomeFragmentHomeTab) this.f485b).getParentFragment();
                if (homeFragment == null || list2 == null || (jVar = homeFragment.f35091v) == null) {
                    return;
                }
                int size = list2.size();
                List list3 = jVar.f4356C;
                if (list3 != null && size == list3.size() && size > 0 && (list = jVar.f4356C) != null && list2.size() == list.size()) {
                    ArrayList<Pair> arrayListC0 = CollectionsKt.c0(list2, list);
                    if (arrayListC0.isEmpty()) {
                        return;
                    }
                    for (Pair pair : arrayListC0) {
                        if (!Intrinsics.c((HomeMenuBean) pair.f38891a, (HomeMenuBean) pair.f38892b)) {
                        }
                    }
                    return;
                }
                if (!list2.isEmpty()) {
                    jVar.f4356C = list2;
                }
                jVar.e(jVar.f4355B);
                return;
            case 4:
                int i11 = HomeFragmentHomeTab.f35093A0;
                HomeFragmentHomeTab homeFragmentHomeTab = (HomeFragmentHomeTab) this.f485b;
                androidx.fragment.app.E activity = homeFragmentHomeTab.getActivity();
                if (activity != null) {
                    androidx.fragment.app.E e12 = homeFragmentHomeTab.getActivity() instanceof HomeActivity ? activity : null;
                    if (e12 != null) {
                        C0521s c0521s = C0521s.f7158a;
                        O6.d dVarG = C0521s.g(e12, "/api/wallet-bff-product/wallet/home/queryHomeData1", ((QueryHomeAccountInfoRsp) this.f486c).validationCheckResp);
                        if (dVarG == null || (homeActivity = (HomeActivity) homeFragmentHomeTab.getActivity()) == null) {
                            return;
                        }
                        homeActivity.showDialog(dVarG, HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                PPRNBridge.sendSMS$lambda$35((String) this.f485b, (String) this.f486c);
                return;
            case 6:
                C0197b c0197b = (C0197b) this.f485b;
                c0197b.getClass();
                ((ImageReaderProxy.OnImageAvailableListener) this.f486c).onImageAvailable(c0197b);
                return;
            case 7:
                androidx.camera.core.c cVar = (androidx.camera.core.c) this.f485b;
                androidx.concurrent.futures.k kVar = (androidx.concurrent.futures.k) this.f486c;
                if (cVar.f13721f != null) {
                    Executor executor = cVar.f13719d;
                    if (executor instanceof ExecutorC0209n) {
                        ExecutorC0209n executorC0209n = (ExecutorC0209n) executor;
                        synchronized (executorC0209n.f2071a) {
                            try {
                                if (!executorC0209n.f2072b.isShutdown()) {
                                    executorC0209n.f2072b.shutdown();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    cVar.f13721f.quit();
                    break;
                }
                kVar.b(null);
                return;
            case 8:
                ((E.d0) this.f485b).a();
                E.d0 d0Var = (E.d0) this.f486c;
                if (d0Var != null) {
                    d0Var.a();
                    return;
                }
                return;
            case 9:
                E.W w3 = (E.W) this.f485b;
                w3.getClass();
                ((ImageReaderProxy.OnImageAvailableListener) this.f486c).onImageAvailable(w3);
                return;
            case 10:
                ((Preview$SurfaceProvider) this.f485b).onSurfaceRequested((m0) this.f486c);
                return;
            case 11:
                ((E6.c) ((top.zibin.luban.io.a) this.f485b).f42645b).play((String) this.f486c);
                return;
            case 12:
                final G.f fVar = (G.f) this.f485b;
                fVar.f2874e++;
                m0 m0Var = (m0) this.f486c;
                boolean z3 = m0Var.f2060f;
                G.c cVar2 = fVar.f2870a;
                H.j.d(cVar2.f14400a, true);
                H.j.c(cVar2.f14402c);
                final SurfaceTexture surfaceTexture = new SurfaceTexture(z3 ? cVar2.f2860n : cVar2.f2861o);
                Size size2 = m0Var.f2056b;
                surfaceTexture.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                final Surface surface4 = new Surface(surfaceTexture);
                m0Var.b(surface4, fVar.f2872c, new Consumer() { // from class: G.e
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj) {
                        f fVar2 = fVar;
                        fVar2.getClass();
                        SurfaceTexture surfaceTexture2 = surfaceTexture;
                        surfaceTexture2.setOnFrameAvailableListener(null);
                        surfaceTexture2.release();
                        surface4.release();
                        fVar2.f2874e--;
                        fVar2.a();
                    }
                });
                if (m0Var.f2060f) {
                    fVar.f2878i = surfaceTexture;
                    return;
                } else {
                    fVar.f2879j = surfaceTexture;
                    surfaceTexture.setOnFrameAvailableListener(fVar, fVar.f2873d);
                    return;
                }
            case 13:
                G.f fVar2 = (G.f) this.f485b;
                SurfaceOutput surfaceOutput = (SurfaceOutput) this.f486c;
                Surface surface5 = surfaceOutput.getSurface(fVar2.f2872c, new G.d(objArr == true ? 1 : 0, fVar2, surfaceOutput));
                fVar2.f2870a.g(surface5);
                fVar2.f2877h.put(surfaceOutput, surface5);
                return;
            case 14:
                FrameLayout frameLayout = (FrameLayout) this.f485b;
                if (frameLayout.isAttachedToWindow() && frameLayout.getVisibility() == 0) {
                    frameLayout.setPivotX(frameLayout.getWidth() / 2.0f);
                    frameLayout.setPivotY(frameLayout.getHeight() / 2.0f);
                    AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) View.TRANSLATION_Y, 0.0f, CommonViewExtKt.getDp(-4));
                    objectAnimatorOfFloat.setDuration(750L);
                    objectAnimatorOfFloat.setRepeatCount(-1);
                    objectAnimatorOfFloat.setRepeatMode(2);
                    objectAnimatorOfFloat.setInterpolator(accelerateDecelerateInterpolator);
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) View.SCALE_X, 1.0f, 1.06f);
                    objectAnimatorOfFloat2.setDuration(750L);
                    objectAnimatorOfFloat2.setRepeatCount(-1);
                    objectAnimatorOfFloat2.setRepeatMode(2);
                    objectAnimatorOfFloat2.setInterpolator(accelerateDecelerateInterpolator);
                    ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) View.SCALE_Y, 1.0f, 1.06f);
                    objectAnimatorOfFloat3.setDuration(750L);
                    objectAnimatorOfFloat3.setRepeatCount(-1);
                    objectAnimatorOfFloat3.setRepeatMode(2);
                    objectAnimatorOfFloat3.setInterpolator(accelerateDecelerateInterpolator);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
                    animatorSet.start();
                    ((Me.r) this.f486c).f6001j = animatorSet;
                    return;
                }
                return;
            case 15:
                File[] fileArr = (File[]) this.f486c;
                PalmPayTier3ApplicationDetailActivity.a aVar = PalmPayTier3ApplicationDetailActivity.f25934d;
                PalmPayTier3ApplicationDetailActivity palmPayTier3ApplicationDetailActivity = (PalmPayTier3ApplicationDetailActivity) this.f485b;
                palmPayTier3ApplicationDetailActivity.showLoadingDialog(false);
                try {
                    File file = fileArr[0];
                    if (file != null) {
                        Bc.q qVar = palmPayTier3ApplicationDetailActivity.f25937c;
                        r0.f1(qVar != null ? (RoundImageView) qVar.f823o : null, Uri.fromFile(file));
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 16:
                F6.d.h("PalmPayCache", 3, com.horcrux.svg.d0.q("get: ret ", ((File) this.f485b).setLastModified(((Long) this.f486c).longValue())));
                return;
            case 17:
                Pa.U u6 = (Pa.U) this.f485b;
                u6.C();
                u6.B("receive_push_message", (HashMap) this.f486c);
                return;
            case 18:
                n0 n0Var = (n0) this.f485b;
                n0Var.getClass();
                BaseTrackEvent baseTrackEvent = (BaseTrackEvent) this.f486c;
                if (baseTrackEvent == null) {
                    return;
                }
                String eventName = baseTrackEvent.getEventName();
                if (TextUtils.isEmpty(eventName)) {
                    return;
                }
                Map<String, Object> eventMap = baseTrackEvent.getEventMap();
                n0Var.a(eventMap);
                Bundle bundleX = n0.x(eventMap);
                FirebaseAnalytics firebaseAnalytics = n0Var.f7120b;
                if (firebaseAnalytics != null) {
                    boolean zIsFbEvt = baseTrackEvent.isFbEvt();
                    Boolean boolC = n0Var.c(RemoteConfigComponent.DEFAULT_NAMESPACE, eventName);
                    if (boolC != null) {
                        zIsFbEvt = boolC.booleanValue();
                    }
                    if (zIsFbEvt) {
                        firebaseAnalytics.logEvent(eventName, bundleX);
                    }
                }
                if (eventName.startsWith("FB_")) {
                    return;
                }
                if (!baseTrackEvent.isAfEvt() && !Boolean.TRUE.equals(eventMap.remove("afEvt"))) {
                    zBooleanValue = false;
                }
                Boolean boolC2 = n0Var.c("appsflyer", eventName);
                if (boolC2 != null) {
                    zBooleanValue = boolC2.booleanValue();
                }
                if (zBooleanValue) {
                    AppsFlyerLib.getInstance().logEvent(BaseApplication.getContext(), eventName, eventMap);
                }
                boolean zIsGioEvt = baseTrackEvent.isGioEvt();
                if (!ActivityManager.isUserAMonkey()) {
                    Boolean boolC3 = n0Var.c("growingIO", eventName);
                    zBooleanValue2 = boolC3 != null ? boolC3.booleanValue() : zIsGioEvt;
                }
                if (zBooleanValue2) {
                    n0Var.B(eventName, n0.y(eventMap));
                    return;
                }
                return;
            case 19:
                JSONObject jSONObject = (JSONObject) this.f486c;
                ((n0) this.f485b).getClass();
                try {
                    try {
                        ((PayApiService) p324va.c.f43141a.f14621b).collectTrackingEvents(okhttp3.c0.create(okhttp3.L.f40589e.parse("application/json; charset=utf-8"), new JSONArray().put(jSONObject).toString())).a();
                        break;
                    } catch (Throwable th2) {
                        F6.d.c("StatisticsUtil", "publishMirroredTrackingEvent failed", th2);
                    }
                    return;
                } catch (Throwable th3) {
                    F6.d.c("StatisticsUtil", "tryMirrorCustomEvent failed", th3);
                    return;
                }
            case 20:
                View view = (View) this.f485b;
                if (view != null) {
                    view.setVisibility(8);
                }
                View view2 = (View) this.f486c;
                if (view2 != null) {
                    view2.setEnabled(true);
                    return;
                }
                return;
            case 21:
                ArrayList arrayList = (ArrayList) this.f485b;
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((EditText) it.next()).hasFocus()) {
                            return;
                        }
                    }
                }
                ((com.transsnet.palmpay.core.viewmodel.c) this.f486c).d();
                return;
            case 22:
                int i12 = WebJsCallback.t;
                WebJsCallback.g(((WebJsCallback) this.f485b).b(), ((Boolean) this.f486c).booleanValue());
                return;
            case 23:
                ((p279s5.d) ((W0.d) this.f485b).f10369c).stopWork((C1275h) this.f486c, 3);
                return;
            case 24:
                ((TabScreen) this.f485b).setIcon((Drawable) this.f486c);
                return;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                ((CancellableContinuation) this.f485b).resumeUndispatched((Xf.d) this.f486c, Unit.f38893a);
                return;
            case 26:
                ((Y.h) this.f485b).onFontRetrieved((Typeface) this.f486c);
                return;
            case 27:
                View view3 = (View) this.f485b;
                view3.measure(View.MeasureSpec.makeMeasureSpec(view3.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                ViewPager2 viewPager2 = (ViewPager2) this.f486c;
                if (viewPager2.getLayoutParams().height != view3.getMeasuredHeight()) {
                    ViewGroup.LayoutParams layoutParams = viewPager2.getLayoutParams();
                    layoutParams.height = view3.getMeasuredHeight();
                    viewPager2.setLayoutParams(layoutParams);
                    return;
                }
                return;
            case 28:
                androidx.fragment.app.E this$0 = (androidx.fragment.app.E) this.f485b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                androidx.activity.I dispatcher = (androidx.activity.I) this.f486c;
                Intrinsics.checkNotNullParameter(dispatcher, "$dispatcher");
                this$0.getLifecycle().a(new E0.k(1, dispatcher, this$0));
                return;
            default:
                Runnable runnable = (Runnable) this.f486c;
                androidx.appcompat.app.r rVar = (androidx.appcompat.app.r) this.f485b;
                rVar.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    rVar.a();
                }
        }
    }
}

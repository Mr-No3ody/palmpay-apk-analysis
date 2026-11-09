package androidx.camera.core.impl;

import C0.C0126s;
import Pa.C0525w;
import android.graphics.Canvas;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import androidx.biometric.RunnableC0903g;
import androidx.camera.video.internal.encoder.OutputConfig;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.webkit.WebViewCompat$WebViewStartUpCallback;
import androidx.webkit.WebViewStartUpResult;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerProvider;
import com.facebook.react.defaults.DefaultReactNativeHost;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.carousel.MaskableFrameLayout;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.api.Service;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import com.google.firebase.crashlytics.internal.CrashlyticsRemoteConfigListener;
import com.google.firebase.crashlytics.internal.RemoteConfigDeferredProxy;
import com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator;
import com.google.firebase.crashlytics.internal.common.Utils;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.transsnet.mtn.sdk.http.req.LoginReq;
import com.transsnet.mtn.sdk.http.resp.LoginResp;
import com.transsnet.mtn.sdk.ui.view.InputView;
import com.transsnet.mtn.sdk.ui.view.MTNButton;
import com.transsnet.palmpay.account.bean.req.CheckSecurityVerifyMethodReq;
import com.transsnet.palmpay.account.ui.activity.VerifyAccountActivity;
import com.transsnet.palmpay.account.ui.fragment.verify.VerifyAccountPinFragment;
import com.transsnet.palmpay.account.ui.fragment.verify.VerifyAccountPswFragment;
import com.transsnet.palmpay.airtime.bean.BillerBottomMenuBean;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.callback.ResultCallback;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.custom_view.PinEntryView;
import com.transsnet.palmpay.security.utils.SecurityUtils;
import com.transsnet.palmpay.teller.ui.dialog.CouponClaimResultDialog;
import com.transsnet.palmpay.teller.ui.view.ModelBillerBottomMenu;
import com.transsnet.palmpay.util.ActivityUtils;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p227p.a$b;
import p227p.a$f;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class L implements CallbackToFutureAdapter$Resolver, OutputConfig, WebViewCompat$WebViewStartUpCallback, PinEntryView.OnPinEnteredListener, ResultCallback, OnItemClickListener, InputView.a, MTNButton.a, com.adjust.sdk.sig.r0, UIManagerProvider, SynchronizationGuard.CriticalSection, AccessibilityViewCommand, MaterialShapeDrawable.OnCornerSizeChangeListener, CanvasCompat.CanvasOperation, Deferred.DeferredHandler, Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13918b;

    public /* synthetic */ L(Object obj, int i7) {
        this.f13917a = i7;
        this.f13918b = obj;
    }

    @Override // com.adjust.sdk.sig.r0
    public Object a(Object obj) {
        return com.adjust.sdk.sig.d.a((com.adjust.sdk.sig.d) this.f13918b, obj);
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public Object attachCompleter(androidx.concurrent.futures.k completer) {
        switch (this.f13917a) {
            case 0:
                N2.a aVar = (N2.a) this.f13918b;
                synchronized (aVar.f6064a) {
                    aVar.f6068e = completer;
                    break;
                }
                return "CameraRepository-deinit";
            case 1:
                C0990l0 c0990l0 = (C0990l0) this.f13918b;
                org.chromium.support_lib_boundary.util.b.S().execute(new RunnableC0903g(14, c0990l0, completer));
                return c0990l0 + " [fetch@" + SystemClock.uptimeMillis() + "]";
            case 2:
                androidx.camera.core.processing.l lVar = (androidx.camera.core.processing.l) this.f13918b;
                lVar.f14423p = completer;
                return "SettableFuture hashCode: " + lVar.hashCode();
            case 3:
                ((androidx.camera.core.processing.n) this.f13918b).f14452v = completer;
                return "SurfaceOutputImpl close future complete";
            default:
                Wf.B this_asListenableFuture = (Wf.B) this.f13918b;
                Intrinsics.checkNotNullParameter(this_asListenableFuture, "$this_asListenableFuture");
                Intrinsics.checkNotNullParameter(completer, "completer");
                this_asListenableFuture.invokeOnCompletion(new C0126s(3, completer, this_asListenableFuture));
                return "Deferred.asListenableFuture";
        }
    }

    @Override // com.facebook.react.bridge.UIManagerProvider
    public UIManager createUIManager(ReactApplicationContext reactApplicationContext) {
        return DefaultReactNativeHost.getUIManagerProvider$lambda$0((DefaultReactNativeHost) this.f13918b, reactApplicationContext);
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object execute() {
        switch (this.f13917a) {
            case 17:
                return Integer.valueOf(((EventStore) this.f13918b).cleanUp());
            case 18:
                return ((ClientHealthMetricsStore) this.f13918b).loadClientMetrics();
            case 19:
                return ((Uploader) this.f13918b).lambda$logAndUpdateState$6();
            default:
                return ((WorkInitializer) this.f13918b).lambda$ensureContextsScheduled$0();
        }
    }

    @Override // androidx.camera.video.internal.encoder.OutputConfig
    public MediaFormat getMediaFormat() {
        return (MediaFormat) this.f13918b;
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public void handle(Provider provider) {
        switch (this.f13917a) {
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                ((CrashlyticsNativeComponentDeferredProxy) this.f13918b).lambda$new$0(provider);
                break;
            default:
                RemoteConfigDeferredProxy.lambda$setupListener$0((CrashlyticsRemoteConfigListener) this.f13918b, provider);
                break;
        }
    }

    @Override // com.transsnet.palmpay.core.callback.ResultCallback
    public void onComplete(Object obj) {
        ((CouponClaimResultDialog) this.f13918b).dismiss();
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable.OnCornerSizeChangeListener
    public void onCornerSizeChange(float f10) {
        ((MaterialButton) this.f13918b).lambda$setOpticalCenterEnabled$0(f10);
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(M1.j jVar, View view, int i7) {
        String androidLink;
        int i10 = ModelBillerBottomMenu.f34335e;
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        ModelBillerBottomMenu modelBillerBottomMenu = (ModelBillerBottomMenu) this.f13918b;
        BillerBottomMenuBean billerBottomMenuBean = (BillerBottomMenuBean) CollectionsKt.G(i7, modelBillerBottomMenu.f34337d.getData());
        if (billerBottomMenuBean == null || (androidLink = billerBottomMenuBean.getAndroidLink()) == null || androidLink.length() == 0) {
            return;
        }
        Pa.n0 n0VarG = Pa.n0.g();
        ClickEvent clickEvent = new ClickEvent("Airtime_Homepage_Airtime_Service_Click");
        String title = billerBottomMenuBean.getTitle();
        if (title == null) {
            title = "";
        }
        n0VarG.k(clickEvent.add("title", title));
        if ("TechShare".equalsIgnoreCase(billerBottomMenuBean.getCode()) && (kotlin.text.y.m(androidLink, "http://", false) || kotlin.text.y.m(androidLink, "https://", false))) {
            String str = StringsKt.A(androidLink, "?", false) ? "&" : "?";
            User user = BaseApplication.get().getUser();
            String memberId = user.getMemberId();
            if (memberId == null) {
                memberId = "";
            }
            String fullName = user.getFullName();
            androidLink = androidLink + str + "memberId=" + memberId + "&fullName=" + Uri.encode(fullName != null ? fullName : "");
        }
        ActivityUtils.startActivity(Pa.F.a(modelBillerBottomMenu.getContext(), androidLink));
    }

    @Override // com.transsnet.palmpay.custom_view.PinEntryView.OnPinEnteredListener
    public void onPinEntered(String str) {
        switch (this.f13917a) {
            case 7:
                if (str != null && str.length() == L8.c.f5560a) {
                    VerifyAccountPinFragment verifyAccountPinFragment = (VerifyAccountPinFragment) this.f13918b;
                    verifyAccountPinFragment.getClass();
                    CheckSecurityVerifyMethodReq checkSecurityVerifyMethodReq = new CheckSecurityVerifyMethodReq();
                    checkSecurityVerifyMethodReq.flowId = verifyAccountPinFragment.f26306j;
                    checkSecurityVerifyMethodReq.verifyMethod = 1;
                    HashMap<String, Object> verifyParams = new HashMap<>();
                    checkSecurityVerifyMethodReq.verifyParams = verifyParams;
                    Intrinsics.checkNotNullExpressionValue(verifyParams, "verifyParams");
                    verifyParams.put("pin", SecurityUtils.a(str));
                    VerifyAccountActivity verifyAccountActivityW = verifyAccountPinFragment.w();
                    if (verifyAccountActivityW != null) {
                        verifyAccountActivityW.p(checkSecurityVerifyMethodReq);
                    }
                    break;
                }
                break;
            default:
                if (str != null && str.length() == L8.c.f5561b) {
                    VerifyAccountPswFragment verifyAccountPswFragment = (VerifyAccountPswFragment) this.f13918b;
                    verifyAccountPswFragment.getClass();
                    CheckSecurityVerifyMethodReq checkSecurityVerifyMethodReq2 = new CheckSecurityVerifyMethodReq();
                    checkSecurityVerifyMethodReq2.flowId = verifyAccountPswFragment.f26306j;
                    checkSecurityVerifyMethodReq2.verifyMethod = 6;
                    HashMap<String, Object> verifyParams2 = new HashMap<>();
                    checkSecurityVerifyMethodReq2.verifyParams = verifyParams2;
                    Intrinsics.checkNotNullExpressionValue(verifyParams2, "verifyParams");
                    verifyParams2.put("password", SecurityUtils.a(str));
                    VerifyAccountActivity verifyAccountActivityW2 = verifyAccountPswFragment.w();
                    if (verifyAccountActivityW2 != null) {
                        verifyAccountActivityW2.p(checkSecurityVerifyMethodReq2);
                    }
                    break;
                }
                break;
        }
    }

    @Override // androidx.webkit.WebViewCompat$WebViewStartUpCallback
    public void onSuccess(WebViewStartUpResult webViewStartUpResult) {
        new Handler(Looper.getMainLooper()).post(new androidx.camera.video.internal.encoder.o(14, (Fe.Z) this.f13918b, webViewStartUpResult));
    }

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public boolean perform(View view, p074f0.h hVar) {
        return ((BottomSheetDragHandleView) this.f13918b).lambda$onBottomSheetStateChanged$0(view, null);
    }

    @Override // com.google.android.material.canvas.CanvasCompat.CanvasOperation
    public void run(Canvas canvas) {
        switch (this.f13917a) {
            case 23:
                ((MaskableFrameLayout) this.f13918b).lambda$dispatchDraw$1(canvas);
                break;
            default:
                ((NavigationView) this.f13918b).lambda$dispatchDraw$0(canvas);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.f13917a) {
            case 27:
                return Boolean.valueOf(((SessionReportingCoordinator) this.f13918b).onReportSendComplete(task));
            case 28:
                return Utils.lambda$awaitEvenIfOnMainThread$0((CountDownLatch) this.f13918b, task);
            default:
                return CrashlyticsWorker.lambda$submit$1((Runnable) this.f13918b, task);
        }
    }

    @Override // com.transsnet.mtn.sdk.ui.view.InputView.a, com.transsnet.mtn.sdk.ui.view.MTNButton.a
    public void a() {
        switch (this.f13917a) {
            case 11:
                ((ch.a) this.f13918b).e();
                break;
            case 12:
                ch.d dVar = (ch.d) this.f13918b;
                dVar.getClass();
                LoginReq loginReq = new LoginReq();
                loginReq.bankCode = dVar.j().f36329c;
                loginReq.loginId = dVar.f19043i.f();
                loginReq.password = dVar.f19043i.c();
                a$b a_b = dVar.f19043i;
                if (a_b instanceof a$f) {
                    loginReq.cardPin = ((a$f) a_b).e();
                }
                loginReq.agreeUrl = p073f.c.a().f36335c;
                dVar.f19043i.a();
                p002a.a.b("/api/v1/openBanking/login", loginReq, new C0525w(dVar, 17), LoginResp.class);
                p073f.c.a().f36338f = loginReq.loginId;
                p073f.c.a().getClass();
                p073f.c.a().getClass();
                break;
            case 13:
                ((ch.b) this.f13918b).g();
                break;
            default:
                ((ch.c) this.f13918b).e();
                break;
        }
    }
}

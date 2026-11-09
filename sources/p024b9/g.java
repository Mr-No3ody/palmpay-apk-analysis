package p024b9;

import Bc.C0104a;
import Ce.ViewOnAttachStateChangeListenerC0160b;
import N8.q0;
import Pa.i0;
import U4.i;
import X6.p;
import android.view.View;
import android.widget.EditText;
import androidx.core.widget.NestedScrollView;
import com.appsflyer.AFLogger;
import com.didi.drouter.router.e;
import com.didi.drouter.router.f;
import com.facebook.react.bridge.Callback;
import com.facebook.react.fabric.mounting.SurfaceMountingManager;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.modules.debug.DevMenuModule;
import com.facebook.react.modules.debug.DevSettingsModule;
import com.facebook.react.packagerconnection.ReconnectingWebSocket;
import com.facebook.react.runtime.ReactInstance;
import com.facebook.react.runtime.ReactSurfaceImpl;
import com.facebook.react.uimanager.d;
import com.facebook.react.uimanager.layoutanimation.LayoutAnimationController;
import com.facebook.react.views.scroll.MaintainVisibleScrollPositionHelper;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.api.Service;
import com.google.firebase.installations.FirebaseInstallations;
import com.growingio.android.sdk.track.webservices.widget.TipView;
import com.palmpay.lib.apm.launchcounter.util.ActivityCounter;
import com.palmpay.lib.ui.form.PpFormVertical;
import com.palmpay.lib.webview.offline.OfflineWebManager;
import com.pp.faceguard.traffic.CapturingHttpURLConnection;
import com.rnmaps.maps.q;
import com.transsnet.adsdk.widgets.MarqueeTextView.MarqueeViewV2;
import com.transsnet.adsdk.widgets.banner.BannerAdView;
import com.transsnet.palmpay.account.ui.fragment.upgrade.UpgradeTier3StepAddressEditFragment;
import com.transsnet.palmpay.teller.ui.view.WrapContentViewPager2;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import p305u5.a;
import p310ub.C2085k0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18807b;

    public /* synthetic */ g(Object obj, int i7) {
        this.f18806a = i7;
        this.f18807b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0104a c0104a;
        Object obj = this.f18807b;
        switch (this.f18806a) {
            case 0:
                int i7 = UpgradeTier3StepAddressEditFragment.f26283C;
                UpgradeTier3StepAddressEditFragment upgradeTier3StepAddressEditFragment = (UpgradeTier3StepAddressEditFragment) obj;
                if (i0.W(upgradeTier3StepAddressEditFragment.getActivity()) && (c0104a = upgradeTier3StepAddressEditFragment.f26286j) != null) {
                    ((NestedScrollView) c0104a.f651c).p(((PpFormVertical) c0104a.f657j).getTop());
                }
                break;
            case 1:
                WrapContentViewPager2.a((WrapContentViewPager2) obj);
                break;
            case 2:
                AFLogger.getMediationNetwork((Function1) obj);
                break;
            case 3:
                f fVar = ((e) obj).f21143c;
                fVar.f21148c.f21140e.b(fVar.f21150e);
                break;
            case 4:
                ((SurfaceMountingManager) obj).lambda$stopSurface$0();
                break;
            case 5:
                DeviceEventManagerModule.invokeDefaultBackPressRunnable$lambda$0((DefaultHardwareBackBtnHandler) obj);
                break;
            case 6:
                ReactChoreographer.postFrameCallbackOnChoreographer$lambda$6((ReactChoreographer) obj);
                break;
            case 7:
                DevMenuModule.reload$lambda$0((DevMenuModule) obj);
                break;
            case 8:
                DevSettingsModule.reload$lambda$0((DevSettingsModule) obj);
                break;
            case 9:
                ((ReconnectingWebSocket) obj).delayedReconnect();
                break;
            case 10:
                ReactInstance.initializeEagerTurboModules$lambda$3((ReactInstance) obj);
                break;
            case 11:
                ReactSurfaceImpl.clear$lambda$4((ReactSurfaceImpl) obj);
                break;
            case 12:
                ((p) obj).invoke();
                break;
            case 13:
                ((p) obj).invoke();
                break;
            case 14:
                ((d) obj).invoke();
                break;
            case 15:
                LayoutAnimationController.initializeFromConfig$lambda$0((Callback) obj);
                break;
            case 16:
                ((MaintainVisibleScrollPositionHelper) obj).computeTargetView();
                break;
            case 17:
                ((WorkInitializer) obj).lambda$ensureContextsScheduled$1();
                break;
            case 18:
                ((MaterialButton) obj).lambda$setOpticalCenterEnabled$1();
                break;
            case 19:
                ((CarouselLayoutManager) obj).refreshKeylineState();
                break;
            case 20:
                ViewUtils.requestFocusAndShowKeyboard((EditText) obj, false);
                break;
            case 21:
                ((MaterialBackOrchestrator) obj).startListeningForBackCallbacksWithPriorityOverlay();
                break;
            case 22:
                ((FirebaseInstallations) obj).lambda$getId$1();
                break;
            case 23:
                i iVar = (i) obj;
                if (((ArrayList) iVar.f1592b).size() != 0) {
                    p305u5.f.f42708a.getClass();
                    ArrayList arrayListB = C2085k0.b();
                    if (!arrayListB.isEmpty()) {
                        for (int size = arrayListB.size() - 1; size >= 0; size--) {
                            if (((a) arrayListB.get(size)).f42700a instanceof TipView) {
                                arrayListB.remove(size);
                                View view = ((a) q0.i(1, arrayListB)).f42700a;
                                view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0160b(iVar, 7));
                                view.post(new androidx.customview.widget.e(iVar, 13));
                            }
                            break;
                        }
                        View view2 = ((a) q0.i(1, arrayListB)).f42700a;
                        view2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0160b(iVar, 7));
                        view2.post(new androidx.customview.widget.e(iVar, 13));
                        break;
                    }
                }
                break;
            case 24:
                ((ActivityCounter) obj).renderEnd();
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                ((OfflineWebManager) obj).addLifecycle();
                break;
            case 26:
                ((CapturingHttpURLConnection) obj).emitOnce();
                break;
            case 27:
                ((q) obj).f24969a.c();
                break;
            case 28:
                MarqueeViewV2.postFailResult$lambda$14((MarqueeViewV2) obj);
                break;
            default:
                BannerAdView.postLoadFailResult$lambda$13((BannerAdView) obj);
                break;
        }
    }
}

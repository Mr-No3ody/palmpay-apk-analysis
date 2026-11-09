package Pa;

import android.os.Process;
import android.text.TextUtils;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.internal.AFj1rSDK;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.runtime.ReactHostImpl;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker;
import com.palmpay.lib.apm.startup.AppStartupPerfTracker;
import com.transsnet.adsdk.AdManager;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.device.UpdatePushClientIdReq;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.ui.activity.HomeActivity;

/* JADX INFO: renamed from: Pa.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC0527y implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7168a;

    public /* synthetic */ RunnableC0527y(int i7) {
        this.f7168a = i7;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f7168a) {
            case 0:
                AdManager.clearAdData();
                break;
            case 1:
                String token = BaseApplication.get().getToken();
                UpdatePushClientIdReq updatePushClientIdReq = new UpdatePushClientIdReq();
                p367ya.a.d().getClass();
                updatePushClientIdReq.fcmToken = p059e1.a.I("fcm_sp_fcm_token", "");
                updatePushClientIdReq.gaId = p367ya.a.d().c();
                updatePushClientIdReq.rnVer = BaseApplication.get().getCodePushData();
                updatePushClientIdReq.appsflyerID = AppsFlyerLib.getInstance().getAppsFlyerUID(BaseApplication.get());
                updatePushClientIdReq.appInstanceId = p059e1.a.H("firebase_sp_firebase_analytics_instance_id");
                updatePushClientIdReq.faceGuardToken = p059e1.a.H("face_guard_device_token");
                try {
                    CommonResult commonResult = TextUtils.isEmpty(token) ? (CommonResult) ((PayApiService) p324va.c.f43141a.f14621b).saveDeviceInfo(updatePushClientIdReq).b() : (CommonResult) ((PayApiService) p324va.c.f43141a.f14621b).updatePushClientId(updatePushClientIdReq).b();
                    if (!commonResult.isSuccess()) {
                        F6.d.c("SomeUtil", "saveDeviceInfo failed: " + commonResult.getRespCode());
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            case 2:
                AFj1rSDK.getCurrencyIso4217Code();
                break;
            case 3:
                ReactInstanceManager.lambda$setupReactContext$4();
                break;
            case 4:
                Process.setThreadPriority(0);
                break;
            case 5:
                ReactHostImpl.getOrCreateReactInstanceTask$lambda$41$lambda$38$lambda$37();
                break;
            case 6:
                AlarmManagerSchedulerBroadcastReceiver.lambda$onReceive$0();
                break;
            case 7:
                CrashlyticsWorker.lambda$await$6();
                break;
            case 8:
                p279s5.n.f42043a.w(null);
                break;
            case 9:
                BaseActivity.armIdleGateDefault();
                break;
            case 10:
                HomeActivity.a aVar = HomeActivity.f34463H;
                i0.b0("/h5/policy/ng/permission?showTitle=true&showAgree=true&hiddenBack=true");
                break;
            case 11:
                AppStartupPerfTracker.onFirebaseReady$lambda$1();
                break;
            case 12:
                AppStartupPerfTracker.postReportOnIdle$lambda$2();
                break;
            case 13:
                AppStartupPerfTracker.scheduleFirebaseWaitTimeout$lambda$10();
                break;
            case 14:
                AppStartupPerfTracker.scheduleFullStartupTimeout$lambda$8();
                break;
            default:
                AppStartupPerfTracker.scheduleSplashCreateResumeTimeout$lambda$6();
                break;
        }
    }
}

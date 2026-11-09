package p115ha;

import F6.d;
import Ja.RunnableC0336i;
import Pa.r0;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.camera.video.u;
import com.bumptech.glide.b;
import com.transsnet.adsdk.BatchAdManager;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.callback.SafeLockCheck;
import java.io.PrintStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p059e1.a;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37363a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f37364b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f37365c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f37366d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f37367e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f37368f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Handler f37369g = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final RunnableC0336i f37370i = new RunnableC0336i(8);

    public final void a(long j6) {
        d.h("SafeLockLifecycle", 3, u.i(j6, "setLeaveAppTime: "));
        this.f37364b = j6;
    }

    public final boolean b() {
        if (BaseApplication.hasLogin()) {
            int iO0 = r0.o0();
            if (iO0 == 0) {
                a(0L);
            } else {
                this.f37367e = iO0;
                a(a.E(-1L, com.transsnet.palmpay.core.config.d.h()));
                d.h("SafeLockLifecycle", 3, "read last leave app time from storage:" + this.f37364b);
            }
        } else {
            this.f37367e = 0;
        }
        int i7 = this.f37367e;
        if ((i7 == 2 || i7 == 1) && !this.f37366d) {
            long j6 = i7 == 1 ? 300000L : 10L;
            d.h("SafeLockLifecycle", 3, "leaveAppTooLong: settingPinType: " + this.f37367e);
            d.h("SafeLockLifecycle", 3, "nowTime: " + SystemClock.elapsedRealtime() + ",maxLeaveDuration = " + j6);
            StringBuilder sb2 = new StringBuilder("nowTime - leaveTime: ");
            sb2.append(SystemClock.elapsedRealtime() - this.f37364b);
            d.h("SafeLockLifecycle", 3, sb2.toString());
            if (this.f37364b == 0) {
                d.h("SafeLockLifecycle", 3, "leaveAppTooLong: mLeaveAppTime = 0 so return false");
                return false;
            }
            if (this.f37367e == 2 || SystemClock.elapsedRealtime() - this.f37364b > j6) {
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        d.h("SafeLockLifecycle", 3, "SafeLockLifecycleCallBack onActivityCreated: " + activity.getLocalClassName() + ",Count=" + this.f37363a);
        System.out.println("Watch lifecycle created status : " + activity.getLocalClassName() + ",Count=" + this.f37363a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (com.transsnet.palmpay.core.config.d.t() && this.f37363a <= 0) {
            b.b(BaseApplication.get()).a();
        }
        if (this.f37363a <= 0) {
            BatchAdManager.INSTANCE.clearAllBatchAd();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        d.h("SafeLockLifecycle", 3, "SafeLockLifecycleCallBack onActivityResumed: " + activity.getLocalClassName() + ",Count = " + this.f37363a);
        if (this.f37363a >= 1) {
            if (b()) {
                System.out.println("Watch lifecycle resumed status mLeaveAppTime = " + this.f37364b + ",settingPinType = " + this.f37367e + ",mActivityCount=" + this.f37363a);
                this.f37365c = true;
                if (this.f37369g == null) {
                    this.f37369g = new Handler(Looper.getMainLooper());
                }
                Handler handler = this.f37369g;
                if (!activity.getLocalClassName().equals("account.ui.activity.PinSafeWithPatternActivity")) {
                    RunnableC0336i runnableC0336i = this.f37370i;
                    handler.removeCallbacks(runnableC0336i);
                    runnableC0336i.getClass();
                    runnableC0336i.f4657b = new WeakReference(activity);
                    handler.postDelayed(runnableC0336i, 50L);
                }
            } else {
                int i7 = this.f37367e;
                if (i7 == 2 || i7 == 1) {
                    a.U(0, com.transsnet.palmpay.core.config.d.h());
                }
            }
        }
        if (this.f37367e > 0) {
            a(0L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (!(activity instanceof SafeLockCheck ? ((SafeLockCheck) activity).ignoreLock() : false)) {
            this.f37363a++;
            this.f37368f.add(activity);
            d.h("SafeLockLifecycle", 3, "SafeLockLifecycleCallBack onActivityStarted: " + activity.getLocalClassName() + ",Count=" + this.f37363a);
            PrintStream printStream = System.out;
            StringBuilder sb2 = new StringBuilder("Watch lifecycle started status Count=");
            sb2.append(this.f37363a);
            printStream.println(sb2.toString());
            return;
        }
        String simpleName = activity.getClass().getSimpleName();
        if (!"SplashActivity".equals(simpleName) && ((!"CoreRouterActivity".equals(simpleName) && !"CoreNotificationEntryActivity".equals(simpleName)) || this.f37363a > 0)) {
            a(0L);
            a.U(0, com.transsnet.palmpay.core.config.d.h());
        }
        d.h("SafeLockLifecycle", 3, "onActivityStarted: ignore safe lock:" + activity.getLocalClassName() + ",Count=" + this.f37363a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        ArrayList arrayList = this.f37368f;
        if (arrayList.contains(activity)) {
            arrayList.remove(activity);
            this.f37363a--;
        }
        d.h("SafeLockLifecycle", 3, "SafeLockLifecycleCallBack onActivityStopped:" + activity.getLocalClassName() + ",Count=" + this.f37363a);
        if (this.f37363a == 0) {
            a(SystemClock.elapsedRealtime());
            System.out.println("Watch lifecycle stopped status mLeaveAppTime = " + this.f37364b + ",settingPinType = " + this.f37367e + ",mActivityCount=" + this.f37363a);
            if (BaseApplication.hasLogin()) {
                if (!this.f37365c && this.f37367e > 0) {
                    a.V(SystemClock.elapsedRealtime(), com.transsnet.palmpay.core.config.d.h());
                }
                this.f37365c = false;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}

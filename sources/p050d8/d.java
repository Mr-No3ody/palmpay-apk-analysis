package p050d8;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.swmansion.rnscreens.utils.ScreenDummyLayoutHelper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f35548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScreenDummyLayoutHelper f35549b;

    public d(Activity activity, ScreenDummyLayoutHelper screenDummyLayoutHelper) {
        this.f35548a = activity;
        this.f35549b = screenDummyLayoutHelper;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity destroyedActivity) {
        Intrinsics.checkNotNullParameter(destroyedActivity, "destroyedActivity");
        if (destroyedActivity == this.f35548a) {
            ScreenDummyLayoutHelper screenDummyLayoutHelper = this.f35549b;
            Application application = destroyedActivity.getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
            ScreenDummyLayoutHelper.a aVar = ScreenDummyLayoutHelper.f25479o;
            synchronized (screenDummyLayoutHelper) {
                screenDummyLayoutHelper.f25481a = null;
                screenDummyLayoutHelper.f25482b = null;
                screenDummyLayoutHelper.f25483c = null;
                screenDummyLayoutHelper.f25486f = b.f35542c.getEMPTY();
                screenDummyLayoutHelper.f25489j = false;
                d dVar = screenDummyLayoutHelper.f25488i;
                if (dVar != null) {
                    application.unregisterActivityLifecycleCallbacks(dVar);
                    screenDummyLayoutHelper.f25488i = null;
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }
}

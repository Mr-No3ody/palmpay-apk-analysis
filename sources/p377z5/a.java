package p377z5;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile a f44443b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f44444a;

    public static a a() {
        if (f44443b == null) {
            synchronized (a.class) {
                try {
                    if (f44443b == null) {
                        f44443b = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f44443b;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (this.f44444a != activity) {
            return;
        }
        this.f44444a = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f44444a = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}

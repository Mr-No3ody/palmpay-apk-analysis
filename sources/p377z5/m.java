package p377z5;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f44486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Application f44487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i f44488c;

    public final void a() {
        this.f44488c = null;
        Activity activity = this.f44486a;
        if (activity == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            activity.unregisterActivityLifecycleCallbacks(this);
        } else {
            activity.getApplication().unregisterActivityLifecycleCallbacks(this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f44486a != activity) {
            return;
        }
        i iVar = this.f44488c;
        if (iVar != null) {
            iVar.b();
        }
        a();
        this.f44486a = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        i iVar;
        if (this.f44486a == activity && (iVar = this.f44488c) != null) {
            iVar.b();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
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

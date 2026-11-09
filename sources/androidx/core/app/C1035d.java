package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: renamed from: androidx.core.app.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1035d implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f15963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Activity f15964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15966d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15967e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15968f = false;

    public C1035d(Activity activity) {
        this.f15964b = activity;
        this.f15965c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f15964b == activity) {
            this.f15964b = null;
            this.f15967e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f15967e || this.f15968f || this.f15966d) {
            return;
        }
        Object obj = this.f15963a;
        try {
            Object obj2 = AbstractC1036e.f15971c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f15965c) {
                AbstractC1036e.f15975g.postAtFrontOfQueue(new RunnableC1034c(2, AbstractC1036e.f15970b.get(activity), obj2));
                this.f15968f = true;
                this.f15963a = null;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f15964b == activity) {
            this.f15966d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}

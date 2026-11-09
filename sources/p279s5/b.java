package p279s5;

import D4.f;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Trace;
import com.growingio.android.sdk.track.listener.IActivityLifecycle;
import java.lang.ref.WeakReference;
import p182m5.a;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends f implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference f42019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WeakReference f42020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f42021e;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Trace.beginSection("gio.ActivityOnCreate");
        w(new a(activity, 1, bundle));
        Trace.endSection();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        w(new a(activity, 8));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Trace.beginSection("gio.onActivityPaused");
        w(new a(activity, 5));
        Trace.endSection();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Trace.beginSection("gio.onActivityResumed");
        w(new a(activity, 3));
        Trace.endSection();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        w(new a(activity, 6, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Trace.beginSection("gio.onActivityStart");
        w(new a(activity, 2));
        Trace.endSection();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        w(new a(activity, 7));
    }

    @Override // D4.f
    public final void u(Object obj, Object obj2) {
        ((IActivityLifecycle) obj).onActivityLifecycle((a) obj2);
    }

    public final void w(a aVar) {
        Activity activity;
        Activity activityA = aVar.a();
        int i7 = aVar.f39477a;
        if (i7 == 3) {
            z(activityA);
        } else if (i7 == 5) {
            z(null);
        } else if (i7 == 1) {
            y(activityA);
        } else if (i7 != 7 && i7 == 8) {
            synchronized (this) {
                activity = (Activity) this.f42019c.get();
            }
            if (activityA == activity) {
                z(null);
            }
            if (activityA == x()) {
                y(null);
            }
        }
        l(aVar);
    }

    public final synchronized Activity x() {
        return (Activity) this.f42020d.get();
    }

    public final synchronized void y(Activity activity) {
        this.f42020d = new WeakReference(activity);
    }

    public final synchronized void z(Activity activity) {
        this.f42019c = new WeakReference(activity);
        if (activity != null) {
            y(activity);
        }
    }
}

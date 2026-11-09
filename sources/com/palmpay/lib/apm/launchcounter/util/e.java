package com.palmpay.lib.apm.launchcounter.util;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.EnumC1203m;
import com.palmpay.lib.apm.launchcounter.TimeCounterManager;
import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e f23795g = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedList f23796a = new LinkedList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f23797b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f23798c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23799d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23800e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f23801f = false;

    public static Object b() {
        Object obj;
        try {
            Field declaredField = Class.forName("android.app.ActivityThread").getDeclaredField("sCurrentActivityThread");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Exception e10) {
            Log.e("UtilsActivityLifecycle", "getActivityThreadInActivityThreadStaticField: " + e10.getMessage());
            obj = null;
        }
        if (obj != null) {
            return obj;
        }
        try {
            return Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception e11) {
            Log.e("UtilsActivityLifecycle", "getActivityThreadInActivityThreadStaticMethod: " + e11.getMessage());
            return null;
        }
    }

    public final void a(Activity activity, EnumC1203m enumC1203m) {
        ConcurrentHashMap concurrentHashMap = this.f23798c;
        List<LaunchUtils.ActivityLifecycleCallbacks> list = (List) concurrentHashMap.get(activity);
        if (list == null) {
            return;
        }
        for (LaunchUtils.ActivityLifecycleCallbacks activityLifecycleCallbacks : list) {
            activityLifecycleCallbacks.onLifecycleChanged(activity, enumC1203m);
            if (enumC1203m.equals(EnumC1203m.ON_CREATE)) {
                activityLifecycleCallbacks.onActivityCreated(activity);
            } else if (enumC1203m.equals(EnumC1203m.ON_START)) {
                activityLifecycleCallbacks.onActivityStarted(activity);
            } else if (enumC1203m.equals(EnumC1203m.ON_RESUME)) {
                activityLifecycleCallbacks.onActivityResumed(activity);
            } else if (enumC1203m.equals(EnumC1203m.ON_PAUSE)) {
                activityLifecycleCallbacks.onActivityPaused(activity);
            } else if (enumC1203m.equals(EnumC1203m.ON_STOP)) {
                activityLifecycleCallbacks.onActivityStopped(activity);
            } else if (enumC1203m.equals(EnumC1203m.ON_DESTROY)) {
                activityLifecycleCallbacks.onActivityDestroyed(activity);
            }
        }
        if (enumC1203m.equals(EnumC1203m.ON_DESTROY)) {
            concurrentHashMap.remove(activity);
        }
    }

    public final void c(Activity activity, boolean z3) {
        CopyOnWriteArrayList<LaunchUtils.OnAppStatusChangedListener> copyOnWriteArrayList = this.f23797b;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        for (LaunchUtils.OnAppStatusChangedListener onAppStatusChangedListener : copyOnWriteArrayList) {
            if (z3) {
                onAppStatusChangedListener.onForeground(activity);
            } else {
                onAppStatusChangedListener.onBackground(activity);
            }
        }
    }

    public final void d(Activity activity) {
        LinkedList linkedList = this.f23796a;
        if (!linkedList.contains(activity)) {
            linkedList.addFirst(activity);
        } else {
            if (((Activity) linkedList.getFirst()).equals(activity)) {
                return;
            }
            linkedList.remove(activity);
            linkedList.addFirst(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (this.f23796a.size() == 0) {
            c(activity, true);
        }
        if (Build.VERSION.SDK_INT < 26 || !ValueAnimator.areAnimatorsEnabled()) {
            try {
                Field declaredField = ValueAnimator.class.getDeclaredField("sDurationScale");
                declaredField.setAccessible(true);
                if (((Float) declaredField.get(null)).floatValue() == 0.0f) {
                    declaredField.set(null, Float.valueOf(1.0f));
                }
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
            } catch (NoSuchFieldException e11) {
                e11.printStackTrace();
            }
        }
        d(activity);
        a(activity, EnumC1203m.ON_CREATE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f23796a.remove(activity);
        a(activity, EnumC1203m.ON_DESTROY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(activity, EnumC1203m.ON_PAUSE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostSaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPrePaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreSaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        d(activity);
        if (this.f23801f) {
            this.f23801f = false;
            c(activity, true);
        }
        a(activity, EnumC1203m.ON_RESUME);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (!this.f23801f) {
            d(activity);
        }
        int i7 = this.f23800e;
        if (i7 < 0) {
            this.f23800e = i7 + 1;
        } else {
            this.f23799d++;
        }
        a(activity, EnumC1203m.ON_START);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (activity.isChangingConfigurations()) {
            this.f23800e--;
        } else {
            int i7 = this.f23799d - 1;
            this.f23799d = i7;
            if (i7 <= 0) {
                this.f23801f = true;
                TimeCounterManager.get().onEnterBackground();
                c(activity, false);
            }
        }
        a(activity, EnumC1203m.ON_STOP);
    }
}

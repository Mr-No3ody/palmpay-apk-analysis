package com.palmpay.lib.apm.launchcounter.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.lifecycle.EnumC1203m;

/* JADX INFO: loaded from: classes3.dex */
public final class LaunchUtils {

    @SuppressLint({"StaticFieldLeak"})
    private static Application sApp;

    public static class ActivityLifecycleCallbacks {
        public void onActivityCreated(@NonNull Activity activity) {
        }

        public void onActivityDestroyed(@NonNull Activity activity) {
        }

        public void onActivityPaused(@NonNull Activity activity) {
        }

        public void onActivityResumed(@NonNull Activity activity) {
        }

        public void onActivityStarted(@NonNull Activity activity) {
        }

        public void onActivityStopped(@NonNull Activity activity) {
        }

        public void onLifecycleChanged(@NonNull Activity activity, EnumC1203m enumC1203m) {
        }
    }

    public interface Consumer<T> {
        void accept(T t);
    }

    public interface Func1<Ret, Par> {
        Ret call(Par par);
    }

    public interface OnAppStatusChangedListener {
        void onBackground(Activity activity);

        void onForeground(Activity activity);
    }

    public interface Supplier<T> {
        T get();
    }

    private LaunchUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static Application getApp() {
        Application application = sApp;
        if (application != null) {
            return application;
        }
        init(f.a());
        Application application2 = sApp;
        if (application2 != null) {
            return application2;
        }
        throw new NullPointerException("reflect failed.");
    }

    public static void init(Application application) {
        if (application == null) {
            Log.e("Utils", "app is null.");
            return;
        }
        Application application2 = sApp;
        if (application2 == null) {
            sApp = application;
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = e.f23795g;
            activityLifecycleCallbacks.getClass();
            application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
            return;
        }
        if (application2.equals(application)) {
            return;
        }
        Application application3 = sApp;
        e eVar = e.f23795g;
        eVar.f23796a.clear();
        application3.unregisterActivityLifecycleCallbacks(eVar);
        sApp = application;
        eVar.getClass();
        application.registerActivityLifecycleCallbacks(eVar);
    }
}

package com.transsnet.palmpay.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class Utils {
    private static final LinkedList<Activity> ACTIVITY_LIST = new LinkedList<>();
    static boolean isForeground = false;
    private static Application.ActivityLifecycleCallbacks mCallbacks = new Application.ActivityLifecycleCallbacks() { // from class: com.transsnet.palmpay.util.Utils.1
        private int activeCount = 0;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Utils.setTopActivity(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            Utils.ACTIVITY_LIST.remove(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            Utils.setTopActivity(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            Utils.setTopActivity(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            Utils.setTopActivity(activity);
            int i7 = this.activeCount + 1;
            this.activeCount = i7;
            if (i7 <= 0 || Utils.isForeground) {
                return;
            }
            Utils.isForeground = true;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            int i7 = this.activeCount - 1;
            this.activeCount = i7;
            if (i7 <= 0) {
                Utils.isForeground = false;
                this.activeCount = 0;
            }
        }
    };

    @SuppressLint({"StaticFieldLeak"})
    private static Application sApplication;
    private static WeakReference<ExecutorService> sExecutor;

    private Utils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static LinkedList<Activity> getActivityList() {
        return ACTIVITY_LIST;
    }

    public static Application getApp() {
        Application application = sApplication;
        if (application != null) {
            return application;
        }
        throw new NullPointerException("u should init first");
    }

    public static ExecutorService getExecutor() {
        WeakReference<ExecutorService> weakReference = sExecutor;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static Activity getTopActivity() {
        Activity last;
        LinkedList<Activity> linkedList = ACTIVITY_LIST;
        if (!linkedList.isEmpty() && (last = linkedList.getLast()) != null) {
            return last;
        }
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object objInvoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            Map map = (Map) declaredField.get(objInvoke);
            if (map == null) {
                return null;
            }
            for (Object obj : map.values()) {
                Class<?> cls2 = obj.getClass();
                Field declaredField2 = cls2.getDeclaredField("paused");
                declaredField2.setAccessible(true);
                if (!declaredField2.getBoolean(obj)) {
                    Field declaredField3 = cls2.getDeclaredField("activity");
                    declaredField3.setAccessible(true);
                    Activity activity = (Activity) declaredField3.get(obj);
                    setTopActivity(activity);
                    return activity;
                }
            }
        } catch (ClassNotFoundException e10) {
            e10.printStackTrace();
        } catch (IllegalAccessException e11) {
            e11.printStackTrace();
        } catch (NoSuchFieldException e12) {
            e12.printStackTrace();
        } catch (NoSuchMethodException e13) {
            e13.printStackTrace();
        } catch (InvocationTargetException e14) {
            e14.printStackTrace();
        }
        return null;
    }

    public static Context getTopActivityOrApp() {
        if (!isAppForeground()) {
            return getApp();
        }
        Activity topActivity = getTopActivity();
        return topActivity == null ? getApp() : topActivity;
    }

    public static void init(@NonNull Context context) {
        init((Application) context.getApplicationContext());
    }

    public static boolean isAppForeground() {
        return isForeground;
    }

    private static Activity popToActivity(Activity activity) {
        LinkedList<Activity> linkedList = ACTIVITY_LIST;
        Activity last = linkedList.getLast();
        if (last != activity) {
            linkedList.remove(last);
            popToActivity(activity);
        }
        return last;
    }

    public static void setExecutor(ExecutorService executorService) {
        sExecutor = new WeakReference<>(executorService);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setTopActivity(Activity activity) {
        if (activity == null || activity.getClass() == PermissionUtils.PermissionActivity.class) {
            return;
        }
        LinkedList<Activity> linkedList = ACTIVITY_LIST;
        if (!linkedList.contains(activity)) {
            linkedList.addLast(activity);
        } else {
            if (linkedList.getLast() == activity) {
                return;
            }
            linkedList.remove(activity);
            linkedList.addLast(activity);
        }
    }

    public static void init(@NonNull Application application) {
        if (sApplication != null || application == null) {
            return;
        }
        sApplication = application;
        application.registerActivityLifecycleCallbacks(mCallbacks);
    }
}

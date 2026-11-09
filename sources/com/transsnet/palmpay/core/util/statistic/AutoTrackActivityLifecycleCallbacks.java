package com.transsnet.palmpay.core.util.statistic;

import C0.G;
import Pa.C0504a;
import Pa.T;
import Pa.n0;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.init.LivenessTask;
import com.transsnet.palmpay.core.util.statistic.core.LogConstants;
import com.transsnet.palmpay.util.PermissionUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class AutoTrackActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
    public static final String EXTRA_ACTIVITY_EXTRA_DATA = "extra_activity_extra_data_";
    public static final String EXTRA_ACTIVITY_EXTRA_URI = "extra_activity_extra_uri";
    private final LinkedList<ActivityItem> mActivityList = new LinkedList<>();
    private boolean isFirstAppStart = true;

    public class ActivityItem {
        private Activity activity;
        private long startTime = System.currentTimeMillis();
        private boolean visible = true;

        public ActivityItem(Activity activity) {
            this.activity = activity;
        }

        public boolean equals(@Nullable Object obj) {
            Activity activity = this.activity;
            return activity != null && (obj instanceof ActivityItem) && activity == ((ActivityItem) obj).activity;
        }

        public Activity getActivity() {
            return this.activity;
        }

        public void logTime() {
            if (this.startTime <= 0) {
                this.startTime = System.currentTimeMillis();
            }
        }

        public void onActivityPaused() {
            this.startTime = -1L;
            this.visible = false;
        }
    }

    public static class CallbackHolder {
        public static final AutoTrackActivityLifecycleCallbacks mInstance = new AutoTrackActivityLifecycleCallbacks();

        private CallbackHolder() {
        }
    }

    private ActivityItem findActivity(final Activity activity) {
        if (activity != null && !this.mActivityList.isEmpty()) {
            for (int size = this.mActivityList.size() - 1; size >= 0; size--) {
                ActivityItem activityItem = this.mActivityList.get(size);
                if (activityItem.activity == activity) {
                    return activityItem;
                }
            }
        }
        return null;
    }

    public static AutoTrackActivityLifecycleCallbacks getInstance() {
        return CallbackHolder.mInstance;
    }

    private ActivityItem popToActivity(final ActivityItem activity) {
        if (this.mActivityList.isEmpty()) {
            return null;
        }
        ActivityItem last = this.mActivityList.getLast();
        if (last.equals(activity)) {
            this.mActivityList.remove(last);
            popToActivity(activity);
        }
        return last;
    }

    private ActivityItem setTopActivity(final Activity activity) {
        if (activity.getClass() == PermissionUtils.PermissionActivity.class) {
            return null;
        }
        ActivityItem activityItemFindActivity = findActivity(activity);
        if (activityItemFindActivity == null) {
            this.mActivityList.addLast(new ActivityItem(activity));
            return null;
        }
        activityItemFindActivity.logTime();
        if (this.mActivityList.getLast().equals(activityItemFindActivity)) {
            return null;
        }
        return popToActivity(activityItemFindActivity);
    }

    private void trackAppFirstOpenChannel(Activity activity) {
        if (this.isFirstAppStart && this.mActivityList.size() == 0) {
            this.isFirstAppStart = false;
            final HashMap map = new HashMap();
            if (!(activity instanceof BaseActivity) && !"ui.activity.SplashActivity".equalsIgnoreCase(activity.getLocalClassName())) {
                BaseApplication.get().lateInit(activity);
            }
            if (activity.getReferrer() != null) {
                map.put(LogConstants.Autotrack.ELEMENT_ACTIVITY_REFERRER, activity.getReferrer().getHost());
            }
            if (activity.getIntent() != null) {
                Intent intent = activity.getIntent();
                String action = intent.getAction();
                String stringExtra = intent.getStringExtra("extra_msg_type");
                if (!TextUtils.isEmpty(stringExtra)) {
                    map.put(LogConstants.Autotrack.ELEMENT_ACTIVITY_LAUNCH_MODE, stringExtra);
                } else if ("android.intent.action.MAIN".equals(action)) {
                    map.put(LogConstants.Autotrack.ELEMENT_ACTIVITY_LAUNCH_MODE, "android.intent.category.LAUNCHER");
                } else if ("android.intent.action.VIEW".equals(action)) {
                    Set<String> categories = intent.getCategories();
                    if (categories != null) {
                        Iterator<String> it = categories.iterator();
                        while (it.hasNext()) {
                            if ("android.intent.category.BROWSABLE".equals(it.next())) {
                                map.put(LogConstants.Autotrack.ELEMENT_ACTIVITY_LAUNCH_MODE, "android.intent.category.BROWSABLE");
                                break;
                            }
                        }
                    }
                } else {
                    map.put(LogConstants.Autotrack.ELEMENT_ACTIVITY_LAUNCH_MODE, action);
                }
                Uri data = intent.getData();
                if (data != null) {
                    map.put(EXTRA_ACTIVITY_EXTRA_URI, data.toString());
                }
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    for (String str : extras.keySet()) {
                        Object obj = extras.get(str);
                        if (obj != null) {
                            if ((obj instanceof String) || (obj instanceof Character)) {
                                map.put(G.o(EXTRA_ACTIVITY_EXTRA_DATA, str), obj.toString());
                            }
                            if ((obj instanceof Integer) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Long)) {
                                map.put(G.o(EXTRA_ACTIVITY_EXTRA_DATA, str), String.valueOf(obj));
                            }
                        }
                    }
                }
                T.b(-4).execute(new Runnable() { // from class: com.transsnet.palmpay.core.util.statistic.AutoTrackActivityLifecycleCallbacks.1
                    @Override // java.lang.Runnable
                    public void run() {
                        n0.g().q(new TrackEvent("statistic_source_of_app_start").afEvt(true).putAll(map));
                    }
                });
            }
        }
    }

    public ActivityItem getParentActivity(Activity activity) {
        if (this.mActivityList.isEmpty()) {
            return null;
        }
        if (!this.mActivityList.getLast().equals(findActivity(activity)) || this.mActivityList.size() <= 1) {
            return null;
        }
        LinkedList<ActivityItem> linkedList = this.mActivityList;
        return linkedList.get(linkedList.size() - 2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        trackAppFirstOpenChannel(activity);
        if ("com.palmpay.lib.liveness.ui.FaceCaptureActivity".equals(activity.getLocalClassName())) {
            LivenessTask.INSTANCE.initLiveness(activity.getApplication());
        }
        setTopActivity(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        ActivityItem activityItemFindActivity = findActivity(activity);
        if (activityItemFindActivity != null) {
            this.mActivityList.remove(activityItemFindActivity);
            if (this.mActivityList.isEmpty()) {
                C0504a.a().b("Monitor");
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        ActivityItem activityItemFindActivity = findActivity(activity);
        if (activityItemFindActivity != null) {
            activityItemFindActivity.onActivityPaused();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        setTopActivity(activity);
        C0504a c0504aA = C0504a.a();
        if (activity == null) {
            c0504aA.b("Monitor");
            return;
        }
        c0504aA.getClass();
        c0504aA.f7066a = activity.getClass().getSimpleName();
        StringBuilder sb2 = new StringBuilder("Monitor[");
        sb2.append(c0504aA.f7066a != null ? c0504aA.f7066a.replace("Activity", "") : "");
        sb2.append("]");
        c0504aA.b(sb2.toString());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Activity activity2;
        ActivityItem topActivity = setTopActivity(activity);
        if (topActivity != null) {
            AutoTrackHelper.trackActivityOnStart(activity, topActivity.activity);
            return;
        }
        if (this.mActivityList.size() > 1) {
            LinkedList<ActivityItem> linkedList = this.mActivityList;
            activity2 = linkedList.get(linkedList.size() - 2).activity;
        } else {
            activity2 = null;
        }
        AutoTrackHelper.trackActivityOnCreate(activity, activity2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}

package com.transsnet.palmpay.util;

import C0.G;
import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutManager;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import androidx.annotation.AnimRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.camera2.internal.P0;
import androidx.core.graphics.drawable.IconCompat;
import androidx.emoji2.text.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.chromium.support_lib_boundary.util.b;
import p058e0.a;

/* JADX INFO: loaded from: classes4.dex */
public final class ActivityUtils {
    private static final String TAG = "ActivityUtils";

    private ActivityUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static void createPinShortcuts(Context context, String str, String str2, int i7, String str3) {
        try {
            if (b.O(context)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    ShortcutManager shortcutManagerF = X.b.f(context.getSystemService("shortcut"));
                    if (shortcutManagerF.isRequestPinShortcutSupported()) {
                        Iterator it = shortcutManagerF.getPinnedShortcuts().iterator();
                        while (it.hasNext()) {
                            if (str.equals(X.b.e(it.next()).getId())) {
                                ToastUtils.showShort("isExit");
                                return;
                            }
                        }
                    }
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setComponent(new ComponentName(context.getPackageName(), "com.transsnet.palmpay.ui.activity.SplashActivity"));
                intent.setAction(str3);
                P0 p3 = new P0();
                p3.f13246a = context;
                p3.f13247b = str;
                p3.f13249d = str2;
                PorterDuff.Mode mode = IconCompat.f16046k;
                p3.f13250e = IconCompat.b(context.getResources(), context.getPackageName(), i7);
                p3.f13248c = new Intent[]{intent};
                if (TextUtils.isEmpty((String) p3.f13249d)) {
                    throw new IllegalArgumentException("Shortcut must have a non-empty label");
                }
                Intent[] intentArr = (Intent[]) p3.f13248c;
                if (intentArr == null || intentArr.length == 0) {
                    throw new IllegalArgumentException("Shortcut must have an intent");
                }
                b.a0(context, p3, PendingIntent.getBroadcast(context, 0, b.s(context, p3), Build.VERSION.SDK_INT >= 31 ? 33554432 : 0).getIntentSender());
            }
        } catch (Exception unused) {
        }
    }

    public static void finishActivity(@NonNull Activity activity) {
        finishActivity(activity, false);
    }

    public static void finishAllActivities() {
        finishAllActivities(false);
    }

    public static void finishAllActivitiesExceptNewest() {
        finishAllActivitiesExceptNewest(false);
    }

    public static void finishOtherActivities(@NonNull Class<?> cls) {
        finishOtherActivities(cls, false);
    }

    public static boolean finishToActivity(@NonNull Activity activity, boolean z3) {
        return finishToActivity(activity, z3, false);
    }

    public static Drawable getActivityIcon(Class<?> cls) {
        return getActivityIcon(new ComponentName(Utils.getApp(), cls));
    }

    public static List<Activity> getActivityList() {
        return Utils.getActivityList();
    }

    public static Drawable getActivityLogo(Class<?> cls) {
        return getActivityLogo(new ComponentName(Utils.getApp(), cls));
    }

    public static String getLauncherActivity() {
        return getLauncherActivity(Utils.getApp().getPackageName());
    }

    private static Bundle getOptionsBundle(Context context, int i7, int i10) {
        return ActivityOptions.makeCustomAnimation(context, i7, i10).toBundle();
    }

    public static Activity getParentActivity(Activity activity) {
        int i7;
        if (activity == null) {
            return null;
        }
        List<Activity> activityList = getActivityList();
        for (int size = activityList.size() - 1; size > 0; size--) {
            Activity activity2 = activityList.get(size);
            if (activity2 != null && activity.getClass().getName().equals(activity2.getClass().getName()) && (i7 = size - 1) >= 0) {
                return activityList.get(i7);
            }
        }
        return null;
    }

    public static Activity getTopActivity() {
        return Utils.getTopActivity();
    }

    public static boolean isActivityExists(@NonNull String str, @NonNull String str2) {
        Intent intent = new Intent();
        intent.setClassName(str, str2);
        return (Utils.getApp().getPackageManager().resolveActivity(intent, 0) == null || intent.resolveActivity(Utils.getApp().getPackageManager()) == null || Utils.getApp().getPackageManager().queryIntentActivities(intent, 0).size() == 0) ? false : true;
    }

    public static boolean isActivityExistsInStack(@NonNull Activity activity) {
        Iterator<Activity> it = Utils.getActivityList().iterator();
        while (it.hasNext()) {
            if (it.next().equals(activity)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isValidActivityContext(Activity activity) {
        return (activity == null || activity.isDestroyed() || activity.isFinishing()) ? false : true;
    }

    public static boolean isValidGlideContext(Context context) {
        if (context == null) {
            return false;
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            return (activity.isDestroyed() || activity.isFinishing()) ? false : true;
        }
        if (context instanceof ContextWrapper) {
            return isValidGlideContext(((ContextWrapper) context).getBaseContext());
        }
        return true;
    }

    public static void startActivities(@NonNull Intent[] intentArr) {
        startActivities(intentArr, Utils.getTopActivityOrApp(), (Bundle) null);
    }

    public static void startActivity(@NonNull Class<?> cls) {
        Context topActivityOrApp = Utils.getTopActivityOrApp();
        startActivity(topActivityOrApp, (Bundle) null, topActivityOrApp.getPackageName(), cls.getName(), (Bundle) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void startActivityInternal(Intent intent, Context context, Bundle bundle) {
        try {
            if (bundle != null) {
                context.startActivity(intent, bundle);
            } else {
                context.startActivity(intent);
            }
        } catch (Exception e10) {
            e10.toString();
        }
    }

    public static void startHomeActivity() {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        startActivity(intent);
    }

    public static void finishActivity(@NonNull Activity activity, boolean z3) {
        activity.finish();
        if (z3) {
            return;
        }
        activity.overridePendingTransition(0, 0);
    }

    public static void finishAllActivities(boolean z3) {
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(Utils.getActivityList());
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Activity activity = (Activity) arrayList.get(size);
                activity.finish();
                if (!z3) {
                    activity.overridePendingTransition(0, 0);
                }
            }
        } catch (Exception unused) {
        }
    }

    public static void finishAllActivitiesExceptNewest(boolean z3) {
        LinkedList<Activity> activityList = Utils.getActivityList();
        for (int size = activityList.size() - 2; size >= 0; size--) {
            finishActivity(activityList.get(size), z3);
        }
    }

    public static void finishOtherActivities(@NonNull Class<?> cls, boolean z3) {
        LinkedList<Activity> activityList = Utils.getActivityList();
        for (int size = activityList.size() - 1; size >= 0; size--) {
            Activity activity = activityList.get(size);
            if (!activity.getClass().equals(cls)) {
                finishActivity(activity, z3);
            }
        }
    }

    public static boolean finishToActivity(@NonNull Activity activity, boolean z3, boolean z8) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Utils.getActivityList());
        try {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Activity activity2 = (Activity) arrayList.get(size);
                if (activity2.equals(activity)) {
                    if (z3) {
                        finishActivity(activity2, z8);
                    }
                    return true;
                }
                finishActivity(activity2, z8);
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static Drawable getActivityIcon(ComponentName componentName) {
        try {
            return Utils.getApp().getPackageManager().getActivityIcon(componentName);
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static Drawable getActivityLogo(ComponentName componentName) {
        try {
            return Utils.getApp().getPackageManager().getActivityLogo(componentName);
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static String getLauncherActivity(@NonNull String str) {
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.addFlags(268435456);
        for (ResolveInfo resolveInfo : Utils.getApp().getPackageManager().queryIntentActivities(intent, 0)) {
            if (resolveInfo.activityInfo.packageName.equals(str)) {
                return resolveInfo.activityInfo.name;
            }
        }
        return G.o("no ", str);
    }

    public static void startActivities(@NonNull Intent[] intentArr, @Nullable Bundle bundle) {
        startActivities(intentArr, Utils.getTopActivityOrApp(), bundle);
    }

    private static Bundle getOptionsBundle(Activity activity, View[] viewArr) {
        int length = viewArr.length;
        a[] aVarArr = new a[length];
        for (int i7 = 0; i7 < length; i7++) {
            View view = viewArr[i7];
            aVarArr[i7] = new a(view, view.getTransitionName());
        }
        Pair[] pairArr = new Pair[length];
        for (int i10 = 0; i10 < length; i10++) {
            a aVar = aVarArr[i10];
            pairArr[i10] = Pair.create((View) aVar.f35983a, (String) aVar.f35984b);
        }
        return ActivityOptions.makeSceneTransitionAnimation(activity, pairArr).toBundle();
    }

    public static void startActivities(@NonNull Intent[] intentArr, @AnimRes int i7, @AnimRes int i10) {
        Context topActivityOrApp = Utils.getTopActivityOrApp();
        startActivities(intentArr, topActivityOrApp, getOptionsBundle(topActivityOrApp, i7, i10));
    }

    public static void startActivity(@NonNull Class<?> cls, @Nullable Bundle bundle) {
        Context topActivityOrApp = Utils.getTopActivityOrApp();
        startActivity(topActivityOrApp, (Bundle) null, topActivityOrApp.getPackageName(), cls.getName(), bundle);
    }

    public static void finishActivity(@NonNull Activity activity, @AnimRes int i7, @AnimRes int i10) {
        activity.finish();
        activity.overridePendingTransition(i7, i10);
    }

    public static boolean isActivityExistsInStack(@NonNull Class<?> cls) {
        Iterator<Activity> it = Utils.getActivityList().iterator();
        while (it.hasNext()) {
            if (it.next().getClass().equals(cls)) {
                return true;
            }
        }
        return false;
    }

    public static void finishAllActivitiesExceptNewest(@AnimRes int i7, @AnimRes int i10) {
        LinkedList<Activity> activityList = Utils.getActivityList();
        for (int size = activityList.size() - 2; size >= 0; size--) {
            finishActivity(activityList.get(size), i7, i10);
        }
    }

    public static void startActivities(@NonNull Activity activity, @NonNull Intent[] intentArr) {
        startActivities(intentArr, activity, (Bundle) null);
    }

    public static void startActivity(@NonNull Class<?> cls, @AnimRes int i7, @AnimRes int i10) {
        Context topActivityOrApp = Utils.getTopActivityOrApp();
        startActivity(topActivityOrApp, (Bundle) null, topActivityOrApp.getPackageName(), cls.getName(), getOptionsBundle(topActivityOrApp, i7, i10));
    }

    public static void finishActivity(@NonNull Class<?> cls) {
        finishActivity(cls, false);
    }

    public static void startActivities(@NonNull Activity activity, @NonNull Intent[] intentArr, @Nullable Bundle bundle) {
        startActivities(intentArr, activity, bundle);
    }

    public static void finishActivity(@NonNull Class<?> cls, boolean z3) {
        for (Activity activity : Utils.getActivityList()) {
            if (activity.getClass().equals(cls)) {
                activity.finish();
                if (!z3) {
                    activity.overridePendingTransition(0, 0);
                }
            }
        }
    }

    public static void finishOtherActivities(@NonNull Class<?> cls, @AnimRes int i7, @AnimRes int i10) {
        LinkedList<Activity> activityList = Utils.getActivityList();
        for (int size = activityList.size() - 1; size >= 0; size--) {
            Activity activity = activityList.get(size);
            if (!activity.getClass().equals(cls)) {
                finishActivity(activity, i7, i10);
            }
        }
    }

    public static Activity isActivityExistsInStack(@NonNull String str) {
        for (Activity activity : Utils.getActivityList()) {
            activity.getClass();
            if (activity.getClass().getName().equals(str)) {
                return activity;
            }
        }
        return null;
    }

    public static void startActivities(@NonNull Activity activity, @NonNull Intent[] intentArr, @AnimRes int i7, @AnimRes int i10) {
        startActivities(intentArr, activity, getOptionsBundle(activity, i7, i10));
    }

    public static void finishAllActivities(@AnimRes int i7, @AnimRes int i10) {
        LinkedList<Activity> activityList = Utils.getActivityList();
        for (int size = activityList.size() - 1; size >= 0; size--) {
            Activity activity = activityList.get(size);
            activity.finish();
            activity.overridePendingTransition(i7, i10);
        }
    }

    private static void startActivities(Intent[] intentArr, Context context, Bundle bundle) {
        if (!(context instanceof Activity)) {
            for (Intent intent : intentArr) {
                intent.addFlags(268435456);
            }
        }
        if (bundle != null) {
            context.startActivities(intentArr, bundle);
        } else {
            context.startActivities(intentArr);
        }
    }

    public static boolean finishToActivity(@NonNull Activity activity, boolean z3, @AnimRes int i7, @AnimRes int i10) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Utils.getActivityList());
        try {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Activity activity2 = (Activity) arrayList.get(size);
                if (activity2.equals(activity)) {
                    if (z3) {
                        finishActivity(activity2, i7, i10);
                    }
                    return true;
                }
                finishActivity(activity2, i7, i10);
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void startActivity(@NonNull Activity activity, @NonNull Class<?> cls) {
        startActivity(activity, (Bundle) null, activity.getPackageName(), cls.getName(), (Bundle) null);
    }

    public static void startActivity(@NonNull Activity activity, @NonNull Class<?> cls, @Nullable Bundle bundle) {
        startActivity(activity, (Bundle) null, activity.getPackageName(), cls.getName(), bundle);
    }

    public static void startActivity(@NonNull Activity activity, @NonNull Class<?> cls, @NonNull View... viewArr) {
        startActivity(activity, (Bundle) null, activity.getPackageName(), cls.getName(), getOptionsBundle(activity, viewArr));
    }

    public static void finishActivity(@NonNull Class<?> cls, @AnimRes int i7, @AnimRes int i10) {
        for (Activity activity : Utils.getActivityList()) {
            if (activity.getClass().equals(cls)) {
                activity.finish();
                activity.overridePendingTransition(i7, i10);
            }
        }
    }

    public static void startActivity(@NonNull Activity activity, @NonNull Class<?> cls, @AnimRes int i7, @AnimRes int i10) {
        startActivity(activity, (Bundle) null, activity.getPackageName(), cls.getName(), getOptionsBundle(activity, i7, i10));
    }

    public static boolean finishToActivity(@NonNull Class<?> cls, boolean z3) {
        return finishToActivity(cls, z3, false);
    }

    public static boolean finishToActivity(@NonNull Class<?> cls, boolean z3, boolean z8) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Utils.getActivityList());
        try {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Activity activity = (Activity) arrayList.get(size);
                if (activity.getClass().equals(cls)) {
                    if (z3) {
                        finishActivity(activity, z8);
                    }
                    return true;
                }
                finishActivity(activity, z8);
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void startActivity(@NonNull Bundle bundle, @NonNull Class<?> cls) {
        Context topActivityOrApp = Utils.getTopActivityOrApp();
        startActivity(topActivityOrApp, bundle, topActivityOrApp.getPackageName(), cls.getName(), (Bundle) null);
    }

    public static void startActivity(@NonNull Bundle bundle, @NonNull Class<?> cls, @NonNull Bundle bundle2) {
        Context topActivityOrApp = Utils.getTopActivityOrApp();
        startActivity(topActivityOrApp, bundle, topActivityOrApp.getPackageName(), cls.getName(), bundle2);
    }

    public static void startActivity(@NonNull Bundle bundle, @NonNull Class<?> cls, @AnimRes int i7, @AnimRes int i10) {
        Context topActivityOrApp = Utils.getTopActivityOrApp();
        startActivity(topActivityOrApp, bundle, topActivityOrApp.getPackageName(), cls.getName(), getOptionsBundle(topActivityOrApp, i7, i10));
    }

    public static boolean finishToActivity(@NonNull Class<?> cls, boolean z3, @AnimRes int i7, @AnimRes int i10) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Utils.getActivityList());
        try {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Activity activity = (Activity) arrayList.get(size);
                if (activity.getClass().equals(cls)) {
                    if (z3) {
                        finishActivity(activity, i7, i10);
                    }
                    return true;
                }
                finishActivity(activity, i7, i10);
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void startActivity(@NonNull Bundle bundle, @NonNull Activity activity, @NonNull Class<?> cls) {
        startActivity(activity, bundle, activity.getPackageName(), cls.getName(), (Bundle) null);
    }

    public static void startActivity(@NonNull Bundle bundle, @NonNull Activity activity, @NonNull Class<?> cls, @NonNull Bundle bundle2) {
        startActivity(activity, bundle, activity.getPackageName(), cls.getName(), bundle2);
    }

    public static void startActivity(@NonNull Bundle bundle, @NonNull Activity activity, @NonNull Class<?> cls, @NonNull View... viewArr) {
        startActivity(activity, bundle, activity.getPackageName(), cls.getName(), getOptionsBundle(activity, viewArr));
    }

    public static void startActivity(@NonNull Bundle bundle, @NonNull Activity activity, @NonNull Class<?> cls, @AnimRes int i7, @AnimRes int i10) {
        startActivity(activity, bundle, activity.getPackageName(), cls.getName(), getOptionsBundle(activity, i7, i10));
    }

    public static void startActivity(@NonNull String str, @NonNull String str2) {
        startActivity(Utils.getTopActivityOrApp(), (Bundle) null, str, str2, (Bundle) null);
    }

    public static void startActivity(@NonNull String str, @NonNull String str2, @Nullable Bundle bundle) {
        startActivity(Utils.getTopActivityOrApp(), (Bundle) null, str, str2, bundle);
    }

    public static void startActivity(@NonNull String str, @NonNull String str2, @AnimRes int i7, @AnimRes int i10) {
        Context topActivityOrApp = Utils.getTopActivityOrApp();
        startActivity(topActivityOrApp, (Bundle) null, str, str2, getOptionsBundle(topActivityOrApp, i7, i10));
    }

    public static void startActivity(@NonNull Activity activity, @NonNull String str, @NonNull String str2) {
        startActivity(activity, (Bundle) null, str, str2, (Bundle) null);
    }

    public static void startActivity(@NonNull Activity activity, @NonNull String str, @NonNull String str2, @Nullable Bundle bundle) {
        startActivity(activity, (Bundle) null, str, str2, bundle);
    }

    public static void startActivity(@NonNull Activity activity, @NonNull String str, @NonNull String str2, @NonNull View... viewArr) {
        startActivity(activity, (Bundle) null, str, str2, getOptionsBundle(activity, viewArr));
    }

    public static void startActivity(@NonNull Activity activity, @NonNull String str, @NonNull String str2, @AnimRes int i7, @AnimRes int i10) {
        startActivity(activity, (Bundle) null, str, str2, getOptionsBundle(activity, i7, i10));
    }

    public static void startActivity(@NonNull Bundle bundle, @NonNull String str, @NonNull String str2) {
        startActivity(Utils.getTopActivityOrApp(), bundle, str, str2, (Bundle) null);
    }

    public static void startActivity(@NonNull Bundle bundle, @NonNull String str, @NonNull String str2, @NonNull Bundle bundle2) {
        startActivity(Utils.getTopActivityOrApp(), bundle, str, str2, bundle2);
    }

    public static void startActivity(@NonNull Bundle bundle, @NonNull String str, @NonNull String str2, @AnimRes int i7, @AnimRes int i10) {
        Context topActivityOrApp = Utils.getTopActivityOrApp();
        startActivity(topActivityOrApp, bundle, str, str2, getOptionsBundle(topActivityOrApp, i7, i10));
    }

    public static void startActivity(@NonNull Bundle bundle, @NonNull Activity activity, @NonNull String str, @NonNull String str2) {
        startActivity(activity, bundle, str, str2, (Bundle) null);
    }

    public static void startActivity(@NonNull Bundle bundle, @NonNull Activity activity, @NonNull String str, @NonNull String str2, @NonNull Bundle bundle2) {
        startActivity(activity, bundle, str, str2, bundle2);
    }

    public static void startActivity(@NonNull Bundle bundle, @NonNull Activity activity, @NonNull String str, @NonNull String str2, @NonNull View... viewArr) {
        startActivity(activity, bundle, str, str2, getOptionsBundle(activity, viewArr));
    }

    public static void startActivity(@NonNull Bundle bundle, @NonNull Activity activity, @NonNull String str, @NonNull String str2, @AnimRes int i7, @AnimRes int i10) {
        startActivity(activity, bundle, str, str2, getOptionsBundle(activity, i7, i10));
    }

    public static void startActivity(@Nullable Intent intent) {
        if (intent == null) {
            return;
        }
        startActivity(intent, Utils.getTopActivityOrApp(), (Bundle) null);
    }

    public static void startActivity(@Nullable Intent intent, @Nullable Bundle bundle) {
        if (intent == null) {
            return;
        }
        startActivity(intent, Utils.getTopActivityOrApp(), bundle);
    }

    public static void startActivity(@Nullable Intent intent, @AnimRes int i7, @AnimRes int i10) {
        if (intent == null) {
            return;
        }
        Context topActivityOrApp = Utils.getTopActivityOrApp();
        startActivity(intent, topActivityOrApp, getOptionsBundle(topActivityOrApp, i7, i10));
    }

    public static void startActivity(@Nullable Activity activity, @Nullable Intent intent) {
        if (activity == null || intent == null) {
            return;
        }
        startActivity(intent, activity, (Bundle) null);
    }

    public static void startActivity(@NonNull Activity activity, @NonNull Intent intent, @Nullable Bundle bundle) {
        startActivity(intent, activity, bundle);
    }

    public static void startActivity(@NonNull Activity activity, @NonNull Intent intent, @NonNull View... viewArr) {
        startActivity(intent, activity, getOptionsBundle(activity, viewArr));
    }

    public static void startActivity(@NonNull Activity activity, @NonNull Intent intent, @AnimRes int i7, @AnimRes int i10) {
        startActivity(intent, activity, getOptionsBundle(activity, i7, i10));
    }

    private static void startActivity(Context context, Bundle bundle, String str, String str2, Bundle bundle2) {
        Intent intent = new Intent("android.intent.action.VIEW");
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.setComponent(new ComponentName(str, str2));
        startActivity(intent, context, bundle2);
    }

    private static void startActivity(Intent intent, Context context, Bundle bundle) {
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        ExecutorService executor = Utils.getExecutor();
        if (executor != null) {
            executor.submit(new j(intent, 21, context, bundle));
        } else {
            startActivityInternal(intent, context, bundle);
        }
    }
}

package com.transsnet.adsdk.utils;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.view.WindowManager;
import com.transsnet.adsdk.AdManager;
import com.transsnet.analysis.utils.AnalysisUtils;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class AppUtils {
    public static Activity getActivityByContext(Context context) {
        Activity activityByContextInner = getActivityByContextInner(context);
        if (isActivityAlive(activityByContextInner)) {
            return activityByContextInner;
        }
        return null;
    }

    private static Activity getActivityByContextInner(Context context) {
        if (context == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (context instanceof ContextWrapper) {
            if (!(context instanceof Activity)) {
                Activity activityFromDecorContext = getActivityFromDecorContext(context);
                if (activityFromDecorContext == null) {
                    arrayList.add(context);
                    context = ((ContextWrapper) context).getBaseContext();
                    if (context == null || arrayList.contains(context)) {
                        break;
                    }
                } else {
                    return activityFromDecorContext;
                }
            } else {
                return (Activity) context;
            }
        }
        return null;
    }

    private static Activity getActivityFromDecorContext(Context context) {
        if (context != null && context.getClass().getName().equals("com.android.internal.policy.DecorContext")) {
            try {
                Field declaredField = context.getClass().getDeclaredField("mActivityContext");
                declaredField.setAccessible(true);
                return (Activity) ((WeakReference) declaredField.get(context)).get();
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static String getAppVersionName() {
        return AnalysisUtils.getAppVersionName(AdManager.get().getApp(), AdManager.get().getApp().getPackageName());
    }

    public static int getScreenWidth() {
        WindowManager windowManager = (WindowManager) AdManager.get().getApp().getSystemService("window");
        if (windowManager == null) {
            return -1;
        }
        Point point = new Point();
        windowManager.getDefaultDisplay().getRealSize(point);
        return point.x;
    }

    public static boolean isActivityAlive(final Context context) {
        if (context == null) {
            return false;
        }
        return isActivityAlive(getActivityByContext(context));
    }

    public static boolean isActivityAlive(final Activity activity) {
        return (activity == null || activity.isFinishing() || activity.isDestroyed()) ? false : true;
    }
}

package com.luck.picture.lib.utils;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.E;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class ActivityCompatHelper {
    private static final int MIN_FRAGMENT_COUNT = 1;

    public static boolean assertValidRequest(Context context) {
        if (context instanceof Activity) {
            return !isDestroy((Activity) context);
        }
        if (context instanceof ContextWrapper) {
            ContextWrapper contextWrapper = (ContextWrapper) context;
            if (contextWrapper.getBaseContext() instanceof Activity) {
                return !isDestroy((Activity) contextWrapper.getBaseContext());
            }
        }
        return true;
    }

    public static boolean checkFragmentNonExits(E e10, String str) {
        return !isDestroy(e10) && e10.getSupportFragmentManager().E(str) == null;
    }

    public static boolean checkRootFragment(E e10) {
        if (!isDestroy(e10)) {
            ArrayList arrayList = e10.getSupportFragmentManager().f17070d;
            if ((arrayList != null ? arrayList.size() : 0) == 1) {
                return true;
            }
        }
        return false;
    }

    public static boolean isDestroy(Activity activity) {
        return activity == null || activity.isFinishing() || activity.isDestroyed();
    }
}

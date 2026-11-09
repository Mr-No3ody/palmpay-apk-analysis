package androidx.core.app;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: renamed from: androidx.core.app.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1032a extends androidx.core.content.d {
    /* JADX WARN: Multi-variable type inference failed */
    public static void g(Activity activity, String[] strArr, int i7) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (TextUtils.isEmpty(strArr[i10])) {
                throw new IllegalArgumentException(C0.G.r(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i10], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i10));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i11 = 0;
            for (int i12 = 0; i12 < strArr.length; i12++) {
                if (!hashSet.contains(Integer.valueOf(i12))) {
                    strArr2[i11] = strArr[i12];
                    i11++;
                }
            }
        }
        if (activity instanceof ActivityCompat$RequestPermissionsRequestCodeValidator) {
            ((ActivityCompat$RequestPermissionsRequestCodeValidator) activity).validateRequestPermissionsRequestCode(i7);
        }
        activity.requestPermissions(strArr, i7);
    }

    public static boolean h(Activity activity, String str) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        if (i7 >= 32) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        if (i7 != 31) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        try {
            return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }
}

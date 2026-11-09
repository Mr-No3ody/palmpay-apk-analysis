package com.luck.picture.lib.permissions;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Size;
import androidx.core.app.AbstractC1032a;
import androidx.core.content.d;
import androidx.fragment.app.Fragment;
import com.luck.picture.lib.utils.SpUtils;

/* JADX INFO: loaded from: classes3.dex */
public class PermissionUtil {
    public static final String ACTION_MANAGE_ALL_FILES_ACCESS_PERMISSION = "android.settings.MANAGE_ALL_FILES_ACCESS_PERMISSION";
    public static final int DEFAULT = 0;
    public static final int REFUSE = 2;
    public static final int REFUSE_PERMANENT = 3;
    public static final int SUCCESS = 1;

    public static int getPermissionStatus(Activity activity, String str) {
        int iA = d.a(activity, str);
        if (AbstractC1032a.h(activity, str)) {
            return 2;
        }
        if (iA == 0) {
            return 1;
        }
        return !SpUtils.contains(activity, str) ? 0 : 3;
    }

    public static void goIntentSetting(Fragment fragment, int i7) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", fragment.getActivity().getPackageName(), null));
            fragment.startActivityForResult(intent, i7);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static boolean hasPermissions(@NonNull Context context, @NonNull @Size(min = 1) String... strArr) {
        for (String str : strArr) {
            if (d.a(context, str) != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAllGranted(Context context, String[] strArr, int[] iArr) {
        boolean z3 = context.getApplicationInfo().targetSdkVersion >= 34 && d.a(context, PermissionConfig.READ_MEDIA_VISUAL_USER_SELECTED) == 0;
        if (iArr.length <= 0) {
            return false;
        }
        for (int i7 = 0; i7 < iArr.length; i7++) {
            if (iArr[i7] != 0) {
                if (!z3 || (!strArr[i7].equals(PermissionConfig.READ_MEDIA_IMAGES) && !strArr[i7].equals(PermissionConfig.READ_MEDIA_VIDEO))) {
                    return false;
                }
            }
        }
        return true;
    }
}

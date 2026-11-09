package com.luck.lib.camerax.permissions;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Size;
import androidx.core.content.d;

/* JADX INFO: loaded from: classes3.dex */
public class SimpleXPermissionUtil {
    public static void goIntentSetting(Activity activity, int i7) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", activity.getPackageName(), null));
            activity.startActivityForResult(intent, i7);
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

    public static boolean isAllGranted(int[] iArr) {
        if (iArr.length <= 0) {
            return false;
        }
        for (int i7 : iArr) {
            if (i7 != 0) {
                return false;
            }
        }
        return true;
    }
}

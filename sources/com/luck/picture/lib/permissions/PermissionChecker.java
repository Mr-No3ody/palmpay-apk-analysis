package com.luck.picture.lib.permissions;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.RequiresApi;
import androidx.core.app.AbstractC1032a;
import androidx.core.content.d;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import com.luck.picture.lib.basic.PictureCommonFragment;
import com.luck.picture.lib.config.SelectMimeType;
import com.luck.picture.lib.utils.ActivityCompatHelper;
import com.luck.picture.lib.utils.SdkVersionUtils;
import com.luck.picture.lib.utils.SpUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class PermissionChecker {
    private static final int REQUEST_CODE = 10086;
    private static PermissionChecker mInstance;

    private PermissionChecker() {
    }

    public static boolean checkSelfPermission(Context context, String[] strArr) {
        if (strArr == null) {
            return true;
        }
        for (String str : strArr) {
            if (d.a(context.getApplicationContext(), str) != 0) {
                return false;
            }
        }
        return true;
    }

    public static PermissionChecker getInstance() {
        if (mInstance == null) {
            synchronized (PermissionChecker.class) {
                try {
                    if (mInstance == null) {
                        mInstance = new PermissionChecker();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return mInstance;
    }

    public static boolean isCheckCamera(Context context) {
        return checkSelfPermission(context, new String[]{"android.permission.CAMERA"});
    }

    @RequiresApi(api = 33)
    public static boolean isCheckReadAudio(Context context) {
        return checkSelfPermission(context, new String[]{PermissionConfig.READ_MEDIA_AUDIO});
    }

    public static boolean isCheckReadExternalStorage(Context context) {
        return checkSelfPermission(context, new String[]{PermissionConfig.READ_EXTERNAL_STORAGE});
    }

    @RequiresApi(api = 33)
    public static boolean isCheckReadImages(Context context) {
        return checkSelfPermission(context, new String[]{PermissionConfig.READ_MEDIA_IMAGES});
    }

    public static boolean isCheckReadStorage(int i7, Context context) {
        if (!SdkVersionUtils.isTIRAMISU()) {
            return isCheckReadExternalStorage(context);
        }
        if (i7 == SelectMimeType.ofImage()) {
            return isCheckReadImages(context);
        }
        if (i7 == SelectMimeType.ofVideo()) {
            return isCheckReadVideo(context);
        }
        if (i7 == SelectMimeType.ofAudio()) {
            return isCheckReadAudio(context);
        }
        return isCheckReadImages(context) && isCheckReadVideo(context);
    }

    @RequiresApi(api = 33)
    public static boolean isCheckReadVideo(Context context) {
        return checkSelfPermission(context, new String[]{PermissionConfig.READ_MEDIA_VIDEO});
    }

    public static boolean isCheckSelfPermission(Context context, String[] strArr) {
        return checkSelfPermission(context, strArr);
    }

    public static boolean isCheckWriteExternalStorage(Context context) {
        return checkSelfPermission(context, new String[]{PermissionConfig.WRITE_EXTERNAL_STORAGE});
    }

    public void onRequestPermissionsResult(Context context, String[] strArr, int[] iArr, PermissionResultCallback permissionResultCallback) {
        Activity activity = (Activity) context;
        for (String str : strArr) {
            SpUtils.putBoolean(context, str, AbstractC1032a.h(activity, str));
        }
        if (PermissionUtil.isAllGranted(context, strArr, iArr)) {
            permissionResultCallback.onGranted();
        } else {
            permissionResultCallback.onDenied();
        }
    }

    public void requestPermissions(Fragment fragment, String[] strArr, PermissionResultCallback permissionResultCallback) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(strArr);
        requestPermissions(fragment, arrayList, REQUEST_CODE, permissionResultCallback);
    }

    public void requestPermissions(Fragment fragment, List<String[]> list, PermissionResultCallback permissionResultCallback) {
        requestPermissions(fragment, list, REQUEST_CODE, permissionResultCallback);
    }

    private void requestPermissions(Fragment fragment, List<String[]> list, int i7, PermissionResultCallback permissionResultCallback) {
        if (!ActivityCompatHelper.isDestroy(fragment.getActivity()) && (fragment instanceof PictureCommonFragment)) {
            E activity = fragment.getActivity();
            ArrayList arrayList = new ArrayList();
            for (String[] strArr : list) {
                for (String str : strArr) {
                    if (d.a(activity, str) != 0) {
                        arrayList.add(str);
                    }
                }
            }
            if (arrayList.size() <= 0) {
                if (permissionResultCallback != null) {
                    permissionResultCallback.onGranted();
                }
            } else {
                ((PictureCommonFragment) fragment).setPermissionsResultAction(permissionResultCallback);
                String[] strArr2 = new String[arrayList.size()];
                arrayList.toArray(strArr2);
                fragment.requestPermissions(strArr2, i7);
                AbstractC1032a.g(activity, strArr2, i7);
            }
        }
    }
}

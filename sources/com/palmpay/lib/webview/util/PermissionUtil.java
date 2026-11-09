package com.palmpay.lib.webview.util;

import android.webkit.PermissionRequest;
import androidx.fragment.app.E;
import java.util.Arrays;
import java.util.List;
import p140j8.f;
import p154k7.a;

/* JADX INFO: loaded from: classes3.dex */
public class PermissionUtil {

    public interface PermissionCallback {
        void onPermissionDenied();

        void onPermissionGranted();
    }

    private static boolean isOnlyAudio(String[] strArr) {
        List listAsList = Arrays.asList(strArr);
        return !listAsList.contains("android.webkit.resource.VIDEO_CAPTURE") && listAsList.contains("android.webkit.resource.AUDIO_CAPTURE");
    }

    private static boolean isVideo(String[] strArr) {
        return Arrays.asList(strArr).contains("android.webkit.resource.VIDEO_CAPTURE");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$requestAudioPermission$0(PermissionCallback permissionCallback, boolean z3, List list, List list2) {
        if (z3) {
            permissionCallback.onPermissionGranted();
        } else {
            permissionCallback.onPermissionDenied();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$requestVideoPermission$1(PermissionCallback permissionCallback, boolean z3, List list, List list2) {
        if (z3) {
            permissionCallback.onPermissionGranted();
        } else {
            permissionCallback.onPermissionDenied();
        }
    }

    private static void requestAudioPermission(E e10, PermissionCallback permissionCallback) {
        f.n(e10).e("android.permission.RECORD_AUDIO").e(new a(permissionCallback, 0));
    }

    public static void requestByMostEffort(E e10, PermissionRequest permissionRequest, PermissionCallback permissionCallback) {
        String[] resources = permissionRequest.getResources();
        if (isVideo(resources)) {
            requestVideoPermission(e10, permissionCallback);
        } else if (isOnlyAudio(resources)) {
            requestAudioPermission(e10, permissionCallback);
        } else {
            permissionCallback.onPermissionDenied();
        }
    }

    private static void requestVideoPermission(E e10, PermissionCallback permissionCallback) {
        f.n(e10).e("android.permission.CAMERA", "android.permission.RECORD_AUDIO").e(new a(permissionCallback, 1));
    }
}

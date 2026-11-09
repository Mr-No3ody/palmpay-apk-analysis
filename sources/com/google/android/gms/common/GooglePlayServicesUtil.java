package com.google.android.gms.common;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.zaj;

/* JADX INFO: loaded from: classes2.dex */
public final class GooglePlayServicesUtil extends GooglePlayServicesUtilLight {

    @NonNull
    public static final String GMS_ERROR_DIALOG = "GooglePlayServicesErrorDialog";

    @NonNull
    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";

    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;

    @NonNull
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";

    private GooglePlayServicesUtil() {
    }

    @Nullable
    @Deprecated
    public static Dialog getErrorDialog(int i7, @NonNull Activity activity, int i10) {
        return getErrorDialog(i7, activity, i10, null);
    }

    @NonNull
    @Deprecated
    public static PendingIntent getErrorPendingIntent(int i7, @NonNull Context context, int i10) {
        return GoogleApiAvailabilityLight.getInstance().getErrorResolutionPendingIntent(context, i7, i10);
    }

    @NonNull
    @Deprecated
    public static String getErrorString(int i7) {
        return GooglePlayServicesUtilLight.getErrorString(i7);
    }

    @NonNull
    public static Context getRemoteContext(@NonNull Context context) {
        return GooglePlayServicesUtilLight.getRemoteContext(context);
    }

    @NonNull
    public static Resources getRemoteResource(@NonNull Context context) {
        return GooglePlayServicesUtilLight.getRemoteResource(context);
    }

    @HideFirstParty
    @Deprecated
    public static int isGooglePlayServicesAvailable(@NonNull Context context) {
        return GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context);
    }

    @Deprecated
    public static boolean isUserRecoverableError(int i7) {
        return GooglePlayServicesUtilLight.isUserRecoverableError(i7);
    }

    public static boolean isUsingBackgroundThreadExecutorForBindService() {
        return GoogleApiManager.zat();
    }

    @Deprecated
    public static boolean showErrorDialogFragment(int i7, @NonNull Activity activity, int i10) {
        return showErrorDialogFragment(i7, activity, i10, null);
    }

    @Deprecated
    public static void showErrorNotification(int i7, @NonNull Context context) {
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        if (GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(context, i7) || GooglePlayServicesUtilLight.isPlayStorePossiblyUpdating(context, i7)) {
            googleApiAvailability.zai(context);
        } else {
            googleApiAvailability.showErrorNotification(context, i7);
        }
    }

    public static boolean useBackgroundThreadExecutorForBindService() {
        return GoogleApiManager.zas();
    }

    public static void useBackgroundThreadForConnectionCallback() {
        GmsClientSupervisor.setUseHandlerThreadForCallbacks();
    }

    @Nullable
    @Deprecated
    public static Dialog getErrorDialog(int i7, @NonNull Activity activity, int i10, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        if (true == GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(activity, i7)) {
            i7 = 18;
        }
        return GoogleApiAvailability.getInstance().getErrorDialog(activity, i7, i10, onCancelListener);
    }

    @KeepForSdk
    @Deprecated
    public static int isGooglePlayServicesAvailable(@NonNull Context context, int i7) {
        return GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context, i7);
    }

    @Deprecated
    public static boolean showErrorDialogFragment(int i7, @NonNull Activity activity, int i10, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        return showErrorDialogFragment(i7, activity, null, i10, onCancelListener);
    }

    public static boolean showErrorDialogFragment(int i7, @NonNull Activity activity, @Nullable Fragment fragment, int i10, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        if (true == GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(activity, i7)) {
            i7 = 18;
        }
        int i11 = i7;
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        if (fragment == null) {
            return googleApiAvailability.showErrorDialogFragment(activity, i11, i10, onCancelListener);
        }
        Dialog dialogZaa = googleApiAvailability.zaa(activity, i11, zaj.zac(fragment, GoogleApiAvailability.getInstance().getErrorResolutionIntent(activity, i11, "d"), i10), onCancelListener, null);
        if (dialogZaa == null) {
            return false;
        }
        googleApiAvailability.zah(activity, dialogZaa, GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }
}

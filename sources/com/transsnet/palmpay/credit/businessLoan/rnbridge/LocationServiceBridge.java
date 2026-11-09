package com.transsnet.palmpay.credit.businessLoan.rnbridge;

import E.AbstractC0198c;
import F6.d;
import Pa.C0525w;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import com.didi.drouter.annotation.Service;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.google.gson.Gson;
import com.palmpay.lib.bridge.BaseBridge;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.palmpay.lib.bridge.SyncBridge;
import com.transsnet.palmpay.credit.businessLoan.export.bean.LocationServiceBridgeParam;
import com.transsnet.palmpay.credit.businessLoan.export.bean.LocationServiceBridgeResult;
import com.transsnet.palmpay.credit.businessLoan.export.bean.LocationSettingsResult;
import com.transsnet.palmpay.credit.rnbridge.CreditHandleRouterBridgeV2;
import com.transsnet.palmpay.util.ActivityUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.F;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.greenrobot.eventbus.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1.c;

/* JADX INFO: loaded from: classes4.dex */
@Service(alias = {"/businessLoan/locationService"}, function = {IBridge.class}, priority = 1)
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 82\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00019B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\u00020\u00062\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\bJ7\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJC\u0010!\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00182\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u000fH\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\r2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J%\u0010,\u001a\u00020\r2\u0006\u0010'\u001a\u00020&2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00180*H\u0002¢\u0006\u0004\b,\u0010-J%\u0010.\u001a\u00020\r2\u0006\u0010'\u001a\u00020&2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00180*H\u0002¢\u0006\u0004\b.\u0010-J%\u0010/\u001a\u00020\r2\u0006\u0010'\u001a\u00020&2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00180*H\u0002¢\u0006\u0004\b/\u0010-J\u001b\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u001bH\u0002¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0018H\u0002¢\u0006\u0004\b2\u00103J#\u00106\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u00105\u001a\u0004\u0018\u000104H\u0014¢\u0006\u0004\b6\u00107¨\u0006:"}, d2 = {"Lcom/transsnet/palmpay/credit/businessLoan/rnbridge/LocationServiceBridge;", "Lcom/palmpay/lib/bridge/SyncBridge;", "Lcom/transsnet/palmpay/credit/businessLoan/export/bean/LocationServiceBridgeParam;", "<init>", "()V", "params", "", "handleCheckStatus", "(Lcom/transsnet/palmpay/credit/businessLoan/export/bean/LocationServiceBridgeParam;)V", "handleTriggerCheck", "handleShowGpsDialog", "handleOpenSettings", "handleActivityNotFound", "Lcom/transsnet/palmpay/credit/businessLoan/export/bean/LocationSettingsResult;", "openResult", "Lcom/transsnet/palmpay/credit/businessLoan/export/bean/LocationServiceBridgeResult;", "buildOpenSettingsResult", "(Lcom/transsnet/palmpay/credit/businessLoan/export/bean/LocationSettingsResult;)Lcom/transsnet/palmpay/credit/businessLoan/export/bean/LocationServiceBridgeResult;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "handleOpenSettingsException", "(Ljava/lang/Exception;)V", "handleIsPPRNActivity", "", "action", "message", "", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "createSuccessResult", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/transsnet/palmpay/credit/businessLoan/export/bean/LocationServiceBridgeResult;", "error", "createFailureResult", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/transsnet/palmpay/credit/businessLoan/export/bean/LocationServiceBridgeResult;", "result", "handleSuccess", "(Lcom/transsnet/palmpay/credit/businessLoan/export/bean/LocationServiceBridgeResult;)V", "Landroid/app/Activity;", "activity", "openLocationSettingsWithCompatibility", "(Landroid/app/Activity;)Lcom/transsnet/palmpay/credit/businessLoan/export/bean/LocationSettingsResult;", "", "attemptedMethods", "openHuaweiLocationSettings", "(Landroid/app/Activity;Ljava/util/List;)Lcom/transsnet/palmpay/credit/businessLoan/export/bean/LocationSettingsResult;", "openXiaomiLocationSettings", "openSamsungLocationSettings", "getDeviceInfo", "()Ljava/util/Map;", "handleError", "(Ljava/lang/String;)V", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "callback", "onHandle", "(Lcom/transsnet/palmpay/credit/businessLoan/export/bean/LocationServiceBridgeParam;Lcom/palmpay/lib/bridge/IBridgeCallback;)V", "Companion", "a", "module_business_loan_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LocationServiceBridge extends SyncBridge<LocationServiceBridgeParam> {

    @NotNull
    public static final String ACTION_CHECK_STATUS = "checkStatus";

    @NotNull
    public static final String ACTION_IS_PPRN_ACTIVITY = "isPPRNActivity";

    @NotNull
    public static final String ACTION_OPEN_SETTINGS = "openSettings";

    @NotNull
    public static final String ACTION_SHOW_GPS_DIALOG = "showGpsDialog";

    @NotNull
    public static final String ACTION_TRIGGER_CHECK = "triggerCheck";

    @NotNull
    public static final String TAG = "LocationServiceBridge";

    private final LocationServiceBridgeResult buildOpenSettingsResult(LocationSettingsResult openResult) {
        Map<String, String> deviceInfo = getDeviceInfo();
        return openResult.getSuccess() ? createSuccessResult(ACTION_OPEN_SETTINGS, openResult.getMessage(), G.g(new Pair(FirebaseAnalytics.Param.METHOD, openResult.getMethod()), new Pair(CreditHandleRouterBridgeV2.ACTION_DEVICE_INFO, deviceInfo))) : createFailureResult(ACTION_OPEN_SETTINGS, openResult.getMessage(), openResult.getError(), G.g(new Pair("attemptedMethods", openResult.getAttemptedMethods()), new Pair(CreditHandleRouterBridgeV2.ACTION_DEVICE_INFO, deviceInfo)));
    }

    private final LocationServiceBridgeResult createFailureResult(String action, String message, String error, Map<String, ? extends Object> data) {
        return new LocationServiceBridgeResult(false, action, message, data, error);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LocationServiceBridgeResult createFailureResult$default(LocationServiceBridge locationServiceBridge, String str, String str2, String str3, Map map, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            str3 = null;
        }
        if ((i7 & 8) != 0) {
            map = null;
        }
        return locationServiceBridge.createFailureResult(str, str2, str3, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LocationServiceBridgeResult createSuccessResult(String action, String message, Map<String, ? extends Object> data) {
        return new LocationServiceBridgeResult(true, action, message, data, null, 16, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LocationServiceBridgeResult createSuccessResult$default(LocationServiceBridge locationServiceBridge, String str, String str2, Map map, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            map = null;
        }
        return locationServiceBridge.createSuccessResult(str, str2, map);
    }

    private final Map<String, String> getDeviceInfo() {
        return G.g(new Pair("brand", Build.BRAND), new Pair("model", Build.MODEL), new Pair("manufacturer", Build.MANUFACTURER), new Pair("androidVersion", Build.VERSION.RELEASE), new Pair("sdkInt", String.valueOf(Build.VERSION.SDK_INT)));
    }

    private final void handleActivityNotFound() {
        handleSuccess(createFailureResult$default(this, ACTION_OPEN_SETTINGS, "Unable to get current Activity", "NO_ACTIVITY", null, 8, null));
    }

    private final void handleCheckStatus(LocationServiceBridgeParam params) {
        try {
            handleSuccess(createSuccessResult(ACTION_CHECK_STATUS, "Location permission status check completed", AbstractC0198c.g().a()));
        } catch (Exception e10) {
            d.c(TAG, "Failed to check location permission status", e10);
            handleSuccess(createFailureResult$default(this, ACTION_CHECK_STATUS, C0.G.o("Failed to check location permission status: ", e10.getMessage()), e10.getMessage(), null, 8, null));
        }
    }

    private final void handleError(String message) {
        d.c(TAG, C0.G.o("Request handling error: ", message));
        handleSuccess(createFailureResult$default(this, "ERROR", message, null, null, 12, null));
    }

    private final void handleIsPPRNActivity(LocationServiceBridgeParam params) {
        boolean zC;
        try {
            try {
                Activity topActivity = ActivityUtils.getTopActivity();
                zC = Intrinsics.c(topActivity != null ? topActivity.getClass().getSimpleName() : null, "PPRNActivity");
            } catch (Exception e10) {
                d.c("LocationServiceManager", "isInPPRNActivity - Exception occurred while checking", e10);
                zC = false;
            }
            handleSuccess(createSuccessResult(ACTION_IS_PPRN_ACTIVITY, "PPRNActivity environment check completed", F.b(new Pair("isInPPRNActivity", Boolean.valueOf(zC)))));
        } catch (Exception e11) {
            d.c(TAG, "Failed to check PPRNActivity environment", e11);
            handleSuccess(createFailureResult$default(this, ACTION_IS_PPRN_ACTIVITY, C0.G.o("Failed to check PPRNActivity environment: ", e11.getMessage()), e11.getMessage(), null, 8, null));
        }
    }

    private final void handleOpenSettings(LocationServiceBridgeParam params) {
        try {
            Activity topActivity = ActivityUtils.getTopActivity();
            if (topActivity == null) {
                handleActivityNotFound();
            } else {
                handleSuccess(buildOpenSettingsResult(openLocationSettingsWithCompatibility(topActivity)));
            }
        } catch (Exception e10) {
            d.c(TAG, "Exception occurred while opening location settings page", e10);
            handleOpenSettingsException(e10);
        }
    }

    private final void handleOpenSettingsException(Exception exception) {
        handleSuccess(createFailureResult(ACTION_OPEN_SETTINGS, C0.G.o("Failed to open location settings page: ", exception.getMessage()), exception.getMessage(), G.g(new Pair("exception", exception.getClass().getSimpleName()), new Pair(CreditHandleRouterBridgeV2.ACTION_DEVICE_INFO, getDeviceInfo()))));
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    private final void handleShowGpsDialog(LocationServiceBridgeParam params) {
        LocationServiceBridge locationServiceBridge;
        try {
            String title = params.getTitle();
            if (title == null) {
                title = "Turn on location services";
            }
            String message = params.getMessage();
            if (message == null) {
                message = "In order to provide you with a better service, I need to turn on the location service, go to the settings to turn on?";
            }
            String positiveButtonText = params.getPositiveButtonText();
            if (positiveButtonText == null) {
                positiveButtonText = "Confirm";
            }
            String negativeButtonText = params.getNegativeButtonText();
            if (negativeButtonText == null) {
                negativeButtonText = "Cancel";
            }
            if (AbstractC0198c.b0(title, message, positiveButtonText, negativeButtonText, new f(this, 14))) {
                return;
            }
            locationServiceBridge = this;
            try {
                handleSuccess(createFailureResult$default(locationServiceBridge, ACTION_SHOW_GPS_DIALOG, "Failed to show GPS enable dialog", null, null, 12, null));
            } catch (Exception e10) {
                e = e10;
                Exception exc = e;
                d.c(TAG, "Failed to show GPS enable dialog", exc);
                handleSuccess(createFailureResult$default(locationServiceBridge, ACTION_SHOW_GPS_DIALOG, C0.G.o("Failed to show GPS enable dialog: ", exc.getMessage()), exc.getMessage(), null, 8, null));
            }
        } catch (Exception e11) {
            e = e11;
            locationServiceBridge = this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleSuccess(LocationServiceBridgeResult result) {
        try {
            String json = ((Gson) C0525w.f().f7166b).toJson(result);
            d.h(TAG, 3, "Return result: " + result.getAction() + " - " + result.getMessage() + ", success=" + result.getSuccess());
            if (result.getSuccess()) {
                BaseBridge.handleSuccess$default(this, json, null, 2, null);
            } else {
                handleFail(new Throwable(json));
            }
        } catch (Exception e10) {
            d.c(TAG, "Failed to serialize result", e10);
            handleFail(new Throwable(C0.G.o("Failed to serialize result: ", e10.getMessage())));
        }
    }

    private final void handleTriggerCheck(LocationServiceBridgeParam params) {
        d.h(TAG, 3, "handleTriggerCheck - Trigger location permission check");
        d.h(TAG, 3, C0.G.o("  - businessType: ", params.getBusinessType()));
        d.h(TAG, 3, "  - showDialog: " + params.getShowDialog());
        try {
            String businessType = params.getBusinessType();
            if (businessType == null) {
                businessType = "RN_CALL";
            }
            Boolean showDialog = params.getShowDialog();
            AbstractC0198c.l0(businessType, showDialog != null ? showDialog.booleanValue() : true, new c(this, 21));
        } catch (Exception e10) {
            d.c(TAG, "Failed to trigger location permission check", e10);
            handleSuccess(createFailureResult$default(this, ACTION_TRIGGER_CHECK, C0.G.o("Failed to trigger location permission check: ", e10.getMessage()), e10.getMessage(), null, 8, null));
        }
    }

    private final LocationSettingsResult openHuaweiLocationSettings(Activity activity, List<String> attemptedMethods) {
        List<String> list;
        try {
            Intent intent = new Intent("com.huawei.settings.location.LOCATION_SETTINGS");
            if (intent.resolveActivity(activity.getPackageManager()) == null) {
                list = attemptedMethods;
                return new LocationSettingsResult(false, "Failed to open Huawei location settings", "NONE", "HUAWEI_METHOD_FAILED", list);
            }
            activity.startActivity(intent);
            attemptedMethods.add("HUAWEI_LOCATION_SETTINGS");
            list = attemptedMethods;
            try {
                return new LocationSettingsResult(true, "Opened Huawei location settings page", "HUAWEI_LOCATION_SETTINGS", null, list, 8, null);
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Exception e11) {
            e = e11;
            list = attemptedMethods;
        }
        d.h(TAG, 5, "Huawei device location settings failed", e);
        list.add("HUAWEI_LOCATION_SETTINGS (failed)");
        return new LocationSettingsResult(false, "Failed to open Huawei location settings", "NONE", "HUAWEI_METHOD_FAILED", list);
    }

    private final LocationSettingsResult openLocationSettingsWithCompatibility(Activity activity) {
        ArrayList arrayList = new ArrayList();
        try {
            try {
                Intent intent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
                if (intent.resolveActivity(activity.getPackageManager()) != null) {
                    activity.startActivity(intent);
                    arrayList.add("ACTION_LOCATION_SOURCE_SETTINGS");
                    return new LocationSettingsResult(true, "Opened location services settings page", "ACTION_LOCATION_SOURCE_SETTINGS", null, arrayList, 8, null);
                }
                try {
                    Intent intent2 = new Intent("android.settings.SECURITY_SETTINGS");
                    if (intent2.resolveActivity(activity.getPackageManager()) != null) {
                        activity.startActivity(intent2);
                        arrayList.add("ACTION_SECURITY_SETTINGS");
                        return new LocationSettingsResult(true, "Opened security settings page (may include location)", "ACTION_SECURITY_SETTINGS", null, arrayList, 8, null);
                    }
                    try {
                        Intent intent3 = new Intent("android.settings.SETTINGS");
                        if (intent3.resolveActivity(activity.getPackageManager()) != null) {
                            activity.startActivity(intent3);
                            arrayList.add("ACTION_SETTINGS");
                            return new LocationSettingsResult(true, "Opened system settings page", "ACTION_SETTINGS", null, arrayList, 8, null);
                        }
                    } catch (Exception e10) {
                        d.h(TAG, 5, "Method 3 failed: ACTION_SETTINGS", e10);
                        arrayList.add("ACTION_SETTINGS (failed)");
                    }
                    String BRAND = Build.BRAND;
                    Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
                    String lowerCase = BRAND.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    if (!StringsKt.A(lowerCase, "huawei", false) && !StringsKt.A(lowerCase, "honor", false)) {
                        if (!StringsKt.A(lowerCase, com.adjust.sdk.Constants.REFERRER_API_XIAOMI, false) && !StringsKt.A(lowerCase, "redmi", false)) {
                            return StringsKt.A(lowerCase, com.adjust.sdk.Constants.REFERRER_API_SAMSUNG, false) ? openSamsungLocationSettings(activity, arrayList) : new LocationSettingsResult(false, "Unable to open location settings page, all methods failed", "NONE", "ALL_METHODS_FAILED", arrayList);
                        }
                        return openXiaomiLocationSettings(activity, arrayList);
                    }
                    return openHuaweiLocationSettings(activity, arrayList);
                } catch (Exception e11) {
                    d.h(TAG, 5, "Method 2 failed: ACTION_SECURITY_SETTINGS", e11);
                    arrayList.add("ACTION_SECURITY_SETTINGS (failed)");
                }
            } catch (Exception e12) {
                d.h(TAG, 5, "Method 1 failed: ACTION_LOCATION_SOURCE_SETTINGS", e12);
                arrayList.add("ACTION_LOCATION_SOURCE_SETTINGS (failed)");
            }
        } catch (Exception e13) {
            d.c(TAG, "openLocationSettingsWithCompatibility - exception occurred", e13);
            return new LocationSettingsResult(false, C0.G.o("Exception occurred while opening location settings: ", e13.getMessage()), "NONE", e13.getMessage(), arrayList);
        }
        d.c(TAG, "openLocationSettingsWithCompatibility - exception occurred", e13);
        return new LocationSettingsResult(false, C0.G.o("Exception occurred while opening location settings: ", e13.getMessage()), "NONE", e13.getMessage(), arrayList);
    }

    private final LocationSettingsResult openSamsungLocationSettings(Activity activity, List<String> attemptedMethods) {
        List<String> list;
        try {
            Intent intent = new Intent("com.samsung.android.settings.LOCATION_SETTINGS");
            if (intent.resolveActivity(activity.getPackageManager()) == null) {
                list = attemptedMethods;
                return new LocationSettingsResult(false, "Failed to open Samsung location settings", "NONE", "SAMSUNG_METHOD_FAILED", list);
            }
            activity.startActivity(intent);
            attemptedMethods.add("SAMSUNG_LOCATION_SETTINGS");
            list = attemptedMethods;
            try {
                return new LocationSettingsResult(true, "Opened Samsung location settings page", "SAMSUNG_LOCATION_SETTINGS", null, list, 8, null);
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Exception e11) {
            e = e11;
            list = attemptedMethods;
        }
        d.h(TAG, 5, "Samsung device location settings failed", e);
        list.add("SAMSUNG_LOCATION_SETTINGS (failed)");
        return new LocationSettingsResult(false, "Failed to open Samsung location settings", "NONE", "SAMSUNG_METHOD_FAILED", list);
    }

    private final LocationSettingsResult openXiaomiLocationSettings(Activity activity, List<String> attemptedMethods) {
        List<String> list;
        try {
            Intent intent = new Intent("miui.intent.action.LOCATION_SETTINGS");
            if (intent.resolveActivity(activity.getPackageManager()) == null) {
                list = attemptedMethods;
                return new LocationSettingsResult(false, "Failed to open Xiaomi location settings", "NONE", "XIAOMI_METHOD_FAILED", list);
            }
            activity.startActivity(intent);
            attemptedMethods.add("XIAOMI_LOCATION_SETTINGS");
            list = attemptedMethods;
            try {
                return new LocationSettingsResult(true, "Opened Xiaomi location settings page", "XIAOMI_LOCATION_SETTINGS", null, list, 8, null);
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Exception e11) {
            e = e11;
            list = attemptedMethods;
        }
        d.h(TAG, 5, "Xiaomi device location settings failed", e);
        list.add("XIAOMI_LOCATION_SETTINGS (failed)");
        return new LocationSettingsResult(false, "Failed to open Xiaomi location settings", "NONE", "XIAOMI_METHOD_FAILED", list);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.palmpay.lib.bridge.BaseBridge
    public void onHandle(@Nullable LocationServiceBridgeParam params, @Nullable IBridgeCallback callback) {
        String action;
        d.h(TAG, 3, "LocationServiceBridge >>> params=" + params);
        if (params == null || (action = params.getAction()) == null || action.length() == 0) {
            handleError("Invalid parameter: action must not be null or empty");
            return;
        }
        try {
            String action2 = params.getAction();
            if (action2 != null) {
                switch (action2.hashCode()) {
                    case -984248939:
                        if (action2.equals(ACTION_IS_PPRN_ACTIVITY)) {
                            handleIsPPRNActivity(params);
                            return;
                        }
                        break;
                    case -372024179:
                        if (action2.equals(ACTION_OPEN_SETTINGS)) {
                            handleOpenSettings(params);
                            return;
                        }
                        break;
                    case 349598256:
                        if (action2.equals(ACTION_TRIGGER_CHECK)) {
                            handleTriggerCheck(params);
                            return;
                        }
                        break;
                    case 768129818:
                        if (action2.equals(ACTION_CHECK_STATUS)) {
                            handleCheckStatus(params);
                            return;
                        }
                        break;
                    case 826156053:
                        if (action2.equals(ACTION_SHOW_GPS_DIALOG)) {
                            handleShowGpsDialog(params);
                            return;
                        }
                        break;
                }
            }
            d.c(TAG, "Unknown action type: " + params.getAction());
            handleError("Unknown action type: " + params.getAction());
        } catch (Exception e10) {
            d.c(TAG, "Exception while handling location service request", e10);
            handleError(C0.G.o("Failed to process request: ", e10.getMessage()));
        }
    }
}

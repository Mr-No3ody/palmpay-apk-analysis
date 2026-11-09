package com.transsnet.palmpay.core.init;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b(\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001f\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010 \u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010!\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\"\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010#\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010$\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010%\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010&\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010'\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010(\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"TASK_INIT_1", "", "TASK_INIT_ADSDK", "TASK_FLEXIBANK_SDK_INIT", "TASK_FIREBASE_INIT", "TASK_HTTP_CLIENT_WARM", "TASK_GAID_INIT", "TASK_6", "TASK_GET_FCM_TOKEN", "TASK_ACTIVITY_TRACE", "TASK_10", "TASK_REACT_NATIVE_INIT", "TASK_PALMPAY_REMOTE_CONFIG", "TASK_WELCOME_NEW_USER_INIT", "TASK_GLIDE_INIT", "TASK_LIVE_NESS_INIT", "TASK_HOME_MENU_INIT", "TASK_LOAN_CONFIG", "TASK_AUTO_SIZE_CONFIG", "TASK_CRONET", "TASK_ANDROIDX_STARTUP", "TASK_INIT_APPSFLYER", "TASK_INIT_FACE_GUARD", "TASK_INIT_LOCAL_NOTIFICATION", "GROUP_LATE_INIT", "LATE_INIT_PRELOAD_IMG_TASK", "LATE_INIT_TONG_DUN_TASK", "LATE_INIT_EMOJI_TASK", "LATE_INIT_APPSFLYER_TASK", "LATE_INIT_PRELOAD_RN_TASK", "LATE_INIT_LOCAL_NOTIFICATION_TASK", "LATE_INIT_VAGUE_TASK", "LATE_INIT_DOWNLOAD_SPLASH_TASK", "LATE_INIT_START_PUSH_SERVICE_TASK", "LATE_INIT_SAFE_PIN_CONFIG_TASK", "LATE_INIT_CASHIER_CONFIG_TASK", "LATE_INIT_WEB_VIEW_TASK", "LATE_INIT_LEAK_CANARY_TASK", "LATE_INIT_APP_LIST_COLLECT_INIT_TASK", "LATE_INIT_IDLE_GATE", "TASK_GROWING_IO_INIT", "lib_core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class BaseInitTaskKt {

    @NotNull
    public static final String GROUP_LATE_INIT = "late_init";

    @NotNull
    public static final String LATE_INIT_APPSFLYER_TASK = "Late_Task_4";

    @NotNull
    public static final String LATE_INIT_APP_LIST_COLLECT_INIT_TASK = "Late_Task_15";

    @NotNull
    public static final String LATE_INIT_CASHIER_CONFIG_TASK = "Late_Task_12";

    @NotNull
    public static final String LATE_INIT_DOWNLOAD_SPLASH_TASK = "Late_Task_9";

    @NotNull
    public static final String LATE_INIT_EMOJI_TASK = "LATE_TASK_EMOJI";

    @NotNull
    public static final String LATE_INIT_IDLE_GATE = "Late_Task_IdleGate";

    @NotNull
    public static final String LATE_INIT_LEAK_CANARY_TASK = "Late_Task_14";

    @NotNull
    public static final String LATE_INIT_LOCAL_NOTIFICATION_TASK = "Late_Task_7";

    @NotNull
    public static final String LATE_INIT_PRELOAD_IMG_TASK = "Late_Task_1";

    @NotNull
    public static final String LATE_INIT_PRELOAD_RN_TASK = "Late_Task_6";

    @NotNull
    public static final String LATE_INIT_SAFE_PIN_CONFIG_TASK = "Late_Task_11";

    @NotNull
    public static final String LATE_INIT_START_PUSH_SERVICE_TASK = "Late_Task_10";

    @NotNull
    public static final String LATE_INIT_TONG_DUN_TASK = "Late_Task_2";

    @NotNull
    public static final String LATE_INIT_VAGUE_TASK = "Late_Task_8";

    @NotNull
    public static final String LATE_INIT_WEB_VIEW_TASK = "Late_Task_13";

    @NotNull
    public static final String TASK_10 = "Task_10";

    @NotNull
    public static final String TASK_6 = "Task_6";

    @NotNull
    public static final String TASK_ACTIVITY_TRACE = "task_activity_trace";

    @NotNull
    public static final String TASK_ANDROIDX_STARTUP = "task_androidx_startup";

    @NotNull
    public static final String TASK_AUTO_SIZE_CONFIG = "task_autosize_config";

    @NotNull
    public static final String TASK_CRONET = "task_cronet";

    @NotNull
    public static final String TASK_FIREBASE_INIT = "task_firebase_init";

    @NotNull
    public static final String TASK_FLEXIBANK_SDK_INIT = "task_flexibank_sdk_init";

    @NotNull
    public static final String TASK_GAID_INIT = "task_gaid_init";

    @NotNull
    public static final String TASK_GET_FCM_TOKEN = "task_get_fcm_token";

    @NotNull
    public static final String TASK_GLIDE_INIT = "task_glide_init";

    @NotNull
    public static final String TASK_GROWING_IO_INIT = "task_growing_io_init";

    @NotNull
    public static final String TASK_HOME_MENU_INIT = "task_home_menu_init";

    @NotNull
    public static final String TASK_HTTP_CLIENT_WARM = "task_http_client_warm";

    @NotNull
    public static final String TASK_INIT_1 = "task_init_1";

    @NotNull
    public static final String TASK_INIT_ADSDK = "task_init_adsdk";

    @NotNull
    public static final String TASK_INIT_APPSFLYER = "task_init_appsflyer";

    @NotNull
    public static final String TASK_INIT_FACE_GUARD = "task_init_FaceGuard";

    @NotNull
    public static final String TASK_INIT_LOCAL_NOTIFICATION = "task_init_local_notification";

    @NotNull
    public static final String TASK_LIVE_NESS_INIT = "task_live_ness_init";

    @NotNull
    public static final String TASK_LOAN_CONFIG = "task_loan_config";

    @NotNull
    public static final String TASK_PALMPAY_REMOTE_CONFIG = "task_palmpay_remote_config";

    @NotNull
    public static final String TASK_REACT_NATIVE_INIT = "task_react_native_init";

    @NotNull
    public static final String TASK_WELCOME_NEW_USER_INIT = "task_welcome_new_user_init";
}

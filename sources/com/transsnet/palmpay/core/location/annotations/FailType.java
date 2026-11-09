package com.transsnet.palmpay.core.location.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes3.dex */
@Retention(RetentionPolicy.SOURCE)
public @interface FailType {
    public static final int GOOGLE_PLAY_SERVICES_NOT_AVAILABLE = 4;
    public static final int GOOGLE_PLAY_SERVICES_SETTINGS_DENIED = 7;
    public static final int GOOGLE_PLAY_SERVICES_SETTINGS_DIALOG = 6;
    public static final int NETWORK_NOT_AVAILABLE = 3;
    public static final int PERMISSION_DENIED = 2;
    public static final int PERMISSION_DENIED_NEVER_ASK_AGAIN = 10;
    public static final int TIMEOUT = 1;
    public static final int UNKNOWN = -1;
    public static final int VIEW_DETACHED = 8;
    public static final int VIEW_NOT_REQUIRED_TYPE = 9;
}

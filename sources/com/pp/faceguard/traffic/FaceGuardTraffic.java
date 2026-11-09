package com.pp.faceguard.traffic;

import okhttp3.U;

/* JADX INFO: loaded from: classes3.dex */
public final class FaceGuardTraffic {
    private static volatile boolean debug = false;
    private static volatile String deviceId = "";
    private static volatile U httpClient;

    private FaceGuardTraffic() {
    }

    public static void bindDeviceTokens(String str, String str2, String str3, BindingCallback bindingCallback) {
        DeviceTokenBindingClient.bind(str, str2, str3, deviceId, bindingCallback);
    }

    public static void configureDebug(boolean z3) {
        debug = z3;
    }

    public static String getDeviceId() {
        return deviceId;
    }

    public static U getHttpClient() {
        return httpClient;
    }

    public static void initialize(String str, boolean z3) {
        initialize(str, z3, null);
    }

    public static boolean isDebug() {
        return debug;
    }

    public static void initialize(String str, boolean z3, U u6) {
        if (str == null) {
            str = "";
        }
        deviceId = str;
        debug = z3;
        httpClient = u6;
    }
}

package com.google.android.play.core.integrity.model;

import C0.G;
import N8.q0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f22717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f22718b;

    static {
        HashMap map = new HashMap();
        f22717a = map;
        HashMap map2 = new HashMap();
        f22718b = map2;
        Integer numJ = G.j(map, -1, "Standard Integrity API is not available.\nStandard Integrity API is not enabled, or the Play Store version might be old.\nRecommended actions:\n1) Make sure to be allowlisted to use Standard Integrity API.\n2) Make sure that Integrity API is enabled in Google Play Console.\n3) Ask the user to update Play Store.\n", -2, "The Play Store app is either not installed or not the official version.\nAsk the user to install an official and recent version of Play Store.\n");
        Integer numJ2 = G.j(map, -3, "Network error: unable to obtain integrity details.\nAsk the user to check for a connection.\n", -5, "PackageManager could not find this app.\nSomething is wrong (possibly an attack). Non-actionable.\n");
        Integer numJ3 = G.j(map, -6, "Google Play Services is not available or version is too old.\nAsk the user to Install or Update Play Services.\n", -7, "The calling app UID (user id) does not match the one from Package Manager.\nSomething is wrong (possibly an attack). Non-actionable.\n");
        Integer numJ4 = G.j(map, -8, "The calling app is making too many requests to the API and hence is throttled.\nRetry with an exponential backoff.\n", -9, "Binding to the service in the Play Store has failed. This can be due to having an old Play Store version installed on the device.\nAsk the user to update Play Store.\n");
        Integer numJ5 = G.j(map, -12, "Unknown internal Google server error.\nRetry with an exponential backoff. Consider filing a bug if fails consistently.\n", -14, "The Play Store needs to be updated.\nAsk the user to update the Google Play Store.\n");
        Integer numJ6 = G.j(map, -15, "Play Services needs to be updated.\nAsk the user to update Google Play Services.\n", -16, "The provided cloud project number is invalid.\nUse the cloud project number which can be found in Project info in your Google Cloud Console for the cloud project where Play Integrity API is enabled.\n");
        Integer numJ7 = G.j(map, -17, "The provided request hash is too long. The request hash length must be less than 500 bytes.\nRetry with a shorter request hash.", -18, "There is a transient error on the calling device.\nRetry with an exponential backoff.\n");
        Integer numJ8 = G.j(map, -19, "The StandardIntegrityTokenProvider is invalid (e.g. it is outdated).\nRequest a new integrity token provider by calling StandardIntegrityManager#prepareIntegrityToken.", -100, "Unknown error processing integrity request.\nRetry with an exponential backoff. Consider filing a bug if fails consistently.\n");
        map2.put(-1, "API_NOT_AVAILABLE");
        map2.put(-3, "NETWORK_ERROR");
        map2.put(numJ, "PLAY_STORE_NOT_FOUND");
        map2.put(numJ5, "PLAY_STORE_VERSION_OUTDATED");
        map2.put(numJ2, "APP_NOT_INSTALLED");
        map2.put(-6, "PLAY_SERVICES_NOT_FOUND");
        map2.put(-15, "PLAY_SERVICES_VERSION_OUTDATED");
        map2.put(numJ3, "APP_UID_MISMATCH");
        map2.put(-8, "TOO_MANY_REQUESTS");
        map2.put(numJ4, "CANNOT_BIND_TO_SERVICE");
        map2.put(numJ6, "CLOUD_PROJECT_NUMBER_IS_INVALID");
        map2.put(-17, "REQUEST_HASH_TOO_LONG");
        map2.put(-12, "GOOGLE_SERVER_UNAVAILABLE");
        map2.put(numJ7, "CLIENT_TRANSIENT_ERROR");
        map2.put(-19, "INTEGRITY_TOKEN_PROVIDER_INVALID");
        map2.put(numJ8, "INTERNAL_ERROR");
    }

    public static String a(int i7) {
        Map map = f22717a;
        Integer numValueOf = Integer.valueOf(i7);
        if (!map.containsKey(numValueOf)) {
            return "";
        }
        Map map2 = f22718b;
        return !map2.containsKey(numValueOf) ? "" : q0.l((String) map.get(numValueOf), " (https://developer.android.com/google/play/integrity/reference/com/google/android/play/core/integrity/model/StandardIntegrityErrorCode.html#", (String) map2.get(numValueOf), ")");
    }
}

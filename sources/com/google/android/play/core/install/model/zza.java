package com.google.android.play.core.install.model;

import C0.G;
import N8.q0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zza {
    private static final Map zza;
    private static final Map zzb;

    static {
        HashMap map = new HashMap();
        zza = map;
        HashMap map2 = new HashMap();
        zzb = map2;
        Integer numJ = G.j(map, -2, "An unknown error occurred.", -3, "The API is not available on this device.");
        Integer numJ2 = G.j(map, -4, "The request that was sent by the app is malformed.", -5, "The install is unavailable to this user or device.");
        Integer numJ3 = G.j(map, -6, "The download/install is not allowed, due to the current device state (e.g. low battery, low disk space, ...).", -7, "The install/update has not been (fully) downloaded yet.");
        Integer numJ4 = G.j(map, -8, "The install is already in progress and there is no UI flow to resume.", -9, "The Play Store app is either not installed or not the official version.");
        Integer numJ5 = G.j(map, -10, "The app is not owned by any user on this device. An app is \"owned\" if it has been acquired from Play.", -100, "An internal error happened in the Play Store.");
        map2.put(-2, "ERROR_UNKNOWN");
        map2.put(numJ, "ERROR_API_NOT_AVAILABLE");
        map2.put(-4, "ERROR_INVALID_REQUEST");
        map2.put(numJ2, "ERROR_INSTALL_UNAVAILABLE");
        map2.put(-6, "ERROR_INSTALL_NOT_ALLOWED");
        map2.put(numJ3, "ERROR_DOWNLOAD_NOT_PRESENT");
        map2.put(-8, "ERROR_INSTALL_IN_PROGRESS");
        map2.put(numJ5, "ERROR_INTERNAL_ERROR");
        map2.put(numJ4, "ERROR_PLAY_STORE_NOT_FOUND");
        map2.put(-10, "ERROR_APP_NOT_OWNED");
        map2.put(numJ5, "ERROR_INTERNAL_ERROR");
    }

    public static String zza(@InstallErrorCode int i7) {
        Map map = zza;
        Integer numValueOf = Integer.valueOf(i7);
        if (!map.containsKey(numValueOf)) {
            return "";
        }
        Map map2 = zzb;
        return !map2.containsKey(numValueOf) ? "" : q0.l((String) map.get(numValueOf), " (https://developer.android.com/reference/com/google/android/play/core/install/model/InstallErrorCode#", (String) map2.get(numValueOf), ")");
    }
}

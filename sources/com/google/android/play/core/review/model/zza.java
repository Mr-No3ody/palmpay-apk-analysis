package com.google.android.play.core.review.model;

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
        Integer numJ = G.j(map, -1, "The Play Store app is either not installed or not the official version.", -2, "Call first requestReviewFlow to get the ReviewInfo.");
        map.put(-100, "Retry with an exponential backoff. Consider filing a bug if fails consistently.");
        map2.put(-1, "PLAY_STORE_NOT_FOUND");
        map2.put(numJ, "INVALID_REQUEST");
        map2.put(-100, "INTERNAL_ERROR");
    }

    public static String zza(int i7) {
        Map map = zza;
        Integer numValueOf = Integer.valueOf(i7);
        return !map.containsKey(numValueOf) ? "" : q0.l((String) map.get(numValueOf), " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#", (String) zzb.get(numValueOf), ")");
    }
}

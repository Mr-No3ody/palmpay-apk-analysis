package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import androidx.camera.video.u;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.maps.android.BuildConfig;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public class MapUtils {
    @KeepForSdk
    public static void writeStringMapToJson(@NonNull StringBuilder sb2, @NonNull HashMap<String, String> map) {
        sb2.append("{");
        boolean z3 = true;
        for (String str : map.keySet()) {
            if (!z3) {
                sb2.append(",");
            }
            String str2 = map.get(str);
            u.w(sb2, "\"", str, "\":");
            if (str2 == null) {
                sb2.append(BuildConfig.TRAVIS);
            } else {
                u.w(sb2, "\"", str2, "\"");
            }
            z3 = false;
        }
        sb2.append("}");
    }
}

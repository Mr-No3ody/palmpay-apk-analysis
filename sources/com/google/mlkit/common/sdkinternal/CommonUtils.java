package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public class CommonUtils {
    private static final GmsLogger zza = new GmsLogger("CommonUtils", "");

    private CommonUtils() {
    }

    @NonNull
    @KeepForSdk
    public static String getAppVersion(@NonNull Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e10) {
            zza.e("CommonUtils", "Exception thrown when trying to get app version ".concat(e10.toString()));
            return "";
        }
    }

    @NonNull
    @KeepForSdk
    public static String languageTagFromLocale(@NonNull Locale locale) {
        if (PlatformVersion.isAtLeastLollipop()) {
            return locale.toLanguageTag();
        }
        StringBuilder sb2 = new StringBuilder(locale.getLanguage());
        if (!TextUtils.isEmpty(locale.getCountry())) {
            sb2.append("-");
            sb2.append(locale.getCountry());
        }
        if (!TextUtils.isEmpty(locale.getVariant())) {
            sb2.append("-");
            sb2.append(locale.getVariant());
        }
        return sb2.toString();
    }
}

package com.google.android.gms.common.internal;

import M.n;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.os.h;
import androidx.core.os.i;
import com.google.android.gms.base.R;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class zaf {
    private static final n zaa = new n(0);

    @Nullable
    private static Locale zab;

    @Nullable
    public static String zaa(Context context, int i7) {
        Resources resources = context.getResources();
        switch (i7) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return zah(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return zah(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 22);
                sb2.append("Unexpected error code ");
                sb2.append(i7);
                Log.e("GoogleApiAvailability", sb2.toString());
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return zah(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return zah(context, "common_google_play_services_restricted_profile_title");
        }
    }

    @NonNull
    public static String zab(Context context, int i7) {
        String strZah = i7 == 6 ? zah(context, "common_google_play_services_resolution_required_title") : zaa(context, i7);
        return strZah == null ? context.getResources().getString(R.string.common_google_play_services_notification_ticker) : strZah;
    }

    @NonNull
    public static String zac(Context context, int i7) {
        Resources resources = context.getResources();
        String strZaf = zaf(context);
        if (i7 == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, strZaf);
        }
        if (i7 == 2) {
            return DeviceProperties.isWearableWithoutPlayStore(context) ? resources.getString(R.string.common_google_play_services_wear_update_text) : resources.getString(R.string.common_google_play_services_update_text, strZaf);
        }
        if (i7 == 3) {
            return resources.getString(R.string.common_google_play_services_enable_text, strZaf);
        }
        if (i7 == 5) {
            return zag(context, "common_google_play_services_invalid_account_text", strZaf);
        }
        if (i7 == 7) {
            return zag(context, "common_google_play_services_network_error_text", strZaf);
        }
        if (i7 == 9) {
            return resources.getString(R.string.common_google_play_services_unsupported_text, strZaf);
        }
        if (i7 == 20) {
            return zag(context, "common_google_play_services_restricted_profile_text", strZaf);
        }
        switch (i7) {
            case 16:
                return zag(context, "common_google_play_services_api_unavailable_text", strZaf);
            case 17:
                return zag(context, "common_google_play_services_sign_in_failed_text", strZaf);
            case 18:
                return resources.getString(R.string.common_google_play_services_updating_text, strZaf);
            default:
                return resources.getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue, strZaf);
        }
    }

    @NonNull
    public static String zad(Context context, int i7) {
        return (i7 == 6 || i7 == 19) ? zag(context, "common_google_play_services_resolution_required_text", zaf(context)) : zac(context, i7);
    }

    @NonNull
    public static String zae(Context context, int i7) {
        Resources resources = context.getResources();
        if (i7 == 1) {
            return resources.getString(R.string.common_google_play_services_install_button);
        }
        if (i7 != 2) {
            return i7 != 3 ? resources.getString(android.R.string.ok) : resources.getString(R.string.common_google_play_services_enable_button);
        }
        return resources.getString(R.string.common_google_play_services_update_button);
    }

    public static String zaf(Context context) {
        String packageName = context.getPackageName();
        try {
            return Wrappers.packageManager(context).getApplicationLabel(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    private static String zag(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String strZah = zah(context, str);
        if (strZah == null) {
            strZah = resources.getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, strZah, str2);
    }

    @Nullable
    private static String zah(Context context, String str) {
        n nVar = zaa;
        synchronized (nVar) {
            try {
                Locale localeB = new h(new i(context.getResources().getConfiguration().getLocales())).b(0);
                if (!localeB.equals(zab)) {
                    nVar.clear();
                    zab = localeB;
                }
                String str2 = (String) nVar.get(str);
                if (str2 != null) {
                    return str2;
                }
                Resources remoteResource = GooglePlayServicesUtil.getRemoteResource(context);
                if (remoteResource == null) {
                    return null;
                }
                int identifier = remoteResource.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    new StringBuilder(str.length() + 18);
                    return null;
                }
                String string = remoteResource.getString(identifier);
                if (TextUtils.isEmpty(string)) {
                    new StringBuilder(str.length() + 20);
                    return null;
                }
                nVar.put(str, string);
                return string;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

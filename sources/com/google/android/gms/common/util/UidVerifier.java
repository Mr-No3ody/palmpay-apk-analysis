package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.wrappers.Wrappers;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public final class UidVerifier {
    private UidVerifier() {
    }

    @KeepForSdk
    public static boolean isGooglePlayServicesUid(@NonNull Context context, int i7) {
        if (!uidHasPackageName(context, i7, "com.google.android.gms")) {
            return false;
        }
        try {
            return GoogleSignatureVerifier.getInstance(context).isGooglePublicSignedPackage(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @KeepForSdk
    public static boolean uidHasPackageName(@NonNull Context context, int i7, @NonNull String str) {
        return Wrappers.packageManager(context).zza(i7, str);
    }
}

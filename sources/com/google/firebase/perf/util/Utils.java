package com.google.firebase.perf.util;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import com.google.common.primitives.UnsignedBytes;
import com.google.firebase.perf.logging.AndroidLogger;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.H;
import okhttp3.I;
import okhttp3.J;

/* JADX INFO: loaded from: classes2.dex */
public class Utils {
    private static Boolean isDebugLoggingEnabled;

    public static int bufferToInt(@NonNull byte[] bArr) {
        int i7 = 0;
        for (int i10 = 0; i10 < 4 && i10 < bArr.length; i10++) {
            i7 |= (bArr[i10] & UnsignedBytes.MAX_VALUE) << (i10 * 8);
        }
        return i7;
    }

    public static void checkArgument(boolean z3, String str) {
        if (!z3) {
            throw new IllegalArgumentException(str);
        }
    }

    public static boolean isDebugLoggingEnabled(@NonNull Context context) {
        Boolean bool = isDebugLoggingEnabled;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean boolValueOf = Boolean.valueOf(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("firebase_performance_logcat_enabled", false));
            isDebugLoggingEnabled = boolValueOf;
            return boolValueOf.booleanValue();
        } catch (PackageManager.NameNotFoundException | NullPointerException e10) {
            AndroidLogger.getInstance().debug("No perf logcat meta data found " + e10.getMessage());
            return false;
        }
    }

    public static int saturatedIntCast(long j6) {
        if (j6 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j6 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j6;
    }

    public static String stripSensitiveInfo(@NonNull String str) {
        I i7 = J.f40577k;
        J j6 = i7.parse(str);
        if (j6 == null) {
            return str;
        }
        H hF = j6.f();
        Intrinsics.checkNotNullParameter("", "username");
        hF.f40570b = I.canonicalize$okhttp$default(i7, "", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
        Intrinsics.checkNotNullParameter("", "password");
        hF.f40571c = I.canonicalize$okhttp$default(i7, "", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
        hF.f40575g = null;
        hF.f40576h = null;
        return hF.toString();
    }

    public static String truncateURL(String str, int i7) {
        int iLastIndexOf;
        if (str.length() <= i7) {
            return str;
        }
        if (str.charAt(i7) == '/') {
            return str.substring(0, i7);
        }
        J j6 = J.f40577k.parse(str);
        if (j6 == null) {
            return str.substring(0, i7);
        }
        return (j6.b().lastIndexOf(47) < 0 || (iLastIndexOf = str.lastIndexOf(47, i7 + (-1))) < 0) ? str.substring(0, i7) : str.substring(0, iLastIndexOf);
    }
}

package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.video.u;
import com.alibaba.android.arouter.utils.Consts;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public final class Preconditions {
    private Preconditions() {
        throw new AssertionError("Uninstantiable");
    }

    @KeepForSdk
    public static void checkArgument(boolean z3) {
        if (!z3) {
            throw new IllegalArgumentException();
        }
    }

    @KeepForSdk
    public static double checkArgumentInRange(double d2, double d10, double d11, @NonNull String str) {
        if (d2 < d10) {
            throw new IllegalArgumentException(zza("%s is out of range of [%f, %f] (too low)", str, Double.valueOf(d10), Double.valueOf(d11)));
        }
        if (d2 <= d11) {
            return d2;
        }
        throw new IllegalArgumentException(zza("%s is out of range of [%f, %f] (too high)", str, Double.valueOf(d10), Double.valueOf(d11)));
    }

    @IntRange(from = 0)
    @KeepForSdk
    public static int checkArgumentNonnegative(int i7) {
        if (i7 >= 0) {
            return i7;
        }
        throw new IllegalArgumentException("Given value is negative");
    }

    @KeepForSdk
    public static void checkHandlerThread(@NonNull Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + String.valueOf(name2).length() + 35 + 1);
            u.x(sb2, "Must be called on ", name2, " thread, but got ", name);
            sb2.append(Consts.DOT);
            throw new IllegalStateException(sb2.toString());
        }
    }

    @KeepForSdk
    public static void checkMainThread() {
        checkMainThread("Must be called on the main application thread");
    }

    @NonNull
    @KeepForSdk
    public static String checkNotEmpty(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        return str;
    }

    @KeepForSdk
    public static void checkNotGoogleApiHandlerThread() {
        checkNotGoogleApiHandlerThread("Must not be called on GoogleApiHandler thread.");
    }

    @KeepForSdk
    public static void checkNotMainThread() {
        checkNotMainThread("Must not be called on the main application thread");
    }

    @NonNull
    @KeepForSdk
    public static <T> T checkNotNull(@Nullable T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null reference");
    }

    @KeepForSdk
    public static int checkNotZero(int i7) {
        if (i7 != 0) {
            return i7;
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    @KeepForSdk
    public static void checkState(boolean z3) {
        if (!z3) {
            throw new IllegalStateException();
        }
    }

    public static String zza(String str, Object... objArr) {
        int iIndexOf;
        StringBuilder sb2 = new StringBuilder(str.length() + 48);
        int i7 = 0;
        int i10 = 0;
        while (i7 < 3 && (iIndexOf = str.indexOf("%s", i10)) != -1) {
            sb2.append(str.substring(i10, iIndexOf));
            sb2.append(objArr[i7]);
            i10 = iIndexOf + 2;
            i7++;
        }
        sb2.append(str.substring(i10));
        if (i7 < 3) {
            sb2.append(" [");
            sb2.append(objArr[i7]);
            for (int i11 = i7 + 1; i11 < 3; i11++) {
                sb2.append(", ");
                sb2.append(objArr[i11]);
            }
            sb2.append("]");
        }
        return sb2.toString();
    }

    @KeepForSdk
    public static void checkArgument(boolean z3, @NonNull Object obj) {
        if (!z3) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @IntRange(from = 0)
    @KeepForSdk
    public static int checkArgumentNonnegative(int i7, @NonNull String str) {
        if (i7 >= 0) {
            return i7;
        }
        throw new IllegalArgumentException(str);
    }

    @KeepForSdk
    public static void checkMainThread(@NonNull String str) {
        if (!com.google.android.gms.common.util.zze.zza()) {
            throw new IllegalStateException(str);
        }
    }

    @KeepForSdk
    public static void checkNotGoogleApiHandlerThread(@NonNull String str) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && java.util.Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException(str);
        }
    }

    @KeepForSdk
    public static void checkNotMainThread(@NonNull String str) {
        if (com.google.android.gms.common.util.zze.zza()) {
            throw new IllegalStateException(str);
        }
    }

    @NonNull
    @KeepForSdk
    public static <T> T checkNotNull(@NonNull T t, @NonNull Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @KeepForSdk
    public static int checkNotZero(int i7, @NonNull Object obj) {
        if (i7 != 0) {
            return i7;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    @KeepForSdk
    public static void checkState(boolean z3, @NonNull Object obj) {
        if (!z3) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    @KeepForSdk
    public static void checkArgument(boolean z3, @NonNull String str, @NonNull Object... objArr) {
        if (!z3) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    @KeepForSdk
    public static long checkArgumentNonnegative(long j6) {
        if (j6 >= 0) {
            return j6;
        }
        throw new IllegalArgumentException("Given value is negative");
    }

    @NonNull
    @KeepForSdk
    public static String checkNotEmpty(@Nullable String str, @NonNull Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return str;
    }

    @KeepForSdk
    public static long checkNotZero(long j6) {
        if (j6 != 0) {
            return j6;
        }
        throw new IllegalArgumentException("Given Long is zero");
    }

    @KeepForSdk
    public static void checkState(boolean z3, @NonNull String str, @NonNull Object... objArr) {
        if (!z3) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    @KeepForSdk
    public static float checkArgumentInRange(float f10, float f11, float f12, @NonNull String str) {
        if (f10 < f11) {
            throw new IllegalArgumentException(zza("%s is out of range of [%f, %f] (too low)", str, Float.valueOf(f11), Float.valueOf(f12)));
        }
        if (f10 <= f12) {
            return f10;
        }
        throw new IllegalArgumentException(zza("%s is out of range of [%f, %f] (too high)", str, Float.valueOf(f11), Float.valueOf(f12)));
    }

    @KeepForSdk
    public static long checkArgumentNonnegative(long j6, @NonNull String str) {
        if (j6 >= 0) {
            return j6;
        }
        throw new IllegalArgumentException(str);
    }

    @KeepForSdk
    public static long checkNotZero(long j6, @NonNull Object obj) {
        if (j6 != 0) {
            return j6;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    @KeepForSdk
    public static int checkArgumentInRange(int i7, int i10, int i11, @NonNull String str) {
        if (i7 < i10) {
            throw new IllegalArgumentException(zza("%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        if (i7 <= i11) {
            return i7;
        }
        throw new IllegalArgumentException(zza("%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    @KeepForSdk
    public static long checkArgumentInRange(long j6, long j10, long j11, @NonNull String str) {
        if (j6 < j10) {
            throw new IllegalArgumentException(zza("%s is out of range of [%d, %d] (too low)", str, Long.valueOf(j10), Long.valueOf(j11)));
        }
        if (j6 <= j11) {
            return j6;
        }
        throw new IllegalArgumentException(zza("%s is out of range of [%d, %d] (too high)", str, Long.valueOf(j10), Long.valueOf(j11)));
    }

    @KeepForSdk
    public static void checkHandlerThread(@NonNull Handler handler, @NonNull String str) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException(str);
        }
    }
}

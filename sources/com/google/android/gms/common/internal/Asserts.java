package com.google.android.gms.common.internal;

import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.camera.video.u;
import com.google.android.gms.common.annotation.KeepForSdk;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public final class Asserts {
    private Asserts() {
        throw new AssertionError("Uninstantiable");
    }

    @KeepForSdk
    public static void checkMainThread(@NonNull String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        String strValueOf = String.valueOf(Thread.currentThread());
        String strValueOf2 = String.valueOf(Looper.getMainLooper().getThread());
        StringBuilder sb2 = new StringBuilder(strValueOf2.length() + strValueOf.length() + 56 + 1);
        u.x(sb2, "checkMainThread: current thread ", strValueOf, " IS NOT the main thread ", strValueOf2);
        sb2.append("!");
        Log.e("Asserts", sb2.toString());
        throw new IllegalStateException(str);
    }

    @KeepForSdk
    public static void checkNotMainThread(@NonNull String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            return;
        }
        String strValueOf = String.valueOf(Thread.currentThread());
        String strValueOf2 = String.valueOf(Looper.getMainLooper().getThread());
        StringBuilder sb2 = new StringBuilder(strValueOf2.length() + strValueOf.length() + 55 + 1);
        u.x(sb2, "checkNotMainThread: current thread ", strValueOf, " IS the main thread ", strValueOf2);
        sb2.append("!");
        Log.e("Asserts", sb2.toString());
        throw new IllegalStateException(str);
    }

    @KeepForSdk
    public static void checkNotNull(@Nullable Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("null reference");
        }
    }

    @KeepForSdk
    public static void checkNull(@Nullable Object obj) {
        if (obj != null) {
            throw new IllegalArgumentException("non-null reference");
        }
    }

    @KeepForSdk
    public static void checkState(boolean z3) {
        if (!z3) {
            throw new IllegalStateException();
        }
    }

    @KeepForSdk
    public static void checkNotNull(@Nullable Object obj, @NonNull Object obj2) {
        if (obj == null) {
            throw new IllegalArgumentException(String.valueOf(obj2));
        }
    }

    @KeepForSdk
    public static void checkNull(@Nullable Object obj, @NonNull Object obj2) {
        if (obj != null) {
            throw new IllegalArgumentException(String.valueOf(obj2));
        }
    }

    @KeepForSdk
    public static void checkState(boolean z3, @NonNull Object obj) {
        if (!z3) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}

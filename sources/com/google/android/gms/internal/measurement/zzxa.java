package com.google.android.gms.internal.measurement;

import android.annotation.SuppressLint;
import com.google.common.util.concurrent.AsyncCallable;
import com.google.common.util.concurrent.AsyncFunction;
import java.util.HashMap;
import java.util.Random;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"TikTok.UnpropagatedTraceOnStartActivity"})
public final class zzxa {
    static {
        Math.abs(new Random().nextInt());
        new HashMap();
    }

    @JvmStatic
    @NotNull
    public static final Runnable zza(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        return new zzwz(new F(), zzvy.zzb(false), runnable);
    }

    @JvmStatic
    @NotNull
    public static final AsyncCallable zzb(@NotNull AsyncCallable asyncCallable) {
        Intrinsics.checkNotNullParameter(asyncCallable, "asyncCallable");
        return new zzwx(zzvy.zzb(false), asyncCallable);
    }

    @JvmStatic
    @NotNull
    public static final AsyncFunction zzc(@NotNull AsyncFunction asyncFunction) {
        Intrinsics.checkNotNullParameter(asyncFunction, "asyncFunction");
        return new zzwy(zzvy.zzb(false), asyncFunction);
    }
}

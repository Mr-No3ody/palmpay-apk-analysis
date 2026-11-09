package com.google.android.gms.internal.measurement;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Process;
import android.os.UserManager;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.common.util.concurrent.AsyncCallable;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class zzky {
    public static final /* synthetic */ int zza = 0;

    @Nullable
    @GuardedBy("DirectBootUtils.class")
    private static UserManager zzb;
    private static volatile boolean zzc = !zza();

    private zzky() {
    }

    @ChecksSdkIntAtLeast(api = 24)
    public static boolean zza() {
        return true;
    }

    public static boolean zzb(Context context) {
        return zza() && !zzi(context);
    }

    public static boolean zzc(Context context) {
        return !zza() || zzi(context);
    }

    public static ListenableFuture zzd(Context context, final Callable callable, Executor executor) {
        return zze(context, new AsyncCallable() { // from class: com.google.android.gms.internal.measurement.zzkx
            @Override // com.google.common.util.concurrent.AsyncCallable
            public final /* synthetic */ ListenableFuture call() {
                int i7 = zzky.zza;
                return Futures.submit(callable, MoreExecutors.directExecutor());
            }
        }, executor);
    }

    @SuppressLint({"UnprotectedReceiver"})
    public static ListenableFuture zze(final Context context, AsyncCallable asyncCallable, Executor executor) {
        if (zzc(context)) {
            return Futures.submitAsync(asyncCallable, executor);
        }
        final SettableFuture settableFutureCreate = SettableFuture.create();
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        final zzkv zzkvVar = new zzkv(atomicBoolean, context, settableFutureCreate, asyncCallable, executor);
        context.registerReceiver(zzkvVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        if (!zzc(context) || !atomicBoolean.compareAndSet(false, true)) {
            settableFutureCreate.addListener(new Runnable() { // from class: com.google.android.gms.internal.measurement.zzkw
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzky.zzj(settableFutureCreate, atomicBoolean, context, zzkvVar);
                }
            }, MoreExecutors.directExecutor());
            return settableFutureCreate;
        }
        zzh(context, zzkvVar);
        settableFutureCreate.setFuture(Futures.submitAsync(asyncCallable, executor));
        return settableFutureCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzh(Context context, BroadcastReceiver broadcastReceiver) {
        try {
            context.unregisterReceiver(broadcastReceiver);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0048 A[Catch: all -> 0x000f, TryCatch #1 {all -> 0x000f, blocks: (B:7:0x0009, B:9:0x000d, B:16:0x0017, B:18:0x001b, B:19:0x0025, B:31:0x0048, B:32:0x004a, B:22:0x002b, B:24:0x0031, B:27:0x003d, B:29:0x0044), top: B:38:0x0009, inners: #0 }] */
    @RequiresApi(24)
    @TargetApi(24)
    private static boolean zzi(Context context) {
        if (zzc) {
            return true;
        }
        synchronized (zzky.class) {
            try {
                if (zzc) {
                    return true;
                }
                int i7 = 1;
                while (true) {
                    boolean z3 = false;
                    if (i7 <= 2) {
                        if (zzb == null) {
                            zzb = (UserManager) context.getSystemService(UserManager.class);
                        }
                        UserManager userManager = zzb;
                        if (userManager == null) {
                            z3 = true;
                        } else {
                            try {
                                if (userManager.isUserUnlocked() || !userManager.isUserRunning(Process.myUserHandle())) {
                                    z3 = true;
                                }
                            } catch (NullPointerException unused) {
                                zzb = null;
                                i7++;
                            }
                        }
                        if (z3) {
                            zzc = true;
                        }
                        return z3;
                    }
                    if (z3) {
                        zzb = null;
                    }
                    if (z3) {
                        zzc = true;
                    }
                    return z3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void zzj(SettableFuture settableFuture, AtomicBoolean atomicBoolean, Context context, BroadcastReceiver broadcastReceiver) {
        if (settableFuture.isCancelled() && atomicBoolean.compareAndSet(false, true)) {
            zzh(context, broadcastReceiver);
        }
    }
}

package com.google.mlkit.common.sdkinternal;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.didiglobal.booster.instrument.ShadowHandlerThread;
import com.didiglobal.booster.instrument.ShadowThread;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_common.zzbf;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.mlkit.common.MlKitException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public class MLTaskExecutor {
    private static final Object zza = new Object();

    @Nullable
    @GuardedBy("lock")
    private static MLTaskExecutor zzb;
    private Handler zzc;

    private MLTaskExecutor(Looper looper) {
        this.zzc = new com.google.android.gms.internal.mlkit_common.zza(looper);
    }

    @NonNull
    @KeepForSdk
    public static MLTaskExecutor getInstance() {
        MLTaskExecutor mLTaskExecutor;
        synchronized (zza) {
            try {
                if (zzb == null) {
                    ShadowHandlerThread shadowHandlerThread = new ShadowHandlerThread("MLHandler", 9, "\u200bcom.google.mlkit.common.sdkinternal.MLTaskExecutor");
                    ShadowThread.setThreadName(shadowHandlerThread, "\u200bcom.google.mlkit.common.sdkinternal.MLTaskExecutor").start();
                    zzb = new MLTaskExecutor(shadowHandlerThread.getLooper());
                }
                mLTaskExecutor = zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mLTaskExecutor;
    }

    @NonNull
    @KeepForSdk
    public static Executor workerThreadExecutor() {
        return zzh.zza;
    }

    @NonNull
    @KeepForSdk
    public Handler getHandler() {
        return this.zzc;
    }

    @NonNull
    @KeepForSdk
    public <ResultT> Task<ResultT> scheduleCallable(@NonNull final Callable<ResultT> callable) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        scheduleRunnable(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.zzf
            @Override // java.lang.Runnable
            public final void run() {
                Callable callable2 = callable;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                try {
                    taskCompletionSource2.setResult(callable2.call());
                } catch (MlKitException e10) {
                    taskCompletionSource2.setException(e10);
                } catch (Exception e11) {
                    taskCompletionSource2.setException(new MlKitException("Internal error has occurred when executing ML Kit tasks", 13, e11));
                }
            }
        });
        return taskCompletionSource.getTask();
    }

    @KeepForSdk
    public void scheduleRunnable(@NonNull Runnable runnable) {
        workerThreadExecutor().execute(runnable);
    }

    @KeepForSdk
    public void scheduleRunnableDelayed(@NonNull Runnable runnable, long j6) {
        this.zzc.postDelayed(runnable, j6);
    }

    @NonNull
    @KeepForSdk
    public <ResultT> Task<ResultT> scheduleTaskCallable(@NonNull Callable<Task<ResultT>> callable) {
        return (Task<ResultT>) scheduleCallable(callable).continueWithTask(zzbf.zza(), new Continuation() { // from class: com.google.mlkit.common.sdkinternal.zzg
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return (Task) task.getResult();
            }
        });
    }
}

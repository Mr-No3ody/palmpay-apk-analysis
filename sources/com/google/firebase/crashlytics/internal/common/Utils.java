package com.google.firebase.crashlytics.internal.common;

import android.os.Looper;
import androidx.camera.core.impl.L;
import com.google.android.gms.tasks.Task;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class Utils {
    private static final int BACKGROUND_TIMEOUT_MILLIS = 4000;
    private static final int MAIN_TIMEOUT_MILLIS = 3000;
    private static final ExecutorService TASK_CONTINUATION_EXECUTOR_SERVICE = ExecutorUtils.buildSingleThreadExecutorService("awaitEvenIfOnMainThread task continuation executor");

    private Utils() {
    }

    @Deprecated
    public static <T> T awaitEvenIfOnMainThread(Task<T> task) throws InterruptedException, TimeoutException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        task.continueWith(TASK_CONTINUATION_EXECUTOR_SERVICE, new L(countDownLatch, 28));
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(3000L, TimeUnit.MILLISECONDS);
        } else {
            countDownLatch.await(4000L, TimeUnit.MILLISECONDS);
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.isCanceled()) {
            throw new CancellationException("Task is already canceled");
        }
        if (task.isComplete()) {
            throw new IllegalStateException(task.getException());
        }
        throw new TimeoutException();
    }

    @CanIgnoreReturnValue
    public static boolean awaitUninterruptibly(CountDownLatch countDownLatch, long j6, TimeUnit timeUnit) {
        boolean zAwait;
        boolean z3 = false;
        try {
            long nanos = timeUnit.toNanos(j6);
            long jNanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    zAwait = countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                    break;
                } catch (InterruptedException unused) {
                    z3 = true;
                    nanos = jNanoTime - System.nanoTime();
                }
            }
            if (z3) {
                Thread.currentThread().interrupt();
            }
            return zAwait;
        } catch (Throwable th) {
            if (z3) {
                Thread.currentThread().interrupt();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$awaitEvenIfOnMainThread$0(CountDownLatch countDownLatch, Task task) throws Exception {
        countDownLatch.countDown();
        return null;
    }
}

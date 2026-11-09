package com.google.android.gms.internal.identity;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfd {
    public static boolean zza(CountDownLatch countDownLatch, long j6, TimeUnit timeUnit) {
        boolean zAwait;
        boolean z3 = false;
        try {
            long nanos = timeUnit.toNanos(30L);
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
}

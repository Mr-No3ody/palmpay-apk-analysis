package com.adjust.sdk.scheduler;

import G7.k;
import androidx.core.provider.m;
import com.adjust.sdk.AdjustFactory;
import com.didiglobal.booster.instrument.ShadowThreadPoolExecutor;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p165l1.a;

/* JADX INFO: loaded from: classes.dex */
public class SingleThreadCachedScheduler implements ThreadScheduler {
    private ThreadPoolExecutor threadPoolExecutor;
    private final List<Runnable> queue = new ArrayList();
    private boolean isThreadProcessing = false;
    private boolean isTeardown = false;

    public SingleThreadCachedScheduler(String str) {
        this.threadPoolExecutor = new ShadowThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactoryWrapper(str), new a(str, 0), "\u200bcom.adjust.sdk.scheduler.SingleThreadCachedScheduler", true);
    }

    private void processQueue(Runnable runnable) {
        this.threadPoolExecutor.submit(new m(this, 26, runnable, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tryExecuteRunnable(Runnable runnable) {
        try {
            if (this.isTeardown) {
                return;
            }
            runnable.run();
        } catch (Throwable th) {
            AdjustFactory.getLogger().warn("Execution failed: %s", th.getMessage());
        }
    }

    @Override // com.adjust.sdk.scheduler.ThreadScheduler
    public void schedule(Runnable runnable, long j6) {
        synchronized (this.queue) {
            try {
                if (this.isTeardown) {
                    return;
                }
                this.threadPoolExecutor.submit(new k(this, j6, runnable));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.adjust.sdk.scheduler.ThreadExecutor
    public void submit(Runnable runnable) {
        synchronized (this.queue) {
            try {
                if (this.isTeardown) {
                    return;
                }
                if (this.isThreadProcessing) {
                    this.queue.add(runnable);
                } else {
                    this.isThreadProcessing = true;
                    processQueue(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.adjust.sdk.scheduler.ThreadExecutor
    public void teardown() {
        synchronized (this.queue) {
            this.isTeardown = true;
            this.queue.clear();
            this.threadPoolExecutor.shutdown();
        }
    }
}

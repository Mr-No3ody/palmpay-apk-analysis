package com.alibaba.android.arouter.thread;

import Pa.Q;
import androidx.annotation.NonNull;
import com.alibaba.android.arouter.launcher.ARouter;
import com.didiglobal.booster.instrument.ShadowThread;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class DefaultThreadFactory implements ThreadFactory {
    private static final AtomicInteger poolNumber = new AtomicInteger(1);
    private final ThreadGroup group;
    private final String namePrefix;
    private final AtomicInteger threadNumber = new AtomicInteger(1);

    public DefaultThreadFactory() {
        SecurityManager securityManager = System.getSecurityManager();
        this.group = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
        this.namePrefix = "ARouter task pool No." + poolNumber.getAndIncrement() + ", thread No.";
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(@NonNull Runnable runnable) {
        String str = this.namePrefix + this.threadNumber.getAndIncrement();
        ARouter.logger.info("ARouter::", "Thread production, name is [" + str + "]");
        ShadowThread shadowThread = new ShadowThread(this.group, runnable, str, 0L, "\u200bcom.alibaba.android.arouter.thread.DefaultThreadFactory");
        if (shadowThread.isDaemon()) {
            shadowThread.setDaemon(false);
        }
        if (shadowThread.getPriority() != 5) {
            shadowThread.setPriority(5);
        }
        shadowThread.setUncaughtExceptionHandler(new Q(2));
        return shadowThread;
    }
}

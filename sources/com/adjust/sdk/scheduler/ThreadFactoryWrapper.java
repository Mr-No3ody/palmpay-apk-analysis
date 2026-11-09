package com.adjust.sdk.scheduler;

import Pa.Q;
import com.adjust.sdk.Constants;
import com.didiglobal.booster.instrument.ShadowExecutors;
import com.didiglobal.booster.instrument.ShadowThread;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public class ThreadFactoryWrapper implements ThreadFactory {
    private String source;

    public ThreadFactoryWrapper(String str) {
        this.source = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread threadNewThread = ShadowExecutors.defaultThreadFactory("\u200bcom.adjust.sdk.scheduler.ThreadFactoryWrapper").newThread(runnable);
        threadNewThread.setPriority(9);
        threadNewThread.setName(ShadowThread.makeThreadName(Constants.THREAD_PREFIX + threadNewThread.getName() + "-" + this.source, "\u200bcom.adjust.sdk.scheduler.ThreadFactoryWrapper"));
        threadNewThread.setDaemon(true);
        threadNewThread.setUncaughtExceptionHandler(new Q(1));
        return threadNewThread;
    }
}

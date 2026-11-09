package com.didiglobal.booster.instrument;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class NamedThreadFactory implements ThreadFactory {
    private final AtomicInteger counter;
    private final ThreadFactory factory;
    private final ThreadGroup group;
    private final String name;

    public NamedThreadFactory(String str) {
        this(null, str);
    }

    public static ThreadFactory newInstance(String str) {
        return new NamedThreadFactory(str);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        ThreadFactory threadFactory = this.factory;
        if (threadFactory != null) {
            return ShadowThread.setThreadName(threadFactory.newThread(runnable), this.name);
        }
        Thread thread = new Thread(this.group, runnable, this.name + "#" + this.counter.getAndIncrement(), 0L);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        if (thread.getPriority() != 5) {
            thread.setPriority(5);
        }
        return thread;
    }

    public NamedThreadFactory(ThreadFactory threadFactory, String str) {
        this.counter = new AtomicInteger(1);
        this.factory = threadFactory;
        this.name = str;
        this.group = Thread.currentThread().getThreadGroup();
    }

    public static ThreadFactory newInstance(ThreadFactory threadFactory, String str) {
        return new NamedThreadFactory(threadFactory, str);
    }
}

package com.didiglobal.booster.instrument;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class ShadowScheduledThreadPoolExecutor extends ScheduledThreadPoolExecutor {
    public ShadowScheduledThreadPoolExecutor(int i7, String str) {
        this(i7, str, false);
    }

    public ShadowScheduledThreadPoolExecutor(int i7, String str, boolean z3) {
        super(i7, new NamedThreadFactory(str));
        if (z3) {
            if (getKeepAliveTime(TimeUnit.NANOSECONDS) <= 0) {
                setKeepAliveTime(10L, TimeUnit.MILLISECONDS);
            }
            allowCoreThreadTimeOut(true);
        }
    }

    public ShadowScheduledThreadPoolExecutor(int i7, ThreadFactory threadFactory, String str) {
        this(i7, threadFactory, str, false);
    }

    public ShadowScheduledThreadPoolExecutor(int i7, ThreadFactory threadFactory, String str, boolean z3) {
        super(i7, new NamedThreadFactory(threadFactory, str));
        if (z3) {
            if (getKeepAliveTime(TimeUnit.NANOSECONDS) <= 0) {
                setKeepAliveTime(10L, TimeUnit.MILLISECONDS);
            }
            allowCoreThreadTimeOut(true);
        }
    }

    public ShadowScheduledThreadPoolExecutor(int i7, RejectedExecutionHandler rejectedExecutionHandler, String str) {
        this(i7, rejectedExecutionHandler, str, false);
    }

    public ShadowScheduledThreadPoolExecutor(int i7, RejectedExecutionHandler rejectedExecutionHandler, String str, boolean z3) {
        super(i7, new NamedThreadFactory(str), rejectedExecutionHandler);
        if (z3) {
            if (getKeepAliveTime(TimeUnit.NANOSECONDS) <= 0) {
                setKeepAliveTime(10L, TimeUnit.MILLISECONDS);
            }
            allowCoreThreadTimeOut(true);
        }
    }

    public ShadowScheduledThreadPoolExecutor(int i7, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler, String str) {
        this(i7, threadFactory, rejectedExecutionHandler, str, false);
    }

    public ShadowScheduledThreadPoolExecutor(int i7, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler, String str, boolean z3) {
        super(i7, new NamedThreadFactory(threadFactory, str), rejectedExecutionHandler);
        if (z3) {
            if (getKeepAliveTime(TimeUnit.NANOSECONDS) <= 0) {
                setKeepAliveTime(10L, TimeUnit.MILLISECONDS);
            }
            allowCoreThreadTimeOut(true);
        }
    }
}

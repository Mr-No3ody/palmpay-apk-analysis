package com.google.firebase.concurrent;

import android.os.Process;
import android.os.StrictMode;
import com.didiglobal.booster.instrument.ShadowExecutors;
import com.didiglobal.booster.instrument.ShadowThread;
import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
class CustomThreadFactory implements ThreadFactory {
    private static final ThreadFactory DEFAULT = ShadowExecutors.defaultThreadFactory("\u200bcom.google.firebase.concurrent.CustomThreadFactory");
    private final String namePrefix;
    private final StrictMode.ThreadPolicy policy;
    private final int priority;
    private final AtomicLong threadCount = new AtomicLong();

    public CustomThreadFactory(String str, int i7, @Nullable StrictMode.ThreadPolicy threadPolicy) {
        this.namePrefix = str;
        this.priority = i7;
        this.policy = threadPolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$newThread$0(Runnable runnable) {
        Process.setThreadPriority(this.priority);
        StrictMode.ThreadPolicy threadPolicy = this.policy;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread threadNewThread = DEFAULT.newThread(new a(0, this, runnable));
        Locale locale = Locale.ROOT;
        threadNewThread.setName(ShadowThread.makeThreadName(this.namePrefix + " Thread #" + this.threadCount.getAndIncrement(), "\u200bcom.google.firebase.concurrent.CustomThreadFactory"));
        return threadNewThread;
    }
}

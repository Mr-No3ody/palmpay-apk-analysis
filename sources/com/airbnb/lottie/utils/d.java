package com.airbnb.lottie.utils;

import com.didiglobal.booster.instrument.ShadowThread;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class d implements ThreadFactory {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicInteger f20223d = new AtomicInteger(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadGroup f20224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f20225b = new AtomicInteger(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20226c;

    public d() {
        SecurityManager securityManager = System.getSecurityManager();
        this.f20224a = securityManager == null ? Thread.currentThread().getThreadGroup() : securityManager.getThreadGroup();
        this.f20226c = "lottie-" + f20223d.getAndIncrement() + "-thread-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        ShadowThread shadowThread = new ShadowThread(this.f20224a, runnable, this.f20226c + this.f20225b.getAndIncrement(), 0L, "\u200bcom.airbnb.lottie.utils.LottieThreadFactory");
        shadowThread.setDaemon(false);
        shadowThread.setPriority(10);
        return shadowThread;
    }
}

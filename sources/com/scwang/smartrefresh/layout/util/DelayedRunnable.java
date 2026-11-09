package com.scwang.smartrefresh.layout.util;

/* JADX INFO: loaded from: classes3.dex */
public class DelayedRunnable implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Runnable f25191a;
    public long delayMillis;

    public DelayedRunnable(Runnable runnable, long j6) {
        this.f25191a = runnable;
        this.delayMillis = j6;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Runnable runnable = this.f25191a;
            if (runnable != null) {
                runnable.run();
                this.f25191a = null;
            }
        } catch (Throwable th) {
            if (th instanceof NoClassDefFoundError) {
                return;
            }
            th.printStackTrace();
        }
    }
}

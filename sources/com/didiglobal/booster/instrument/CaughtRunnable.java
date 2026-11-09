package com.didiglobal.booster.instrument;

/* JADX INFO: loaded from: classes.dex */
public class CaughtRunnable implements Runnable {
    private final Runnable mRunnable;

    public CaughtRunnable(Runnable runnable) {
        this.mRunnable = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.mRunnable.run();
        } catch (RuntimeException unused) {
        }
    }
}

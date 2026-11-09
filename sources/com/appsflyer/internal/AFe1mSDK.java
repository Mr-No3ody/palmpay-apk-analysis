package com.appsflyer.internal;

import java.util.TimerTask;

/* JADX INFO: loaded from: classes.dex */
public final class AFe1mSDK extends TimerTask {
    private final Thread getRevenue;

    public AFe1mSDK(Thread thread) {
        this.getRevenue = thread;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.getRevenue.interrupt();
    }
}

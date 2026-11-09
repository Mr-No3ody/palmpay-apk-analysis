package com.adjust.sdk.scheduler;

import com.adjust.sdk.AdjustFactory;
import com.adjust.sdk.ILogger;
import com.adjust.sdk.Util;
import java.text.DecimalFormat;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p141j9.B;

/* JADX INFO: loaded from: classes.dex */
public class TimerCycle {
    private Runnable command;
    private long cycleDelay;
    private long initialDelay;
    private boolean isPaused = true;
    private ILogger logger = AdjustFactory.getLogger();
    private String name;
    private FutureScheduler scheduler;
    private ScheduledFuture waitingTask;

    public TimerCycle(Runnable runnable, long j6, long j10, String str) {
        this.scheduler = new SingleThreadFutureScheduler(str, true);
        this.name = str;
        this.command = runnable;
        this.initialDelay = j6;
        this.cycleDelay = j10;
        DecimalFormat decimalFormat = Util.SecondsDisplayFormat;
        this.logger.verbose("%s configured to fire after %s seconds of starting and cycles every %s seconds", str, decimalFormat.format(j6 / 1000.0d), decimalFormat.format(j10 / 1000.0d));
    }

    private void cancel(boolean z3) {
        ScheduledFuture scheduledFuture = this.waitingTask;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(z3);
        }
        this.waitingTask = null;
    }

    public void start() {
        boolean z3 = this.isPaused;
        ILogger iLogger = this.logger;
        String str = this.name;
        if (!z3) {
            iLogger.verbose("%s is already started", str);
            return;
        }
        iLogger.verbose("%s starting", str);
        this.waitingTask = this.scheduler.scheduleFutureWithFixedDelay(new B(this, 2), this.initialDelay, this.cycleDelay);
        this.isPaused = false;
    }

    public void suspend() {
        if (this.isPaused) {
            this.logger.verbose("%s is already suspended", this.name);
            return;
        }
        this.initialDelay = this.waitingTask.getDelay(TimeUnit.MILLISECONDS);
        this.waitingTask.cancel(false);
        this.logger.verbose("%s suspended with %s seconds left", this.name, Util.SecondsDisplayFormat.format(this.initialDelay / 1000.0d));
        this.isPaused = true;
    }

    public void teardown() {
        cancel(true);
        FutureScheduler futureScheduler = this.scheduler;
        if (futureScheduler != null) {
            futureScheduler.teardown();
        }
        this.scheduler = null;
    }
}

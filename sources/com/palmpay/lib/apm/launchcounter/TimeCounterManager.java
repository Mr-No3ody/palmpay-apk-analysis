package com.palmpay.lib.apm.launchcounter;

import com.palmpay.lib.apm.launchcounter.util.ActivityCounter;
import p095g6.a;

/* JADX INFO: loaded from: classes3.dex */
public class TimeCounterManager {
    private ActivityCounter mActivityCounter = new ActivityCounter();

    public static TimeCounterManager get() {
        return a.f36882a;
    }

    public void onActivityLaunch() {
        this.mActivityCounter.launch();
    }

    public void onActivityLaunched() {
        this.mActivityCounter.launchEnd();
    }

    public void onActivityPause() {
        this.mActivityCounter.pause();
    }

    public void onActivityPaused() {
        this.mActivityCounter.paused();
    }

    public void onEnterBackground() {
        this.mActivityCounter.enterBackground();
    }
}

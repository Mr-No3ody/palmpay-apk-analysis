package com.palmpay.lib.apm.launchcounter.util;

import android.app.Activity;
import android.app.Application;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.metrics.Trace;
import com.palmpay.lib.apm.LibApm;
import com.palmpay.lib.apm.launchcounter.CounterInfo;
import p024b9.g;

/* JADX INFO: loaded from: classes3.dex */
public class ActivityCounter {
    private static final String TAG = "ActivityCounter";
    private int alwaysFinishActivities;
    private boolean isMainBusiness = false;
    private String mCurrentActivity;
    private long mLaunchCostTime;
    private long mLaunchStartTime;
    private long mOtherCostTime;
    private String mPackageName;
    private long mPauseCostTime;
    private String mPreviousActivity;
    private long mRenderCostTime;
    private long mRenderStartTime;
    private long mStartTime;
    private long mTotalCostTime;

    public ActivityCounter() {
        this.alwaysFinishActivities = 0;
        Application applicationA = f.a();
        this.mPackageName = applicationA.getPackageName();
        this.alwaysFinishActivities = Settings.Global.getInt(applicationA.getContentResolver(), "always_finish_activities", 0);
    }

    private void clearTime() {
        this.mStartTime = 0L;
    }

    private boolean isReturnFromBackground() {
        String str;
        String str2 = this.mPreviousActivity;
        return (str2 == null || (str = this.mCurrentActivity) == null || !str2.equals(str)) ? false : true;
    }

    private void print() {
        String str;
        if (this.mPreviousActivity == null || (str = this.mCurrentActivity) == null || !str.startsWith(this.mPackageName) || !this.mPreviousActivity.startsWith(this.mPackageName)) {
            return;
        }
        CounterInfo counterInfo = new CounterInfo();
        counterInfo.time = SystemClock.elapsedRealtime();
        counterInfo.type = 1;
        counterInfo.previousActivity = this.mPreviousActivity;
        counterInfo.currentActivity = this.mCurrentActivity;
        counterInfo.title = this.mPreviousActivity + " -> " + this.mCurrentActivity;
        counterInfo.launchCost = Math.max(0L, this.mLaunchCostTime);
        counterInfo.pauseCost = Math.max(0L, this.mPauseCostTime);
        counterInfo.renderCost = Math.max(0L, this.mRenderCostTime);
        counterInfo.totalCost = Math.max(0L, this.mTotalCostTime);
        counterInfo.otherCost = Math.max(0L, this.mOtherCostTime);
        counterInfo.toString();
        if (isReturnFromBackground()) {
            return;
        }
        trace(counterInfo);
        clearTime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void renderEnd() {
        this.mRenderCostTime = SystemClock.elapsedRealtime() - this.mRenderStartTime;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.mStartTime;
        this.mTotalCostTime = jElapsedRealtime;
        this.mOtherCostTime = ((jElapsedRealtime - this.mRenderCostTime) - this.mPauseCostTime) - this.mLaunchCostTime;
        print();
    }

    private void trace(CounterInfo counterInfo) {
        LibApm libApm = LibApm.INSTANCE;
        if (!libApm.isFirebaseInitialized() || TextUtils.isEmpty(libApm.getActivityTraceName()) || counterInfo.totalCost >= DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM) {
            return;
        }
        Trace traceNewTrace = FirebasePerformance.getInstance().newTrace(libApm.getActivityTraceName());
        traceNewTrace.start();
        traceNewTrace.putAttribute("Activity", counterInfo.currentActivity);
        traceNewTrace.putAttribute("MainBusiness", this.isMainBusiness ? "true" : "false");
        traceNewTrace.putAttribute("alwaysFinishActivities", String.valueOf(this.alwaysFinishActivities));
        traceNewTrace.putMetric("TotalCost", counterInfo.totalCost);
        traceNewTrace.putAttribute("PreActivity", TextUtils.isEmpty(counterInfo.previousActivity) ? counterInfo.previousActivity : "Empty");
        traceNewTrace.putMetric("ActualCost", counterInfo.pauseCost + counterInfo.launchCost + counterInfo.renderCost);
        traceNewTrace.putMetric("PauseCost", counterInfo.pauseCost);
        traceNewTrace.putMetric("LaunchCost", counterInfo.launchCost);
        traceNewTrace.putMetric("RenderCost", counterInfo.renderCost);
        traceNewTrace.putMetric("OtherCost", counterInfo.otherCost);
        traceNewTrace.stop();
    }

    public void enterBackground() {
        this.mStartTime = 0L;
    }

    public void launch() {
        if (this.mStartTime == 0) {
            this.mStartTime = SystemClock.elapsedRealtime();
            this.mPauseCostTime = 0L;
            this.mRenderCostTime = 0L;
            this.mOtherCostTime = 0L;
            this.mLaunchCostTime = 0L;
            this.mLaunchStartTime = 0L;
            this.mTotalCostTime = 0L;
        }
        this.mLaunchStartTime = SystemClock.elapsedRealtime();
        this.mLaunchCostTime = 0L;
    }

    public void launchEnd() {
        this.mLaunchCostTime = SystemClock.elapsedRealtime() - this.mLaunchStartTime;
        render();
    }

    public void pause() {
        this.mStartTime = SystemClock.elapsedRealtime();
        this.mPauseCostTime = 0L;
        this.mRenderCostTime = 0L;
        this.mOtherCostTime = 0L;
        this.mLaunchCostTime = 0L;
        this.mLaunchStartTime = 0L;
        this.mTotalCostTime = 0L;
        this.mPreviousActivity = null;
        Activity activityA = a.a();
        if (activityA != null) {
            this.mPreviousActivity = activityA.getClass().getCanonicalName();
        }
    }

    public void paused() {
        this.mPauseCostTime = SystemClock.elapsedRealtime() - this.mStartTime;
    }

    public void render() {
        this.mRenderStartTime = SystemClock.elapsedRealtime();
        Activity activityA = a.a();
        if (activityA == null || activityA.getWindow() == null) {
            renderEnd();
        } else {
            this.mCurrentActivity = activityA.getClass().getCanonicalName();
            activityA.getWindow().getDecorView().post(new g(this, 24));
        }
    }
}

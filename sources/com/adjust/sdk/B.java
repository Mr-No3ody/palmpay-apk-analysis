package com.adjust.sdk;

/* JADX INFO: loaded from: classes.dex */
public final class B implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SessionResponseData f19303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler f19304c;

    public /* synthetic */ B(ActivityHandler activityHandler, SessionResponseData sessionResponseData, int i7) {
        this.f19302a = i7;
        this.f19304c = activityHandler;
        this.f19303b = sessionResponseData;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OnSessionTrackingSucceededListener onSessionTrackingSucceededListener;
        OnSessionTrackingFailedListener onSessionTrackingFailedListener;
        switch (this.f19302a) {
            case 0:
                AdjustConfig adjustConfig = this.f19304c.adjustConfig;
                if (adjustConfig != null && (onSessionTrackingSucceededListener = adjustConfig.onSessionTrackingSucceededListener) != null) {
                    onSessionTrackingSucceededListener.onSessionTrackingSucceeded(this.f19303b.getSuccessResponseData());
                }
                break;
            case 1:
                AdjustConfig adjustConfig2 = this.f19304c.adjustConfig;
                if (adjustConfig2 != null && (onSessionTrackingFailedListener = adjustConfig2.onSessionTrackingFailedListener) != null) {
                    onSessionTrackingFailedListener.onSessionTrackingFailed(this.f19303b.getFailureResponseData());
                }
                break;
            default:
                this.f19304c.launchSessionResponseTasksI(this.f19303b);
                break;
        }
    }
}

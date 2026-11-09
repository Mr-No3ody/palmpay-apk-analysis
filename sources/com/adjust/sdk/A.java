package com.adjust.sdk;

/* JADX INFO: loaded from: classes.dex */
public final class A implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EventResponseData f19300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler f19301c;

    public /* synthetic */ A(ActivityHandler activityHandler, EventResponseData eventResponseData, int i7) {
        this.f19299a = i7;
        this.f19301c = activityHandler;
        this.f19300b = eventResponseData;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OnEventTrackingSucceededListener onEventTrackingSucceededListener;
        OnEventTrackingFailedListener onEventTrackingFailedListener;
        switch (this.f19299a) {
            case 0:
                AdjustConfig adjustConfig = this.f19301c.adjustConfig;
                if (adjustConfig != null && (onEventTrackingSucceededListener = adjustConfig.onEventTrackingSucceededListener) != null) {
                    onEventTrackingSucceededListener.onEventTrackingSucceeded(this.f19300b.getSuccessResponseData());
                }
                break;
            case 1:
                AdjustConfig adjustConfig2 = this.f19301c.adjustConfig;
                if (adjustConfig2 != null && (onEventTrackingFailedListener = adjustConfig2.onEventTrackingFailedListener) != null) {
                    onEventTrackingFailedListener.onEventTrackingFailed(this.f19300b.getFailureResponseData());
                }
                break;
            default:
                this.f19301c.launchEventResponseTasksI(this.f19300b);
                break;
        }
    }
}

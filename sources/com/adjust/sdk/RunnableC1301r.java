package com.adjust.sdk;

/* JADX INFO: renamed from: com.adjust.sdk.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1301r implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OnAdidReadListener f19410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler f19411c;

    public /* synthetic */ RunnableC1301r(ActivityHandler activityHandler, OnAdidReadListener onAdidReadListener, int i7) {
        this.f19409a = i7;
        this.f19411c = activityHandler;
        this.f19410b = onAdidReadListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19409a) {
            case 0:
                this.f19410b.onAdidRead(this.f19411c.activityState.adid);
                break;
            default:
                this.f19410b.onAdidRead(this.f19411c.activityState.adid);
                break;
        }
    }
}

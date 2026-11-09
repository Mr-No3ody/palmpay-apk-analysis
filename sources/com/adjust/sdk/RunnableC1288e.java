package com.adjust.sdk;

/* JADX INFO: renamed from: com.adjust.sdk.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1288e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler f19365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdjustEvent f19366c;

    public /* synthetic */ RunnableC1288e(ActivityHandler activityHandler, AdjustEvent adjustEvent, int i7) {
        this.f19364a = i7;
        this.f19365b = activityHandler;
        this.f19366c = adjustEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19364a) {
            case 0:
                this.f19365b.lambda$trackEvent$3(this.f19366c);
                break;
            default:
                this.f19365b.lambda$trackEvent$4(this.f19366c);
                break;
        }
    }
}

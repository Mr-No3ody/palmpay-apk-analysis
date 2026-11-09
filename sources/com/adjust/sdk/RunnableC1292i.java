package com.adjust.sdk;

/* JADX INFO: renamed from: com.adjust.sdk.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1292i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler f19376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ OnIsEnabledListener f19377c;

    public /* synthetic */ RunnableC1292i(ActivityHandler activityHandler, OnIsEnabledListener onIsEnabledListener, int i7) {
        this.f19375a = i7;
        this.f19376b = activityHandler;
        this.f19377c = onIsEnabledListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19375a) {
            case 0:
                this.f19376b.lambda$isEnabled$9(this.f19377c);
                break;
            case 1:
                this.f19376b.lambda$isEnabled$11(this.f19377c);
                break;
            default:
                this.f19376b.lambda$isEnabled$10(this.f19377c);
                break;
        }
    }
}

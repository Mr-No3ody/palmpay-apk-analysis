package com.adjust.sdk;

/* JADX INFO: renamed from: com.adjust.sdk.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1304t implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OnAttributionReadListener f19532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler f19533c;

    public /* synthetic */ RunnableC1304t(ActivityHandler activityHandler, OnAttributionReadListener onAttributionReadListener, int i7) {
        this.f19531a = i7;
        this.f19533c = activityHandler;
        this.f19532b = onAttributionReadListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19531a) {
            case 0:
                this.f19532b.onAttributionRead(this.f19533c.attribution);
                break;
            default:
                this.f19532b.onAttributionRead(this.f19533c.attribution);
                break;
        }
    }
}

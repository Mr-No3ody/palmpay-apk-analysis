package com.adjust.sdk;

/* JADX INFO: loaded from: classes.dex */
public final class L implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AttributionHandler f19327b;

    public /* synthetic */ L(AttributionHandler attributionHandler, int i7) {
        this.f19326a = i7;
        this.f19327b = attributionHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19326a) {
            case 0:
                this.f19327b.sendAttributionRequest();
                break;
            case 1:
                AttributionHandler attributionHandler = this.f19327b;
                attributionHandler.lastInitiatedBy = "sdk";
                attributionHandler.getAttributionI(0L);
                break;
            default:
                this.f19327b.sendAttributionRequestI();
                break;
        }
    }
}

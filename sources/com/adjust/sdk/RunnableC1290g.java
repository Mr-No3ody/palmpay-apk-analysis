package com.adjust.sdk;

/* JADX INFO: renamed from: com.adjust.sdk.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1290g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler f19370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f19371c;

    public /* synthetic */ RunnableC1290g(ActivityHandler activityHandler, String str, int i7) {
        this.f19369a = i7;
        this.f19370b = activityHandler;
        this.f19371c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19369a) {
            case 0:
                this.f19370b.lambda$setExternalDeviceIdInDelay$51(this.f19371c);
                break;
            case 1:
                this.f19370b.lambda$removeGlobalPartnerParameter$27(this.f19371c);
                break;
            default:
                this.f19370b.lambda$removeGlobalCallbackParameter$25(this.f19371c);
                break;
        }
    }
}

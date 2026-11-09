package com.adjust.sdk;

/* JADX INFO: renamed from: com.adjust.sdk.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1284a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler f19356b;

    public /* synthetic */ RunnableC1284a(ActivityHandler activityHandler, int i7) {
        this.f19355a = i7;
        this.f19356b = activityHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19355a) {
            case 0:
                this.f19356b.lambda$sendPreinstallReferrer$19();
                break;
            case 1:
                this.f19356b.lambda$removeGlobalPartnerParameters$31();
                break;
            case 2:
                this.f19356b.lambda$endFirstSessionDelay$48();
                break;
            case 3:
                this.f19356b.lambda$sendPreinstallReferrer$18();
                break;
            case 4:
                this.f19356b.lambda$sendReftagReferrer$17();
                break;
            case 5:
                this.f19356b.lambda$removeGlobalCallbackParameters$29();
                break;
            case 6:
                this.f19356b.lambda$gdprForgetMe$34();
                break;
            case 7:
                this.f19356b.lambda$gdprForgetMe$35();
                break;
            default:
                this.f19356b.lambda$sendReftagReferrer$16();
                break;
        }
    }
}

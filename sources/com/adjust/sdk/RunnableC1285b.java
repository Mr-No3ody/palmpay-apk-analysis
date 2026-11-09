package com.adjust.sdk;

/* JADX INFO: renamed from: com.adjust.sdk.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1285b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler f19358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f19359c;

    public /* synthetic */ RunnableC1285b(ActivityHandler activityHandler, boolean z3, int i7) {
        this.f19357a = i7;
        this.f19358b = activityHandler;
        this.f19359c = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19357a) {
            case 0:
                this.f19358b.lambda$onActivityLifecycle$0(this.f19359c);
                break;
            case 1:
                this.f19358b.lambda$trackMeasurementConsent$39(this.f19359c);
                break;
            case 2:
                this.f19358b.lambda$setCoppaComplianceInDelay$49(this.f19359c);
                break;
            case 3:
                this.f19358b.lambda$setOfflineMode$7(this.f19359c);
                break;
            case 4:
                this.f19358b.lambda$setOfflineMode$8(this.f19359c);
                break;
            case 5:
                this.f19358b.lambda$setEnabled$6(this.f19359c);
                break;
            case 6:
                this.f19358b.lambda$setPlayStoreKidsComplianceInDelay$50(this.f19359c);
                break;
            case 7:
                this.f19358b.lambda$setEnabled$5(this.f19359c);
                break;
            default:
                this.f19358b.lambda$onActivityLifecycle$1(this.f19359c);
                break;
        }
    }
}

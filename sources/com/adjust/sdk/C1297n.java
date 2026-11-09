package com.adjust.sdk;

/* JADX INFO: renamed from: com.adjust.sdk.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1297n implements IRunActivityHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f19392b;

    public /* synthetic */ C1297n(boolean z3, int i7) {
        this.f19391a = i7;
        this.f19392b = z3;
    }

    @Override // com.adjust.sdk.IRunActivityHandler
    public final void run(ActivityHandler activityHandler) {
        switch (this.f19391a) {
            case 0:
                activityHandler.tryTrackMeasurementConsentI(this.f19392b);
                break;
            default:
                activityHandler.tryTrackMeasurementConsentI(this.f19392b);
                break;
        }
    }
}

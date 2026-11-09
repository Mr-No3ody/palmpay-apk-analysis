package com.adjust.sdk;

/* JADX INFO: renamed from: com.adjust.sdk.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1295l implements IRunActivityHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdjustThirdPartySharing f19386b;

    public /* synthetic */ C1295l(AdjustThirdPartySharing adjustThirdPartySharing, int i7) {
        this.f19385a = i7;
        this.f19386b = adjustThirdPartySharing;
    }

    @Override // com.adjust.sdk.IRunActivityHandler
    public final void run(ActivityHandler activityHandler) {
        switch (this.f19385a) {
            case 0:
                activityHandler.tryTrackThirdPartySharingI(this.f19386b);
                break;
            default:
                activityHandler.tryTrackThirdPartySharingI(this.f19386b);
                break;
        }
    }
}

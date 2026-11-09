package com.adjust.sdk;

/* JADX INFO: renamed from: com.adjust.sdk.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1289f implements IRunActivityHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f19368b;

    public /* synthetic */ C1289f(String str, int i7) {
        this.f19367a = i7;
        this.f19368b = str;
    }

    @Override // com.adjust.sdk.IRunActivityHandler
    public final void run(ActivityHandler activityHandler) {
        switch (this.f19367a) {
            case 0:
                activityHandler.removeGlobalPartnerParameterI(this.f19368b);
                break;
            default:
                activityHandler.removeGlobalCallbackParameterI(this.f19368b);
                break;
        }
    }
}

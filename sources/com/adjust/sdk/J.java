package com.adjust.sdk;

/* JADX INFO: loaded from: classes.dex */
public final class J implements IRunActivityHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19323a;

    public /* synthetic */ J(int i7) {
        this.f19323a = i7;
    }

    @Override // com.adjust.sdk.IRunActivityHandler
    public final void run(ActivityHandler activityHandler) {
        switch (this.f19323a) {
            case 0:
                activityHandler.removeGlobalCallbackParametersI();
                break;
            default:
                activityHandler.removeGlobalPartnerParametersI();
                break;
        }
    }
}

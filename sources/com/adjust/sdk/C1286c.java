package com.adjust.sdk;

/* JADX INFO: renamed from: com.adjust.sdk.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1286c implements IRunActivityHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19360a;

    public /* synthetic */ C1286c(int i7) {
        this.f19360a = i7;
    }

    @Override // com.adjust.sdk.IRunActivityHandler
    public final void run(ActivityHandler activityHandler) {
        switch (this.f19360a) {
            case 0:
                activityHandler.removeGlobalCallbackParametersI();
                break;
            default:
                activityHandler.removeGlobalPartnerParametersI();
                break;
        }
    }
}

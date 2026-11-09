package com.adjust.sdk;

/* JADX INFO: loaded from: classes.dex */
public final class I implements IRunActivityHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19322b;

    public /* synthetic */ I(Object obj, int i7) {
        this.f19321a = i7;
        this.f19322b = obj;
    }

    @Override // com.adjust.sdk.IRunActivityHandler
    public final void run(ActivityHandler activityHandler) {
        switch (this.f19321a) {
            case 0:
                activityHandler.removeGlobalCallbackParameterI((String) this.f19322b);
                break;
            case 1:
                activityHandler.removeGlobalPartnerParameterI((String) this.f19322b);
                break;
            default:
                activityHandler.lambda$setEnabled$5(((ActivityHandler) this.f19322b).adjustConfig.startEnabled.booleanValue());
                break;
        }
    }
}

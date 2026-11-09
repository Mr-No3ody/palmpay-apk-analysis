package com.adjust.sdk;

/* JADX INFO: loaded from: classes.dex */
public final class H implements IRunActivityHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f19319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f19320c;

    public /* synthetic */ H(String str, String str2, int i7) {
        this.f19318a = i7;
        this.f19319b = str;
        this.f19320c = str2;
    }

    @Override // com.adjust.sdk.IRunActivityHandler
    public final void run(ActivityHandler activityHandler) {
        switch (this.f19318a) {
            case 0:
                activityHandler.addGlobalCallbackParameterI(this.f19319b, this.f19320c);
                break;
            default:
                activityHandler.addGlobalPartnerParameterI(this.f19319b, this.f19320c);
                break;
        }
    }
}

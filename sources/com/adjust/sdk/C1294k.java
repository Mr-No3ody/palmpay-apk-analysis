package com.adjust.sdk;

/* JADX INFO: renamed from: com.adjust.sdk.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1294k implements IRunActivityHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f19383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f19384c;

    public /* synthetic */ C1294k(String str, String str2, int i7) {
        this.f19382a = i7;
        this.f19383b = str;
        this.f19384c = str2;
    }

    @Override // com.adjust.sdk.IRunActivityHandler
    public final void run(ActivityHandler activityHandler) {
        switch (this.f19382a) {
            case 0:
                activityHandler.addGlobalPartnerParameterI(this.f19383b, this.f19384c);
                break;
            default:
                activityHandler.addGlobalCallbackParameterI(this.f19383b, this.f19384c);
                break;
        }
    }
}

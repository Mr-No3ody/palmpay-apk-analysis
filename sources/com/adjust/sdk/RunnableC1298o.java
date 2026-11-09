package com.adjust.sdk;

/* JADX INFO: renamed from: com.adjust.sdk.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1298o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler f19398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f19399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f19400d;

    public /* synthetic */ RunnableC1298o(ActivityHandler activityHandler, String str, String str2, int i7) {
        this.f19397a = i7;
        this.f19398b = activityHandler;
        this.f19399c = str;
        this.f19400d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19397a) {
            case 0:
                this.f19398b.lambda$addGlobalPartnerParameter$23(this.f19399c, this.f19400d);
                break;
            default:
                this.f19398b.lambda$addGlobalCallbackParameter$21(this.f19399c, this.f19400d);
                break;
        }
    }
}

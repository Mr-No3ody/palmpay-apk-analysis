package com.adjust.sdk;

/* JADX INFO: renamed from: com.adjust.sdk.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1299p implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler f19402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f19403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f19404d;

    public /* synthetic */ RunnableC1299p(ActivityHandler activityHandler, boolean z3, String str, int i7) {
        this.f19401a = i7;
        this.f19402b = activityHandler;
        this.f19403c = z3;
        this.f19404d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19401a) {
            case 0:
                this.f19402b.lambda$setPushToken$33(this.f19403c, this.f19404d);
                break;
            default:
                this.f19402b.lambda$setPushToken$32(this.f19403c, this.f19404d);
                break;
        }
    }
}

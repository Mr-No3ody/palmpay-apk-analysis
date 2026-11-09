package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AFj1nSDK f20426b;

    public /* synthetic */ l(AFj1nSDK aFj1nSDK, int i7) {
        this.f20425a = i7;
        this.f20426b = aFj1nSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20425a) {
            case 0:
                this.f20426b.component3();
                break;
            case 1:
                this.f20426b.component2();
                break;
            default:
                this.f20426b.component4();
                break;
        }
    }
}

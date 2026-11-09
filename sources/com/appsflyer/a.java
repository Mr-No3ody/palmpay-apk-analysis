package com.appsflyer;

import com.appsflyer.internal.AFg1gSDK;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AFg1gSDK[] f20377b;

    public /* synthetic */ a(AFg1gSDK[] aFg1gSDKArr, int i7) {
        this.f20376a = i7;
        this.f20377b = aFg1gSDKArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20376a) {
            case 0:
                AFLogger.getMonetizationNetwork(this.f20377b);
                break;
            default:
                AFLogger.getMediationNetwork(this.f20377b);
                break;
        }
    }
}

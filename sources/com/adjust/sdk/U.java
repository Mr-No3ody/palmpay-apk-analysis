package com.adjust.sdk;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class U implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityPackage f19348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SdkClickHandler f19349c;

    public /* synthetic */ U(SdkClickHandler sdkClickHandler, ActivityPackage activityPackage, int i7) {
        this.f19347a = i7;
        this.f19349c = sdkClickHandler;
        this.f19348b = activityPackage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19347a) {
            case 0:
                SdkClickHandler sdkClickHandler = this.f19349c;
                List list = sdkClickHandler.packageQueue;
                ActivityPackage activityPackage = this.f19348b;
                list.add(activityPackage);
                sdkClickHandler.logger.debug("Added sdk_click %d", Integer.valueOf(sdkClickHandler.packageQueue.size()));
                sdkClickHandler.logger.verbose("%s", activityPackage.getExtendedString());
                sdkClickHandler.sendNextSdkClick();
                break;
            default:
                ActivityPackage activityPackage2 = this.f19348b;
                SdkClickHandler sdkClickHandler2 = this.f19349c;
                sdkClickHandler2.sendSdkClickI(activityPackage2);
                sdkClickHandler2.sendNextSdkClick();
                break;
        }
    }
}

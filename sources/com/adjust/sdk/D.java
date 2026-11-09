package com.adjust.sdk;

import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class D implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f19311d;

    public /* synthetic */ D(Object obj, int i7, Object obj2, Object obj3) {
        this.f19308a = i7;
        this.f19309b = obj;
        this.f19310c = obj2;
        this.f19311d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19308a) {
            case 0:
                ActivityHandler activityHandler = (ActivityHandler) this.f19309b;
                AdjustConfig adjustConfig = activityHandler.adjustConfig;
                if (adjustConfig != null) {
                    OnDeferredDeeplinkResponseListener onDeferredDeeplinkResponseListener = adjustConfig.onDeferredDeeplinkResponseListener;
                    Uri uri = (Uri) this.f19310c;
                    if (onDeferredDeeplinkResponseListener != null ? onDeferredDeeplinkResponseListener.launchReceivedDeeplink(uri) : true) {
                        activityHandler.launchDeeplinkMain((Intent) this.f19311d, uri);
                    }
                    break;
                }
                break;
            case 1:
                ((ActivityHandler) this.f19309b).sendInstallReferrerI((ReferrerDetails) this.f19310c, (String) this.f19311d);
                break;
            default:
                SdkClickHandler sdkClickHandler = (SdkClickHandler) this.f19309b;
                IActivityHandler iActivityHandler = (IActivityHandler) sdkClickHandler.activityHandlerWeakRef.get();
                if (iActivityHandler != null) {
                    sdkClickHandler.sendSdkClick(PackageFactory.buildPreinstallSdkClickPackage((String) this.f19310c, (String) this.f19311d, iActivityHandler.getActivityState(), iActivityHandler.getAdjustConfig(), iActivityHandler.getDeviceInfo(), iActivityHandler.getGlobalParameters(), iActivityHandler.getFirstSessionDelayManager()));
                    break;
                }
                break;
        }
    }
}

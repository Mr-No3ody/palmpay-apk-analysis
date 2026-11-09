package com.adjust.sdk;

/* JADX INFO: renamed from: com.adjust.sdk.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1305u implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19535b;

    public /* synthetic */ RunnableC1305u(Object obj, int i7) {
        this.f19534a = i7;
        this.f19535b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19534a) {
            case 0:
                RunnableC1306v runnableC1306v = (RunnableC1306v) this.f19535b;
                OnAdidReadListener onAdidReadListener = runnableC1306v.f19537b.getOnAdidReadListener();
                if (onAdidReadListener != null) {
                    onAdidReadListener.onAdidRead(null);
                }
                runnableC1306v.f19537b.setOnAdidReadListener(null);
                break;
            case 1:
                RunnableC1306v runnableC1306v2 = (RunnableC1306v) this.f19535b;
                OnAttributionReadListener onAttributionReadListener = runnableC1306v2.f19537b.getOnAttributionReadListener();
                if (onAttributionReadListener != null) {
                    onAttributionReadListener.onAttributionRead(null);
                }
                runnableC1306v2.f19537b.setOnAttributionReadListener(null);
                break;
            case 2:
                RunnableC1306v runnableC1306v3 = (RunnableC1306v) this.f19535b;
                OnThirdPartySharingSettingsReadListener onThirdPartySharingSettingsReadListener = runnableC1306v3.f19537b.getOnThirdPartySharingSettingsReadListener();
                if (onThirdPartySharingSettingsReadListener != null) {
                    onThirdPartySharingSettingsReadListener.onThirdPartySharingSettingsRead(null);
                }
                runnableC1306v3.f19537b.setOnThirdPartySharingSettingsReadListener(null);
                break;
            case 3:
                ((InstallReferrer) this.f19535b).startConnection();
                break;
            default:
                ((SdkClickHandler) this.f19535b).sendNextSdkClickI();
                break;
        }
    }
}

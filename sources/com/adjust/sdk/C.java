package com.adjust.sdk;

/* JADX INFO: loaded from: classes.dex */
public final class C implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19307c;

    public /* synthetic */ C(int i7, Object obj, Object obj2) {
        this.f19305a = i7;
        this.f19306b = obj;
        this.f19307c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19305a) {
            case 0:
                OnRemoteTriggerListener onRemoteTriggerListener = ((ActivityHandler) this.f19306b).adjustConfig.onRemoteTriggerListener;
                if (onRemoteTriggerListener != null) {
                    onRemoteTriggerListener.onRemoteTrigger((AdjustRemoteTrigger) this.f19307c);
                }
                break;
            case 1:
                ((ActivityHandler) this.f19306b).launchSdkClickResponseTasksI((SdkClickResponseData) this.f19307c);
                break;
            case 2:
                ((ActivityHandler) this.f19306b).launchAttributionResponseTasksI((AttributionResponseData) this.f19307c);
                break;
            case 3:
                ((ActivityHandler) this.f19306b).launchPurchaseVerificationResponseTasksI((PurchaseVerificationResponseData) this.f19307c);
                break;
            case 4:
                ((ActivityHandler) this.f19306b).launchThirdPartySharingResponseTasksI((ThirdPartySharingResponseData) this.f19307c);
                break;
            case 5:
                ((ActivityHandler) this.f19306b).processRemoteTriggersI((ResponseData) this.f19307c);
                break;
            case 6:
                ((OnThirdPartySharingSettingsReadListener) this.f19307c).onThirdPartySharingSettingsRead(((ActivityHandler) this.f19306b).thirdPartySharingResult);
                break;
            case 7:
                ((OnDeeplinkResolvedListener) this.f19307c).onDeeplinkResolved(((SdkClickResponseData) this.f19306b).resolvedDeeplink);
                break;
            case 8:
                ((PurchaseVerificationResponseData) this.f19307c).activityPackage.getPurchaseVerificationCallback().onVerificationFinished((AdjustPurchaseVerificationResult) this.f19306b);
                break;
            case 9:
                ((OnDeeplinkResolvedListener) this.f19307c).onDeeplinkResolved((String) this.f19306b);
                break;
            case 10:
                ((ActivityHandler) this.f19306b).sendLicenseVerificationDataI((LicenseData) this.f19307c);
                break;
            case 11:
                ((OnThirdPartySharingSettingsReadListener) ((M6.a) this.f19306b).f5774d).onThirdPartySharingSettingsRead((AdjustThirdPartySharingResult) this.f19307c);
                break;
            case 12:
                ((OnAdidReadListener) ((M6.a) this.f19306b).f5774d).onAdidRead((String) this.f19307c);
                break;
            case 13:
                ((OnAttributionReadListener) ((M6.a) this.f19306b).f5774d).onAttributionRead((AdjustAttribution) this.f19307c);
                break;
            case 14:
                AttributionHandler attributionHandler = (AttributionHandler) this.f19306b;
                IActivityHandler iActivityHandler = (IActivityHandler) attributionHandler.activityHandlerWeakRef.get();
                if (iActivityHandler != null) {
                    attributionHandler.checkSessionResponseI(iActivityHandler, (SessionResponseData) this.f19307c);
                    break;
                }
                break;
            case 15:
                AttributionHandler attributionHandler2 = (AttributionHandler) this.f19306b;
                IActivityHandler iActivityHandler2 = (IActivityHandler) attributionHandler2.activityHandlerWeakRef.get();
                if (iActivityHandler2 != null) {
                    attributionHandler2.checkSdkClickResponseI(iActivityHandler2, (SdkClickResponseData) this.f19307c);
                    break;
                }
                break;
            case 16:
                AttributionHandler attributionHandler3 = (AttributionHandler) this.f19306b;
                IActivityHandler iActivityHandler3 = (IActivityHandler) attributionHandler3.activityHandlerWeakRef.get();
                if (iActivityHandler3 != null) {
                    attributionHandler3.checkAttributionResponseI(iActivityHandler3, (AttributionResponseData) this.f19307c);
                    break;
                }
                break;
            case 17:
                AttributionHandler attributionHandler4 = (AttributionHandler) this.f19306b;
                IActivityHandler iActivityHandler4 = (IActivityHandler) attributionHandler4.activityHandlerWeakRef.get();
                if (iActivityHandler4 != null) {
                    ResponseData responseData = (ResponseData) this.f19307c;
                    if (responseData.trackingState == TrackingState.OPTED_OUT) {
                        iActivityHandler4.gotOptOutResponse();
                        break;
                    } else if (responseData instanceof AttributionResponseData) {
                        attributionHandler4.checkAttributionResponseI(iActivityHandler4, (AttributionResponseData) responseData);
                        break;
                    }
                }
                break;
            case 18:
                ((PackageHandler) this.f19306b).addI((ActivityPackage) this.f19307c);
                break;
            case 19:
                ((PackageHandler) this.f19306b).sendNextI(((ResponseData) this.f19307c).continueIn);
                break;
            default:
                ((PurchaseVerificationHandler) this.f19306b).sendPurchaseVerificationPackageI((ActivityPackage) this.f19307c);
                break;
        }
    }

    public /* synthetic */ C(Object obj, int i7, Object obj2, boolean z3) {
        this.f19305a = i7;
        this.f19307c = obj;
        this.f19306b = obj2;
    }
}

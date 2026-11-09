package com.adjust.sdk;

/* JADX INFO: loaded from: classes.dex */
public final class z implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler f19549b;

    public /* synthetic */ z(ActivityHandler activityHandler, int i7) {
        this.f19548a = i7;
        this.f19549b = activityHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LicenseData licenseRequiredData;
        OnAttributionChangedListener onAttributionChangedListener;
        OnThirdPartySharingSettingsChangedListener onThirdPartySharingSettingsChangedListener;
        switch (this.f19548a) {
            case 0:
                ActivityHandler activityHandler = this.f19549b;
                ReferrerDetails metaReferrer = Reflection.getMetaReferrer(activityHandler.getContext(), activityHandler.adjustConfig.fbAppId, activityHandler.logger);
                if (metaReferrer != null) {
                    activityHandler.sendInstallReferrer(metaReferrer, Constants.REFERRER_API_META);
                }
                break;
            case 1:
                ActivityHandler activityHandler2 = this.f19549b;
                if (!SharedPreferencesManager.getDefaultInstance(activityHandler2.getContext()).getLicenseVerificationTracked() && (licenseRequiredData = Reflection.getLicenseRequiredData(activityHandler2.getContext(), activityHandler2.logger, activityHandler2.deviceInfo.appInstallTime)) != null) {
                    activityHandler2.sendLicenseVerificationData(licenseRequiredData);
                }
                break;
            case 2:
                ActivityHandler activityHandler3 = this.f19549b;
                AdjustConfig adjustConfig = activityHandler3.adjustConfig;
                if (adjustConfig != null && (onAttributionChangedListener = adjustConfig.onAttributionChangedListener) != null) {
                    onAttributionChangedListener.onAttributionChanged(activityHandler3.attribution);
                }
                break;
            case 3:
                ActivityHandler activityHandler4 = this.f19549b;
                AdjustConfig adjustConfig2 = activityHandler4.adjustConfig;
                if (adjustConfig2 != null && (onThirdPartySharingSettingsChangedListener = adjustConfig2.onThirdPartySharingSettingsChangedListener) != null) {
                    onThirdPartySharingSettingsChangedListener.onThirdPartySharingSettingsChanged(activityHandler4.thirdPartySharingResult);
                }
                break;
            case 4:
                this.f19549b.gotOptOutResponseI();
                break;
            case 5:
                this.f19549b.foregroundTimerFiredI();
                break;
            case 6:
                this.f19549b.backgroundTimerFiredI();
                break;
            case 7:
                this.f19549b.foregroundTimerFired();
                break;
            case 8:
                this.f19549b.backgroundTimerFired();
                break;
            case 9:
                ActivityHandler activityHandler5 = this.f19549b;
                ReferrerDetails huaweiAdsReferrer = Reflection.getHuaweiAdsReferrer(activityHandler5.getContext(), activityHandler5.logger);
                if (huaweiAdsReferrer != null) {
                    activityHandler5.sendInstallReferrer(huaweiAdsReferrer, Constants.REFERRER_API_HUAWEI_ADS);
                }
                break;
            case 10:
                ActivityHandler activityHandler6 = this.f19549b;
                ReferrerDetails huaweiAppGalleryReferrer = Reflection.getHuaweiAppGalleryReferrer(activityHandler6.getContext(), activityHandler6.logger);
                if (huaweiAppGalleryReferrer != null) {
                    activityHandler6.sendInstallReferrer(huaweiAppGalleryReferrer, Constants.REFERRER_API_HUAWEI_APP_GALLERY);
                }
                break;
            case 11:
                ActivityHandler activityHandler7 = this.f19549b;
                ReferrerDetails samsungReferrer = Reflection.getSamsungReferrer(activityHandler7.getContext(), activityHandler7.logger);
                if (samsungReferrer != null) {
                    activityHandler7.sendInstallReferrer(samsungReferrer, Constants.REFERRER_API_SAMSUNG);
                }
                break;
            case 12:
                ActivityHandler activityHandler8 = this.f19549b;
                ReferrerDetails xiaomiReferrer = Reflection.getXiaomiReferrer(activityHandler8.getContext(), activityHandler8.logger);
                if (xiaomiReferrer != null) {
                    activityHandler8.sendInstallReferrer(xiaomiReferrer, Constants.REFERRER_API_XIAOMI);
                }
                break;
            default:
                ActivityHandler activityHandler9 = this.f19549b;
                ReferrerDetails vivoReferrer = Reflection.getVivoReferrer(activityHandler9.getContext(), activityHandler9.logger);
                if (vivoReferrer != null) {
                    activityHandler9.sendInstallReferrer(vivoReferrer, Constants.REFERRER_API_VIVO);
                }
                break;
        }
    }
}

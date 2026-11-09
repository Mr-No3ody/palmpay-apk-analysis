package com.appsflyer.internal;

import android.content.Context;
import com.adjust.sdk.Constants;
import com.appsflyer.AFLogger;
import com.miui.referrer.api.GetAppsReferrerClient;
import com.miui.referrer.api.GetAppsReferrerDetails;
import com.miui.referrer.api.GetAppsReferrerStateListener;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1qSDK extends AFi1dSDK {
    public AFj1qSDK(AFc1pSDK aFc1pSDK, Runnable runnable) {
        super("store", Constants.REFERRER_API_XIAOMI, aFc1pSDK, runnable);
    }

    private boolean getMediationNetwork() {
        if (!AFAdRevenueData()) {
            return false;
        }
        try {
            Class.forName("com.miui.referrer.api.GetAppsReferrerClient");
            AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Xiaomi Install Referrer is allowed");
            return true;
        } catch (ClassNotFoundException unused) {
            AFLogger.INSTANCE.v(AFg1cSDK.REFERRER, "Class com.miui.referrer.api.GetAppsReferrerClient not found");
            return false;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1cSDK.REFERRER, "An error occurred while trying to access GetAppsReferrerClient", th);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFj1tSDK
    public final void getMediationNetwork(final Context context) {
        if (getMediationNetwork()) {
            this.component2 = System.currentTimeMillis();
            this.component1 = AFj1tSDK.AFa1uSDK.STARTED;
            addObserver(new AFj1tSDK.AnonymousClass3());
            final GetAppsReferrerClient getAppsReferrerClientBuild = GetAppsReferrerClient.Companion.newBuilder(context).build();
            getAppsReferrerClientBuild.startConnection(new GetAppsReferrerStateListener() { // from class: com.appsflyer.internal.AFj1qSDK.2
                public final void onGetAppsReferrerSetupFinished(int i7) {
                    AFj1qSDK.this.AFAdRevenueData.put("api_ver", Long.valueOf(AFj1gSDK.AFAdRevenueData(context, "com.xiaomi.mipicks")));
                    AFj1qSDK.this.AFAdRevenueData.put("api_ver_name", AFj1gSDK.getMonetizationNetwork(context, "com.xiaomi.mipicks"));
                    if (i7 == -1) {
                        AFLogger.INSTANCE.w(AFg1cSDK.REFERRER, "XiaomiInstallReferrer SERVICE_DISCONNECTED");
                        AFj1qSDK.this.AFAdRevenueData.put("response", "SERVICE_DISCONNECTED");
                    } else if (i7 == 0) {
                        AFj1qSDK aFj1qSDK = AFj1qSDK.this;
                        GetAppsReferrerClient getAppsReferrerClient = getAppsReferrerClientBuild;
                        aFj1qSDK.AFAdRevenueData.put("response", "OK");
                        try {
                            AFLogger aFLogger = AFLogger.INSTANCE;
                            AFg1cSDK aFg1cSDK = AFg1cSDK.REFERRER;
                            aFLogger.d(aFg1cSDK, "XiaomiInstallReferrer connected");
                            if (getAppsReferrerClient.isReady()) {
                                GetAppsReferrerDetails installReferrer = getAppsReferrerClient.getInstallReferrer();
                                String installReferrer2 = installReferrer.getInstallReferrer();
                                if (installReferrer2 != null) {
                                    aFj1qSDK.AFAdRevenueData.put(Constants.REFERRER, installReferrer2);
                                }
                                aFj1qSDK.AFAdRevenueData.put("click_ts", Long.valueOf(installReferrer.getReferrerClickTimestampSeconds()));
                                aFj1qSDK.AFAdRevenueData.put("install_begin_ts", Long.valueOf(installReferrer.getInstallBeginTimestampSeconds()));
                                HashMap map = new HashMap();
                                map.put("click_server_ts", Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
                                map.put("install_begin_server_ts", Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
                                map.put("install_version", installReferrer.getInstallVersion());
                                aFj1qSDK.AFAdRevenueData.put("xiaomi_custom", map);
                            } else {
                                aFLogger.w(aFg1cSDK, "XiaomiReferrerClient: XiaomiInstallReferrer is not ready");
                            }
                        } catch (Throwable th) {
                            AFLogger aFLogger2 = AFLogger.INSTANCE;
                            AFg1cSDK aFg1cSDK2 = AFg1cSDK.REFERRER;
                            StringBuilder sb2 = new StringBuilder("Failed to get Xiaomi install referrer: ");
                            sb2.append(th.getMessage());
                            aFLogger2.w(aFg1cSDK2, sb2.toString());
                        }
                    } else if (i7 == 1) {
                        AFj1qSDK.this.AFAdRevenueData.put("response", "SERVICE_UNAVAILABLE");
                        AFLogger.INSTANCE.w(AFg1cSDK.REFERRER, "XiaomiInstallReferrer not supported");
                    } else if (i7 == 2) {
                        AFLogger.INSTANCE.w(AFg1cSDK.REFERRER, "XiaomiInstallReferrer FEATURE_NOT_SUPPORTED");
                        AFj1qSDK.this.AFAdRevenueData.put("response", "FEATURE_NOT_SUPPORTED");
                    } else if (i7 == 3) {
                        AFLogger.INSTANCE.w(AFg1cSDK.REFERRER, "XiaomiInstallReferrer DEVELOPER_ERROR");
                        AFj1qSDK.this.AFAdRevenueData.put("response", "DEVELOPER_ERROR");
                    } else if (i7 != 4) {
                        AFLogger.INSTANCE.w(AFg1cSDK.REFERRER, "responseCode not found.");
                    } else {
                        AFLogger.INSTANCE.w(AFg1cSDK.REFERRER, "XiaomiInstallReferrer DEVELOPER_ERROR");
                        AFj1qSDK.this.AFAdRevenueData.put("response", "PERMISSION_ERROR");
                    }
                    AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Xiaomi Install Referrer collected locally");
                    AFj1qSDK.this.getMonetizationNetwork();
                    getAppsReferrerClientBuild.endConnection();
                }

                public final void onGetAppsServiceDisconnected() {
                }
            });
        }
    }
}

package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.adjust.sdk.Constants;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.appsflyer.AFLogger;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public class AFi1aSDK extends AFi1dSDK {

    @NonNull
    final ExecutorService getMonetizationNetwork;
    public final Map<String, Object> getRevenue;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFi1aSDK$5, reason: invalid class name */
    public class AnonymousClass5 implements InstallReferrerStateListener {
        final /* synthetic */ Context val$context;
        final /* synthetic */ InstallReferrerClient val$referrerClient;

        public AnonymousClass5(InstallReferrerClient installReferrerClient, Context context) {
            this.val$referrerClient = installReferrerClient;
            this.val$context = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onInstallReferrerSetupFinished$0(InstallReferrerClient installReferrerClient, Context context, int i7) {
            AFi1aSDK.this.getMonetizationNetwork(installReferrerClient, context, i7);
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public final void onInstallReferrerServiceDisconnected() {
            AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Install Referrer service disconnected");
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public final void onInstallReferrerSetupFinished(final int i7) {
            ExecutorService executorService = AFi1aSDK.this.getMonetizationNetwork;
            final InstallReferrerClient installReferrerClient = this.val$referrerClient;
            final Context context = this.val$context;
            executorService.execute(new Runnable() { // from class: com.appsflyer.internal.k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20421a.lambda$onInstallReferrerSetupFinished$0(installReferrerClient, context, i7);
                }
            });
        }
    }

    public AFi1aSDK(@NonNull Runnable runnable, @NonNull ExecutorService executorService, @NonNull AFc1pSDK aFc1pSDK) {
        super("store", Constants.REFERRER_API_GOOGLE, aFc1pSDK, runnable);
        this.getRevenue = new HashMap();
        this.getMonetizationNetwork = executorService;
    }

    private boolean AFAdRevenueData(@NonNull Context context) {
        if (!AFAdRevenueData()) {
            return false;
        }
        try {
            if (AFj1gSDK.getCurrencyIso4217Code(context, "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE")) {
                AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Install referrer is allowed");
                return true;
            }
            AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Install referrer is not allowed");
            return false;
        } catch (ClassNotFoundException e10) {
            AFLogger.afErrorLogForExcManagerOnly("InstallReferrerClient not found", e10);
            AFLogger.INSTANCE.v(AFg1cSDK.REFERRER, "Class com.android.installreferrer.api.InstallReferrerClient not found");
            return false;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1cSDK.REFERRER, "An error occurred while trying to verify manifest : ".concat("com.android.installreferrer.api.InstallReferrerClient"), th);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getRevenue(Context context) {
        this.component2 = System.currentTimeMillis();
        this.component1 = AFj1tSDK.AFa1uSDK.STARTED;
        addObserver(new AFj1tSDK.AnonymousClass3());
        try {
            InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(context).build();
            AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Connecting to Install Referrer Library...");
            installReferrerClientBuild.startConnection(new AnonymousClass5(installReferrerClientBuild, context));
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1cSDK.REFERRER, "referrerClient -> startConnection", th);
        }
    }

    @Override // com.appsflyer.internal.AFj1tSDK
    public final void getMediationNetwork(@NonNull Context context) {
        if (AFAdRevenueData(context)) {
            this.getMonetizationNetwork.execute(new f(2, this, context));
        }
    }

    @VisibleForTesting
    @WorkerThread
    public final void getMonetizationNetwork(InstallReferrerClient installReferrerClient, Context context, int i7) {
        this.getRevenue.put("code", String.valueOf(i7));
        Pair<Long, String> mediationNetwork = AFj1gSDK.getMediationNetwork(context, "com.android.vending");
        this.AFAdRevenueData.put("api_ver", mediationNetwork.f38891a);
        this.AFAdRevenueData.put("api_ver_name", mediationNetwork.f38892b);
        if (i7 == -1) {
            AFLogger.INSTANCE.w(AFg1cSDK.REFERRER, "InstallReferrer SERVICE_DISCONNECTED");
            this.AFAdRevenueData.put("response", "SERVICE_DISCONNECTED");
        } else if (i7 == 0) {
            this.AFAdRevenueData.put("response", "OK");
            try {
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK = AFg1cSDK.REFERRER;
                aFLogger.d(aFg1cSDK, "InstallReferrer connected");
                if (installReferrerClient.isReady()) {
                    ReferrerDetails installReferrer = installReferrerClient.getInstallReferrer();
                    String installReferrer2 = installReferrer.getInstallReferrer();
                    if (installReferrer2 != null) {
                        this.getRevenue.put("val", installReferrer2);
                        this.AFAdRevenueData.put(Constants.REFERRER, installReferrer2);
                    }
                    long referrerClickTimestampSeconds = installReferrer.getReferrerClickTimestampSeconds();
                    this.getRevenue.put("clk", Long.toString(referrerClickTimestampSeconds));
                    this.AFAdRevenueData.put("click_ts", Long.valueOf(referrerClickTimestampSeconds));
                    long installBeginTimestampSeconds = installReferrer.getInstallBeginTimestampSeconds();
                    this.getRevenue.put("install", Long.toString(installBeginTimestampSeconds));
                    this.AFAdRevenueData.put("install_begin_ts", Long.valueOf(installBeginTimestampSeconds));
                    HashMap map = new HashMap();
                    try {
                        boolean googlePlayInstantParam = installReferrer.getGooglePlayInstantParam();
                        this.getRevenue.put("instant", Boolean.valueOf(googlePlayInstantParam));
                        map.put("instant", Boolean.valueOf(googlePlayInstantParam));
                    } catch (NoSuchMethodError e10) {
                        AFLogger.afErrorLogForExcManagerOnly("getGooglePlayInstantParam not exist", e10);
                    }
                    try {
                        map.put("click_server_ts", Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
                        map.put("install_begin_server_ts", Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
                        map.put("install_version", installReferrer.getInstallVersion());
                    } catch (NoSuchMethodError e11) {
                        AFLogger.INSTANCE.e(AFg1cSDK.REFERRER, "some method not exist", e11, false, false);
                    }
                    if (!map.isEmpty()) {
                        this.AFAdRevenueData.put("google_custom", map);
                    }
                    installReferrerClient.endConnection();
                } else {
                    aFLogger.w(aFg1cSDK, "ReferrerClient: InstallReferrer is not ready");
                    this.getRevenue.put("err", "ReferrerClient: InstallReferrer is not ready");
                }
            } catch (Throwable th) {
                AFLogger aFLogger2 = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK2 = AFg1cSDK.REFERRER;
                StringBuilder sb2 = new StringBuilder("Failed to get install referrer: ");
                sb2.append(th.getMessage());
                aFLogger2.w(aFg1cSDK2, sb2.toString());
                this.getRevenue.put("err", th.getMessage());
                aFLogger2.e(aFg1cSDK2, "Failed to get install referrer", th, false, false);
            }
        } else if (i7 == 1) {
            this.AFAdRevenueData.put("response", "SERVICE_UNAVAILABLE");
            AFLogger.INSTANCE.w(AFg1cSDK.REFERRER, "InstallReferrer not supported");
        } else if (i7 == 2) {
            AFLogger.INSTANCE.w(AFg1cSDK.REFERRER, "InstallReferrer FEATURE_NOT_SUPPORTED");
            this.AFAdRevenueData.put("response", "FEATURE_NOT_SUPPORTED");
        } else if (i7 != 3) {
            AFLogger.INSTANCE.w(AFg1cSDK.REFERRER, "responseCode not found.");
        } else {
            AFLogger.INSTANCE.w(AFg1cSDK.REFERRER, "InstallReferrer DEVELOPER_ERROR");
            this.AFAdRevenueData.put("response", "DEVELOPER_ERROR");
        }
        AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Install Referrer collected locally");
        getMonetizationNetwork();
    }
}

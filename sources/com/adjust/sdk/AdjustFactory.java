package com.adjust.sdk;

import android.content.Context;
import com.adjust.sdk.network.IActivityPackageSender;
import com.adjust.sdk.network.UtilNetworking;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes.dex */
public class AdjustFactory {
    private static IActivityHandler activityHandler = null;
    private static boolean allowUrlStrategyFallback = true;
    private static IAttributionHandler attributionHandler = null;
    private static String baseUrl = null;
    private static UtilNetworking.IConnectionOptions connectionOptions = null;
    private static String gdprUrl = null;
    private static UtilNetworking.IHttpsURLConnectionProvider httpsURLConnectionProvider = null;
    private static boolean ignoreSystemLifecycleBootstrap = false;
    private static BackoffStrategy installSessionBackoffStrategy = null;
    private static ILogger logger = null;
    private static IPackageHandler packageHandler = null;
    private static BackoffStrategy packageHandlerBackoffStrategy = null;
    private static IPurchaseVerificationHandler purchaseVerificationHandler = null;
    private static String purchaseVerificationUrl = null;
    private static BackoffStrategy sdkClickBackoffStrategy = null;
    private static ISdkClickHandler sdkClickHandler = null;
    private static long sessionInterval = -1;
    private static String subscriptionUrl = null;
    private static long subsessionInterval = -1;
    private static long timerInterval = -1;
    private static long timerStart = -1;
    private static boolean tryInstallReferrer = true;

    public static class URLGetConnection {
        HttpsURLConnection httpsURLConnection;
        URL url;

        public URLGetConnection(HttpsURLConnection httpsURLConnection, URL url) {
            this.httpsURLConnection = httpsURLConnection;
            this.url = url;
        }
    }

    private static String byte2HexFormatted(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b7 : bArr) {
            String hexString = Integer.toHexString(b7);
            int length = hexString.length();
            if (length == 1) {
                hexString = "0".concat(hexString);
            }
            if (length > 2) {
                hexString = hexString.substring(length - 2, length);
            }
            sb2.append(hexString.toUpperCase());
        }
        return sb2.toString();
    }

    public static IActivityHandler getActivityHandler(AdjustConfig adjustConfig) {
        IActivityHandler iActivityHandler = activityHandler;
        if (iActivityHandler == null) {
            return ActivityHandler.getInstance(adjustConfig);
        }
        iActivityHandler.init(adjustConfig);
        return activityHandler;
    }

    public static IAttributionHandler getAttributionHandler(IActivityHandler iActivityHandler, boolean z3, IActivityPackageSender iActivityPackageSender) {
        IAttributionHandler iAttributionHandler = attributionHandler;
        if (iAttributionHandler == null) {
            return new AttributionHandler(iActivityHandler, z3, iActivityPackageSender);
        }
        iAttributionHandler.init(iActivityHandler, z3, iActivityPackageSender);
        return attributionHandler;
    }

    public static String getBaseUrl() {
        return baseUrl;
    }

    public static UtilNetworking.IConnectionOptions getConnectionOptions() {
        UtilNetworking.IConnectionOptions iConnectionOptions = connectionOptions;
        return iConnectionOptions == null ? UtilNetworking.createDefaultConnectionOptions() : iConnectionOptions;
    }

    public static String getGdprUrl() {
        return gdprUrl;
    }

    public static UtilNetworking.IHttpsURLConnectionProvider getHttpsURLConnectionProvider() {
        UtilNetworking.IHttpsURLConnectionProvider iHttpsURLConnectionProvider = httpsURLConnectionProvider;
        return iHttpsURLConnectionProvider == null ? UtilNetworking.createDefaultHttpsURLConnectionProvider() : iHttpsURLConnectionProvider;
    }

    public static BackoffStrategy getInstallSessionBackoffStrategy() {
        BackoffStrategy backoffStrategy = installSessionBackoffStrategy;
        return backoffStrategy == null ? BackoffStrategy.SHORT_WAIT : backoffStrategy;
    }

    public static ILogger getLogger() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public static IPackageHandler getPackageHandler(IActivityHandler iActivityHandler, Context context, boolean z3, IActivityPackageSender iActivityPackageSender) {
        IPackageHandler iPackageHandler = packageHandler;
        if (iPackageHandler == null) {
            return new PackageHandler(iActivityHandler, context, z3, iActivityPackageSender);
        }
        iPackageHandler.init(iActivityHandler, context, z3, iActivityPackageSender);
        return packageHandler;
    }

    public static BackoffStrategy getPackageHandlerBackoffStrategy() {
        BackoffStrategy backoffStrategy = packageHandlerBackoffStrategy;
        return backoffStrategy == null ? BackoffStrategy.LONG_WAIT : backoffStrategy;
    }

    public static IPurchaseVerificationHandler getPurchaseVerificationHandler(IActivityHandler iActivityHandler, boolean z3, IActivityPackageSender iActivityPackageSender) {
        IPurchaseVerificationHandler iPurchaseVerificationHandler = purchaseVerificationHandler;
        if (iPurchaseVerificationHandler == null) {
            return new PurchaseVerificationHandler(iActivityHandler, z3, iActivityPackageSender);
        }
        iPurchaseVerificationHandler.init(iActivityHandler, z3, iActivityPackageSender);
        return purchaseVerificationHandler;
    }

    public static String getPurchaseVerificationUrl() {
        return purchaseVerificationUrl;
    }

    public static BackoffStrategy getSdkClickBackoffStrategy() {
        BackoffStrategy backoffStrategy = sdkClickBackoffStrategy;
        return backoffStrategy == null ? BackoffStrategy.SHORT_WAIT : backoffStrategy;
    }

    public static ISdkClickHandler getSdkClickHandler(IActivityHandler iActivityHandler, boolean z3, IActivityPackageSender iActivityPackageSender) {
        ISdkClickHandler iSdkClickHandler = sdkClickHandler;
        if (iSdkClickHandler == null) {
            return new SdkClickHandler(iActivityHandler, z3, iActivityPackageSender);
        }
        iSdkClickHandler.init(iActivityHandler, z3, iActivityPackageSender);
        return sdkClickHandler;
    }

    public static long getSessionInterval() {
        long j6 = sessionInterval;
        if (j6 == -1) {
            return 1800000L;
        }
        return j6;
    }

    public static String getSubscriptionUrl() {
        return subscriptionUrl;
    }

    public static long getSubsessionInterval() {
        long j6 = subsessionInterval;
        if (j6 == -1) {
            return 1000L;
        }
        return j6;
    }

    public static long getTimerInterval() {
        long j6 = timerInterval;
        if (j6 == -1) {
            return 60000L;
        }
        return j6;
    }

    public static long getTimerStart() {
        long j6 = timerStart;
        if (j6 == -1) {
            return 60000L;
        }
        return j6;
    }

    public static boolean getTryInstallReferrer() {
        return tryInstallReferrer;
    }

    public static boolean isAllowUrlStrategyFallback() {
        return allowUrlStrategyFallback;
    }

    public static boolean isSystemLifecycleBootstrapIgnored() {
        return ignoreSystemLifecycleBootstrap;
    }

    public static void setActivityHandler(IActivityHandler iActivityHandler) {
        activityHandler = iActivityHandler;
    }

    public static void setAllowUrlStrategyFallback(boolean z3) {
        allowUrlStrategyFallback = z3;
    }

    public static void setAttributionHandler(IAttributionHandler iAttributionHandler) {
        attributionHandler = iAttributionHandler;
    }

    public static void setBaseUrl(String str) {
        baseUrl = str;
    }

    public static void setConnectionOptions(UtilNetworking.IConnectionOptions iConnectionOptions) {
        connectionOptions = iConnectionOptions;
    }

    public static void setGdprUrl(String str) {
        gdprUrl = str;
    }

    public static void setHttpsURLConnectionProvider(UtilNetworking.IHttpsURLConnectionProvider iHttpsURLConnectionProvider) {
        httpsURLConnectionProvider = iHttpsURLConnectionProvider;
    }

    public static void setIgnoreSystemLifecycleBootstrap(boolean z3) {
        ignoreSystemLifecycleBootstrap = z3;
    }

    public static void setLogger(ILogger iLogger) {
        logger = iLogger;
    }

    public static void setPackageHandler(IPackageHandler iPackageHandler) {
        packageHandler = iPackageHandler;
    }

    public static void setPackageHandlerBackoffStrategy(BackoffStrategy backoffStrategy) {
        packageHandlerBackoffStrategy = backoffStrategy;
    }

    public static void setPurchaseVerificationUrl(String str) {
        purchaseVerificationUrl = str;
    }

    public static void setSdkClickBackoffStrategy(BackoffStrategy backoffStrategy) {
        sdkClickBackoffStrategy = backoffStrategy;
    }

    public static void setSdkClickHandler(ISdkClickHandler iSdkClickHandler) {
        sdkClickHandler = iSdkClickHandler;
    }

    public static void setSessionInterval(long j6) {
        sessionInterval = j6;
    }

    public static void setSubscriptionUrl(String str) {
        subscriptionUrl = str;
    }

    public static void setSubsessionInterval(long j6) {
        subsessionInterval = j6;
    }

    public static void setTimerInterval(long j6) {
        timerInterval = j6;
    }

    public static void setTimerStart(long j6) {
        timerStart = j6;
    }

    public static void setTryInstallReferrer(boolean z3) {
        tryInstallReferrer = z3;
    }

    public static void teardown(Context context) {
        if (context != null) {
            ActivityHandler.deleteState(context);
            PackageHandler.deleteState(context);
        }
        packageHandler = null;
        attributionHandler = null;
        activityHandler = null;
        logger = null;
        sdkClickHandler = null;
        timerInterval = -1L;
        timerStart = -1L;
        sessionInterval = -1L;
        subsessionInterval = -1L;
        sdkClickBackoffStrategy = null;
        packageHandlerBackoffStrategy = null;
        baseUrl = Constants.BASE_URL;
        gdprUrl = Constants.GDPR_URL;
        subscriptionUrl = Constants.SUBSCRIPTION_URL;
        purchaseVerificationUrl = Constants.PURCHASE_VERIFICATION_URL;
        connectionOptions = null;
        httpsURLConnectionProvider = null;
        tryInstallReferrer = true;
    }
}

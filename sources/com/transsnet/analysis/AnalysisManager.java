package com.transsnet.analysis;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.transsnet.analysis.utils.AnalysisEventUtils;
import java.util.concurrent.ExecutorService;
import okhttp3.U;
import p266r8.a;

/* JADX INFO: loaded from: classes3.dex */
public class AnalysisManager {
    public static final int AD_TYPE = 0;
    private boolean debug;
    private Application mAnaApp;
    private String mBaseUrl;
    private String mCountryCode;
    private String mGaId;
    private U mOkHttpClient;
    private long mUploadEventDuration = 15000;
    private String mUserId;

    public static class Configuration {
        private String appId;
        private String baseUrl;
        private boolean debug;
        private String mCountryCode;
        private String mGaId;
        private U mOkHttpClient;
        private long mUploadEventDuration;
        private String mUserId;
        private String merchantId;
        private String privateKey;

        public void setCountryCode(String mCountryCode) {
            this.mCountryCode = mCountryCode;
        }

        public void setDebug(boolean debug) {
            this.debug = debug;
        }

        @Deprecated
        public void setExecutor(ExecutorService executor) {
        }

        public void setGaId(String mGaId) {
            this.mGaId = mGaId;
        }

        public void setOkHttpClient(U client) {
            this.mOkHttpClient = client;
        }

        public void setSdkInfo(String appId, String merchantId, String privateKey, String baseUrl) {
            this.merchantId = merchantId;
            this.privateKey = privateKey;
            this.appId = appId;
            if (TextUtils.isEmpty(baseUrl)) {
                baseUrl = BuildConfig.analyReleaseUrl;
            }
            this.baseUrl = baseUrl;
        }

        public void setUploadEventDuration(long duration) {
            this.mUploadEventDuration = duration;
        }

        public void setUserId(String mUserId) {
            this.mUserId = mUserId;
        }
    }

    public static AnalysisManager get() {
        return a.f41644a;
    }

    public static String getAnalyReleaseUrl() {
        return BuildConfig.analyReleaseUrl;
    }

    public static String getAnalyTestUrl() {
        return "https://test-ad.transspay.net";
    }

    public static String getBaseUrl() {
        return get().mBaseUrl;
    }

    public static Context getContext() {
        return get().mAnaApp;
    }

    public static String getCountryCode() {
        return get().mCountryCode;
    }

    public static String getGaId() {
        return get().mGaId;
    }

    public static U getInjectedOkHttpClient() {
        return get().mOkHttpClient;
    }

    public static String getUserId() {
        return get().mUserId;
    }

    public static void init(Application application, Configuration config) {
        AnalysisManager analysisManager = get();
        analysisManager.mAnaApp = application;
        analysisManager.mCountryCode = config.mCountryCode;
        analysisManager.mUserId = config.mUserId;
        analysisManager.mGaId = config.mGaId;
        analysisManager.mBaseUrl = TextUtils.isEmpty(config.baseUrl) ? BuildConfig.analyReleaseUrl : config.baseUrl;
        if (config.mUploadEventDuration > 0) {
            analysisManager.mUploadEventDuration = config.mUploadEventDuration;
        }
        analysisManager.debug = config.debug;
        analysisManager.mOkHttpClient = config.mOkHttpClient;
    }

    public static boolean isDebug() {
        return get().debug;
    }

    public static void refreshUserId(String userId) {
        get().mUserId = userId;
    }

    public static void track(String appId, String merchantId, String key, String adId, long adShowTime, String adSlotId, String eventType, String eventSubType, String pointWindowX, String pointWindowY, String behaviorId, String relatedId) {
        track(appId, merchantId, key, adId, adShowTime, adSlotId, eventType, eventSubType, pointWindowX, pointWindowY, behaviorId, relatedId, 1);
    }

    public static void uploadEvents(String merchantId, String key) {
        AnalysisEventUtils.uploadAnalysisEvent(merchantId, key, 0);
    }

    public long getUploadEventDuration() {
        return this.mUploadEventDuration;
    }

    public void setCountryCode(String countryCode) {
        this.mCountryCode = countryCode;
    }

    public static void track(String appId, String merchantId, String key, String adId, long adShowTime, String adSlotId, String eventType, String eventSubType, String pointWindowX, String pointWindowY, String behaviorId, String relatedId, int count) {
        AnalysisEventUtils.track(appId, merchantId, key, adId, adShowTime, adSlotId, eventType, eventSubType, pointWindowX, pointWindowY, behaviorId, relatedId, count);
    }
}

package com.transsnet.adsdk;

import Fe.Z;
import H1.j;
import J1.g;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.work.impl.o;
import com.bumptech.glide.load.engine.k;
import com.bumptech.glide.m;
import com.google.gson.reflect.TypeToken;
import com.horcrux.svg.d0;
import com.transsnet.adsdk.data.bean.req.AdReq;
import com.transsnet.adsdk.data.local.dao.AdDao;
import com.transsnet.adsdk.data.local.database.AdDatabase;
import com.transsnet.adsdk.data.local.entity.AdEntity;
import com.transsnet.adsdk.data.network.AdApi;
import com.transsnet.adsdk.data.network.Predicate.SingleAdPredicate;
import com.transsnet.adsdk.data.network.ReqUtil;
import com.transsnet.adsdk.data.network.function.SingleAdFunction;
import com.transsnet.adsdk.interfaces.IAdListener;
import com.transsnet.adsdk.utils.AdSdkUtils;
import com.transsnet.adsdk.utils.AppUtils;
import com.transsnet.adsdk.utils.ConvertUtils;
import com.transsnet.adsdk.utils.CoroutineUtil;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.adsdk.widgets.splash.SplashAdView;
import com.transsnet.analysis.AnalysisManager;
import com.transsnet.analysis.utils.GsonUtil;
import df.i;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.operators.observable.C1755g;
import io.reactivex.internal.operators.observable.C1760l;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import okhttp3.AbstractC1956y;
import okhttp3.Dns;
import okhttp3.U;

/* JADX INFO: loaded from: classes3.dex */
public class AdManager {
    public static final int AD_ENV_TYPE_RELEASE = 3;
    public static final int AD_ENV_TYPE_TEST = 1;
    public static final int AD_ENV_TYPE_UAT = 2;
    public static final int AD_TYPE_NATIVE = 0;
    public static final int AD_TYPE_WEB = 1;
    public static final int SHOW_TYPE_APP = 2;
    public static final int SHOW_TYPE_SDK = 1;
    public static final String TAG = "adsdk";
    private static AdEntity mAdData = new AdEntity();
    private static List<String> mNoShowList = new ArrayList();
    private boolean bUseRemoteWebView;
    private boolean debug;
    private ExecutorService executor;
    private Dns httpDns;
    private double latitude;
    private double longitude;
    private Application mAdApp;
    private AdConfiguration mAdConfiguration;
    private String mAppChannel;
    private String mApplicationId;
    private String mBaseUrl;
    private String mCountryCode;
    private String mExtraId;
    private Map<String, Object> mExtras;
    private String mGaId;
    private String mLanguage;
    private String mMerchantId;
    private String mMerchantPrivateKey;
    private String mUserId;
    private U okHttpClient;
    private boolean useDarkMode;

    public static class AdConfiguration {
        private ExecutorService executor;
        private Dns httpDns;
        private String mAnalysisBaseUrl;
        private String mAppChannel;
        private String mApplicationId;
        private String mBaseUrl;
        private String mCountryCode;
        private AbstractC1956y mEventListener;
        private String mExtraId;
        private Map<String, Object> mExtras;
        private String mGaId;
        private String mLanguage;
        private String mMerchantId;
        private String mMerchantPrivateKey;
        private String mUserId;
        private U okHttpClient;
        private int mEnvType = 3;
        private boolean bUseWebViewCache = false;
        private boolean bUseRemoteWebView = false;
        private long mUploadEventDuration = 0;
        private boolean useDarkMode = false;
        private boolean debug = false;

        public void enableRemoteWebView(boolean enable) {
            this.bUseRemoteWebView = enable;
        }

        public void enableWebViewCache(boolean enable) {
            this.bUseWebViewCache = enable;
        }

        public AbstractC1956y getListener() {
            return this.mEventListener;
        }

        public U getOkHttpClient() {
            return this.okHttpClient;
        }

        public boolean isUseDarkMode() {
            return this.useDarkMode;
        }

        public void setAnalysisUrl(String url) {
            this.mAnalysisBaseUrl = url;
        }

        public void setAppChannel(String mAppChannel) {
            this.mAppChannel = mAppChannel;
        }

        public void setAppId(String id2) {
            this.mApplicationId = id2;
        }

        public void setCountryCode(String code) {
            this.mCountryCode = code;
        }

        public void setDebug(boolean debug) {
            this.debug = debug;
        }

        public void setEnv(int env) {
            this.mEnvType = env;
            if (env == 1) {
                this.mBaseUrl = "https://test-ad.transspay.net";
            } else if (env == 2) {
                this.mBaseUrl = BuildConfig.adUatUrl;
            } else {
                this.mEnvType = 3;
                this.mBaseUrl = BuildConfig.adReleaseUrl;
            }
        }

        public void setEventListener(AbstractC1956y listener) {
            this.mEventListener = listener;
        }

        public void setExecutor(ExecutorService executor) {
            this.executor = executor;
        }

        public void setExtraId(String mExtraId) {
            this.mExtraId = mExtraId;
        }

        public void setExtras(Map<String, Object> extras) {
            if (extras != null) {
                HashMap map = new HashMap();
                this.mExtras = map;
                map.putAll(extras);
            }
        }

        public void setGaId(String mGaId) {
            this.mGaId = mGaId;
        }

        public void setHttpDns(Dns httpDns) {
            this.httpDns = httpDns;
        }

        public void setLanguage(String language) {
            this.mLanguage = language;
        }

        public void setMerchantInfo(String merchantId, String merchantPrivateKey) {
            this.mMerchantId = merchantId;
            this.mMerchantPrivateKey = merchantPrivateKey;
        }

        public void setOkHttpClient(U client) {
            this.okHttpClient = client;
        }

        public void setUploadEventDuration(long duration) {
            this.mUploadEventDuration = duration;
        }

        public void setUrl(String url) {
            this.mBaseUrl = url;
            if ("https://test-ad.transspay.net".equals(url)) {
                this.mEnvType = 1;
            } else if (BuildConfig.adUatUrl.equals(url)) {
                this.mEnvType = 2;
            } else {
                this.mEnvType = 3;
            }
        }

        public void setUseDarkMode(boolean useDarkMode) {
            this.useDarkMode = useDarkMode;
        }

        public void setUserId(String mUserId) {
            this.mUserId = mUserId;
        }
    }

    public /* synthetic */ AdManager(int i7) {
        this();
    }

    public static boolean checkShowAd(AdEntity adData) {
        if (adData != null && !TextUtils.isEmpty(adData.adId)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis >= adData.validStartTime && jCurrentTimeMillis <= adData.validEndTime) {
                AdEntity adEntityQueryByAdId = AdDatabase.getInstance(get().mAdApp).adDao().queryByAdId(adData.adId);
                if (adEntityQueryByAdId == null) {
                    return inShowTimesLimit(adData);
                }
                int i7 = adData.closeControl;
                if (i7 > 0 && adData.closeCount >= i7) {
                    return false;
                }
                Integer num = adData.clickFrequency;
                if (num == null) {
                    return inShowTimesLimit(adData);
                }
                if ((num.intValue() != 0 || adEntityQueryByAdId.clickDate == 0) && System.currentTimeMillis() - adEntityQueryByAdId.clickDate >= adData.clickFrequency.intValue() * 86400000) {
                    return inShowTimesLimit(adData);
                }
                return false;
            }
        }
        return false;
    }

    public static void clearAdData() {
        AdDatabase.getInstance(get().getApp()).adDao().deleteAll();
        SplashAdView.clearSplashImagePath();
    }

    public static void clearPreloadSingleAd() {
        SingleAdView.clearPreloadData();
    }

    public static void configAdWebView(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                String processName = Application.getProcessName();
                if (TextUtils.isEmpty(processName)) {
                    processName = "webAd";
                }
                if (context.getPackageName().equals(processName)) {
                    return;
                }
                WebView.setDataDirectorySuffix(URLEncoder.encode(processName, "utf-8"));
            }
        } catch (Exception unused) {
        }
    }

    public static void downloadSplashImg(String slotId) {
        SplashAdView.downloadSplashImg(slotId);
    }

    public static AdManager get() {
        return d.f25570a;
    }

    public static String getBaseUrl() {
        return get().mBaseUrl;
    }

    private static int getDynamicHeight(int width, float scaleWidth, float scaleHeight) {
        return (int) (width / (scaleWidth / scaleHeight));
    }

    public static String getExtraId() {
        return get().mExtraId;
    }

    public static Map<String, Object> getExtras() {
        return get().mExtras;
    }

    public static String getGaId() {
        return get().mGaId;
    }

    public static String getUserId() {
        return get().mUserId;
    }

    private static boolean inShowDates(String showDates) {
        if (TextUtils.isEmpty(showDates)) {
            return false;
        }
        List list = (List) GsonUtil.get().fromJson(showDates, new TypeToken<List<Integer>>() { // from class: com.transsnet.adsdk.AdManager.1
        }.getType());
        Calendar calendar = Calendar.getInstance();
        return list.contains(Integer.valueOf(calendar.get(7) != 1 ? calendar.get(7) - 1 : 7));
    }

    public static boolean inShowTimesLimit(AdEntity adData) {
        if (adData == null) {
            return false;
        }
        if (adData.showTimesCondition == null) {
            return true;
        }
        AdEntity adEntityQueryByAdId = AdDatabase.getInstance(get().mAdApp).adDao().queryByAdId(adData.adId);
        if (adEntityQueryByAdId == null) {
            if (adData.showTimesCondition.intValue() == 3) {
                return inShowDates(adData.showDates);
            }
            return true;
        }
        if (adData.showTimesCondition.intValue() == 1) {
            if (AdSdkUtils.isToday(adEntityQueryByAdId.showDate)) {
                return adEntityQueryByAdId.hasShowTimes < adData.showTimes;
            }
            resetHasShowTimes(adEntityQueryByAdId);
            return true;
        }
        if (adData.showTimesCondition.intValue() != 3) {
            return adEntityQueryByAdId.hasShowTimes < adData.showTimes;
        }
        if (!inShowDates(adData.showDates)) {
            return false;
        }
        if (AdSdkUtils.isToday(adEntityQueryByAdId.showDate)) {
            return adEntityQueryByAdId.hasShowTimes < adData.showTimes;
        }
        resetHasShowTimes(adEntityQueryByAdId);
        return true;
    }

    private void initAnalysisManager(@NonNull AdConfiguration config) {
        String analyTestUrl = config.mAnalysisBaseUrl;
        if (TextUtils.isEmpty(analyTestUrl)) {
            analyTestUrl = config.mEnvType == 1 ? AnalysisManager.getAnalyTestUrl() : AnalysisManager.getAnalyReleaseUrl();
        }
        AnalysisManager.Configuration configuration = new AnalysisManager.Configuration();
        configuration.setCountryCode(this.mCountryCode);
        configuration.setUserId(this.mUserId);
        configuration.setGaId(this.mGaId);
        configuration.setSdkInfo(this.mApplicationId, this.mMerchantId, this.mMerchantPrivateKey, analyTestUrl);
        if (config.getOkHttpClient() != null) {
            configuration.setOkHttpClient(config.getOkHttpClient());
        }
        configuration.setUploadEventDuration(config.mUploadEventDuration);
        configuration.setExecutor(null);
        configuration.setDebug(config.debug);
        AnalysisManager.init(this.mAdApp, configuration);
    }

    public static boolean isDebug() {
        return get().debug;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$preloadSingleAd$3(String str, boolean z3, ObservableEmitter observableEmitter) throws Exception {
        List<AdEntity> listQueryBySlotIdLimitCount = d0.h().queryBySlotIdLimitCount(str, get().mCountryCode, 10);
        mNoShowList.clear();
        for (AdEntity adEntity : listQueryBySlotIdLimitCount) {
            if (!checkShowAd(adEntity)) {
                mNoShowList.add(adEntity.adId);
            }
        }
        if (z3) {
            AdDatabase.getInstance(get().getApp()).adDao().disableAllData(str);
            observableEmitter.onNext(Boolean.FALSE);
        } else {
            if (listQueryBySlotIdLimitCount.size() > 0) {
                mAdData = listQueryBySlotIdLimitCount.get(0);
            }
            observableEmitter.onNext(Boolean.valueOf(checkShowAd(mAdData)));
        }
        observableEmitter.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$preloadSingleAd$4(Context context, Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            preloadImage(context, mAdData);
        }
        return bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$preloadSingleAd$5(boolean z3, Boolean bool) throws Exception {
        return z3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ObservableSource lambda$preloadSingleAd$6(String str, Boolean bool) throws Exception {
        AdReq commonAdReq = ReqUtil.getCommonAdReq(str, mNoShowList);
        return AdApi.getInstance().getService().getAdData(AdSdkUtils.getSignatureHeader(ConvertUtils.json2QueryString(commonAdReq)), commonAdReq);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$preloadSingleAd$7(Context context, WeakReference weakReference, boolean z3, AdEntity adEntity) {
        if (!z3) {
            SingleAdView.removePreloadData(adEntity.adSlotId);
            AdSdkUtils.onLoadAdFailed(context, (IAdListener) weakReference.get());
        }
        AdDao adDao = AdDatabase.getInstance(context).adDao();
        AdEntity adEntityQueryByAdId = adDao.queryByAdId(adEntity.adId);
        if (adEntityQueryByAdId == null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            adEntity.createTime = jCurrentTimeMillis;
            adEntity.updateTime = jCurrentTimeMillis;
            adEntity.curEnable = 1;
            adDao.insert(adEntity);
            return;
        }
        if (adEntityQueryByAdId.adId.equals(adEntity.adId)) {
            adEntity.showDate = adEntityQueryByAdId.showDate;
            adEntity.hasShowTimes = adEntityQueryByAdId.hasShowTimes;
            adEntity.clickDate = adEntityQueryByAdId.clickDate;
            adEntity.createTime = adEntityQueryByAdId.createTime;
        }
        adEntity.updateTime = System.currentTimeMillis();
        adEntity.curEnable = 1;
        adDao.update(adEntity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$saveAdClickStatus$1(AdEntity adEntity) {
        AdDao adDaoH = d0.h();
        AdEntity adEntityQueryByAdId = adDaoH.queryByAdId(adEntity.adId);
        if (adEntityQueryByAdId != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            adEntityQueryByAdId.clickDate = jCurrentTimeMillis;
            adEntityQueryByAdId.curEnable = 1;
            adEntityQueryByAdId.updateTime = jCurrentTimeMillis;
            adDaoH.update(adEntityQueryByAdId);
            return;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        adEntity.clickDate = jCurrentTimeMillis2;
        adEntity.curEnable = 1;
        adEntity.createTime = jCurrentTimeMillis2;
        adEntity.updateTime = jCurrentTimeMillis2;
        adDaoH.insert(adEntity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$saveAdCloseStatus$2(AdEntity adEntity) {
        AdDao adDaoH = d0.h();
        AdEntity adEntityQueryByAdId = adDaoH.queryByAdId(adEntity.adId);
        if (adEntityQueryByAdId != null) {
            adEntityQueryByAdId.closeCount++;
            adEntityQueryByAdId.closeTime = System.currentTimeMillis();
            adEntityQueryByAdId.curEnable = 1;
            adEntityQueryByAdId.updateTime = System.currentTimeMillis();
            adDaoH.update(adEntityQueryByAdId);
            return;
        }
        adEntity.closeTime = System.currentTimeMillis();
        adEntity.curEnable = 1;
        adEntity.closeCount = 1;
        long jCurrentTimeMillis = System.currentTimeMillis();
        adEntity.createTime = jCurrentTimeMillis;
        adEntity.updateTime = jCurrentTimeMillis;
        adDaoH.insert(adEntity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void preloadImage(Context context, AdEntity data) {
        if (AppUtils.isActivityAlive(context)) {
            SingleAdView.addPreloadData(data.adSlotId, data);
            m mVarO = com.bumptech.glide.b.e(context).load(data.imageUrl).a(new G1.d().g(k.f20705d));
            mVarO.getClass();
            mVarO.T(new j(mVarO.f21022k0), null, mVarO, g.f4461a);
        }
    }

    public static void preloadSingleAd(Context context, String slotId, IAdListener adListener) {
        final boolean zCheckAdExpired = AdSdkUtils.checkAdExpired(slotId);
        WeakReference weakReference = new WeakReference(adListener);
        C1755g c1755g = new C1755g(new De.b(slotId, zCheckAdExpired, 3), 0);
        i iVar = p298tf.f.f42628a;
        new C1760l(new C1760l(new C1760l(new C1760l(c1755g.k(iVar).i(p071ef.b.a()), new o(context), 2), new Predicate() { // from class: com.transsnet.adsdk.a
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return AdManager.lambda$preloadSingleAd$5(zCheckAdExpired, (Boolean) obj);
            }
        }, 1).i(iVar).f(new Z(slotId, 1)), new SingleAdFunction(slotId, null), 2), new SingleAdPredicate(new b(0, context, weakReference)), 1).k(iVar).i(p071ef.b.a()).subscribe(new c(context, adListener, context, weakReference));
    }

    public static void resetHasShowTimes(AdEntity newData) {
        if (newData == null) {
            return;
        }
        AdDao adDao = AdDatabase.getInstance(get().mAdApp).adDao();
        AdEntity adEntityQueryByAdId = adDao.queryByAdId(newData.adId);
        if (adEntityQueryByAdId == null) {
            newData.showDate = System.currentTimeMillis();
            newData.hasShowTimes = 0;
            long jCurrentTimeMillis = System.currentTimeMillis();
            newData.createTime = jCurrentTimeMillis;
            newData.updateTime = jCurrentTimeMillis;
            newData.curEnable = 1;
            adDao.insert(newData);
            return;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        adEntityQueryByAdId.showDate = jCurrentTimeMillis2;
        adEntityQueryByAdId.hasShowTimes = 0;
        newData.showDate = jCurrentTimeMillis2;
        newData.hasShowTimes = 0;
        newData.createTime = adEntityQueryByAdId.createTime;
        newData.updateTime = System.currentTimeMillis();
        newData.curEnable = 1;
        adDao.update(newData);
    }

    public static void saveAdClickStatus(AdEntity adData) {
        if (adData == null) {
            return;
        }
        CoroutineUtil.asyncRun(new Nc.m(adData, 1), null);
    }

    public static void saveAdCloseStatus(AdEntity adData) {
        if (adData == null) {
            return;
        }
        CoroutineUtil.asyncRun(new Nc.m(adData, 2), null);
    }

    public static void saveAdShowStatus(AdEntity newData, boolean deleteOld) {
        if (newData == null) {
            return;
        }
        AdDao adDaoH = d0.h();
        AdEntity adEntityQueryByAdId = adDaoH.queryByAdId(newData.adId);
        if (adEntityQueryByAdId == null) {
            newData.showDate = System.currentTimeMillis();
            newData.hasShowTimes++;
            long jCurrentTimeMillis = System.currentTimeMillis();
            newData.createTime = jCurrentTimeMillis;
            newData.updateTime = jCurrentTimeMillis;
            newData.curEnable = 1;
            adDaoH.insert(newData);
            return;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        adEntityQueryByAdId.showDate = jCurrentTimeMillis2;
        int i7 = adEntityQueryByAdId.hasShowTimes + 1;
        adEntityQueryByAdId.hasShowTimes = i7;
        newData.showDate = jCurrentTimeMillis2;
        newData.hasShowTimes = i7;
        newData.createTime = adEntityQueryByAdId.createTime;
        newData.updateTime = System.currentTimeMillis();
        newData.curEnable = 1;
        adDaoH.update(newData);
    }

    public static void saveAdShowStatusBackground(AdEntity adData, boolean deleteOld) {
        if (adData == null) {
            return;
        }
        CoroutineUtil.asyncRun(new D.b(adData, deleteOld, 15), null);
    }

    public static void setCountryCode(String countryCode) {
        get().mCountryCode = countryCode;
        AnalysisManager.get().setCountryCode(countryCode);
    }

    public static void setExtraId(String extraId) {
        get().mExtraId = extraId;
    }

    public static void setExtras(Map<String, Object> extras) {
        if (get().mExtras != null) {
            get().mExtras.clear();
        } else {
            get().mExtras = new HashMap();
        }
        if (extras != null) {
            get().mExtras.putAll(extras);
        }
    }

    public static void setGaId(String gaId) {
        get().mGaId = gaId;
    }

    public static void setUserId(String userId) {
        get().mUserId = userId;
        AnalysisManager.refreshUserId(userId);
    }

    public boolean checkUseRemoteWebView() {
        return this.bUseRemoteWebView;
    }

    public boolean checkUseWebViewCache() {
        return false;
    }

    public Application getApp() {
        return this.mAdApp;
    }

    public String getAppChannel() {
        return this.mAppChannel;
    }

    public String getApplicationId() {
        return this.mApplicationId;
    }

    public AdConfiguration getConfig() {
        return this.mAdConfiguration;
    }

    public String getCountryCode() {
        return this.mCountryCode;
    }

    public ExecutorService getExecutor() {
        return this.executor;
    }

    public Dns getHttpDns() {
        return this.httpDns;
    }

    public String getLanguage() {
        return TextUtils.isEmpty(this.mLanguage) ? "en" : this.mLanguage;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public String getMerchantId() {
        return this.mMerchantId;
    }

    public String getMerchantPrivateKey() {
        return this.mMerchantPrivateKey;
    }

    public U getOkHttpClient() {
        return this.okHttpClient;
    }

    public void init(Application application, @NonNull AdConfiguration config) {
        init(application, config.mApplicationId, config.mMerchantId, config.mMerchantPrivateKey, config.mCountryCode, config);
    }

    public boolean isUseDarkMode() {
        return this.useDarkMode;
    }

    public void setLanguage(String language) {
        this.mLanguage = language;
    }

    public void setUseDarkMode(boolean useDarkMode) {
        this.useDarkMode = useDarkMode;
    }

    private AdManager() {
        this.bUseRemoteWebView = false;
        this.latitude = 9999.0d;
        this.longitude = 9999.0d;
        this.useDarkMode = false;
        this.debug = false;
    }

    public void init(Application application, @NonNull String appId, @NonNull String merchantId, @NonNull String privateKey, @NonNull String countryCode, @NonNull AdConfiguration config) {
        this.mAdApp = application;
        this.mApplicationId = appId;
        this.mMerchantId = merchantId;
        this.mMerchantPrivateKey = privateKey;
        this.mCountryCode = countryCode;
        this.mAdConfiguration = config;
        this.mExtraId = config.mExtraId;
        if (!TextUtils.isEmpty(config.mExtraId)) {
            this.mExtraId = Base64.encodeToString(config.mExtraId.getBytes(StandardCharsets.UTF_8), 2);
        }
        this.mUserId = config.mUserId;
        this.mAppChannel = config.mAppChannel;
        this.mLanguage = config.mLanguage;
        this.mBaseUrl = config.mBaseUrl;
        this.mGaId = config.mGaId;
        this.bUseRemoteWebView = config.bUseRemoteWebView;
        this.mExtras = config.mExtras;
        this.useDarkMode = config.useDarkMode;
        this.debug = config.debug;
        this.executor = config.executor;
        this.httpDns = config.httpDns;
        this.okHttpClient = config.okHttpClient;
        initAnalysisManager(config);
    }

    public static void init(Application application, String appId, String userId, @NonNull String merchantId, @NonNull String privateKey, @NonNull String countryCode, String url, String appChannel, boolean mmkv) {
        AdConfiguration adConfiguration = new AdConfiguration();
        adConfiguration.setUrl(url);
        adConfiguration.setAppChannel(appChannel);
        adConfiguration.setUserId(userId);
        get().init(application, appId, merchantId, privateKey, countryCode, adConfiguration);
    }
}

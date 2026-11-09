package com.transsnet.palmpay.core.base;

import M7.s;
import Pa.AbstractC0514k;
import Pa.AbstractC0520q;
import Pa.C0515l;
import Pa.C0518o;
import Pa.T;
import Pa.r0;
import V0.C0684c;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import android.os.SystemClock;
import android.os.Trace;
import android.os.strictmode.Violation;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AbstractC0841t;
import androidx.core.util.Consumer;
import androidx.work.Configuration$Provider;
import com.alibaba.android.alpha.AlphaConfig;
import com.appsflyer.AppsFlyerProperties;
import com.facebook.soloader.SoLoader;
import com.palmpay.lib.apm.startup.AppStartupPerfTracker;
import com.tencent.mmkv.MMKV;
import com.transsnet.adsdk.AdManager;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.core.init.BaseInitTaskKt;
import com.transsnet.palmpay.core.init.FirebaseInitTask;
import com.transsnet.palmpay.core.init.LateInitProbe;
import com.transsnet.palmpay.custom_view.dialog.y;
import com.transsnet.palmpay.security.utils.SecurityUtils;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.AppUtils;
import com.transsnet.palmpay.util.DeviceUtils;
import com.transsnet.palmpay.util.Utils;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.S;
import okhttp3.U;

/* JADX INFO: loaded from: classes3.dex */
public class BaseApplication extends p381za.c implements Configuration$Provider {
    private static final String TAG = "BaseApplication";
    private static final String TAG_PROGRESS = "ProgressName";
    private static volatile BaseApplication instance;
    private static volatile String mChannel;
    private boolean bLateInit;
    private volatile File mCachedCacheDir;
    private volatile File mCachedExternalFilesDir;
    private volatile File mCachedFilesDir;
    private U mOkHttpClient;
    private volatile User mUser;
    private p156ka.a mUserDataSource;
    protected int versionCode;
    protected String versionName;
    private static final Consumer<Throwable> WORK_MANAGER_EXCEPTION_LOGGER = new g();
    private static final Object mChannelLock = new Object();
    private final String mCurrentCountryLocale = "NG";
    private final String mCurrentCurrency = "NGN";
    private final String mCurrentCurrencySymbol = "₦";
    private final Object mUserLock = new Object();
    private final Object mHttpClientLock = new Object();
    private String mToken = null;
    private final Object mLateInitLock = new Object();
    private Boolean bShowDebugWindow = null;
    private int currentModeType = 0;
    private Boolean isOldDevice = null;
    private final ConcurrentHashMap<String, File> mCachedExternalFilesDirByType = new ConcurrentHashMap<>();

    private void beginSection(String name) {
    }

    private U buildHttpClient() {
        S s3 = new S();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        s3.b(12L, timeUnit);
        s3.e(10L, timeUnit);
        s3.f40620f = true;
        s3.a(new p350xa.j());
        U u6 = new U(s3);
        y yVar = u6.f40653a;
        yVar.g(5);
        yVar.f(32);
        return u6;
    }

    private void endSection(String name) {
    }

    public static BaseApplication get() {
        return instance;
    }

    public static Application getApplication() {
        return instance;
    }

    public static String getChannel() {
        String str = mChannel;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        synchronized (mChannelLock) {
            try {
                if (!TextUtils.isEmpty(mChannel)) {
                    return mChannel;
                }
                String strH = Z4.e.h(getContext(), AppsFlyerProperties.CHANNEL);
                if (TextUtils.isEmpty(strH)) {
                    strH = "googleplay";
                }
                mChannel = strH;
                return mChannel;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Context getContext() {
        return instance.getApplicationContext();
    }

    @SuppressLint({"RestrictedApi"})
    public static String getCountryLocale() {
        Objects.requireNonNull(getInstance());
        return "NG";
    }

    @SuppressLint({"RestrictedApi"})
    public static String getCurrency() {
        Objects.requireNonNull(getInstance());
        return "NGN";
    }

    @SuppressLint({"RestrictedApi"})
    public static String getCurrencySymbol() {
        Objects.requireNonNull(getInstance());
        return "₦";
    }

    public static BaseApplication getInstance() {
        return instance;
    }

    private User getUserInternal() {
        try {
            return getUserDataSource().b();
        } catch (Exception e10) {
            F6.d.c(TAG, "getUser: ", e10);
            User user = new User();
            user.setMemberId(p367ya.a.d().i());
            return user;
        }
    }

    public static boolean hasLogin() {
        return !TextUtils.isEmpty(get().getToken());
    }

    private void initARouter() {
        String str = AbstractC0520q.f7135a;
        Thread.currentThread().getName();
        Ea.a.a(this);
    }

    private void initCountryConfiguration() {
        try {
            C0515l c0515l = AbstractC0514k.f7097a;
            c0515l.getClass();
            p367ya.a.d().f44149a.i("key_default_language", "NG");
            updateCountryConfig(c0515l.b("NG").code);
        } catch (Exception e10) {
            F6.d.c(TAG, "initCountryConfiguration: ", e10);
        }
    }

    private void initFirebase() {
        X6.c cVar = new X6.c(this, 13);
        Trace.beginSection("FirebaseInit");
        try {
            cVar.invoke();
        } finally {
            Trace.endSection();
        }
    }

    private void initMMKV() {
        try {
            MMKV.m(this);
        } catch (Throwable unused) {
            int i7 = Build.VERSION.SDK_INT;
            if (24 != i7 && 31 != i7 && 25 != i7) {
                MMKV.m(this);
                return;
            }
            MMKV.n(this, getFilesDir().getAbsolutePath() + "/mmkv", new com.google.firebase.crashlytics.internal.concurrency.b(this, 21));
        }
    }

    private void initNightMode() {
        if (!r0.T0()) {
            AbstractC0841t.k(1);
            return;
        }
        if (r0.V0()) {
            AbstractC0841t.k(-1);
        } else if (r0.Z0()) {
            AbstractC0841t.k(2);
        } else {
            AbstractC0841t.k(1);
        }
    }

    private void initWebview() {
        if (Build.VERSION.SDK_INT >= 28) {
            String processName = Application.getProcessName();
            if (getPackageName().equals(processName)) {
                return;
            }
            WebView.setDataDirectorySuffix(processName);
        }
    }

    public static boolean isAO() {
        return "AO".equalsIgnoreCase(getCountryLocale());
    }

    public static boolean isFirebaseInitialized() {
        return FirebaseInitTask.isReady();
    }

    public static boolean isNG() {
        return "NG".equalsIgnoreCase(getCountryLocale());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$initFirebase$0() {
        FirebaseInitTask.initFirebase(this);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$initMMKV$4(String str) {
        try {
            SoLoader.d(0, this);
            SoLoader.j(str);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$openStrictMode$2(Violation violation) {
        if (Build.VERSION.SDK_INT < 31 || !(com.facebook.react.uimanager.c.w(violation) || com.facebook.react.uimanager.a.t(violation))) {
            Log.e("StrictMode", "warning: ", violation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$scheduleInitTask$3(Runnable runnable, CountDownLatch countDownLatch) {
        try {
            runnable.run();
        } finally {
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }
    }

    private void lateInitWithAlpha() {
        startAlphaTaskManager(BaseInitTaskKt.GROUP_LATE_INIT);
    }

    private void openStrictMode() {
        StrictMode.ThreadPolicy.Builder builderDetectCustomSlowCalls = new StrictMode.ThreadPolicy.Builder().detectAll().detectCustomSlowCalls();
        if (Build.VERSION.SDK_INT >= 28) {
            builderDetectCustomSlowCalls.penaltyListener(T.b(-4), new f());
        }
        StrictMode.setThreadPolicy(builderDetectCustomSlowCalls.build());
        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().detectAll().penaltyLog().build());
    }

    private void relaunchHome() {
        try {
            ActivityUtils.finishAllActivities();
            if (AppUtils.isAppForeground()) {
                Intent intent = new Intent();
                intent.setClassName(AppUtils.getAppPackageName(), "com.transsnet.palmpay.ui.activity.HomeActivity");
                intent.addFlags(268435456);
                startActivity(intent);
            }
        } catch (Exception unused) {
        }
    }

    private void runLateInitNow(@NonNull String reason, @Nullable Activity activity) {
        synchronized (this.mLateInitLock) {
            if (!this.bLateInit && isFirebaseInitialized()) {
                this.bLateInit = true;
                beginSection("lateInit");
                LateInitProbe.markLateInitScheduled(reason);
                LateInitProbe.markLateInitStarted();
                U u6 = (U) p324va.d.f43142a.f18580b;
                if (u6 != null) {
                    y yVar = u6.f40653a;
                    yVar.f(48);
                    yVar.g(6);
                }
                lateInitWithAlpha();
                if (activity instanceof BaseActivity) {
                    ((BaseActivity) activity).armIdleGate();
                } else {
                    BaseActivity.armIdleGateDefault();
                }
                endSection("lateInit");
            }
        }
    }

    private void scheduleInitTask(final CountDownLatch latch, final Runnable runnable) {
        T.b(-4).execute(new com.flexibank.sdk.g(15, runnable, latch));
    }

    public static void updateCountryConfig(int countryCode) {
        AdManager.setCountryCode(getCountryLocale());
    }

    @NonNull
    private File warmCacheDirCache() {
        File file;
        File file2 = this.mCachedCacheDir;
        if (file2 != null) {
            return file2;
        }
        synchronized (this) {
            try {
                if (this.mCachedCacheDir == null) {
                    this.mCachedCacheDir = super.getCacheDir();
                }
                file = this.mCachedCacheDir;
            } catch (Throwable th) {
                throw th;
            }
        }
        return file;
    }

    @Nullable
    private File warmExternalFilesDirCache(@Nullable String type) {
        if (type == null) {
            File file = this.mCachedExternalFilesDir;
            if (file != null) {
                return file;
            }
            synchronized (this) {
                try {
                    if (this.mCachedExternalFilesDir != null) {
                        return this.mCachedExternalFilesDir;
                    }
                    File externalFilesDir = super.getExternalFilesDir(null);
                    if (externalFilesDir != null) {
                        this.mCachedExternalFilesDir = externalFilesDir;
                    }
                    return externalFilesDir;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        File file2 = this.mCachedExternalFilesDirByType.get(type);
        if (file2 != null) {
            return file2;
        }
        synchronized (this) {
            try {
                File file3 = this.mCachedExternalFilesDirByType.get(type);
                if (file3 != null) {
                    return file3;
                }
                File externalFilesDir2 = super.getExternalFilesDir(type);
                if (externalFilesDir2 != null) {
                    this.mCachedExternalFilesDirByType.put(type, externalFilesDir2);
                }
                return externalFilesDir2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    private File warmFilesDirCache() {
        File file;
        File file2 = this.mCachedFilesDir;
        if (file2 != null) {
            return file2;
        }
        synchronized (this) {
            try {
                if (this.mCachedFilesDir == null) {
                    this.mCachedFilesDir = super.getFilesDir();
                }
                file = this.mCachedFilesDir;
            } catch (Throwable th) {
                throw th;
            }
        }
        return file;
    }

    @Override // androidx.multidex.b, android.content.ContextWrapper
    public void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        warmFilesDirCache();
        warmCacheDirCache();
        warmExternalFilesDirCache(null);
        initWebview();
    }

    @Override // p381za.c
    public boolean canDispatchSystemMemoryCallbacks() {
        return !isPrimaryProcessCached() || isFirebaseInitialized();
    }

    public boolean checkShowDebugWindow() {
        return false;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public File getCacheDir() {
        File file = this.mCachedCacheDir;
        return file != null ? file : warmCacheDirCache();
    }

    public String getCodePushData() {
        return "";
    }

    @Override // android.content.ContextWrapper, android.content.Context
    @Nullable
    public File getExternalFilesDir(@Nullable String type) {
        if (type == null) {
            File file = this.mCachedExternalFilesDir;
            return file != null ? file : warmExternalFilesDirCache(null);
        }
        File file2 = this.mCachedExternalFilesDirByType.get(type);
        return file2 != null ? file2 : warmExternalFilesDirCache(type);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public File getFilesDir() {
        File file = this.mCachedFilesDir;
        return file != null ? file : warmFilesDirCache();
    }

    public U getHttpClient() {
        U u6;
        synchronized (this.mHttpClientLock) {
            try {
                if (this.mOkHttpClient == null) {
                    this.mOkHttpClient = buildHttpClient();
                }
                u6 = this.mOkHttpClient;
            } catch (Throwable th) {
                throw th;
            }
        }
        return u6;
    }

    public String getToken() {
        if (this.mToken == null) {
            this.mToken = p367ya.a.d().f44149a.getString("_token", "");
        }
        return this.mToken;
    }

    public User getUser() {
        return getUser(false);
    }

    public p156ka.a getUserDataSource() {
        p156ka.a aVar;
        synchronized (this.mUserLock) {
            try {
                if (this.mUserDataSource == null) {
                    this.mUserDataSource = new p156ka.a();
                }
                aVar = this.mUserDataSource;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public int getVersionCode() {
        return this.versionCode;
    }

    public String getVersionName() {
        return this.versionName;
    }

    @Override // androidx.work.Configuration$Provider
    @NonNull
    @SuppressLint({"RestrictedApi"})
    public C0684c getWorkManagerConfiguration() {
        F6.d.h(TAG, 3, "getWorkManagerConfiguration: ");
        try {
            p279s5.d dVar = new p279s5.d(13, false);
            Consumer<Throwable> schedulingExceptionHandler = WORK_MANAGER_EXCEPTION_LOGGER;
            Intrinsics.checkNotNullParameter(schedulingExceptionHandler, "exceptionHandler");
            dVar.f42025b = schedulingExceptionHandler;
            Intrinsics.checkNotNullParameter(schedulingExceptionHandler, "schedulingExceptionHandler");
            dVar.f42026c = schedulingExceptionHandler;
            return new C0684c(dVar);
        } catch (Throwable th) {
            F6.d.c(TAG, "getWorkManagerConfiguration failed, fallback to default Configuration", th);
            return new C0684c(new p279s5.d(13, false));
        }
    }

    public boolean isOldAndroidDevice() {
        Boolean bool = this.isOldDevice;
        if (bool != null) {
            return bool.booleanValue();
        }
        DeviceUtils.LEVEL deviceLevel = DeviceUtils.getDeviceLevel(this);
        if (deviceLevel == DeviceUtils.LEVEL.BAD || deviceLevel == DeviceUtils.LEVEL.LOW || deviceLevel == DeviceUtils.LEVEL.UN_KNOW) {
            this.isOldDevice = Boolean.TRUE;
            return true;
        }
        ActivityManager activityManager = (ActivityManager) getSystemService("activity");
        Boolean boolValueOf = Boolean.valueOf(activityManager != null && activityManager.isLowRamDevice());
        this.isOldDevice = boolValueOf;
        return boolValueOf.booleanValue();
    }

    public void lateInit() {
        lateInit(null);
    }

    @Override // p381za.c
    public void onPrimaryConfigurationChanged(@NonNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        int i7 = newConfig.uiMode & 48;
        if (this.currentModeType != i7) {
            this.currentModeType = i7;
            resetDarkMode();
        }
    }

    @Override // p381za.c
    public void onPrimaryCreate() {
        C0518o c0518o;
        Application application = androidx.camera.core.impl.utils.n.f14250b;
        if (application == null || !application.equals(this)) {
            androidx.camera.core.impl.utils.n.f14250b = this;
        }
        setInstance(this);
        synchronized (C0518o.class) {
            try {
                if (C0518o.f7127d == null) {
                    C0518o c0518o2 = new C0518o();
                    T.b(-4).execute(new s(c0518o2, 8));
                    C0518o.f7127d = c0518o2;
                }
                c0518o = C0518o.f7127d;
            } catch (Throwable th) {
                throw th;
            }
        }
        c0518o.f7129b = this;
        c0518o.f7128a = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(c0518o);
        p267r9.a.f41645a.f4463a = getApplicationContext();
        p183m6.n.f39523a.setContext(this);
        initMMKV();
        String str = AbstractC0520q.f7135a;
        if (Process.is64Bit() && p059e1.a.C("key_render_anr_patch", false)) {
            String[][] strArr = {new String[]{"TECNO", "TECNO KL5"}, new String[]{"TECNO", "TECNO KJ5"}, new String[]{"Infinix", "Infinix X6531B"}, new String[]{"Infinix", "Infinix X6532"}, new String[]{"Infinix", "Infinix X6532C"}, new String[]{"Infinix", "Infinix X6531"}, new String[]{"redmi", "2409BRN2CG"}};
            for (int i7 = 0; i7 < 7; i7++) {
                String[] strArr2 = strArr[i7];
                if (strArr2[0].equalsIgnoreCase(AbstractC0520q.f7135a) && strArr2[1].equalsIgnoreCase(AbstractC0520q.f7136b)) {
                    SecurityUtils.d();
                    break;
                }
            }
        }
        Utils.init((Application) this);
        initNightMode();
        initARouter();
        if (AbstractC0520q.a()) {
            Log.e(TAG, "initFirebase in main thread");
            FirebaseInitTask.INSTANCE.initFirebase(this, true);
            AppStartupPerfTracker.onFirebaseReady();
        }
        AlphaConfig.setExecutorService(T.b(-4));
        startAlphaTaskManager(null);
        this.currentModeType = r0.J0(getResources());
    }

    @Override // p381za.c
    public void onSecondaryCreate(@NonNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        F6.d.h(TAG_PROGRESS, 3, "onSecondaryCreate: ".concat(name));
        if (name.equals(":pp_push")) {
            beginSection("pp_pushInit");
            setInstance(this);
            p267r9.a.f41645a.f4463a = getApplicationContext();
            Utils.init((Application) this);
            initMMKV();
            initFirebase();
            endSection("pp_pushInit");
            F6.d.h(TAG, 3, "onSecondaryCreate: " + (SystemClock.elapsedRealtime() - Process.getStartElapsedRealtime()));
        } else if (name.equals(":crash")) {
            setInstance(this);
            p267r9.a.f41645a.f4463a = getApplicationContext();
            Utils.init((Application) this);
            return;
        }
        AdManager.configAdWebView(this);
    }

    @Override // android.app.Application
    public void onTerminate() {
        super.onTerminate();
    }

    public void resetDarkMode() {
        boolean zZ0;
        initNightMode();
        if (r0.T0()) {
            if (r0.V0()) {
                zZ0 = r0.J0(getResources()) == 32;
            } else {
                zZ0 = r0.Z0();
            }
            AdManager.get().setUseDarkMode(zZ0);
            relaunchHome();
        }
    }

    public void setInstance(BaseApplication application) {
        instance = application;
    }

    public void setToken(final String token) {
        p367ya.a.d().f44149a.i("_token", token);
        this.mToken = token;
    }

    public void showDebugWindow(boolean show) {
    }

    public void startAlphaTaskManager(String group) {
    }

    public static void updateCountryConfig(String countryLocale) {
        AdManager.setCountryCode(getCountryLocale());
    }

    public User getUser(boolean update) {
        User user;
        User user2;
        if (!update && (user2 = this.mUser) != null) {
            return user2;
        }
        synchronized (this.mUserLock) {
            if (update) {
                this.mUser = getUserInternal();
            } else {
                try {
                    if (this.mUser == null) {
                        this.mUser = getUserInternal();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            user = this.mUser;
        }
        return user;
    }

    public void lateInit(@Nullable Activity activity) {
        runLateInitNow(activity != null ? "post_resume:".concat(activity.getClass().getName()) : "no_activity", activity);
    }
}

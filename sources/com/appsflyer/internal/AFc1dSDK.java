package com.appsflyer.internal;

import E.RejectedExecutionHandlerC0207l;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import com.didiglobal.booster.instrument.ShadowThread;
import com.didiglobal.booster.instrument.ShadowThreadPoolExecutor;
import java.lang.reflect.Constructor;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1dSDK implements AFd1zSDK {
    private static final int getRevenue = (int) TimeUnit.SECONDS.toMillis(30);
    private AFf1jSDK AFInAppEventParameterName;
    private AFc1uSDK AFInAppEventType;
    private AFe1vSDK AFKeystoreWrapper;
    private AFj1rSDK AFLogger;
    private AFg1zSDK AFLoggerLogLevel;
    private AFg1wSDK afDebugLog;
    private AFa1bSDK afErrorLog;

    @Nullable
    private AFi1nSDK afErrorLogForExcManagerOnly;
    private AFi1rSDK afInfoLog;
    private AFh1ySDK afRDLog;
    private AFf1eSDK afVerboseLog;
    private AFh1uSDK afWarnLog;
    private AFf1pSDK areAllFieldsValid;
    private AFc1jSDK component1;
    private PurchaseHandler component2;
    private AFc1pSDK component3;
    private AFd1lSDK component4;
    private AFh1wSDK copy;
    private AFe1tSDK copydefault;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AFi1wSDK f20383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AFg1xSDK f20384e;
    private AFd1oSDK equals;
    private AFa1mSDK force;
    private ScheduledExecutorService getCurrencyIso4217Code;
    private AFc1fSDK getLevel;
    private ExecutorService getMediationNetwork;
    private ExecutorService getMonetizationNetwork;
    private AFj1pSDK hashCode;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private AFb1aSDK f20385i;
    private AFd1uSDK registerClient;
    private AFg1vSDK toString;
    private AFi1lSDK unregisterClient;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private AFa1hSDK f20386v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private AFj1iSDK f20387w;
    private String afLogForce = null;
    public final AFc1eSDK AFAdRevenueData = new AFc1eSDK();

    public static class AFa1zSDK implements ThreadFactory {
        private static final AtomicInteger getCurrencyIso4217Code = new AtomicInteger();
        private final AtomicInteger AFAdRevenueData = new AtomicInteger();

        public AFa1zSDK() {
            getCurrencyIso4217Code.incrementAndGet();
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            int i7 = getCurrencyIso4217Code.get();
            int iIncrementAndGet = this.AFAdRevenueData.incrementAndGet();
            StringBuilder sb2 = new StringBuilder("queue-");
            sb2.append(i7);
            sb2.append("-");
            sb2.append(iIncrementAndGet);
            return new ShadowThread(runnable, sb2.toString(), "\u200bcom.appsflyer.internal.AFc1dSDK$AFa1zSDK");
        }
    }

    @NonNull
    private synchronized ScheduledExecutorService AFLoggerLogLevel() {
        try {
            if (this.getCurrencyIso4217Code == null) {
                this.getCurrencyIso4217Code = AFc1kSDK.AFAdRevenueData();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.getCurrencyIso4217Code;
    }

    @NonNull
    private synchronized AFg1zSDK AFPurchaseDetails() {
        try {
            if (this.AFLoggerLogLevel == null) {
                this.AFLoggerLogLevel = new AFg1zSDK(AFInAppEventParameterName(), getMonetizationNetwork());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.AFLoggerLogLevel;
    }

    @NonNull
    private String afRDLog() {
        if (this.afLogForce == null) {
            this.afLogForce = new AFa1tSDK().AFAdRevenueData();
        }
        return this.afLogForce;
    }

    @NonNull
    private synchronized AFd1lSDK afVerboseLog() {
        try {
            if (this.component4 == null) {
                this.component4 = new AFd1lSDK(new AFd1iSDK(getRevenue), AFAdRevenueData());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.component4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    /* JADX INFO: renamed from: getLevel, reason: merged with bridge method [inline-methods] */
    public synchronized AFd1uSDK afLogForce() {
        try {
            if (this.registerClient == null) {
                this.registerClient = new AFd1uSDK(this);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.registerClient;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ SharedPreferences o_() {
        Context context = this.AFAdRevenueData.getRevenue;
        if (context != null) {
            return AFa1uSDK.d_(context);
        }
        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
    }

    @NonNull
    private synchronized ExecutorService valueOf() {
        try {
            if (this.getMonetizationNetwork == null) {
                this.getMonetizationNetwork = AFc1kSDK.getCurrencyIso4217Code();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.getMonetizationNetwork;
    }

    @NonNull
    private synchronized AFj1iSDK values() {
        try {
            if (this.f20387w == null) {
                this.f20387w = new AFj1iSDK(getMonetizationNetwork());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f20387w;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final synchronized ExecutorService AFAdRevenueData() {
        try {
            if (this.getMediationNetwork == null) {
                this.getMediationNetwork = AFc1kSDK.getMediationNetwork();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.getMediationNetwork;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final synchronized AFc1eSDK AFInAppEventParameterName() {
        return this.AFAdRevenueData;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final synchronized AFf1jSDK AFInAppEventType() {
        try {
            if (this.AFInAppEventParameterName == null) {
                this.AFInAppEventParameterName = new AFf1jSDK(AFInAppEventParameterName());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.AFInAppEventParameterName;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final synchronized AFe1vSDK AFKeystoreWrapper() {
        try {
            if (this.AFKeystoreWrapper == null) {
                this.AFKeystoreWrapper = new AFe1vSDK(getMonetizationNetwork(), getRevenue());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.AFKeystoreWrapper;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final synchronized AFc1uSDK AFLogger() {
        try {
            if (this.AFInAppEventType == null) {
                this.AFInAppEventType = new AFc1rSDK(AFInAppEventParameterName(), getRevenue());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.AFInAppEventType;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final AFf1eSDK afDebugLog() {
        if (this.afVerboseLog == null) {
            Context context = this.AFAdRevenueData.getRevenue;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            AFf1gSDK aFf1gSDK = new AFf1gSDK(context, AppsFlyerProperties.getInstance());
            if (this.getLevel == null) {
                this.getLevel = new AFc1fSDK();
            }
            this.afVerboseLog = new AFf1dSDK(aFf1gSDK, this.getLevel, AppsFlyerProperties.getInstance());
        }
        return this.afVerboseLog;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final AFh1ySDK afErrorLog() {
        if (this.afRDLog == null) {
            this.afRDLog = new AFh1zSDK(this);
        }
        return this.afRDLog;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @Nullable
    public final AFh1uSDK afErrorLogForExcManagerOnly() {
        if (AFh1tSDK.getCurrencyIso4217Code() && this.afWarnLog == null) {
            this.afWarnLog = new AFh1vSDK(getMonetizationNetwork(), equals());
        }
        return this.afWarnLog;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final AFa1hSDK afInfoLog() {
        if (this.f20386v == null) {
            this.f20386v = new AFa1lSDK(getRevenue());
        }
        return this.f20386v;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final AFb1gSDK afWarnLog() {
        if (this.getLevel == null) {
            this.getLevel = new AFc1fSDK();
        }
        return new AFb1cSDK(this.getLevel, AFInAppEventParameterName(), AFInAppEventType());
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final synchronized PurchaseHandler areAllFieldsValid() {
        try {
            if (this.component2 == null) {
                this.component2 = new PurchaseHandler(this);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.component2;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final AFj1pSDK component1() {
        if (this.hashCode == null) {
            Context context = this.AFAdRevenueData.getRevenue;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            this.hashCode = new AFj1nSDK(context, valueOf());
        }
        return this.hashCode;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final synchronized AFh1wSDK component2() {
        try {
            if (this.copy == null) {
                this.copy = new AFh1wSDK(getRevenue(), getMonetizationNetwork());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.copy;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final AFg1vSDK component3() {
        if (this.toString == null) {
            String strAfRDLog = afRDLog();
            Context context = this.AFAdRevenueData.getRevenue;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            if (this.unregisterClient == null) {
                this.unregisterClient = new AFi1kSDK();
            }
            AFi1lSDK aFi1lSDK = this.unregisterClient;
            if (this.f20384e == null) {
                this.f20384e = new AFg1sSDK();
            }
            AFg1xSDK aFg1xSDK = this.f20384e;
            if (this.hashCode == null) {
                Context context2 = this.AFAdRevenueData.getRevenue;
                if (context2 == null) {
                    throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                }
                this.hashCode = new AFj1nSDK(context2, valueOf());
            }
            AFj1pSDK aFj1pSDK = this.hashCode;
            if (this.afDebugLog == null) {
                this.afDebugLog = new AFg1uSDK();
            }
            AFg1wSDK aFg1wSDK = this.afDebugLog;
            AFh1wSDK aFh1wSDKComponent2 = component2();
            AFc1qSDK revenue = getRevenue();
            AFc1pSDK monetizationNetwork = getMonetizationNetwork();
            if (this.f20383d == null) {
                Context context3 = this.AFAdRevenueData.getRevenue;
                if (context3 == null) {
                    throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                }
                this.f20383d = new AFi1wSDK(context3);
            }
            AFi1wSDK aFi1wSDK = this.f20383d;
            AFf1jSDK aFf1jSDKAFInAppEventType = AFInAppEventType();
            AFc1eSDK aFc1eSDKAFInAppEventParameterName = AFInAppEventParameterName();
            AFg1zSDK aFg1zSDKAFPurchaseDetails = AFPurchaseDetails();
            if (this.getLevel == null) {
                this.getLevel = new AFc1fSDK();
            }
            this.toString = new AFg1tSDK(strAfRDLog, context, aFi1lSDK, aFg1xSDK, aFj1pSDK, aFg1wSDK, aFh1wSDKComponent2, revenue, monetizationNetwork, aFi1wSDK, aFf1jSDKAFInAppEventType, aFc1eSDKAFInAppEventParameterName, aFg1zSDKAFPurchaseDetails, this.getLevel);
        }
        return this.toString;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final synchronized AFf1pSDK component4() {
        try {
            if (this.areAllFieldsValid == null) {
                AFf1qSDK aFf1qSDK = new AFf1qSDK(getRevenue());
                AFc1pSDK monetizationNetwork = getMonetizationNetwork();
                if (this.getLevel == null) {
                    this.getLevel = new AFc1fSDK();
                }
                AFf1nSDK aFf1nSDK = new AFf1nSDK(monetizationNetwork, aFf1qSDK, this.getLevel);
                AFf1oSDK aFf1oSDK = new AFf1oSDK();
                AFc1pSDK monetizationNetwork2 = getMonetizationNetwork();
                AFf1jSDK aFf1jSDKAFInAppEventType = AFInAppEventType();
                AFd1kSDK aFd1kSDK = new AFd1kSDK(afVerboseLog(), getMonetizationNetwork(), AppsFlyerProperties.getInstance(), AFKeystoreWrapper(), values(), AFInAppEventType());
                AFe1tSDK aFe1tSDKCopydefault = copydefault();
                if (this.getLevel == null) {
                    this.getLevel = new AFc1fSDK();
                }
                this.areAllFieldsValid = new AFf1pSDK(aFf1oSDK, monetizationNetwork2, aFf1jSDKAFInAppEventType, aFf1qSDK, aFd1kSDK, aFf1nSDK, aFe1tSDKCopydefault, this.getLevel);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.areAllFieldsValid;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final synchronized AFd1oSDK copy() {
        try {
            if (this.equals == null) {
                this.equals = new AFd1mSDK(this);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.equals;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final synchronized AFe1tSDK copydefault() {
        try {
            if (this.copydefault == null) {
                ShadowThreadPoolExecutor shadowThreadPoolExecutor = new ShadowThreadPoolExecutor(2, 6, 60L, TimeUnit.SECONDS, (BlockingQueue<Runnable>) new LinkedBlockingQueue<Runnable>() { // from class: com.appsflyer.internal.AFc1dSDK.3
                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
                    /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
                    public boolean offer(Runnable runnable) {
                        if (isEmpty()) {
                            return super.offer(runnable);
                        }
                        return false;
                    }
                }, (ThreadFactory) new AFa1zSDK(), "\u200bcom.appsflyer.internal.AFc1dSDK", true);
                shadowThreadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandlerC0207l(1));
                this.copydefault = new AFe1tSDK(shadowThreadPoolExecutor);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.copydefault;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final AFi1rSDK d() {
        if (this.afInfoLog == null) {
            this.afInfoLog = new AFi1mSDK();
        }
        return this.afInfoLog;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final synchronized AFa1mSDK e() {
        try {
            if (this.force == null) {
                this.force = new AFa1mSDK(this);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.force;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final synchronized AFj1rSDK equals() {
        try {
            if (this.AFLogger == null) {
                this.AFLogger = new AFj1rSDK(this);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.AFLogger;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final AFb1aSDK force() {
        if (this.f20385i == null) {
            ScheduledExecutorService scheduledExecutorServiceAFLoggerLogLevel = AFLoggerLogLevel();
            AFa1mSDK aFa1mSDKE = e();
            if (this.afInfoLog == null) {
                this.afInfoLog = new AFi1mSDK();
            }
            this.f20385i = new AFb1bSDK(scheduledExecutorServiceAFLoggerLogLevel, aFa1mSDKE, this.afInfoLog);
        }
        return this.f20385i;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final AFd1kSDK getCurrencyIso4217Code() {
        return new AFd1kSDK(afVerboseLog(), getMonetizationNetwork(), AppsFlyerProperties.getInstance(), AFKeystoreWrapper(), values(), AFInAppEventType());
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final synchronized ScheduledExecutorService getMediationNetwork() {
        try {
            if (this.getCurrencyIso4217Code == null) {
                this.getCurrencyIso4217Code = AFc1kSDK.getMonetizationNetwork();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.getCurrencyIso4217Code;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final synchronized AFc1pSDK getMonetizationNetwork() {
        try {
            if (this.component3 == null) {
                AFc1eSDK aFc1eSDKAFInAppEventParameterName = AFInAppEventParameterName();
                AFc1qSDK revenue = getRevenue();
                if (this.getLevel == null) {
                    this.getLevel = new AFc1fSDK();
                }
                this.component3 = new AFc1pSDK(aFc1eSDKAFInAppEventParameterName, revenue, this.getLevel, AFAdRevenueData());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.component3;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final AFc1qSDK getRevenue() {
        if (this.component1 == null) {
            this.component1 = new AFc1jSDK(new AFc1gSDK(new d(this, 1)));
        }
        return this.component1;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final AFc1fSDK i() {
        if (this.getLevel == null) {
            this.getLevel = new AFc1fSDK();
        }
        return this.getLevel;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final AFi1lSDK registerClient() {
        if (this.unregisterClient == null) {
            this.unregisterClient = new AFi1kSDK();
        }
        return this.unregisterClient;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final synchronized AFa1bSDK unregisterClient() {
        try {
            if (this.afErrorLog == null) {
                this.afErrorLog = new AFa1aSDK(AFInAppEventParameterName());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.afErrorLog;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @Nullable
    @WorkerThread
    public final AFi1nSDK v() {
        try {
            if (this.afErrorLogForExcManagerOnly == null) {
                try {
                    Object[] objArr = {getMonetizationNetwork(), AFInAppEventParameterName()};
                    Map map = AFi1iSDK.f20402w;
                    Object declaredConstructor = map.get(-2048809382);
                    if (declaredConstructor == null) {
                        declaredConstructor = ((Class) AFi1iSDK.AFAdRevenueData(37 - TextUtils.getTrimmedLength(""), (-1) - Process.getGidForName(""), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16))).getDeclaredConstructor(AFc1pSDK.class, AFc1eSDK.class);
                        map.put(-2048809382, declaredConstructor);
                    }
                    this.afErrorLogForExcManagerOnly = (AFi1nSDK) ((Constructor) declaredConstructor).newInstance(objArr);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1cSDK.PLAY_INTEGRITY_API, th2.getMessage() != null ? th2.getMessage() : "", th2, false, false);
        }
        return this.afErrorLogForExcManagerOnly;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final AFi1wSDK w() {
        if (this.f20383d == null) {
            Context context = this.AFAdRevenueData.getRevenue;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            this.f20383d = new AFi1wSDK(context);
        }
        return this.f20383d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void getMediationNetwork(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        try {
            threadPoolExecutor.getQueue().put(runnable);
        } catch (InterruptedException e10) {
            AFLogger.afErrorLogForExcManagerOnly("could not create executor for queue", e10);
            Thread.currentThread().interrupt();
        }
    }
}

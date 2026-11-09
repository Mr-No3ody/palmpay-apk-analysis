package com.alibaba.android.alpha;

import E.ThreadFactoryC0208m;
import android.content.Context;
import com.didiglobal.booster.instrument.ShadowThreadPoolExecutor;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class AlphaConfig {
    private static Context sContext = null;
    private static ExecutorService sExecutor = null;
    private static boolean sIsLoggable = true;
    private static ThreadFactory sThreadFactory;
    private static int sCoreThreadNum = Runtime.getRuntime().availableProcessors();
    private static int sWarningTime = 400;
    private static boolean sShowToastToAlarm = false;

    public static Context getContext() {
        return sContext;
    }

    private static ExecutorService getDefaultExecutor() {
        int i7 = sCoreThreadNum;
        ShadowThreadPoolExecutor shadowThreadPoolExecutor = new ShadowThreadPoolExecutor(i7, i7, 60L, TimeUnit.SECONDS, (BlockingQueue<Runnable>) new LinkedBlockingQueue(), getThreadFactory(), "\u200bcom.alibaba.android.alpha.AlphaConfig", true);
        shadowThreadPoolExecutor.allowCoreThreadTimeOut(true);
        return shadowThreadPoolExecutor;
    }

    private static ThreadFactory getDefaultThreadFactory() {
        return new ThreadFactoryC0208m(2);
    }

    public static ExecutorService getExecutor() {
        if (sExecutor == null) {
            sExecutor = getDefaultExecutor();
        }
        return sExecutor;
    }

    public static ThreadFactory getThreadFactory() {
        if (sThreadFactory == null) {
            sThreadFactory = getDefaultThreadFactory();
        }
        return sThreadFactory;
    }

    public static int getWarmingTime() {
        return sWarningTime;
    }

    public static boolean isLoggable() {
        return sIsLoggable;
    }

    public static void setCoreThreadNum(int i7) {
        sCoreThreadNum = i7;
    }

    public static void setExecutorService(ExecutorService executorService) {
        sExecutor = executorService;
    }

    public static void setLoggable(boolean z3) {
        sIsLoggable = z3;
    }

    public static void setShowToastToAlarm(Context context, boolean z3) {
        sContext = context;
        sShowToastToAlarm = z3;
    }

    public static void setThreadFactory(ThreadFactory threadFactory) {
        sThreadFactory = threadFactory;
    }

    public static void setWarningTime(int i7) {
        sWarningTime = i7;
    }

    public static boolean shouldShowToastToAlarm() {
        return sShowToastToAlarm;
    }
}

package com.google.android.gms.common.internal;

import com.didiglobal.booster.instrument.ShadowThreadPoolExecutor;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class zzi {
    static final ExecutorService zza;

    static {
        com.google.android.gms.internal.common.zzf.zza();
        ShadowThreadPoolExecutor shadowThreadPoolExecutor = new ShadowThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, (BlockingQueue<Runnable>) new LinkedBlockingQueue(), (ThreadFactory) new NamedThreadFactory("CallbackExecutor"), "\u200bcom.google.android.gms.common.internal.zzi", true);
        shadowThreadPoolExecutor.allowCoreThreadTimeOut(true);
        zza = Executors.unconfigurableExecutorService(shadowThreadPoolExecutor);
    }
}

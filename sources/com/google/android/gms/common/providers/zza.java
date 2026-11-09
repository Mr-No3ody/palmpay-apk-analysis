package com.google.android.gms.common.providers;

import com.didiglobal.booster.instrument.ShadowExecutors;
import com.google.android.gms.internal.common.zzf;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
final class zza implements PooledExecutorsProvider.PooledExecutorFactory {
    @Override // com.google.android.gms.common.providers.PooledExecutorsProvider.PooledExecutorFactory
    public final ScheduledExecutorService newSingleThreadScheduledExecutor() {
        zzf.zza();
        return Executors.unconfigurableScheduledExecutorService(ShadowExecutors.newOptimizedScheduledThreadPool(1, "\u200bcom.google.android.gms.common.providers.zza"));
    }
}

package com.google.android.gms.internal.base;

import com.didiglobal.booster.instrument.ShadowExecutors;
import com.didiglobal.booster.instrument.ShadowThreadPoolExecutor;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class zam implements zal {
    private zam() {
        throw null;
    }

    @Override // com.google.android.gms.internal.base.zal
    public final ExecutorService zaa(int i7, int i10) {
        return zab(4, ShadowExecutors.defaultThreadFactory("\u200bcom.google.android.gms.internal.base.zam"), 2);
    }

    @Override // com.google.android.gms.internal.base.zal
    public final ExecutorService zab(int i7, ThreadFactory threadFactory, int i10) {
        ShadowThreadPoolExecutor shadowThreadPoolExecutor = new ShadowThreadPoolExecutor(i7, i7, 60L, TimeUnit.SECONDS, (BlockingQueue<Runnable>) new LinkedBlockingQueue(), threadFactory, "\u200bcom.google.android.gms.internal.base.zam", true);
        shadowThreadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(shadowThreadPoolExecutor);
    }

    @Override // com.google.android.gms.internal.base.zal
    public final ExecutorService zac(ThreadFactory threadFactory, int i7) {
        return zab(1, threadFactory, 1);
    }

    public /* synthetic */ zam(byte[] bArr) {
    }
}

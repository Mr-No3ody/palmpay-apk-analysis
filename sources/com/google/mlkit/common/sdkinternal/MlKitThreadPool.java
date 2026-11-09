package com.google.mlkit.common.sdkinternal;

import androidx.annotation.NonNull;
import com.didiglobal.booster.instrument.ShadowExecutors;
import com.didiglobal.booster.instrument.ShadowThreadPoolExecutor;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_common.zzbe;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public class MlKitThreadPool extends zzbe {
    private static final ThreadLocal zza = new ThreadLocal();
    private final ThreadPoolExecutor zzb;

    public MlKitThreadPool() {
        final ThreadFactory threadFactoryDefaultThreadFactory = ShadowExecutors.defaultThreadFactory("\u200bcom.google.mlkit.common.sdkinternal.MlKitThreadPool");
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        ShadowThreadPoolExecutor shadowThreadPoolExecutor = new ShadowThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 60L, TimeUnit.SECONDS, (BlockingQueue<Runnable>) new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.google.mlkit.common.sdkinternal.zzj
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(final Runnable runnable) {
                return threadFactoryDefaultThreadFactory.newThread(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.zzi
                    @Override // java.lang.Runnable
                    public final void run() {
                        MlKitThreadPool.zzd(runnable);
                    }
                });
            }
        }, "\u200bcom.google.mlkit.common.sdkinternal.MlKitThreadPool", true);
        this.zzb = shadowThreadPoolExecutor;
        shadowThreadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static /* synthetic */ void zzd(Runnable runnable) {
        zza.set(new ArrayDeque());
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zze(Deque deque, Runnable runnable) {
        Preconditions.checkNotNull(deque);
        deque.add(runnable);
        if (deque.size() <= 1) {
            do {
                runnable.run();
                deque.removeFirst();
                runnable = (Runnable) deque.peekFirst();
            } while (runnable != null);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbe, java.util.concurrent.Executor
    public final void execute(@NonNull final Runnable runnable) {
        Deque deque = (Deque) zza.get();
        if (deque == null || deque.size() > 1) {
            this.zzb.execute(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.zzk
                @Override // java.lang.Runnable
                public final void run() {
                    MlKitThreadPool.zze((Deque) MlKitThreadPool.zza.get(), runnable);
                }
            });
        } else {
            zze(deque, runnable);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbe, com.google.android.gms.internal.mlkit_common.zzag
    @NonNull
    public final /* synthetic */ Object zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbe
    @NonNull
    public final ExecutorService zzb() {
        return this.zzb;
    }
}

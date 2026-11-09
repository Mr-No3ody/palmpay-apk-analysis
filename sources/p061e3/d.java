package p061e3;

import com.didiglobal.booster.instrument.ShadowExecutors;
import com.facebook.imagepipeline.core.ExecutorSupplier;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d implements ExecutorSupplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f36001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f36002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExecutorService f36003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ExecutorService f36004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ScheduledExecutorService f36005e;

    static {
        new c(null);
    }

    public d(int i7) {
        ExecutorService executorServiceNewOptimizedFixedThreadPool = ShadowExecutors.newOptimizedFixedThreadPool(2, new t("FrescoIoBoundExecutor"), "\u200bcom.facebook.imagepipeline.core.DefaultExecutorSupplier");
        Intrinsics.checkNotNullExpressionValue(executorServiceNewOptimizedFixedThreadPool, "newFixedThreadPool(...)");
        this.f36001a = executorServiceNewOptimizedFixedThreadPool;
        ExecutorService executorServiceNewOptimizedFixedThreadPool2 = ShadowExecutors.newOptimizedFixedThreadPool(i7, new t("FrescoDecodeExecutor"), "\u200bcom.facebook.imagepipeline.core.DefaultExecutorSupplier");
        Intrinsics.checkNotNullExpressionValue(executorServiceNewOptimizedFixedThreadPool2, "newFixedThreadPool(...)");
        this.f36002b = executorServiceNewOptimizedFixedThreadPool2;
        ExecutorService executorServiceNewOptimizedFixedThreadPool3 = ShadowExecutors.newOptimizedFixedThreadPool(i7, new t("FrescoBackgroundExecutor"), "\u200bcom.facebook.imagepipeline.core.DefaultExecutorSupplier");
        Intrinsics.checkNotNullExpressionValue(executorServiceNewOptimizedFixedThreadPool3, "newFixedThreadPool(...)");
        this.f36003c = executorServiceNewOptimizedFixedThreadPool3;
        ExecutorService executorServiceNewOptimizedFixedThreadPool4 = ShadowExecutors.newOptimizedFixedThreadPool(1, new t("FrescoLightWeightBackgroundExecutor"), "\u200bcom.facebook.imagepipeline.core.DefaultExecutorSupplier");
        Intrinsics.checkNotNullExpressionValue(executorServiceNewOptimizedFixedThreadPool4, "newFixedThreadPool(...)");
        this.f36004d = executorServiceNewOptimizedFixedThreadPool4;
        ScheduledExecutorService scheduledExecutorServiceNewOptimizedScheduledThreadPool = ShadowExecutors.newOptimizedScheduledThreadPool(i7, new t("FrescoBackgroundExecutor"), "\u200bcom.facebook.imagepipeline.core.DefaultExecutorSupplier");
        Intrinsics.checkNotNullExpressionValue(scheduledExecutorServiceNewOptimizedScheduledThreadPool, "newScheduledThreadPool(...)");
        this.f36005e = scheduledExecutorServiceNewOptimizedScheduledThreadPool;
    }

    @Override // com.facebook.imagepipeline.core.ExecutorSupplier
    public final Executor forBackgroundTasks() {
        return this.f36003c;
    }

    @Override // com.facebook.imagepipeline.core.ExecutorSupplier
    public final Executor forDecode() {
        return this.f36002b;
    }

    @Override // com.facebook.imagepipeline.core.ExecutorSupplier
    public final Executor forLightweightBackgroundTasks() {
        return this.f36004d;
    }

    @Override // com.facebook.imagepipeline.core.ExecutorSupplier
    public final Executor forLocalStorageRead() {
        return this.f36001a;
    }

    @Override // com.facebook.imagepipeline.core.ExecutorSupplier
    public final Executor forLocalStorageWrite() {
        return this.f36001a;
    }

    @Override // com.facebook.imagepipeline.core.ExecutorSupplier
    public final Executor forThumbnailProducer() {
        return this.f36001a;
    }

    @Override // com.facebook.imagepipeline.core.ExecutorSupplier
    public final ScheduledExecutorService scheduledExecutorServiceForBackgroundTasks() {
        return this.f36005e;
    }
}

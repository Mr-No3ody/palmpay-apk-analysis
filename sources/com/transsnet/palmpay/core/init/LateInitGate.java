package com.transsnet.palmpay.core.init;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u000e\u001a\u00020\u000bH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/transsnet/palmpay/core/init/LateInitGate;", "", "<init>", "()V", "AWAIT_TIMEOUT_SECONDS", "", "released", "Ljava/util/concurrent/atomic/AtomicBoolean;", "latch", "Ljava/util/concurrent/CountDownLatch;", "release", "", "reason", "", "await", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LateInitGate {
    private static final long AWAIT_TIMEOUT_SECONDS = 10;

    @NotNull
    public static final LateInitGate INSTANCE = new LateInitGate();

    @NotNull
    private static final AtomicBoolean released = new AtomicBoolean(false);

    @NotNull
    private static final CountDownLatch latch = new CountDownLatch(1);

    private LateInitGate() {
    }

    @JvmStatic
    public static final void await() {
        if (released.get()) {
            return;
        }
        try {
            if (latch.await(AWAIT_TIMEOUT_SECONDS, TimeUnit.SECONDS)) {
                return;
            }
            release("timeout_10s");
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @JvmStatic
    public static final void release(@NotNull String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        if (released.compareAndSet(false, true)) {
            LateInitProbe.markIdleGateReleased(reason);
            latch.countDown();
        }
    }
}

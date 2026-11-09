package Pg;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public class F {

    @NotNull
    public static final E Companion = new E(null);

    @JvmField
    @NotNull
    public static final F NONE = new D();
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    public final void awaitSignal(@NotNull Condition condition) throws InterruptedIOException {
        Intrinsics.checkNotNullParameter(condition, "condition");
        try {
            boolean zHasDeadline = hasDeadline();
            long jTimeoutNanos = timeoutNanos();
            long jNanoTime = 0;
            if (!zHasDeadline && jTimeoutNanos == 0) {
                condition.await();
                return;
            }
            long jNanoTime2 = System.nanoTime();
            if (zHasDeadline && jTimeoutNanos != 0) {
                jTimeoutNanos = Math.min(jTimeoutNanos, deadlineNanoTime() - jNanoTime2);
            } else if (zHasDeadline) {
                jTimeoutNanos = deadlineNanoTime() - jNanoTime2;
            }
            if (jTimeoutNanos > 0) {
                condition.await(jTimeoutNanos, TimeUnit.NANOSECONDS);
                jNanoTime = System.nanoTime() - jNanoTime2;
            }
            if (jNanoTime >= jTimeoutNanos) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    @NotNull
    public F clearDeadline() {
        this.hasDeadline = false;
        return this;
    }

    @NotNull
    public F clearTimeout() {
        this.timeoutNanos = 0L;
        return this;
    }

    @NotNull
    public final F deadline(long j6, @NotNull TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j6 <= 0) {
            throw new IllegalArgumentException(androidx.camera.video.u.i(j6, "duration <= 0: ").toString());
        }
        return deadlineNanoTime(unit.toNanos(j6) + System.nanoTime());
    }

    public long deadlineNanoTime() {
        if (this.hasDeadline) {
            return this.deadlineNanoTime;
        }
        throw new IllegalStateException("No deadline");
    }

    public boolean hasDeadline() {
        return this.hasDeadline;
    }

    public final <T> T intersectWith(@NotNull F other, @NotNull Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(block, "block");
        long jTimeoutNanos = timeoutNanos();
        timeout(Companion.minTimeout(other.timeoutNanos(), timeoutNanos()), TimeUnit.NANOSECONDS);
        if (!hasDeadline()) {
            if (other.hasDeadline()) {
                deadlineNanoTime(other.deadlineNanoTime());
            }
            try {
                return block.invoke();
            } finally {
                timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                if (other.hasDeadline()) {
                    clearDeadline();
                }
            }
        }
        long jDeadlineNanoTime = deadlineNanoTime();
        if (other.hasDeadline()) {
            deadlineNanoTime(Math.min(deadlineNanoTime(), other.deadlineNanoTime()));
        }
        try {
            return block.invoke();
        } finally {
            timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
            if (other.hasDeadline()) {
                deadlineNanoTime(jDeadlineNanoTime);
            }
        }
    }

    public void throwIfReached() throws IOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    @NotNull
    public F timeout(long j6, @NotNull TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j6 < 0) {
            throw new IllegalArgumentException(androidx.camera.video.u.i(j6, "timeout < 0: ").toString());
        }
        this.timeoutNanos = unit.toNanos(j6);
        return this;
    }

    public long timeoutNanos() {
        return this.timeoutNanos;
    }

    public final void waitUntilNotified(@NotNull Object monitor) throws InterruptedIOException {
        Intrinsics.checkNotNullParameter(monitor, "monitor");
        try {
            boolean zHasDeadline = hasDeadline();
            long jTimeoutNanos = timeoutNanos();
            long jNanoTime = 0;
            if (!zHasDeadline && jTimeoutNanos == 0) {
                monitor.wait();
                return;
            }
            long jNanoTime2 = System.nanoTime();
            if (zHasDeadline && jTimeoutNanos != 0) {
                jTimeoutNanos = Math.min(jTimeoutNanos, deadlineNanoTime() - jNanoTime2);
            } else if (zHasDeadline) {
                jTimeoutNanos = deadlineNanoTime() - jNanoTime2;
            }
            if (jTimeoutNanos > 0) {
                long j6 = jTimeoutNanos / 1000000;
                monitor.wait(j6, (int) (jTimeoutNanos - (1000000 * j6)));
                jNanoTime = System.nanoTime() - jNanoTime2;
            }
            if (jNanoTime >= jTimeoutNanos) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    @NotNull
    public F deadlineNanoTime(long j6) {
        this.hasDeadline = true;
        this.deadlineNanoTime = j6;
        return this;
    }
}

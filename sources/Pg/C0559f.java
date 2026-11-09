package Pg;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.PublishedApi;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okio.Sink;
import okio.Source;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Pg.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C0559f extends F {

    @NotNull
    public static final C0556c Companion = new C0556c(null);
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int TIMEOUT_WRITE_SIZE = 65536;

    @NotNull
    private static final Condition condition;

    @Nullable
    private static C0559f head;

    @NotNull
    private static final ReentrantLock lock;
    private boolean inQueue;

    @Nullable
    private C0559f next;
    private long timeoutAt;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        lock = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        Intrinsics.checkNotNullExpressionValue(conditionNewCondition, "newCondition(...)");
        condition = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        IDLE_TIMEOUT_MILLIS = millis;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public static final long access$remainingNanos(C0559f c0559f, long j6) {
        return c0559f.timeoutAt - j6;
    }

    @PublishedApi
    @NotNull
    public final IOException access$newTimeoutException(@Nullable IOException iOException) {
        return newTimeoutException(iOException);
    }

    public final void enter() {
        long jTimeoutNanos = timeoutNanos();
        boolean zHasDeadline = hasDeadline();
        if (jTimeoutNanos != 0 || zHasDeadline) {
            Companion.scheduleTimeout(this, jTimeoutNanos, zHasDeadline);
        }
    }

    public final boolean exit() {
        return Companion.cancelScheduledTimeout(this);
    }

    @NotNull
    public IOException newTimeoutException(@Nullable IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    @NotNull
    public final Sink sink(@NotNull Sink sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        return new C0557d(this, sink);
    }

    @NotNull
    public final Source source(@NotNull Source source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new C0558e(this, source);
    }

    public final <T> T withTimeout(@NotNull Function0<? extends T> block) throws IOException {
        Intrinsics.checkNotNullParameter(block, "block");
        enter();
        try {
            try {
                T tInvoke = block.invoke();
                if (exit()) {
                    throw access$newTimeoutException(null);
                }
                return tInvoke;
            } catch (IOException e10) {
                if (exit()) {
                    throw access$newTimeoutException(e10);
                }
                throw e10;
            }
        } catch (Throwable th) {
            exit();
            throw th;
        }
    }

    public void timedOut() {
    }
}

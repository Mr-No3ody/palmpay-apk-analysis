package Pg;

import Pa.P;
import com.didiglobal.booster.instrument.ShadowThread;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Pg.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0556c {
    public /* synthetic */ C0556c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean cancelScheduledTimeout(C0559f c0559f) {
        ReentrantLock lock = C0559f.Companion.getLock();
        lock.lock();
        try {
            if (!c0559f.inQueue) {
                return false;
            }
            c0559f.inQueue = false;
            for (C0559f c0559f2 = C0559f.head; c0559f2 != null; c0559f2 = c0559f2.next) {
                if (c0559f2.next == c0559f) {
                    c0559f2.next = c0559f.next;
                    c0559f.next = null;
                    return false;
                }
            }
            return true;
        } finally {
            lock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleTimeout(C0559f c0559f, long j6, boolean z3) {
        ReentrantLock lock = C0559f.Companion.getLock();
        lock.lock();
        try {
            if (c0559f.inQueue) {
                throw new IllegalStateException("Unbalanced enter/exit");
            }
            c0559f.inQueue = true;
            if (C0559f.head == null) {
                C0559f.head = new C0559f();
                P p3 = new P(ShadowThread.makeThreadName("Okio Watchdog", "\u200bokio.AsyncTimeout$Watchdog"));
                p3.setDaemon(true);
                ShadowThread.setThreadName(p3, "\u200bokio.AsyncTimeout$Companion").start();
            }
            long jNanoTime = System.nanoTime();
            if (j6 != 0 && z3) {
                c0559f.timeoutAt = Math.min(j6, c0559f.deadlineNanoTime() - jNanoTime) + jNanoTime;
            } else if (j6 != 0) {
                c0559f.timeoutAt = j6 + jNanoTime;
            } else {
                if (!z3) {
                    throw new AssertionError();
                }
                c0559f.timeoutAt = c0559f.deadlineNanoTime();
            }
            long jAccess$remainingNanos = C0559f.access$remainingNanos(c0559f, jNanoTime);
            C0559f c0559f2 = C0559f.head;
            Intrinsics.e(c0559f2);
            while (c0559f2.next != null) {
                C0559f c0559f3 = c0559f2.next;
                Intrinsics.e(c0559f3);
                if (jAccess$remainingNanos < C0559f.access$remainingNanos(c0559f3, jNanoTime)) {
                    break;
                }
                c0559f2 = c0559f2.next;
                Intrinsics.e(c0559f2);
            }
            c0559f.next = c0559f2.next;
            c0559f2.next = c0559f;
            if (c0559f2 == C0559f.head) {
                C0559f.Companion.getCondition().signal();
            }
            Unit unit = Unit.f38893a;
            lock.unlock();
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    @Nullable
    public final C0559f awaitTimeout$okio() throws InterruptedException {
        C0559f c0559f = C0559f.head;
        Intrinsics.e(c0559f);
        C0559f c0559f2 = c0559f.next;
        if (c0559f2 == null) {
            long jNanoTime = System.nanoTime();
            getCondition().await(C0559f.IDLE_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS);
            C0559f c0559f3 = C0559f.head;
            Intrinsics.e(c0559f3);
            if (c0559f3.next != null || System.nanoTime() - jNanoTime < C0559f.IDLE_TIMEOUT_NANOS) {
                return null;
            }
            return C0559f.head;
        }
        long jAccess$remainingNanos = C0559f.access$remainingNanos(c0559f2, System.nanoTime());
        if (jAccess$remainingNanos > 0) {
            getCondition().await(jAccess$remainingNanos, TimeUnit.NANOSECONDS);
            return null;
        }
        C0559f c0559f4 = C0559f.head;
        Intrinsics.e(c0559f4);
        c0559f4.next = c0559f2.next;
        c0559f2.next = null;
        return c0559f2;
    }

    @NotNull
    public final Condition getCondition() {
        return C0559f.condition;
    }

    @NotNull
    public final ReentrantLock getLock() {
        return C0559f.lock;
    }

    private C0556c() {
    }
}

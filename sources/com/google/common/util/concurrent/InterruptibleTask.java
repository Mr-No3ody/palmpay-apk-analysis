package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.j2objc.annotations.ReflectionSupport;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
@ReflectionSupport(ReflectionSupport.Level.FULL)
abstract class InterruptibleTask<T> extends AtomicReference<Runnable> implements Runnable {
    private static final Runnable DONE;
    private static final int MAX_BUSY_WAIT_SPINS = 1000;
    private static final Runnable PARKED;

    @VisibleForTesting
    public static final class Blocker extends AbstractOwnableSynchronizer implements Runnable {
        private final InterruptibleTask<?> task;

        /* JADX INFO: Access modifiers changed from: private */
        public void setOwner(Thread thread) {
            setExclusiveOwnerThread(thread);
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public String toString() {
            return this.task.toString();
        }

        private Blocker(InterruptibleTask<?> interruptibleTask) {
            this.task = interruptibleTask;
        }
    }

    public static final class DoNothingRunnable implements Runnable {
        private DoNothingRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    static {
        DONE = new DoNothingRunnable();
        PARKED = new DoNothingRunnable();
    }

    private void waitForInterrupt(Thread thread) {
        Runnable runnable = get();
        Blocker blocker = null;
        boolean z3 = false;
        int i7 = 0;
        while (true) {
            boolean z8 = runnable instanceof Blocker;
            if (!z8 && runnable != PARKED) {
                break;
            }
            if (z8) {
                blocker = (Blocker) runnable;
            }
            i7++;
            if (i7 > 1000) {
                Runnable runnable2 = PARKED;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z3 = Thread.interrupted() || z3;
                    LockSupport.park(blocker);
                }
            } else {
                Thread.yield();
            }
            runnable = get();
        }
        if (z3) {
            thread.interrupt();
        }
    }

    public abstract void afterRanInterruptiblyFailure(Throwable th);

    public abstract void afterRanInterruptiblySuccess(@ParametricNullness T t);

    public final void interruptTask() {
        Runnable runnable = get();
        if (runnable instanceof Thread) {
            Blocker blocker = new Blocker();
            blocker.setOwner(Thread.currentThread());
            if (compareAndSet(runnable, blocker)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (getAndSet(DONE) == PARKED) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    public abstract boolean isDone();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objRunInterruptibly = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zIsDone = isDone();
            if (!zIsDone) {
                try {
                    objRunInterruptibly = runInterruptibly();
                } catch (Throwable th) {
                    if (!compareAndSet(threadCurrentThread, DONE)) {
                        waitForInterrupt(threadCurrentThread);
                    }
                    if (zIsDone) {
                        return;
                    }
                    afterRanInterruptiblyFailure(th);
                    return;
                }
            }
            if (!compareAndSet(threadCurrentThread, DONE)) {
                waitForInterrupt(threadCurrentThread);
            }
            if (zIsDone) {
                return;
            }
            afterRanInterruptiblySuccess(NullnessCasts.uncheckedCastNullableTToT(objRunInterruptibly));
        }
    }

    @ParametricNullness
    public abstract T runInterruptibly() throws Exception;

    public abstract String toPendingString();

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String strI;
        Runnable runnable = get();
        if (runnable == DONE) {
            strI = "running=[DONE]";
        } else if (runnable instanceof Blocker) {
            strI = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            strI = com.airbnb.lottie.model.layer.d.i(com.airbnb.lottie.model.layer.d.c(21, name), "running=[RUNNING ON ", name, "]");
        } else {
            strI = "running=[NOT STARTED YET]";
        }
        String pendingString = toPendingString();
        return com.airbnb.lottie.model.layer.d.i(com.airbnb.lottie.model.layer.d.c(com.airbnb.lottie.model.layer.d.c(2, strI), pendingString), strI, ", ", pendingString);
    }
}

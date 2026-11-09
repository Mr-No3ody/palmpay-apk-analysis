package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Verify;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
public final class Uninterruptibles {
    private Uninterruptibles() {
    }

    @GwtIncompatible
    public static void awaitTerminationUninterruptibly(ExecutorService executorService) {
        Verify.verify(awaitTerminationUninterruptibly(executorService, Long.MAX_VALUE, TimeUnit.NANOSECONDS));
    }

    @GwtIncompatible
    public static void awaitUninterruptibly(CountDownLatch countDownLatch) {
        boolean z3 = false;
        while (true) {
            try {
                countDownLatch.await();
                break;
            } catch (InterruptedException unused) {
                z3 = true;
            } catch (Throwable th) {
                if (z3) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
    }

    @CanIgnoreReturnValue
    @ParametricNullness
    public static <V> V getUninterruptibly(Future<V> future) throws ExecutionException {
        V v3;
        boolean z3 = false;
        while (true) {
            try {
                v3 = future.get();
                break;
            } catch (InterruptedException unused) {
                z3 = true;
            } catch (Throwable th) {
                if (z3) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
        return v3;
    }

    @GwtIncompatible
    public static void joinUninterruptibly(Thread thread) {
        boolean z3 = false;
        while (true) {
            try {
                thread.join();
                break;
            } catch (InterruptedException unused) {
                z3 = true;
            } catch (Throwable th) {
                if (z3) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
    }

    @GwtIncompatible
    public static <E> void putUninterruptibly(BlockingQueue<E> blockingQueue, E e10) {
        boolean z3 = false;
        while (true) {
            try {
                blockingQueue.put(e10);
                break;
            } catch (InterruptedException unused) {
                z3 = true;
            } catch (Throwable th) {
                if (z3) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
    }

    @GwtIncompatible
    public static void sleepUninterruptibly(long j6, TimeUnit timeUnit) {
        boolean z3 = false;
        try {
            long nanos = timeUnit.toNanos(j6);
            long jNanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    TimeUnit.NANOSECONDS.sleep(nanos);
                    break;
                } catch (InterruptedException unused) {
                    z3 = true;
                    nanos = jNanoTime - System.nanoTime();
                }
            }
            if (z3) {
                Thread.currentThread().interrupt();
            }
        } catch (Throwable th) {
            if (z3) {
                Thread.currentThread().interrupt();
            }
            throw th;
        }
    }

    @GwtIncompatible
    public static <E> E takeUninterruptibly(BlockingQueue<E> blockingQueue) {
        E eTake;
        boolean z3 = false;
        while (true) {
            try {
                eTake = blockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z3 = true;
            } catch (Throwable th) {
                if (z3) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
        return eTake;
    }

    @GwtIncompatible
    public static boolean tryAcquireUninterruptibly(Semaphore semaphore, long j6, TimeUnit timeUnit) {
        return tryAcquireUninterruptibly(semaphore, 1, j6, timeUnit);
    }

    @GwtIncompatible
    public static boolean tryLockUninterruptibly(Lock lock, long j6, TimeUnit timeUnit) {
        boolean zTryLock;
        boolean z3 = false;
        try {
            long nanos = timeUnit.toNanos(j6);
            long jNanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    zTryLock = lock.tryLock(nanos, TimeUnit.NANOSECONDS);
                    break;
                } catch (InterruptedException unused) {
                    z3 = true;
                    nanos = jNanoTime - System.nanoTime();
                }
            }
            if (z3) {
                Thread.currentThread().interrupt();
            }
            return zTryLock;
        } catch (Throwable th) {
            if (z3) {
                Thread.currentThread().interrupt();
            }
            throw th;
        }
    }

    @GwtIncompatible
    public static boolean awaitTerminationUninterruptibly(ExecutorService executorService, long j6, TimeUnit timeUnit) {
        boolean zAwaitTermination;
        boolean z3 = false;
        try {
            long nanos = timeUnit.toNanos(j6);
            long jNanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    zAwaitTermination = executorService.awaitTermination(nanos, TimeUnit.NANOSECONDS);
                    break;
                } catch (InterruptedException unused) {
                    z3 = true;
                    nanos = jNanoTime - System.nanoTime();
                }
            }
            if (z3) {
                Thread.currentThread().interrupt();
            }
            return zAwaitTermination;
        } catch (Throwable th) {
            if (z3) {
                Thread.currentThread().interrupt();
            }
            throw th;
        }
    }

    @GwtIncompatible
    public static boolean tryAcquireUninterruptibly(Semaphore semaphore, int i7, long j6, TimeUnit timeUnit) {
        boolean zTryAcquire;
        boolean z3 = false;
        try {
            long nanos = timeUnit.toNanos(j6);
            long jNanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    zTryAcquire = semaphore.tryAcquire(i7, nanos, TimeUnit.NANOSECONDS);
                    break;
                } catch (InterruptedException unused) {
                    z3 = true;
                    nanos = jNanoTime - System.nanoTime();
                }
            }
            if (z3) {
                Thread.currentThread().interrupt();
            }
            return zTryAcquire;
        } catch (Throwable th) {
            if (z3) {
                Thread.currentThread().interrupt();
            }
            throw th;
        }
    }

    @CanIgnoreReturnValue
    @GwtIncompatible
    public static boolean awaitUninterruptibly(CountDownLatch countDownLatch, long j6, TimeUnit timeUnit) {
        boolean zAwait;
        boolean z3 = false;
        try {
            long nanos = timeUnit.toNanos(j6);
            long jNanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    zAwait = countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                    break;
                } catch (InterruptedException unused) {
                    z3 = true;
                    nanos = jNanoTime - System.nanoTime();
                }
            }
            if (z3) {
                Thread.currentThread().interrupt();
            }
            return zAwait;
        } catch (Throwable th) {
            if (z3) {
                Thread.currentThread().interrupt();
            }
            throw th;
        }
    }

    @GwtIncompatible
    @CanIgnoreReturnValue
    @ParametricNullness
    public static <V> V getUninterruptibly(Future<V> future, long j6, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        V v3;
        boolean z3 = false;
        try {
            long nanos = timeUnit.toNanos(j6);
            long jNanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    v3 = future.get(nanos, TimeUnit.NANOSECONDS);
                    break;
                } catch (InterruptedException unused) {
                    z3 = true;
                    nanos = jNanoTime - System.nanoTime();
                }
            }
            if (z3) {
                Thread.currentThread().interrupt();
            }
            return v3;
        } catch (Throwable th) {
            if (z3) {
                Thread.currentThread().interrupt();
            }
            throw th;
        }
    }

    @GwtIncompatible
    public static void joinUninterruptibly(Thread thread, long j6, TimeUnit timeUnit) {
        Preconditions.checkNotNull(thread);
        boolean z3 = false;
        try {
            long nanos = timeUnit.toNanos(j6);
            long jNanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    TimeUnit.NANOSECONDS.timedJoin(thread, nanos);
                    break;
                } catch (InterruptedException unused) {
                    z3 = true;
                    nanos = jNanoTime - System.nanoTime();
                }
            }
            if (z3) {
                Thread.currentThread().interrupt();
            }
        } catch (Throwable th) {
            if (z3) {
                Thread.currentThread().interrupt();
            }
            throw th;
        }
    }

    @GwtIncompatible
    public static boolean awaitUninterruptibly(Condition condition, long j6, TimeUnit timeUnit) {
        boolean zAwait;
        boolean z3 = false;
        try {
            long nanos = timeUnit.toNanos(j6);
            long jNanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    zAwait = condition.await(nanos, TimeUnit.NANOSECONDS);
                    break;
                } catch (InterruptedException unused) {
                    z3 = true;
                    nanos = jNanoTime - System.nanoTime();
                }
            }
            if (z3) {
                Thread.currentThread().interrupt();
            }
            return zAwait;
        } catch (Throwable th) {
            if (z3) {
                Thread.currentThread().interrupt();
            }
            throw th;
        }
    }
}

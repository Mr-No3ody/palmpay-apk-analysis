package Wf;

import com.didiglobal.booster.instrument.ShadowThread;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.DisposableHandle;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Wf.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC0781z extends Q implements Runnable {

    @Nullable
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final RunnableC0781z f10920o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final long f10921p;

    static {
        Long l5;
        RunnableC0781z runnableC0781z = new RunnableC0781z();
        f10920o = runnableC0781z;
        runnableC0781z.h(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l5 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l5 = 1000L;
        }
        f10921p = timeUnit.toNanos(l5.longValue());
    }

    @Override // Wf.S
    public final Thread g() {
        Thread shadowThread;
        Thread thread = _thread;
        if (thread != null) {
            return thread;
        }
        synchronized (this) {
            shadowThread = _thread;
            if (shadowThread == null) {
                shadowThread = new ShadowThread(this, "kotlinx.coroutines.DefaultExecutor", "\u200bkotlinx.coroutines.DefaultExecutor");
                _thread = shadowThread;
                shadowThread.setContextClassLoader(f10920o.getClass().getClassLoader());
                shadowThread.setDaemon(true);
                ShadowThread.setThreadName(shadowThread, "\u200bkotlinx.coroutines.DefaultExecutor").start();
            }
        }
        return shadowThread;
    }

    @Override // Wf.Q, kotlinx.coroutines.Delay
    public final DisposableHandle invokeOnTimeout(long j6, Runnable runnable, CoroutineContext coroutineContext) {
        long j10 = 0;
        if (j6 > 0) {
            j10 = j6 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j6;
        }
        if (j10 >= 4611686018427387903L) {
            return s0.f10897a;
        }
        long jNanoTime = System.nanoTime();
        N n10 = new N(j10 + jNanoTime, runnable);
        p(jNanoTime, n10);
        return n10;
    }

    @Override // Wf.S
    public final void k(long j6, O o10) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // Wf.Q
    public final void l(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.l(runnable);
    }

    public final synchronized void q() {
        int i7 = debugStatus;
        if (i7 == 2 || i7 == 3) {
            debugStatus = 3;
            Q.f10820g.set(this, null);
            Q.f10821i.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        w0.f10905a.set(this);
        try {
            synchronized (this) {
                int i7 = debugStatus;
                if (i7 == 2 || i7 == 3) {
                    _thread = null;
                    q();
                    if (o()) {
                        return;
                    }
                    g();
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j6 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jI = i();
                    if (jI == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j6 == Long.MAX_VALUE) {
                            j6 = f10921p + jNanoTime;
                        }
                        long j10 = j6 - jNanoTime;
                        if (j10 <= 0) {
                            _thread = null;
                            q();
                            if (o()) {
                                return;
                            }
                            g();
                            return;
                        }
                        if (jI > j10) {
                            jI = j10;
                        }
                    } else {
                        j6 = Long.MAX_VALUE;
                    }
                    if (jI > 0) {
                        int i10 = debugStatus;
                        if (i10 == 2 || i10 == 3) {
                            _thread = null;
                            q();
                            if (o()) {
                                return;
                            }
                            g();
                            return;
                        }
                        LockSupport.parkNanos(this, jI);
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            q();
            if (!o()) {
                g();
            }
            throw th;
        }
    }

    @Override // Wf.Q, Wf.S
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // Wf.AbstractC0774s
    public final String toString() {
        return "DefaultExecutor";
    }
}
